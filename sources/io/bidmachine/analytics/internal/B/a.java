package io.bidmachine.analytics.internal.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.k;
import rd.c0;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0271a f16782b = new C0271a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f16783a;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.B.a$a, reason: collision with other inner class name */
    public static final class C0271a {
        public /* synthetic */ C0271a(k kVar) {
            this();
        }

        private C0271a() {
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f16783a = sQLiteDatabase;
    }

    private final Object c(String str) {
        try {
            r.a aVar = r.f27774b;
            Cursor cursorRawQuery = this.f16783a.rawQuery(str, new String[0]);
            try {
                a(cursorRawQuery);
                int i10 = cursorRawQuery.getInt(0);
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalArgumentException(("Column 't' must be 0 or 1, but was " + i10).toString());
                }
                Object objC = r.c(Integer.valueOf(i10));
                fd.b.a(cursorRawQuery, null);
                return objC;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fd.b.a(cursorRawQuery, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th3));
        }
    }

    public final Object a(io.bidmachine.analytics.internal.C.a aVar) {
        Object objC;
        try {
            r.a aVar2 = r.f27774b;
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", aVar.b());
            contentValues.put("sid", aVar.f());
            contentValues.put("itm", aVar.c());
            contentValues.put(AuthenticationTokenClaims.JSON_KEY_IAT, Integer.valueOf(aVar.a()));
            contentValues.put("irv", Long.valueOf(aVar.d()));
            contentValues.put("itp", Integer.valueOf(aVar.e()));
            this.f16783a.insert("irec", null, contentValues);
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar3 = r.f27774b;
            objC = r.c(s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null && (thG instanceof SQLiteFullException)) {
            try {
                this.f16783a.execSQL("DELETE FROM irec\nWHERE rowid NOT IN (\n    SELECT rowid FROM irec\n    ORDER BY itm DESC, rowid DESC\n    LIMIT 100\n)");
                r.c(g0.f27756a);
            } catch (Throwable th2) {
                r.a aVar4 = r.f27774b;
                r.c(s.a(th2));
            }
        }
        return objC;
    }

    public final Object b(String str) {
        try {
            r.a aVar = r.f27774b;
            Object objC = c(str);
            if (r.k(objC)) {
                Throwable thG = r.g(objC);
                if (thG == null) {
                    thG = new Exception("Error while execute " + str);
                }
                return r.c(s.a(thG));
            }
            if (r.k(objC)) {
                objC = null;
            }
            Integer num = (Integer) objC;
            if (num == null) {
                return r.c(s.a(new Exception("Empty result for " + str)));
            }
            int iIntValue = num.intValue();
            boolean z10 = true;
            if (iIntValue != 1) {
                z10 = false;
            }
            return r.c(Boolean.valueOf(z10));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(String str) {
        try {
            r.a aVar = r.f27774b;
            this.f16783a.delete("irec", "itm < ?", new String[]{str});
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private final void a(Cursor cursor) {
        if (cursor.getColumnCount() == 1) {
            if (c0.B(cursor.getColumnName(0), "t", false)) {
                if (cursor.moveToFirst()) {
                    if (!cursor.isLast()) {
                        throw new IllegalArgumentException("Query must return exactly one row, but returned more");
                    }
                    return;
                }
                throw new IllegalArgumentException("Query returned no rows");
            }
            throw new IllegalArgumentException(("Single column must be named 't', got '" + cursor.getColumnName(0) + '\'').toString());
        }
        throw new IllegalArgumentException(("Query must return exactly one column, got " + cursor.getColumnCount()).toString());
    }
}

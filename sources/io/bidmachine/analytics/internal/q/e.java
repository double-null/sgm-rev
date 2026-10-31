package io.bidmachine.analytics.internal.q;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;
import rd.c0;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17343c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SimpleDateFormat f17344d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f17345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17346b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final e a(String str) {
            SQLiteDatabase sQLiteDatabaseCreate = SQLiteDatabase.create(null);
            sQLiteDatabaseCreate.execSQL("PRAGMA foreign_keys=ON");
            sQLiteDatabaseCreate.execSQL("CREATE TABLE prec (\n  id INTEGER PRIMARY KEY AUTOINCREMENT,\n  pt TEXT NOT NULL CHECK (pt IN ('C','NC','ARS','NRS')),\n  pd TEXT NOT NULL CHECK (julianday(pd) IS NOT NULL),\n  ac INTEGER NOT NULL CHECK (ac IN (0,1))\n)");
            return new e(sQLiteDatabaseCreate, str, null);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.bidmachine.analytics.internal.r.a.EnumC0305a.values().length];
            try {
                iArr[io.bidmachine.analytics.internal.r.a.EnumC0305a.INAPP_CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[io.bidmachine.analytics.internal.r.a.EnumC0305a.INAPP_NON_CONSUMABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[io.bidmachine.analytics.internal.r.a.EnumC0305a.SUBS_AUTO_RENEWABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[io.bidmachine.analytics.internal.r.a.EnumC0305a.SUBS_NON_AUTO_RENEWABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f17344d = simpleDateFormat;
    }

    public /* synthetic */ e(SQLiteDatabase sQLiteDatabase, String str, k kVar) {
        this(sQLiteDatabase, str);
    }

    private final Object b(String str) {
        try {
            r.a aVar = r.f27774b;
            Object objA = a(str);
            if (r.k(objA)) {
                Throwable thG = r.g(objA);
                if (thG == null) {
                    thG = new Exception("Error while execute " + str);
                }
                return r.c(s.a(thG));
            }
            if (r.k(objA)) {
                objA = null;
            }
            Integer num = (Integer) objA;
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

    public final Object a() {
        try {
            r.a aVar = r.f27774b;
            return r.c(Integer.valueOf(this.f17345a.delete("prec", null, null)));
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object c() {
        try {
            r.a aVar = r.f27774b;
            return b(this.f17346b);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private e(SQLiteDatabase sQLiteDatabase, String str) {
        this.f17345a = sQLiteDatabase;
        this.f17346b = str;
    }

    public final Object a(Iterable iterable) {
        try {
            r.a aVar = r.f27774b;
            this.f17345a.beginTransaction();
            SQLiteStatement sQLiteStatementCompileStatement = this.f17345a.compileStatement("INSERT INTO prec (pt, pd, ac) VALUES (?, ?, ?)");
            try {
                try {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        io.bidmachine.analytics.internal.r.a aVar2 = (io.bidmachine.analytics.internal.r.a) it.next();
                        sQLiteStatementCompileStatement.clearBindings();
                        sQLiteStatementCompileStatement.bindString(1, a(aVar2.b()));
                        sQLiteStatementCompileStatement.bindString(2, f17344d.format(aVar2.a()));
                        sQLiteStatementCompileStatement.bindLong(3, aVar2.c() ? 1L : 0L);
                        sQLiteStatementCompileStatement.executeInsert();
                    }
                    this.f17345a.setTransactionSuccessful();
                    this.f17345a.endTransaction();
                    g0 g0Var = g0.f27756a;
                    fd.b.a(sQLiteStatementCompileStatement, null);
                    return r.c(g0Var);
                } catch (Throwable th) {
                    this.f17345a.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    fd.b.a(sQLiteStatementCompileStatement, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            r.a aVar3 = r.f27774b;
            return r.c(s.a(th4));
        }
    }

    public final Object b() {
        try {
            r.a aVar = r.f27774b;
            this.f17345a.close();
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private final Object a(String str) {
        try {
            r.a aVar = r.f27774b;
            Cursor cursorRawQuery = this.f17345a.rawQuery(str, new String[0]);
            try {
                a(cursorRawQuery);
                int i10 = cursorRawQuery.getInt(0);
                if (i10 != 0 && i10 != 1) {
                    throw new IllegalArgumentException(("Column 'p' must be 0 or 1, but was " + i10).toString());
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

    private final void a(Cursor cursor) {
        if (cursor.getColumnCount() == 1) {
            if (c0.B(cursor.getColumnName(0), "p", false)) {
                if (cursor.moveToFirst()) {
                    if (!cursor.isLast()) {
                        throw new IllegalArgumentException("Query must return exactly one row, but returned more");
                    }
                    return;
                }
                throw new IllegalArgumentException("Query returned no rows");
            }
            throw new IllegalArgumentException(("Single column must be named 'p', got '" + cursor.getColumnName(0) + '\'').toString());
        }
        throw new IllegalArgumentException(("Query must return exactly one column, got " + cursor.getColumnCount()).toString());
    }

    private final String a(io.bidmachine.analytics.internal.r.a.EnumC0305a enumC0305a) {
        int i10 = b.$EnumSwitchMapping$0[enumC0305a.ordinal()];
        if (i10 == 1) {
            return "C";
        }
        if (i10 == 2) {
            return "NC";
        }
        if (i10 == 3) {
            return "ARS";
        }
        if (i10 == 4) {
            return "NRS";
        }
        throw new NoWhenBranchMatchedException();
    }
}

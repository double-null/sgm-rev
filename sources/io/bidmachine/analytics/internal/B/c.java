package io.bidmachine.analytics.internal.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import id.l;
import io.bidmachine.analytics.internal.C.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import wc.g0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16789b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f16790a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends u implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentValues f16792b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ContentValues contentValues) {
            super(1);
            this.f16792b = contentValues;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = c.this.f16790a;
            ContentValues contentValues = this.f16792b;
            String[] strArrA = null;
            String strA = list != null ? io.bidmachine.analytics.internal.E.a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).c());
                }
                strArrA = io.bidmachine.analytics.internal.E.a.a(arrayList);
            }
            sQLiteDatabase.update("reader_record", contentValues, strA, strArrA);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return g0.f27756a;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.B.c$c, reason: collision with other inner class name */
    static final class C0273c extends u implements l {
        C0273c() {
            super(1);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return g0.f27756a;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = c.this.f16790a;
            String[] strArrA = null;
            String strA = list != null ? io.bidmachine.analytics.internal.E.a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).c());
                }
                strArrA = io.bidmachine.analytics.internal.E.a.a(arrayList);
            }
            sQLiteDatabase.delete(UomBEukHFwrS.CclAxcccB, strA, strArrA);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f16790a = sQLiteDatabase;
    }

    private final String a() {
        return "(LENGTH(error) = 0 OR error IS NULL)";
    }

    public final Object b() {
        return a(false, (List) null);
    }

    public final Object c(e eVar) {
        try {
            r.a aVar = r.f27774b;
            this.f16790a.update("reader_record", b(eVar), "id = ?", new String[]{eVar.c()});
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object d(List list) {
        return a(false, list);
    }

    public final Object e(List list) {
        return a(true, list);
    }

    public final Object b(List list) {
        try {
            r.a aVar = r.f27774b;
            this.f16790a.delete("reader_record", io.bidmachine.analytics.internal.E.a.a(list, "name NOT IN"), io.bidmachine.analytics.internal.E.a.a(list));
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(e eVar) {
        try {
            r.a aVar = r.f27774b;
            this.f16790a.insert("reader_record", null, b(eVar));
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(String str, String str2) {
        Object objA = a(this, "name = ? AND rule = ? AND " + a(), new String[]{str, io.bidmachine.analytics.internal.E.e.c(str2)}, null, 4, null);
        if (r.k(objA)) {
            Throwable thG = r.g(objA);
            if (thG == null) {
                thG = new Exception();
            }
            return r.c(s.a(thG));
        }
        if (r.k(objA)) {
            objA = null;
        }
        List list = (List) objA;
        return r.c(list != null ? (e) b0.P(list) : null);
    }

    public final Object c(List list) {
        try {
            r.a aVar = r.f27774b;
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.E.e.c((String) it.next()));
            }
            this.f16790a.delete("reader_record", io.bidmachine.analytics.internal.E.a.a(arrayList, "rule NOT IN"), io.bidmachine.analytics.internal.E.a.a(arrayList));
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    private final ContentValues b(e eVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", eVar.c());
        contentValues.put("name", eVar.d());
        contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(eVar.f()));
        contentValues.put("data_hash", eVar.a());
        contentValues.put("rule", io.bidmachine.analytics.internal.E.e.c(eVar.e()));
        contentValues.put("error", io.bidmachine.analytics.internal.E.e.b(eVar.b(), eVar.c()));
        contentValues.put("is_dirty", Boolean.valueOf(eVar.g()));
        return contentValues;
    }

    public final Object a(String str) {
        return a(this, "name = ? AND is_reserved = 0 AND is_dirty = 1", new String[]{str}, null, 4, null);
    }

    static /* synthetic */ Object a(c cVar, String str, String[] strArr, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return cVar.a(str, strArr, str2);
    }

    private final Object a(String str, String[] strArr, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            r.a aVar = r.f27774b;
            try {
                Cursor cursorQuery = this.f16790a.query("reader_record", new String[]{"id", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "data_hash", "rule", "error", "is_dirty"}, str, strArr, null, null, "timestamp DESC", str2);
                while (cursorQuery.moveToNext()) {
                    try {
                        try {
                            r.a aVar2 = r.f27774b;
                            String string = cursorQuery.getString(0);
                            r.c(Boolean.valueOf(arrayList.add(new e(string, cursorQuery.getString(1), cursorQuery.getLong(2), cursorQuery.getString(3), io.bidmachine.analytics.internal.E.e.a(cursorQuery.getString(4)), io.bidmachine.analytics.internal.E.e.a(cursorQuery.getBlob(5), string), cursorQuery.getInt(6) == 1))));
                        } catch (Throwable th) {
                            r.a aVar3 = r.f27774b;
                            r.c(s.a(th));
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            fd.b.a(cursorQuery, th2);
                            throw th3;
                        }
                    }
                }
                g0 g0Var = g0.f27756a;
                fd.b.a(cursorQuery, null);
                r.c(g0Var);
            } catch (Throwable th4) {
                th = th4;
                r.a aVar4 = r.f27774b;
                r.c(s.a(th));
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return r.c(arrayList);
    }

    private final Object a(boolean z10, List list) {
        try {
            r.a aVar = r.f27774b;
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_reserved", Boolean.valueOf(z10));
            io.bidmachine.analytics.internal.E.a.a(list, this.f16790a, 0, new b(contentValues), 2, null);
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(List list) {
        try {
            r.a aVar = r.f27774b;
            io.bidmachine.analytics.internal.E.a.a(list, this.f16790a, 0, new C0273c(), 2, null);
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(String str, List list) {
        try {
            r.a aVar = r.f27774b;
            ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(io.bidmachine.analytics.internal.E.e.c((String) it.next()));
            }
            this.f16790a.delete("reader_record", "name = ? AND " + a() + " AND " + io.bidmachine.analytics.internal.E.a.a(arrayList, "rule IN"), io.bidmachine.analytics.internal.E.a.a(b0.c0(kotlin.collections.s.e(str), arrayList)));
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }
}

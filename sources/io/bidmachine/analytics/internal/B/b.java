package io.bidmachine.analytics.internal.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import id.l;
import io.bidmachine.analytics.internal.E.e;
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
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16784b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f16785a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.B.b$b, reason: collision with other inner class name */
    static final class C0272b extends u implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ContentValues f16787b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0272b(ContentValues contentValues) {
            super(1);
            this.f16787b = contentValues;
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = b.this.f16785a;
            ContentValues contentValues = this.f16787b;
            String[] strArrA = null;
            String strA = list != null ? io.bidmachine.analytics.internal.E.a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((io.bidmachine.analytics.internal.C.c) it.next()).c());
                }
                strArrA = io.bidmachine.analytics.internal.E.a.a(arrayList);
            }
            sQLiteDatabase.update("monitor_record", contentValues, strA, strArrA);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return g0.f27756a;
        }
    }

    static final class c extends u implements l {
        c() {
            super(1);
        }

        public final void a(List list) {
            SQLiteDatabase sQLiteDatabase = b.this.f16785a;
            String[] strArrA = null;
            String strA = list != null ? io.bidmachine.analytics.internal.E.a.a(list, "id IN") : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((io.bidmachine.analytics.internal.C.c) it.next()).c());
                }
                strArrA = io.bidmachine.analytics.internal.E.a.a(arrayList);
            }
            sQLiteDatabase.delete("monitor_record", strA, strArrA);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return g0.f27756a;
        }
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f16785a = sQLiteDatabase;
    }

    public final Object b(List list) {
        return a(false, list);
    }

    public final Object c(List list) {
        return a(true, list);
    }

    public final Object a(io.bidmachine.analytics.internal.C.c cVar) {
        try {
            r.a aVar = r.f27774b;
            ContentValues contentValues = new ContentValues();
            contentValues.put(edUJlCZxhVnO.eOwunroNo, cVar.c());
            contentValues.put("name", cVar.d());
            contentValues.put(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, Long.valueOf(cVar.f()));
            contentValues.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, cVar.e());
            contentValues.put("data", e.b(cVar.a(), cVar.c()));
            contentValues.put("error", e.b(cVar.b(), cVar.c()));
            this.f16785a.insert("monitor_record", null, contentValues);
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(String str, String str2) {
        return a(str, str2, (Integer) null);
    }

    public final Object a(String str, String str2, Integer num) {
        return a("name = ? AND session_id = ? AND is_reserved = 0", new String[]{str, str2}, num != null ? num.toString() : null);
    }

    private final Object a(String str, String[] strArr, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            r.a aVar = r.f27774b;
            try {
                Cursor cursorQuery = this.f16785a.query("monitor_record", new String[]{"id", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, SDKAnalyticsEvents.PARAMETER_SESSION_ID, "data", "error"}, str, strArr, null, null, "timestamp DESC", str2);
                while (cursorQuery.moveToNext()) {
                    try {
                        try {
                            r.a aVar2 = r.f27774b;
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            long j10 = cursorQuery.getLong(2);
                            r.c(Boolean.valueOf(arrayList.add(new io.bidmachine.analytics.internal.C.c(string, string2, cursorQuery.getString(3), j10, e.a(cursorQuery.getBlob(4), string), e.a(cursorQuery.getBlob(5), string)))));
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

    public final Object a() {
        return a(false, (List) null);
    }

    private final Object a(boolean z10, List list) {
        try {
            r.a aVar = r.f27774b;
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_reserved", Boolean.valueOf(z10));
            io.bidmachine.analytics.internal.E.a.a(list, this.f16785a, 0, new C0272b(contentValues), 2, null);
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(List list) {
        try {
            r.a aVar = r.f27774b;
            io.bidmachine.analytics.internal.E.a.a(list, this.f16785a, 0, new c(), 2, null);
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }

    public final Object a(String str, List list) {
        try {
            r.a aVar = r.f27774b;
            this.f16785a.delete("monitor_record", "session_id != ? OR " + io.bidmachine.analytics.internal.E.a.a(list, "name NOT IN"), io.bidmachine.analytics.internal.E.a.a(b0.c0(kotlin.collections.s.e(str), list)));
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }
}

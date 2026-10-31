package l2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: SQLiteEventStore.java */
/* JADX INFO: loaded from: classes3.dex */
public class m0 implements l2.d, m2.a, l2.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b2.b f21687f = b2.b.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f21688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n2.a f21689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n2.a f21690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f21691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vc.a<String> f21692e;

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f21693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f21694b;

        private c(String str, String str2) {
            this.f21693a = str;
            this.f21694b = str2;
        }
    }

    /* JADX INFO: compiled from: SQLiteEventStore.java */
    interface d<T> {
        T a();
    }

    m0(n2.a aVar, n2.a aVar2, e eVar, v0 v0Var, vc.a<String> aVar3) {
        this.f21688a = v0Var;
        this.f21689b = aVar;
        this.f21690c = aVar2;
        this.f21691d = eVar;
        this.f21692e = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object A0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase B0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long C0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g2.f D0(long j10, Cursor cursor) {
        cursor.moveToNext();
        return g2.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g2.f E0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (g2.f) e1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: l2.d0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.D0(j10, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long F0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean G0(d2.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lT0 = t0(sQLiteDatabase, pVar);
        return lT0 == null ? Boolean.FALSE : (Boolean) e1(o0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lT0.toString()}), new b() { // from class: l2.z
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List H0(SQLiteDatabase sQLiteDatabase) {
        return (List) e1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: l2.k0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.I0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List I0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(d2.p.a().b(cursor.getString(1)).d(o2.a.b(cursor.getInt(2))).c(Y0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List J0(d2.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listW0 = W0(sQLiteDatabase, pVar, this.f21691d.d());
        for (b2.e eVar : b2.e.values()) {
            if (eVar != pVar.d()) {
                int iD = this.f21691d.d() - listW0.size();
                if (iD <= 0) {
                    break;
                }
                listW0.addAll(W0(sQLiteDatabase, pVar.f(eVar), iD));
            }
        }
        return w0(listW0, X0(sQLiteDatabase, listW0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2.a K0(Map map, g2.a.C0228a c0228a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            g2.c.b bVarJ0 = j0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(g2.c.c().c(bVarJ0).b(j10).a());
        }
        Z0(c0228a, map);
        return c0228a.e(s0()).d(p0()).c(this.f21692e.get()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g2.a L0(String str, final Map map, final g2.a.C0228a c0228a, SQLiteDatabase sQLiteDatabase) {
        return (g2.a) e1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: l2.b0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21666a.K0(map, c0228a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object M0(List list, d2.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            d2.i.a aVarO = d2.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new d2.h(c1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new d2.h(c1(cursor.getString(4)), a1(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(k.a(j10, pVar, aVarO.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object N0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long O0(d2.i iVar, d2.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (v0()) {
            c(1L, g2.c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jM0 = m0(sQLiteDatabase, pVar);
        int iE = this.f21691d.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, Long.valueOf(jM0));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] P0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object Q0(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), g2.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object R0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        e1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: l2.x
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21730a.Q0((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean S0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object T0(String str, g2.c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) e1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: l2.v
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.S0((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object U0(long j10, d2.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(o2.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(o2.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object V0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f21689b.getTime()).execute();
        return null;
    }

    private List<k> W0(SQLiteDatabase sQLiteDatabase, final d2.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lT0 = t0(sQLiteDatabase, pVar);
        if (lT0 == null) {
            return arrayList;
        }
        e1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lT0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: l2.y
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21731a.M0(arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> X0(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        e1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: l2.t
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.N0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] Y0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void Z0(g2.a.C0228a c0228a, Map<String, List<g2.c>> map) {
        for (Map.Entry<String, List<g2.c>> entry : map.entrySet()) {
            c0228a.a(g2.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] a1(long j10) {
        return (byte[]) e1(o0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: l2.a0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.P0((Cursor) obj);
            }
        });
    }

    private <T> T b1(d<T> dVar, b<Throwable, T> bVar) {
        long time = this.f21690c.getTime();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f21690c.getTime() >= ((long) this.f21691d.b()) + time) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static b2.b c1(String str) {
        return str == null ? f21687f : b2.b.b(str);
    }

    private static String d1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static <T> T e1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private g2.c.b j0(int i10) {
        g2.c.b bVar = g2.c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        g2.c.b bVar2 = g2.c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        g2.c.b bVar3 = g2.c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        g2.c.b bVar4 = g2.c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        g2.c.b bVar5 = g2.c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        g2.c.b bVar6 = g2.c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        g2.c.b bVar7 = g2.c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        h2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void k0(final SQLiteDatabase sQLiteDatabase) {
        b1(new d() { // from class: l2.g0
            @Override // l2.m0.d
            public final Object a() {
                return m0.z0(sQLiteDatabase);
            }
        }, new b() { // from class: l2.h0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.A0((Throwable) obj);
            }
        });
    }

    private long m0(SQLiteDatabase sQLiteDatabase, d2.p pVar) {
        Long lT0 = t0(sQLiteDatabase, pVar);
        if (lT0 != null) {
            return lT0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(o2.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private g2.b p0() {
        return g2.b.b().b(g2.e.c().b(n0()).c(e.f21671a.f()).a()).a();
    }

    private long q0() {
        return o0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long r0() {
        return o0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private g2.f s0() {
        final long time = this.f21689b.getTime();
        return (g2.f) u0(new b() { // from class: l2.c0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.E0(time, (SQLiteDatabase) obj);
            }
        });
    }

    private boolean v0() {
        return q0() * r0() >= this.f21691d.f();
    }

    private List<k> w0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                d2.i.a aVarP = next.b().p();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarP.c(cVar.f21693a, cVar.f21694b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarP.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object x0(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), g2.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer y0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        e1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: l2.r
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21708a.x0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object z0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    @Override // l2.d
    public Iterable<k> E(final d2.p pVar) {
        return (Iterable) u0(new b() { // from class: l2.p
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21703a.J0(pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // l2.d
    public boolean M(final d2.p pVar) {
        return ((Boolean) u0(new b() { // from class: l2.l0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21682a.G0(pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // l2.d
    public void O(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            u0(new b() { // from class: l2.q
                @Override // l2.m0.b
                public final Object apply(Object obj) {
                    return this.f21705a.R0(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // l2.d
    public long Q(d2.p pVar) {
        return ((Long) e1(o0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(o2.a.a(pVar.d()))}), new b() { // from class: l2.f0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.C0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // l2.d
    public void W(final d2.p pVar, final long j10) {
        u0(new b() { // from class: l2.n
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.U0(j10, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // l2.c
    public void b() {
        u0(new b() { // from class: l2.o
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21702a.V0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // l2.c
    public void c(final long j10, final g2.c.b bVar, final String str) {
        u0(new b() { // from class: l2.m
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.T0(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21688a.close();
    }

    @Override // l2.d
    public int d() {
        final long time = this.f21689b.getTime() - this.f21691d.c();
        return ((Integer) u0(new b() { // from class: l2.j0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21680a.y0(time, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // l2.d
    public k d0(final d2.p pVar, final d2.i iVar) {
        h2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) u0(new b() { // from class: l2.i0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21676a.O0(iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, pVar, iVar);
    }

    @Override // m2.a
    public <T> T e(m2.a.InterfaceC0362a<T> interfaceC0362a) {
        SQLiteDatabase sQLiteDatabaseO0 = o0();
        k0(sQLiteDatabaseO0);
        try {
            T tExecute = interfaceC0362a.execute();
            sQLiteDatabaseO0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseO0.endTransaction();
        }
    }

    @Override // l2.c
    public g2.a f() {
        final g2.a.C0228a c0228aE = g2.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (g2.a) u0(new b() { // from class: l2.u
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return this.f21710a.L0(str, map, c0228aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // l2.d
    public void g(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            o0().compileStatement("DELETE FROM events WHERE _id in " + d1(iterable)).execute();
        }
    }

    long n0() {
        return q0() * r0();
    }

    SQLiteDatabase o0() {
        final v0 v0Var = this.f21688a;
        Objects.requireNonNull(v0Var);
        return (SQLiteDatabase) b1(new d() { // from class: l2.w
            @Override // l2.m0.d
            public final Object a() {
                return v0Var.getWritableDatabase();
            }
        }, new b() { // from class: l2.e0
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.B0((Throwable) obj);
            }
        });
    }

    @Override // l2.d
    public Iterable<d2.p> r() {
        return (Iterable) u0(new b() { // from class: l2.l
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.H0((SQLiteDatabase) obj);
            }
        });
    }

    <T> T u0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseO0 = o0();
        sQLiteDatabaseO0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseO0);
            sQLiteDatabaseO0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseO0.endTransaction();
        }
    }

    private Long t0(SQLiteDatabase sQLiteDatabase, d2.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(o2.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) e1(sQLiteDatabase.query("transport_contexts", new String[]{ykDFMuXDQMaR.BsylGtokGND}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: l2.s
            @Override // l2.m0.b
            public final Object apply(Object obj) {
                return m0.F0((Cursor) obj);
            }
        });
    }
}

package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: compiled from: InvalidationTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f3467m = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String[] f3469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Set<String>> f3470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h f3471d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile x0.f f3474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f3475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.room.d f3476i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f3478k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicBoolean f3472e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f3473f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final n.b<c, d> f3477j = new n.b<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Runnable f3479l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final HashMap<String, Integer> f3468a = new HashMap<>();

    /* JADX INFO: compiled from: InvalidationTracker.java */
    /* JADX INFO: loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor cursorP = e.this.f3471d.p(new x0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorP.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorP.getInt(0)));
                } catch (Throwable th) {
                    cursorP.close();
                    throw th;
                }
            }
            cursorP.close();
            if (!hashSet.isEmpty()) {
                e.this.f3474g.l();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock lockH = e.this.f3471d.h();
            Set<Integer> setA = null;
            try {
                try {
                    lockH.lock();
                    if (!e.this.c()) {
                        lockH.unlock();
                        return;
                    }
                    if (!e.this.f3472e.compareAndSet(true, false)) {
                        lockH.unlock();
                        return;
                    }
                    if (e.this.f3471d.k()) {
                        lockH.unlock();
                        return;
                    }
                    h hVar = e.this.f3471d;
                    if (hVar.f3518g) {
                        x0.b bVarB0 = hVar.i().b0();
                        bVarB0.a();
                        try {
                            setA = a();
                            bVarB0.w();
                            bVarB0.A();
                        } catch (Throwable th) {
                            bVarB0.A();
                            throw th;
                        }
                    } else {
                        setA = a();
                    }
                    lockH.unlock();
                    if (setA == null || setA.isEmpty()) {
                        return;
                    }
                    synchronized (e.this.f3477j) {
                        Iterator<Map.Entry<c, d>> it = e.this.f3477j.iterator();
                        while (it.hasNext()) {
                            it.next().getValue().a(setA);
                        }
                    }
                } catch (Throwable th2) {
                    lockH.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.java */
    /* JADX INFO: loaded from: classes.dex */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f3481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean[] f3482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f3483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3485e;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f3481a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f3482b = zArr;
            this.f3483c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f3484d && !this.f3485e) {
                    int length = this.f3481a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 >= length) {
                            this.f3485e = true;
                            this.f3484d = false;
                            return this.f3483c;
                        }
                        boolean z10 = this.f3481a[i10] > 0;
                        boolean[] zArr = this.f3482b;
                        if (z10 != zArr[i10]) {
                            int[] iArr = this.f3483c;
                            if (!z10) {
                                i11 = 2;
                            }
                            iArr[i10] = i11;
                        } else {
                            this.f3483c[i10] = 0;
                        }
                        zArr[i10] = z10;
                        i10++;
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3481a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        this.f3484d = true;
                    }
                }
            }
            return z10;
        }

        boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f3481a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        z10 = true;
                        this.f3484d = true;
                    }
                }
            }
            return z10;
        }

        void d() {
            synchronized (this) {
                this.f3485e = false;
            }
        }
    }

    /* JADX INFO: compiled from: InvalidationTracker.java */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f3486a;

        public c(String[] strArr) {
            this.f3486a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* JADX INFO: compiled from: InvalidationTracker.java */
    /* JADX INFO: loaded from: classes.dex */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f3487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f3488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c f3489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<String> f3490d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f3489c = cVar;
            this.f3487a = iArr;
            this.f3488b = strArr;
            if (iArr.length != 1) {
                this.f3490d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f3490d = Collections.unmodifiableSet(hashSet);
        }

        void a(Set<Integer> set) {
            int length = this.f3487a.length;
            Set<String> hashSet = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f3487a[i10]))) {
                    if (length == 1) {
                        hashSet = this.f3490d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f3488b[i10]);
                    }
                }
            }
            if (hashSet != null) {
                this.f3489c.b(hashSet);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f3488b.length == 1) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase(this.f3488b[0])) {
                        set = this.f3490d;
                        break;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    for (String str3 : this.f3488b) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f3489c.b(set);
            }
        }
    }

    public e(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f3471d = hVar;
        this.f3475h = new b(strArr.length);
        this.f3470c = map2;
        this.f3476i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f3469b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f3468a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f3469b[i10] = str2.toLowerCase(locale);
            } else {
                this.f3469b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f3468a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f3468a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f3470c.containsKey(lowerCase)) {
                hashSet.addAll(this.f3470c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(x0.b bVar, int i10) {
        bVar.j("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f3469b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f3467m) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            bVar.j(sb2.toString());
        }
    }

    private void k(x0.b bVar, int i10) {
        String str = this.f3469b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f3467m) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, str2);
            bVar.j(sb2.toString());
        }
    }

    public void a(c cVar) {
        d dVarG;
        String[] strArrH = h(cVar.f3486a);
        int[] iArr = new int[strArrH.length];
        int length = strArrH.length;
        for (int i10 = 0; i10 < length; i10++) {
            Integer num = this.f3468a.get(strArrH[i10].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrH[i10]);
            }
            iArr[i10] = num.intValue();
        }
        d dVar = new d(cVar, iArr, strArrH);
        synchronized (this.f3477j) {
            dVarG = this.f3477j.g(cVar, dVar);
        }
        if (dVarG == null && this.f3475h.b(iArr)) {
            l();
        }
    }

    void d(x0.b bVar) {
        synchronized (this) {
            if (this.f3473f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.j("PRAGMA temp_store = MEMORY;");
            bVar.j("PRAGMA recursive_triggers='ON';");
            bVar.j("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(bVar);
            this.f3474g = bVar.T("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f3473f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.f3477j) {
            for (Map.Entry<c, d> entry : this.f3477j) {
                if (!entry.getKey().a()) {
                    entry.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f3472e.compareAndSet(false, true)) {
            this.f3471d.j().execute(this.f3479l);
        }
    }

    public void g(c cVar) {
        d dVarH;
        synchronized (this.f3477j) {
            dVarH = this.f3477j.h(cVar);
        }
        if (dVarH == null || !this.f3475h.c(dVarH.f3487a)) {
            return;
        }
        l();
    }

    void i(Context context, String str) {
        this.f3478k = new f(context, str, this, this.f3471d.j());
    }

    void l() {
        if (this.f3471d.o()) {
            m(this.f3471d.i().b0());
        }
    }

    void m(x0.b bVar) {
        if (bVar.h0()) {
            return;
        }
        while (true) {
            try {
                Lock lockH = this.f3471d.h();
                lockH.lock();
                try {
                    int[] iArrA = this.f3475h.a();
                    if (iArrA == null) {
                        lockH.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    bVar.a();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrA[i10];
                            if (i11 == 1) {
                                j(bVar, i10);
                            } else if (i11 == 2) {
                                k(bVar, i10);
                            }
                        } catch (Throwable th) {
                            bVar.A();
                            throw th;
                        }
                    }
                    bVar.w();
                    bVar.A();
                    this.f3475h.d();
                    lockH.unlock();
                } catch (Throwable th2) {
                    lockH.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }

    boolean c() {
        if (!this.f3471d.o()) {
            return false;
        }
        if (!this.f3473f) {
            this.f3471d.i().b0();
        }
        if (this.f3473f) {
            return true;
        }
        Log.e(GEmOVMyH.AioMqsrcKKbZwDc, "database is not initialized even though it is open");
        return false;
    }
}

package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: RoomDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected volatile x0.b f3512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f3513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f3514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x0.c f3515d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f3518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    protected List<b> f3519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f3520i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ThreadLocal<Integer> f3521j = new ThreadLocal<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f3522k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f3516e = e();

    /* JADX INFO: compiled from: RoomDatabase.java */
    public static class a<T extends h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f3523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f3525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList<b> f3526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f3527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f3528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x0.c.InterfaceC0464c f3529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f3530h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f3532j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f3534l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Set<Integer> f3536n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Set<Integer> f3537o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f3538p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private File f3539q;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f3531i = c.AUTOMATIC;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f3533k = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final d f3535m = new d();

        a(Context context, Class<T> cls, String str) {
            this.f3525c = context;
            this.f3523a = cls;
            this.f3524b = str;
        }

        public a<T> a(b bVar) {
            if (this.f3526d == null) {
                this.f3526d = new ArrayList<>();
            }
            this.f3526d.add(bVar);
            return this;
        }

        public a<T> b(u0.a... aVarArr) {
            if (this.f3537o == null) {
                this.f3537o = new HashSet();
            }
            for (u0.a aVar : aVarArr) {
                this.f3537o.add(Integer.valueOf(aVar.f25872a));
                this.f3537o.add(Integer.valueOf(aVar.f25873b));
            }
            this.f3535m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f3530h = true;
            return this;
        }

        public T d() {
            Executor executor;
            if (this.f3525c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.f3523a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f3527e;
            if (executor2 == null && this.f3528f == null) {
                Executor executorF = m.c.f();
                this.f3528f = executorF;
                this.f3527e = executorF;
            } else if (executor2 != null && this.f3528f == null) {
                this.f3528f = executor2;
            } else if (executor2 == null && (executor = this.f3528f) != null) {
                this.f3527e = executor;
            }
            Set<Integer> set = this.f3537o;
            if (set != null && this.f3536n != null) {
                for (Integer num : set) {
                    if (this.f3536n.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            if (this.f3529g == null) {
                this.f3529g = new y0.c();
            }
            String str = this.f3538p;
            if (str != null || this.f3539q != null) {
                if (this.f3524b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                if (str != null && this.f3539q != null) {
                    throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                }
                this.f3529g = new k(str, this.f3539q, this.f3529g);
            }
            Context context = this.f3525c;
            androidx.room.a aVar = new androidx.room.a(context, this.f3524b, this.f3529g, this.f3535m, this.f3526d, this.f3530h, this.f3531i.c(context), this.f3527e, this.f3528f, this.f3532j, this.f3533k, this.f3534l, this.f3536n, this.f3538p, this.f3539q);
            T t10 = (T) g.b(this.f3523a, "_Impl");
            t10.l(aVar);
            return t10;
        }

        public a<T> e() {
            this.f3533k = false;
            this.f3534l = true;
            return this;
        }

        public a<T> f(x0.c.InterfaceC0464c interfaceC0464c) {
            this.f3529g = interfaceC0464c;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f3527e = executor;
            return this;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.java */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean b(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        c c(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || b(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: compiled from: RoomDatabase.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, u0.a>> f3544a = new HashMap<>();

        private void a(u0.a aVar) {
            int i10 = aVar.f25872a;
            int i11 = aVar.f25873b;
            TreeMap<Integer, u0.a> treeMap = this.f3544a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f3544a.put(Integer.valueOf(i10), treeMap);
            }
            u0.a aVar2 = treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Code duplicated, block: B:11:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d  */
        /* JADX WARN: Code duplicated, block: B:17:0x003a  */
        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0040  */
        /* JADX WARN: Code duplicated, block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:33:0x0054 A[EDGE_INSN: B:33:0x0054->B:25:0x0054 BREAK  A[LOOP:1: B:13:0x0026->B:41:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:35:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:1: B:13:0x0026->B:41:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:9:0x0017 A[DONT_INVERT] */
        private List<u0.a> d(List<u0.a> list, boolean z10, int i10, int i11) {
            TreeMap<Integer, u0.a> treeMap;
            Set<Integer> setKeySet;
            Iterator<Integer> it;
            boolean z11;
            int iIntValue;
            do {
                if (!z10) {
                    if (i10 <= i11) {
                        return list;
                    }
                    treeMap = this.f3544a.get(Integer.valueOf(i10));
                    if (treeMap == null) {
                        if (z10) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            z11 = false;
                            if (it.hasNext()) {
                                break;
                                break;
                            }
                            iIntValue = it.next().intValue();
                            if (z10) {
                                if (iIntValue > i11) {
                                }
                            } else if (iIntValue < i11) {
                            }
                            if (z11) {
                                list.add(treeMap.get(Integer.valueOf(iIntValue)));
                                i10 = iIntValue;
                                z11 = true;
                                break;
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                } else {
                    if (i10 >= i11) {
                        return list;
                    }
                    treeMap = this.f3544a.get(Integer.valueOf(i10));
                    if (treeMap == null) {
                        if (z10) {
                            setKeySet = treeMap.descendingKeySet();
                        } else {
                            setKeySet = treeMap.keySet();
                        }
                        it = setKeySet.iterator();
                        while (true) {
                            z11 = false;
                            if (it.hasNext()) {
                                break;
                            }
                            iIntValue = it.next().intValue();
                            if (z10) {
                                if (iIntValue > i11 && iIntValue > i10) {
                                    z11 = true;
                                }
                            } else if (iIntValue < i11 && iIntValue < i10) {
                                z11 = true;
                            }
                            if (z11) {
                                list.add(treeMap.get(Integer.valueOf(iIntValue)));
                                i10 = iIntValue;
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        return null;
                    }
                }
            } while (z11);
            return null;
        }

        public void b(u0.a... aVarArr) {
            for (u0.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<u0.a> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f3517f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f3521j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        x0.b bVarB0 = this.f3515d.b0();
        this.f3516e.m(bVarB0);
        bVarB0.a();
    }

    public x0.f d(String str) {
        a();
        b();
        return this.f3515d.b0().T(str);
    }

    protected abstract e e();

    protected abstract x0.c f(androidx.room.a aVar);

    @Deprecated
    public void g() {
        this.f3515d.b0().A();
        if (k()) {
            return;
        }
        this.f3516e.f();
    }

    Lock h() {
        return this.f3520i.readLock();
    }

    public x0.c i() {
        return this.f3515d;
    }

    public Executor j() {
        return this.f3513b;
    }

    public boolean k() {
        return this.f3515d.b0().h0();
    }

    public void l(androidx.room.a aVar) {
        x0.c cVarF = f(aVar);
        this.f3515d = cVarF;
        if (cVarF instanceof j) {
            ((j) cVarF).c(aVar);
        }
        boolean z10 = aVar.f3454g == c.WRITE_AHEAD_LOGGING;
        this.f3515d.setWriteAheadLoggingEnabled(z10);
        this.f3519h = aVar.f3452e;
        this.f3513b = aVar.f3455h;
        this.f3514c = new l(aVar.f3456i);
        this.f3517f = aVar.f3453f;
        this.f3518g = z10;
        if (aVar.f3457j) {
            this.f3516e.i(aVar.f3449b, aVar.f3450c);
        }
    }

    protected void m(x0.b bVar) {
        this.f3516e.d(bVar);
    }

    public boolean o() {
        x0.b bVar = this.f3512a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(x0.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(x0.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f3515d.b0().g0(eVar, cancellationSignal) : this.f3515d.b0().R(eVar);
    }

    @Deprecated
    public void r() {
        this.f3515d.b0().w();
    }

    /* JADX INFO: compiled from: RoomDatabase.java */
    public static abstract class b {
        public void a(x0.b bVar) {
        }

        public void b(x0.b bVar) {
        }

        public void c(x0.b bVar) {
        }
    }
}

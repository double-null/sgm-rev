package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f2850k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f2851a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n.b<q<? super T>, LiveData<T>.c> f2852b = new n.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2853c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f2855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f2856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f2860j;

    class LifecycleBoundObserver extends LiveData<T>.c implements h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final j f2861e;

        LifecycleBoundObserver(j jVar, q<? super T> qVar) {
            super(qVar);
            this.f2861e = jVar;
        }

        @Override // androidx.lifecycle.h
        public void b(j jVar, f.a aVar) {
            f.b bVarB = this.f2861e.getLifecycle().b();
            if (bVarB == f.b.DESTROYED) {
                LiveData.this.m(this.f2865a);
                return;
            }
            f.b bVar = null;
            while (bVar != bVarB) {
                h(k());
                bVar = bVarB;
                bVarB = this.f2861e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.f2861e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(j jVar) {
            return this.f2861e == jVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.f2861e.getLifecycle().b().c(f.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2851a) {
                obj = LiveData.this.f2856f;
                LiveData.this.f2856f = LiveData.f2850k;
            }
            LiveData.this.n(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(q<? super T> qVar) {
            super(qVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    public LiveData() {
        Object obj = f2850k;
        this.f2856f = obj;
        this.f2860j = new a();
        this.f2855e = obj;
        this.f2857g = -1;
    }

    static void b(String str) {
        if (m.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.f2866b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i10 = cVar.f2867c;
            int i11 = this.f2857g;
            if (i10 >= i11) {
                return;
            }
            cVar.f2867c = i11;
            cVar.f2865a.a((Object) this.f2855e);
        }
    }

    void c(int i10) {
        int i11 = this.f2853c;
        this.f2853c = i10 + i11;
        if (this.f2854d) {
            return;
        }
        this.f2854d = true;
        while (true) {
            try {
                int i12 = this.f2853c;
                if (i11 == i12) {
                    this.f2854d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    j();
                } else if (z11) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f2854d = false;
                throw th;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.f2858h) {
            this.f2859i = true;
            return;
        }
        this.f2858h = true;
        do {
            this.f2859i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                n.b<q<? super T>, LiveData<T>.c>.d dVarD = this.f2852b.d();
                while (dVarD.hasNext()) {
                    d((c) dVarD.next().getValue());
                    if (this.f2859i) {
                        break;
                    }
                }
            }
        } while (this.f2859i);
        this.f2858h = false;
    }

    public T f() {
        T t10 = (T) this.f2855e;
        if (t10 != f2850k) {
            return t10;
        }
        return null;
    }

    public boolean g() {
        return this.f2853c > 0;
    }

    public void h(j jVar, q<? super T> qVar) {
        b("observe");
        if (jVar.getLifecycle().b() == f.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(jVar, qVar);
        LiveData<T>.c cVarG = this.f2852b.g(qVar, lifecycleBoundObserver);
        if (cVarG != null && !cVarG.j(jVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarG != null) {
            return;
        }
        jVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void i(q<? super T> qVar) {
        b("observeForever");
        b bVar = new b(qVar);
        LiveData<T>.c cVarG = this.f2852b.g(qVar, bVar);
        if (cVarG instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarG != null) {
            return;
        }
        bVar.h(true);
    }

    protected void l(T t10) {
        boolean z10;
        synchronized (this.f2851a) {
            z10 = this.f2856f == f2850k;
            this.f2856f = t10;
        }
        if (z10) {
            m.c.g().c(this.f2860j);
        }
    }

    public void m(q<? super T> qVar) {
        b("removeObserver");
        LiveData<T>.c cVarH = this.f2852b.h(qVar);
        if (cVarH == null) {
            return;
        }
        cVarH.i();
        cVarH.h(false);
    }

    protected void n(T t10) {
        b("setValue");
        this.f2857g++;
        this.f2855e = t10;
        e(null);
    }

    private abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q<? super T> f2865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2867c = -1;

        c(q<? super T> qVar) {
            this.f2865a = qVar;
        }

        void h(boolean z10) {
            if (z10 == this.f2866b) {
                return;
            }
            this.f2866b = z10;
            LiveData.this.c(z10 ? 1 : -1);
            if (this.f2866b) {
                LiveData.this.e(this);
            }
        }

        boolean j(j jVar) {
            return false;
        }

        abstract boolean k();

        void i() {
        }
    }

    protected void j() {
    }

    protected void k() {
    }
}

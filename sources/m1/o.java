package m1;

/* JADX INFO: compiled from: WorkProgressDao_Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f22069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.a<m> f22070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.d f22071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0.d f22072d;

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    class a extends t0.a<m> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // t0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(x0.f fVar, m mVar) throws Throwable {
            String str = mVar.f22067a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.S(1, str);
            }
            byte[] bArrK = androidx.work.e.k(mVar.f22068b);
            if (bArrK == null) {
                fVar.f0(2);
            } else {
                fVar.Z(2, bArrK);
            }
        }
    }

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    class b extends t0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: compiled from: WorkProgressDao_Impl.java */
    class c extends t0.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // t0.d
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.h hVar) {
        this.f22069a = hVar;
        this.f22070b = new a(hVar);
        this.f22071c = new b(hVar);
        this.f22072d = new c(hVar);
    }

    @Override // m1.n
    public void a(String str) {
        this.f22069a.b();
        x0.f fVarA = this.f22071c.a();
        if (str == null) {
            fVarA.f0(1);
        } else {
            fVarA.S(1, str);
        }
        this.f22069a.c();
        try {
            fVarA.l();
            this.f22069a.r();
        } finally {
            this.f22069a.g();
            this.f22071c.f(fVarA);
        }
    }

    @Override // m1.n
    public void b(m mVar) {
        this.f22069a.b();
        this.f22069a.c();
        try {
            this.f22070b.h(mVar);
            this.f22069a.r();
        } finally {
            this.f22069a.g();
        }
    }

    @Override // m1.n
    public void c() {
        this.f22069a.b();
        x0.f fVarA = this.f22072d.a();
        this.f22069a.c();
        try {
            fVarA.l();
            this.f22069a.r();
        } finally {
            this.f22069a.g();
            this.f22072d.f(fVarA);
        }
    }
}

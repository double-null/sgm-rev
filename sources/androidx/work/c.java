package androidx.work;

/* JADX INFO: compiled from: Constraints.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f3638i = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f3639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f3644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f3645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f3646h;

    /* JADX INFO: compiled from: Constraints.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f3647a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f3648b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        m f3649c = m.NOT_REQUIRED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3650d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3651e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f3652f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f3653g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        d f3654h = new d();

        public c a() {
            return new c(this);
        }

        public a b(m mVar) {
            this.f3649c = mVar;
            return this;
        }
    }

    public c() {
        this.f3639a = m.NOT_REQUIRED;
        this.f3644f = -1L;
        this.f3645g = -1L;
        this.f3646h = new d();
    }

    public d a() {
        return this.f3646h;
    }

    public m b() {
        return this.f3639a;
    }

    public long c() {
        return this.f3644f;
    }

    public long d() {
        return this.f3645g;
    }

    public boolean e() {
        return this.f3646h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3640b == cVar.f3640b && this.f3641c == cVar.f3641c && this.f3642d == cVar.f3642d && this.f3643e == cVar.f3643e && this.f3644f == cVar.f3644f && this.f3645g == cVar.f3645g && this.f3639a == cVar.f3639a) {
            return this.f3646h.equals(cVar.f3646h);
        }
        return false;
    }

    public boolean f() {
        return this.f3642d;
    }

    public boolean g() {
        return this.f3640b;
    }

    public boolean h() {
        return this.f3641c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f3639a.hashCode() * 31) + (this.f3640b ? 1 : 0)) * 31) + (this.f3641c ? 1 : 0)) * 31) + (this.f3642d ? 1 : 0)) * 31) + (this.f3643e ? 1 : 0)) * 31;
        long j10 = this.f3644f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3645g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f3646h.hashCode();
    }

    public boolean i() {
        return this.f3643e;
    }

    public void j(d dVar) {
        this.f3646h = dVar;
    }

    public void k(m mVar) {
        this.f3639a = mVar;
    }

    public void l(boolean z10) {
        this.f3642d = z10;
    }

    public void m(boolean z10) {
        this.f3640b = z10;
    }

    public void n(boolean z10) {
        this.f3641c = z10;
    }

    public void o(boolean z10) {
        this.f3643e = z10;
    }

    public void p(long j10) {
        this.f3644f = j10;
    }

    public void q(long j10) {
        this.f3645g = j10;
    }

    c(a aVar) {
        this.f3639a = m.NOT_REQUIRED;
        this.f3644f = -1L;
        this.f3645g = -1L;
        this.f3646h = new d();
        this.f3640b = aVar.f3647a;
        this.f3641c = aVar.f3648b;
        this.f3639a = aVar.f3649c;
        this.f3642d = aVar.f3650d;
        this.f3643e = aVar.f3651e;
        this.f3646h = aVar.f3654h;
        this.f3644f = aVar.f3652f;
        this.f3645g = aVar.f3653g;
    }

    public c(c cVar) {
        this.f3639a = m.NOT_REQUIRED;
        this.f3644f = -1L;
        this.f3645g = -1L;
        this.f3646h = new d();
        this.f3640b = cVar.f3640b;
        this.f3641c = cVar.f3641c;
        this.f3639a = cVar.f3639a;
        this.f3642d = cVar.f3642d;
        this.f3643e = cVar.f3643e;
        this.f3646h = cVar.f3646h;
    }
}

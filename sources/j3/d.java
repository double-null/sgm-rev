package j3;

/* JADX INFO: compiled from: Settings.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f20573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f20577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f20578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20579h;

    /* JADX INFO: compiled from: Settings.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20582c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f20580a = z10;
            this.f20581b = z11;
            this.f20582c = z12;
        }
    }

    /* JADX INFO: compiled from: Settings.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20584b;

        public b(int i10, int i11) {
            this.f20583a = i10;
            this.f20584b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f20574c = j10;
        this.f20572a = bVar;
        this.f20573b = aVar;
        this.f20575d = i10;
        this.f20576e = i11;
        this.f20577f = d10;
        this.f20578g = d11;
        this.f20579h = i12;
    }

    public boolean a(long j10) {
        return this.f20574c < j10;
    }
}

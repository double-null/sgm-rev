package androidx.appcompat.widget;

/* JADX INFO: compiled from: RtlSpacingHelper.java */
/* JADX INFO: loaded from: classes.dex */
class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1500a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1501b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1502c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1503d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1504e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1505f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1506g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1507h = false;

    z0() {
    }

    public int a() {
        return this.f1506g ? this.f1500a : this.f1501b;
    }

    public int b() {
        return this.f1500a;
    }

    public int c() {
        return this.f1501b;
    }

    public int d() {
        return this.f1506g ? this.f1501b : this.f1500a;
    }

    public void e(int i10, int i11) {
        this.f1507h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1504e = i10;
            this.f1500a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1505f = i11;
            this.f1501b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f1506g) {
            return;
        }
        this.f1506g = z10;
        if (!this.f1507h) {
            this.f1500a = this.f1504e;
            this.f1501b = this.f1505f;
            return;
        }
        if (z10) {
            int i10 = this.f1503d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f1504e;
            }
            this.f1500a = i10;
            int i11 = this.f1502c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f1505f;
            }
            this.f1501b = i11;
            return;
        }
        int i12 = this.f1502c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f1504e;
        }
        this.f1500a = i12;
        int i13 = this.f1503d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f1505f;
        }
        this.f1501b = i13;
    }

    public void g(int i10, int i11) {
        this.f1502c = i10;
        this.f1503d = i11;
        this.f1507h = true;
        if (this.f1506g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1500a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1501b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1500a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1501b = i11;
        }
    }
}

package a8;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f134a;

    public final void e(int i10) {
        this.f134a = i10 | this.f134a;
    }

    public void g() {
        this.f134a = 0;
    }

    protected final boolean h(int i10) {
        return (this.f134a & i10) == i10;
    }

    public final boolean i() {
        return h(268435456);
    }

    public final boolean j() {
        return h(4);
    }

    public final boolean k() {
        return h(134217728);
    }

    public final boolean l() {
        return h(1);
    }

    public final boolean m() {
        return h(536870912);
    }

    public final boolean n() {
        return h(67108864);
    }

    public final void o(int i10) {
        this.f134a = i10;
    }
}

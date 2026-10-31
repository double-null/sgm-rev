package ke;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes5.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f21412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21413b;

    public s(g0 writer) {
        kotlin.jvm.internal.t.f(writer, "writer");
        this.f21412a = writer;
        this.f21413b = true;
    }

    public final boolean a() {
        return this.f21413b;
    }

    public void b() {
        this.f21413b = true;
    }

    public void c() {
        this.f21413b = false;
    }

    public void d() {
        this.f21413b = false;
    }

    public void e(byte b10) {
        this.f21412a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f21412a.a(c10);
    }

    public void g(double d10) {
        this.f21412a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f21412a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f21412a.writeLong(i10);
    }

    public void j(long j10) {
        this.f21412a.writeLong(j10);
    }

    public final void k(String v10) {
        kotlin.jvm.internal.t.f(v10, "v");
        this.f21412a.c(v10);
    }

    public void l(short s10) {
        this.f21412a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f21412a.c(String.valueOf(z10));
    }

    public void n(String value) {
        kotlin.jvm.internal.t.f(value, "value");
        this.f21412a.b(value);
    }

    protected final void o(boolean z10) {
        this.f21413b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}

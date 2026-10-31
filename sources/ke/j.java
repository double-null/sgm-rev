package ke;

/* JADX INFO: compiled from: ReaderJsonLexer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f21368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21369b;

    public j(char[] buffer) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        this.f21368a = buffer;
        this.f21369b = buffer.length;
    }

    public char a(int i10) {
        return this.f21368a[i10];
    }

    public final char[] b() {
        return this.f21368a;
    }

    public int c() {
        return this.f21369b;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public void d(int i10) {
        this.f21369b = i10;
    }

    public final String e(int i10, int i11) {
        return rd.c0.u(this.f21368a, i10, Math.min(i11, length()));
    }

    public final void f(int i10) {
        d(Math.min(this.f21368a.length, i10));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return rd.c0.u(this.f21368a, i10, Math.min(i11, length()));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return e(0, length());
    }
}

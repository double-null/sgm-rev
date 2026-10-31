package ke;

import java.io.InputStream;

/* JADX INFO: compiled from: JvmJsonStreams.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f21364a;

    public h0(InputStream stream) {
        kotlin.jvm.internal.t.f(stream, "stream");
        this.f21364a = new r(stream, rd.d.f24999b);
    }

    @Override // ke.f0
    public int a(char[] buffer, int i10, int i11) {
        kotlin.jvm.internal.t.f(buffer, "buffer");
        return this.f21364a.d(buffer, i10, i11);
    }

    public final void b() {
        this.f21364a.e();
    }
}

package af;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ForwardingTimeout.kt */
/* JADX INFO: loaded from: classes5.dex */
public class l extends d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d0 f370f;

    public l(d0 delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.f370f = delegate;
    }

    @Override // af.d0
    public d0 a() {
        return this.f370f.a();
    }

    @Override // af.d0
    public d0 b() {
        return this.f370f.b();
    }

    @Override // af.d0
    public long c() {
        return this.f370f.c();
    }

    @Override // af.d0
    public d0 d(long j10) {
        return this.f370f.d(j10);
    }

    @Override // af.d0
    public boolean e() {
        return this.f370f.e();
    }

    @Override // af.d0
    public void f() throws IOException {
        this.f370f.f();
    }

    @Override // af.d0
    public d0 g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.t.f(unit, "unit");
        return this.f370f.g(j10, unit);
    }

    public final d0 i() {
        return this.f370f;
    }

    public final l j(d0 delegate) {
        kotlin.jvm.internal.t.f(delegate, "delegate");
        this.f370f = delegate;
        return this;
    }
}

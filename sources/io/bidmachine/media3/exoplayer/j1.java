package io.bidmachine.media3.exoplayer;

/* JADX INFO: compiled from: LoadControl.java */
/* JADX INFO: loaded from: classes4.dex */
public interface j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final io.bidmachine.media3.exoplayer.source.r.b f19100a = new io.bidmachine.media3.exoplayer.source.r.b(new Object());

    /* JADX INFO: compiled from: LoadControl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c8.b2 f19101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u7.d0 f19102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.bidmachine.media3.exoplayer.source.r.b f19103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f19104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f19105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f19106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f19107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f19108h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f19109i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f19110j;

        public a(c8.b2 b2Var, u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, long j11, float f10, boolean z10, boolean z11, long j12, long j13) {
            this.f19101a = b2Var;
            this.f19102b = d0Var;
            this.f19103c = bVar;
            this.f19104d = j10;
            this.f19105e = j11;
            this.f19106f = f10;
            this.f19107g = z10;
            this.f19108h = z11;
            this.f19109i = j12;
            this.f19110j = j13;
        }
    }

    @Deprecated
    default boolean a(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10, float f10, boolean z10, long j11) {
        return f(j10, f10, z10, j11);
    }

    @Deprecated
    default boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Deprecated
    default long c() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default void d(c8.b2 b2Var) {
        i();
    }

    default boolean e(c8.b2 b2Var) {
        return b();
    }

    @Deprecated
    default boolean f(long j10, float f10, boolean z10, long j11) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default boolean g(a aVar) {
        return a(aVar.f19102b, aVar.f19103c, aVar.f19105e, aVar.f19106f, aVar.f19108h, aVar.f19109i);
    }

    r8.b h();

    @Deprecated
    default void i() {
        throw new IllegalStateException("onStopped not implemented");
    }

    default boolean j(a aVar) {
        return p(aVar.f19104d, aVar.f19105e, aVar.f19106f);
    }

    default long k(c8.b2 b2Var) {
        return c();
    }

    default void l(a aVar, n8.x xVar, q8.q[] qVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean m(u7.d0 d0Var, io.bidmachine.media3.exoplayer.source.r.b bVar, long j10) {
        x7.r.h("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Deprecated
    default void n() {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void o(c8.b2 b2Var) {
        n();
    }

    @Deprecated
    default void onPrepared() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default boolean p(long j10, long j11, float f10) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default void q(c8.b2 b2Var) {
        onPrepared();
    }
}

package pb;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f24210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i1 f24213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f24214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f24215g;

    public s(long j10, double d10, boolean z10, boolean z11, i1 stopAfter, double d11, List<p> algorithms) {
        kotlin.jvm.internal.t.f(stopAfter, "stopAfter");
        kotlin.jvm.internal.t.f(algorithms, "algorithms");
        this.f24209a = j10;
        this.f24210b = d10;
        this.f24211c = z10;
        this.f24212d = z11;
        this.f24213e = stopAfter;
        this.f24214f = d11;
        this.f24215g = algorithms;
    }

    public final List<p> a() {
        return this.f24215g;
    }

    public final double b() {
        return this.f24210b;
    }

    public final i1 c() {
        return this.f24213e;
    }

    public final long d() {
        return this.f24209a;
    }

    public final double e() {
        return this.f24214f;
    }

    public final boolean f() {
        return this.f24212d;
    }

    public final boolean g() {
        return this.f24211c;
    }
}

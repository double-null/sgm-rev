package pb;

/* JADX INFO: loaded from: classes5.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f24165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f24168d;

    public enum a {
        RGB_STRIP
    }

    public enum b {
        TOP_LEFT,
        TOP_CENTER,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT
    }

    public l1(a algorithm, String payload, int i10, b location) {
        kotlin.jvm.internal.t.f(algorithm, "algorithm");
        kotlin.jvm.internal.t.f(payload, "payload");
        kotlin.jvm.internal.t.f(location, "location");
        this.f24165a = algorithm;
        this.f24166b = payload;
        this.f24167c = i10;
        this.f24168d = location;
    }

    public final int a() {
        return this.f24167c;
    }

    public final b b() {
        return this.f24168d;
    }

    public final String c() {
        return this.f24166b;
    }
}

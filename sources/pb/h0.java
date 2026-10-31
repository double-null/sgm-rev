package pb;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k0 f24094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f24095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f24096c;

    public h0(k0 type, j0 direction, List<Integer> colors) {
        kotlin.jvm.internal.t.f(type, "type");
        kotlin.jvm.internal.t.f(direction, "direction");
        kotlin.jvm.internal.t.f(colors, "colors");
        this.f24094a = type;
        this.f24095b = direction;
        this.f24096c = colors;
    }

    public final List<Integer> a() {
        return this.f24096c;
    }

    public final j0 b() {
        return this.f24095b;
    }

    public final k0 c() {
        return this.f24094a;
    }
}

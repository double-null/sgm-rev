package ab;

import java.util.Map;
import kotlin.jvm.internal.t;
import wb.y;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f216a = new e();

    private e() {
    }

    public static final b a(pb.a params, boolean z10) {
        t.f(params, "params");
        return f216a.c(new y("AdElementAnimator (" + params.j() + ')'), params.b(), new l(params, z10));
    }

    public static final b b(pb.d params) {
        t.f(params, "params");
        return f216a.c(new y("AdPhaseAnimator"), params.b(), new m(params));
    }

    private final b c(y yVar, Map map, g gVar) {
        return new b(yVar, new j(map), gVar);
    }
}

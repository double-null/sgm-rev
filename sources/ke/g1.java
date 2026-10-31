package ke;

import java.util.Set;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<he.f> f21363a = kotlin.collections.u0.i(ge.a.G(wc.z.f27793b).getDescriptor(), ge.a.H(wc.b0.f27741b).getDescriptor(), ge.a.F(wc.x.f27788b).getDescriptor(), ge.a.I(wc.e0.f27751b).getDescriptor());

    public static final boolean a(he.f fVar) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        return fVar.isInline() && kotlin.jvm.internal.t.a(fVar, kotlinx.serialization.json.k.l());
    }

    public static final boolean b(he.f fVar) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        return fVar.isInline() && f21363a.contains(fVar);
    }
}

package je;

import com.applovin.mediation.ads.Zfi.OgqfiHA;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l3 implements fe.d<wc.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f20960a = new l3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f20961b = r0.a("kotlin.ULong", ge.a.A(kotlin.jvm.internal.v.f21536a));

    private l3() {
    }

    public long a(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return wc.b0.b(decoder.r(getDescriptor()).k());
    }

    @Override // fe.c
    public /* bridge */ /* synthetic */ Object deserialize(ie.e eVar) {
        return wc.b0.a(a(eVar));
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f20961b;
    }

    @Override // fe.m
    public /* bridge */ /* synthetic */ void serialize(ie.f fVar, Object obj) {
        b(fVar, ((wc.b0) obj).g());
    }

    public void b(ie.f fVar, long j10) {
        kotlin.jvm.internal.t.f(fVar, OgqfiHA.WWtQjKUa);
        fVar.n(getDescriptor()).m(j10);
    }
}

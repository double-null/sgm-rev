package ke;

import com.android.billingclient.gp.VRfCTjjLv;
import java.util.List;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class w0 extends s0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final kotlinx.serialization.json.d0 f21424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<String> f21425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f21426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21427n;

    @Override // ke.s0, ke.c
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.d0 z0() {
        return this.f21424k;
    }

    @Override // ke.s0, ke.c, ie.c
    public void c(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
    }

    @Override // ke.s0, ie.c
    public int f(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        int i10 = this.f21427n;
        if (i10 >= this.f21426m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f21427n = i11;
        return i11;
    }

    @Override // ke.s0, je.m1
    protected String f0(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return this.f21425l.get(i10 / 2);
    }

    @Override // ke.s0, ke.c
    protected kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        return this.f21427n % 2 == 0 ? kotlinx.serialization.json.k.c(tag) : (kotlinx.serialization.json.i) kotlin.collections.o0.i(z0(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlinx.serialization.json.b json, kotlinx.serialization.json.d0 d0Var) {
        super(json, d0Var, null, null, 12, null);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(d0Var, VRfCTjjLv.biKAqVuHeLIff);
        this.f21424k = d0Var;
        List<String> listP0 = kotlin.collections.b0.p0(z0().keySet());
        this.f21425l = listP0;
        this.f21426m = listP0.size() * 2;
        this.f21427n = -1;
    }
}

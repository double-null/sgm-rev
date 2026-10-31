package ke;

import java.util.ArrayList;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class v0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<kotlinx.serialization.json.i> f21423g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kotlinx.serialization.json.b json, id.l<? super kotlinx.serialization.json.i, wc.g0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(nodeConsumer, "nodeConsumer");
        this.f21423g = new ArrayList<>();
    }

    @Override // ke.e, je.n1
    protected String b0(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // ke.e
    public kotlinx.serialization.json.i s0() {
        return new kotlinx.serialization.json.c(this.f21423g);
    }

    @Override // ke.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(element, "element");
        this.f21423g.add(Integer.parseInt(key), element);
    }
}

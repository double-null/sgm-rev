package ke;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
class t0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, kotlinx.serialization.json.i> f21419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(kotlinx.serialization.json.b json, id.l<? super kotlinx.serialization.json.i, wc.g0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(nodeConsumer, "nodeConsumer");
        this.f21419g = new LinkedHashMap();
    }

    @Override // je.z2, ie.d
    public <T> void o(he.f descriptor, int i10, fe.m<? super T> serializer, T t10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        kotlin.jvm.internal.t.f(serializer, "serializer");
        if (t10 != null || this.f21335d.j()) {
            super.o(descriptor, i10, serializer, t10);
        }
    }

    @Override // ke.e
    public kotlinx.serialization.json.i s0() {
        return new kotlinx.serialization.json.d0(this.f21419g);
    }

    @Override // ke.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(element, "element");
        this.f21419g.put(key, element);
    }

    protected final Map<String, kotlinx.serialization.json.i> x0() {
        return this.f21419g;
    }
}

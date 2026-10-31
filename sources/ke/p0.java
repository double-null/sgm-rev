package ke;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class p0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private kotlinx.serialization.json.i f21400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlinx.serialization.json.b json, id.l<? super kotlinx.serialization.json.i, wc.g0> nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(nodeConsumer, "nodeConsumer");
        Z("primitive");
    }

    @Override // ke.e
    public kotlinx.serialization.json.i s0() {
        kotlinx.serialization.json.i iVar = this.f21400g;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // ke.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(element, "element");
        if (!(key == "primitive")) {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
        }
        if (!(this.f21400g == null)) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        this.f21400g = element;
        t0().invoke(element);
    }
}

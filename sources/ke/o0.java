package ke;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class o0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.i f21390g;

    public /* synthetic */ o0(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.i iVar, String str, int i10, kotlin.jvm.internal.k kVar) {
        this(bVar, iVar, (i10 & 4) != 0 ? null : str);
    }

    @Override // ie.c
    public int f(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.c
    public kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        if (tag == "primitive") {
            return z0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // ke.c
    public kotlinx.serialization.json.i z0() {
        return this.f21390g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(kotlinx.serialization.json.b json, kotlinx.serialization.json.i value, String str) {
        super(json, value, str, null);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(value, "value");
        this.f21390g = value;
        c0("primitive");
    }
}

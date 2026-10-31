package je;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k2 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(he.f primitive) {
        super(primitive, null);
        kotlin.jvm.internal.t.f(primitive, "primitive");
        this.f20955c = primitive.i() + "Array";
    }

    @Override // he.f
    public String i() {
        return this.f20955c;
    }
}

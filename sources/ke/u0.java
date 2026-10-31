package ke;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class u0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.c f21420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21422i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(kotlinx.serialization.json.b json, kotlinx.serialization.json.c value) {
        super(json, value, null, 4, null);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(value, "value");
        this.f21420g = value;
        this.f21421h = z0().size();
        this.f21422i = -1;
    }

    @Override // ke.c
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c z0() {
        return this.f21420g;
    }

    @Override // ie.c
    public int f(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        int i10 = this.f21422i;
        if (i10 >= this.f21421h - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f21422i = i11;
        return i11;
    }

    @Override // je.m1
    protected String f0(he.f descriptor, int i10) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.c
    public kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        return z0().get(Integer.parseInt(tag));
    }
}

package kotlinx.serialization.json;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@fe.l(with = b0.class)
public final class a0 extends g0 {
    public static final a0 INSTANCE = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21550a = "null";

    private a0() {
        super(null);
    }

    @Override // kotlinx.serialization.json.g0
    public String a() {
        return f21550a;
    }

    public final fe.d<a0> serializer() {
        return b0.f21555a;
    }
}

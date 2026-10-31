package je;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r1<T> implements fe.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe.d<T> f20997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.f f20998b;

    public r1(fe.d<T> serializer) {
        kotlin.jvm.internal.t.f(serializer, "serializer");
        this.f20997a = serializer;
        this.f20998b = new p2(serializer.getDescriptor());
    }

    @Override // fe.c
    public T deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return decoder.B() ? (T) decoder.C(this.f20997a) : (T) decoder.i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r1.class == obj.getClass() && kotlin.jvm.internal.t.a(this.f20997a, ((r1) obj).f20997a);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return this.f20998b;
    }

    public int hashCode() {
        return this.f20997a.hashCode();
    }

    @Override // fe.m
    public void serialize(ie.f encoder, T t10) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        if (t10 == null) {
            encoder.r();
        } else {
            encoder.z();
            encoder.q(this.f20997a, t10);
        }
    }
}

package b2;

/* JADX INFO: compiled from: AutoValue_Event.java */
/* JADX INFO: loaded from: classes3.dex */
final class a<T> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f3858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f3859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f3860c;

    a(Integer num, T t10, e eVar, f fVar, d dVar) {
        this.f3858a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f3859b = t10;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f3860c = eVar;
    }

    @Override // b2.c
    public Integer a() {
        return this.f3858a;
    }

    @Override // b2.c
    public d b() {
        return null;
    }

    @Override // b2.c
    public T c() {
        return this.f3859b;
    }

    @Override // b2.c
    public e d() {
        return this.f3860c;
    }

    @Override // b2.c
    public f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f3858a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f3859b.equals(cVar.c()) && this.f3860c.equals(cVar.d())) {
                cVar.e();
                cVar.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f3858a;
        return (((((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f3859b.hashCode()) * 1000003) ^ this.f3860c.hashCode()) * 1000003) ^ 0) * 1000003) ^ 0;
    }

    public String toString() {
        return "Event{code=" + this.f3858a + ", payload=" + this.f3859b + ", priority=" + this.f3860c + ", productData=" + ((Object) null) + ", eventContext=" + ((Object) null) + "}";
    }
}

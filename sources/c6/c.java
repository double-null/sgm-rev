package c6;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class c<R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c<?> f4760d = new c<>(d.SUCCESS, null, b.f4757c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f4761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R f4762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f4763c;

    private c(d dVar, R r10, b bVar) {
        this.f4761a = dVar;
        this.f4762b = r10;
        this.f4763c = bVar;
    }

    public static <T> c<T> a(d dVar, b bVar) {
        return new c<>(dVar, null, bVar);
    }

    public static <T> c<T> b(T t10) {
        return t10 == null ? (c<T>) f4760d : new c<>(d.SUCCESS, t10, b.f4757c);
    }

    public b c() {
        return this.f4763c;
    }

    public d d() {
        return this.f4761a;
    }

    public R e() {
        R r10 = this.f4762b;
        if (r10 != null) {
            return r10;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4761a != cVar.f4761a) {
            return false;
        }
        R r10 = this.f4762b;
        if (r10 == null ? cVar.f4762b == null : r10.equals(cVar.f4762b)) {
            return this.f4763c.equals(cVar.f4763c);
        }
        return false;
    }

    public boolean f() {
        return this.f4761a == d.NETWORK_ERROR;
    }

    public boolean g() {
        return this.f4761a == d.SUCCESS;
    }

    public int hashCode() {
        int iHashCode = this.f4761a.hashCode() * 31;
        R r10 = this.f4762b;
        return ((iHashCode + (r10 != null ? r10.hashCode() : 0)) * 31) + this.f4763c.hashCode();
    }

    public String toString() {
        return "LineApiResponse{errorData=" + this.f4763c + ", responseCode=" + this.f4761a + ", responseData=" + this.f4762b + '}';
    }
}

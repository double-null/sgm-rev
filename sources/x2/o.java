package x2;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: Qualified.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f27973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<T> f27974b;

    /* JADX INFO: compiled from: Qualified.java */
    private @interface a {
    }

    public o(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f27973a = cls;
        this.f27974b = cls2;
    }

    public static <T> o<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new o<>(cls, cls2);
    }

    public static <T> o<T> b(Class<T> cls) {
        return new o<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f27974b.equals(oVar.f27974b)) {
            return this.f27973a.equals(oVar.f27973a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f27974b.hashCode() * 31) + this.f27973a.hashCode();
    }

    public String toString() {
        if (this.f27973a == a.class) {
            return this.f27974b.getName();
        }
        return "@" + this.f27973a.getName() + " " + this.f27974b.getName();
    }
}

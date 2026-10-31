package l4;

import i4.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: TypeToken.java */
/* JADX INFO: loaded from: classes4.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Class<? super T> f21750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Type f21751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f21752c;

    protected a() {
        Type typeD = d(getClass());
        this.f21751b = typeD;
        this.f21750a = (Class<? super T>) b.k(typeD);
        this.f21752c = typeD.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public final Class<? super T> c() {
        return this.f21750a;
    }

    public final Type e() {
        return this.f21751b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f21751b, ((a) obj).f21751b);
    }

    public final int hashCode() {
        return this.f21752c;
    }

    public final String toString() {
        return b.u(this.f21751b);
    }

    a(Type type) {
        Type typeB = b.b((Type) i4.a.b(type));
        this.f21751b = typeB;
        this.f21750a = (Class<? super T>) b.k(typeB);
        this.f21752c = typeB.hashCode();
    }
}

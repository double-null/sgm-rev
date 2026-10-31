package kotlin.jvm.internal;

/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f21537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21538b;

    public w(Class<?> jClass, String moduleName) {
        t.f(jClass, "jClass");
        t.f(moduleName, "moduleName");
        this.f21537a = jClass;
        this.f21538b = moduleName;
    }

    @Override // kotlin.jvm.internal.h
    public Class<?> a() {
        return this.f21537a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && t.a(a(), ((w) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a() + " (Kotlin reflection is not available)";
    }
}

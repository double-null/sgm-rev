package je;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: NothingSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p1 implements he.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f20980a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.m f20981b = he.n.d.f15867a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20982c = "kotlin.Nothing";

    private p1() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // he.f
    public boolean b() {
        return he.f.a.c(this);
    }

    @Override // he.f
    public int c(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // he.f
    public he.m d() {
        return f20981b;
    }

    @Override // he.f
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // he.f
    public String f(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // he.f
    public List<Annotation> g(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // he.f
    public List<Annotation> getAnnotations() {
        return he.f.a.a(this);
    }

    @Override // he.f
    public he.f h(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return i().hashCode() + (d().hashCode() * 31);
    }

    @Override // he.f
    public String i() {
        return f20982c;
    }

    @Override // he.f
    public boolean isInline() {
        return he.f.a.b(this);
    }

    @Override // he.f
    public boolean j(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}

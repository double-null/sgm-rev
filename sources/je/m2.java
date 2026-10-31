package je;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m2 implements he.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.e f20964b;

    public m2(String serialName, he.e kind) {
        kotlin.jvm.internal.t.f(serialName, "serialName");
        kotlin.jvm.internal.t.f(kind, "kind");
        this.f20963a = serialName;
        this.f20964b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
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
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return kotlin.jvm.internal.t.a(i(), m2Var.i()) && kotlin.jvm.internal.t.a(d(), m2Var.d());
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
        return this.f20963a;
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

    @Override // he.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public he.e d() {
        return this.f20964b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + i() + ')';
    }
}

package je;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c1 implements he.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.f f20876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20877b;

    public /* synthetic */ c1(he.f fVar, kotlin.jvm.internal.k kVar) {
        this(fVar);
    }

    @Override // he.f
    public boolean b() {
        return he.f.a.c(this);
    }

    @Override // he.f
    public int c(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        Integer numP = rd.b0.p(name);
        if (numP != null) {
            return numP.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // he.f
    public he.m d() {
        return he.n.b.f15865a;
    }

    @Override // he.f
    public int e() {
        return this.f20877b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return kotlin.jvm.internal.t.a(this.f20876a, c1Var.f20876a) && kotlin.jvm.internal.t.a(i(), c1Var.i());
    }

    @Override // he.f
    public String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // he.f
    public List<Annotation> g(int i10) {
        if (i10 >= 0) {
            return kotlin.collections.t.k();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    @Override // he.f
    public List<Annotation> getAnnotations() {
        return he.f.a.a(this);
    }

    @Override // he.f
    public he.f h(int i10) {
        if (i10 >= 0) {
            return this.f20876a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f20876a.hashCode() * 31) + i().hashCode();
    }

    @Override // he.f
    public boolean isInline() {
        return he.f.a.b(this);
    }

    @Override // he.f
    public boolean j(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return i() + '(' + this.f20876a + ')';
    }

    private c1(he.f fVar) {
        this.f20876a = fVar;
        this.f20877b = 1;
    }
}

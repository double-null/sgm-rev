package je;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i1 implements he.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.f f20938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.f f20939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20940d;

    public /* synthetic */ i1(String str, he.f fVar, he.f fVar2, kotlin.jvm.internal.k kVar) {
        this(str, fVar, fVar2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // he.f
    public he.m d() {
        return he.n.c.f15866a;
    }

    @Override // he.f
    public int e() {
        return this.f20940d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return kotlin.jvm.internal.t.a(i(), i1Var.i()) && kotlin.jvm.internal.t.a(this.f20938b, i1Var.f20938b) && kotlin.jvm.internal.t.a(this.f20939c, i1Var.f20939c);
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
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f20938b;
            }
            if (i11 == 1) {
                return this.f20939c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((i().hashCode() * 31) + this.f20938b.hashCode()) * 31) + this.f20939c.hashCode();
    }

    @Override // he.f
    public String i() {
        return this.f20937a;
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
        return i() + '(' + this.f20938b + ", " + this.f20939c + ')';
    }

    private i1(String str, he.f fVar, he.f fVar2) {
        this.f20937a = str;
        this.f20938b = fVar;
        this.f20939c = fVar2;
        this.f20940d = 2;
    }
}

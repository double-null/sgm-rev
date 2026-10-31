package je;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p2 implements he.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.f f20983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f20985c;

    public p2(he.f original) {
        kotlin.jvm.internal.t.f(original, "original");
        this.f20983a = original;
        this.f20984b = original.i() + '?';
        this.f20985c = a2.a(original);
    }

    @Override // je.n
    public Set<String> a() {
        return this.f20985c;
    }

    @Override // he.f
    public boolean b() {
        return true;
    }

    @Override // he.f
    public int c(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        return this.f20983a.c(name);
    }

    @Override // he.f
    public he.m d() {
        return this.f20983a.d();
    }

    @Override // he.f
    public int e() {
        return this.f20983a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && kotlin.jvm.internal.t.a(this.f20983a, ((p2) obj).f20983a);
    }

    @Override // he.f
    public String f(int i10) {
        return this.f20983a.f(i10);
    }

    @Override // he.f
    public List<Annotation> g(int i10) {
        return this.f20983a.g(i10);
    }

    @Override // he.f
    public List<Annotation> getAnnotations() {
        return this.f20983a.getAnnotations();
    }

    @Override // he.f
    public he.f h(int i10) {
        return this.f20983a.h(i10);
    }

    public int hashCode() {
        return this.f20983a.hashCode() * 31;
    }

    @Override // he.f
    public String i() {
        return this.f20984b;
    }

    @Override // he.f
    public boolean isInline() {
        return this.f20983a.isInline();
    }

    @Override // he.f
    public boolean j(int i10) {
        return this.f20983a.j(i10);
    }

    public final he.f k() {
        return this.f20983a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20983a);
        sb2.append('?');
        return sb2.toString();
    }
}

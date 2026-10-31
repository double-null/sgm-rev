package he;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes5.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f15828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pd.c<?> f15829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15830c;

    public c(f original, pd.c<?> kClass) {
        t.f(original, "original");
        t.f(kClass, "kClass");
        this.f15828a = original;
        this.f15829b = kClass;
        this.f15830c = original.i() + '<' + kClass.g() + '>';
    }

    @Override // he.f
    public boolean b() {
        return this.f15828a.b();
    }

    @Override // he.f
    public int c(String name) {
        t.f(name, "name");
        return this.f15828a.c(name);
    }

    @Override // he.f
    public m d() {
        return this.f15828a.d();
    }

    @Override // he.f
    public int e() {
        return this.f15828a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && t.a(this.f15828a, cVar.f15828a) && t.a(cVar.f15829b, this.f15829b);
    }

    @Override // he.f
    public String f(int i10) {
        return this.f15828a.f(i10);
    }

    @Override // he.f
    public List<Annotation> g(int i10) {
        return this.f15828a.g(i10);
    }

    @Override // he.f
    public List<Annotation> getAnnotations() {
        return this.f15828a.getAnnotations();
    }

    @Override // he.f
    public f h(int i10) {
        return this.f15828a.h(i10);
    }

    public int hashCode() {
        return (this.f15829b.hashCode() * 31) + i().hashCode();
    }

    @Override // he.f
    public String i() {
        return this.f15830c;
    }

    @Override // he.f
    public boolean isInline() {
        return this.f15828a.isInline();
    }

    @Override // he.f
    public boolean j(int i10) {
        return this.f15828a.j(i10);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f15829b + ", original: " + this.f15828a + ')';
    }
}

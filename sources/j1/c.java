package j1;

import java.util.ArrayList;
import java.util.List;
import m1.p;

/* JADX INFO: compiled from: ConstraintController.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> implements i1.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f20539a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f20540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k1.d<T> f20541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f20542d;

    /* JADX INFO: compiled from: ConstraintController.java */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(k1.d<T> dVar) {
        this.f20541c = dVar;
    }

    private void h(a aVar, T t10) {
        if (this.f20539a.isEmpty() || aVar == null) {
            return;
        }
        if (t10 == null || c(t10)) {
            aVar.b(this.f20539a);
        } else {
            aVar.a(this.f20539a);
        }
    }

    @Override // i1.a
    public void a(T t10) {
        this.f20540b = t10;
        h(this.f20542d, t10);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f20540b;
        return t10 != null && c(t10) && this.f20539a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f20539a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f20539a.add(pVar.f22078a);
            }
        }
        if (this.f20539a.isEmpty()) {
            this.f20541c.c(this);
        } else {
            this.f20541c.a(this);
        }
        h(this.f20542d, this.f20540b);
    }

    public void f() {
        if (this.f20539a.isEmpty()) {
            return;
        }
        this.f20539a.clear();
        this.f20541c.c(this);
    }

    public void g(a aVar) {
        if (this.f20542d != aVar) {
            this.f20542d = aVar;
            h(aVar, this.f20540b);
        }
    }
}

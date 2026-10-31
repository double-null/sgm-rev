package zc;

import id.p;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f29175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j.b f29176b;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    private static final class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0498a f29177b = new C0498a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j[] f29178a;

        /* JADX INFO: renamed from: zc.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        public static final class C0498a {
            private C0498a() {
            }

            public /* synthetic */ C0498a(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public a(j[] elements) {
            t.f(elements, "elements");
            this.f29178a = elements;
        }

        private final Object readResolve() {
            j[] jVarArr = this.f29178a;
            j jVarZ = k.f29181a;
            for (j jVar : jVarArr) {
                jVarZ = jVarZ.z(jVar);
            }
            return jVarZ;
        }
    }

    public e(j left, j.b element) {
        t.f(left, "left");
        t.f(element, "element");
        this.f29175a = left;
        this.f29176b = element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String D(String acc, j.b element) {
        t.f(acc, "acc");
        t.f(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 H(j[] jVarArr, f0 f0Var, g0 g0Var, j.b element) {
        t.f(g0Var, "<unused var>");
        t.f(element, "element");
        int i10 = f0Var.f21511a;
        f0Var.f21511a = i10 + 1;
        jVarArr[i10] = element;
        return g0.f27756a;
    }

    private final boolean p(j.b bVar) {
        return t.a(e(bVar.getKey()), bVar);
    }

    private final boolean w(e eVar) {
        while (p(eVar.f29176b)) {
            j jVar = eVar.f29175a;
            if (!(jVar instanceof e)) {
                t.d(jVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return p((j.b) jVar);
            }
            eVar = (e) jVar;
        }
        return false;
    }

    private final Object writeReplace() {
        int iX = x();
        final j[] jVarArr = new j[iX];
        final f0 f0Var = new f0();
        U(g0.f27756a, new p() { // from class: zc.c
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return e.H(jVarArr, f0Var, (g0) obj, (j.b) obj2);
            }
        });
        if (f0Var.f21511a == iX) {
            return new a(jVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private final int x() {
        int i10 = 2;
        e eVar = this;
        while (true) {
            j jVar = eVar.f29175a;
            eVar = jVar instanceof e ? (e) jVar : null;
            if (eVar == null) {
                return i10;
            }
            i10++;
        }
    }

    @Override // zc.j
    public <R> R U(R r10, p<? super R, ? super j.b, ? extends R> operation) {
        t.f(operation, "operation");
        return operation.invoke((Object) this.f29175a.U(r10, operation), this.f29176b);
    }

    @Override // zc.j
    public j a0(j.c<?> key) {
        t.f(key, "key");
        if (this.f29176b.e(key) != null) {
            return this.f29175a;
        }
        j jVarA0 = this.f29175a.a0(key);
        if (jVarA0 == this.f29175a) {
            return this;
        }
        return jVarA0 == k.f29181a ? this.f29176b : new e(jVarA0, this.f29176b);
    }

    @Override // zc.j
    public <E extends j.b> E e(j.c<E> key) {
        t.f(key, "key");
        e eVar = this;
        while (true) {
            E e10 = (E) eVar.f29176b.e(key);
            if (e10 != null) {
                return e10;
            }
            j jVar = eVar.f29175a;
            if (!(jVar instanceof e)) {
                return (E) jVar.e(key);
            }
            eVar = (e) jVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (eVar.x() != x() || !eVar.w(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f29175a.hashCode() + this.f29176b.hashCode();
    }

    public String toString() {
        return '[' + ((String) U("", new p() { // from class: zc.d
            @Override // id.p
            public final Object invoke(Object obj, Object obj2) {
                return e.D((String) obj, (j.b) obj2);
            }
        })) + ']';
    }

    @Override // zc.j
    public j z(j jVar) {
        return j.a.b(this, jVar);
    }
}

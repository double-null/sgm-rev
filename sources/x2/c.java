package x2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: Component.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<o<? super T>> f27949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<m> f27950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g<T> f27953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<Class<?>> f27954g;

    /* JADX INFO: compiled from: Component.java */
    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f27955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<o<? super T>> f27956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<m> f27957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f27959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g<T> f27960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Class<?>> f27961g;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> f() {
            this.f27959e = 1;
            return this;
        }

        private b<T> h(int i10) {
            n.d(this.f27958d == 0, "Instantiation type has already been set.");
            this.f27958d = i10;
            return this;
        }

        private void i(o<?> oVar) {
            n.a(!this.f27956b.contains(oVar), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public c<T> c() {
            n.d(this.f27960f != null, "Missing required property: factory.");
            return new c<>(this.f27955a, new HashSet(this.f27956b), new HashSet(this.f27957c), this.f27958d, this.f27959e, this.f27960f, this.f27961g);
        }

        public b<T> d() {
            return h(2);
        }

        public b<T> e(g<T> gVar) {
            this.f27960f = (g) n.c(gVar, "Null factory");
            return this;
        }

        public b<T> g(String str) {
            this.f27955a = str;
            return this;
        }

        public b<T> b(m mVar) {
            n.c(mVar, TwDPD.rLwctGDqEGb);
            i(mVar.c());
            this.f27957c.add(mVar);
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f27955a = null;
            HashSet hashSet = new HashSet();
            this.f27956b = hashSet;
            this.f27957c = new HashSet();
            this.f27958d = 0;
            this.f27959e = 0;
            this.f27961g = new HashSet();
            n.c(cls, "Null interface");
            hashSet.add(o.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                n.c(cls2, "Null interface");
                this.f27956b.add(o.b(cls2));
            }
        }

        @SafeVarargs
        private b(o<T> oVar, o<? super T>... oVarArr) {
            this.f27955a = null;
            HashSet hashSet = new HashSet();
            this.f27956b = hashSet;
            this.f27957c = new HashSet();
            this.f27958d = 0;
            this.f27959e = 0;
            this.f27961g = new HashSet();
            n.c(oVar, "Null interface");
            hashSet.add(oVar);
            for (o<? super T> oVar2 : oVarArr) {
                n.c(oVar2, "Null interface");
            }
            Collections.addAll(this.f27956b, oVarArr);
        }
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> b<T> e(o<T> oVar) {
        return new b<>(oVar, new o[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(o<T> oVar, o<? super T>... oVarArr) {
        return new b<>(oVar, oVarArr);
    }

    public static <T> c<T> l(final T t10, Class<T> cls) {
        return m(cls).e(new g() { // from class: x2.a
            @Override // x2.g
            public final Object create(d dVar) {
                return c.q(t10, dVar);
            }
        }).c();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).f();
    }

    @SafeVarargs
    public static <T> c<T> s(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).e(new g() { // from class: x2.b
            @Override // x2.g
            public final Object create(d dVar) {
                return c.r(t10, dVar);
            }
        }).c();
    }

    public Set<m> g() {
        return this.f27950c;
    }

    public g<T> h() {
        return this.f27953f;
    }

    public String i() {
        return this.f27948a;
    }

    public Set<o<? super T>> j() {
        return this.f27949b;
    }

    public Set<Class<?>> k() {
        return this.f27954g;
    }

    public boolean n() {
        return this.f27951d == 1;
    }

    public boolean o() {
        return this.f27951d == 2;
    }

    public boolean p() {
        return this.f27952e == 0;
    }

    public c<T> t(g<T> gVar) {
        return new c<>(this.f27948a, this.f27949b, this.f27950c, this.f27951d, this.f27952e, gVar, this.f27954g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f27949b.toArray()) + ">{" + this.f27951d + ", type=" + this.f27952e + ", deps=" + Arrays.toString(this.f27950c.toArray()) + "}";
    }

    private c(String str, Set<o<? super T>> set, Set<m> set2, int i10, int i11, g<T> gVar, Set<Class<?>> set3) {
        this.f27948a = str;
        this.f27949b = Collections.unmodifiableSet(set);
        this.f27950c = Collections.unmodifiableSet(set2);
        this.f27951d = i10;
        this.f27952e = i11;
        this.f27953f = gVar;
        this.f27954g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, d dVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, d dVar) {
        return obj;
    }
}

package wc;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
final class t<T> implements k<T>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f27777d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<t<?>, Object> f27778e = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile id.a<? extends T> f27779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f27780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f27781c;

    /* JADX INFO: compiled from: LazyJVM.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public t(id.a<? extends T> initializer) {
        kotlin.jvm.internal.t.f(initializer, "initializer");
        this.f27779a = initializer;
        d0 d0Var = d0.f27750a;
        this.f27780b = d0Var;
        this.f27781c = d0Var;
    }

    private final Object writeReplace() {
        return new h(getValue());
    }

    @Override // wc.k
    public T getValue() {
        T t10 = (T) this.f27780b;
        d0 d0Var = d0.f27750a;
        if (t10 != d0Var) {
            return t10;
        }
        id.a<? extends T> aVar = this.f27779a;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f27778e, this, d0Var, tInvoke)) {
                this.f27779a = null;
                return tInvoke;
            }
        }
        return (T) this.f27780b;
    }

    @Override // wc.k
    public boolean isInitialized() {
        return this.f27780b != d0.f27750a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

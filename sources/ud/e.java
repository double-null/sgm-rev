package ud;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes5.dex */
final class e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f26730b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0<T>[] f26731a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: Await.kt */
    private final class a extends f2 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f26732h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final n<List<? extends T>> f26733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g1 f26734f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super List<? extends T>> nVar) {
            this.f26733e = nVar;
        }

        public final g1 A() {
            g1 g1Var = this.f26734f;
            if (g1Var != null) {
                return g1Var;
            }
            kotlin.jvm.internal.t.u("handle");
            return null;
        }

        public final void C(e<T>.b bVar) {
            f26732h.set(this, bVar);
        }

        public final void D(g1 g1Var) {
            this.f26734f = g1Var;
        }

        @Override // ud.f2
        public boolean w() {
            return false;
        }

        @Override // ud.f2
        public void x(Throwable th) {
            if (th != null) {
                Object objW = this.f26733e.w(th);
                if (objW != null) {
                    this.f26733e.h0(objW);
                    e<T>.b bVarZ = z();
                    if (bVarZ != null) {
                        bVarZ.a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.d().decrementAndGet(e.this) == 0) {
                n<List<? extends T>> nVar = this.f26733e;
                v0[] v0VarArr = ((e) e.this).f26731a;
                ArrayList arrayList = new ArrayList(v0VarArr.length);
                for (v0 v0Var : v0VarArr) {
                    arrayList.add(v0Var.h());
                }
                nVar.resumeWith(wc.r.c(arrayList));
            }
        }

        public final e<T>.b z() {
            return (b) f26732h.get(this);
        }
    }

    /* JADX INFO: compiled from: Await.kt */
    private final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e<T>.a[] f26736a;

        public b(e<T>.a[] aVarArr) {
            this.f26736a = aVarArr;
        }

        public final void a() {
            for (e<T>.a aVar : this.f26736a) {
                aVar.A().e();
            }
        }

        @Override // ud.m
        public void b(Throwable th) {
            a();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f26736a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(v0<? extends T>[] v0VarArr) {
        this.f26731a = v0VarArr;
        this.notCompletedCount$volatile = v0VarArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f26730b;
    }

    public final Object c(zc.f<? super List<? extends T>> fVar) {
        p pVar = new p(ad.c.c(fVar), 1);
        pVar.G();
        int length = this.f26731a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            v0 v0Var = this.f26731a[i10];
            v0Var.start();
            a aVar = new a(pVar);
            aVar.D(e2.l(v0Var, false, aVar, 1, null));
            wc.g0 g0Var = wc.g0.f27756a;
            aVarArr[i10] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].C(bVar);
        }
        if (pVar.k()) {
            bVar.a();
        } else {
            r.c(pVar, bVar);
        }
        Object objZ = pVar.z();
        if (objZ == ad.d.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objZ;
    }
}

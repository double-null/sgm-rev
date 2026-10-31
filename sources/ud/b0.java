package ud;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
final class b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R f26715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f26716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id.q<Throwable, R, zc.j, wc.g0> f26717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f26719e;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(R r10, m mVar, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar, Object obj, Throwable th) {
        this.f26715a = r10;
        this.f26716b = mVar;
        this.f26717c = qVar;
        this.f26718d = obj;
        this.f26719e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 b(b0 b0Var, Object obj, m mVar, id.q qVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b0Var.f26715a;
        }
        if ((i10 & 2) != 0) {
            mVar = b0Var.f26716b;
        }
        m mVar2 = mVar;
        if ((i10 & 4) != 0) {
            qVar = b0Var.f26717c;
        }
        id.q qVar2 = qVar;
        if ((i10 & 8) != 0) {
            obj2 = b0Var.f26718d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = b0Var.f26719e;
        }
        return b0Var.a(obj, mVar2, qVar2, obj4, th);
    }

    public final b0<R> a(R r10, m mVar, id.q<? super Throwable, ? super R, ? super zc.j, wc.g0> qVar, Object obj, Throwable th) {
        return new b0<>(r10, mVar, qVar, obj, th);
    }

    public final boolean c() {
        return this.f26719e != null;
    }

    public final void d(p<?> pVar, Throwable th) {
        m mVar = this.f26716b;
        if (mVar != null) {
            pVar.n(mVar, th);
        }
        id.q<Throwable, R, zc.j, wc.g0> qVar = this.f26717c;
        if (qVar != null) {
            pVar.o(qVar, th, this.f26715a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.t.a(this.f26715a, b0Var.f26715a) && kotlin.jvm.internal.t.a(this.f26716b, b0Var.f26716b) && kotlin.jvm.internal.t.a(this.f26717c, b0Var.f26717c) && kotlin.jvm.internal.t.a(this.f26718d, b0Var.f26718d) && kotlin.jvm.internal.t.a(this.f26719e, b0Var.f26719e);
    }

    public int hashCode() {
        R r10 = this.f26715a;
        int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
        m mVar = this.f26716b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        id.q<Throwable, R, zc.j, wc.g0> qVar = this.f26717c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.f26718d;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.f26719e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f26715a + ", cancelHandler=" + this.f26716b + ", onCancellation=" + this.f26717c + ", idempotentResume=" + this.f26718d + ", cancelCause=" + this.f26719e + ')';
    }

    public /* synthetic */ b0(Object obj, m mVar, id.q qVar, Object obj2, Throwable th, int i10, kotlin.jvm.internal.k kVar) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}

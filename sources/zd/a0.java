package zd;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes5.dex */
public class a0<T> extends ud.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.f<T> f29183d;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(zc.j jVar, zc.f<? super T> fVar) {
        super(jVar, true, true);
        this.f29183d = fVar;
    }

    @Override // ud.g2
    protected void A(Object obj) {
        h.b(ad.c.c(this.f29183d), ud.d0.a(obj, this.f29183d));
    }

    @Override // ud.a
    protected void U0(Object obj) {
        zc.f<T> fVar = this.f29183d;
        fVar.resumeWith(ud.d0.a(obj, fVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zc.f<T> fVar = this.f29183d;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // ud.g2
    protected final boolean v0() {
        return true;
    }
}

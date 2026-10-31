package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j extends a {
    public j(zc.f<Object> fVar) {
        super(fVar);
        if (fVar != null) {
            if (!(fVar.getContext() == zc.k.f29181a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // zc.f
    public zc.j getContext() {
        return zc.k.f29181a;
    }
}

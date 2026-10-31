package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends a {
    private final zc.j _context;
    private transient zc.f<Object> intercepted;

    public d(zc.f<Object> fVar, zc.j jVar) {
        super(fVar);
        this._context = jVar;
    }

    @Override // zc.f
    public zc.j getContext() {
        zc.j jVar = this._context;
        t.c(jVar);
        return jVar;
    }

    public final zc.f<Object> intercepted() {
        zc.f<Object> fVarT = this.intercepted;
        if (fVarT == null) {
            zc.g gVar = (zc.g) getContext().e(zc.g.f29179a9);
            if (gVar == null || (fVarT = gVar.t(this)) == null) {
                fVarT = this;
            }
            this.intercepted = fVarT;
        }
        return fVarT;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        zc.f<?> fVar = this.intercepted;
        if (fVar != null && fVar != this) {
            zc.j.b bVarE = getContext().e(zc.g.f29179a9);
            t.c(bVarE);
            ((zc.g) bVarE).i0(fVar);
        }
        this.intercepted = c.f21488a;
    }

    public d(zc.f<Object> fVar) {
        this(fVar, fVar != null ? fVar.getContext() : null);
    }
}

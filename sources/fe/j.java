package fe;

import java.util.Map;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: SealedSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j<T> extends je.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.c<T> f14967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wc.k f14968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<pd.c<? extends T>, d<? extends T>> f14969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, d<? extends T>> f14970d;

    @Override // je.b
    public c<T> c(ie.c decoder, String str) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        d<? extends T> dVar = this.f14970d.get(str);
        return dVar != null ? dVar : super.c(decoder, str);
    }

    @Override // je.b
    public m<T> d(ie.f encoder, T value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        d<? extends T> dVarD = this.f14969c.get(i0.b(value.getClass()));
        if (dVarD == null) {
            dVarD = super.d(encoder, value);
        }
        if (dVarD != null) {
            return dVarD;
        }
        return null;
    }

    @Override // je.b
    public pd.c<T> e() {
        return this.f14967a;
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return (he.f) this.f14968b.getValue();
    }
}

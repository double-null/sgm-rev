package je;

import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a<Element, Collection, Builder> implements fe.d<Collection> {
    private a() {
    }

    public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
        this();
    }

    public static /* synthetic */ void i(a aVar, ie.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.h(cVar, i10, obj, z10);
    }

    private final int j(ie.c cVar, Builder builder) {
        int iE = cVar.e(getDescriptor());
        c(builder, iE);
        return iE;
    }

    protected abstract Builder a();

    protected abstract int b(Builder builder);

    protected abstract void c(Builder builder, int i10);

    protected abstract Iterator<Element> d(Collection collection);

    @Override // fe.c
    public Collection deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Collection collection);

    public final Collection f(ie.e decoder, Collection collection) {
        Builder builderA;
        kotlin.jvm.internal.t.f(decoder, "decoder");
        if (collection == null || (builderA = k(collection)) == null) {
            builderA = a();
        }
        int iB = b(builderA);
        ie.c cVarB = decoder.b(getDescriptor());
        if (!cVarB.q()) {
            while (true) {
                int iF = cVarB.f(getDescriptor());
                if (iF == -1) {
                    break;
                }
                i(this, cVarB, iB + iF, builderA, false, 8, null);
            }
        } else {
            g(cVarB, builderA, iB, j(cVarB, builderA));
        }
        cVarB.c(getDescriptor());
        return l(builderA);
    }

    protected abstract void g(ie.c cVar, Builder builder, int i10, int i11);

    protected abstract void h(ie.c cVar, int i10, Builder builder, boolean z10);

    protected abstract Builder k(Collection collection);

    protected abstract Collection l(Builder builder);
}

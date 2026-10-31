package je;

import d5.LXP.wcAlQCOdREZdI;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class v<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe.d<Element> f21021a;

    public /* synthetic */ v(fe.d dVar, kotlin.jvm.internal.k kVar) {
        this(dVar);
    }

    @Override // fe.d, fe.m, fe.c
    public abstract he.f getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je.a
    protected void h(ie.c decoder, int i10, Builder builder, boolean z10) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        n(builder, i10, ie.c.a.c(decoder, getDescriptor(), i10, this.f21021a, null, 8, null));
    }

    protected abstract void n(Builder builder, int i10, Element element);

    @Override // fe.m
    public void serialize(ie.f encoder, Collection collection) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        int iE = e(collection);
        he.f descriptor = getDescriptor();
        ie.d dVarB = encoder.B(descriptor, iE);
        Iterator<Element> itD = d(collection);
        for (int i10 = 0; i10 < iE; i10++) {
            dVarB.E(getDescriptor(), i10, this.f21021a, itD.next());
        }
        dVarB.c(descriptor);
    }

    private v(fe.d<Element> dVar) {
        super(null);
        this.f21021a = dVar;
    }

    @Override // je.a
    protected final void g(ie.c cVar, Builder builder, int i10, int i11) {
        kotlin.jvm.internal.t.f(cVar, wcAlQCOdREZdI.RAvehbRrkDXyN);
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(cVar, i10 + i12, builder, false);
        }
    }
}

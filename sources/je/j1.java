package je;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j1<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe.d<Key> f20947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe.d<Value> f20948b;

    public /* synthetic */ j1(fe.d dVar, fe.d dVar2, kotlin.jvm.internal.k kVar) {
        this(dVar, dVar2);
    }

    @Override // fe.d, fe.m, fe.c
    public abstract he.f getDescriptor();

    public final fe.d<Key> m() {
        return this.f20947a;
    }

    public final fe.d<Value> n() {
        return this.f20948b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(ie.c decoder, int i10, Builder builder, boolean z10) {
        int iF;
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        Object objC = ie.c.a.c(decoder, getDescriptor(), i10, this.f20947a, null, 8, null);
        if (z10) {
            iF = decoder.f(getDescriptor());
            if (!(iF == i10 + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iF).toString());
            }
        } else {
            iF = i10 + 1;
        }
        int i11 = iF;
        builder.put(objC, (!builder.containsKey(objC) || (this.f20948b.getDescriptor().d() instanceof he.e)) ? ie.c.a.c(decoder, getDescriptor(), i11, this.f20948b, null, 8, null) : decoder.F(getDescriptor(), i11, this.f20948b, kotlin.collections.o0.i(builder, objC)));
    }

    @Override // fe.m
    public void serialize(ie.f encoder, Collection collection) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        int iE = e(collection);
        he.f descriptor = getDescriptor();
        ie.d dVarB = encoder.B(descriptor, iE);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itD = d(collection);
        int i10 = 0;
        while (itD.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itD.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i11 = i10 + 1;
            dVarB.E(getDescriptor(), i10, m(), key);
            dVarB.E(getDescriptor(), i11, n(), value);
            i10 = i11 + 1;
        }
        dVarB.c(descriptor);
    }

    private j1(fe.d<Key> dVar, fe.d<Value> dVar2) {
        super(null);
        this.f20947a = dVar;
        this.f20948b = dVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // je.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(ie.c decoder, Builder builder, int i10, int i11) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        kotlin.jvm.internal.t.f(builder, "builder");
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(sRGQSqxgxlS.zeHNlGHiypmNW.toString());
        }
        od.f fVarM = od.k.m(od.k.n(0, i11 * 2), 2);
        int iA = fVarM.a();
        int iC = fVarM.c();
        int iD = fVarM.d();
        if ((iD <= 0 || iA > iC) && (iD >= 0 || iC > iA)) {
            return;
        }
        while (true) {
            h(decoder, i10 + iA, builder, false);
            if (iA == iC) {
                return;
            } else {
                iA += iD;
            }
        }
    }
}

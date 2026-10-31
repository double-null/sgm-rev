package kotlin.jvm.internal;

/* JADX INFO: compiled from: PropertyReference2.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b0 extends d0 implements pd.k {
    public b0(Class cls, String str, String str2, int i10) {
        super(f.NO_RECEIVER, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.f
    protected pd.b computeReflected() {
        return i0.g(this);
    }

    @Override // pd.k
    public pd.k.a getGetter() {
        ((pd.k) getReflected()).getGetter();
        return null;
    }

    @Override // id.p
    public Object invoke(Object obj, Object obj2) {
        return n(obj, obj2);
    }
}

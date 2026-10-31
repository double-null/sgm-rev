package kotlin.jvm.internal;

/* JADX INFO: compiled from: PropertyReference0.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class x extends d0 implements pd.i {
    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // kotlin.jvm.internal.f
    protected pd.b computeReflected() {
        return i0.e(this);
    }

    @Override // id.a
    public Object invoke() {
        return get();
    }
}

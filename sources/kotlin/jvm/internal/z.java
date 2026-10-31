package kotlin.jvm.internal;

/* JADX INFO: compiled from: PropertyReference1.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class z extends d0 implements pd.j {
    public z() {
    }

    @Override // kotlin.jvm.internal.f
    protected pd.b computeReflected() {
        return i0.f(this);
    }

    @Override // pd.j
    public Object getDelegate(Object obj) {
        return ((pd.j) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ pd.h.a getGetter() {
        mo386getGetter();
        return null;
    }

    @Override // id.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    public z(Object obj) {
        super(obj);
    }

    @Override // pd.j
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public pd.j.a mo386getGetter() {
        ((pd.j) getReflected()).mo386getGetter();
        return null;
    }

    public z(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}

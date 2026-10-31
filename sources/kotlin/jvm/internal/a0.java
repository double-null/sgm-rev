package kotlin.jvm.internal;

/* JADX INFO: compiled from: PropertyReference1Impl.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends z {
    public a0(pd.f fVar, String str, String str2) {
        super(f.NO_RECEIVER, ((h) fVar).a(), str, str2, !(fVar instanceof pd.c) ? 1 : 0);
    }

    public Object get(Object obj) {
        mo386getGetter();
        throw null;
    }

    public a0(Class cls, String str, String str2, int i10) {
        super(f.NO_RECEIVER, cls, str, str2, i10);
    }

    public a0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}

package je;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j2<Array> {
    public static /* synthetic */ void c(j2 j2Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = j2Var.d() + 1;
        }
        j2Var.b(i10);
    }

    public abstract Array a();

    public abstract void b(int i10);

    public abstract int d();
}

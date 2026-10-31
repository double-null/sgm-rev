package yb;

/* JADX INFO: compiled from: TypeConversion.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface h<T> {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object b(h hVar, String str, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toOrDefault");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return hVar.a(str, obj);
    }

    T a(String str, T t10);
}

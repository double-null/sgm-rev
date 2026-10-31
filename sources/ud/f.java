package ud;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public static final <T> Object a(Collection<? extends v0<? extends T>> collection, zc.f<? super List<? extends T>> fVar) {
        return collection.isEmpty() ? kotlin.collections.t.k() : new e((v0[]) collection.toArray(new v0[0])).c(fVar);
    }
}

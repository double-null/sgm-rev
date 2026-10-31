package le;

import fe.m;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    private c() {
    }

    public /* synthetic */ c(k kVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ fe.d c(c cVar, pd.c cVar2, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = t.k();
        }
        return cVar.b(cVar2, list);
    }

    public abstract void a(f fVar);

    public abstract <T> fe.d<T> b(pd.c<T> cVar, List<? extends fe.d<?>> list);

    public abstract boolean d();

    public abstract <T> fe.c<T> e(pd.c<? super T> cVar, String str);

    public abstract <T> m<T> f(pd.c<? super T> cVar, T t10);
}

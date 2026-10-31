package je;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
final class t<T> implements y1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.p<pd.c<Object>, List<? extends pd.l>, fe.d<T>> f21009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u<x1<T>> f21010b;

    /* JADX INFO: compiled from: Caching.kt */
    public static final class a implements id.a<T> {
        @Override // id.a
        public final T invoke() {
            return (T) new x1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(id.p<? super pd.c<Object>, ? super List<? extends pd.l>, ? extends fe.d<T>> compute) {
        kotlin.jvm.internal.t.f(compute, "compute");
        this.f21009a = compute;
        this.f21010b = new u<>();
    }

    @Override // je.y1
    public Object a(pd.c<Object> key, List<? extends pd.l> types) {
        Object objC;
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(types, "types");
        x1<T> x1Var = this.f21010b.get(hd.a.a(key));
        kotlin.jvm.internal.t.e(x1Var, "get(...)");
        k1 k1Var = (k1) x1Var;
        T t10 = k1Var.f20954a.get();
        if (t10 == null) {
            t10 = (T) k1Var.a(new a());
        }
        x1 x1Var2 = t10;
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new w0((pd.l) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = x1Var2.f21035a;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                wc.r.a aVar = wc.r.f27774b;
                objC = wc.r.c(this.f21009a.invoke(key, types));
            } catch (Throwable th) {
                wc.r.a aVar2 = wc.r.f27774b;
                objC = wc.r.c(wc.s.a(th));
            }
            wc.r rVarB = wc.r.b(objC);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, rVarB);
            obj = objPutIfAbsent == null ? rVarB : objPutIfAbsent;
        }
        kotlin.jvm.internal.t.e(obj, "getOrPut(...)");
        return ((wc.r) obj).p();
    }
}

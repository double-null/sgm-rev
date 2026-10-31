package je;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
final class y<T> implements y1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.p<pd.c<Object>, List<? extends pd.l>, fe.d<T>> f21039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<Class<?>, x1<T>> f21040b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(id.p<? super pd.c<Object>, ? super List<? extends pd.l>, ? extends fe.d<T>> compute) {
        kotlin.jvm.internal.t.f(compute, "compute");
        this.f21039a = compute;
        this.f21040b = new ConcurrentHashMap<>();
    }

    @Override // je.y1
    public Object a(pd.c<Object> key, List<? extends pd.l> types) {
        Object objC;
        x1<T> x1VarPutIfAbsent;
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(types, "types");
        ConcurrentHashMap<Class<?>, x1<T>> concurrentHashMap = this.f21040b;
        Class<?> clsA = hd.a.a(key);
        x1<T> x1Var = concurrentHashMap.get(clsA);
        if (x1Var == null && (x1VarPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (x1Var = new x1<>()))) != null) {
            x1Var = x1VarPutIfAbsent;
        }
        x1<T> x1Var2 = x1Var;
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(types, 10));
        Iterator<T> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new w0((pd.l) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = ((x1) x1Var2).f21035a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                wc.r.a aVar = wc.r.f27774b;
                objC = wc.r.c(this.f21039a.invoke(key, types));
            } catch (Throwable th) {
                wc.r.a aVar2 = wc.r.f27774b;
                objC = wc.r.c(wc.s.a(th));
            }
            wc.r rVarB = wc.r.b(objC);
            Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList, rVarB);
            obj = objPutIfAbsent == null ? rVarB : objPutIfAbsent;
        }
        kotlin.jvm.internal.t.e(obj, "getOrPut(...)");
        return ((wc.r) obj).p();
    }
}

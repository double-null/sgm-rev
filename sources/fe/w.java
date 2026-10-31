package fe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.a2;
import je.b1;
import je.n0;
import je.n2;
import je.p0;
import je.z0;
import je.z1;
import k9.dW.xjwcmjDeOXR;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class w {
    private static final d<? extends Object> b(pd.c<Object> cVar, List<? extends d<Object>> list, id.a<? extends pd.e> aVar) {
        if (kotlin.jvm.internal.t.a(cVar, i0.b(Collection.class)) || kotlin.jvm.internal.t.a(cVar, i0.b(List.class)) || kotlin.jvm.internal.t.a(cVar, i0.b(List.class)) || kotlin.jvm.internal.t.a(cVar, i0.b(ArrayList.class))) {
            return new je.f(list.get(0));
        }
        if (kotlin.jvm.internal.t.a(cVar, i0.b(HashSet.class))) {
            return new p0(list.get(0));
        }
        if (kotlin.jvm.internal.t.a(cVar, i0.b(Set.class)) || kotlin.jvm.internal.t.a(cVar, i0.b(Set.class)) || kotlin.jvm.internal.t.a(cVar, i0.b(LinkedHashSet.class))) {
            return new b1(list.get(0));
        }
        if (kotlin.jvm.internal.t.a(cVar, i0.b(HashMap.class))) {
            return new n0(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.t.a(cVar, i0.b(Map.class)) || kotlin.jvm.internal.t.a(cVar, i0.b(Map.class)) || kotlin.jvm.internal.t.a(cVar, i0.b(LinkedHashMap.class))) {
            return new z0(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.t.a(cVar, i0.b(Map.Entry.class))) {
            return ge.a.j(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.t.a(cVar, i0.b(wc.q.class))) {
            return ge.a.m(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.t.a(cVar, i0.b(wc.v.class))) {
            return ge.a.o(list.get(0), list.get(1), list.get(2));
        }
        if (!z1.o(cVar)) {
            return null;
        }
        pd.e eVarInvoke = aVar.invoke();
        kotlin.jvm.internal.t.d(eVarInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return ge.a.a((pd.c) eVarInvoke, list.get(0));
    }

    private static final d<? extends Object> c(pd.c<Object> cVar, List<? extends d<Object>> list) {
        d[] dVarArr = (d[]) list.toArray(new d[0]);
        return z1.d(cVar, (d[]) Arrays.copyOf(dVarArr, dVarArr.length));
    }

    private static final <T> d<T> d(d<T> dVar, boolean z10) {
        if (z10) {
            return ge.a.t(dVar);
        }
        kotlin.jvm.internal.t.d(dVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return dVar;
    }

    public static final d<Object> f(le.c cVar, pd.l type) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        kotlin.jvm.internal.t.f(type, "type");
        d<Object> dVarG = g(cVar, type, true);
        if (dVarG != null) {
            return dVarG;
        }
        z1.p(a2.c(type));
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    private static final d<Object> g(le.c cVar, pd.l lVar, boolean z10) {
        d<Object> dVarM;
        d<? extends Object> dVarB;
        h hVar;
        pd.c<Object> cVarC = a2.c(lVar);
        boolean zB = lVar.b();
        List<pd.m> listH = lVar.h();
        final ArrayList arrayList = new ArrayList(kotlin.collections.u.u(listH, 10));
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(a2.g((pd.m) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (!z1.l(cVarC) || le.c.c(cVar, cVarC, null, 2, null) == null) {
                dVarM = t.m(cVarC, zB);
            } else {
                dVarM = null;
            }
        } else if (cVar.d()) {
            dVarM = null;
        } else {
            Object objN = t.n(cVarC, arrayList, zB);
            if (wc.r.k(objN)) {
                objN = null;
            }
            dVarM = (d) objN;
        }
        if (dVarM != null) {
            return dVarM;
        }
        if (arrayList.isEmpty()) {
            dVarB = u.d(cVarC);
            if (dVarB == null && (dVarB = le.c.c(cVar, cVarC, null, 2, null)) == null) {
                if (z1.l(cVarC)) {
                    hVar = new h(cVarC);
                    dVarB = hVar;
                } else {
                    dVarB = null;
                }
            }
        } else {
            List<d<Object>> listE = u.e(cVar, arrayList, z10);
            if (listE == null) {
                return null;
            }
            d<? extends Object> dVarA = u.a(cVarC, listE, new id.a() { // from class: fe.v
                @Override // id.a
                public final Object invoke() {
                    return w.h(arrayList);
                }
            });
            if (dVarA == null) {
                dVarB = cVar.b(cVarC, listE);
                if (dVarB == null) {
                    if (z1.l(cVarC)) {
                        hVar = new h(cVarC);
                        dVarB = hVar;
                    } else {
                        dVarB = null;
                    }
                }
            } else {
                dVarB = dVarA;
            }
        }
        if (dVarB != null) {
            return d(dVarB, zB);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pd.e h(List list) {
        return ((pd.l) list.get(0)).c();
    }

    public static final d<Object> i(le.c cVar, pd.l type) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        kotlin.jvm.internal.t.f(type, "type");
        return g(cVar, type, false);
    }

    public static final <T> d<T> j(pd.c<T> cVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        d<T> dVarB = z1.b(cVar);
        return dVarB == null ? n2.b(cVar) : dVarB;
    }

    public static final List<d<Object>> k(le.c cVar, List<? extends pd.l> typeArguments, boolean z10) {
        ArrayList arrayList;
        kotlin.jvm.internal.t.f(cVar, "<this>");
        kotlin.jvm.internal.t.f(typeArguments, "typeArguments");
        if (z10) {
            arrayList = new ArrayList(kotlin.collections.u.u(typeArguments, 10));
            Iterator<T> it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(u.b(cVar, (pd.l) it.next()));
            }
        } else {
            arrayList = new ArrayList(kotlin.collections.u.u(typeArguments, 10));
            Iterator<T> it2 = typeArguments.iterator();
            while (it2.hasNext()) {
                d<Object> dVarC = u.c(cVar, (pd.l) it2.next());
                if (dVarC == null) {
                    return null;
                }
                arrayList.add(dVarC);
            }
        }
        return arrayList;
    }

    public static final d<? extends Object> e(pd.c<Object> cVar, List<? extends d<Object>> serializers, id.a<? extends pd.e> aVar) {
        kotlin.jvm.internal.t.f(cVar, "<this>");
        kotlin.jvm.internal.t.f(serializers, "serializers");
        kotlin.jvm.internal.t.f(aVar, xjwcmjDeOXR.SpG);
        d<? extends Object> dVarB = b(cVar, serializers, aVar);
        return dVarB == null ? c(cVar, serializers) : dVarB;
    }
}

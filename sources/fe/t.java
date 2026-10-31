package fe;

import java.util.List;
import je.r2;
import je.y1;
import je.z1;

/* JADX INFO: compiled from: SerializersCache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r2<? extends Object> f14973a = je.o.a(new id.l() { // from class: fe.n
        @Override // id.l
        public final Object invoke(Object obj) {
            return t.k((pd.c) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r2<Object> f14974b = je.o.a(new id.l() { // from class: fe.o
        @Override // id.l
        public final Object invoke(Object obj) {
            return t.l((pd.c) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y1<? extends Object> f14975c = je.o.b(new id.p() { // from class: fe.p
        @Override // id.p
        public final Object invoke(Object obj, Object obj2) {
            return t.g((pd.c) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y1<Object> f14976d = je.o.b(new id.p() { // from class: fe.q
        @Override // id.p
        public final Object invoke(Object obj, Object obj2) {
            return t.i((pd.c) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final d g(pd.c clazz, final List types) {
        kotlin.jvm.internal.t.f(clazz, "clazz");
        kotlin.jvm.internal.t.f(types, "types");
        List<d<Object>> listE = u.e(le.d.a(), types, true);
        kotlin.jvm.internal.t.c(listE);
        return u.a(clazz, listE, new id.a() { // from class: fe.r
            @Override // id.a
            public final Object invoke() {
                return t.h(types);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pd.e h(List list) {
        return ((pd.l) list.get(0)).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d i(pd.c clazz, final List types) {
        d dVarT;
        kotlin.jvm.internal.t.f(clazz, "clazz");
        kotlin.jvm.internal.t.f(types, "types");
        List<d<Object>> listE = u.e(le.d.a(), types, true);
        kotlin.jvm.internal.t.c(listE);
        d<? extends Object> dVarA = u.a(clazz, listE, new id.a() { // from class: fe.s
            @Override // id.a
            public final Object invoke() {
                return t.j(types);
            }
        });
        if (dVarA == null || (dVarT = ge.a.t(dVarA)) == null) {
            return null;
        }
        return dVarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pd.e j(List list) {
        return ((pd.l) list.get(0)).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d k(pd.c it) {
        kotlin.jvm.internal.t.f(it, "it");
        d dVarD = u.d(it);
        if (dVarD != null) {
            return dVarD;
        }
        if (z1.l(it)) {
            return new h(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d l(pd.c it) {
        d dVarT;
        kotlin.jvm.internal.t.f(it, "it");
        d dVarD = u.d(it);
        if (dVarD == null) {
            dVarD = z1.l(it) ? new h(it) : null;
        }
        if (dVarD == null || (dVarT = ge.a.t(dVarD)) == null) {
            return null;
        }
        return dVarT;
    }

    public static final d<Object> m(pd.c<Object> clazz, boolean z10) {
        kotlin.jvm.internal.t.f(clazz, "clazz");
        if (z10) {
            return f14974b.a(clazz);
        }
        d<? extends Object> dVarA = f14973a.a(clazz);
        if (dVarA != null) {
            return dVarA;
        }
        return null;
    }

    public static final Object n(pd.c<Object> clazz, List<? extends pd.l> types, boolean z10) {
        kotlin.jvm.internal.t.f(clazz, "clazz");
        kotlin.jvm.internal.t.f(types, "types");
        return !z10 ? f14975c.a(clazz, types) : f14976d.a(clazz, types);
    }
}

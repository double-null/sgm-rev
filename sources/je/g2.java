package je;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public class g2 implements he.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0<?> f20912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f20915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Annotation>[] f20916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Annotation> f20917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f20918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Integer> f20919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wc.k f20920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wc.k f20921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final wc.k f20922l;

    public g2(String serialName, l0<?> l0Var, int i10) {
        kotlin.jvm.internal.t.f(serialName, "serialName");
        this.f20911a = serialName;
        this.f20912b = l0Var;
        this.f20913c = i10;
        this.f20914d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f20915e = strArr;
        int i12 = this.f20913c;
        this.f20916f = new List[i12];
        this.f20918h = new boolean[i12];
        this.f20919i = kotlin.collections.o0.h();
        wc.o oVar = wc.o.PUBLICATION;
        this.f20920j = wc.m.b(oVar, new id.a() { // from class: je.c2
            @Override // id.a
            public final Object invoke() {
                return g2.s(this.f20878a);
            }
        });
        this.f20921k = wc.m.b(oVar, new id.a() { // from class: je.d2
            @Override // id.a
            public final Object invoke() {
                return g2.x(this.f20888a);
            }
        });
        this.f20922l = wc.m.b(oVar, new id.a() { // from class: je.e2
            @Override // id.a
            public final Object invoke() {
                return Integer.valueOf(g2.o(this.f20895a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(g2 g2Var) {
        return h2.a(g2Var, g2Var.u());
    }

    public static /* synthetic */ void q(g2 g2Var, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        g2Var.p(str, z10);
    }

    private final Map<String, Integer> r() {
        HashMap map = new HashMap();
        int length = this.f20915e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f20915e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fe.d[] s(g2 g2Var) {
        fe.d<?>[] dVarArrChildSerializers;
        l0<?> l0Var = g2Var.f20912b;
        return (l0Var == null || (dVarArrChildSerializers = l0Var.childSerializers()) == null) ? i2.f20941a : dVarArrChildSerializers;
    }

    private final fe.d<?>[] t() {
        return (fe.d[]) this.f20920j.getValue();
    }

    private final int v() {
        return ((Number) this.f20922l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence w(g2 g2Var, int i10) {
        return g2Var.f(i10) + ": " + g2Var.h(i10).i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f[] x(g2 g2Var) {
        ArrayList arrayList;
        fe.d<?>[] dVarArrTypeParametersSerializers;
        l0<?> l0Var = g2Var.f20912b;
        if (l0Var == null || (dVarArrTypeParametersSerializers = l0Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(dVarArrTypeParametersSerializers.length);
            for (fe.d<?> dVar : dVarArrTypeParametersSerializers) {
                arrayList.add(dVar.getDescriptor());
            }
        }
        return a2.b(arrayList);
    }

    @Override // je.n
    public Set<String> a() {
        return this.f20919i.keySet();
    }

    @Override // he.f
    public boolean b() {
        return he.f.a.c(this);
    }

    @Override // he.f
    public int c(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        Integer num = this.f20919i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // he.f
    public he.m d() {
        return he.n.a.f15864a;
    }

    @Override // he.f
    public final int e() {
        return this.f20913c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g2) {
            he.f fVar = (he.f) obj;
            if (kotlin.jvm.internal.t.a(i(), fVar.i()) && Arrays.equals(u(), ((g2) obj).u()) && e() == fVar.e()) {
                int iE = e();
                for (int i10 = 0; i10 < iE; i10++) {
                    if (kotlin.jvm.internal.t.a(h(i10).i(), fVar.h(i10).i()) && kotlin.jvm.internal.t.a(h(i10).d(), fVar.h(i10).d())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // he.f
    public String f(int i10) {
        return this.f20915e[i10];
    }

    @Override // he.f
    public List<Annotation> g(int i10) {
        List<Annotation> list = this.f20916f[i10];
        return list == null ? kotlin.collections.t.k() : list;
    }

    @Override // he.f
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f20917g;
        return list == null ? kotlin.collections.t.k() : list;
    }

    @Override // he.f
    public he.f h(int i10) {
        return t()[i10].getDescriptor();
    }

    public int hashCode() {
        return v();
    }

    @Override // he.f
    public String i() {
        return this.f20911a;
    }

    @Override // he.f
    public boolean isInline() {
        return he.f.a.b(this);
    }

    @Override // he.f
    public boolean j(int i10) {
        return this.f20918h[i10];
    }

    public final void p(String name, boolean z10) {
        kotlin.jvm.internal.t.f(name, "name");
        String[] strArr = this.f20915e;
        int i10 = this.f20914d + 1;
        this.f20914d = i10;
        strArr[i10] = name;
        this.f20918h[i10] = z10;
        this.f20916f[i10] = null;
        if (i10 == this.f20913c - 1) {
            this.f20919i = r();
        }
    }

    public String toString() {
        return kotlin.collections.b0.V(od.k.n(0, this.f20913c), ", ", i() + '(', ")", 0, null, new id.l() { // from class: je.f2
            @Override // id.l
            public final Object invoke(Object obj) {
                return g2.w(this.f20902a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public final he.f[] u() {
        return (he.f[]) this.f20921k.getValue();
    }

    public /* synthetic */ g2(String str, l0 l0Var, int i10, int i11, kotlin.jvm.internal.k kVar) {
        this(str, (i11 & 2) != 0 ? null : l0Var, i10);
    }
}

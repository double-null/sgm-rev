package he;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.a2;
import je.h2;
import kotlin.collections.b0;
import kotlin.collections.g0;
import kotlin.collections.o;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import wc.w;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i implements f, je.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f15845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Annotation> f15847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<String> f15848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f15849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f[] f15850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Annotation>[] f15851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f15852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, Integer> f15853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f[] f15854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final wc.k f15855l;

    public i(String serialName, m kind, int i10, List<? extends f> typeParameters, a builder) {
        t.f(serialName, "serialName");
        t.f(kind, "kind");
        t.f(typeParameters, "typeParameters");
        t.f(builder, "builder");
        this.f15844a = serialName;
        this.f15845b = kind;
        this.f15846c = i10;
        this.f15847d = builder.c();
        this.f15848e = b0.n0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f15849f = strArr;
        this.f15850g = a2.b(builder.e());
        this.f15851h = (List[]) builder.d().toArray(new List[0]);
        this.f15852i = b0.l0(builder.g());
        Iterable<g0> iterableZ = o.Z(strArr);
        ArrayList arrayList = new ArrayList(u.u(iterableZ, 10));
        for (g0 g0Var : iterableZ) {
            arrayList.add(w.a(g0Var.b(), Integer.valueOf(g0Var.a())));
        }
        this.f15853j = o0.q(arrayList);
        this.f15854k = a2.b(typeParameters);
        this.f15855l = wc.m.a(new id.a() { // from class: he.g
            @Override // id.a
            public final Object invoke() {
                return Integer.valueOf(i.m(this.f15842a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(i iVar) {
        return h2.a(iVar, iVar.f15854k);
    }

    private final int n() {
        return ((Number) this.f15855l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence o(i iVar, int i10) {
        return iVar.f(i10) + ": " + iVar.h(i10).i();
    }

    @Override // je.n
    public Set<String> a() {
        return this.f15848e;
    }

    @Override // he.f
    public boolean b() {
        return f.a.c(this);
    }

    @Override // he.f
    public int c(String name) {
        t.f(name, "name");
        Integer num = this.f15853j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // he.f
    public m d() {
        return this.f15845b;
    }

    @Override // he.f
    public int e() {
        return this.f15846c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            f fVar = (f) obj;
            if (t.a(i(), fVar.i()) && Arrays.equals(this.f15854k, ((i) obj).f15854k) && e() == fVar.e()) {
                int iE = e();
                for (int i10 = 0; i10 < iE; i10++) {
                    if (t.a(h(i10).i(), fVar.h(i10).i()) && t.a(h(i10).d(), fVar.h(i10).d())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // he.f
    public String f(int i10) {
        return this.f15849f[i10];
    }

    @Override // he.f
    public List<Annotation> g(int i10) {
        return this.f15851h[i10];
    }

    @Override // he.f
    public List<Annotation> getAnnotations() {
        return this.f15847d;
    }

    @Override // he.f
    public f h(int i10) {
        return this.f15850g[i10];
    }

    public int hashCode() {
        return n();
    }

    @Override // he.f
    public String i() {
        return this.f15844a;
    }

    @Override // he.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // he.f
    public boolean j(int i10) {
        return this.f15852i[i10];
    }

    public String toString() {
        return b0.V(od.k.n(0, e()), ", ", i() + '(', ")", 0, null, new id.l() { // from class: he.h
            @Override // id.l
            public final Object invoke(Object obj) {
                return i.o(this.f15843a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}

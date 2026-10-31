package ke;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes5.dex */
class s0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kotlinx.serialization.json.d0 f21414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final he.f f21415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21417j;

    public /* synthetic */ s0(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.d0 d0Var, String str, he.f fVar, int i10, kotlin.jvm.internal.k kVar) {
        this(bVar, d0Var, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : fVar);
    }

    private final boolean C0(he.f fVar, int i10) {
        boolean z10 = (d().e().j() || fVar.j(i10) || !fVar.h(i10).b()) ? false : true;
        this.f21417j = z10;
        return z10;
    }

    private final boolean D0(he.f fVar, int i10, String str) {
        kotlinx.serialization.json.b bVarD = d();
        boolean zJ = fVar.j(i10);
        he.f fVarH = fVar.h(i10);
        if (zJ && !fVarH.b() && (l0(str) instanceof kotlinx.serialization.json.a0)) {
            return true;
        }
        if (kotlin.jvm.internal.t.a(fVarH.d(), he.m.b.f15863a) && (!fVarH.b() || !(l0(str) instanceof kotlinx.serialization.json.a0))) {
            kotlinx.serialization.json.i iVarL0 = l0(str);
            kotlinx.serialization.json.g0 g0Var = iVarL0 instanceof kotlinx.serialization.json.g0 ? (kotlinx.serialization.json.g0) iVarL0 : null;
            String strF = g0Var != null ? kotlinx.serialization.json.k.f(g0Var) : null;
            if (strF != null) {
                int i11 = m0.i(fVarH, bVarD, strF);
                boolean z10 = !bVarD.e().j() && fVarH.b();
                if (i11 == -3 && (zJ || z10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ke.c, ie.e
    public boolean B() {
        return !this.f21417j && super.B();
    }

    @Override // ke.c
    /* JADX INFO: renamed from: E0 */
    public kotlinx.serialization.json.d0 z0() {
        return this.f21414g;
    }

    @Override // ke.c, ie.e
    public ie.c b(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        if (descriptor != this.f21415h) {
            return super.b(descriptor);
        }
        kotlinx.serialization.json.b bVarD = d();
        kotlinx.serialization.json.i iVarM0 = m0();
        String strI = this.f21415h.i();
        if (iVarM0 instanceof kotlinx.serialization.json.d0) {
            return new s0(bVarD, (kotlinx.serialization.json.d0) iVarM0, y0(), this.f21415h);
        }
        throw k0.f(-1, "Expected " + kotlin.jvm.internal.i0.b(kotlinx.serialization.json.d0.class).g() + ", but had " + kotlin.jvm.internal.i0.b(iVarM0.getClass()).g() + " as the serialized body of " + strI + " at element: " + i0(), iVarM0.toString());
    }

    @Override // ke.c, ie.c
    public void c(he.f descriptor) {
        Set<String> setJ;
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        if (this.f21331f.k() || (descriptor.d() instanceof he.d)) {
            return;
        }
        m0.m(descriptor, d());
        if (this.f21331f.o()) {
            Set<String> setA = je.v0.a(descriptor);
            Map map = (Map) kotlinx.serialization.json.i0.a(d()).a(descriptor, m0.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = kotlin.collections.u0.e();
            }
            setJ = kotlin.collections.v0.j(setA, setKeySet);
        } else {
            setJ = je.v0.a(descriptor);
        }
        for (String str : z0().keySet()) {
            if (!setJ.contains(str) && !kotlin.jvm.internal.t.a(str, y0())) {
                throw k0.g(str, z0().toString());
            }
        }
    }

    @Override // ie.c
    public int f(he.f descriptor) {
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        while (this.f21416i < descriptor.e()) {
            int i10 = this.f21416i;
            this.f21416i = i10 + 1;
            String strZ = Z(descriptor, i10);
            int i11 = this.f21416i - 1;
            this.f21417j = false;
            if (z0().containsKey(strZ) || C0(descriptor, i11)) {
                if (!this.f21331f.g() || !D0(descriptor, i11, strZ)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @Override // je.m1
    protected String f0(he.f descriptor, int i10) {
        Object next;
        Integer num;
        kotlin.jvm.internal.t.f(descriptor, "descriptor");
        m0.m(descriptor, d());
        String strF = descriptor.f(i10);
        if (!this.f21331f.o() || z0().keySet().contains(strF)) {
            return strF;
        }
        Map<String, Integer> mapE = m0.e(d(), descriptor);
        Iterator<T> it = z0().keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            num = mapE.get((String) next);
        } while (!(num != null && num.intValue() == i10));
        String str = (String) next;
        return str != null ? str : strF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.c
    public kotlinx.serialization.json.i l0(String tag) {
        kotlin.jvm.internal.t.f(tag, "tag");
        return (kotlinx.serialization.json.i) kotlin.collections.o0.i(z0(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kotlinx.serialization.json.b json, kotlinx.serialization.json.d0 value, String str, he.f fVar) {
        super(json, value, str, null);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(value, "value");
        this.f21414g = value;
        this.f21415h = fVar;
    }
}

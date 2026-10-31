package he;

import be.LNO.fzLzfW;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f15822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f15823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<String> f15824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<f> f15825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<List<Annotation>> f15826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<Boolean> f15827g;

    public a(String serialName) {
        t.f(serialName, "serialName");
        this.f15821a = serialName;
        this.f15822b = kotlin.collections.t.k();
        this.f15823c = new ArrayList();
        this.f15824d = new HashSet();
        this.f15825e = new ArrayList();
        this.f15826f = new ArrayList();
        this.f15827g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = kotlin.collections.t.k();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    public final List<Annotation> c() {
        return this.f15822b;
    }

    public final List<List<Annotation>> d() {
        return this.f15826f;
    }

    public final List<f> e() {
        return this.f15825e;
    }

    public final List<String> f() {
        return this.f15823c;
    }

    public final List<Boolean> g() {
        return this.f15827g;
    }

    public final void h(List<? extends Annotation> list) {
        t.f(list, "<set-?>");
        this.f15822b = list;
    }

    public final void a(String elementName, f descriptor, List<? extends Annotation> list, boolean z10) {
        t.f(elementName, "elementName");
        t.f(descriptor, "descriptor");
        t.f(list, fzLzfW.uvUZgAtELH);
        if (this.f15824d.add(elementName)) {
            this.f15823c.add(elementName);
            this.f15825e.add(descriptor);
            this.f15826f.add(list);
            this.f15827g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f15821a).toString());
    }
}

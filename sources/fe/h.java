package fe;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.l0;
import wc.g0;

/* JADX INFO: compiled from: PolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h<T> extends je.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.c<T> f14964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<? extends Annotation> f14965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wc.k f14966c;

    public h(pd.c<T> baseClass) {
        kotlin.jvm.internal.t.f(baseClass, "baseClass");
        this.f14964a = baseClass;
        this.f14965b = kotlin.collections.t.k();
        this.f14966c = wc.m.b(wc.o.PUBLICATION, new id.a() { // from class: fe.f
            @Override // id.a
            public final Object invoke() {
                return h.h(this.f14962a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f h(final h hVar) {
        return he.b.c(he.l.d("kotlinx.serialization.Polymorphic", he.d.a.f15831a, new he.f[0], new id.l() { // from class: fe.g
            @Override // id.l
            public final Object invoke(Object obj) {
                return h.i(this.f14963a, (he.a) obj);
            }
        }), hVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 i(h hVar, he.a buildSerialDescriptor) {
        kotlin.jvm.internal.t.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
        he.a.b(buildSerialDescriptor, "type", ge.a.C(l0.f21527a).getDescriptor(), null, false, 12, null);
        he.a.b(buildSerialDescriptor, "value", he.l.e("kotlinx.serialization.Polymorphic<" + hVar.e().g() + '>', he.m.a.f15862a, new he.f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.h(hVar.f14965b);
        return g0.f27756a;
    }

    @Override // je.b
    public pd.c<T> e() {
        return this.f14964a;
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return (he.f) this.f14966c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + e() + ')';
    }
}

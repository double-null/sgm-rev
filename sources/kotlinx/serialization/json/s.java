package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements he.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wc.k f21608a;

        a(id.a<? extends he.f> aVar) {
            this.f21608a = wc.m.a(aVar);
        }

        private final he.f a() {
            return (he.f) this.f21608a.getValue();
        }

        @Override // he.f
        public boolean b() {
            return he.f.a.c(this);
        }

        @Override // he.f
        public int c(String name) {
            kotlin.jvm.internal.t.f(name, "name");
            return a().c(name);
        }

        @Override // he.f
        public he.m d() {
            return a().d();
        }

        @Override // he.f
        public int e() {
            return a().e();
        }

        @Override // he.f
        public String f(int i10) {
            return a().f(i10);
        }

        @Override // he.f
        public List<Annotation> g(int i10) {
            return a().g(i10);
        }

        @Override // he.f
        public List<Annotation> getAnnotations() {
            return he.f.a.a(this);
        }

        @Override // he.f
        public he.f h(int i10) {
            return a().h(i10);
        }

        @Override // he.f
        public String i() {
            return a().i();
        }

        @Override // he.f
        public boolean isInline() {
            return he.f.a.b(this);
        }

        @Override // he.f
        public boolean j(int i10) {
            return a().j(i10);
        }
    }

    public static final h d(ie.e eVar) {
        kotlin.jvm.internal.t.f(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kotlin.jvm.internal.i0.b(eVar.getClass()));
    }

    public static final t e(ie.f fVar) {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        t tVar = fVar instanceof t ? (t) fVar : null;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kotlin.jvm.internal.i0.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.f f(id.a<? extends he.f> aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ie.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ie.f fVar) {
        e(fVar);
    }
}

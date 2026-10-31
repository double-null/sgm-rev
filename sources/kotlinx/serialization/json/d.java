package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements fe.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21558a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21559b = a.f21560b;

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    private static final class a implements he.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f21560b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f21561c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ he.f f21562a = ge.a.h(r.f21606a).getDescriptor();

        private a() {
        }

        @Override // he.f
        public boolean b() {
            return this.f21562a.b();
        }

        @Override // he.f
        public int c(String name) {
            kotlin.jvm.internal.t.f(name, "name");
            return this.f21562a.c(name);
        }

        @Override // he.f
        public he.m d() {
            return this.f21562a.d();
        }

        @Override // he.f
        public int e() {
            return this.f21562a.e();
        }

        @Override // he.f
        public String f(int i10) {
            return this.f21562a.f(i10);
        }

        @Override // he.f
        public List<Annotation> g(int i10) {
            return this.f21562a.g(i10);
        }

        @Override // he.f
        public List<Annotation> getAnnotations() {
            return this.f21562a.getAnnotations();
        }

        @Override // he.f
        public he.f h(int i10) {
            return this.f21562a.h(i10);
        }

        @Override // he.f
        public String i() {
            return f21561c;
        }

        @Override // he.f
        public boolean isInline() {
            return this.f21562a.isInline();
        }

        @Override // he.f
        public boolean j(int i10) {
            return this.f21562a.j(i10);
        }
    }

    private d() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        s.g(decoder);
        return new c((List) ge.a.h(r.f21606a).deserialize(decoder));
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, c value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        s.h(encoder);
        ge.a.h(r.f21606a).serialize(encoder, value);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21559b;
    }
}

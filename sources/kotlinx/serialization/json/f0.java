package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 implements fe.d<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f21582a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final he.f f21583b = a.f21584b;

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    private static final class a implements he.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f21584b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f21585c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ he.f f21586a = ge.a.k(ge.a.C(l0.f21527a), r.f21606a).getDescriptor();

        private a() {
        }

        @Override // he.f
        public boolean b() {
            return this.f21586a.b();
        }

        @Override // he.f
        public int c(String name) {
            kotlin.jvm.internal.t.f(name, "name");
            return this.f21586a.c(name);
        }

        @Override // he.f
        public he.m d() {
            return this.f21586a.d();
        }

        @Override // he.f
        public int e() {
            return this.f21586a.e();
        }

        @Override // he.f
        public String f(int i10) {
            return this.f21586a.f(i10);
        }

        @Override // he.f
        public List<Annotation> g(int i10) {
            return this.f21586a.g(i10);
        }

        @Override // he.f
        public List<Annotation> getAnnotations() {
            return this.f21586a.getAnnotations();
        }

        @Override // he.f
        public he.f h(int i10) {
            return this.f21586a.h(i10);
        }

        @Override // he.f
        public String i() {
            return f21585c;
        }

        @Override // he.f
        public boolean isInline() {
            return this.f21586a.isInline();
        }

        @Override // he.f
        public boolean j(int i10) {
            return this.f21586a.j(i10);
        }
    }

    private f0() {
    }

    @Override // fe.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d0 deserialize(ie.e decoder) {
        kotlin.jvm.internal.t.f(decoder, "decoder");
        s.g(decoder);
        return new d0((Map) ge.a.k(ge.a.C(l0.f21527a), r.f21606a).deserialize(decoder));
    }

    @Override // fe.m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(ie.f encoder, d0 value) {
        kotlin.jvm.internal.t.f(encoder, "encoder");
        kotlin.jvm.internal.t.f(value, "value");
        s.h(encoder);
        ge.a.k(ge.a.C(l0.f21527a), r.f21606a).serialize(encoder, value);
    }

    @Override // fe.d, fe.m, fe.c
    public he.f getDescriptor() {
        return f21583b;
    }
}

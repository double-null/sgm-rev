package d3;

import java.io.IOException;

/* JADX INFO: compiled from: AutoRolloutAssignmentEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements p3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.a f13247a = new a();

    /* JADX INFO: renamed from: d3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoRolloutAssignmentEncoder.java */
    private static final class C0174a implements o3.c<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0174a f13248a = new C0174a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13249b = o3.b.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13250c = o3.b.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f13251d = o3.b.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f13252e = o3.b.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f13253f = o3.b.d("templateVersion");

        private C0174a() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, o3.d dVar) throws IOException {
            dVar.f(f13249b, jVar.e());
            dVar.f(f13250c, jVar.c());
            dVar.f(f13251d, jVar.d());
            dVar.f(f13252e, jVar.g());
            dVar.b(f13253f, jVar.f());
        }
    }

    private a() {
    }

    @Override // p3.a
    public void a(p3.b<?> bVar) {
        C0174a c0174a = C0174a.f13248a;
        bVar.a(j.class, c0174a);
        bVar.a(b.class, c0174a);
    }
}

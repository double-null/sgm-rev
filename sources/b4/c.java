package b4;

import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements p3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.a f3886a = new c();

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    private static final class a implements o3.c<b4.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f3887a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f3888b = o3.b.d("packageName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f3889c = o3.b.d("versionName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f3890d = o3.b.d("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f3891e = o3.b.d("deviceManufacturer");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f3892f = o3.b.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f3893g = o3.b.d("appProcessDetails");

        private a() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b4.a aVar, o3.d dVar) throws IOException {
            dVar.f(f3888b, aVar.e());
            dVar.f(f3889c, aVar.f());
            dVar.f(f3890d, aVar.a());
            dVar.f(f3891e, aVar.d());
            dVar.f(f3892f, aVar.c());
            dVar.f(f3893g, aVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    private static final class b implements o3.c<b4.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f3894a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f3895b = o3.b.d("appId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f3896c = o3.b.d("deviceModel");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f3897d = o3.b.d("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f3898e = o3.b.d("osVersion");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f3899f = o3.b.d("logEnvironment");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f3900g = o3.b.d("androidAppInfo");

        private b() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b4.b bVar, o3.d dVar) throws IOException {
            dVar.f(f3895b, bVar.b());
            dVar.f(f3896c, bVar.c());
            dVar.f(f3897d, bVar.f());
            dVar.f(f3898e, bVar.e());
            dVar.f(f3899f, bVar.d());
            dVar.f(f3900g, bVar.a());
        }
    }

    /* JADX INFO: renamed from: b4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    private static final class C0080c implements o3.c<b4.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0080c f3901a = new C0080c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f3902b = o3.b.d("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f3903c = o3.b.d("crashlytics");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f3904d = o3.b.d("sessionSamplingRate");

        private C0080c() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b4.e eVar, o3.d dVar) throws IOException {
            dVar.f(f3902b, eVar.b());
            dVar.f(f3903c, eVar.a());
            dVar.a(f3904d, eVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    private static final class d implements o3.c<d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f3905a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f3906b = o3.b.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f3907c = o3.b.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f3908d = o3.b.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f3909e = o3.b.d("defaultProcess");

        private d() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d0 d0Var, o3.d dVar) throws IOException {
            dVar.f(f3906b, d0Var.c());
            dVar.c(f3907c, d0Var.b());
            dVar.c(f3908d, d0Var.a());
            dVar.d(f3909e, d0Var.d());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    private static final class e implements o3.c<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f3910a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f3911b = o3.b.d("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f3912c = o3.b.d("sessionData");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f3913d = o3.b.d("applicationInfo");

        private e() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(k0 k0Var, o3.d dVar) throws IOException {
            dVar.f(f3911b, k0Var.b());
            dVar.f(f3912c, k0Var.c());
            dVar.f(f3913d, k0Var.a());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    private static final class f implements o3.c<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f3914a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f3915b = o3.b.d("sessionId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f3916c = o3.b.d("firstSessionId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f3917d = o3.b.d("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f3918e = o3.b.d("eventTimestampUs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f3919f = o3.b.d("dataCollectionStatus");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f3920g = o3.b.d("firebaseInstallationId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f3921h = o3.b.d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(r0 r0Var, o3.d dVar) throws IOException {
            dVar.f(f3915b, r0Var.f());
            dVar.f(f3916c, r0Var.e());
            dVar.c(f3917d, r0Var.g());
            dVar.b(f3918e, r0Var.b());
            dVar.f(f3919f, r0Var.a());
            dVar.f(f3920g, r0Var.d());
            dVar.f(f3921h, r0Var.c());
        }
    }

    private c() {
    }

    @Override // p3.a
    public void a(p3.b<?> bVar) {
        bVar.a(k0.class, e.f3910a);
        bVar.a(r0.class, f.f3914a);
        bVar.a(b4.e.class, C0080c.f3901a);
        bVar.a(b4.b.class, b.f3894a);
        bVar.a(b4.a.class, a.f3887a);
        bVar.a(d0.class, d.f3905a);
    }
}

package c2;

import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.io.IOException;

/* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.a f4517a = new b();

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class a implements o3.c<c2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f4518a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4519b = o3.b.d("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f4520c = o3.b.d(DeviceRequestsHelper.DEVICE_INFO_MODEL);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f4521d = o3.b.d("hardware");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f4522e = o3.b.d(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f4523f = o3.b.d(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f4524g = o3.b.d("osBuild");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f4525h = o3.b.d("manufacturer");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final o3.b f4526i = o3.b.d("fingerprint");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final o3.b f4527j = o3.b.d("locale");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final o3.b f4528k = o3.b.d(UserDataStore.COUNTRY);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final o3.b f4529l = o3.b.d("mccMnc");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final o3.b f4530m = o3.b.d("applicationBuild");

        private a() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(c2.a aVar, o3.d dVar) throws IOException {
            dVar.f(f4519b, aVar.m());
            dVar.f(f4520c, aVar.j());
            dVar.f(f4521d, aVar.f());
            dVar.f(f4522e, aVar.d());
            dVar.f(f4523f, aVar.l());
            dVar.f(f4524g, aVar.k());
            dVar.f(f4525h, aVar.h());
            dVar.f(f4526i, aVar.e());
            dVar.f(f4527j, aVar.g());
            dVar.f(f4528k, aVar.c());
            dVar.f(f4529l, aVar.i());
            dVar.f(f4530m, aVar.b());
        }
    }

    /* JADX INFO: renamed from: c2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class C0094b implements o3.c<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0094b f4531a = new C0094b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4532b = o3.b.d("logRequest");

        private C0094b() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, o3.d dVar) throws IOException {
            dVar.f(f4532b, nVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class c implements o3.c<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f4533a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4534b = o3.b.d("clientType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f4535c = o3.b.d("androidClientInfo");

        private c() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o oVar, o3.d dVar) throws IOException {
            dVar.f(f4534b, oVar.c());
            dVar.f(f4535c, oVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class d implements o3.c<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f4536a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4537b = o3.b.d("privacyContext");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f4538c = o3.b.d("productIdOrigin");

        private d() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, o3.d dVar) throws IOException {
            dVar.f(f4537b, pVar.b());
            dVar.f(f4538c, pVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class e implements o3.c<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f4539a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4540b = o3.b.d("clearBlob");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f4541c = o3.b.d("encryptedBlob");

        private e() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q qVar, o3.d dVar) throws IOException {
            dVar.f(f4540b, qVar.b());
            dVar.f(f4541c, qVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class f implements o3.c<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f4542a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4543b = o3.b.d("originAssociatedProductId");

        private f() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, o3.d dVar) throws IOException {
            dVar.f(f4543b, rVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class g implements o3.c<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f4544a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4545b = o3.b.d("prequest");

        private g() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s sVar, o3.d dVar) throws IOException {
            dVar.f(f4545b, sVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class h implements o3.c<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f4546a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4547b = o3.b.d("eventTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f4548c = o3.b.d("eventCode");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f4549d = o3.b.d("complianceData");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f4550e = o3.b.d("eventUptimeMs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f4551f = o3.b.d("sourceExtension");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f4552g = o3.b.d("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f4553h = o3.b.d("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final o3.b f4554i = o3.b.d("networkConnectionInfo");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final o3.b f4555j = o3.b.d("experimentIds");

        private h() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, o3.d dVar) throws IOException {
            dVar.b(f4547b, tVar.d());
            dVar.f(f4548c, tVar.c());
            dVar.f(f4549d, tVar.b());
            dVar.b(f4550e, tVar.e());
            dVar.f(f4551f, tVar.h());
            dVar.f(f4552g, tVar.i());
            dVar.b(f4553h, tVar.j());
            dVar.f(f4554i, tVar.g());
            dVar.f(f4555j, tVar.f());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class i implements o3.c<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i f4556a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4557b = o3.b.d("requestTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f4558c = o3.b.d("requestUptimeMs");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f4559d = o3.b.d("clientInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f4560e = o3.b.d("logSource");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f4561f = o3.b.d("logSourceName");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f4562g = o3.b.d("logEvent");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f4563h = o3.b.d("qosTier");

        private i() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, o3.d dVar) throws IOException {
            dVar.b(f4557b, uVar.g());
            dVar.b(f4558c, uVar.h());
            dVar.f(f4559d, uVar.b());
            dVar.f(f4560e, uVar.d());
            dVar.f(f4561f, uVar.e());
            dVar.f(f4562g, uVar.c());
            dVar.f(f4563h, uVar.f());
        }
    }

    /* JADX INFO: compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class j implements o3.c<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f4564a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f4565b = o3.b.d("networkType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f4566c = o3.b.d("mobileSubtype");

        private j() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, o3.d dVar) throws IOException {
            dVar.f(f4565b, wVar.c());
            dVar.f(f4566c, wVar.b());
        }
    }

    private b() {
    }

    @Override // p3.a
    public void a(p3.b<?> bVar) {
        C0094b c0094b = C0094b.f4531a;
        bVar.a(n.class, c0094b);
        bVar.a(c2.d.class, c0094b);
        i iVar = i.f4556a;
        bVar.a(u.class, iVar);
        bVar.a(k.class, iVar);
        c cVar = c.f4533a;
        bVar.a(o.class, cVar);
        bVar.a(c2.e.class, cVar);
        a aVar = a.f4518a;
        bVar.a(c2.a.class, aVar);
        bVar.a(c2.c.class, aVar);
        h hVar = h.f4546a;
        bVar.a(t.class, hVar);
        bVar.a(c2.j.class, hVar);
        d dVar = d.f4536a;
        bVar.a(p.class, dVar);
        bVar.a(c2.f.class, dVar);
        g gVar = g.f4544a;
        bVar.a(s.class, gVar);
        bVar.a(c2.i.class, gVar);
        f fVar = f.f4542a;
        bVar.a(r.class, fVar);
        bVar.a(c2.h.class, fVar);
        j jVar = j.f4564a;
        bVar.a(w.class, jVar);
        bVar.a(m.class, jVar);
        e eVar = e.f4539a;
        bVar.a(q.class, eVar);
        bVar.a(c2.g.class, eVar);
    }
}

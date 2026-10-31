package e3;

import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareInternalUtility;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.io.IOException;

/* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements p3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.a f13953a = new a();

    /* JADX INFO: renamed from: e3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class C0195a implements o3.c<h0.a.AbstractC0197a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0195a f13954a = new C0195a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13955b = o3.b.d("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13956c = o3.b.d("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f13957d = o3.b.d("buildId");

        private C0195a() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.a.AbstractC0197a abstractC0197a, o3.d dVar) throws IOException {
            dVar.f(f13955b, abstractC0197a.b());
            dVar.f(f13956c, abstractC0197a.d());
            dVar.f(f13957d, abstractC0197a.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class a0 implements o3.c<h0.f.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a0 f13958a = new a0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13959b = o3.b.d("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13960c = o3.b.d(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f13961d = o3.b.d("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f13962e = o3.b.d("jailbroken");

        private a0() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.e eVar, o3.d dVar) throws IOException {
            dVar.c(f13959b, eVar.c());
            dVar.f(f13960c, eVar.d());
            dVar.f(f13961d, eVar.b());
            dVar.d(f13962e, eVar.e());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class b implements o3.c<h0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f13963a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13964b = o3.b.d("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13965c = o3.b.d("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f13966d = o3.b.d("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f13967e = o3.b.d("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f13968f = o3.b.d("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f13969g = o3.b.d(UyXgnuLGEkgnZE.pETjwsdwjyR);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f13970h = o3.b.d(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final o3.b f13971i = o3.b.d("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final o3.b f13972j = o3.b.d("buildIdMappingForArch");

        private b() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.a aVar, o3.d dVar) throws IOException {
            dVar.c(f13964b, aVar.d());
            dVar.f(f13965c, aVar.e());
            dVar.c(f13966d, aVar.g());
            dVar.c(f13967e, aVar.c());
            dVar.b(f13968f, aVar.f());
            dVar.b(f13969g, aVar.h());
            dVar.b(f13970h, aVar.i());
            dVar.f(f13971i, aVar.j());
            dVar.f(f13972j, aVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class b0 implements o3.c<h0.f.AbstractC0213f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b0 f13973a = new b0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13974b = o3.b.d("identifier");

        private b0() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.AbstractC0213f abstractC0213f, o3.d dVar) throws IOException {
            dVar.f(f13974b, abstractC0213f.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class c implements o3.c<h0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f13975a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13976b = o3.b.d(SDKConstants.PARAM_KEY);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13977c = o3.b.d("value");

        private c() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.c cVar, o3.d dVar) throws IOException {
            dVar.f(f13976b, cVar.b());
            dVar.f(f13977c, cVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class d implements o3.c<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f13978a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13979b = o3.b.d("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13980c = o3.b.d("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f13981d = o3.b.d("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f13982e = o3.b.d("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f13983f = o3.b.d("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f13984g = o3.b.d("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f13985h = o3.b.d("appQualitySessionId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final o3.b f13986i = o3.b.d("buildVersion");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final o3.b f13987j = o3.b.d("displayVersion");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final o3.b f13988k = o3.b.d("session");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final o3.b f13989l = o3.b.d("ndkPayload");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final o3.b f13990m = o3.b.d("appExitInfo");

        private d() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0 h0Var, o3.d dVar) throws IOException {
            dVar.f(f13979b, h0Var.m());
            dVar.f(f13980c, h0Var.i());
            dVar.c(f13981d, h0Var.l());
            dVar.f(f13982e, h0Var.j());
            dVar.f(f13983f, h0Var.h());
            dVar.f(f13984g, h0Var.g());
            dVar.f(f13985h, h0Var.d());
            dVar.f(f13986i, h0Var.e());
            dVar.f(f13987j, h0Var.f());
            dVar.f(f13988k, h0Var.n());
            dVar.f(f13989l, h0Var.k());
            dVar.f(f13990m, h0Var.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class e implements o3.c<h0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f13991a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13992b = o3.b.d("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13993c = o3.b.d("orgId");

        private e() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.d dVar, o3.d dVar2) throws IOException {
            dVar2.f(f13992b, dVar.b());
            dVar2.f(f13993c, dVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class f implements o3.c<h0.d.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f13994a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13995b = o3.b.d("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f13996c = o3.b.d("contents");

        private f() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.d.b bVar, o3.d dVar) throws IOException {
            dVar.f(f13995b, bVar.c());
            dVar.f(f13996c, bVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class g implements o3.c<h0.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f13997a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f13998b = o3.b.d("profilingTrigger");

        private g() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.e eVar, o3.d dVar) throws IOException {
            dVar.f(f13998b, eVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class h implements o3.c<h0.e.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f13999a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14000b = o3.b.d("trigger");

        private h() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.e.b bVar, o3.d dVar) throws IOException {
            dVar.c(f14000b, bVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class i implements o3.c<h0.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i f14001a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14002b = o3.b.d("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14003c = o3.b.d(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14004d = o3.b.d("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14005e = o3.b.d("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14006f = o3.b.d("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f14007g = o3.b.d("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f14008h = o3.b.d("developmentPlatformVersion");

        private i() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.a aVar, o3.d dVar) throws IOException {
            dVar.f(f14002b, aVar.e());
            dVar.f(f14003c, aVar.h());
            dVar.f(f14004d, aVar.d());
            dVar.f(f14005e, aVar.g());
            dVar.f(f14006f, aVar.f());
            dVar.f(f14007g, aVar.b());
            dVar.f(f14008h, aVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class j implements o3.c<h0.f.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f14009a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14010b = o3.b.d("clsId");

        private j() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.a.b bVar, o3.d dVar) throws IOException {
            dVar.f(f14010b, bVar.a());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class k implements o3.c<h0.f.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f14011a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14012b = o3.b.d("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14013c = o3.b.d(DeviceRequestsHelper.DEVICE_INFO_MODEL);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14014d = o3.b.d("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14015e = o3.b.d("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14016f = o3.b.d("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f14017g = o3.b.d("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f14018h = o3.b.d(ServerProtocol.DIALOG_PARAM_STATE);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final o3.b f14019i = o3.b.d("manufacturer");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final o3.b f14020j = o3.b.d("modelClass");

        private k() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.c cVar, o3.d dVar) throws IOException {
            dVar.c(f14012b, cVar.b());
            dVar.f(f14013c, cVar.f());
            dVar.c(f14014d, cVar.c());
            dVar.b(f14015e, cVar.h());
            dVar.b(f14016f, cVar.d());
            dVar.d(f14017g, cVar.j());
            dVar.c(f14018h, cVar.i());
            dVar.f(f14019i, cVar.e());
            dVar.f(f14020j, cVar.g());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class l implements o3.c<h0.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f14021a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14022b = o3.b.d("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14023c = o3.b.d("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14024d = o3.b.d("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14025e = o3.b.d("startedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14026f = o3.b.d("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f14027g = o3.b.d("crashed");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f14028h = o3.b.d("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final o3.b f14029i = o3.b.d("user");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final o3.b f14030j = o3.b.d("os");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final o3.b f14031k = o3.b.d(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final o3.b f14032l = o3.b.d("events");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final o3.b f14033m = o3.b.d("generatorType");

        private l() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f fVar, o3.d dVar) throws IOException {
            dVar.f(f14022b, fVar.g());
            dVar.f(f14023c, fVar.j());
            dVar.f(f14024d, fVar.c());
            dVar.b(f14025e, fVar.l());
            dVar.f(f14026f, fVar.e());
            dVar.d(f14027g, fVar.n());
            dVar.f(f14028h, fVar.b());
            dVar.f(f14029i, fVar.m());
            dVar.f(f14030j, fVar.k());
            dVar.f(f14031k, fVar.d());
            dVar.f(f14032l, fVar.f());
            dVar.c(f14033m, fVar.h());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class m implements o3.c<h0.f.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f14034a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14035b = o3.b.d("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14036c = o3.b.d("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14037d = o3.b.d(CwEo.WQzzAgtvnxAZ);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14038e = o3.b.d("background");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14039f = o3.b.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f14040g = o3.b.d("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final o3.b f14041h = o3.b.d("uiOrientation");

        private m() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a aVar, o3.d dVar) throws IOException {
            dVar.f(f14035b, aVar.f());
            dVar.f(f14036c, aVar.e());
            dVar.f(f14037d, aVar.g());
            dVar.f(f14038e, aVar.c());
            dVar.f(f14039f, aVar.d());
            dVar.f(f14040g, aVar.b());
            dVar.c(f14041h, aVar.h());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class n implements o3.c<h0.f.d.a.b.AbstractC0201a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final n f14042a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14043b = o3.b.d("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14044c = o3.b.d("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14045d = o3.b.d("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14046e = o3.b.d("uuid");

        private n() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a.b.AbstractC0201a abstractC0201a, o3.d dVar) throws IOException {
            dVar.b(f14043b, abstractC0201a.b());
            dVar.b(f14044c, abstractC0201a.d());
            dVar.f(f14045d, abstractC0201a.c());
            dVar.f(f14046e, abstractC0201a.f());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class o implements o3.c<h0.f.d.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f14047a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14048b = o3.b.d("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14049c = o3.b.d("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14050d = o3.b.d("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14051e = o3.b.d("profilingManagerInfo");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14052f = o3.b.d("signal");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f14053g = o3.b.d("binaries");

        private o() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a.b bVar, o3.d dVar) throws IOException {
            dVar.f(f14048b, bVar.g());
            dVar.f(f14049c, bVar.d());
            dVar.f(f14050d, bVar.b());
            dVar.f(f14051e, bVar.e());
            dVar.f(f14052f, bVar.f());
            dVar.f(f14053g, bVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class p implements o3.c<h0.f.d.a.b.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final p f14054a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14055b = o3.b.d("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14056c = o3.b.d("reason");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14057d = o3.b.d("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14058e = o3.b.d("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14059f = o3.b.d("overflowCount");

        private p() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a.b.c cVar, o3.d dVar) throws IOException {
            dVar.f(f14055b, cVar.f());
            dVar.f(f14056c, cVar.e());
            dVar.f(f14057d, cVar.c());
            dVar.f(f14058e, cVar.b());
            dVar.c(f14059f, cVar.d());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class q implements o3.c<h0.f.d.a.b.AbstractC0205d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f14060a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14061b = o3.b.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14062c = o3.b.d("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14063d = o3.b.d(IntegrityManager.INTEGRITY_TYPE_ADDRESS);

        private q() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a.b.AbstractC0205d abstractC0205d, o3.d dVar) throws IOException {
            dVar.f(f14061b, abstractC0205d.d());
            dVar.f(f14062c, abstractC0205d.c());
            dVar.b(f14063d, abstractC0205d.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class r implements o3.c<h0.f.d.a.b.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final r f14064a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14065b = o3.b.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14066c = o3.b.d("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14067d = o3.b.d("frames");

        private r() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a.b.e eVar, o3.d dVar) throws IOException {
            dVar.f(f14065b, eVar.d());
            dVar.c(f14066c, eVar.c());
            dVar.f(f14067d, eVar.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class s implements o3.c<h0.f.d.a.b.e.AbstractC0208b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s f14068a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14069b = o3.b.d("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14070c = o3.b.d("symbol");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14071d = o3.b.d(ShareInternalUtility.STAGING_PARAM);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14072e = o3.b.d("offset");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14073f = o3.b.d("importance");

        private s() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a.b.e.AbstractC0208b abstractC0208b, o3.d dVar) throws IOException {
            dVar.b(f14069b, abstractC0208b.e());
            dVar.f(f14070c, abstractC0208b.f());
            dVar.f(f14071d, abstractC0208b.b());
            dVar.b(f14072e, abstractC0208b.d());
            dVar.c(f14073f, abstractC0208b.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class t implements o3.c<h0.f.d.a.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f14074a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14075b = o3.b.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14076c = o3.b.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14077d = o3.b.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14078e = o3.b.d("defaultProcess");

        private t() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.a.c cVar, o3.d dVar) throws IOException {
            dVar.f(f14075b, cVar.d());
            dVar.c(f14076c, cVar.c());
            dVar.c(f14077d, cVar.b());
            dVar.d(f14078e, cVar.e());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class u implements o3.c<h0.f.d.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final u f14079a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14080b = o3.b.d("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14081c = o3.b.d("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14082d = o3.b.d("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14083e = o3.b.d("orientation");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14084f = o3.b.d("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f14085g = o3.b.d("diskUsed");

        private u() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.c cVar, o3.d dVar) throws IOException {
            dVar.f(f14080b, cVar.b());
            dVar.c(f14081c, cVar.c());
            dVar.d(f14082d, cVar.g());
            dVar.c(f14083e, cVar.e());
            dVar.b(f14084f, cVar.f());
            dVar.b(f14085g, cVar.d());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class v implements o3.c<h0.f.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final v f14086a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14087b = o3.b.d(SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14088c = o3.b.d("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14089d = o3.b.d("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14090e = o3.b.d(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final o3.b f14091f = o3.b.d("log");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final o3.b f14092g = o3.b.d("rollouts");

        private v() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d dVar, o3.d dVar2) throws IOException {
            dVar2.b(f14087b, dVar.f());
            dVar2.f(f14088c, dVar.g());
            dVar2.f(f14089d, dVar.b());
            dVar2.f(f14090e, dVar.c());
            dVar2.f(f14091f, dVar.d());
            dVar2.f(f14092g, dVar.e());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class w implements o3.c<h0.f.d.AbstractC0211d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final w f14093a = new w();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14094b = o3.b.d(AppLovinEventTypes.USER_VIEWED_CONTENT);

        private w() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.AbstractC0211d abstractC0211d, o3.d dVar) throws IOException {
            dVar.f(f14094b, abstractC0211d.b());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class x implements o3.c<h0.f.d.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final x f14095a = new x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14096b = o3.b.d("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14097c = o3.b.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final o3.b f14098d = o3.b.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final o3.b f14099e = o3.b.d("templateVersion");

        private x() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.e eVar, o3.d dVar) throws IOException {
            dVar.f(f14096b, eVar.d());
            dVar.f(f14097c, eVar.b());
            dVar.f(f14098d, eVar.c());
            dVar.b(f14099e, eVar.e());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class y implements o3.c<h0.f.d.e.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final y f14100a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14101b = o3.b.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final o3.b f14102c = o3.b.d("variantId");

        private y() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.e.b bVar, o3.d dVar) throws IOException {
            dVar.f(f14101b, bVar.b());
            dVar.f(f14102c, bVar.c());
        }
    }

    /* JADX INFO: compiled from: AutoCrashlyticsReportEncoder.java */
    private static final class z implements o3.c<h0.f.d.AbstractC0212f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final z f14103a = new z();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o3.b f14104b = o3.b.d("assignments");

        private z() {
        }

        @Override // o3.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(h0.f.d.AbstractC0212f abstractC0212f, o3.d dVar) throws IOException {
            dVar.f(f14104b, abstractC0212f.b());
        }
    }

    private a() {
    }

    @Override // p3.a
    public void a(p3.b<?> bVar) {
        d dVar = d.f13978a;
        bVar.a(h0.class, dVar);
        bVar.a(e3.b.class, dVar);
        l lVar = l.f14021a;
        bVar.a(h0.f.class, lVar);
        bVar.a(e3.j.class, lVar);
        i iVar = i.f14001a;
        bVar.a(h0.f.a.class, iVar);
        bVar.a(e3.k.class, iVar);
        j jVar = j.f14009a;
        bVar.a(h0.f.a.b.class, jVar);
        bVar.a(e3.l.class, jVar);
        b0 b0Var = b0.f13973a;
        bVar.a(h0.f.AbstractC0213f.class, b0Var);
        bVar.a(c0.class, b0Var);
        a0 a0Var = a0.f13958a;
        bVar.a(h0.f.e.class, a0Var);
        bVar.a(e3.b0.class, a0Var);
        k kVar = k.f14011a;
        bVar.a(h0.f.c.class, kVar);
        bVar.a(e3.m.class, kVar);
        v vVar = v.f14086a;
        bVar.a(h0.f.d.class, vVar);
        bVar.a(e3.n.class, vVar);
        m mVar = m.f14034a;
        bVar.a(h0.f.d.a.class, mVar);
        bVar.a(e3.o.class, mVar);
        o oVar = o.f14047a;
        bVar.a(h0.f.d.a.b.class, oVar);
        bVar.a(e3.p.class, oVar);
        r rVar = r.f14064a;
        bVar.a(h0.f.d.a.b.e.class, rVar);
        bVar.a(e3.t.class, rVar);
        s sVar = s.f14068a;
        bVar.a(h0.f.d.a.b.e.AbstractC0208b.class, sVar);
        bVar.a(e3.u.class, sVar);
        p pVar = p.f14054a;
        bVar.a(h0.f.d.a.b.c.class, pVar);
        bVar.a(e3.r.class, pVar);
        b bVar2 = b.f13963a;
        bVar.a(h0.a.class, bVar2);
        bVar.a(e3.c.class, bVar2);
        C0195a c0195a = C0195a.f13954a;
        bVar.a(h0.a.AbstractC0197a.class, c0195a);
        bVar.a(e3.d.class, c0195a);
        g gVar = g.f13997a;
        bVar.a(h0.e.class, gVar);
        bVar.a(e3.h.class, gVar);
        h hVar = h.f13999a;
        bVar.a(h0.e.b.class, hVar);
        bVar.a(e3.i.class, hVar);
        q qVar = q.f14060a;
        bVar.a(h0.f.d.a.b.AbstractC0205d.class, qVar);
        bVar.a(e3.s.class, qVar);
        n nVar = n.f14042a;
        bVar.a(h0.f.d.a.b.AbstractC0201a.class, nVar);
        bVar.a(e3.q.class, nVar);
        c cVar = c.f13975a;
        bVar.a(h0.c.class, cVar);
        bVar.a(e3.e.class, cVar);
        t tVar = t.f14074a;
        bVar.a(h0.f.d.a.c.class, tVar);
        bVar.a(e3.v.class, tVar);
        u uVar = u.f14079a;
        bVar.a(h0.f.d.c.class, uVar);
        bVar.a(e3.w.class, uVar);
        w wVar = w.f14093a;
        bVar.a(h0.f.d.AbstractC0211d.class, wVar);
        bVar.a(e3.x.class, wVar);
        z zVar = z.f14103a;
        bVar.a(h0.f.d.AbstractC0212f.class, zVar);
        bVar.a(e3.a0.class, zVar);
        x xVar = x.f14095a;
        bVar.a(h0.f.d.e.class, xVar);
        bVar.a(e3.y.class, xVar);
        y yVar = y.f14100a;
        bVar.a(h0.f.d.e.b.class, yVar);
        bVar.a(e3.z.class, yVar);
        e eVar = e.f13991a;
        bVar.a(h0.d.class, eVar);
        bVar.a(e3.f.class, eVar);
        f fVar = f.f13994a;
        bVar.a(h0.d.b.class, fVar);
        bVar.a(e3.g.class, fVar);
    }
}

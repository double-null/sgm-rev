package v6;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import g7.n;
import kotlin.jvm.internal.t;
import vb.k;
import vb.o;

/* JADX INFO: compiled from: MraidParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f27192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c7.a f27193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f27194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f27196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f27197k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f27198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f27199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f27200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n f27201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final n f27202p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k unifiedMediationParams) {
        super(unifiedMediationParams);
        t.f(unifiedMediationParams, "unifiedMediationParams");
        this.f27188b = unifiedMediationParams.i("creativeAdm");
        this.f27189c = unifiedMediationParams.j(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        this.f27190d = unifiedMediationParams.j(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        this.f27191e = unifiedMediationParams.g("useNativeClose");
        this.f27192f = unifiedMediationParams.l("omsdk_enabled", true) && t7.c.g();
        oc.f fVar = oc.f.f23364a;
        this.f27193g = fVar.a(unifiedMediationParams.m("cacheControl"));
        this.f27194h = unifiedMediationParams.n("placeholderTimeoutSec");
        this.f27195i = unifiedMediationParams.j("skipOffset");
        this.f27196j = unifiedMediationParams.g("r1");
        this.f27197k = unifiedMediationParams.g("r2");
        this.f27198l = unifiedMediationParams.i("store_url");
        this.f27199m = unifiedMediationParams.j("progress_duration");
        this.f27200n = fVar.b(unifiedMediationParams.m("close_button_control_asset"));
        this.f27201o = fVar.b(unifiedMediationParams.m("countdown_control_asset"));
        this.f27202p = fVar.b(unifiedMediationParams.m("progress_control_asset"));
    }

    public final c7.a a() {
        return this.f27193g;
    }

    public final n b() {
        return this.f27200n;
    }

    public final n c() {
        return this.f27201o;
    }

    public final String d() {
        return this.f27188b;
    }

    public final boolean e() {
        return this.f27192f;
    }

    public final float f() {
        return this.f27194h;
    }

    public final int g() {
        return this.f27199m;
    }

    public final n h() {
        return this.f27202p;
    }

    public final boolean i() {
        return this.f27196j;
    }

    public final boolean j() {
        return this.f27197k;
    }

    public final int k() {
        return this.f27195i;
    }

    public final String l() {
        return this.f27198l;
    }

    public final boolean m() {
        return this.f27191e;
    }

    public boolean n(vb.c callback) {
        t.f(callback, "callback");
        String str = this.f27188b;
        if (str == null || str.length() == 0) {
            callback.c(oc.a.k("creativeAdm"));
            return false;
        }
        if (this.f27189c == 0) {
            callback.c(oc.a.k(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
            return false;
        }
        if (this.f27190d != 0) {
            return true;
        }
        callback.c(oc.a.k(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
        return false;
    }
}

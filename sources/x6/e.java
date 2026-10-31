package x6;

import kotlin.jvm.internal.t;
import oc.f;
import vb.k;
import vb.o;

/* JADX INFO: compiled from: VastParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f28082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c7.a f28083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f28084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f28086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f28087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f28088h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k unifiedMediationParams) {
        super(unifiedMediationParams);
        t.f(unifiedMediationParams, "unifiedMediationParams");
        this.f28082b = unifiedMediationParams.i("creativeAdm");
        this.f28083c = f.f23364a.a(unifiedMediationParams.m("cacheControl"));
        this.f28084d = unifiedMediationParams.n("placeholderTimeoutSec");
        this.f28085e = unifiedMediationParams.j("skipOffset");
        this.f28086f = unifiedMediationParams.j("companionSkipOffset");
        this.f28087g = unifiedMediationParams.g("useNativeClose");
        this.f28088h = unifiedMediationParams.l("omsdk_enabled", true) && t7.c.g();
    }

    public final c7.a a() {
        return this.f28083c;
    }

    public final int b() {
        return this.f28086f;
    }

    public final String c() {
        return this.f28082b;
    }

    public final boolean d() {
        return this.f28088h;
    }

    public final float e() {
        return this.f28084d;
    }

    public final int f() {
        return this.f28085e;
    }

    public final boolean g() {
        return this.f28087g;
    }

    public boolean h(vb.c callback) {
        t.f(callback, "callback");
        String str = this.f28082b;
        if (!(str == null || str.length() == 0)) {
            return true;
        }
        callback.c(oc.a.k("creativeAdm"));
        return false;
    }
}

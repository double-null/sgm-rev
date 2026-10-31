package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.Logger;
import fe.u;
import java.net.URL;
import kotlin.collections.s;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;
import o5.b;
import o5.c;
import o5.f;
import o5.i;
import o5.l;
import o5.n;
import rd.d;
import wc.g0;
import wc.r;

/* JADX INFO: compiled from: NativeOMTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class NativeOMTracker {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "NativeAd-OMTracker";
    private o5.a adEvents;
    private b adSession;
    private final boolean isNativeVideo;
    private final kotlinx.serialization.json.b json;
    private p5.b mediaEvents;

    /* JADX INFO: compiled from: NativeOMTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public NativeOMTracker(String omSdkData, String omSdkJS, boolean z10) {
        Object objC;
        OmSdkData omSdkData2;
        t.f(omSdkData, "omSdkData");
        t.f(omSdkJS, "omSdkJS");
        this.isNativeVideo = z10;
        kotlinx.serialization.json.b bVarB = v.b(null, NativeOMTracker$json$1.INSTANCE, 1, null);
        this.json = bVarB;
        try {
            r.a aVar = r.f27774b;
            c nativeAdSession = z10 ? getNativeAdSession(f.VIDEO) : getNativeAdSession(f.NATIVE_DISPLAY);
            l lVarA = l.a(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] decoded = Base64.decode(omSdkData, 0);
            if (decoded != null) {
                t.e(decoded, "decoded");
                String str = new String(decoded, d.f24999b);
                fe.d<Object> dVarB = u.b(bVarB.a(), i0.j(OmSdkData.class));
                t.d(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData2 = (OmSdkData) bVarB.c(dVarB, str);
            } else {
                omSdkData2 = null;
            }
            if ((omSdkData2 != null ? omSdkData2.getVendorURL() : null) == null) {
                Logger.Companion.e(TAG, "Invalid OMSDK data: missing vendorURL");
            } else {
                n verificationScriptResource = n.a(omSdkData2.getVendorKey(), new URL(omSdkData2.getVendorURL()), omSdkData2.getParams());
                t.e(verificationScriptResource, "verificationScriptResource");
                this.adSession = b.a(nativeAdSession, o5.d.b(lVarA, omSdkJS, s.e(verificationScriptResource), null, null));
            }
            objC = r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            objC = r.c(wc.s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "error occured when create omsdk adSession:", thG);
        }
    }

    private final c getNativeAdSession(f fVar) {
        i iVar = i.BEGIN_TO_RENDER;
        o5.k kVar = o5.k.NATIVE;
        c cVarA = c.a(fVar, iVar, kVar, fVar == f.NATIVE_DISPLAY ? o5.k.NONE : kVar, false);
        t.e(cVarA, "createAdSessionConfigura…          false\n        )");
        return cVarA;
    }

    public final void impressionOccurred() {
        g0 g0Var;
        Logger.Companion.d(TAG, "track event: impressionOccurred");
        try {
            r.a aVar = r.f27774b;
            o5.a aVar2 = this.adEvents;
            if (aVar2 != null) {
                aVar2.b();
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar3 = r.f27774b;
            r.c(wc.s.a(th));
        }
    }

    public final boolean isNativeVideo() {
        return this.isNativeVideo;
    }

    public final void onMuteChanged(boolean z10) {
        Logger.Companion.d(TAG, "track event: onMuteChanged muted=" + z10);
        g0 g0Var = null;
        if (z10) {
            try {
                r.a aVar = r.f27774b;
                p5.b bVar = this.mediaEvents;
                if (bVar != null) {
                    bVar.l(0.0f);
                    g0Var = g0.f27756a;
                }
                r.c(g0Var);
                return;
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(wc.s.a(th));
                return;
            }
        }
        try {
            r.a aVar3 = r.f27774b;
            p5.b bVar2 = this.mediaEvents;
            if (bVar2 != null) {
                bVar2.l(1.0f);
                g0Var = g0.f27756a;
            }
            r.c(g0Var);
        } catch (Throwable th2) {
            r.a aVar4 = r.f27774b;
            r.c(wc.s.a(th2));
        }
    }

    public final void onQuartileChanged(int i10) {
        Logger.Companion.d(TAG, "track event: onQuartileChanged quartile=" + i10);
        g0 g0Var = null;
        if (i10 == 5) {
            try {
                r.a aVar = r.f27774b;
                p5.b bVar = this.mediaEvents;
                if (bVar != null) {
                    bVar.f();
                    g0Var = g0.f27756a;
                }
                r.c(g0Var);
                return;
            } catch (Throwable th) {
                r.a aVar2 = r.f27774b;
                r.c(wc.s.a(th));
                return;
            }
        }
        if (i10 == 6) {
            try {
                r.a aVar3 = r.f27774b;
                p5.b bVar2 = this.mediaEvents;
                if (bVar2 != null) {
                    bVar2.g();
                    g0Var = g0.f27756a;
                }
                r.c(g0Var);
                return;
            } catch (Throwable th2) {
                r.a aVar4 = r.f27774b;
                r.c(wc.s.a(th2));
                return;
            }
        }
        if (i10 != 7) {
            return;
        }
        try {
            r.a aVar5 = r.f27774b;
            p5.b bVar3 = this.mediaEvents;
            if (bVar3 != null) {
                bVar3.k();
                g0Var = g0.f27756a;
            }
            r.c(g0Var);
        } catch (Throwable th3) {
            r.a aVar6 = r.f27774b;
            r.c(wc.s.a(th3));
        }
    }

    public final void onQuartileStart(float f10, float f11) {
        g0 g0Var;
        Logger.Companion.d(TAG, "track event: onQuartileStart duration=" + f10 + " volume=" + f11);
        try {
            r.a aVar = r.f27774b;
            p5.b bVar = this.mediaEvents;
            if (bVar != null) {
                bVar.j(f10, f11);
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(wc.s.a(th));
        }
    }

    public final void onStateCompleted() {
        g0 g0Var;
        Logger.Companion.d(TAG, "track event: onStateCompleted");
        try {
            r.a aVar = r.f27774b;
            p5.b bVar = this.mediaEvents;
            if (bVar != null) {
                bVar.b();
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(wc.s.a(th));
        }
    }

    public final void onStatePaused() {
        g0 g0Var;
        Logger.Companion.d(TAG, "track event: onStatePaused");
        try {
            r.a aVar = r.f27774b;
            p5.b bVar = this.mediaEvents;
            if (bVar != null) {
                bVar.h();
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(wc.s.a(th));
        }
    }

    public final void onStatePlay() {
        g0 g0Var;
        Logger.Companion.d(TAG, "track event: onStatePlay");
        try {
            r.a aVar = r.f27774b;
            p5.b bVar = this.mediaEvents;
            if (bVar != null) {
                bVar.i();
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(wc.s.a(th));
        }
    }

    public final void onUserInteraction() {
        g0 g0Var;
        Logger.Companion.d(TAG, "track event: onUserInteraction");
        try {
            r.a aVar = r.f27774b;
            p5.b bVar = this.mediaEvents;
            if (bVar != null) {
                bVar.a(p5.a.CLICK);
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            r.c(g0Var);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            r.c(wc.s.a(th));
        }
    }

    public final void start(View view) {
        Object objC;
        Integer numValueOf;
        t.f(view, "view");
        Logger.Companion companion = Logger.Companion;
        companion.d(TAG, "start OM tracker");
        try {
            r.a aVar = r.f27774b;
            b bVar = this.adSession;
            if (bVar != null) {
                this.adEvents = o5.a.a(bVar);
                if (this.isNativeVideo) {
                    this.mediaEvents = p5.b.e(bVar);
                }
                bVar.c(view);
                bVar.d();
                if (this.isNativeVideo) {
                    p5.d dVarB = p5.d.b(false, p5.c.STANDALONE);
                    o5.a aVar2 = this.adEvents;
                    if (aVar2 != null) {
                        aVar2.d(dVarB);
                    }
                } else {
                    o5.a aVar3 = this.adEvents;
                    if (aVar3 != null) {
                        aVar3.c();
                    }
                }
                numValueOf = Integer.valueOf(companion.d(TAG, "track event: loaded"));
            } else {
                numValueOf = null;
            }
            objC = r.c(numValueOf);
        } catch (Throwable th) {
            r.a aVar4 = r.f27774b;
            objC = r.c(wc.s.a(th));
        }
        Throwable thG = r.g(objC);
        if (thG != null) {
            Logger.Companion.e(TAG, "error occured when start omsdk adSession:", thG);
        }
    }

    public final void stop() {
        b bVar = this.adSession;
        if (bVar != null) {
            bVar.b();
        }
        this.adSession = null;
        this.adEvents = null;
        this.mediaEvents = null;
    }
}

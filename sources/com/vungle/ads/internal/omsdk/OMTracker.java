package com.vungle.ads.internal.omsdk;

import android.webkit.WebView;
import com.vungle.ads.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import o5.b;
import o5.c;
import o5.d;
import o5.f;
import o5.i;
import o5.l;

/* JADX INFO: compiled from: OMTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class OMTracker implements WebViewObserver {
    public static final Companion Companion = new Companion(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private b adSession;
    private final boolean enabled;
    private boolean started;

    /* JADX INFO: compiled from: OMTracker.kt */
    public static final class Factory {
        public final OMTracker make(boolean z10) {
            return new OMTracker(z10, null);
        }
    }

    public /* synthetic */ OMTracker(boolean z10, k kVar) {
        this(z10);
    }

    @Override // com.vungle.ads.internal.omsdk.WebViewObserver
    public void onPageFinished(WebView webView) {
        t.f(webView, "webView");
        if (this.started && this.adSession == null) {
            f fVar = f.DEFINED_BY_JAVASCRIPT;
            i iVar = i.DEFINED_BY_JAVASCRIPT;
            o5.k kVar = o5.k.JAVASCRIPT;
            b bVarA = b.a(c.a(fVar, iVar, kVar, kVar, false), d.a(l.a(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME), webView, null, null));
            this.adSession = bVarA;
            if (bVarA != null) {
                bVarA.c(webView);
            }
            b bVar = this.adSession;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public final void start() {
        if (this.enabled && n5.a.b()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j10;
        b bVar;
        if (!this.started || (bVar = this.adSession) == null) {
            j10 = 0;
        } else {
            if (bVar != null) {
                bVar.b();
            }
            j10 = DESTROY_DELAY_MS;
        }
        this.started = false;
        this.adSession = null;
        return j10;
    }

    private OMTracker(boolean z10) {
        this.enabled = z10;
    }

    /* JADX INFO: compiled from: OMTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final long getDESTROY_DELAY_MS() {
            return OMTracker.DESTROY_DELAY_MS;
        }

        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }
    }
}

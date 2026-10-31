package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class n4 extends h4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f7679p = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r7 f7680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f7681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaEvents f7682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final VastProperties f7683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f7684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f7685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f7686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f7687o;

    public n4(r7 r7Var) {
        super(r7Var);
        this.f7681i = new AtomicBoolean();
        this.f7684l = new AtomicBoolean();
        this.f7685m = new AtomicBoolean();
        this.f7686n = new AtomicBoolean();
        this.f7687o = new AtomicBoolean();
        this.f7680h = r7Var;
        float fM1 = r7Var.m1();
        if (r7Var.m1() == -1) {
            this.f7683k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f7683k = VastProperties.createVastPropertiesForSkippableMedia(fM1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new Runnable() { // from class: com.applovin.impl.ec
            @Override // java.lang.Runnable
            public final void run() {
                this.f6440a.s();
            }
        });
    }

    public void B() {
        b("track skipped", new Runnable() { // from class: com.applovin.impl.lc
            @Override // java.lang.Runnable
            public final void run() {
                this.f7078a.t();
            }
        });
    }

    public void C() {
        if (this.f7687o.compareAndSet(false, true)) {
            b("track third quartile", new Runnable() { // from class: com.applovin.impl.kc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7010a.u();
                }
            });
        }
    }

    @Override // com.applovin.impl.h4
    protected AdSessionContext a(WebView webView) {
        if (!f7679p && this.f7680h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (s7 s7Var : this.f7680h.e1().b()) {
            List<y7> listC = s7Var.c();
            if (listC.isEmpty()) {
                d8.a(s7Var.b(), w7.FAILED_TO_LOAD_RESOURCE, this.f6729b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (y7 y7Var : listC) {
                    if ("omid".equalsIgnoreCase(y7Var.b())) {
                        arrayList2.add(y7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    d8.a(s7Var.b(), w7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f6729b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((y7) it.next()).c()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.p.a()) {
                                this.f6730c.a(this.f6731d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        d8.a(s7Var.b(), w7.FAILED_TO_LOAD_RESOURCE, this.f6729b);
                    } else {
                        String strE = s7Var.e();
                        String strD = s7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            d8.a(s7Var.b(), w7.FAILED_TO_LOAD_RESOURCE, this.f6729b);
                        }
                    }
                }
            }
        }
        String strA = this.f6729b.g0().a();
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.b(this.f6731d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f6729b.g0().b(), strA, arrayList, this.f7680h.getOpenMeasurementContentUrl(), this.f7680h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            this.f6730c.a(this.f6731d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void b(final float f10, final boolean z10) {
        if (this.f7684l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.mc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7128a.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.h4
    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.bc
            @Override // java.lang.Runnable
            public final void run() {
                this.f6199a.p();
            }
        });
    }

    public void v() {
        b("track clicked", new Runnable() { // from class: com.applovin.impl.jc
            @Override // java.lang.Runnable
            public final void run() {
                this.f6928a.m();
            }
        });
    }

    public void w() {
        b("track completed", new Runnable() { // from class: com.applovin.impl.fc
            @Override // java.lang.Runnable
            public final void run() {
                this.f6597a.n();
            }
        });
    }

    public void x() {
        if (this.f7685m.compareAndSet(false, true)) {
            b("track first quartile", new Runnable() { // from class: com.applovin.impl.cc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6273a.o();
                }
            });
        }
    }

    public void y() {
        if (this.f7686n.compareAndSet(false, true)) {
            b("track midpoint", new Runnable() { // from class: com.applovin.impl.gc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6707a.q();
                }
            });
        }
    }

    public void z() {
        b("track paused", new Runnable() { // from class: com.applovin.impl.dc
            @Override // java.lang.Runnable
            public final void run() {
                this.f6381a.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f7682j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f7682j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f7682j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f7682j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f7682j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f6734g.loaded(this.f7683k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f7682j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f7682j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f7682j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f7682j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f7682j.thirdQuartile();
    }

    public void i() {
        if (this.f7681i.compareAndSet(true, false)) {
            b("buffer finished", new Runnable() { // from class: com.applovin.impl.ic
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6859a.k();
                }
            });
        }
    }

    public void j() {
        if (this.f7681i.compareAndSet(false, true)) {
            b("buffer started", new Runnable() { // from class: com.applovin.impl.hc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6775a.l();
                }
            });
        }
    }

    public void b(final boolean z10) {
        b("track volume changed", new Runnable() { // from class: com.applovin.impl.ac
            @Override // java.lang.Runnable
            public final void run() {
                this.f5970a.a(z10);
            }
        });
    }

    @Override // com.applovin.impl.h4
    protected AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.a(this.f6731d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.h4
    protected void a(AdSession adSession) {
        try {
            this.f7682j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6730c.a(this.f6731d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f10, boolean z10) {
        this.f7682j.start(f10, z10 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10) {
        this.f7682j.volumeChange(z10 ? 0.0f : 1.0f);
    }
}

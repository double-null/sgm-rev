package io.bidmachine;

import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.iab.vast.activity.IIj.KBBdKxoAiHo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: FullScreenAdObject.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FullScreenAdObject<AdRequestType extends FullScreenAdRequest<AdRequestType>> extends AdObjectImpl<AdRequestType, ga.b, vb.h, vb.i, vb.j> {
    private final AtomicBoolean isShowing;

    /* JADX INFO: compiled from: FullScreenAdObject.kt */
    private static final class a extends o7.b implements vb.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
            kotlin.jvm.internal.t.f(adProcessCallback, "adProcessCallback");
        }

        @Override // vb.i
        public void d() {
            g().processFinished();
        }

        @Override // vb.i
        public void onAdClosed() {
            g().processClosed();
        }

        @Override // vb.i
        public void onAdLoaded() {
            g().processLoadSuccess();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenAdObject(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adRequest, ga.b adObjectParams, vb.h unifiedAd) {
        super(contextProvider, adProcessCallback, adRequest, adObjectParams, unifiedAd);
        kotlin.jvm.internal.t.f(contextProvider, "contextProvider");
        kotlin.jvm.internal.t.f(adProcessCallback, "adProcessCallback");
        kotlin.jvm.internal.t.f(adRequest, "adRequest");
        kotlin.jvm.internal.t.f(adObjectParams, "adObjectParams");
        kotlin.jvm.internal.t.f(unifiedAd, "unifiedAd");
        this.isShowing = new AtomicBoolean(false);
    }

    @Override // io.bidmachine.AdObjectImpl, ga.a
    public void onClosed(boolean z10) {
        this.isShowing.set(false);
        super.onClosed(z10);
    }

    @Override // io.bidmachine.AdObjectImpl, ga.a
    public void onShowFailed() {
        this.isShowing.set(false);
        super.onShowFailed();
    }

    @Override // io.bidmachine.AdObjectImpl
    public vb.i createUnifiedCallback(AdProcessCallback adProcessCallback) {
        kotlin.jvm.internal.t.f(adProcessCallback, "adProcessCallback");
        return new a(adProcessCallback);
    }

    public final void show(ContextProvider contextProvider, RendererConfiguration rendererConfiguration) throws Throwable {
        kotlin.jvm.internal.t.f(contextProvider, KBBdKxoAiHo.tBLjGEdEb);
        if (this.isShowing.get()) {
            io.bidmachine.core.a.c("Fullscreen ad already showing, please wait until the ad closes");
            return;
        }
        this.isShowing.set(true);
        getUnifiedAd().k(contextProvider, getUnifiedAdCallback(), rendererConfiguration);
        getAdProcessCallback().processFillAd();
    }
}

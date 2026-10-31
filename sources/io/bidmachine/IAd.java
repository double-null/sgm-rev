package io.bidmachine;

import io.bidmachine.AdRequest;
import io.bidmachine.IAd;

/* JADX INFO: loaded from: classes4.dex */
public interface IAd<SelfType extends IAd, AdRequestType extends AdRequest> {
    boolean canShow();

    void destroy();

    ga.c getAuctionResult();

    boolean isDestroyed();

    boolean isExpired();

    boolean isLoaded();

    boolean isLoading();

    SelfType load(AdRequestType adrequesttype);

    SelfType setRendererConfiguration(RendererConfiguration rendererConfiguration);
}

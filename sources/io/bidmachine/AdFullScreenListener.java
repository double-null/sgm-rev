package io.bidmachine;

import io.bidmachine.IAd;

/* JADX INFO: loaded from: classes4.dex */
public interface AdFullScreenListener<AdType extends IAd> {
    void onAdClosed(AdType adtype, boolean z10);
}

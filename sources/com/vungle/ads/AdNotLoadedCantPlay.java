package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.k;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdNotLoadedCantPlay extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public AdNotLoadedCantPlay() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdNotLoadedCantPlay(String str, int i10, k kVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public AdNotLoadedCantPlay(String str) {
        super(Sdk.SDKError.Reason.AD_NOT_LOADED, "Failed to retrieve the ad object: " + str, null);
    }
}

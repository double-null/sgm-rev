package com.vungle.ads;

import android.content.Context;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface FullscreenAd extends Ad {

    /* JADX INFO: compiled from: BaseAd.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void play$default(FullscreenAd fullscreenAd, Context context, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
            }
            if ((i10 & 1) != 0) {
                context = null;
            }
            fullscreenAd.play(context);
        }
    }

    void play(Context context);
}

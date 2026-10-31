package com.vungle.ads.internal.ui.view;

import android.media.MediaPlayer;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AdVideoView.kt */
/* JADX INFO: loaded from: classes4.dex */
final class AdVideoView$mediaPlayerFactory$1 extends u implements id.a<MediaPlayer> {
    public static final AdVideoView$mediaPlayerFactory$1 INSTANCE = new AdVideoView$mediaPlayerFactory$1();

    AdVideoView$mediaPlayerFactory$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // id.a
    public final MediaPlayer invoke() {
        return new MediaPlayer();
    }
}

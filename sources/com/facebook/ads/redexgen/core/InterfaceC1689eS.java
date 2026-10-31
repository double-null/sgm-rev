package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC1689eS {
    void A9V();

    boolean A9i();

    boolean A9j();

    boolean AAT();

    void AG7(boolean z10, int i10);

    void AJH(int i10);

    void AJM(EnumC1637db enumC1637db, int i10);

    void AJU(int i10);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC1637db getStartReason();

    EnumC1691eU getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i10);

    void setBackgroundPlaybackEnabled(boolean z10);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z10);

    void setRequestedVolume(float f10);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(InterfaceC1692eV interfaceC1692eV);

    void setup(Uri uri);
}

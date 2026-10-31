package com.vungle.ads.nativead;

/* JADX INFO: compiled from: NativeVideoContract.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface NativeVideoContract {

    /* JADX INFO: compiled from: NativeVideoContract.kt */
    public interface VideoControl {
        int getCurrentTime();

        int getDuration();
    }

    /* JADX INFO: compiled from: NativeVideoContract.kt */
    public interface VideoLifecycleCallback {
        void onVideoCompleted();

        void onVideoError(int i10, String str);

        void onVideoMuted(boolean z10);

        void onVideoPause();

        void onVideoPlay();

        void onVideoPrepared();

        void onVideoProgress(int i10);
    }
}

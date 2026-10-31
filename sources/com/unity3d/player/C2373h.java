package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2373h implements AssetPackStateUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet f12906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f12907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2385n f12908c;

    public C2373h(C2385n c2385n, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        this.f12908c = c2385n;
        HashSet hashSet = new HashSet();
        this.f12906a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
        this.f12907b = looper;
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.f12906a.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (C2385n.f12953d) {
                    this.f12908c.f12955b.remove(assetPackState.name());
                    if (this.f12908c.f12955b.isEmpty()) {
                        C2385n c2385n = this.f12908c;
                        c2385n.a(c2385n.f12956c);
                        this.f12908c.f12956c = null;
                    }
                }
            }
            if (this.f12906a.size() != 0) {
                new Handler(this.f12907b).post(new RunnableC2371g((Set) this.f12906a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
            }
        }
    }
}

package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class PlayAssetDeliveryUnityWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static PlayAssetDeliveryUnityWrapper f12780b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2385n f12781a;

    private PlayAssetDeliveryUnityWrapper(Context context) {
        this.f12781a = null;
        if (f12780b != null) {
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            if (getClass().getClassLoader().loadClass("com.google.android.play.core.assetpacks.AssetPackManager").getMethod("getPackStates", List.class).getReturnType().getName().equals("com.google.android.gms.tasks.Task")) {
                this.f12781a = a(context);
            }
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    private static C2385n a(Context context) {
        return C2385n.a(context);
    }

    public static synchronized PlayAssetDeliveryUnityWrapper getInstance() {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        while (true) {
            playAssetDeliveryUnityWrapper = f12780b;
            if (playAssetDeliveryUnityWrapper == null) {
                try {
                    PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                } catch (InterruptedException e10) {
                    AbstractC2409z.Log(6, e10.getMessage());
                }
            }
        }
        return playAssetDeliveryUnityWrapper;
    }

    public static synchronized PlayAssetDeliveryUnityWrapper init(Context context) {
        if (f12780b != null) {
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
        }
        f12780b = new PlayAssetDeliveryUnityWrapper(context);
        PlayAssetDeliveryUnityWrapper.class.notifyAll();
        return f12780b;
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        a();
        this.f12781a.a(strArr);
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        this.f12781a.a(strArr, iAssetPackManagerDownloadStatusCallback);
    }

    public String getAssetPackPath(String str) {
        a();
        return this.f12781a.a(str);
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        a();
        this.f12781a.a(strArr, iAssetPackManagerStatusQueryCallback);
    }

    public boolean playCoreApiMissing() {
        return this.f12781a == null;
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        return this.f12781a.a(iAssetPackManagerDownloadStatusCallback);
    }

    public void removeAssetPack(String str) {
        a();
        this.f12781a.b(str);
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        a();
        this.f12781a.a(activity, iAssetPackManagerMobileDataConfirmationCallback);
    }

    public void unregisterDownloadStatusListener(Object obj) {
        a();
        this.f12781a.a(obj);
    }

    private void a() {
        if (playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
        }
    }
}

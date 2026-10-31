package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2385n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C2385n f12953d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AssetPackManager f12954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet f12955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f12956c;

    private C2385n(Context context) {
        if (f12953d != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.f12954a = AssetPackManagerFactory.getInstance(context);
        this.f12955b = new HashSet();
    }

    public static C2385n a(Context context) {
        if (f12953d == null) {
            f12953d = new C2385n(context);
        }
        return f12953d;
    }

    public final void b(String str) {
        this.f12954a.removePack(str);
    }

    public final Object a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        C2373h c2373h = new C2373h(this, iAssetPackManagerDownloadStatusCallback, Looper.myLooper());
        this.f12954a.registerListener(c2373h);
        return c2373h;
    }

    public final String a(String str) {
        AssetPackLocation packLocation = this.f12954a.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    public final void a(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f12954a.showCellularDataConfirmation(activity).addOnSuccessListener(new C2377j(iAssetPackManagerMobileDataConfirmationCallback));
    }

    public final void a(Object obj) {
        if (obj instanceof C2373h) {
            this.f12954a.unregisterListener((C2373h) obj);
        }
    }

    public final void a(String[] strArr) {
        this.f12954a.cancel(Arrays.asList(strArr));
    }

    public final void a(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        for (String str : strArr) {
            this.f12954a.getPackStates(Collections.singletonList(str)).addOnCompleteListener(new C2379k(str, iAssetPackManagerDownloadStatusCallback));
        }
    }

    public final void a(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.f12954a.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C2383m(strArr, iAssetPackManagerStatusQueryCallback));
    }
}

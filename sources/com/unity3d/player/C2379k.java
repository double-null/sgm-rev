package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2379k implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAssetPackManagerDownloadStatusCallback f12927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f12928b = Looper.myLooper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12929c;

    public C2379k(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.f12927a = iAssetPackManagerDownloadStatusCallback;
        this.f12929c = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int errorCode;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            if (mapPackStates.size() == 0) {
                return;
            }
            for (AssetPackState assetPackState : mapPackStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String strName = assetPackState.name();
                    int iStatus = assetPackState.status();
                    int iErrorCode = assetPackState.errorCode();
                    long j10 = assetPackStates.totalBytes();
                    new Handler(this.f12928b).post(new RunnableC2371g(Collections.singleton(this.f12927a), strName, iStatus, j10, iStatus == 4 ? j10 : 0L, 0, iErrorCode));
                } else {
                    C2385n c2385n = C2385n.f12953d;
                    String strName2 = assetPackState.name();
                    IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.f12927a;
                    Looper looper = this.f12928b;
                    c2385n.getClass();
                    synchronized (C2385n.f12953d) {
                        Object obj = c2385n.f12956c;
                        if (obj == null) {
                            C2373h c2373h = new C2373h(c2385n, iAssetPackManagerDownloadStatusCallback, looper);
                            c2385n.f12954a.registerListener(c2373h);
                            c2385n.f12956c = c2373h;
                        } else {
                            ((C2373h) obj).a(iAssetPackManagerDownloadStatusCallback);
                        }
                        c2385n.f12955b.add(strName2);
                        c2385n.f12954a.fetch(Collections.singletonList(strName2));
                    }
                }
            }
        } catch (RuntimeExecutionException e10) {
            e = e10;
            String str = this.f12929c;
            while (true) {
                if (e instanceof AssetPackException) {
                    errorCode = e.getErrorCode();
                    break;
                }
                e = e.getCause();
                if (e == null) {
                    errorCode = -100;
                    break;
                }
            }
            new Handler(this.f12928b).post(new RunnableC2371g(Collections.singleton(this.f12927a), str, 0, 0L, 0L, 0, errorCode));
        }
    }
}

package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: renamed from: com.unity3d.player.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C2377j implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAssetPackManagerMobileDataConfirmationCallback f12924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f12925b = Looper.myLooper();

    public C2377j(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f12924a = iAssetPackManagerMobileDataConfirmationCallback;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        if (this.f12924a != null) {
            new Handler(this.f12925b).post(new RunnableC2375i(this.f12924a, num.intValue() == -1));
        }
    }
}

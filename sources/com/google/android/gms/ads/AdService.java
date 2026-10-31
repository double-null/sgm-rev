package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbuy;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import g7.EinF.ZHgPsTG;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class AdService extends IntentService {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super(ZHgPsTG.wqTw);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            zzay.zzb().zzj(this, new zzbuy()).zze(intent);
        } catch (RemoteException e10) {
            zzo.zzf(vgmm.pTloipa.concat(e10.toString()));
        }
    }
}

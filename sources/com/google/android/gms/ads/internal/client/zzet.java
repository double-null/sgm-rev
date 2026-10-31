package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbrv;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzet extends zzbrv {
    final /* synthetic */ zzeu zza;

    /* synthetic */ zzet(zzeu zzeuVar, byte[] bArr) {
        Objects.requireNonNull(zzeuVar);
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        zzeu zzeuVar = this.zza;
        synchronized (zzeuVar.zzw()) {
            zzeuVar.zzy(false);
            zzeuVar.zzz(true);
            arrayList = new ArrayList(zzeuVar.zzx());
            zzeuVar.zzx().clear();
        }
        InitializationStatus initializationStatusZzB = zzeu.zzB(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(initializationStatusZzB);
        }
    }
}

package com.google.android.gms.common;

import com.google.android.gms.internal.common.zzam;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public class GmsSignatureVerifier {
    private static final zzab zza;
    private static final zzab zzb;
    private static final HashMap zzc;

    static {
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza("com.google.android.gms");
        zzaaVar.zzb(204200000L);
        zzm zzmVar = zzo.zzf;
        zzaaVar.zzc(zzam.zzm(zzmVar.zzc(), zzo.zzd.zzc(), zzo.zzb.zzc()));
        zzm zzmVar2 = zzo.zze;
        byte[] bArrZzc = zzmVar2.zzc();
        zzm zzmVar3 = zzo.zzc;
        zzaaVar.zzd(zzam.zzm(bArrZzc, zzmVar3.zzc(), zzo.zza.zzc()));
        zza = zzaaVar.zze();
        zzaa zzaaVar2 = new zzaa();
        zzaaVar2.zza("com.android.vending");
        zzaaVar2.zzb(82240000L);
        zzaaVar2.zzc(zzam.zzk(zzmVar.zzc()));
        zzaaVar2.zzd(zzam.zzl(zzmVar2.zzc(), zzmVar3.zzc()));
        zzb = zzaaVar2.zze();
        zzc = new HashMap();
    }
}

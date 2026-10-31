package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhmi {
    public static final /* synthetic */ int zza = 0;
    private static final zzhln zzc = zzhmh.zza;
    private static final zzhmi zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhmi zza() {
        return zzd;
    }

    private static zzhmi zzd() {
        zzhmi zzhmiVar = new zzhmi();
        try {
            zzhmiVar.zzb(zzc, zzhma.class);
            return zzhmiVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    private final synchronized zzhdq zze(zzheh zzhehVar, Integer num) throws GeneralSecurityException {
        zzhln zzhlnVar;
        zzhlnVar = (zzhln) this.zzb.get(zzhehVar.getClass());
        if (zzhlnVar == null) {
            String string = zzhehVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 86);
            sb2.append("Cannot create a new key for parameters ");
            sb2.append(string);
            sb2.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb2.toString());
        }
        return zzhlnVar.zza(zzhehVar, num);
    }

    public final synchronized void zzb(zzhln zzhlnVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        zzhln zzhlnVar2 = (zzhln) map.get(cls);
        if (zzhlnVar2 != null && !zzhlnVar2.equals(zzhlnVar)) {
            String string = cls.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 60);
            sb2.append("Different key creator for parameters class ");
            sb2.append(string);
            sb2.append(" already inserted");
            throw new GeneralSecurityException(sb2.toString());
        }
        map.put(cls, zzhlnVar);
    }

    public final zzhdq zzc(zzheh zzhehVar, Integer num) throws GeneralSecurityException {
        return zze(zzhehVar, num);
    }
}

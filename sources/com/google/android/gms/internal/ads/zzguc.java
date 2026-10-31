package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzguc implements Serializable, zzgub {
    final zzgub zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgui zzd = new zzgui();

    zzguc(zzgub zzgubVar) {
        this.zza = zzgubVar;
    }

    public final String toString() {
        Object string;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(strValueOf);
            sb2.append(">");
            string = sb2.toString();
        } else {
            string = this.zza;
        }
        String string2 = string.toString();
        StringBuilder sb3 = new StringBuilder(string2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(string2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                if (!this.zzb) {
                    Object objZza = this.zza.zza();
                    this.zzc = objZza;
                    this.zzb = true;
                    return objZza;
                }
            }
        }
        return this.zzc;
    }
}

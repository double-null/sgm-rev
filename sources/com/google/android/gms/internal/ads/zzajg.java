package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajg extends zzajo implements zzaiv {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzajo[] zzg;

    public zzajg(String str, int i10, int i11, long j10, long j11, zzajo[] zzajoVarArr) {
        super("CHAP");
        zzgtj.zza(i10 <= i11);
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzajoVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajg.class == obj.getClass()) {
            zzajg zzajgVar = (zzajg) obj;
            if (this.zzb == zzajgVar.zzb && this.zzc == zzajgVar.zzc && this.zzd == zzajgVar.zzd && this.zze == zzajgVar.zze && Objects.equals(this.zza, zzajgVar.zza) && Arrays.equals(this.zzg, zzajgVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + 527;
        String str = this.zza;
        long j10 = this.zze;
        return (((((((i10 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j10)) * 31) + str.hashCode();
    }
}

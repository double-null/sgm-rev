package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzzn {
    public static final zzzn zza = new zzzn(new zzbg[0]);
    public final int zzb;
    private final zzgwm zzc;
    private int zzd;

    static {
        String str = zzfl.zza;
        Integer.toString(0, 36);
    }

    public zzzn(zzbg... zzbgVarArr) {
        this.zzc = zzgwm.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbg) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzeg.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzn.class == obj.getClass()) {
            zzzn zzznVar = (zzzn) obj;
            if (this.zzb == zzznVar.zzb && this.zzc.equals(zzznVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i10) {
        return (zzbg) this.zzc.get(i10);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzgwm zzc() {
        return zzgwm.zzq(zzgxm.zzc(this.zzc, zzzm.zza));
    }
}

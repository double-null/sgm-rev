package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new zzjr();
    public final String zza;
    public final String zzb;
    public final zzjo zzc;
    public final boolean zzd;

    public zzjq(String str, String str2, zzjo zzjoVar, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzjoVar;
        this.zzd = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return zzkl.zza(this.zza, zzjqVar.zza) && zzkl.zza(this.zzb, zzjqVar.zzb) && zzkl.zza(this.zzc, zzjqVar.zzc) && this.zzd == zzjqVar.zzd;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        zza(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final void zza(StringBuilder sb2) {
        sb2.append("FlagOverride(");
        sb2.append(this.zza);
        sb2.append(", ");
        sb2.append(this.zzb);
        sb2.append(", ");
        this.zzc.zzf(sb2);
        sb2.append(", ");
        sb2.append(this.zzd);
        sb2.append(")");
    }
}

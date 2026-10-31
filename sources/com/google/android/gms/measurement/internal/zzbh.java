package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    public final String zza;
    public final zzbf zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;

    zzbh(zzbh zzbhVar, long j10, long j11) {
        Preconditions.checkNotNull(zzbhVar);
        this.zza = zzbhVar.zza;
        this.zzb = zzbhVar.zzb;
        this.zzc = zzbhVar.zzc;
        this.zzd = j10;
        this.zze = j11;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzbi.zza(this, parcel, i10);
    }

    public zzbh(String str, zzbf zzbfVar, String str2, long j10, long j11) {
        this.zza = str;
        this.zzb = zzbfVar;
        this.zzc = str2;
        this.zzd = j10;
        this.zze = j11;
    }
}

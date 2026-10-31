package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    private final String zza;
    private final IBinder zzb;
    private final boolean zzc;
    private final boolean zzd;
    private zzj zze;

    zzt(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = iBinder;
        this.zzc = z10;
        this.zzd = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzt(String str, zzj zzjVar, boolean z10, boolean z11) {
        this.zza = str;
        this.zze = zzjVar;
        this.zzb = zzjVar == null ? null : zzjVar;
        this.zzc = z10;
        this.zzd = z11;
    }
}

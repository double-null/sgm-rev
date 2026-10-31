package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    final int zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final List zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    WakeLockEvent(int i10, long j10, int i11, String str, int i12, List list, String str2, long j11, int i13, String str3, String str4, float f10, long j12, String str5, boolean z10) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = i11;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i12;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j11;
        this.zzk = i13;
        this.zzl = str4;
        this.zzm = f10;
        this.zzn = j12;
        this.zzo = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List list = this.zzh;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i10 = this.zzk;
        String str = this.zze;
        String str2 = this.zzl;
        float f10 = this.zzm;
        String str3 = this.zzf;
        int i11 = this.zzg;
        String str4 = this.zzd;
        boolean z10 = this.zzo;
        int length = String.valueOf(str4).length() + 2 + String.valueOf(i11).length() + 1 + String.valueOf(strJoin).length() + 1 + String.valueOf(i10).length();
        if (str == null) {
            str = "";
        }
        int length2 = length + 1 + str.length() + 1;
        if (str2 == null) {
            str2 = "";
        }
        int length3 = length2 + str2.length() + 1 + String.valueOf(f10).length() + 1;
        String str5 = str3 != null ? str3 : "";
        StringBuilder sb2 = new StringBuilder(length3 + str5.length() + 1 + String.valueOf(z10).length());
        sb2.append("\t");
        sb2.append(str4);
        sb2.append("\t");
        sb2.append(i11);
        sb2.append("\t");
        sb2.append(strJoin);
        sb2.append("\t");
        sb2.append(i10);
        sb2.append("\t");
        sb2.append(str);
        sb2.append("\t");
        sb2.append(str2);
        sb2.append("\t");
        sb2.append(f10);
        sb2.append("\t");
        sb2.append(str5);
        sb2.append("\t");
        sb2.append(z10);
        return sb2.toString();
    }
}

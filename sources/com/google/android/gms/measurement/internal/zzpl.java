package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zzpm();
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    zzpl(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = l10;
        this.zzg = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzpm.zza(this, parcel, i10);
    }

    public final Object zza() {
        Long l10 = this.zzd;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.zzg;
        if (d10 != null) {
            return d10;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzpl(zzpn zzpnVar) {
        this(zzpnVar.zzc, zzpnVar.zzd, zzpnVar.zze, zzpnVar.zzb);
    }

    zzpl(String str, long j10, Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j10;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}

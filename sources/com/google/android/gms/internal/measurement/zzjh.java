package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new zzji();
    public final String zza;
    public final byte[] zzb;
    public final String zzc;
    public final zzjf[] zzd;
    public final Map zze = new TreeMap();
    public final boolean zzf;
    public final long zzg;

    public zzjh(String str, String str2, zzjf[] zzjfVarArr, boolean z10, byte[] bArr, long j10) {
        this.zza = str;
        this.zzc = str2;
        this.zzd = zzjfVarArr;
        this.zzf = z10;
        this.zzb = bArr;
        this.zzg = j10;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.zze.put(Integer.valueOf(zzjfVar.zza), zzjfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjh) {
            zzjh zzjhVar = (zzjh) obj;
            if (zzkl.zza(this.zza, zzjhVar.zza) && zzkl.zza(this.zzc, zzjhVar.zzc) && this.zze.equals(zzjhVar.zze) && this.zzf == zzjhVar.zzf && Arrays.equals(this.zzb, zzjhVar.zzb) && this.zzg == zzjhVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzc, this.zze, Boolean.valueOf(this.zzf), this.zzb, Long.valueOf(this.zzg)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Configurations('");
        sb2.append(this.zza);
        sb2.append("', '");
        sb2.append(this.zzc);
        sb2.append("', (");
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            sb2.append((zzjf) it.next());
            sb2.append(", ");
        }
        sb2.append("), ");
        sb2.append(this.zzf);
        sb2.append(", ");
        byte[] bArr = this.zzb;
        sb2.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb2.append(", ");
        sb2.append(this.zzg);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzf);
        SafeParcelWriter.writeByteArray(parcel, 6, this.zzb, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}

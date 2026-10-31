package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzju extends AbstractSafeParcelable implements Comparable<zzju> {
    public static final Parcelable.Creator<zzju> CREATOR = new zzjv();
    public final int zza;
    public final int zzb;

    public zzju(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzju) && compareTo((zzju) obj) == 0;
    }

    public final int hashCode() {
        return (this.zza * 31) + this.zzb;
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 1);
        sb2.append("GenericDimension(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzju zzjuVar) {
        int i10 = this.zza;
        int i11 = zzjuVar.zza;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = this.zzb;
        int i13 = zzjuVar.zzb;
        if (i12 < i13) {
            return -1;
        }
        return i12 > i13 ? 1 : 0;
    }
}

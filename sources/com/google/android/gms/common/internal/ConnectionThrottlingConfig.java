package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.libs.throttling.ThrottlingLimits;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionThrottlingConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionThrottlingConfig> CREATOR = new zzm();
    private final SparseArray zza;

    public ConnectionThrottlingConfig(SparseArray sparseArray) {
        this.zza = sparseArray != null ? sparseArray.clone() : new SparseArray(0);
    }

    public SparseArray<ThrottlingLimits> getLimitsMap() {
        return this.zza.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedSparseArray(parcel, 1, getLimitsMap(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ThrottlingLimits zza(int i10) {
        SparseArray sparseArray = this.zza;
        return (ThrottlingLimits) sparseArray.get(i10, (ThrottlingLimits) sparseArray.get(0));
    }
}

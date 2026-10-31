package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThrottlingLimits extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThrottlingLimits> CREATOR = new zzc();
    private final int zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public static final class Builder {
        private final ThrottlingLimits zza = new ThrottlingLimits((byte[]) null);
    }

    private ThrottlingLimits() {
        this.zza = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingLimits) {
            return Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(((ThrottlingLimits) obj).zza));
        }
        return false;
    }

    public int getMaxInflight() {
        return this.zza;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMaxInflight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    ThrottlingLimits(int i10) {
        this.zza = i10;
    }

    /* synthetic */ ThrottlingLimits(byte[] bArr) {
        this.zza = -1;
    }
}

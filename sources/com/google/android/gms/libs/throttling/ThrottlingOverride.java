package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThrottlingOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThrottlingOverride> CREATOR = new zzd();
    private ThrottlingSelector zza;
    private ThrottlingLimits zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public static final class Builder {
        private final ThrottlingOverride zza = new ThrottlingOverride(null);
    }

    private ThrottlingOverride() {
        throw null;
    }

    /* synthetic */ ThrottlingOverride(byte[] bArr) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingOverride) {
            ThrottlingOverride throttlingOverride = (ThrottlingOverride) obj;
            if (Objects.equal(this.zza, throttlingOverride.zza) && Objects.equal(this.zzb, throttlingOverride.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    ThrottlingOverride(ThrottlingSelector throttlingSelector, ThrottlingLimits throttlingLimits) {
        this.zza = throttlingSelector;
        this.zzb = throttlingLimits;
    }
}

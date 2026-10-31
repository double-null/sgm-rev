package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThrottlingSelector extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThrottlingSelector> CREATOR = new zzf();
    private String zza;
    private final int zzb;
    private final int zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public static final class Builder {
        private final ThrottlingSelector zza = new ThrottlingSelector(null);
    }

    private ThrottlingSelector() {
        this.zzb = -1;
        this.zzc = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThrottlingSelector) {
            ThrottlingSelector throttlingSelector = (ThrottlingSelector) obj;
            if (Objects.equal(this.zza, throttlingSelector.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(throttlingSelector.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(throttlingSelector.zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    ThrottlingSelector(String str, int i10, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
    }

    /* synthetic */ ThrottlingSelector(byte[] bArr) {
        this.zzb = -1;
        this.zzc = -1;
    }
}

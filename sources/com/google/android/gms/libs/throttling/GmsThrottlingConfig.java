package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class GmsThrottlingConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GmsThrottlingConfig> CREATOR = new zzb();
    private ThrottlingPolicy zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public static final class Builder {
        private final GmsThrottlingConfig zza = new GmsThrottlingConfig((byte[]) null);
    }

    private GmsThrottlingConfig() {
        throw null;
    }

    /* synthetic */ GmsThrottlingConfig(byte[] bArr) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GmsThrottlingConfig) {
            return Objects.equal(this.zza, ((GmsThrottlingConfig) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    GmsThrottlingConfig(ThrottlingPolicy throttlingPolicy) {
        this.zza = throttlingPolicy;
    }
}

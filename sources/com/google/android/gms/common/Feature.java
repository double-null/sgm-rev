package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();
    private final String zza;

    @Deprecated
    private final int zzb;
    private final long zzc;
    private final boolean zzd;

    public Feature(String str, int i10, long j10, boolean z10) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (matches(feature) && getIsFullyRolledOut() == feature.getIsFullyRolledOut()) {
                return true;
            }
        }
        return false;
    }

    public boolean getIsFullyRolledOut() {
        return this.zzd;
    }

    public String getName() {
        return this.zza;
    }

    public long getVersion() {
        long j10 = this.zzc;
        return j10 == -1 ? this.zzb : j10;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()), Boolean.valueOf(getIsFullyRolledOut()));
    }

    public boolean matches(Feature feature) {
        return feature != null && Objects.equal(getName(), feature.getName()) && getVersion() == feature.getVersion();
    }

    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Long.valueOf(getVersion()));
        stringHelper.add("is_fully_rolled_out", Boolean.valueOf(getIsFullyRolledOut()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 4, getIsFullyRolledOut());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public Feature(String str, int i10, long j10) {
        this(str, i10, j10, false);
    }

    public Feature(String str, long j10) {
        this(str, -1, j10, false);
    }

    public Feature(String str, long j10, boolean z10) {
        this(str, -1, j10, z10);
    }
}

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public VersionInfoParcel(int i10, int i11, boolean z10) {
        this(i10, i11, z10, false, false);
    }

    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.afmaVersion, false);
        SafeParcelWriter.writeInt(parcel, 3, this.buddyApkVersion);
        SafeParcelWriter.writeInt(parcel, 4, this.clientJarVersion);
        SafeParcelWriter.writeBoolean(parcel, 5, this.isClientJar);
        SafeParcelWriter.writeBoolean(parcel, 6, this.isLiteSdk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10, boolean z11) {
        this(i10, i11, z10, false, z11);
    }

    public VersionInfoParcel(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        String str = z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : z11 ? "2" : AppEventsConstants.EVENT_PARAM_VALUE_YES;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length() + 2);
        sb2.append("afma-sdk-a-v");
        sb2.append(i10);
        sb2.append(".");
        sb2.append(i11);
        sb2.append(".");
        sb2.append(str);
        this(sb2.toString(), i10, i11, z10, z12);
    }

    VersionInfoParcel(String str, int i10, int i11, boolean z10, boolean z11) {
        this.afmaVersion = str;
        this.buddyApkVersion = i10;
        this.clientJarVersion = i11;
        this.isClientJar = z10;
        this.isLiteSdk = z11;
    }
}

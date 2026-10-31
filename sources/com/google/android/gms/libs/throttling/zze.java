package com.google.android.gms.libs.throttling;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ThrottlingLimits throttlingLimits = null;
        boolean z10 = false;
        ThrottlingOverride[] throttlingOverrideArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z10 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                throttlingLimits = (ThrottlingLimits) SafeParcelReader.createParcelable(parcel, header, ThrottlingLimits.CREATOR);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                throttlingOverrideArr = (ThrottlingOverride[]) SafeParcelReader.createTypedArray(parcel, header, ThrottlingOverride.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ThrottlingPolicy(z10, throttlingLimits, throttlingOverrideArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ThrottlingPolicy[i10];
    }
}

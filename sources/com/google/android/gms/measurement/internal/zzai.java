package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        zzpl zzplVar = null;
        String strCreateString3 = null;
        zzbh zzbhVar = null;
        zzbh zzbhVar2 = null;
        zzbh zzbhVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    zzplVar = (zzpl) SafeParcelReader.createParcelable(parcel, header, zzpl.CREATOR);
                    break;
                case 5:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    zzbhVar = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                case 9:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    zzbhVar2 = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                case 11:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    zzbhVar3 = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzah(strCreateString, strCreateString2, zzplVar, j10, z10, strCreateString3, zzbhVar, j11, zzbhVar2, j12, zzbhVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzah[i10];
    }
}

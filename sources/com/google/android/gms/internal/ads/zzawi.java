package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzawi implements Comparator {
    private final boolean zza;

    public zzawi(boolean z10) {
        this.zza = z10;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 496612959;
        zzawm zzawmVar = (zzawm) obj;
        zzawm zzawmVar2 = (zzawm) obj2;
        int i20 = zzawmVar.zza;
        if (i20 != zzawmVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i21 = i19 ^ i18;
        try {
            if (i20 == 0) {
                throw null;
            }
            switch (i20 + i21) {
                case 0:
                default:
                    return 0;
                case 1:
                    if (!this.zza) {
                        throw new IllegalArgumentException();
                    }
                    if (zzawmVar.zzl() == zzawmVar2.zzl()) {
                        return 0;
                    }
                case 2:
                    return Long.compare(zzawmVar.zzm(), zzawmVar2.zzm());
                case 3:
                    comparatorZza = zzavq.zzc;
                    objZzn = zzawmVar.zzn();
                    objZzn2 = zzawmVar2.zzn();
                    return comparatorZza.compare(objZzn, objZzn2);
                case 4:
                    objZzn = zzawmVar.zzo();
                    objZzn2 = zzawmVar2.zzo();
                    comparatorZza = zzgvw.zza(this);
                    return comparatorZza.compare(objZzn, objZzn2);
                case 5:
                    if (this.zza) {
                        return zzawmVar.zzp() != zzawmVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzawmVar.zzq(), zzawmVar2.zzq());
            }
        } catch (zzawj e10) {
            throw new AssertionError(zzavo.zza("CEiv6BFfPnitUE+D"), e10);
        }
    }
}

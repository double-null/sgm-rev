package com.google.android.gms.internal.ads;

import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgzd extends zzgzg {
    final char[] zza;

    private zzgzd(zzgzc zzgzcVar) {
        super(zzgzcVar, null);
        this.zza = new char[512];
        zzgtj.zza(zzgzcVar.zzf().length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzgzcVar.zza(i10 >>> 4);
            this.zza[i10 | UserVerificationMethods.USER_VERIFY_HANDPRINT] = zzgzcVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgtj.zzo(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | UserVerificationMethods.USER_VERIFY_HANDPRINT]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgzf {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 21);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new zzgzf(sb2.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            zzgzc zzgzcVar = this.zzb;
            bArr[i11] = (byte) (zzgzcVar.zzc(charSequence.charAt(i10 + 1)) | (zzgzcVar.zzc(charSequence.charAt(i10)) << 4));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final zzgzh zzc(zzgzc zzgzcVar, Character ch) {
        return new zzgzd(zzgzcVar);
    }

    zzgzd(String str, String str2) {
        this(new zzgzc("base16()", yhXxbqGRMeI.VfKS.toCharArray()));
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgze extends zzgzg {
    private zzgze(zzgzc zzgzcVar, Character ch) {
        super(zzgzcVar, ch);
        zzgtj.zza(zzgzcVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgtj.zzo(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            int i16 = bArr[i14] & 255;
            int i17 = i14 + 1;
            int i18 = bArr[i17] & 255;
            zzgzc zzgzcVar = this.zzb;
            int i19 = (i15 << 16) | (i16 << 8) | i18;
            appendable.append(zzgzcVar.zza(i19 >>> 18));
            appendable.append(zzgzcVar.zza((i19 >>> 12) & 63));
            appendable.append(zzgzcVar.zza((i19 >>> 6) & 63));
            appendable.append(zzgzcVar.zza(i19 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgzf {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgzc zzgzcVar = this.zzb;
        if (!zzgzcVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length2).length() + 21);
            sb2.append("Invalid input length ");
            sb2.append(length2);
            throw new zzgzf(sb2.toString());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            int i12 = i10 + 1;
            int i13 = i11 + 1;
            int iZzc = (zzgzcVar.zzc(charSequenceZzg.charAt(i10)) << 18) | (zzgzcVar.zzc(charSequenceZzg.charAt(i12)) << 12);
            bArr[i11] = (byte) (iZzc >>> 16);
            int i14 = i12 + 1;
            if (i14 < charSequenceZzg.length()) {
                int i15 = i14 + 1;
                int iZzc2 = iZzc | (zzgzcVar.zzc(charSequenceZzg.charAt(i14)) << 6);
                i11 = i13 + 1;
                bArr[i13] = (byte) ((iZzc2 >>> 8) & 255);
                if (i15 < charSequenceZzg.length()) {
                    bArr[i11] = (byte) ((iZzc2 | zzgzcVar.zzc(charSequenceZzg.charAt(i15))) & 255);
                    i11++;
                    i10 = i15 + 1;
                } else {
                    i10 = i15;
                }
            } else {
                i10 = i14;
                i11 = i13;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final zzgzh zzc(zzgzc zzgzcVar, Character ch) {
        return new zzgze(zzgzcVar, ch);
    }

    zzgze(String str, String str2, Character ch) {
        this(new zzgzc(str, str2.toCharArray()), ch);
    }
}

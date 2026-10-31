package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbd extends zzbe {
    zzbd(String str, String str2, Character ch) {
        zzbb zzbbVar = new zzbb(str, str2.toCharArray());
        super(zzbbVar, ch);
        zzam.zzc(zzbbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzam.zze(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            int i16 = bArr[i14] & 255;
            int i17 = i14 + 1;
            int i18 = (i15 << 16) | (i16 << 8) | (bArr[i17] & 255);
            appendable.append(this.zzb.zza(i18 >>> 18));
            appendable.append(this.zzb.zza((i18 >>> 12) & 63));
            appendable.append(this.zzb.zza((i18 >>> 6) & 63));
            appendable.append(this.zzb.zza(i18 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            zzc(appendable, bArr, i12, i11 - i12);
        }
    }
}

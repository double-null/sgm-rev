package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
class zzgzg extends zzgzh {
    private volatile zzgzh zza;
    final zzgzc zzb;
    final Character zzc;

    zzgzg(zzgzc zzgzcVar, Character ch) {
        this.zzb = zzgzcVar;
        boolean z10 = true;
        if (ch != null) {
            ch.charValue();
            if (zzgzcVar.zze('=')) {
                z10 = false;
            }
        }
        zzgtj.zzf(z10, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgzg) {
            zzgzg zzgzgVar = (zzgzg) obj;
            if (this.zzb.equals(zzgzgVar.zzb) && Objects.equals(this.zzc, zzgzgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzgzc zzgzcVar = this.zzb;
        sb2.append(zzgzcVar);
        if (8 % zzgzcVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgtj.zzo(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.zzb.zzd;
            zze(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    int zzb(byte[] bArr, CharSequence charSequence) throws zzgzf {
        int i10;
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
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = zzgzcVar.zzc;
                if (i13 >= i10) {
                    break;
                }
                jZzc <<= zzgzcVar.zzb;
                if (i11 + i13 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgzcVar.zzc(charSequenceZzg.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzgzcVar.zzd;
            int i16 = i14 * zzgzcVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzc >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    zzgzh zzc(zzgzc zzgzcVar, Character ch) {
        return new zzgzg(zzgzcVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    final int zzd(int i10) {
        zzgzc zzgzcVar = this.zzb;
        return zzgzcVar.zzc * zzgzz.zzb(i10, zzgzcVar.zzd, RoundingMode.CEILING);
    }

    final void zze(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgtj.zzo(i10, i10 + i11, bArr.length);
        zzgzc zzgzcVar = this.zzb;
        int i12 = zzgzcVar.zzd;
        int i13 = 0;
        zzgtj.zza(i11 <= i12);
        long j10 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j10 = (j10 | ((long) (bArr[i10 + i14] & 255))) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = zzgzcVar.zzb;
        while (i13 < i11 * 8) {
            appendable.append(zzgzcVar.zza(zzgzcVar.zza & ((int) (j10 >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        Character ch = this.zzc;
        if (ch != null) {
            while (i13 < i12 * 8) {
                ch.charValue();
                appendable.append('=');
                i13 += i16;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    final int zzf(int i10) {
        return (int) (((((long) this.zzb.zzb) * ((long) i10)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final zzgzh zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final zzgzh zzi() {
        zzgzh zzgzhVarZzc = this.zza;
        if (zzgzhVarZzc == null) {
            zzgzc zzgzcVar = this.zzb;
            zzgzc zzgzcVarZzd = zzgzcVar.zzd();
            zzgzhVarZzc = zzgzcVarZzd == zzgzcVar ? this : zzc(zzgzcVarZzd, this.zzc);
            this.zza = zzgzhVarZzc;
        }
        return zzgzhVarZzc;
    }

    zzgzg(String str, String str2, Character ch) {
        this(new zzgzc(str, str2.toCharArray()), ch);
    }
}

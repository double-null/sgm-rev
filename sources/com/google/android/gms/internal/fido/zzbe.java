package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* JADX INFO: loaded from: classes3.dex */
class zzbe extends zzbf {
    final zzbb zzb;
    final Character zzc;

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    zzbe(zzbb zzbbVar, Character ch) {
        boolean z10;
        this.zzb = zzbbVar;
        if (ch != null) {
            ch.charValue();
            if (zzbbVar.zzb('=')) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(zzan.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzb.equals(zzbeVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzbeVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        return iHashCode ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzam.zze(0, i11, bArr.length);
        while (i12 < i11) {
            zzc(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    final int zzb(int i10) {
        zzbb zzbbVar = this.zzb;
        return zzbbVar.zzc * zzbh.zza(i10, zzbbVar.zzd, RoundingMode.CEILING);
    }

    final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzam.zze(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzam.zzc(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzbb zzbbVar = this.zzb;
            appendable.append(zzbbVar.zza(zzbbVar.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    zzbe(String str, String str2, Character ch) {
        this(new zzbb(str, str2.toCharArray()), ch);
    }
}

package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.android.billingclient:billing@@9.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfg implements Iterable, Serializable {
    public static final zzfg zza = new zzfe(zzgm.zza);
    private int zzb = 0;

    static {
        int i10 = zzet.zza;
    }

    zzfg() {
    }

    static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static zzfg zzk(byte[] bArr, int i10, int i11) {
        try {
            zzj(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new zzfe(bArr2);
        } catch (zzgs e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzj(i10, i13, bArr.length);
        zzj(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfg)) {
            return false;
        }
        zzfg zzfgVar = (zzfg) obj;
        int iZzd = zzd();
        if (iZzd != zzfgVar.zzd()) {
            return false;
        }
        if (iZzd == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzfgVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzh(zzfgVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzc = this.zzb;
        if (iZzc == 0) {
            int iZzd = zzd();
            iZzc = zzc(iZzd, 0, iZzd);
            if (iZzc == 0) {
                iZzc = 1;
            }
            this.zzb = iZzc;
        }
        return iZzc;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzey(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzij.zza(zzm()) : zzij.zza(zze(0, 47).zzm()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    abstract byte zza(int i10);

    protected abstract int zzc(int i10, int i11, int i12);

    public abstract int zzd();

    public abstract zzfg zze(int i10, int i11);

    protected abstract void zzf(byte[] bArr, int i10, int i11, int i12);

    abstract void zzg(zzex zzexVar) throws IOException;

    protected abstract boolean zzh(zzfg zzfgVar);

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgm.zza;
        }
        byte[] bArr = new byte[iZzd];
        zzf(bArr, 0, 0, iZzd);
        return bArr;
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzacr implements Iterable, Serializable {
    public static final zzacr zza = new zzacq(zzaed.zza);
    private int zzb = 0;

    static {
        int i10 = zzacf.zza;
    }

    zzacr() {
    }

    public static zzacr zzj(byte[] bArr, int i10, int i11) {
        try {
            return zzk(bArr, i10, i11, false);
        } catch (zzaeh e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static zzacr zzk(byte[] bArr, int i10, int i11, boolean z10) throws zzaeh {
        if (i11 == 0) {
            return zza;
        }
        zzn(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzacq(bArr2);
    }

    static zzacr zzl(byte[] bArr, boolean z10) throws zzaeh {
        return bArr.length == 0 ? zza : new zzacq(bArr);
    }

    static int zzn(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    static /* synthetic */ boolean zzo(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzn(i10, i13, bArr.length);
        zzn(i11, i12 + i11, bArr2.length);
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
        if (!(obj instanceof zzacr)) {
            return false;
        }
        zzacr zzacrVar = (zzacr) obj;
        int iZzb = zzb();
        if (iZzb != zzacrVar.zzb()) {
            return false;
        }
        if (iZzb == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzacrVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzf(zzacrVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzg = this.zzb;
        if (iZzg == 0) {
            int iZzb = zzb();
            iZzg = zzg(iZzb, 0, iZzb);
            if (iZzg == 0) {
                iZzg = 1;
            }
            this.zzb = iZzg;
        }
        return iZzg;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzack(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        objArr[2] = zzb() <= 50 ? zzafx.zza(zzm()) : zzafx.zza(zzc(0, 47).zzm()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    abstract byte zza(int i10);

    public abstract int zzb();

    public abstract zzacr zzc(int i10, int i11);

    protected abstract void zzd(byte[] bArr, int i10, int i11, int i12);

    abstract void zze(zzacj zzacjVar) throws IOException;

    protected abstract boolean zzf(zzacr zzacrVar);

    protected abstract int zzg(int i10, int i11, int i12);

    public final byte[] zzm() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzaed.zza;
        }
        byte[] bArr = new byte[iZzb];
        zzd(bArr, 0, 0, iZzb);
        return bArr;
    }
}

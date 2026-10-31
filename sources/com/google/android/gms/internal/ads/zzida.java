package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzida implements Iterable<Byte>, Serializable {
    public static final zzida zza = new zzicy(zzier.zza);
    private int zzb = 0;

    static {
        int i10 = zzicn.zza;
    }

    zzida() {
    }

    public static zzicz zzC() {
        return new zzicz(128);
    }

    static int zzD(int i10, int i11, int i12) {
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

    static /* synthetic */ boolean zzE(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzD(i10, i13, bArr.length);
        zzD(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    private static zzida zzk(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (zzida) it.next();
        }
        int i11 = i10 >>> 1;
        zzida zzidaVarZzk = zzk(it, i11);
        zzida zzidaVarZzk2 = zzk(it, i10 - i11);
        if (Integer.MAX_VALUE - zzidaVarZzk.zzb() >= zzidaVarZzk2.zzb()) {
            return zzigg.zzk(zzidaVarZzk, zzidaVarZzk2);
        }
        int iZzb = zzidaVarZzk.zzb();
        int iZzb2 = zzidaVarZzk2.zzb();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 31 + String.valueOf(iZzb2).length());
        sb2.append("ByteString would be too long: ");
        sb2.append(iZzb);
        sb2.append("+");
        sb2.append(iZzb2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static zzida zzt(byte[] bArr, int i10, int i11) {
        try {
            return zzu(bArr, i10, i11, false);
        } catch (zziet e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static zzida zzu(byte[] bArr, int i10, int i11, boolean z10) throws zziet {
        if (i11 == 0) {
            return zza;
        }
        zzD(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzicy(bArr2);
    }

    static zzida zzv(byte[] bArr) {
        try {
            return zzw(bArr, false);
        } catch (zziet e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static zzida zzw(byte[] bArr, boolean z10) throws zziet {
        return bArr.length == 0 ? zza : new zzicy(bArr);
    }

    public static zzida zzx(String str) {
        return str.isEmpty() ? zza : new zzicy(str.getBytes(StandardCharsets.UTF_8));
    }

    public static zzida zzy(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzida)) {
            return false;
        }
        zzida zzidaVar = (zzida) obj;
        int iZzb = zzb();
        if (iZzb != zzidaVar.zzb()) {
            return false;
        }
        if (iZzb == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzidaVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzj(zzidaVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzl = this.zzb;
        if (iZzl == 0) {
            int iZzb = zzb();
            iZzl = zzl(iZzb, 0, iZzb);
            if (iZzl == 0) {
                iZzl = 1;
            }
            this.zzb = iZzl;
        }
        return iZzl;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzb());
        objArr[2] = zzb() <= 50 ? zzigp.zza(zzA()) : zzigp.zza(zzd(0, 47).zzA()).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzier.zza;
        }
        byte[] bArr = new byte[iZzb];
        zze(bArr, 0, 0, iZzb);
        return bArr;
    }

    public final String zzB(Charset charset) {
        return zzs() ? "" : zzh(charset);
    }

    abstract byte zza(int i10);

    public abstract int zzb();

    public abstract zzida zzc(int i10, int i11);

    public abstract zzida zzd(int i10, int i11);

    protected abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract ByteBuffer zzf();

    abstract void zzg(zzicr zzicrVar) throws IOException;

    protected abstract String zzh(Charset charset);

    public abstract boolean zzi();

    protected abstract boolean zzj(zzida zzidaVar);

    protected abstract int zzl(int i10, int i11, int i12);

    public abstract zzide zzm();

    protected abstract int zzp();

    protected abstract boolean zzq();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public zzicv iterator() {
        return new zzics(this);
    }

    public final boolean zzs() {
        return zzb() == 0;
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzD(0, i12, zzb());
        zzD(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}

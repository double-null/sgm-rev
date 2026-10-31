package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzacv {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    final int zzc = zze;
    Object zzd;

    private zzacv() {
    }

    public static zzacv zzM(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? zzN(zzaed.zza, 0, 0, false) : new zzacu(inputStream, i10, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static zzacv zzN(byte[] bArr, int i10, int i11, boolean z10) {
        zzact zzactVar = new zzact(bArr, 0, 0, false, null);
        try {
            zzactVar.zzD(0);
            return zzactVar;
        } catch (zzaeh e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zzR(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzS(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    static /* synthetic */ void zzT(byte[] bArr, int i10, int i11) {
        if ((bArr.length - i10) - i11 < 0 || (i10 | i11) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public abstract int zzD(int i10) throws zzaeh;

    public abstract void zzE(int i10);

    public abstract int zzF();

    public abstract boolean zzG() throws IOException;

    public abstract int zzH();

    public abstract int zzK(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzL(int i10) throws IOException;

    public final void zzO() throws zzaeh {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzP() throws zzaeh {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzQ() throws IOException {
        boolean zZzc;
        do {
            int iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzO();
            this.zzb++;
            zZzc = zzc(iZza);
            this.zzb--;
        } while (zZzc);
    }

    public abstract int zza() throws IOException;

    public abstract void zzb(int i10) throws zzaeh;

    public abstract boolean zzc(int i10) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zzacr zzn() throws IOException;

    public abstract byte[] zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract int zzr() throws IOException;

    public abstract long zzs() throws IOException;

    public abstract int zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract int zzx() throws IOException;

    public abstract long zzz() throws IOException;

    /* synthetic */ zzacv(byte[] bArr) {
    }
}

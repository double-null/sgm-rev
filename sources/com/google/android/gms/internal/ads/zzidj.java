package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzidj extends zzicr {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zziha.zza();
    Object zza;

    private zzidj() {
        throw null;
    }

    /* synthetic */ zzidj(byte[] bArr) {
    }

    static int zzE(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzF(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzG(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzH(zzifp zzifpVar) {
        int iZzbr = zzifpVar.zzbr();
        return zzF(iZzbr) + iZzbr;
    }

    public final void zzI() {
        if (zzy() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (zzy() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void zzb(int i10, int i11) throws IOException;

    public abstract void zzc(int i10, int i11) throws IOException;

    public abstract void zzd(int i10, int i11) throws IOException;

    public abstract void zze(int i10, int i11) throws IOException;

    public abstract void zzf(int i10, long j10) throws IOException;

    public abstract void zzg(int i10, long j10) throws IOException;

    public abstract void zzh(int i10, boolean z10) throws IOException;

    public abstract void zzi(int i10, String str) throws IOException;

    public abstract void zzj(int i10, zzida zzidaVar) throws IOException;

    public abstract void zzk(zzida zzidaVar) throws IOException;

    abstract void zzl(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzm(int i10, zzifp zzifpVar) throws IOException;

    public abstract void zzn(int i10, zzida zzidaVar) throws IOException;

    public abstract void zzo(zzifp zzifpVar) throws IOException;

    public abstract void zzp(byte b10) throws IOException;

    public abstract void zzq(int i10) throws IOException;

    public abstract void zzr(int i10) throws IOException;

    public abstract void zzs(int i10) throws IOException;

    public abstract void zzt(long j10) throws IOException;

    public abstract void zzu(long j10) throws IOException;

    public abstract void zzw(String str) throws IOException;

    public abstract void zzx() throws IOException;

    public abstract int zzy();
}

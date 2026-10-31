package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import c2.YDwL.tFQWuE;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlu implements Handler.Callback, zzxh, zzabg, zzmq, zzjh, zzmu, zzcc, zzadr {
    private static final long zza = zzfl.zzr(10000);
    private final boolean zzA;
    private zzni zzB;
    private boolean zzD;
    private boolean zzE;
    private zzlt zzF;
    private int zzG;
    private zzms zzH;
    private zzlr zzI;
    private boolean zzJ;
    private boolean zzL;
    private boolean zzM;
    private boolean zzO;
    private boolean zzR;
    private int zzS;
    private zzlt zzT;
    private long zzU;
    private long zzV;
    private int zzW;
    private boolean zzX;
    private zzjk zzY;
    private zzju zzaa;
    private boolean zzac;
    private final zzjd zzae;
    private final zzne[] zzb;
    private final zznc[] zzc;
    private final boolean[] zzd;
    private final zzabh zze;
    private final zzabi zzf;
    private final zzly zzg;
    private final zzabq zzh;
    private final zzdz zzi;
    private final zzmt zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zzji zzo;
    private final ArrayList zzp;
    private final zzdo zzq;
    private final zzls zzr;
    private final zzmf zzs;
    private final zzmr zzt;
    private final long zzu;
    private final zzqf zzv;
    private final zznm zzw;
    private final zzdz zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzab = -9223372036854775807L;
    private int zzP = 0;
    private boolean zzQ = false;
    private boolean zzK = false;
    private float zzad = 1.0f;
    private zznh zzC = zznh.zza;
    private long zzZ = -9223372036854775807L;
    private long zzN = -9223372036854775807L;

    public zzlu(Context context, zzna[] zznaVarArr, zzna[] zznaVarArr2, zzabh zzabhVar, zzabi zzabiVar, zzly zzlyVar, zzabq zzabqVar, int i10, boolean z10, zznm zznmVar, zzni zzniVar, zzjd zzjdVar, long j10, boolean z11, boolean z12, Looper looper, zzdo zzdoVar, zzls zzlsVar, zzqf zzqfVar, zzmt zzmtVar, zzju zzjuVar, final zzadr zzadrVar, boolean z13) {
        this.zzr = zzlsVar;
        this.zze = zzabhVar;
        this.zzf = zzabiVar;
        this.zzg = zzlyVar;
        this.zzh = zzabqVar;
        this.zzB = zzniVar;
        this.zzae = zzjdVar;
        this.zzu = j10;
        this.zzq = zzdoVar;
        this.zzv = zzqfVar;
        this.zzaa = zzjuVar;
        this.zzw = zznmVar;
        this.zzA = z13;
        this.zzn = zzlyVar.zzf(zzqfVar);
        zzlyVar.zzg(zzqfVar);
        zzbf zzbfVar = zzbf.zza;
        zzms zzmsVarZza = zzms.zza(zzabiVar);
        this.zzH = zzmsVarZza;
        this.zzI = new zzlr(zzmsVarZza);
        int length = zznaVarArr.length;
        this.zzc = new zznc[2];
        this.zzd = new boolean[2];
        zznb zznbVarZzg = zzabhVar.zzg();
        this.zzb = new zzne[2];
        boolean z14 = false;
        for (int i11 = 0; i11 < 2; i11++) {
            zznaVarArr[i11].zzc(i11, zzqfVar, zzdoVar);
            this.zzc[i11] = zznaVarArr[i11].zzb();
            this.zzc[i11].zzv(zznbVarZzg);
            zzna zznaVar = zznaVarArr2[i11];
            if (zznaVar != null) {
                zznaVar.zzc(i11, zzqfVar, zzdoVar);
                z14 = true;
            }
            this.zzb[i11] = new zzne(zznaVarArr[i11], zznaVarArr2[i11], i11);
        }
        this.zzy = z14;
        this.zzo = new zzji(this, zzdoVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzabhVar.zzs(this, zzabqVar);
        this.zzX = true;
        zzdz zzdzVarZzd = zzdoVar.zzd(looper, null);
        this.zzx = zzdzVarZzd;
        this.zzs = new zzmf(zznmVar, zzdzVarZzd, new zzln(this), zzjuVar);
        this.zzt = new zzmr(this, zznmVar, zzdzVarZzd, zzqfVar);
        zzmt zzmtVar2 = new zzmt(null);
        this.zzj = zzmtVar2;
        Looper looperZza = zzmtVar2.zza();
        this.zzk = looperZza;
        zzdz zzdzVarZzd2 = zzdoVar.zzd(looperZza, this);
        this.zzi = zzdzVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdzVarZzd2.zzd(35, new zzadr() { // from class: com.google.android.gms.internal.ads.zzlj
            @Override // com.google.android.gms.internal.ads.zzadr
            public final /* synthetic */ void zzcS(long j11, long j12, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j11, j12, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i10) {
        zzmf zzmfVar = this.zzs;
        zzjk zzjkVarZza = zzjk.zza(iOException, i10);
        zzmc zzmcVarZzm = zzmfVar.zzm();
        if (zzmcVarZzm != null) {
            zzjkVarZza = zzjkVarZza.zzd(zzmcVarZzm.zzg.zza);
        }
        zzeg.zzf("ExoPlayerImplInternal", "Playback error", zzjkVarZza);
        zzW(false, false);
        this.zzH = this.zzH.zzf(zzjkVarZza);
    }

    private final void zzB(int i10) {
        zzms zzmsVar = this.zzH;
        if (zzmsVar.zze != i10) {
            if (i10 != 2) {
                this.zzZ = -9223372036854775807L;
            }
            this.zzH = zzmsVar.zze(i10);
        }
    }

    private final void zzC() {
        this.zzI.zzb(this.zzH);
        if (this.zzI.zzd()) {
            this.zzr.zza(this.zzI);
            this.zzI = new zzlr(this.zzH);
        }
    }

    private final void zzD(float f10) throws zzjk {
        this.zzad = f10;
        float fZza = f10 * this.zzz.zza();
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzneVarArr[i10].zzL(fZza);
            i10++;
        }
    }

    private final void zzE(boolean z10, int i10, boolean z11, int i11) throws zzjk {
        this.zzI.zza(z11 ? 1 : 0);
        zzG(z10, i10, i11);
    }

    private final void zzF() throws zzjk {
        zzms zzmsVar = this.zzH;
        zzG(zzmsVar.zzl, zzmsVar.zzn, zzmsVar.zzm);
    }

    private final void zzG(boolean z10, int i10, int i11) throws zzjk {
        zzH(z10, this.zzz.zzc(z10, this.zzH.zze), i10, i11);
    }

    private final void zzH(boolean z10, int i10, int i11, int i12) throws zzjk {
        boolean z11;
        if (!z10) {
            z11 = false;
        } else if (i10 != -1) {
            z11 = true;
        } else {
            i10 = -1;
            z11 = false;
        }
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.zzD;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        zzms zzmsVar = this.zzH;
        if (zzmsVar.zzl == z11 && zzmsVar.zzn == i11 && zzmsVar.zzm == i12) {
            return;
        }
        this.zzH = zzmsVar.zzi(z11, i12, i11);
        zzaD(false, false);
        zzmf zzmfVar = this.zzs;
        for (zzmc zzmcVarZzm = zzmfVar.zzm(); zzmcVarZzm != null; zzmcVarZzm = zzmcVarZzm.zzp()) {
            for (zzaba zzabaVar : zzmcVarZzm.zzr().zzc) {
            }
        }
        if (!zzay()) {
            zzK();
            zzL();
            boolean z13 = this.zzH.zzp;
            zzmfVar.zzf(this.zzU);
            return;
        }
        int i13 = this.zzH.zze;
        if (i13 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i13 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z10) throws zzjk {
        zzxk zzxkVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzxkVar, this.zzH.zzs, true, false);
        if (jZzT != this.zzH.zzs) {
            zzms zzmsVar = this.zzH;
            this.zzH = zzap(zzxkVar, jZzT, zzmsVar.zzc, zzmsVar.zzd, z10, 5);
        }
    }

    private final void zzJ() throws zzjk {
        zzmc zzmcVarZzm = this.zzs.zzm();
        if (zzmcVarZzm == null) {
            return;
        }
        zzabi zzabiVarZzr = zzmcVarZzm.zzr();
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            if (zzabiVarZzr.zza(i10)) {
                zzneVarArr[i10].zzv();
            }
            i10++;
        }
    }

    private final void zzK() throws zzjk {
        this.zzo.zzb();
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzneVarArr[i10].zzw();
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzjk {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlu.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i10, final boolean z10) {
        boolean[] zArr = this.zzd;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i10, z10);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j10) {
        int i10 = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j11 = zzbeVar.zzg;
        String str = zzfl.zza;
        return zzfl.zzs((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j10;
    }

    private final boolean zzP(zzbf zzbfVar, zzxk zzxkVar) {
        if (!zzxkVar.zzb() && !zzbfVar.zzg()) {
            int i10 = zzbfVar.zzo(zzxkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i10, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j10) {
        long jMin = 1000;
        if (zzw()) {
            jMin = this.zzH.zze != 3 ? zza : 1000L;
            zzne[] zzneVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                jMin = Math.min(jMin, zzfl.zzr(zzneVarArr[i10].zzk(this.zzU, this.zzV)));
            }
            if (this.zzH.zzj()) {
                zzmf zzmfVar = this.zzs;
                zzmc zzmcVarZzp = zzmfVar.zzm() != null ? zzmfVar.zzm().zzp() : null;
                if (zzmcVarZzp != null) {
                    if (this.zzU + (zzfl.zzs(jMin) * this.zzH.zzo.zzb) >= zzmcVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzH.zze != 3 || zzay()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j10 + jMin);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0132 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:27:0x00b0, B:29:0x00ba, B:32:0x00c0, B:34:0x00c6, B:35:0x00c9, B:37:0x00d1, B:39:0x00dd, B:41:0x00e5, B:45:0x00ed, B:49:0x00fe, B:50:0x0102, B:52:0x010a, B:54:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x012d, B:64:0x0132, B:66:0x013a, B:68:0x0140, B:71:0x0149, B:75:0x0153, B:69:0x0144), top: B:91:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148 A[EDGE_INSN: B:70:0x0148->B:71:0x0149 BREAK  A[LOOP:0: B:63:0x0130->B:69:0x0144]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:78:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0148 A[SYNTHETIC] */
    private final void zzR(zzlt zzltVar) throws Throwable {
        long jLongValue;
        boolean z10;
        zzxk zzxkVar;
        long jMax;
        long j10;
        boolean z11;
        long j11;
        long jZzk;
        boolean z12;
        boolean z13;
        long jZzS;
        boolean z14;
        long j12;
        zzne[] zzneVarArr;
        int i10;
        zzne zzneVar;
        zzmc zzmcVarZzm;
        zzms zzmsVar;
        int i11;
        if (this.zzE) {
            if (this.zzF != null) {
                this.zzG++;
                this.zzI.zza(1);
            }
            this.zzF = zzltVar;
            return;
        }
        this.zzI.zza(1);
        zzbf zzbfVar = this.zzH.zza;
        int i12 = this.zzP;
        boolean z15 = this.zzQ;
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzaE = zzaE(zzbfVar, zzltVar, true, i12, z15, zzbeVar, zzbdVar);
        long j13 = -9223372036854775807L;
        try {
            if (pairZzaE != null) {
                Object obj = pairZzaE.first;
                jLongValue = ((Long) pairZzaE.second).longValue();
                long j14 = zzltVar.zzc;
                j13 = j14 != -9223372036854775807L ? jLongValue : -9223372036854775807L;
                zzxk zzxkVarZzy = this.zzs.zzy(this.zzH.zza, obj, jLongValue);
                if (zzxkVarZzy.zzb()) {
                    this.zzH.zza.zzo(zzxkVarZzy.zza, zzbdVar);
                    int i13 = zzxkVarZzy.zzb;
                    if (zzbdVar.zzd(i13) == zzxkVarZzy.zzc) {
                        zzbdVar.zzj();
                    }
                    long j15 = zzbdVar.zzg.zza(i13).zza;
                    jMax = Math.max(j13, 0L);
                    zzxkVar = zzxkVarZzy;
                    z10 = true;
                    j10 = 0;
                } else {
                    z10 = j14 == -9223372036854775807L;
                    zzxkVar = zzxkVarZzy;
                }
                if (this.zzH.zza.zzg()) {
                    if (pairZzaE == null) {
                        if (this.zzH.zze != 1) {
                            zzB(4);
                        }
                        zzX(false, true, false, true);
                    } else {
                        if (zzxkVar.equals(this.zzH.zzb)) {
                            zzmcVarZzm = this.zzs.zzm();
                            if (zzmcVarZzm == null && zzmcVarZzm.zze && j10 != 0) {
                                zzxi zzxiVar = zzmcVarZzm.zza;
                                long j16 = zzbeVar.zzm;
                                if (this.zzD && j16 != -9223372036854775807L) {
                                    Double d10 = this.zzC.zzc;
                                }
                                jZzk = zzxiVar.zzk(j10, this.zzB);
                            } else {
                                jZzk = j10;
                            }
                            if (zzfl.zzr(jZzk) != zzfl.zzr(this.zzH.zzs) && ((i11 = (zzmsVar = this.zzH).zze) == 2 || i11 == 3)) {
                                z11 = z10;
                                j12 = zzmsVar.zzs;
                            }
                        } else {
                            jZzk = j10;
                        }
                        if (this.zzD) {
                            z12 = true;
                            break;
                        }
                        zzneVarArr = this.zzb;
                        i10 = 0;
                        while (true) {
                            if (i10 < 2) {
                                z12 = true;
                                break;
                            }
                            zzneVar = zzneVarArr[i10];
                            if (!zzneVar.zzM() && zzneVar.zze() == 2) {
                                z12 = true;
                                this.zzE = true;
                                break;
                            }
                            i10++;
                        }
                        if (this.zzH.zze == 4) {
                            z13 = z12;
                        } else {
                            z13 = false;
                        }
                        jZzS = zzS(zzxkVar, jZzk, z13);
                        if (j10 != jZzS) {
                            z14 = z12;
                        } else {
                            z14 = false;
                        }
                        z11 = z10 | z14;
                        try {
                            zzms zzmsVar2 = this.zzH;
                            zzbf zzbfVar2 = zzmsVar2.zza;
                            zzag(zzbfVar2, zzxkVar, zzbfVar2, zzmsVar2.zzb, jMax, true);
                            j12 = jZzS;
                        } catch (Throwable th) {
                            th = th;
                            j11 = jZzS;
                            this.zzH = zzap(zzxkVar, j11, jMax, j11, z11, 2);
                            throw th;
                        }
                    }
                    this.zzH = zzap(zzxkVar, j12, jMax, j12, z11, 2);
                    return;
                }
                this.zzT = zzltVar;
                z11 = z10;
                j12 = j10;
                this.zzH = zzap(zzxkVar, j12, jMax, j12, z11, 2);
                return;
            }
            Pair pairZzY = zzY(this.zzH.zza);
            zzxkVar = (zzxk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z10 = !this.zzH.zza.zzg();
            if (this.zzH.zza.zzg()) {
                if (pairZzaE == null) {
                    if (this.zzH.zze != 1) {
                        zzB(4);
                    }
                    zzX(false, true, false, true);
                } else {
                    if (zzxkVar.equals(this.zzH.zzb)) {
                        zzmcVarZzm = this.zzs.zzm();
                        if (zzmcVarZzm == null) {
                            jZzk = j10;
                        } else {
                            jZzk = j10;
                        }
                        if (zzfl.zzr(jZzk) != zzfl.zzr(this.zzH.zzs)) {
                        }
                    } else {
                        jZzk = j10;
                    }
                    if (this.zzD) {
                        z12 = true;
                        break;
                    }
                    zzneVarArr = this.zzb;
                    i10 = 0;
                    while (true) {
                        if (i10 < 2) {
                            z12 = true;
                            break;
                        } else {
                            zzneVar = zzneVarArr[i10];
                            if (!zzneVar.zzM()) {
                            }
                            i10++;
                        }
                    }
                    if (this.zzH.zze == 4) {
                        z13 = z12;
                    } else {
                        z13 = false;
                    }
                    jZzS = zzS(zzxkVar, jZzk, z13);
                    if (j10 != jZzS) {
                        z14 = z12;
                    } else {
                        z14 = false;
                    }
                    z11 = z10 | z14;
                    zzms zzmsVar3 = this.zzH;
                    zzbf zzbfVar3 = zzmsVar3.zza;
                    zzag(zzbfVar3, zzxkVar, zzbfVar3, zzmsVar3.zzb, jMax, true);
                    j12 = jZzS;
                }
                this.zzH = zzap(zzxkVar, j12, jMax, j12, z11, 2);
                return;
            }
            this.zzT = zzltVar;
            z11 = z10;
            j12 = j10;
            this.zzH = zzap(zzxkVar, j12, jMax, j12, z11, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            z11 = z10;
            j11 = j10;
        }
        long j17 = j13;
        j10 = jLongValue;
        jMax = j17;
    }

    private final long zzS(zzxk zzxkVar, long j10, boolean z10) throws zzjk {
        zzmf zzmfVar = this.zzs;
        return zzT(zzxkVar, j10, zzmfVar.zzm() != zzmfVar.zzn(), z10);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    private final long zzT(zzxk zzxkVar, long j10, boolean z10, boolean z11) throws zzjk {
        zzK();
        boolean z12 = true;
        zzaD(false, true);
        if (z11 || this.zzH.zze == 3) {
            zzB(2);
        }
        zzmf zzmfVar = this.zzs;
        zzmc zzmcVarZzm = zzmfVar.zzm();
        zzmc zzmcVarZzp = zzmcVarZzm;
        while (zzmcVarZzp != null && !zzxkVar.equals(zzmcVarZzp.zzg.zza)) {
            zzmcVarZzp = zzmcVarZzp.zzp();
        }
        if (z10 || zzmcVarZzm != zzmcVarZzp || (zzmcVarZzp != null && zzmcVarZzp.zza() + j10 < 0)) {
            zzaa();
            if (zzmcVarZzp != null) {
                while (zzmfVar.zzm() != zzmcVarZzp) {
                    zzmfVar.zzr();
                }
                zzmfVar.zzs(zzmcVarZzp);
                zzmcVarZzp.zzb(1000000000000L);
                zzaq();
                zzmcVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzmcVarZzp != null) {
            zzmfVar.zzs(zzmcVarZzp);
            if (!zzmcVarZzp.zze) {
                zzmcVarZzp.zzg = zzmcVarZzp.zzg.zza(j10, -9223372036854775807L);
            } else if (zzmcVarZzp.zzf) {
                if (this.zzD) {
                    boolean z13 = this.zzC.zzi;
                    if (this.zzH.zza.zzg() || !zzmcVarZzp.zzg.zza.equals(this.zzH.zzb)) {
                        zzxi zzxiVar = zzmcVarZzp.zza;
                        j10 = zzxiVar.zzj(j10);
                        zzxiVar.zzf(j10 - this.zzn, false);
                    } else {
                        long jZza = zzmcVarZzp.zza() + j10;
                        zzne[] zzneVarArr = this.zzb;
                        boolean zZzF = true;
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzne zzneVar = zzneVarArr[i10];
                            if (zzneVar.zzM()) {
                                zZzF &= zzneVar.zzF(zzmcVarZzp, jZza);
                            }
                        }
                        if (zZzF) {
                            zzxi zzxiVar2 = zzmcVarZzp.zza;
                            long j11 = this.zzH.zzs;
                            zzni zzniVar = zzni.zzb;
                            if (zzxiVar2.zzk(j11, zzniVar) == zzxiVar2.zzk(j10, zzniVar)) {
                                z12 = false;
                            } else {
                                zzxi zzxiVar3 = zzmcVarZzp.zza;
                                j10 = zzxiVar3.zzj(j10);
                                zzxiVar3.zzf(j10 - this.zzn, false);
                            }
                        } else {
                            zzxi zzxiVar4 = zzmcVarZzp.zza;
                            j10 = zzxiVar4.zzj(j10);
                            zzxiVar4.zzf(j10 - this.zzn, false);
                        }
                    }
                } else {
                    zzxi zzxiVar5 = zzmcVarZzp.zza;
                    j10 = zzxiVar5.zzj(j10);
                    zzxiVar5.zzf(j10 - this.zzn, false);
                }
            }
            zzU(j10, z12);
            zzan();
        } else {
            zzmfVar.zzv();
            zzU(j10, true);
        }
        zzat(false);
        this.zzi.zzh(2);
        return j10;
    }

    private final void zzU(long j10, boolean z10) throws zzjk {
        zzmc zzmcVarZzm = this.zzs.zzm();
        long jZza = j10 + (zzmcVarZzm == null ? 1000000000000L : zzmcVarZzm.zza());
        this.zzU = jZza;
        this.zzo.zzc(jZza);
        zzne[] zzneVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            zzneVarArr[i10].zzE(zzmcVarZzm, this.zzU, z10);
        }
        for (zzmc zzmcVarZzm2 = r0.zzm(); zzmcVarZzm2 != null; zzmcVarZzm2 = zzmcVarZzm2.zzp()) {
            for (zzaba zzabaVar : zzmcVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzjk {
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                return;
            }
            zzneVarArr[i10].zzz(this.zzD ? this.zzC : null);
            i10++;
        }
    }

    private final void zzW(boolean z10, boolean z11) {
        zzX(z10 || !this.zzR, false, true, false);
        this.zzI.zza(z11 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzH.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009c A[PHI: r2 r7 r9
      0x009c: PHI (r2v2 com.google.android.gms.internal.ads.zzxk) = (r2v1 com.google.android.gms.internal.ads.zzxk), (r2v6 com.google.android.gms.internal.ads.zzxk) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r9v2 long) = (r9v1 long), (r9v5 long) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3 A[PHI: r3
      0x00e3: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
     binds: [B:34:0x00ab, B:36:0x00af, B:38:0x00c0, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzX(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        zzxk zzxkVar;
        zzbf zzbfVar;
        this.zzi.zzk(2);
        this.zzE = false;
        if (this.zzF != null) {
            this.zzI.zza(1);
            this.zzF = null;
        }
        this.zzY = null;
        zzaD(false, true);
        this.zzo.zzb();
        this.zzU = 1000000000000L;
        try {
            zzaa();
        } catch (zzjk | RuntimeException e10) {
            zzeg.zzf("ExoPlayerImplInternal", "Disable failed.", e10);
        }
        if (z10) {
            zzne[] zzneVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    zzneVarArr[i10].zzG();
                } catch (RuntimeException e11) {
                    zzeg.zzf("ExoPlayerImplInternal", "Reset failed.", e11);
                }
            }
        }
        this.zzS = 0;
        zzms zzmsVar = this.zzH;
        zzxk zzxkVar2 = zzmsVar.zzb;
        long jLongValue = zzmsVar.zzs;
        long j10 = (this.zzH.zzb.zzb() || zzaC(this.zzH, this.zzm)) ? this.zzH.zzc : this.zzH.zzs;
        if (z11) {
            this.zzT = null;
            Pair pairZzY = zzY(this.zzH.zza);
            zzxkVar2 = (zzxk) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            j10 = -9223372036854775807L;
            z14 = zzxkVar2.equals(this.zzH.zzb) ? false : true;
        }
        long j11 = jLongValue;
        long j12 = j10;
        zzmf zzmfVar = this.zzs;
        zzmfVar.zzv();
        this.zzO = false;
        zzbf zzbfVarZzx = this.zzH.zza;
        if (z12 && (zzbfVarZzx instanceof zzmy)) {
            zzbfVarZzx = ((zzmy) zzbfVarZzx).zzx(this.zzt.zzq());
            if (zzxkVar2.zzb != -1) {
                Object obj = zzxkVar2.zza;
                zzbd zzbdVar = this.zzm;
                zzbfVarZzx.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzl;
                zzbfVarZzx.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVarZzx;
                    zzxkVar = new zzxk(obj, zzxkVar2.zzd);
                } else {
                    zzxkVar = zzxkVar2;
                    zzbfVar = zzbfVarZzx;
                }
            } else {
                zzxkVar = zzxkVar2;
                zzbfVar = zzbfVarZzx;
            }
        } else {
            zzxkVar = zzxkVar2;
            zzbfVar = zzbfVarZzx;
        }
        zzms zzmsVar2 = this.zzH;
        int i11 = zzmsVar2.zze;
        zzjk zzjkVar = z13 ? null : zzmsVar2.zzf;
        zzzn zzznVar = z14 ? zzzn.zza : zzmsVar2.zzh;
        zzabi zzabiVar = z14 ? this.zzf : zzmsVar2.zzi;
        List listZzi = z14 ? zzgwm.zzi() : zzmsVar2.zzj;
        zzms zzmsVar3 = this.zzH;
        this.zzH = new zzms(zzbfVar, zzxkVar, j12, j11, i11, zzjkVar, false, zzznVar, zzabiVar, listZzi, zzxkVar, zzmsVar3.zzl, zzmsVar3.zzm, zzmsVar3.zzn, zzmsVar3.zzo, j11, 0L, j11, 0L, false);
        if (z12) {
            zzmfVar.zzj();
            this.zzt.zzg();
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j10 = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzms.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzQ);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzxk zzxkVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzxkVarZzy.zzb()) {
            zzbfVar.zzo(zzxkVarZzy.zza, zzbdVar);
            if (zzxkVarZzy.zzc == zzbdVar.zzd(zzxkVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(zzxkVarZzy, Long.valueOf(j10));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlq) arrayList.get(size)).zzb;
            String str = zzfl.zza;
            throw null;
        }
    }

    private final boolean zzaA() {
        if (!this.zzy) {
            return false;
        }
        zzne[] zzneVarArr = this.zzb;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzneVarArr[i10].zzc()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaB, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzD) {
            return false;
        }
        boolean z10 = this.zzC.zzg;
        return true;
    }

    private static boolean zzaC(zzms zzmsVar, zzbd zzbdVar) {
        zzxk zzxkVar = zzmsVar.zzb;
        zzbf zzbfVar = zzmsVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxkVar.zza, zzbdVar).zzf;
    }

    private final void zzaD(boolean z10, boolean z11) {
        this.zzM = z10;
        long jElapsedRealtime = -9223372036854775807L;
        if (z10 && !z11) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzN = jElapsedRealtime;
    }

    private static Pair zzaE(zzbf zzbfVar, zzlt zzltVar, boolean z10, int i10, boolean z11, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2 = zzltVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.zzg() ? zzbfVar : zzbfVar2;
        try {
            Pair pairZzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzltVar.zzb, zzltVar.zzc);
            if (zzbfVar.equals(zzbfVar3)) {
                return pairZzm;
            }
            if (zzbfVar.zze(pairZzm.first) != -1) {
                return (zzbfVar3.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(pairZzm.first)) ? zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzltVar.zzc) : pairZzm;
            }
            int iZzr = zzr(zzbeVar, zzbdVar, i10, z11, pairZzm.first, zzbfVar3, zzbfVar);
            if (iZzr != -1) {
                return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static final void zzaF(zzmw zzmwVar) throws zzjk {
        zzmwVar.zzh();
        try {
            zzmwVar.zza().zzx(zzmwVar.zzc(), zzmwVar.zze());
        } finally {
            zzmwVar.zzi(true);
        }
    }

    private static final boolean zzaG(zzmc zzmcVar) {
        if (zzmcVar != null) {
            try {
                if (zzmcVar.zze) {
                    zzzc[] zzzcVarArr = zzmcVar.zzc;
                    for (int i10 = 0; i10 < 2; i10++) {
                        zzzc zzzcVar = zzzcVarArr[i10];
                        if (zzzcVar != null) {
                            zzzcVar.zzc();
                        }
                    }
                } else {
                    zzmcVar.zza.zzc();
                }
                if (zzmcVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzjk {
        int i10 = 0;
        while (true) {
            zzne[] zzneVarArr = this.zzb;
            if (i10 >= 2) {
                this.zzab = -9223372036854775807L;
                return;
            }
            int iZzd = zzneVarArr[i10].zzd();
            zzneVarArr[i10].zzA(this.zzo);
            zzN(i10, false);
            this.zzS -= iZzd;
            i10++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaA()) {
            zzne[] zzneVarArr = this.zzb;
            for (int i10 = 0; i10 < 2; i10++) {
                zzne zzneVar = zzneVarArr[i10];
                int iZzd = zzneVar.zzd();
                zzneVar.zzC(this.zzo);
                this.zzS -= iZzd - zzneVar.zzd();
            }
            this.zzab = -9223372036854775807L;
        }
    }

    private final void zzac() throws zzjk {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzjk {
        zzji zzjiVar = this.zzo;
        float f10 = zzjiVar.zzj().zzb;
        zzmf zzmfVar = this.zzs;
        zzmc zzmcVarZzm = zzmfVar.zzm();
        zzmc zzmcVarZzn = zzmfVar.zzn();
        zzabi zzabiVar = null;
        boolean z10 = true;
        while (zzmcVarZzm != null && zzmcVarZzm.zze) {
            zzms zzmsVar = this.zzH;
            zzabi zzabiVarZzk = zzmcVarZzm.zzk(f10, zzmsVar.zza, zzmsVar.zzl);
            zzabi zzabiVar2 = zzmcVarZzm == zzmfVar.zzm() ? zzabiVarZzk : zzabiVar;
            zzabi zzabiVarZzr = zzmcVarZzm.zzr();
            boolean z11 = false;
            if (zzabiVarZzr != null) {
                zzaba[] zzabaVarArr = zzabiVarZzk.zzc;
                if (zzabiVarZzr.zzc.length == zzabaVarArr.length) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= zzabaVarArr.length) {
                            if (zzmcVarZzm != zzmcVarZzn) {
                                z11 = true;
                            }
                            z10 &= z11;
                            zzmcVarZzm = zzmcVarZzm.zzp();
                            zzabiVar = zzabiVar2;
                        } else if (zzabiVarZzk.zzb(zzabiVarZzr, i10)) {
                            i10++;
                        }
                    }
                }
            }
            int i11 = 2;
            if (z10) {
                zzmc zzmcVarZzm2 = zzmfVar.zzm();
                int iZzs = zzmfVar.zzs(zzmcVarZzm2) & 1;
                zzne[] zzneVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzabiVar2.getClass();
                long jZzm = zzmcVarZzm2.zzm(zzabiVar2, this.zzH.zzs, 1 == iZzs, zArr);
                zzms zzmsVar2 = this.zzH;
                boolean z12 = (zzmsVar2.zze == 4 || jZzm == zzmsVar2.zzs) ? false : true;
                zzms zzmsVar3 = this.zzH;
                zzmc zzmcVar = zzmcVarZzm2;
                this.zzH = zzap(zzmsVar3.zzb, jZzm, zzmsVar3.zzc, zzmsVar3.zzd, z12, 5);
                if (z12) {
                    zzU(jZzm, true);
                }
                zzab();
                i11 = 2;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (i12 < 2) {
                    int iZzd = zzneVarArr[i12].zzd();
                    zArr2[i12] = zzneVarArr[i12].zzM();
                    zzmc zzmcVar2 = zzmcVar;
                    zzneVarArr[i12].zzD(zzmcVar2.zzc[i12], zzjiVar, this.zzU, zArr[i12]);
                    if (iZzd - zzneVarArr[i12].zzd() > 0) {
                        zzN(i12, false);
                    }
                    this.zzS -= iZzd - zzneVarArr[i12].zzd();
                    i12++;
                    zzmcVar = zzmcVar2;
                }
                zzar(zArr2, this.zzU);
                zzmcVar.zzh = true;
            } else {
                zzmfVar.zzs(zzmcVarZzm);
                if (zzmcVarZzm.zze) {
                    long jMax = Math.max(zzmcVarZzm.zzg.zzb, this.zzU - zzmcVarZzm.zza());
                    if (this.zzy && zzaA() && zzmfVar.zzo() == zzmcVarZzm) {
                        zzab();
                    }
                    zzmcVarZzm.zzl(zzabiVarZzk, jMax, false);
                }
            }
            zzat(true);
            if (this.zzH.zze != 4) {
                zzan();
                zzL();
                this.zzi.zzh(i11);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzmc zzmcVarZzm = this.zzs.zzm();
        long j10 = zzmcVarZzm.zzg.zzf;
        if (!zzmcVarZzm.zze) {
            return false;
        }
        if (j10 == -9223372036854775807L || this.zzH.zzs < j10) {
            return true;
        }
        return !zzay();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0227  */
    /* JADX WARN: Code duplicated, block: B:108:0x022e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0234  */
    /* JADX WARN: Code duplicated, block: B:111:0x0237  */
    /* JADX WARN: Code duplicated, block: B:113:0x0246  */
    /* JADX WARN: Code duplicated, block: B:115:0x024c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0290  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:151:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:232:0x0411  */
    /* JADX WARN: Code duplicated, block: B:233:0x0417  */
    /* JADX WARN: Code duplicated, block: B:236:0x0423  */
    /* JADX WARN: Code duplicated, block: B:238:0x042b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x042d  */
    /* JADX WARN: Code duplicated, block: B:240:0x042f  */
    /* JADX WARN: Code duplicated, block: B:244:0x045c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:98:0x0213  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.internal.ads.zzlu] */
    /* JADX WARN: Type inference failed for: r3v34, types: [long] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [long] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [long] */
    /* JADX WARN: Type inference failed for: r7v25 */
    private final void zzaf(zzbf zzbfVar, boolean z10) throws Throwable {
        zzbe zzbeVar;
        Object obj;
        zzxk zzxkVar;
        long j10;
        long j11;
        long jZzah;
        int i10;
        int iZzk;
        long jMax;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long jLongValue;
        zzxk zzxkVar2;
        boolean zEquals;
        boolean z15;
        zzbd zzbdVarZzo;
        ?? r13;
        long jMin;
        boolean z16;
        int i11;
        Object obj2;
        int i12;
        boolean z17;
        zzxk zzxkVar3;
        int i13;
        boolean z18;
        long j12;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int i14;
        long jLongValue2;
        boolean z23;
        int i15;
        boolean z24;
        int iZzk2;
        boolean z25;
        boolean z26;
        int i16;
        int i17;
        ?? r15;
        ?? r14;
        ?? r10;
        ?? r11;
        ?? r16;
        boolean z27;
        long jZzS;
        ?? r17;
        int i18;
        boolean z28;
        zzms zzmsVar = this.zzH;
        zzlt zzltVar = this.zzT;
        zzbd zzbdVar = this.zzm;
        int i19 = this.zzP;
        boolean z29 = this.zzQ;
        ?? r18 = -9223372036854775807;
        if (zzbfVar.zzg()) {
            zzxk zzxkVarZzb = zzms.zzb();
            zzxk zzxkVar4 = zzmsVar.zzb;
            boolean z30 = (zzxkVarZzb.equals(zzxkVar4) && zzmsVar.zzs == 0) ? false : true;
            if (z30 && z10) {
                zzbf zzbfVar2 = zzmsVar.zza;
                if (zzbfVar2.zzg() || zzbfVar2.zzo(zzxkVar4.zza, zzbdVar).zzf) {
                    z28 = false;
                } else {
                    z28 = true;
                }
            } else {
                z28 = false;
            }
            z22 = z28;
            zzxkVar3 = zzxkVarZzb;
            z18 = z30;
            jZzah = 0;
            i13 = 4;
            j10 = -9223372036854775807L;
            z19 = false;
            z20 = true;
            r13 = 1;
            z21 = false;
            j12 = 0;
        } else {
            zzxk zzxkVar5 = zzmsVar.zzb;
            Object obj3 = zzxkVar5.zza;
            boolean zZzaC = zzaC(zzmsVar, zzbdVar);
            long j13 = (zzxkVar5.zzb() || zZzaC) ? zzmsVar.zzc : zzmsVar.zzs;
            zzbe zzbeVar2 = this.zzl;
            if (zzltVar != null) {
                obj = obj3;
                zzxkVar = zzxkVar5;
                long j14 = j13;
                Pair pairZzaE = zzaE(zzbfVar, zzltVar, true, i19, z29, zzbeVar2, zzbdVar);
                if (pairZzaE == null) {
                    iZzk2 = zzbfVar.zzk(z29);
                    obj = obj;
                    jLongValue2 = j14;
                    z25 = false;
                    z26 = true;
                    z24 = false;
                } else {
                    if (zzltVar.zzc == -9223372036854775807L) {
                        i15 = zzbfVar.zzo(pairZzaE.first, zzbdVar).zzc;
                        obj = obj;
                        jLongValue2 = j14;
                        z23 = false;
                    } else {
                        obj = pairZzaE.first;
                        jLongValue2 = ((Long) pairZzaE.second).longValue();
                        z23 = true;
                        i15 = -1;
                    }
                    z24 = z23;
                    iZzk2 = i15;
                    z25 = zzmsVar.zze == 4;
                    z26 = false;
                }
                z11 = z25;
                z12 = z26;
                z13 = z24;
                zzbeVar = zzbeVar2;
                j11 = j14;
                iZzk = iZzk2;
                j10 = jLongValue2;
                i10 = -1;
                jZzah = 0;
            } else {
                zzbeVar = zzbeVar2;
                obj = obj3;
                zzxkVar = zzxkVar5;
                j10 = j13;
                zzbf zzbfVar3 = zzmsVar.zza;
                if (zzbfVar3.zzg()) {
                    iZzk = zzbfVar.zzk(z29);
                    j11 = j10;
                } else if (zzbfVar.zze(obj) == -1) {
                    int iZzr = zzr(zzbeVar, zzbdVar, i19, z29, obj, zzbfVar3, zzbfVar);
                    if (iZzr == -1) {
                        iZzr = zzbfVar.zzk(z29);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    iZzk = iZzr;
                    z12 = z14;
                    obj = obj;
                    zzbeVar = zzbeVar;
                    j11 = j10;
                    i10 = -1;
                    jZzah = 0;
                    z11 = false;
                    z13 = false;
                } else {
                    j11 = j10;
                    if (j11 == -9223372036854775807L) {
                        iZzk = zzbfVar.zzo(obj, zzbdVar).zzc;
                        j10 = j11;
                    } else if (zZzaC) {
                        zzbfVar3.zzo(obj, zzbdVar);
                        zzbeVar = zzbeVar;
                        if (zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar3.zze(obj)) {
                            Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(obj, zzbdVar).zzc, j11);
                            obj = pairZzm.first;
                            jMax = ((Long) pairZzm.second).longValue();
                            jZzah = 0;
                        } else {
                            if (zzbfVar.zzo(obj, zzbdVar).zzd != -9223372036854775807L) {
                                long j15 = zzbdVar.zzd - 1;
                                String str = zzfl.zza;
                                jZzah = 0;
                                jMax = Math.max(0L, Math.min(j11, j15));
                            } else {
                                jZzah = 0;
                                jMax = j11;
                            }
                            obj = obj;
                        }
                        j10 = jMax;
                        i10 = -1;
                        iZzk = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        zzbeVar = zzbeVar;
                        jZzah = 0;
                        j10 = j11;
                        obj = obj;
                        i10 = -1;
                        iZzk = -1;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                }
                i10 = -1;
                jZzah = 0;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            if (iZzk != i10) {
                Pair pairZzm2 = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
                obj = pairZzm2.first;
                jLongValue = ((Long) pairZzm2.second).longValue();
                j10 = -9223372036854775807L;
            } else {
                jLongValue = j10;
            }
            zzxk zzxkVarZzy = this.zzs.zzy(zzbfVar, obj, jLongValue);
            int i20 = zzxkVarZzy.zze;
            if (i20 != -1) {
                zzxkVar2 = zzxkVar;
                int i21 = zzxkVar2.zze;
                boolean z31 = i21 != -1 && i20 >= i21;
                zEquals = obj.equals(obj);
                if (zEquals || zzxkVar2.zzb() || zzxkVarZzy.zzb() || !z31) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                zzbdVarZzo = zzbfVar.zzo(obj, zzbdVar);
                if (!zZzaC && j11 == j10 && obj.equals(zzxkVarZzy.zza)) {
                    if (zzxkVar2.zzb()) {
                        zzbdVarZzo.zzk(zzxkVar2.zzb);
                    }
                    if (zzxkVarZzy.zzb()) {
                        zzbdVarZzo.zzk(zzxkVarZzy.zzb);
                    }
                }
                r13 = 1;
                if (true == z15) {
                    zzxkVarZzy = zzxkVar2;
                }
                if (zzxkVarZzy.zzb()) {
                    if (zzxkVarZzy.equals(zzxkVar2)) {
                        jMin = zzmsVar.zzs;
                    } else {
                        zzbfVar.zzo(zzxkVarZzy.zza, zzbdVar);
                        if (zzxkVarZzy.zzc == zzbdVar.zzd(zzxkVarZzy.zzb)) {
                            zzbdVar.zzj();
                        }
                        jMin = jZzah;
                    }
                } else if (zEquals || !zzxkVar2.zzb()) {
                    jMin = jLongValue;
                } else {
                    zza zzaVarZza = zzbfVar.zzo(obj, zzbdVar).zzg.zza(zzxkVar2.zzb);
                    long j16 = zzaVarZza.zzi;
                    long j17 = zzmsVar.zzc;
                    if (j17 == -9223372036854775807L || j17 < jZzah) {
                        int i22 = zzaVarZza.zzb;
                        int i23 = zzxkVar2.zzc;
                        if (i22 <= i23 || zzaVarZza.zze[i23] != 2) {
                            jMin = jLongValue;
                        } else {
                            long j18 = zzbfVar.zzo(obj, zzbdVar).zzd;
                            jMin = j18 != -9223372036854775807L ? Math.min(j18 - 1, jLongValue) : jLongValue;
                            j10 = jMin;
                        }
                    } else {
                        jMin = jLongValue;
                    }
                }
                if (zzxkVarZzy.equals(zzxkVar2) || jMin != zzmsVar.zzs) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (zzbfVar.zze(obj) == -1) {
                    i11 = 4;
                } else {
                    i11 = 3;
                }
                obj2 = zzxkVarZzy.zza;
                if (obj2.equals(obj) || (i14 = zzxkVarZzy.zzb) == -1 || zzbfVar.zzo(obj2, zzbdVar).zzg.zza(i14).zze[zzxkVarZzy.zzc] == 2) {
                    i12 = i11;
                } else {
                    i12 = 0;
                }
                if (z16 || !z10) {
                    z17 = false;
                } else {
                    zzbf zzbfVar4 = zzmsVar.zza;
                    if (zzbfVar4.zzg() || zzbfVar4.zzo(obj, zzbdVar).zzf) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                }
                zzxkVar3 = zzxkVarZzy;
                i13 = i12;
                z18 = z16;
                j12 = jMin;
                z19 = z11;
                z20 = z12;
                z21 = z13;
                z22 = z17;
            } else {
                zzxkVar2 = zzxkVar;
            }
            zEquals = obj.equals(obj);
            if (zEquals) {
                z15 = false;
            } else {
                z15 = false;
            }
            zzbdVarZzo = zzbfVar.zzo(obj, zzbdVar);
            if (!zZzaC) {
                if (zzxkVar2.zzb()) {
                    zzbdVarZzo.zzk(zzxkVar2.zzb);
                }
                if (zzxkVarZzy.zzb()) {
                    zzbdVarZzo.zzk(zzxkVarZzy.zzb);
                }
            }
            r13 = 1;
            if (true == z15) {
                zzxkVarZzy = zzxkVar2;
            }
            if (zzxkVarZzy.zzb()) {
                if (zzxkVarZzy.equals(zzxkVar2)) {
                    jMin = zzmsVar.zzs;
                } else {
                    zzbfVar.zzo(zzxkVarZzy.zza, zzbdVar);
                    if (zzxkVarZzy.zzc == zzbdVar.zzd(zzxkVarZzy.zzb)) {
                        zzbdVar.zzj();
                    }
                    jMin = jZzah;
                }
            } else if (zEquals) {
                jMin = jLongValue;
            } else {
                jMin = jLongValue;
            }
            if (zzxkVarZzy.equals(zzxkVar2)) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (zzbfVar.zze(obj) == -1) {
                i11 = 4;
            } else {
                i11 = 3;
            }
            obj2 = zzxkVarZzy.zza;
            if (obj2.equals(obj)) {
                i12 = i11;
            } else {
                i12 = i11;
            }
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            zzxkVar3 = zzxkVarZzy;
            i13 = i12;
            z18 = z16;
            j12 = jMin;
            z19 = z11;
            z20 = z12;
            z21 = z13;
            z22 = z17;
        }
        if (z20) {
            try {
                if (this.zzH.zze != r13) {
                    zzB(4);
                }
                i17 = 0;
                try {
                    zzX(false, false, false, r13);
                } catch (Throwable th) {
                    th = th;
                    i16 = i17;
                    r14 = j12;
                    r15 = i16;
                    zzms zzmsVar2 = this.zzH;
                    zzbf zzbfVar5 = zzmsVar2.zza;
                    zzxk zzxkVar6 = zzmsVar2.zzb;
                    if (true != z21) {
                        r10 = -9223372036854775807;
                    } else {
                        r10 = r14;
                    }
                    zzag(zzbfVar, zzxkVar3, zzbfVar5, zzxkVar6, r10, false);
                    if (z18) {
                        if (z22) {
                            r11 = r14;
                        } else {
                            r11 = this.zzH.zzd;
                        }
                        this.zzH = zzap(zzxkVar3, r14, j10, r11, z22, i13);
                    } else {
                        if (z22) {
                            r11 = r14;
                        } else {
                            r11 = this.zzH.zzd;
                        }
                        this.zzH = zzap(zzxkVar3, r14, j10, r11, z22, i13);
                    }
                    zzak();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                        this.zzT = null;
                    }
                    zzat(r15);
                    this.zzi.zzh(2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i16 = 0;
                r14 = j12;
                r15 = i16;
                zzms zzmsVar3 = this.zzH;
                zzbf zzbfVar6 = zzmsVar3.zza;
                zzxk zzxkVar7 = zzmsVar3.zzb;
                if (true != z21) {
                    r10 = -9223372036854775807;
                } else {
                    r10 = r14;
                }
                zzag(zzbfVar, zzxkVar3, zzbfVar6, zzxkVar7, r10, false);
                if (z18 || j10 != this.zzH.zzc) {
                    if (z22) {
                        r11 = r14;
                    } else {
                        r11 = this.zzH.zzd;
                    }
                    this.zzH = zzap(zzxkVar3, r14, j10, r11, z22, i13);
                }
                zzak();
                zzZ(zzbfVar, this.zzH.zza);
                this.zzH = this.zzH.zzd(zzbfVar);
                if (!zzbfVar.zzg()) {
                    this.zzT = null;
                }
                zzat(r15);
                this.zzi.zzh(2);
                throw th;
            }
        } else {
            i17 = 0;
        }
        zzne[] zzneVarArr = this.zzb;
        for (int i24 = i17; i24 < 2; i24++) {
            zzneVarArr[i24].zzn(zzbfVar);
        }
        try {
            if (z18) {
                i18 = i17;
                z27 = z21;
                jZzS = j12;
                if (!zzbfVar.zzg()) {
                    zzmf zzmfVar = this.zzs;
                    for (zzmc zzmcVarZzm = zzmfVar.zzm(); zzmcVarZzm != null; zzmcVarZzm = zzmcVarZzm.zzp()) {
                        if (zzmcVarZzm.zzg.zza.equals(zzxkVar3)) {
                            r17 = i18;
                            zzmcVarZzm.zzg = zzmfVar.zzx(zzbfVar, zzmcVarZzm.zzg);
                            zzmcVarZzm.zzs();
                        } else {
                            r17 = i18;
                        }
                    }
                    r17 = i18;
                    jZzS = zzS(zzxkVar3, jZzS, z19);
                    r17 = i18;
                }
            } else {
                try {
                    zzmf zzmfVar2 = this.zzs;
                    long jZzah2 = zzmfVar2.zzn() == null ? jZzah : zzah(zzmfVar2.zzn());
                    if (zzaA() && zzmfVar2.zzo() != null) {
                        jZzah = zzah(zzmfVar2.zzo());
                    }
                    r16 = i17;
                    long j19 = jZzah2;
                    z27 = z21;
                    jZzS = j12;
                    int iZzw = zzmfVar2.zzw(zzbfVar, this.zzU, j19, jZzah);
                    if ((iZzw & 1) != 0) {
                        zzI(r16);
                        r17 = r16;
                    } else if ((iZzw & 2) != 0) {
                        r17 = r16;
                        zzab();
                        r17 = r16;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r18 = i17;
                    z12 = z21;
                    r13 = j12;
                    z21 = z12;
                    r14 = r13;
                    r15 = r18;
                    zzms zzmsVar4 = this.zzH;
                    zzbf zzbfVar7 = zzmsVar4.zza;
                    zzxk zzxkVar8 = zzmsVar4.zzb;
                    if (true != z21) {
                        r10 = -9223372036854775807;
                    } else {
                        r10 = r14;
                    }
                    zzag(zzbfVar, zzxkVar3, zzbfVar7, zzxkVar8, r10, false);
                    if (z18) {
                        if (z22) {
                            r11 = r14;
                        } else {
                            r11 = this.zzH.zzd;
                        }
                        this.zzH = zzap(zzxkVar3, r14, j10, r11, z22, i13);
                    } else {
                        if (z22) {
                            r11 = r14;
                        } else {
                            r11 = this.zzH.zzd;
                        }
                        this.zzH = zzap(zzxkVar3, r14, j10, r11, z22, i13);
                    }
                    zzak();
                    zzZ(zzbfVar, this.zzH.zza);
                    this.zzH = this.zzH.zzd(zzbfVar);
                    if (!zzbfVar.zzg()) {
                        this.zzT = null;
                    }
                    zzat(r15);
                    this.zzi.zzh(2);
                    throw th;
                }
            }
            r17 = r16;
            r17 = i18;
            zzms zzmsVar5 = this.zzH;
            zzag(zzbfVar, zzxkVar3, zzmsVar5.zza, zzmsVar5.zzb, true != z27 ? -9223372036854775807L : jZzS, false);
            if (z18 || j10 != this.zzH.zzc) {
                this.zzH = zzap(zzxkVar3, jZzS, j10, z22 ? jZzS : this.zzH.zzd, z22, i13);
            }
            zzak();
            zzZ(zzbfVar, this.zzH.zza);
            this.zzH = this.zzH.zzd(zzbfVar);
            if (!zzbfVar.zzg()) {
                this.zzT = null;
            }
            zzat(r17);
            this.zzi.zzh(2);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final void zzag(zzbf zzbfVar, zzxk zzxkVar, zzbf zzbfVar2, zzxk zzxkVar2, long j10, boolean z10) throws zzjk {
        if (!zzP(zzbfVar, zzxkVar)) {
            zzav zzavVar = zzxkVar.zzb() ? zzav.zza : this.zzH.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzam(this.zzH.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzxkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i10 = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i10, zzbeVar, 0L);
        zzjd zzjdVar = this.zzae;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfl.zza;
        zzjdVar.zza(zzafVar);
        if (j10 != -9223372036854775807L) {
            zzjdVar.zzb(zzO(zzbfVar, obj, j10));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z10) {
            zzjdVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzmc zzmcVar) {
        if (zzmcVar == null) {
            return 0L;
        }
        long jZza = zzmcVar.zza();
        if (zzmcVar.zze) {
            int i10 = 0;
            while (true) {
                zzne[] zzneVarArr = this.zzb;
                if (i10 >= 2) {
                    break;
                }
                if (zzneVarArr[i10].zzp(zzmcVar)) {
                    long jZzf = zzneVarArr[i10].zzf(zzmcVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i10++;
            }
        }
        return jZza;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0213 A[LOOP:4: B:118:0x0211->B:119:0x0213, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0323  */
    private final void zzai() throws zzjk {
        zzmc zzmcVarZzm;
        zzmc zzmcVarZzp;
        boolean z10;
        zzne[] zzneVarArr;
        int i10;
        boolean z11;
        zzmc zzmcVarZzo;
        zzmd zzmdVarZzh;
        if (this.zzH.zza.zzg() || !this.zzt.zzb()) {
            return;
        }
        zzmf zzmfVar = this.zzs;
        zzmfVar.zzf(this.zzU);
        if (zzmfVar.zzg() && (zzmdVarZzh = zzmfVar.zzh(this.zzU, this.zzH)) != null) {
            zzmc zzmcVarZzi = zzmfVar.zzi(zzmdVarZzh);
            if (!zzmcVarZzi.zzd) {
                zzmcVarZzi.zzt(this, zzmdVarZzh.zzb);
            } else if (zzmcVarZzi.zze) {
                this.zzi.zzd(8, zzmcVarZzi.zza).zza();
            }
            if (zzmfVar.zzm() == zzmcVarZzi) {
                zzU(zzmdVarZzh.zzb, true);
            }
            zzat(false);
        }
        if (this.zzO) {
            this.zzO = zzaG(zzmfVar.zzk());
            zzao();
        } else {
            zzan();
        }
        if (!this.zzL && this.zzy && !this.zzac && !zzaA() && (zzmcVarZzo = zzmfVar.zzo()) != null && zzmcVarZzo == zzmfVar.zzn() && zzmcVarZzo.zzp() != null && zzmcVarZzo.zzp().zze && zzaw(zzmcVarZzo.zzp()) <= 10000000) {
            zzmfVar.zzq();
            zzmc zzmcVarZzo2 = zzmfVar.zzo();
            if (zzmcVarZzo2 != null) {
                zzabi zzabiVarZzr = zzmcVarZzo2.zzr();
                int i11 = 0;
                while (true) {
                    zzne[] zzneVarArr2 = this.zzb;
                    if (i11 >= 2) {
                        break;
                    }
                    if (zzabiVarZzr.zza(i11) && zzneVarArr2[i11].zza() && !zzneVarArr2[i11].zzc()) {
                        zzneVarArr2[i11].zzb();
                        zzas(zzmcVarZzo2, i11, false, zzmcVarZzo2.zzc());
                    }
                    i11++;
                }
                if (zzaA()) {
                    this.zzab = zzmcVarZzo2.zza.zzh();
                    if (!zzmcVarZzo2.zzd()) {
                        zzmfVar.zzs(zzmcVarZzo2);
                        zzat(false);
                        zzan();
                    }
                }
            }
        }
        zzmc zzmcVarZzn = zzmfVar.zzn();
        if (zzmcVarZzn != null) {
            if (zzmcVarZzn.zzp() != null && !this.zzL) {
                zzmc zzmcVarZzn2 = zzmfVar.zzn();
                if (zzmcVarZzn2.zze) {
                    int i12 = 0;
                    while (true) {
                        zzne[] zzneVarArr3 = this.zzb;
                        if (i12 >= 2) {
                            if ((zzaA() && zzmfVar.zzo() == zzmfVar.zzn()) || ((!zzmcVarZzn.zzp().zze && this.zzU < zzmcVarZzn.zzp().zzc()) || (zzmcVarZzn.zzp().zze && zzaw(zzmcVarZzn.zzp()) > 10000000))) {
                                break;
                                break;
                                break;
                            }
                            zzabi zzabiVarZzr2 = zzmcVarZzn.zzr();
                            zzmc zzmcVarZzp2 = zzmfVar.zzp();
                            zzabi zzabiVarZzr3 = zzmcVarZzp2.zzr();
                            zzbf zzbfVar = this.zzH.zza;
                            zzag(zzbfVar, zzmcVarZzp2.zzg.zza, zzbfVar, zzmcVarZzn.zzg.zza, -9223372036854775807L, false);
                            if (zzmcVarZzp2.zze && (((z11 = this.zzy) && this.zzab != -9223372036854775807L) || zzmcVarZzp2.zza.zzh() != -9223372036854775807L)) {
                                this.zzab = -9223372036854775807L;
                                if (z11 && !this.zzac) {
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= 2) {
                                            for (i10 = 0; i10 < 2; i10++) {
                                                zzneVarArr3[i10].zzi(zzabiVarZzr2, zzabiVarZzr3, zzmcVarZzp2.zzc());
                                            }
                                            break;
                                            break;
                                        }
                                        if (zzabiVarZzr3.zza(i13)) {
                                            zzneVarArr3[i13].zze();
                                            zzaba[] zzabaVarArr = zzabiVarZzr3.zzc;
                                            if (zzas.zzd(zzabaVarArr[i13].zzc().zzp, zzabaVarArr[i13].zzc().zzk) || zzneVarArr3[i13].zzc()) {
                                            }
                                        }
                                        i13++;
                                    }
                                }
                                long jZzc = zzmcVarZzp2.zzc();
                                for (int i14 = 0; i14 < 2; i14++) {
                                    zzneVarArr3[i14].zzj(jZzc);
                                }
                                if (!zzmcVarZzp2.zzd()) {
                                    zzmfVar.zzs(zzmcVarZzp2);
                                    zzat(false);
                                    zzan();
                                    break;
                                }
                                break;
                            }
                            while (i10 < 2) {
                                zzneVarArr3[i10].zzi(zzabiVarZzr2, zzabiVarZzr3, zzmcVarZzp2.zzc());
                            }
                            break;
                        }
                        if (!zzneVarArr3[i12].zzr(zzmcVarZzn2)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            } else if (zzmcVarZzn.zzg.zzk || this.zzL) {
                zzne[] zzneVarArr4 = this.zzb;
                for (int i15 = 0; i15 < 2; i15++) {
                    zzne zzneVar = zzneVarArr4[i15];
                    if (zzneVar.zzp(zzmcVarZzn) && zzneVar.zzg(zzmcVarZzn)) {
                        long j10 = zzmcVarZzn.zzg.zzf;
                        zzneVar.zzh(zzmcVarZzn, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : zzmcVarZzn.zza() + j10);
                    }
                }
            }
        }
        zzmc zzmcVarZzn3 = zzmfVar.zzn();
        if (zzmcVarZzn3 != null && zzmfVar.zzm() != zzmcVarZzn3 && !zzmcVarZzn3.zzh) {
            zzmc zzmcVarZzn4 = zzmfVar.zzn();
            zzabi zzabiVarZzr4 = zzmcVarZzn4.zzr();
            int i16 = 0;
            int i17 = 1;
            while (true) {
                zzneVarArr = this.zzb;
                if (i16 >= 2) {
                    break;
                }
                int iZzd = zzneVarArr[i16].zzd();
                int iZzH = zzneVarArr[i16].zzH(zzmcVarZzn4, zzabiVarZzr4, this.zzo);
                this.zzS -= iZzd - zzneVarArr[i16].zzd();
                i17 &= iZzH & 1;
                i16++;
            }
            if (i17 != 0) {
                for (int i18 = 0; i18 < 2; i18++) {
                    if (zzabiVarZzr4.zza(i18) && !zzneVarArr[i18].zzp(zzmcVarZzn4)) {
                        zzas(zzmcVarZzn4, i18, false, zzmcVarZzn4.zzc());
                    }
                }
                zzmfVar.zzn().zzh = true;
            }
        }
        boolean z12 = false;
        while (zzay() && !this.zzL && (zzmcVarZzm = zzmfVar.zzm()) != null && (zzmcVarZzp = zzmcVarZzm.zzp()) != null && this.zzU >= zzmcVarZzp.zzc() && zzmcVarZzp.zzh) {
            if (z12) {
                zzC();
            }
            this.zzac = false;
            zzmc zzmcVarZzr = zzmfVar.zzr();
            zzmcVarZzr.getClass();
            if (this.zzH.zzb.zza.equals(zzmcVarZzr.zzg.zza.zza)) {
                zzxk zzxkVar = this.zzH.zzb;
                if (zzxkVar.zzb == -1) {
                    zzxk zzxkVar2 = zzmcVarZzr.zzg.zza;
                    if (zzxkVar2.zzb != -1 || zzxkVar.zze == zzxkVar2.zze) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            zzmd zzmdVar = zzmcVarZzr.zzg;
            zzxk zzxkVar3 = zzmdVar.zza;
            long j11 = zzmdVar.zzb;
            this.zzH = zzap(zzxkVar3, j11, zzmdVar.zzd, j11, !z10, 0);
            zzak();
            zzL();
            if (zzaA() && zzmcVarZzr == zzmfVar.zzo()) {
                zzne[] zzneVarArr5 = this.zzb;
                for (int i19 = 0; i19 < 2; i19++) {
                    zzneVarArr5[i19].zzB();
                }
            }
            if (this.zzH.zze == 3) {
                zzJ();
            }
            zzabi zzabiVarZzr5 = zzmfVar.zzm().zzr();
            int i20 = 0;
            while (true) {
                zzne[] zzneVarArr6 = this.zzb;
                if (i20 < 2) {
                    if (zzabiVarZzr5.zza(i20)) {
                        zzneVarArr6[i20].zzl();
                    }
                    i20++;
                }
            }
            z12 = true;
        }
        long j12 = this.zzaa.zzb;
    }

    private final void zzaj() {
        zzmf zzmfVar = this.zzs;
        zzmfVar.zzt();
        zzmc zzmcVarZzl = zzmfVar.zzl();
        if (zzmcVarZzl != null) {
            if (!zzmcVarZzl.zzd || zzmcVarZzl.zze) {
                zzxi zzxiVar = zzmcVarZzl.zza;
                if (zzxiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzH.zza, zzmcVarZzl.zzg.zza, zzmcVarZzl.zze ? zzxiVar.zzi() : 0L)) {
                    if (!zzmcVarZzl.zzd) {
                        zzmcVarZzl.zzt(this, zzmcVarZzl.zzg.zzb);
                        return;
                    }
                    zzlz zzlzVar = new zzlz();
                    zzlzVar.zza(this.zzU - zzmcVarZzl.zza());
                    zzlzVar.zzb(this.zzo.zzj().zzb);
                    zzlzVar.zzc(this.zzN);
                    zzmcVarZzl.zzj(new zzma(zzlzVar, null));
                }
            }
        }
    }

    private final void zzak() {
        zzmc zzmcVarZzm = this.zzs.zzm();
        boolean z10 = false;
        if (zzmcVarZzm != null && zzmcVarZzm.zzg.zzj && this.zzK) {
            z10 = true;
        }
        this.zzL = z10;
    }

    private final void zzal(zzav zzavVar, boolean z10) throws zzjk {
        zzam(zzavVar, zzavVar.zzb, true, z10);
    }

    private final void zzam(zzav zzavVar, float f10, boolean z10, boolean z11) throws zzjk {
        int i10;
        if (z10) {
            if (z11) {
                this.zzI.zza(1);
            }
            zzms zzmsVar = this.zzH;
            this.zzH = new zzms(zzmsVar.zza, zzmsVar.zzb, zzmsVar.zzc, zzmsVar.zzd, zzmsVar.zze, zzmsVar.zzf, zzmsVar.zzg, zzmsVar.zzh, zzmsVar.zzi, zzmsVar.zzj, zzmsVar.zzk, zzmsVar.zzl, zzmsVar.zzm, zzmsVar.zzn, zzavVar, zzmsVar.zzq, zzmsVar.zzr, zzmsVar.zzs, zzmsVar.zzt, false);
        }
        float f11 = zzavVar.zzb;
        zzmc zzmcVarZzm = this.zzs.zzm();
        while (true) {
            i10 = 0;
            if (zzmcVarZzm == null) {
                break;
            }
            zzaba[] zzabaVarArr = zzmcVarZzm.zzr().zzc;
            int length = zzabaVarArr.length;
            while (i10 < length) {
                zzaba zzabaVar = zzabaVarArr[i10];
                i10++;
            }
            zzmcVarZzm = zzmcVarZzm.zzp();
        }
        zzne[] zzneVarArr = this.zzb;
        while (i10 < 2) {
            zzneVarArr[i10].zzm(f10, f11);
            i10++;
        }
    }

    private final void zzan() {
        long jZza;
        long jZza2;
        zzmf zzmfVar;
        boolean zZzh;
        zzmf zzmfVar2 = this.zzs;
        if (zzaG(zzmfVar2.zzk())) {
            zzmc zzmcVarZzk = zzmfVar2.zzk();
            long jZzav = zzav(zzmcVarZzk.zzg());
            if (zzmcVarZzk == zzmfVar2.zzm()) {
                jZza = this.zzU;
                jZza2 = zzmcVarZzk.zza();
            } else {
                jZza = this.zzU - zzmcVarZzk.zza();
                jZza2 = zzmcVarZzk.zzg.zzb;
            }
            zzmfVar = zzmfVar2;
            zzlx zzlxVar = new zzlx(this.zzv, this.zzH.zza, zzmcVarZzk.zzg.zza, jZza - jZza2, jZzav, this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzmcVarZzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN);
            zzly zzlyVar = this.zzg;
            zZzh = zzlyVar.zzh(zzlxVar);
            zzmc zzmcVarZzm = zzmfVar.zzm();
            if (!zZzh && zzmcVarZzm.zze && jZzav < 500000 && this.zzn > 0) {
                zzmcVarZzm.zza.zzf(this.zzH.zzs, false);
                zZzh = zzlyVar.zzh(zzlxVar);
            }
        } else {
            zzmfVar = zzmfVar2;
            zZzh = false;
        }
        this.zzO = zZzh;
        if (zZzh) {
            zzmc zzmcVarZzk2 = zzmfVar.zzk();
            zzmcVarZzk2.getClass();
            zzlz zzlzVar = new zzlz();
            zzlzVar.zza(this.zzU - zzmcVarZzk2.zza());
            zzlzVar.zzb(this.zzo.zzj().zzb);
            zzlzVar.zzc(this.zzN);
            zzmcVarZzk2.zzj(new zzma(zzlzVar, null));
        }
        zzao();
    }

    private final void zzao() {
        zzmc zzmcVarZzk = this.zzs.zzk();
        boolean z10 = true;
        if (!this.zzO && (zzmcVarZzk == null || !zzmcVarZzk.zza.zzn())) {
            z10 = false;
        }
        zzms zzmsVar = this.zzH;
        if (z10 != zzmsVar.zzg) {
            this.zzH = zzmsVar.zzg(z10);
        }
    }

    private final zzms zzap(zzxk zzxkVar, long j10, long j11, long j12, boolean z10, int i10) {
        List listZzi;
        zzzn zzznVar;
        zzabi zzabiVar;
        zzmc zzmcVarZzm;
        int i11 = 0;
        this.zzX = (!this.zzX && j10 == this.zzH.zzs && zzxkVar.equals(this.zzH.zzb)) ? false : true;
        zzak();
        zzms zzmsVar = this.zzH;
        zzzn zzznVar2 = zzmsVar.zzh;
        zzabi zzabiVar2 = zzmsVar.zzi;
        List list = zzmsVar.zzj;
        if (this.zzt.zzb()) {
            zzmf zzmfVar = this.zzs;
            zzmc zzmcVarZzm2 = zzmfVar.zzm();
            zzzn zzznVarZzq = zzmcVarZzm2 == null ? zzzn.zza : zzmcVarZzm2.zzq();
            zzabi zzabiVarZzr = zzmcVarZzm2 == null ? this.zzf : zzmcVarZzm2.zzr();
            zzaba[] zzabaVarArr = zzabiVarZzr.zzc;
            zzgwj zzgwjVar = new zzgwj();
            boolean z11 = false;
            for (zzaba zzabaVar : zzabaVarArr) {
                if (zzabaVar != null) {
                    zzap zzapVar = zzabaVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgwjVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgwjVar.zzf(zzapVar);
                        z11 = true;
                    }
                }
            }
            zzgwm zzgwmVarZzi = z11 ? zzgwjVar.zzi() : zzgwm.zzi();
            if (zzmcVarZzm2 != null) {
                zzmd zzmdVar = zzmcVarZzm2.zzg;
                if (zzmdVar.zzd != j11) {
                    zzmcVarZzm2.zzg = zzmdVar.zzb(j11);
                }
            }
            if (zzmfVar.zzm() == zzmfVar.zzn() && (zzmcVarZzm = zzmfVar.zzm()) != null) {
                zzabi zzabiVarZzr2 = zzmcVarZzm.zzr();
                while (true) {
                    zzne[] zzneVarArr = this.zzb;
                    if (i11 >= 2) {
                        break;
                    }
                    if (zzabiVarZzr2.zza(i11)) {
                        if (zzneVarArr[i11].zze() != 1) {
                            break;
                        }
                        int i12 = zzabiVarZzr2.zzb[i11].zzb;
                    }
                    i11++;
                }
            }
            listZzi = zzgwmVarZzi;
            zzznVar = zzznVarZzq;
            zzabiVar = zzabiVarZzr;
        } else if (zzxkVar.equals(this.zzH.zzb)) {
            listZzi = list;
            zzznVar = zzznVar2;
            zzabiVar = zzabiVar2;
        } else {
            zzabiVar = this.zzf;
            zzznVar = zzzn.zza;
            listZzi = zzgwm.zzi();
        }
        if (z10) {
            this.zzI.zzc(i10);
        }
        return this.zzH.zzc(zzxkVar, j10, j11, j12, zzau(), zzznVar, zzabiVar, listZzi);
    }

    private final void zzaq() throws zzjk {
        zzar(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzar(boolean[] zArr, long j10) throws zzjk {
        zzne[] zzneVarArr;
        zzmc zzmcVarZzn = this.zzs.zzn();
        zzabi zzabiVarZzr = zzmcVarZzn.zzr();
        int i10 = 0;
        while (true) {
            zzneVarArr = this.zzb;
            if (i10 >= 2) {
                break;
            }
            if (!zzabiVarZzr.zza(i10)) {
                zzneVarArr[i10].zzG();
            }
            i10++;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzabiVarZzr.zza(i11) && !zzneVarArr[i11].zzp(zzmcVarZzn)) {
                zzas(zzmcVarZzn, i11, zArr[i11], j10);
            }
        }
    }

    private final void zzas(zzmc zzmcVar, int i10, boolean z10, long j10) throws zzjk {
        zzne zzneVar = this.zzb[i10];
        if (zzneVar.zzM()) {
            return;
        }
        boolean z11 = zzmcVar == this.zzs.zzm();
        zzabi zzabiVarZzr = zzmcVar.zzr();
        zznd zzndVar = zzabiVarZzr.zzb[i10];
        zzaba zzabaVar = zzabiVarZzr.zzc[i10];
        boolean z12 = zzay() && this.zzH.zze == 3;
        boolean z13 = !z10 && z12;
        this.zzS++;
        zzneVar.zzx(zzndVar, zzabaVar, zzmcVar.zzc[i10], this.zzU, z13, z11, j10, zzmcVar.zza(), zzmcVar.zzg.zza, this.zzo);
        zzneVar.zzy(11, new zzli(this), zzmcVar);
        if (z12 && z11) {
            zzneVar.zzv();
        }
    }

    private final void zzat(boolean z10) {
        zzmc zzmcVarZzk = this.zzs.zzk();
        zzxk zzxkVar = zzmcVarZzk == null ? this.zzH.zzb : zzmcVarZzk.zzg.zza;
        boolean z11 = !this.zzH.zzk.equals(zzxkVar);
        if (z11) {
            this.zzH = this.zzH.zzh(zzxkVar);
        }
        zzms zzmsVar = this.zzH;
        zzmsVar.zzq = zzmcVarZzk == null ? zzmsVar.zzs : zzmcVarZzk.zzf();
        this.zzH.zzr = zzau();
        if ((z11 || z10) && zzmcVarZzk != null && zzmcVarZzk.zze) {
            zzax(zzmcVarZzk.zzg.zza, zzmcVarZzk.zzq(), zzmcVarZzk.zzr());
        }
    }

    private final long zzau() {
        return zzav(this.zzH.zzq);
    }

    private final long zzav(long j10) {
        zzmc zzmcVarZzk = this.zzs.zzk();
        if (zzmcVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.zzU - zzmcVarZzk.zza()));
    }

    private final long zzaw(zzmc zzmcVar) {
        zzgtj.zzi(zzmcVar.zze);
        return (long) ((zzmcVar.zzc() - this.zzU) / this.zzo.zzj().zzb);
    }

    private final void zzax(zzxk zzxkVar, zzzn zzznVar, zzabi zzabiVar) {
        long jZza;
        long jZza2;
        zzmf zzmfVar = this.zzs;
        zzmc zzmcVarZzk = zzmfVar.zzk();
        zzmcVarZzk.getClass();
        if (zzmcVarZzk == zzmfVar.zzm()) {
            jZza = this.zzU;
            jZza2 = zzmcVarZzk.zza();
        } else {
            jZza = this.zzU - zzmcVarZzk.zza();
            jZza2 = zzmcVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzlx(this.zzv, this.zzH.zza, zzxkVar, jZza - jZza2, zzav(zzmcVarZzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, zzP(this.zzH.zza, zzmcVarZzk.zzg.zza) ? this.zzae.zze() : -9223372036854775807L, this.zzN), zzznVar, zzabiVar.zzc);
    }

    private final boolean zzay() {
        zzms zzmsVar = this.zzH;
        return zzmsVar.zzl && zzmsVar.zzn == 0;
    }

    private final void zzaz(int i10) throws IOException, zzjk {
        zzne zzneVar = this.zzb[i10];
        try {
            zzmc zzmcVarZzm = this.zzs.zzm();
            zzmcVarZzm.getClass();
            zzneVar.zzu(zzmcVarZzm);
        } catch (IOException | RuntimeException e10) {
            zzneVar.zze();
            throw e10;
        }
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i10, boolean z10, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        Object obj2 = zzbfVar.zzb(zzbfVar.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i11 = 0; i11 < zzbfVar2.zza(); i11++) {
            if (zzbfVar2.zzb(i11, zzbeVar, 0L).zzb.equals(obj2)) {
                return i11;
            }
        }
        int iZze = zzbfVar.zze(obj);
        int iZzc = zzbfVar.zzc();
        int iZzl = iZze;
        int iZze2 = -1;
        for (int i12 = 0; i12 < iZzc && iZze2 == -1; i12++) {
            iZzl = zzbfVar.zzl(iZzl, zzbdVar, zzbeVar, i10, z10);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar.zzf(iZzl));
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzmw zzmwVar) {
        try {
            zzaF(zzmwVar);
        } catch (zzjk e10) {
            zzeg.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f10) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i10) {
        this.zzi.zze(33, i10, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzcS(long j10, long j11, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzE) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z10, int i10, int i11) {
        this.zzi.zze(1, z10 ? 1 : 0, (i11 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i10, long j10) {
        this.zzi.zzd(3, new zzlt(zzbfVar, i10, j10)).zza();
    }

    public final void zzg(zznh zznhVar) {
        this.zzi.zzd(38, zznhVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z10) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f10) {
        this.zzi.zzd(32, Float.valueOf(f10)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final void zzk(zzmw zzmwVar) {
        if (!this.zzJ && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmwVar).zza();
        } else {
            zzeg.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmwVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j10) {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzds zzdsVar = new zzds(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdsVar)).zza();
        if (j10 != -9223372036854775807L) {
            return zzdsVar.zze(j10);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzJ || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzJ = true;
        zzds zzdsVar = new zzds(this.zzq);
        this.zzi.zzd(7, zzdsVar).zza();
        return zzdsVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmq
    public final void zzo() {
        zzdz zzdzVar = this.zzi;
        zzdzVar.zzk(2);
        zzdzVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzxh
    public final void zzp(zzxi zzxiVar) {
        this.zzi.zzd(8, zzxiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final /* bridge */ /* synthetic */ void zzs(zzze zzzeVar) {
        this.zzi.zzd(9, (zzxi) zzzeVar).zza();
    }

    final /* synthetic */ zzmc zzt(zzmd zzmdVar, long j10) {
        zzabl zzablVarZze = this.zzg.zze(this.zzv);
        long j11 = this.zzaa.zzb;
        zzabi zzabiVar = this.zzf;
        zzmr zzmrVar = this.zzt;
        return new zzmc(this.zzc, j10, this.zze, zzablVarZze, zzmrVar, zzmdVar, zzabiVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i10, boolean z10) {
        this.zzw.zzB(i10, this.zzb[i10].zze(), z10);
    }

    final /* synthetic */ void zzv(int i10) {
        this.zzw.zzW(i10);
    }

    final /* synthetic */ zzdz zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i10, long j10, zzzf zzzfVar) {
        this.zzi.zzd(17, new zzlo(list, zzzfVar, i10, j10, null)).zza();
    }

    /* JADX WARN: Code duplicated, block: B:226:0x0521 A[Catch: zzjk -> 0x06d5, RuntimeException -> 0x06fc, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TRY_ENTER, TryCatch #7 {zzjk -> 0x06d5, blocks: (B:8:0x0017, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x004b, B:21:0x0050, B:23:0x0054, B:24:0x005e, B:26:0x006b, B:27:0x0072, B:28:0x0079, B:30:0x0082, B:31:0x008a, B:32:0x0091, B:33:0x00a0, B:34:0x00ad, B:38:0x00be, B:39:0x00c6, B:41:0x00d5, B:42:0x00dd, B:47:0x00ec, B:45:0x00e5, B:48:0x00f1, B:52:0x010d, B:53:0x0125, B:54:0x0136, B:55:0x014e, B:56:0x0153, B:57:0x0158, B:61:0x015f, B:63:0x0168, B:65:0x0174, B:66:0x017c, B:67:0x0187, B:68:0x019b, B:69:0x01b3, B:70:0x01c9, B:72:0x01d8, B:73:0x01dc, B:74:0x01ed, B:76:0x01fc, B:77:0x0218, B:78:0x022b, B:79:0x0234, B:81:0x0246, B:82:0x0252, B:83:0x0262, B:85:0x026e, B:88:0x0279, B:89:0x0280, B:90:0x028b, B:94:0x0292, B:96:0x029a, B:98:0x029e, B:100:0x02a3, B:102:0x02ad, B:103:0x02b1, B:107:0x02b8, B:109:0x02c8, B:113:0x02d2, B:110:0x02cc, B:112:0x02cf, B:114:0x02d6, B:116:0x02e8, B:120:0x02f2, B:117:0x02ec, B:119:0x02ef, B:121:0x02f6, B:123:0x02fc, B:125:0x0308, B:126:0x0311, B:128:0x0317, B:129:0x031b, B:131:0x0327, B:133:0x032e, B:135:0x0332, B:136:0x0343, B:138:0x0358, B:140:0x038d, B:141:0x0392, B:143:0x039a, B:145:0x03b7, B:146:0x03bb, B:153:0x03ed, B:159:0x03ff, B:160:0x040d, B:161:0x040e, B:163:0x0417, B:164:0x0421, B:165:0x0435, B:170:0x044a, B:172:0x0457, B:173:0x045a, B:179:0x0466, B:180:0x0469, B:182:0x0471, B:184:0x0475, B:186:0x0481, B:187:0x049a, B:189:0x049e, B:191:0x04a6, B:192:0x04ab, B:194:0x04b5, B:198:0x04be, B:204:0x04ce, B:210:0x04e3, B:213:0x04ee, B:217:0x04f6, B:219:0x04fe, B:221:0x0502, B:222:0x050d, B:224:0x0513, B:226:0x0521, B:228:0x0528, B:230:0x052c, B:234:0x053b, B:236:0x053f, B:238:0x0551, B:241:0x055c, B:243:0x0566, B:247:0x056f, B:249:0x0579, B:255:0x0584, B:209:0x04dc), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x0528 A[Catch: zzjk -> 0x06d5, RuntimeException -> 0x06fc, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TRY_LEAVE, TryCatch #7 {zzjk -> 0x06d5, blocks: (B:8:0x0017, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x004b, B:21:0x0050, B:23:0x0054, B:24:0x005e, B:26:0x006b, B:27:0x0072, B:28:0x0079, B:30:0x0082, B:31:0x008a, B:32:0x0091, B:33:0x00a0, B:34:0x00ad, B:38:0x00be, B:39:0x00c6, B:41:0x00d5, B:42:0x00dd, B:47:0x00ec, B:45:0x00e5, B:48:0x00f1, B:52:0x010d, B:53:0x0125, B:54:0x0136, B:55:0x014e, B:56:0x0153, B:57:0x0158, B:61:0x015f, B:63:0x0168, B:65:0x0174, B:66:0x017c, B:67:0x0187, B:68:0x019b, B:69:0x01b3, B:70:0x01c9, B:72:0x01d8, B:73:0x01dc, B:74:0x01ed, B:76:0x01fc, B:77:0x0218, B:78:0x022b, B:79:0x0234, B:81:0x0246, B:82:0x0252, B:83:0x0262, B:85:0x026e, B:88:0x0279, B:89:0x0280, B:90:0x028b, B:94:0x0292, B:96:0x029a, B:98:0x029e, B:100:0x02a3, B:102:0x02ad, B:103:0x02b1, B:107:0x02b8, B:109:0x02c8, B:113:0x02d2, B:110:0x02cc, B:112:0x02cf, B:114:0x02d6, B:116:0x02e8, B:120:0x02f2, B:117:0x02ec, B:119:0x02ef, B:121:0x02f6, B:123:0x02fc, B:125:0x0308, B:126:0x0311, B:128:0x0317, B:129:0x031b, B:131:0x0327, B:133:0x032e, B:135:0x0332, B:136:0x0343, B:138:0x0358, B:140:0x038d, B:141:0x0392, B:143:0x039a, B:145:0x03b7, B:146:0x03bb, B:153:0x03ed, B:159:0x03ff, B:160:0x040d, B:161:0x040e, B:163:0x0417, B:164:0x0421, B:165:0x0435, B:170:0x044a, B:172:0x0457, B:173:0x045a, B:179:0x0466, B:180:0x0469, B:182:0x0471, B:184:0x0475, B:186:0x0481, B:187:0x049a, B:189:0x049e, B:191:0x04a6, B:192:0x04ab, B:194:0x04b5, B:198:0x04be, B:204:0x04ce, B:210:0x04e3, B:213:0x04ee, B:217:0x04f6, B:219:0x04fe, B:221:0x0502, B:222:0x050d, B:224:0x0513, B:226:0x0521, B:228:0x0528, B:230:0x052c, B:234:0x053b, B:236:0x053f, B:238:0x0551, B:241:0x055c, B:243:0x0566, B:247:0x056f, B:249:0x0579, B:255:0x0584, B:209:0x04dc), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x052c A[Catch: RuntimeException -> 0x0440, zzjk -> 0x06d5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TRY_ENTER, TRY_LEAVE, TryCatch #7 {zzjk -> 0x06d5, blocks: (B:8:0x0017, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x004b, B:21:0x0050, B:23:0x0054, B:24:0x005e, B:26:0x006b, B:27:0x0072, B:28:0x0079, B:30:0x0082, B:31:0x008a, B:32:0x0091, B:33:0x00a0, B:34:0x00ad, B:38:0x00be, B:39:0x00c6, B:41:0x00d5, B:42:0x00dd, B:47:0x00ec, B:45:0x00e5, B:48:0x00f1, B:52:0x010d, B:53:0x0125, B:54:0x0136, B:55:0x014e, B:56:0x0153, B:57:0x0158, B:61:0x015f, B:63:0x0168, B:65:0x0174, B:66:0x017c, B:67:0x0187, B:68:0x019b, B:69:0x01b3, B:70:0x01c9, B:72:0x01d8, B:73:0x01dc, B:74:0x01ed, B:76:0x01fc, B:77:0x0218, B:78:0x022b, B:79:0x0234, B:81:0x0246, B:82:0x0252, B:83:0x0262, B:85:0x026e, B:88:0x0279, B:89:0x0280, B:90:0x028b, B:94:0x0292, B:96:0x029a, B:98:0x029e, B:100:0x02a3, B:102:0x02ad, B:103:0x02b1, B:107:0x02b8, B:109:0x02c8, B:113:0x02d2, B:110:0x02cc, B:112:0x02cf, B:114:0x02d6, B:116:0x02e8, B:120:0x02f2, B:117:0x02ec, B:119:0x02ef, B:121:0x02f6, B:123:0x02fc, B:125:0x0308, B:126:0x0311, B:128:0x0317, B:129:0x031b, B:131:0x0327, B:133:0x032e, B:135:0x0332, B:136:0x0343, B:138:0x0358, B:140:0x038d, B:141:0x0392, B:143:0x039a, B:145:0x03b7, B:146:0x03bb, B:153:0x03ed, B:159:0x03ff, B:160:0x040d, B:161:0x040e, B:163:0x0417, B:164:0x0421, B:165:0x0435, B:170:0x044a, B:172:0x0457, B:173:0x045a, B:179:0x0466, B:180:0x0469, B:182:0x0471, B:184:0x0475, B:186:0x0481, B:187:0x049a, B:189:0x049e, B:191:0x04a6, B:192:0x04ab, B:194:0x04b5, B:198:0x04be, B:204:0x04ce, B:210:0x04e3, B:213:0x04ee, B:217:0x04f6, B:219:0x04fe, B:221:0x0502, B:222:0x050d, B:224:0x0513, B:226:0x0521, B:228:0x0528, B:230:0x052c, B:234:0x053b, B:236:0x053f, B:238:0x0551, B:241:0x055c, B:243:0x0566, B:247:0x056f, B:249:0x0579, B:255:0x0584, B:209:0x04dc), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x0537 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:234:0x053b A[Catch: zzjk -> 0x06d5, RuntimeException -> 0x06fc, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TRY_ENTER, TryCatch #7 {zzjk -> 0x06d5, blocks: (B:8:0x0017, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x004b, B:21:0x0050, B:23:0x0054, B:24:0x005e, B:26:0x006b, B:27:0x0072, B:28:0x0079, B:30:0x0082, B:31:0x008a, B:32:0x0091, B:33:0x00a0, B:34:0x00ad, B:38:0x00be, B:39:0x00c6, B:41:0x00d5, B:42:0x00dd, B:47:0x00ec, B:45:0x00e5, B:48:0x00f1, B:52:0x010d, B:53:0x0125, B:54:0x0136, B:55:0x014e, B:56:0x0153, B:57:0x0158, B:61:0x015f, B:63:0x0168, B:65:0x0174, B:66:0x017c, B:67:0x0187, B:68:0x019b, B:69:0x01b3, B:70:0x01c9, B:72:0x01d8, B:73:0x01dc, B:74:0x01ed, B:76:0x01fc, B:77:0x0218, B:78:0x022b, B:79:0x0234, B:81:0x0246, B:82:0x0252, B:83:0x0262, B:85:0x026e, B:88:0x0279, B:89:0x0280, B:90:0x028b, B:94:0x0292, B:96:0x029a, B:98:0x029e, B:100:0x02a3, B:102:0x02ad, B:103:0x02b1, B:107:0x02b8, B:109:0x02c8, B:113:0x02d2, B:110:0x02cc, B:112:0x02cf, B:114:0x02d6, B:116:0x02e8, B:120:0x02f2, B:117:0x02ec, B:119:0x02ef, B:121:0x02f6, B:123:0x02fc, B:125:0x0308, B:126:0x0311, B:128:0x0317, B:129:0x031b, B:131:0x0327, B:133:0x032e, B:135:0x0332, B:136:0x0343, B:138:0x0358, B:140:0x038d, B:141:0x0392, B:143:0x039a, B:145:0x03b7, B:146:0x03bb, B:153:0x03ed, B:159:0x03ff, B:160:0x040d, B:161:0x040e, B:163:0x0417, B:164:0x0421, B:165:0x0435, B:170:0x044a, B:172:0x0457, B:173:0x045a, B:179:0x0466, B:180:0x0469, B:182:0x0471, B:184:0x0475, B:186:0x0481, B:187:0x049a, B:189:0x049e, B:191:0x04a6, B:192:0x04ab, B:194:0x04b5, B:198:0x04be, B:204:0x04ce, B:210:0x04e3, B:213:0x04ee, B:217:0x04f6, B:219:0x04fe, B:221:0x0502, B:222:0x050d, B:224:0x0513, B:226:0x0521, B:228:0x0528, B:230:0x052c, B:234:0x053b, B:236:0x053f, B:238:0x0551, B:241:0x055c, B:243:0x0566, B:247:0x056f, B:249:0x0579, B:255:0x0584, B:209:0x04dc), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x053f A[Catch: zzjk -> 0x06d5, RuntimeException -> 0x06fc, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TRY_LEAVE, TryCatch #7 {zzjk -> 0x06d5, blocks: (B:8:0x0017, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x004b, B:21:0x0050, B:23:0x0054, B:24:0x005e, B:26:0x006b, B:27:0x0072, B:28:0x0079, B:30:0x0082, B:31:0x008a, B:32:0x0091, B:33:0x00a0, B:34:0x00ad, B:38:0x00be, B:39:0x00c6, B:41:0x00d5, B:42:0x00dd, B:47:0x00ec, B:45:0x00e5, B:48:0x00f1, B:52:0x010d, B:53:0x0125, B:54:0x0136, B:55:0x014e, B:56:0x0153, B:57:0x0158, B:61:0x015f, B:63:0x0168, B:65:0x0174, B:66:0x017c, B:67:0x0187, B:68:0x019b, B:69:0x01b3, B:70:0x01c9, B:72:0x01d8, B:73:0x01dc, B:74:0x01ed, B:76:0x01fc, B:77:0x0218, B:78:0x022b, B:79:0x0234, B:81:0x0246, B:82:0x0252, B:83:0x0262, B:85:0x026e, B:88:0x0279, B:89:0x0280, B:90:0x028b, B:94:0x0292, B:96:0x029a, B:98:0x029e, B:100:0x02a3, B:102:0x02ad, B:103:0x02b1, B:107:0x02b8, B:109:0x02c8, B:113:0x02d2, B:110:0x02cc, B:112:0x02cf, B:114:0x02d6, B:116:0x02e8, B:120:0x02f2, B:117:0x02ec, B:119:0x02ef, B:121:0x02f6, B:123:0x02fc, B:125:0x0308, B:126:0x0311, B:128:0x0317, B:129:0x031b, B:131:0x0327, B:133:0x032e, B:135:0x0332, B:136:0x0343, B:138:0x0358, B:140:0x038d, B:141:0x0392, B:143:0x039a, B:145:0x03b7, B:146:0x03bb, B:153:0x03ed, B:159:0x03ff, B:160:0x040d, B:161:0x040e, B:163:0x0417, B:164:0x0421, B:165:0x0435, B:170:0x044a, B:172:0x0457, B:173:0x045a, B:179:0x0466, B:180:0x0469, B:182:0x0471, B:184:0x0475, B:186:0x0481, B:187:0x049a, B:189:0x049e, B:191:0x04a6, B:192:0x04ab, B:194:0x04b5, B:198:0x04be, B:204:0x04ce, B:210:0x04e3, B:213:0x04ee, B:217:0x04f6, B:219:0x04fe, B:221:0x0502, B:222:0x050d, B:224:0x0513, B:226:0x0521, B:228:0x0528, B:230:0x052c, B:234:0x053b, B:236:0x053f, B:238:0x0551, B:241:0x055c, B:243:0x0566, B:247:0x056f, B:249:0x0579, B:255:0x0584, B:209:0x04dc), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0551 A[Catch: RuntimeException -> 0x0440, zzjk -> 0x06d5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TRY_ENTER, TRY_LEAVE, TryCatch #7 {zzjk -> 0x06d5, blocks: (B:8:0x0017, B:9:0x0022, B:11:0x0028, B:12:0x002f, B:14:0x0039, B:16:0x003f, B:18:0x0043, B:20:0x004b, B:21:0x0050, B:23:0x0054, B:24:0x005e, B:26:0x006b, B:27:0x0072, B:28:0x0079, B:30:0x0082, B:31:0x008a, B:32:0x0091, B:33:0x00a0, B:34:0x00ad, B:38:0x00be, B:39:0x00c6, B:41:0x00d5, B:42:0x00dd, B:47:0x00ec, B:45:0x00e5, B:48:0x00f1, B:52:0x010d, B:53:0x0125, B:54:0x0136, B:55:0x014e, B:56:0x0153, B:57:0x0158, B:61:0x015f, B:63:0x0168, B:65:0x0174, B:66:0x017c, B:67:0x0187, B:68:0x019b, B:69:0x01b3, B:70:0x01c9, B:72:0x01d8, B:73:0x01dc, B:74:0x01ed, B:76:0x01fc, B:77:0x0218, B:78:0x022b, B:79:0x0234, B:81:0x0246, B:82:0x0252, B:83:0x0262, B:85:0x026e, B:88:0x0279, B:89:0x0280, B:90:0x028b, B:94:0x0292, B:96:0x029a, B:98:0x029e, B:100:0x02a3, B:102:0x02ad, B:103:0x02b1, B:107:0x02b8, B:109:0x02c8, B:113:0x02d2, B:110:0x02cc, B:112:0x02cf, B:114:0x02d6, B:116:0x02e8, B:120:0x02f2, B:117:0x02ec, B:119:0x02ef, B:121:0x02f6, B:123:0x02fc, B:125:0x0308, B:126:0x0311, B:128:0x0317, B:129:0x031b, B:131:0x0327, B:133:0x032e, B:135:0x0332, B:136:0x0343, B:138:0x0358, B:140:0x038d, B:141:0x0392, B:143:0x039a, B:145:0x03b7, B:146:0x03bb, B:153:0x03ed, B:159:0x03ff, B:160:0x040d, B:161:0x040e, B:163:0x0417, B:164:0x0421, B:165:0x0435, B:170:0x044a, B:172:0x0457, B:173:0x045a, B:179:0x0466, B:180:0x0469, B:182:0x0471, B:184:0x0475, B:186:0x0481, B:187:0x049a, B:189:0x049e, B:191:0x04a6, B:192:0x04ab, B:194:0x04b5, B:198:0x04be, B:204:0x04ce, B:210:0x04e3, B:213:0x04ee, B:217:0x04f6, B:219:0x04fe, B:221:0x0502, B:222:0x050d, B:224:0x0513, B:226:0x0521, B:228:0x0528, B:230:0x052c, B:234:0x053b, B:236:0x053f, B:238:0x0551, B:241:0x055c, B:243:0x0566, B:247:0x056f, B:249:0x0579, B:255:0x0584, B:209:0x04dc), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x055a  */
    /* JADX WARN: Code duplicated, block: B:246:0x056e  */
    /* JADX WARN: Code duplicated, block: B:252:0x057f  */
    /* JADX WARN: Code duplicated, block: B:259:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:263:0x05e3 A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:265:0x05f5 A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, PHI: r38
      0x05f5: PHI (r38v1 long) = (r38v0 long), (r1v41 long) binds: [B:264:0x05f0, B:258:0x05ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x05fc A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x0600 A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:271:0x0606  */
    /* JADX WARN: Code duplicated, block: B:272:0x0607 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x0609 A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x0619 A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:277:0x061f A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x0629 A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, LOOP:7: B:278:0x0627->B:279:0x0629, LOOP_END, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x069e A[Catch: RuntimeException -> 0x06f3, zzjk -> 0x06f5, IOException -> 0x0728, zzwk -> 0x0730, zzhq -> 0x0738, zzat -> 0x0740, zzuf -> 0x0757, TryCatch #13 {zzjk -> 0x06f5, RuntimeException -> 0x06f3, blocks: (B:283:0x063b, B:286:0x0643, B:288:0x0647, B:290:0x064f, B:291:0x0652, B:292:0x0656, B:294:0x065c, B:296:0x0665, B:298:0x066f, B:300:0x0675, B:302:0x0680, B:309:0x06a5, B:311:0x06ab, B:315:0x06b5, B:326:0x06d0, B:323:0x06c7, B:325:0x06cb, B:303:0x0687, B:306:0x0695, B:307:0x069d, B:308:0x069e, B:261:0x05d6, B:263:0x05e3, B:265:0x05f5, B:267:0x05fc, B:269:0x0600, B:273:0x0609, B:275:0x0619, B:277:0x061f, B:279:0x0629, B:280:0x062e, B:281:0x0633, B:282:0x0638, B:257:0x059d, B:329:0x06de, B:333:0x06e8), top: B:426:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x0707  */
    /* JADX WARN: Code duplicated, block: B:348:0x070f  */
    /* JADX WARN: Code duplicated, block: B:398:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:400:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:403:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:405:0x0803 A[LOOP:9: B:405:0x0803->B:407:0x080d, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:407:0x080d A[LOOP:9: B:405:0x0803->B:407:0x080d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:411:0x0832  */
    /* JADX WARN: Instruction removed from duplicated block: B:277:0x061f, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x06f7: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:1784), block:B:338:0x06f6 */
    /* JADX WARN: Not initialized variable reg: 37, insn: 0x06f8: MOVE (r12 I:??[OBJECT, ARRAY]) = (r37 I:??[OBJECT, ARRAY]) (LINE:1786), block:B:338:0x06f6 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String str;
        String str2;
        zzjk zzjkVarZzd;
        RuntimeException runtimeException;
        int i10;
        zzjk zzjkVar;
        zzjk zzjkVar2;
        boolean z10;
        int i11;
        zzmf zzmfVar;
        zzxk zzxkVar;
        zzmc zzmcVarZzn;
        String str3;
        String str4;
        zzmf zzmfVar2;
        boolean z11;
        boolean z12;
        zzms zzmsVar;
        zzmc zzmcVarZzm;
        int i12;
        zzmc zzmcVarZzm2;
        long jZze;
        zzmc zzmcVarZzk;
        boolean z13;
        boolean z14;
        boolean zZzi;
        boolean z15 = true;
        try {
            try {
                try {
                    zzd zzdVar = null;
                    try {
                        try {
                            try {
                                switch (message.what) {
                                    case 1:
                                        boolean z16 = message.arg1 != 0;
                                        int i13 = message.arg2;
                                        zzE(z16, i13 >> 4, true, i13 & 15);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 2:
                                        boolean z17 = false;
                                        z15 = true;
                                        int i14 = 2;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        this.zzi.zzk(2);
                                        boolean z18 = this.zzA;
                                        if (!z18) {
                                            zzai();
                                        }
                                        int i15 = this.zzH.zze;
                                        if (i15 != 1 && i15 != 4) {
                                            if (z18) {
                                                zzai();
                                            }
                                            zzmf zzmfVar3 = this.zzs;
                                            zzmc zzmcVarZzm3 = zzmfVar3.zzm();
                                            if (zzmcVarZzm3 != null) {
                                                Trace.beginSection("doSomeWork");
                                                zzL();
                                                if (zzmcVarZzm3.zze) {
                                                    this.zzV = zzfl.zzs(SystemClock.elapsedRealtime());
                                                    zzmcVarZzm3.zza.zzf(this.zzH.zzs - this.zzn, false);
                                                    int i16 = 0;
                                                    z11 = true;
                                                    z12 = true;
                                                    while (true) {
                                                        zzne[] zzneVarArr = this.zzb;
                                                        if (i16 < i14) {
                                                            zzne zzneVar = zzneVarArr[i16];
                                                            if (zzneVar.zzd() == 0) {
                                                                zzN(i16, z17);
                                                            } else {
                                                                zzneVar.zzs(this.zzU, this.zzV);
                                                                z12 = z12 && zzneVar.zzo();
                                                                boolean zZzt = zzneVar.zzt(zzmcVarZzm3);
                                                                zzN(i16, zZzt);
                                                                boolean z19 = z11 && zZzt;
                                                                if (!zZzt) {
                                                                    zzaz(i16);
                                                                }
                                                                z11 = z19;
                                                            }
                                                            i16++;
                                                            zzmfVar3 = zzmfVar3;
                                                            i14 = 2;
                                                            z17 = false;
                                                        } else {
                                                            zzmfVar2 = zzmfVar3;
                                                        }
                                                    }
                                                } else {
                                                    zzmfVar2 = zzmfVar3;
                                                    zzmcVarZzm3.zza.zzc();
                                                    z11 = true;
                                                    z12 = true;
                                                }
                                                long j10 = zzmcVarZzm3.zzg.zzf;
                                                if (z12 && zzmcVarZzm3.zze && (j10 == -9223372036854775807L || j10 <= this.zzH.zzs)) {
                                                    if (this.zzL) {
                                                        this.zzL = false;
                                                        zzE(false, this.zzH.zzn, false, 5);
                                                    }
                                                    if (zzmcVarZzm3.zzg.zzk) {
                                                        zzB(4);
                                                        zzK();
                                                        jUptimeMillis = jUptimeMillis;
                                                    } else {
                                                        zzmsVar = this.zzH;
                                                        if (zzmsVar.zze != 2) {
                                                            jUptimeMillis = jUptimeMillis;
                                                            if (this.zzH.zze == 3) {
                                                                if (this.zzS == 0) {
                                                                    if (!zzae()) {
                                                                        zzaD(zzay(), false);
                                                                        zzB(2);
                                                                        if (this.zzM) {
                                                                            for (zzmcVarZzm = zzmfVar2.zzm(); zzmcVarZzm != null; zzmcVarZzm = zzmcVarZzm.zzp()) {
                                                                                for (zzaba zzabaVar : zzmcVarZzm.zzr().zzc) {
                                                                                }
                                                                            }
                                                                            this.zzae.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                } else if (!z11) {
                                                                    zzaD(zzay(), false);
                                                                    zzB(2);
                                                                    if (this.zzM) {
                                                                        while (zzmcVarZzm != null) {
                                                                            while (i12 < r3) {
                                                                            }
                                                                        }
                                                                        this.zzae.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            }
                                                        } else {
                                                            if (this.zzS == 0) {
                                                                zZzi = zzae();
                                                            } else {
                                                                if (z11) {
                                                                    if (zzmsVar.zzg) {
                                                                        zzmcVarZzm2 = zzmfVar2.zzm();
                                                                        if (zzP(this.zzH.zza, zzmcVarZzm2.zzg.zza)) {
                                                                            jZze = this.zzae.zze();
                                                                        } else {
                                                                            jZze = -9223372036854775807L;
                                                                        }
                                                                        zzmcVarZzk = zzmfVar2.zzk();
                                                                        if (zzmcVarZzk.zzd()) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        if (zzmcVarZzk.zzg.zza.zzb()) {
                                                                            z14 = false;
                                                                        } else {
                                                                            z14 = false;
                                                                        }
                                                                        if (z13) {
                                                                        }
                                                                    }
                                                                    jUptimeMillis = jUptimeMillis;
                                                                    zzB(3);
                                                                    this.zzY = null;
                                                                    if (zzay()) {
                                                                        zzaD(false, false);
                                                                        this.zzo.zza();
                                                                        zzJ();
                                                                    }
                                                                } else {
                                                                    jUptimeMillis = jUptimeMillis;
                                                                }
                                                                if (this.zzH.zze == 3) {
                                                                    if (this.zzS == 0) {
                                                                        if (!zzae()) {
                                                                            zzaD(zzay(), false);
                                                                            zzB(2);
                                                                            if (this.zzM) {
                                                                                while (zzmcVarZzm != null) {
                                                                                    while (i12 < r3) {
                                                                                    }
                                                                                }
                                                                                this.zzae.zzc();
                                                                            }
                                                                            zzK();
                                                                        }
                                                                    } else if (!z11) {
                                                                        zzaD(zzay(), false);
                                                                        zzB(2);
                                                                        if (this.zzM) {
                                                                            while (zzmcVarZzm != null) {
                                                                                while (i12 < r3) {
                                                                                }
                                                                            }
                                                                            this.zzae.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                }
                                                            }
                                                            if (zZzi) {
                                                                zzB(3);
                                                                this.zzY = null;
                                                                if (zzay()) {
                                                                    zzaD(false, false);
                                                                    this.zzo.zza();
                                                                    zzJ();
                                                                }
                                                            } else if (this.zzH.zze == 3) {
                                                                if (this.zzS == 0) {
                                                                    if (!zzae()) {
                                                                        zzaD(zzay(), false);
                                                                        zzB(2);
                                                                        if (this.zzM) {
                                                                            while (zzmcVarZzm != null) {
                                                                                while (i12 < r3) {
                                                                                }
                                                                            }
                                                                            this.zzae.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                } else if (!z11) {
                                                                    zzaD(zzay(), false);
                                                                    zzB(2);
                                                                    if (this.zzM) {
                                                                        while (zzmcVarZzm != null) {
                                                                            while (i12 < r3) {
                                                                            }
                                                                        }
                                                                        this.zzae.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zzmsVar = this.zzH;
                                                    if (zzmsVar.zze != 2) {
                                                        jUptimeMillis = jUptimeMillis;
                                                        if (this.zzH.zze == 3) {
                                                            if (this.zzS == 0) {
                                                                if (!zzae()) {
                                                                    zzaD(zzay(), false);
                                                                    zzB(2);
                                                                    if (this.zzM) {
                                                                        while (zzmcVarZzm != null) {
                                                                            while (i12 < r3) {
                                                                            }
                                                                        }
                                                                        this.zzae.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            } else if (!z11) {
                                                                zzaD(zzay(), false);
                                                                zzB(2);
                                                                if (this.zzM) {
                                                                    while (zzmcVarZzm != null) {
                                                                        while (i12 < r3) {
                                                                        }
                                                                    }
                                                                    this.zzae.zzc();
                                                                }
                                                                zzK();
                                                            }
                                                        }
                                                    } else {
                                                        if (this.zzS == 0) {
                                                            zZzi = zzae();
                                                        } else {
                                                            if (z11) {
                                                                jUptimeMillis = jUptimeMillis;
                                                            } else {
                                                                if (zzmsVar.zzg) {
                                                                    zzmcVarZzm2 = zzmfVar2.zzm();
                                                                    if (zzP(this.zzH.zza, zzmcVarZzm2.zzg.zza)) {
                                                                        jZze = this.zzae.zze();
                                                                    } else {
                                                                        jZze = -9223372036854775807L;
                                                                    }
                                                                    zzmcVarZzk = zzmfVar2.zzk();
                                                                    if (zzmcVarZzk.zzd() || !zzmcVarZzk.zzg.zzk) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = true;
                                                                    }
                                                                    if (zzmcVarZzk.zzg.zza.zzb() || zzmcVarZzk.zze) {
                                                                        z14 = false;
                                                                    } else {
                                                                        z14 = true;
                                                                    }
                                                                    if (z13 && !z14) {
                                                                        zZzi = this.zzg.zzi(new zzlx(this.zzv, this.zzH.zza, zzmcVarZzm2.zzg.zza, this.zzU - zzmcVarZzm2.zza(), zzav(zzmcVarZzk.zzf()), this.zzo.zzj().zzb, this.zzH.zzl, this.zzM, jZze, this.zzN));
                                                                    }
                                                                    zzB(3);
                                                                    this.zzY = null;
                                                                    if (zzay()) {
                                                                        zzaD(false, false);
                                                                        this.zzo.zza();
                                                                        zzJ();
                                                                    }
                                                                }
                                                                jUptimeMillis = jUptimeMillis;
                                                                zzB(3);
                                                                this.zzY = null;
                                                                if (zzay()) {
                                                                    zzaD(false, false);
                                                                    this.zzo.zza();
                                                                    zzJ();
                                                                }
                                                            }
                                                            if (this.zzH.zze == 3) {
                                                                if (this.zzS == 0) {
                                                                    if (!zzae()) {
                                                                        zzaD(zzay(), false);
                                                                        zzB(2);
                                                                        if (this.zzM) {
                                                                            while (zzmcVarZzm != null) {
                                                                                while (i12 < r3) {
                                                                                }
                                                                            }
                                                                            this.zzae.zzc();
                                                                        }
                                                                        zzK();
                                                                    }
                                                                } else if (!z11) {
                                                                    zzaD(zzay(), false);
                                                                    zzB(2);
                                                                    if (this.zzM) {
                                                                        while (zzmcVarZzm != null) {
                                                                            while (i12 < r3) {
                                                                            }
                                                                        }
                                                                        this.zzae.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            }
                                                        }
                                                        if (zZzi) {
                                                            zzB(3);
                                                            this.zzY = null;
                                                            if (zzay()) {
                                                                zzaD(false, false);
                                                                this.zzo.zza();
                                                                zzJ();
                                                            }
                                                        } else if (this.zzH.zze == 3) {
                                                            if (this.zzS == 0) {
                                                                if (!zzae()) {
                                                                    zzaD(zzay(), false);
                                                                    zzB(2);
                                                                    if (this.zzM) {
                                                                        while (zzmcVarZzm != null) {
                                                                            while (i12 < r3) {
                                                                            }
                                                                        }
                                                                        this.zzae.zzc();
                                                                    }
                                                                    zzK();
                                                                }
                                                            } else if (!z11) {
                                                                zzaD(zzay(), false);
                                                                zzB(2);
                                                                if (this.zzM) {
                                                                    while (zzmcVarZzm != null) {
                                                                        while (i12 < r3) {
                                                                        }
                                                                    }
                                                                    this.zzae.zzc();
                                                                }
                                                                zzK();
                                                            }
                                                        }
                                                    }
                                                }
                                                int i17 = 2;
                                                if (this.zzH.zze == 2) {
                                                    int i18 = 0;
                                                    while (true) {
                                                        zzne[] zzneVarArr2 = this.zzb;
                                                        if (i18 < i17) {
                                                            if (zzneVarArr2[i18].zzp(zzmcVarZzm3)) {
                                                                zzaz(i18);
                                                            }
                                                            i18++;
                                                            i17 = 2;
                                                        } else {
                                                            zzms zzmsVar2 = this.zzH;
                                                            if (zzmsVar2.zzg || zzmsVar2.zzr >= 500000 || !zzaG(zzmfVar2.zzk()) || !zzay()) {
                                                                this.zzZ = -9223372036854775807L;
                                                            } else if (this.zzZ == -9223372036854775807L) {
                                                                this.zzZ = SystemClock.elapsedRealtime();
                                                            } else if (SystemClock.elapsedRealtime() - this.zzZ >= 4000) {
                                                                throw new zzfd(0, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    this.zzZ = -9223372036854775807L;
                                                }
                                                boolean z20 = zzay() && this.zzH.zze == 3;
                                                zzms zzmsVar3 = this.zzH;
                                                boolean z21 = zzmsVar3.zzp;
                                                int i19 = zzmsVar3.zze;
                                                if (i19 != 4 && (z20 || i19 == 2 || (i19 == 3 && this.zzS != 0))) {
                                                    zzQ(jUptimeMillis);
                                                }
                                                Trace.endSection();
                                                z10 = true;
                                                zzC();
                                                return z10;
                                            }
                                            zzQ(jUptimeMillis);
                                            runtimeException = e;
                                            if (!(runtimeException instanceof IllegalStateException) || (runtimeException instanceof IllegalArgumentException)) {
                                                i10 = 1004;
                                            } else {
                                                i10 = 1000;
                                            }
                                            zzjk zzjkVarZzc = zzjk.zzc(runtimeException, i10);
                                            zzeg.zzf("ExoPlayerImplInternal", "Playback error", zzjkVarZzc);
                                            zzW(true, false);
                                            this.zzH = this.zzH.zzf(zzjkVarZzc);
                                            z10 = true;
                                            zzC();
                                            return z10;
                                        }
                                        z10 = z15;
                                        zzC();
                                        return z10;
                                    case 3:
                                        z15 = true;
                                        zzR((zzlt) message.obj);
                                        z10 = z15;
                                        zzC();
                                        return z10;
                                    case 4:
                                        z15 = true;
                                        zzM((zzav) message.obj);
                                        zzal(this.zzo.zzj(), true);
                                        z10 = z15;
                                        zzC();
                                        return z10;
                                    case 5:
                                        z15 = true;
                                        this.zzB = (zzni) message.obj;
                                        z10 = z15;
                                        zzC();
                                        return z10;
                                    case 6:
                                        z15 = true;
                                        zzW(false, true);
                                        z10 = z15;
                                        zzC();
                                        return z10;
                                    case 7:
                                        zzds zzdsVar = (zzds) message.obj;
                                        try {
                                            zzX(true, false, true, false);
                                            int i20 = 0;
                                            while (true) {
                                                zzne[] zzneVarArr3 = this.zzb;
                                                if (i20 >= 2) {
                                                    this.zzg.zzd(this.zzv);
                                                    this.zzz.zzd();
                                                    this.zze.zzb();
                                                    zzB(1);
                                                    this.zzi.zzl(null);
                                                    this.zzj.zzb();
                                                    zzdsVar.zza();
                                                    return true;
                                                }
                                                try {
                                                    this.zzc[i20].zzw();
                                                    zzneVarArr3[i20].zzI();
                                                    i20++;
                                                } catch (Throwable th) {
                                                    th = th;
                                                }
                                                th = th;
                                                Throwable th2 = th;
                                                this.zzi.zzl(null);
                                                this.zzj.zzb();
                                                zzdsVar.zza();
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        break;
                                    case 8:
                                        zzxi zzxiVar = (zzxi) message.obj;
                                        zzmf zzmfVar4 = this.zzs;
                                        if (zzmfVar4.zzd(zzxiVar)) {
                                            zzmc zzmcVarZzk2 = zzmfVar4.zzk();
                                            zzmcVarZzk2.getClass();
                                            if (!zzmcVarZzk2.zze) {
                                                float f10 = this.zzo.zzj().zzb;
                                                zzms zzmsVar4 = this.zzH;
                                                zzmcVarZzk2.zzh(f10, zzmsVar4.zza, zzmsVar4.zzl);
                                            }
                                            zzax(zzmcVarZzk2.zzg.zza, zzmcVarZzk2.zzq(), zzmcVarZzk2.zzr());
                                            if (zzmcVarZzk2 == zzmfVar4.zzm()) {
                                                zzU(zzmcVarZzk2.zzg.zzb, true);
                                                zzaq();
                                                zzmcVarZzk2.zzh = true;
                                                zzms zzmsVar5 = this.zzH;
                                                zzxk zzxkVar2 = zzmsVar5.zzb;
                                                long j11 = zzmcVarZzk2.zzg.zzb;
                                                this.zzH = zzap(zzxkVar2, j11, zzmsVar5.zzc, j11, false, 5);
                                            }
                                            zzan();
                                        } else {
                                            z15 = true;
                                            zzmc zzmcVarZzu = zzmfVar4.zzu(zzxiVar);
                                            if (zzmcVarZzu != null) {
                                                zzgtj.zzi(!zzmcVarZzu.zze);
                                                float f11 = this.zzo.zzj().zzb;
                                                zzms zzmsVar6 = this.zzH;
                                                zzmcVarZzu.zzh(f11, zzmsVar6.zza, zzmsVar6.zzl);
                                                if (zzmfVar4.zze(zzxiVar)) {
                                                    zzaj();
                                                }
                                            }
                                        }
                                        z10 = z15;
                                        zzC();
                                        return z10;
                                    case 9:
                                        zzxi zzxiVar2 = (zzxi) message.obj;
                                        zzmf zzmfVar5 = this.zzs;
                                        if (zzmfVar5.zzd(zzxiVar2)) {
                                            zzmfVar5.zzf(this.zzU);
                                            zzan();
                                        } else if (zzmfVar5.zze(zzxiVar2)) {
                                            zzaj();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 10:
                                        zzad();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 11:
                                        int i21 = message.arg1;
                                        this.zzP = i21;
                                        int iZza = this.zzs.zza(this.zzH.zza, i21);
                                        if ((iZza & 1) != 0) {
                                            zzI(true);
                                        } else if ((iZza & 2) != 0) {
                                            zzab();
                                        }
                                        zzat(false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 12:
                                        boolean z22 = message.arg1 != 0;
                                        this.zzQ = z22;
                                        int iZzb = this.zzs.zzb(this.zzH.zza, z22);
                                        if ((iZzb & 1) != 0) {
                                            zzI(true);
                                        } else if ((iZzb & 2) != 0) {
                                            zzab();
                                        }
                                        zzat(false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 13:
                                        boolean z23 = message.arg1 != 0;
                                        zzds zzdsVar2 = (zzds) message.obj;
                                        if (this.zzR != z23) {
                                            this.zzR = z23;
                                            if (!z23) {
                                                zzne[] zzneVarArr4 = this.zzb;
                                                for (int i22 = 0; i22 < 2; i22++) {
                                                    zzneVarArr4[i22].zzG();
                                                }
                                            }
                                        }
                                        if (zzdsVar2 != null) {
                                            zzdsVar2.zza();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 14:
                                        zzmw zzmwVar = (zzmw) message.obj;
                                        if (zzmwVar.zzf() == this.zzk) {
                                            zzaF(zzmwVar);
                                            int i23 = this.zzH.zze;
                                            if (i23 == 3 || i23 == 2) {
                                                this.zzi.zzh(2);
                                            }
                                        } else {
                                            this.zzi.zzd(15, zzmwVar).zza();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 15:
                                        final zzmw zzmwVar2 = (zzmw) message.obj;
                                        Looper looperZzf = zzmwVar2.zzf();
                                        if (looperZzf.getThread().isAlive()) {
                                            this.zzq.zzd(looperZzf, null).zzm(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzlm
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzlu.zzz(zzmwVar2);
                                                }
                                            });
                                        } else {
                                            zzeg.zzc("TAG", "Trying to send message on a dead thread.");
                                            zzmwVar2.zzi(false);
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 16:
                                        zzal((zzav) message.obj, false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 17:
                                        zzlo zzloVar = (zzlo) message.obj;
                                        this.zzI.zza(1);
                                        if (zzloVar.zzb() != -1) {
                                            this.zzT = new zzlt(new zzmy(zzloVar.zza(), zzloVar.zzd()), zzloVar.zzb(), zzloVar.zzc());
                                        }
                                        zzaf(this.zzt.zzl(zzloVar.zza(), zzloVar.zzd()), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 18:
                                        zzlo zzloVar2 = (zzlo) message.obj;
                                        int iZzc = message.arg1;
                                        this.zzI.zza(1);
                                        zzmr zzmrVar = this.zzt;
                                        if (iZzc == -1) {
                                            iZzc = zzmrVar.zzc();
                                        }
                                        zzaf(zzmrVar.zzm(iZzc, zzloVar2.zza(), zzloVar2.zzd()), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 19:
                                        zzlp zzlpVar = (zzlp) message.obj;
                                        this.zzI.zza(1);
                                        zzmr zzmrVar2 = this.zzt;
                                        int i24 = zzlpVar.zza;
                                        zzaf(zzmrVar2.zzo(0, 0, 0, null), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 20:
                                        int i25 = message.arg1;
                                        int i26 = message.arg2;
                                        zzzf zzzfVar = (zzzf) message.obj;
                                        this.zzI.zza(1);
                                        zzaf(this.zzt.zzn(i25, i26, zzzfVar), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 21:
                                        zzzf zzzfVar2 = (zzzf) message.obj;
                                        this.zzI.zza(1);
                                        zzaf(this.zzt.zzp(zzzfVar2), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 22:
                                        zzaf(this.zzt.zzh(), true);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 23:
                                        this.zzK = message.arg1 != 0;
                                        zzak();
                                        if (this.zzL) {
                                            zzmf zzmfVar6 = this.zzs;
                                            if (zzmfVar6.zzn() != zzmfVar6.zzm()) {
                                                zzI(true);
                                                zzat(false);
                                            }
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 24:
                                    default:
                                        return false;
                                    case 25:
                                        zzac();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 26:
                                        zzac();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 27:
                                        int i27 = message.arg1;
                                        int i28 = message.arg2;
                                        List list = (List) message.obj;
                                        this.zzI.zza(1);
                                        zzaf(this.zzt.zza(i27, i28, list), false);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 28:
                                        zzju zzjuVar = (zzju) message.obj;
                                        this.zzaa = zzjuVar;
                                        this.zzs.zzc(this.zzH.zza, zzjuVar);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 29:
                                        this.zzI.zza(1);
                                        zzX(false, false, false, true);
                                        this.zzg.zza(this.zzv);
                                        zzB(true != this.zzH.zza.zzg() ? 2 : 4);
                                        zzF();
                                        this.zzt.zzd(this.zzh.zze());
                                        this.zzi.zzh(2);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 30:
                                        Pair pair = (Pair) message.obj;
                                        Object obj = pair.first;
                                        zzds zzdsVar3 = (zzds) pair.second;
                                        zzne[] zzneVarArr5 = this.zzb;
                                        for (int i29 = 0; i29 < 2; i29++) {
                                            zzneVarArr5[i29].zzJ(obj);
                                        }
                                        int i30 = this.zzH.zze;
                                        if (i30 == 3 || i30 == 2) {
                                            this.zzi.zzh(2);
                                        }
                                        if (zzdsVar3 != null) {
                                            zzdsVar3.zza();
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 31:
                                        zzd zzdVar2 = (zzd) message.obj;
                                        int i31 = message.arg1;
                                        this.zze.zze(zzdVar2);
                                        zzcd zzcdVar = this.zzz;
                                        if (i31 != 0) {
                                            zzdVar = zzdVar2;
                                        }
                                        zzcdVar.zzb(zzdVar);
                                        zzF();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 32:
                                        zzD(((Float) message.obj).floatValue());
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 33:
                                        int i32 = message.arg1;
                                        zzms zzmsVar7 = this.zzH;
                                        zzH(zzmsVar7.zzl, i32, zzmsVar7.zzn, zzmsVar7.zzm);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 34:
                                        zzD(this.zzad);
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 35:
                                        zzadr zzadrVar = (zzadr) message.obj;
                                        zzne[] zzneVarArr6 = this.zzb;
                                        for (int i33 = 0; i33 < 2; i33++) {
                                            zzneVarArr6[i33].zzK(zzadrVar);
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 36:
                                        boolean zBooleanValue = ((Boolean) message.obj).booleanValue();
                                        if (!zBooleanValue) {
                                            if (this.zzF != null && this.zzE && !this.zzi.zzb(37)) {
                                                this.zzG++;
                                            }
                                            final int i34 = this.zzG;
                                            if (i34 > 0) {
                                                this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzll
                                                    @Override // java.lang.Runnable
                                                    public final /* synthetic */ void run() {
                                                        this.zza.zzv(i34);
                                                    }
                                                });
                                            }
                                            this.zzG = 0;
                                            this.zzE = false;
                                            this.zzi.zzk(37);
                                            zzlt zzltVar = this.zzF;
                                            if (zzltVar != null) {
                                                zzR(zzltVar);
                                                this.zzF = null;
                                                this.zzE = false;
                                            }
                                        }
                                        this.zzD = zBooleanValue;
                                        zzV();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 37:
                                        this.zzE = false;
                                        zzlt zzltVar2 = this.zzF;
                                        if (zzltVar2 != null) {
                                            zzR(zzltVar2);
                                            this.zzF = null;
                                        }
                                        z10 = true;
                                        zzC();
                                        return z10;
                                    case 38:
                                        this.zzC = (zznh) message.obj;
                                        zzV();
                                        z10 = true;
                                        zzC();
                                        return z10;
                                }
                            } catch (zzjk e10) {
                                zzjkVarZzd = e10;
                                str = "Playback error";
                                str2 = "ExoPlayerImplInternal";
                                if (zzjkVarZzd.zzc == 1 && (zzmcVarZzn = this.zzs.zzn()) != null && zzjkVarZzd.zzh == null) {
                                    zzjkVarZzd = zzjkVarZzd.zzd(zzmcVarZzn.zzg.zza);
                                }
                                if (zzjkVarZzd.zzc == 1 || (zzxkVar = zzjkVarZzd.zzh) == null) {
                                    zzjkVar = this.zzY;
                                    if (zzjkVar != null) {
                                        zzjkVar.addSuppressed(zzjkVarZzd);
                                        zzjkVarZzd = this.zzY;
                                    }
                                    zzjkVar2 = zzjkVarZzd;
                                    if (zzjkVar2.zzc == 1) {
                                        zzmfVar = this.zzs;
                                        if (zzmfVar.zzm() != zzmfVar.zzn()) {
                                            while (zzmfVar.zzm() != zzmfVar.zzn()) {
                                                zzmfVar.zzr();
                                            }
                                            zzmc zzmcVarZzm4 = zzmfVar.zzm();
                                            zzmcVarZzm4.getClass();
                                            zzC();
                                            zzmd zzmdVar = zzmcVarZzm4.zzg;
                                            zzxk zzxkVar3 = zzmdVar.zza;
                                            long j12 = zzmdVar.zzb;
                                            this.zzH = zzap(zzxkVar3, j12, zzmdVar.zzd, j12, true, 0);
                                        }
                                    }
                                    if (zzjkVar2.zzi || !(this.zzY == null || (i11 = zzjkVar2.zza) == 5004 || i11 == 5003)) {
                                        zzeg.zzf(str2, str, zzjkVar2);
                                        z10 = true;
                                        zzW(true, false);
                                        this.zzH = this.zzH.zzf(zzjkVar2);
                                    } else {
                                        zzeg.zzd(str2, tFQWuE.NaUUp, zzjkVar2);
                                        if (this.zzY == null) {
                                            this.zzY = zzjkVar2;
                                        }
                                        zzdz zzdzVar = this.zzi;
                                        zzdzVar.zzg(zzdzVar.zzd(25, zzjkVar2));
                                        z10 = true;
                                    }
                                } else {
                                    int i35 = zzjkVarZzd.zze;
                                    zzmf zzmfVar7 = this.zzs;
                                    if (zzmfVar7.zzo() != null && zzmfVar7.zzo().zzg.zza.equals(zzxkVar) && this.zzb[i35].zzq(zzmfVar7.zzo())) {
                                        this.zzac = true;
                                        zzab();
                                        zzmc zzmcVarZzo = zzmfVar7.zzo();
                                        zzmc zzmcVarZzm5 = zzmfVar7.zzm();
                                        if (zzmfVar7.zzm() != zzmcVarZzo) {
                                            while (zzmcVarZzm5 != null && zzmcVarZzm5.zzp() != zzmcVarZzo) {
                                                zzmcVarZzm5 = zzmcVarZzm5.zzp();
                                            }
                                        }
                                        zzmfVar7.zzs(zzmcVarZzm5);
                                        if (this.zzH.zze != 4) {
                                            zzan();
                                            this.zzi.zzh(2);
                                        }
                                    } else {
                                        zzjkVar = this.zzY;
                                        if (zzjkVar != null) {
                                            zzjkVar.addSuppressed(zzjkVarZzd);
                                            zzjkVarZzd = this.zzY;
                                        }
                                        zzjkVar2 = zzjkVarZzd;
                                        if (zzjkVar2.zzc == 1) {
                                            zzmfVar = this.zzs;
                                            if (zzmfVar.zzm() != zzmfVar.zzn()) {
                                                while (zzmfVar.zzm() != zzmfVar.zzn()) {
                                                    zzmfVar.zzr();
                                                }
                                                zzmc zzmcVarZzm6 = zzmfVar.zzm();
                                                zzmcVarZzm6.getClass();
                                                zzC();
                                                zzmd zzmdVar2 = zzmcVarZzm6.zzg;
                                                zzxk zzxkVar4 = zzmdVar2.zza;
                                                long j13 = zzmdVar2.zzb;
                                                this.zzH = zzap(zzxkVar4, j13, zzmdVar2.zzd, j13, true, 0);
                                            }
                                        }
                                        if (zzjkVar2.zzi) {
                                        }
                                        zzeg.zzf(str2, str, zzjkVar2);
                                        z10 = true;
                                        zzW(true, false);
                                        this.zzH = this.zzH.zzf(zzjkVar2);
                                    }
                                    z10 = true;
                                }
                            }
                        } catch (RuntimeException e11) {
                            runtimeException = e11;
                            if (runtimeException instanceof IllegalStateException) {
                                i10 = 1004;
                            } else {
                                i10 = 1004;
                            }
                            zzjk zzjkVarZzc2 = zzjk.zzc(runtimeException, i10);
                            zzeg.zzf("ExoPlayerImplInternal", "Playback error", zzjkVarZzc2);
                            zzW(true, false);
                            this.zzH = this.zzH.zzf(zzjkVarZzc2);
                        }
                    } catch (zzjk e12) {
                        zzjkVarZzd = e12;
                        str = str3;
                        str2 = str4;
                        if (zzjkVarZzd.zzc == 1) {
                            zzjkVarZzd = zzjkVarZzd.zzd(zzmcVarZzn.zzg.zza);
                        }
                        if (zzjkVarZzd.zzc == 1) {
                            zzjkVar = this.zzY;
                            if (zzjkVar != null) {
                                zzjkVar.addSuppressed(zzjkVarZzd);
                                zzjkVarZzd = this.zzY;
                            }
                            zzjkVar2 = zzjkVarZzd;
                            if (zzjkVar2.zzc == 1) {
                                zzmfVar = this.zzs;
                                if (zzmfVar.zzm() != zzmfVar.zzn()) {
                                    while (zzmfVar.zzm() != zzmfVar.zzn()) {
                                        zzmfVar.zzr();
                                    }
                                    zzmc zzmcVarZzm7 = zzmfVar.zzm();
                                    zzmcVarZzm7.getClass();
                                    zzC();
                                    zzmd zzmdVar3 = zzmcVarZzm7.zzg;
                                    zzxk zzxkVar5 = zzmdVar3.zza;
                                    long j14 = zzmdVar3.zzb;
                                    this.zzH = zzap(zzxkVar5, j14, zzmdVar3.zzd, j14, true, 0);
                                }
                            }
                            if (zzjkVar2.zzi) {
                            }
                            zzeg.zzf(str2, str, zzjkVar2);
                            z10 = true;
                            zzW(true, false);
                            this.zzH = this.zzH.zzf(zzjkVar2);
                        } else {
                            zzjkVar = this.zzY;
                            if (zzjkVar != null) {
                                zzjkVar.addSuppressed(zzjkVarZzd);
                                zzjkVarZzd = this.zzY;
                            }
                            zzjkVar2 = zzjkVarZzd;
                            if (zzjkVar2.zzc == 1) {
                                zzmfVar = this.zzs;
                                if (zzmfVar.zzm() != zzmfVar.zzn()) {
                                    while (zzmfVar.zzm() != zzmfVar.zzn()) {
                                        zzmfVar.zzr();
                                    }
                                    zzmc zzmcVarZzm8 = zzmfVar.zzm();
                                    zzmcVarZzm8.getClass();
                                    zzC();
                                    zzmd zzmdVar4 = zzmcVarZzm8.zzg;
                                    zzxk zzxkVar6 = zzmdVar4.zza;
                                    long j15 = zzmdVar4.zzb;
                                    this.zzH = zzap(zzxkVar6, j15, zzmdVar4.zzd, j15, true, 0);
                                }
                            }
                            if (zzjkVar2.zzi) {
                            }
                            zzeg.zzf(str2, str, zzjkVar2);
                            z10 = true;
                            zzW(true, false);
                            this.zzH = this.zzH.zzf(zzjkVar2);
                        }
                    } catch (RuntimeException e13) {
                        e = e13;
                        runtimeException = e;
                        if (runtimeException instanceof IllegalStateException) {
                            i10 = 1004;
                        } else {
                            i10 = 1004;
                        }
                        zzjk zzjkVarZzc3 = zzjk.zzc(runtimeException, i10);
                        zzeg.zzf("ExoPlayerImplInternal", "Playback error", zzjkVarZzc3);
                        zzW(true, false);
                        this.zzH = this.zzH.zzf(zzjkVarZzc3);
                    }
                } catch (zzjk e14) {
                    str = "Playback error";
                    str2 = "ExoPlayerImplInternal";
                    zzjkVarZzd = e14;
                }
            } catch (RuntimeException e15) {
                e = e15;
            }
        } catch (zzat e16) {
            zzA(e16, e16.zzb == 1 ? true != e16.zza ? 3003 : 3001 : 1000);
        } catch (zzhq e17) {
            zzA(e17, e17.zza);
        } catch (zzuf e18) {
            zzA(e18, e18.zza);
        } catch (zzwk e19) {
            zzA(e19, 1002);
        } catch (IOException e20) {
            zzA(e20, 2000);
        }
    }
}

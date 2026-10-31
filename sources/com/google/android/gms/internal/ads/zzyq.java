package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.facebook.appevents.AppEventsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyq implements zzxi, zzagb, zzabv, zzaca, zzza {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzyp zzB;
    private zzahb zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhp zze;
    private final zzun zzf;
    private final zzxu zzg;
    private final zzui zzh;
    private final zzyi zzi;
    private final zzabl zzj;
    private final long zzk;
    private final long zzl;
    private final zzyd zzn;
    private zzxh zzs;
    private zzajd zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzacd zzm = new zzacd("ProgressiveMediaPeriod");
    private final zzds zzo = new zzds(zzdo.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzym
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyj
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfl.zzd(null);
    private zzyo[] zzw = new zzyo[0];
    private zzzb[] zzv = new zzzb[0];
    private zzyg[] zzu = new zzyg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzb = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzo("application/x-icy");
        zzc = zztVar.zzO();
    }

    public zzyq(Uri uri, zzhp zzhpVar, zzyd zzydVar, zzun zzunVar, zzui zzuiVar, zzabu zzabuVar, zzxu zzxuVar, zzyi zzyiVar, zzabl zzablVar, String str, int i10, boolean z10, int i11, zzv zzvVar, long j10, zzacj zzacjVar) {
        this.zzd = uri;
        this.zze = zzhpVar;
        this.zzf = zzunVar;
        this.zzh = zzuiVar;
        this.zzg = zzxuVar;
        this.zzi = zzyiVar;
        this.zzj = zzablVar;
        this.zzk = i10;
        this.zzn = zzydVar;
        this.zzl = j10;
    }

    private final void zzR(int i10) {
        zzaa();
        zzyp zzypVar = this.zzB;
        boolean[] zArr = zzypVar.zzd;
        if (zArr[i10]) {
            return;
        }
        zzv zzvVarZza = zzypVar.zza.zza(i10).zza(0);
        this.zzg.zzh(new zzxg(1, zzas.zzf(zzvVarZza.zzp), zzvVarZza, 0, null, zzfl.zzr(this.zzL), -9223372036854775807L));
        zArr[i10] = true;
    }

    private final void zzS(int i10) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i10]) && !this.zzv[i10].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzzb zzzbVar : this.zzv) {
                    zzzbVar.zzg(false);
                }
                zzxh zzxhVar = this.zzs;
                zzxhVar.getClass();
                zzxhVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzahk zzU(zzyo zzyoVar) {
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zzyoVar.equals(this.zzw[i10])) {
                return this.zzv[i10];
            }
        }
        if (this.zzx) {
            int i11 = zzyoVar.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i11);
            sb2.append(") after finishing tracks.");
            zzeg.zzc("ProgressiveMediaPeriod", sb2.toString());
            return new zzafv();
        }
        zzzb zzzbVar = new zzzb(this.zzj, this.zzf, this.zzh);
        zzyg zzygVar = new zzyg(zzzbVar);
        zzzbVar.zzz(this);
        int i12 = length + 1;
        zzyo[] zzyoVarArr = (zzyo[]) Arrays.copyOf(this.zzw, i12);
        zzyoVarArr[length] = zzyoVar;
        String str = zzfl.zza;
        this.zzw = zzyoVarArr;
        zzzb[] zzzbVarArr = (zzzb[]) Arrays.copyOf(this.zzv, i12);
        zzzbVarArr[length] = zzzbVar;
        this.zzv = zzzbVarArr;
        zzyg[] zzygVarArr = (zzyg[]) Arrays.copyOf(this.zzu, i12);
        zzygVarArr[length] = zzygVar;
        this.zzu = zzygVarArr;
        return zzygVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i10;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzzb zzzbVar : this.zzv) {
            if (zzzbVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            zzv zzvVarZzo = this.zzv[i13].zzo();
            zzvVarZzo.getClass();
            int iZzf = zzas.zzf(zzvVarZzo.zzp);
            int iZzab = zzab(iZzf);
            int iZzab2 = zzab(i11);
            if (iZzab > iZzab2) {
                i11 = iZzf;
            }
            if (iZzab > iZzab2) {
                i12 = i13;
            }
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i14 = 0; i14 < length; i14++) {
            zzv zzvVarZzo2 = this.zzv[i14].zzo();
            zzvVarZzo2.getClass();
            String str = zzvVarZzo2.zzp;
            boolean zZza = zzas.zza(str);
            boolean z10 = zZza || zzas.zzb(str);
            zArr[i14] = z10;
            this.zzz = z10 | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzajd zzajdVar = this.zzt;
            if (zzajdVar != null) {
                if (zZza || this.zzw[i14].zzb) {
                    zzap zzapVar = zzvVarZzo2.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzajdVar) : zzapVar.zzg(zzajdVar);
                    zzt zztVarZza = zzvVarZzo2.zza();
                    zztVarZza.zzl(zzapVar2);
                    zzvVarZzo2 = zztVarZza.zzO();
                }
                if (zZza && zzvVarZzo2.zzh == -1 && zzvVarZzo2.zzi == -1 && (i10 = zzajdVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzo2.zza();
                    zztVarZza2.zzi(i10);
                    zzvVarZzo2 = zztVarZza2.zzO();
                }
            }
            zzv zzvVarZzb = zzvVarZzo2.zzb(this.zzf.zzb(zzvVarZzo2));
            if (i14 != i12) {
                zzt zztVarZza3 = zzvVarZzb.zza();
                zztVarZza3.zzm(Integer.toString(i12));
                zzvVarZzb = zztVarZza3.zzO();
            }
            zzbgVarArr[i14] = new zzbg(Integer.toString(i14), zzvVarZzb);
            this.zzI = zzvVarZzb.zzv | this.zzI;
            this.zzv[i14].zzi(Long.MIN_VALUE);
        }
        this.zzB = new zzyp(new zzzn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzye(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzxh zzxhVar = this.zzs;
        zzxhVar.getClass();
        zzxhVar.zzp(this);
    }

    private final void zzW() {
        zzyh zzyhVar = new zzyh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgtj.zzi(zzZ());
            long j10 = this.zzD;
            if (j10 != -9223372036854775807L && this.zzM > j10) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzahb zzahbVar = this.zzC;
            zzahbVar.getClass();
            zzyhVar.zzd(zzahbVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzzb zzzbVar : this.zzv) {
                zzzbVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzyhVar, this, zzabu.zza(this.zzF));
    }

    private final int zzX() {
        int iZzj = 0;
        for (zzzb zzzbVar : this.zzv) {
            iZzj += zzzbVar.zzj();
        }
        return iZzj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzY(boolean z10) {
        int i10 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzzb[] zzzbVarArr = this.zzv;
            if (i10 >= zzzbVarArr.length) {
                return jMax;
            }
            if (z10) {
                jMax = Math.max(jMax, zzzbVarArr[i10].zzp());
            } else {
                zzyp zzypVar = this.zzB;
                zzypVar.getClass();
                if (zzypVar.zzc[i10]) {
                    jMax = Math.max(jMax, zzzbVarArr[i10].zzp());
                }
            }
            i10++;
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    private final void zzaa() {
        zzgtj.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ void zzA(zzabz zzabzVar, long j10, long j11, boolean z10) {
        zzyh zzyhVar = (zzyh) zzabzVar;
        zzim zzimVarZzf = zzyhVar.zzf();
        zzxb zzxbVar = new zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzimVarZzf.zzg(), zzimVarZzf.zzh(), j10, j11, zzimVarZzf.zzf());
        zzyhVar.zze();
        this.zzg.zzf(zzxbVar, new zzxg(1, -1, null, 0, null, zzfl.zzr(zzyhVar.zzg()), zzfl.zzr(this.zzD)));
        if (z10) {
            return;
        }
        for (zzzb zzzbVar : this.zzv) {
            zzzbVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzxh zzxhVar = this.zzs;
            zzxhVar.getClass();
            zzxhVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ void zzB(zzabz zzabzVar, long j10, long j11) {
        zzyh zzyhVar = (zzyh) zzabzVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j12 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzD = j12;
            this.zzi.zzb(j12, this.zzC, this.zzE);
        }
        zzim zzimVarZzf = zzyhVar.zzf();
        zzxb zzxbVar = new zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzimVarZzf.zzg(), zzimVarZzf.zzh(), j10, j11, zzimVarZzf.zzf());
        zzyhVar.zze();
        this.zzg.zze(zzxbVar, new zzxg(1, -1, null, 0, null, zzfl.zzr(zzyhVar.zzg()), zzfl.zzr(this.zzD)));
        this.zzP = true;
        zzxh zzxhVar = this.zzs;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ void zzC(zzabz zzabzVar, long j10, long j11, int i10) {
        zzxb zzxbVar;
        zzyh zzyhVar = (zzyh) zzabzVar;
        zzim zzimVarZzf = zzyhVar.zzf();
        if (i10 == 0) {
            long jZze = zzyhVar.zze();
            zzht zzhtVarZzh = zzyhVar.zzh();
            zzxbVar = new zzxb(jZze, zzhtVarZzh, zzhtVarZzh.zza, Collections.emptyMap(), j10, 0L, 0L);
        } else {
            zzxbVar = new zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzimVarZzf.zzg(), zzimVarZzf.zzh(), j10, j11, zzimVarZzf.zzf());
        }
        this.zzg.zzd(zzxbVar, new zzxg(1, -1, null, 0, null, zzfl.zzr(zzyhVar.zzg()), zzfl.zzr(this.zzD)), i10);
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzxh zzxhVar = this.zzs;
        zzxhVar.getClass();
        zzxhVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzahb zzahbVar) {
        this.zzC = this.zzt == null ? zzahbVar : new zzaha(-9223372036854775807L, 0L);
        this.zzD = zzahbVar.zza();
        boolean z10 = false;
        if (!this.zzK && zzahbVar.zza() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzE = z10;
        this.zzF = true == z10 ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzahbVar, z10);
        } else {
            zzD();
        }
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z10) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzajd zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzajd zzajdVar) {
        this.zzt = zzajdVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzzb zzzbVar : this.zzv) {
                zzzbVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(zzxh zzxhVar, long j10) {
        this.zzs = zzxhVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final zzzn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zze(zzaba[] zzabaVarArr, boolean[] zArr, zzzc[] zzzcVarArr, boolean[] zArr2, long j10) {
        zzaba zzabaVar;
        zzaa();
        zzyp zzypVar = this.zzB;
        zzzn zzznVar = zzypVar.zza;
        boolean[] zArr3 = zzypVar.zzc;
        int i10 = this.zzJ;
        int i11 = 0;
        for (int i12 = 0; i12 < zzabaVarArr.length; i12++) {
            zzzc zzzcVar = zzzcVarArr[i12];
            if (zzzcVar != null && (zzabaVarArr[i12] == null || !zArr[i12])) {
                int iZza = ((zzyn) zzzcVar).zza();
                zzgtj.zzi(zArr3[iZza]);
                this.zzJ--;
                zArr3[iZza] = false;
                zzzcVarArr[i12] = null;
            }
        }
        boolean z10 = !this.zzG ? j10 == 0 || this.zzA : i10 != 0;
        for (int i13 = 0; i13 < zzabaVarArr.length; i13++) {
            if (zzzcVarArr[i13] == null && (zzabaVar = zzabaVarArr[i13]) != null) {
                zzgtj.zzi(zzabaVar.zze() == 1);
                zzgtj.zzi(zzabaVar.zzf(0) == 0);
                int iZzb = zzznVar.zzb(zzabaVar.zza());
                zzgtj.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzabaVar.zzc().zzv | this.zzI;
                zzzcVarArr[i13] = new zzyn(this, iZzb);
                zArr2[i13] = true;
                if (!z10) {
                    zzzb zzzbVar = this.zzv[iZzb];
                    z10 = (zzzbVar.zzn() == 0 || zzzbVar.zzu(j10, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzacd zzacdVar = this.zzm;
            if (zzacdVar.zze()) {
                zzzb[] zzzbVarArr = this.zzv;
                int length = zzzbVarArr.length;
                while (i11 < length) {
                    zzzbVarArr[i11].zzy();
                    i11++;
                }
                zzacdVar.zzf();
            } else {
                this.zzP = false;
                for (zzzb zzzbVar2 : this.zzv) {
                    zzzbVar2.zzg(false);
                }
            }
        } else if (z10) {
            j10 = zzj(j10);
            while (i11 < zzzcVarArr.length) {
                if (zzzcVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.zzG = true;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzf(long j10, boolean z10) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzv[i10].zzx(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                zzyp zzypVar = this.zzB;
                if (zzypVar.zzb[i10] && zzypVar.zzc[i10] && !this.zzv[i10].zzq()) {
                    jZzY = Math.min(jZzY, this.zzv[i10].zzp());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzL : jZzY;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[LOOP:1: B:38:0x0086->B:39:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[LOOP:2: B:42:0x009b->B:43:0x009d, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0083, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0094, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzj(long j10) {
        zzacd zzacdVar;
        int i10;
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j10 = 0;
        }
        this.zzH = false;
        long j11 = this.zzL;
        this.zzL = j10;
        if (zzZ()) {
            this.zzM = j10;
            return j10;
        }
        if (this.zzF == 7 || !(this.zzP || this.zzm.zze())) {
            this.zzN = false;
            this.zzM = j10;
            this.zzP = false;
            this.zzI = false;
            zzacdVar = this.zzm;
            if (zzacdVar.zze()) {
                zzacdVar.zzc();
                for (zzzb zzzbVar : this.zzv) {
                    zzzbVar.zzg(false);
                }
                break;
            }
            for (zzzb zzzbVar2 : this.zzv) {
                zzzbVar2.zzy();
            }
            zzacdVar.zzf();
            break;
        }
        int length = this.zzv.length;
        for (int i11 = 0; i11 < length; i11++) {
            zzzb zzzbVar3 = this.zzv[i11];
            if (this.zzu[i11].zzf() && (zzzbVar3.zzn() != 0 || j11 != j10)) {
                if (!(this.zzA ? zzzbVar3.zzt(zzzbVar3.zzm()) : zzzbVar3.zzu(j10, this.zzP)) && (zArr[i11] || !this.zzz)) {
                    this.zzN = false;
                    this.zzM = j10;
                    this.zzP = false;
                    this.zzI = false;
                    zzacdVar = this.zzm;
                    if (zzacdVar.zze()) {
                        zzacdVar.zzc();
                        while (i10 < r2) {
                            zzzbVar.zzg(false);
                        }
                        break;
                        break;
                    }
                    while (i < r3) {
                        zzzbVar2.zzy();
                    }
                    zzacdVar.zzf();
                    break;
                }
            }
        }
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzxi
    public final long zzk(long j10, zzni zzniVar) {
        long j11;
        boolean z10;
        long j12;
        boolean z11;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzagz zzagzVarZzc = this.zzC.zzc(j10);
        zzahc zzahcVar = zzagzVarZzc.zza;
        zzahc zzahcVar2 = zzagzVarZzc.zzb;
        long j13 = zzniVar.zzd;
        if (j13 == 0) {
            if (zzniVar.zze == 0) {
                return j10;
            }
            j13 = 0;
        }
        String str = zzfl.zza;
        long j14 = j10 - j13;
        long j15 = Long.MAX_VALUE;
        long j16 = (((j13 ^ j10) > 0L ? 1 : ((j13 ^ j10) == 0L ? 0 : -1)) >= 0) | (((j10 ^ j14) > 0L ? 1 : ((j10 ^ j14) == 0L ? 0 : -1)) >= 0) ? j14 : ((j14 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j17 = Long.MIN_VALUE;
        if (j16 != Long.MIN_VALUE) {
            if (j16 == Long.MAX_VALUE) {
                if (j14 != Long.MAX_VALUE) {
                    j16 = Long.MIN_VALUE;
                } else {
                    j16 = Long.MAX_VALUE;
                }
            }
        } else if (j14 == Long.MIN_VALUE) {
            j14 = Long.MIN_VALUE;
            if (j16 == Long.MAX_VALUE) {
                if (j14 != Long.MAX_VALUE) {
                    j16 = Long.MIN_VALUE;
                } else {
                    j16 = Long.MAX_VALUE;
                }
            }
        } else {
            j16 = Long.MIN_VALUE;
        }
        long j18 = zzniVar.zze;
        long j19 = j10 + j18;
        long j20 = (((j10 ^ j19) > 0L ? 1 : ((j10 ^ j19) == 0L ? 0 : -1)) >= 0) | (((j18 ^ j10) > 0L ? 1 : ((j18 ^ j10) == 0L ? 0 : -1)) < 0) ? j19 : ((j19 >>> 63) ^ 1) + Long.MAX_VALUE;
        if (j20 == Long.MIN_VALUE) {
            if (j19 == Long.MIN_VALUE) {
            }
            j11 = zzahcVar.zzb;
            if (j16 <= j11 || j11 > j15) {
                z10 = false;
            } else {
                z10 = true;
            }
            j12 = zzahcVar2.zzb;
            z11 = j16 > j12 && j12 <= j15;
            if (z10 || !z11) {
                if (!z10) {
                    if (z11) {
                        return j12;
                    }
                    return j16;
                }
            } else if (Math.abs(j11 - j10) > Math.abs(j12 - j10)) {
                return j12;
            }
            return j11;
        }
        j17 = j19;
        if (j20 == Long.MAX_VALUE) {
            int i10 = (j17 > Long.MAX_VALUE ? 1 : (j17 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j15 = j20;
        }
        j11 = zzahcVar.zzb;
        if (j16 <= j11) {
            z10 = false;
        } else {
            z10 = false;
        }
        j12 = zzahcVar2.zzb;
        if (j16 > j12) {
        }
        if (z10) {
            if (!z10) {
                if (z11) {
                    return j12;
                }
                return j16;
            }
        } else if (!z10) {
            if (z11) {
                return j12;
            }
            return j16;
        }
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzm(zzma zzmaVar) {
        if (this.zzP) {
            return false;
        }
        zzacd zzacdVar = this.zzm;
        if (zzacdVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzacdVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final void zzo() {
        for (zzzb zzzbVar : this.zzv) {
            zzzbVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzp(int i10) {
        return !zzT() && this.zzv[i10].zzr(this.zzP);
    }

    final void zzq(int i10) throws IOException {
        this.zzv[i10].zzl();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzm.zzh(zzabu.zza(this.zzF));
    }

    final int zzs(int i10, zzlw zzlwVar, zziv zzivVar, int i11) {
        if (zzT()) {
            return -3;
        }
        zzR(i10);
        int iZzs = this.zzv[i10].zzs(zzlwVar, zzivVar, i11, this.zzP);
        if (iZzs == -3) {
            zzS(i10);
        }
        return iZzs;
    }

    final int zzt(int i10, long j10) {
        if (zzT()) {
            return 0;
        }
        zzR(i10);
        zzzb zzzbVar = this.zzv[i10];
        int iZzv = zzzbVar.zzv(j10, this.zzP);
        zzzbVar.zzw(iZzv);
        if (iZzv != 0) {
            return iZzv;
        }
        zzS(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final zzahk zzu(int i10, int i11) {
        return zzU(new zzyo(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzagb
    public final void zzw(final zzahb zzahbVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzahbVar);
            }
        });
    }

    final zzahk zzx() {
        return zzU(new zzyo(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final /* bridge */ /* synthetic */ zzabx zzz(zzabz zzabzVar, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zzabx zzabxVarZza;
        zzahb zzahbVar;
        zzyh zzyhVar = (zzyh) zzabzVar;
        zzim zzimVarZzf = zzyhVar.zzf();
        zzxb zzxbVar = new zzxb(zzyhVar.zze(), zzyhVar.zzh(), zzimVarZzf.zzg(), zzimVarZzf.zzh(), j10, j11, zzimVarZzf.zzf());
        zzyhVar.zzg();
        String str = zzfl.zza;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
                break;
            }
            if ((cause instanceof zzat) || (cause instanceof FileNotFoundException) || (cause instanceof zzid) || (cause instanceof zzacc) || ((cause instanceof zzhq) && ((zzhq) cause).zza == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzabxVarZza = zzacd.zzb;
        } else {
            int iZzX = zzX();
            boolean z10 = iZzX > this.zzO;
            if (this.zzK || !((zzahbVar = this.zzC) == null || zzahbVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z11 = this.zzy;
                if (!z11 || zzT()) {
                    this.zzH = z11;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzzb zzzbVar : this.zzv) {
                        zzzbVar.zzg(false);
                    }
                    zzyhVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzabxVarZza = zzacd.zza;
                }
            }
            zzabxVarZza = zzacd.zza(z10, jMin);
        }
        boolean z12 = !zzabxVarZza.zza();
        this.zzg.zzg(zzxbVar, new zzxg(1, -1, null, 0, null, zzfl.zzr(zzyhVar.zzg()), zzfl.zzr(this.zzD)), iOException, z12);
        if (z12) {
            zzyhVar.zze();
        }
        return zzabxVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzxi, com.google.android.gms.internal.ads.zzze
    public final void zzg(long j10) {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzadq implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzaeu zze;
    private final zzdo zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzadv zzi;
    private zzfh zzj = new zzfh(10);
    private zzv zzk;
    private zzdz zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* synthetic */ zzadq(zzadi zzadiVar, byte[] bArr) {
        this.zza = zzadiVar.zze();
        zzbs zzbsVarZzg = zzadiVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzgwm.zzi();
        this.zzd = zzadiVar.zzh();
        zzdo zzdoVarZzi = zzadiVar.zzi();
        this.zzf = zzdoVarZzi;
        this.zzh = -zzadiVar.zzj();
        zzadv zzadvVarZzk = zzadiVar.zzk();
        this.zzi = zzadvVarZzk;
        this.zze = new zzacv(zzadiVar.zzf(), zzadvVarZzk, zzdoVarZzi);
        new zzadh(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzO();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j10) {
        this.zzq = j10;
    }

    public final void zza(int i10) {
        this.zzr = 1;
    }

    public final zzaeu zzb(int i10) {
        SparseArray sparseArray = this.zzc;
        if (zzfl.zza(sparseArray, 0)) {
            return (zzaeu) sparseArray.get(0);
        }
        zzadk zzadkVar = new zzadk(this, this.zza, 0);
        this.zzg.add(zzadkVar);
        sparseArray.put(0, zzadkVar);
        return zzadkVar;
    }

    public final void zzc(Surface surface, zzeu zzeuVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzeu) this.zzm.second).equals(zzeuVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzeuVar);
        zzeuVar.zza();
        zzeuVar.zzb();
    }

    public final void zzd() {
        zzeu zzeuVar = zzeu.zza;
        zzeuVar.zza();
        zzeuVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdz zzdzVar = this.zzl;
        if (zzdzVar != null) {
            zzdzVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: zzdw -> 0x0090, TRY_LEAVE, TryCatch #0 {zzdw -> 0x0090, blocks: (B:7:0x0012, B:9:0x0017, B:11:0x001d, B:14:0x0024, B:16:0x0032, B:18:0x0038, B:21:0x003f, B:26:0x0060), top: B:36:0x0012 }] */
    final /* synthetic */ boolean zzi(zzv zzvVar, int i10) throws zzaet {
        zzgtj.zzi(this.zzo == 0);
        zzi zziVarZzC = zzC(zzvVar.zzF);
        try {
            int i11 = zziVarZzC.zzd;
            if (i11 != 7) {
                if (zzdx.zzc(i11) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i11)};
                    String str = zzfl.zza;
                    zzeg.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zziVarZzC = zzi.zza;
                } else if (i11 != 2 || i11 == 10) {
                    zziVarZzC = zzi.zza;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !zzdx.zzd()) {
                i11 = 7;
                if (zzdx.zzc(i11)) {
                    if (i11 != 2) {
                        zziVarZzC = zzi.zza;
                    } else {
                        zziVarZzC = zzi.zza;
                    }
                } else if (i11 != 2) {
                    zziVarZzC = zzi.zza;
                } else {
                    zziVarZzC = zzi.zza;
                }
            } else {
                zzh zzhVarZzd = zziVarZzC.zzd();
                zzhVarZzd.zzc(6);
                zziVarZzC = zzhVarZzd.zzg();
            }
            zzi zziVar = zziVarZzC;
            zzdo zzdoVar = this.zzf;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final zzdz zzdzVarZzd = zzdoVar.zzd(looperMyLooper, null);
            this.zzl = zzdzVarZzd;
            try {
                zzbs zzbsVar = this.zzb;
                Context context = this.zza;
                zzl zzlVar = zzl.zzb;
                Objects.requireNonNull(zzdzVarZzd);
                zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzadj
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdzVarZzd.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e10) {
                throw new zzaet(e10, zzvVar);
            }
        } catch (zzdw e11) {
            throw new zzaet(e11, zzvVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z10) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j10, long j11) throws zzaet {
        this.zze.zzv(j10, j11);
    }

    final /* synthetic */ void zzm(boolean z10) {
        if (this.zzo == 1) {
            this.zzn++;
            zzaeu zzaeuVar = this.zze;
            zzaeuVar.zzg(z10);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzadp zzadpVar = (zzadp) this.zzj.zzd();
                zzadpVar.getClass();
                zzaeuVar.zzs(1, this.zzk, zzadpVar.zza, zzadpVar.zzb, zzgwm.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z10) {
                this.zzq = -9223372036854775807L;
            }
            zzdz zzdzVar = this.zzl;
            zzdzVar.getClass();
            zzdzVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z10) {
        this.zze.zzw(z10);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzadr zzadrVar) {
        this.zze.zzl(zzadrVar);
    }

    final /* synthetic */ void zzq(float f10) {
        this.zzi.zzc(f10);
        this.zze.zzm(f10);
    }

    final /* synthetic */ void zzr(int i10) {
        this.zze.zzr(i10);
    }

    final /* synthetic */ boolean zzs() {
        int i10 = this.zzr;
        return i10 != -1 && i10 == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzadv zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzfh zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzfh zzfhVar) {
        this.zzj = zzfhVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }
}

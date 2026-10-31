package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzne {
    private final zzna zza;
    private final int zzb;
    private final zzna zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzne(zzna zznaVar, zzna zznaVar2, int i10) {
        this.zza = zznaVar;
        this.zzb = i10;
        this.zzc = zznaVar2;
    }

    private final boolean zzN() {
        int i10 = this.zzd;
        return i10 == 2 || i10 == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzmc zzmcVar, zzna zznaVar) {
        if (zznaVar == null) {
            return true;
        }
        zzzc[] zzzcVarArr = zzmcVar.zzc;
        int i10 = this.zzb;
        zzzc zzzcVar = zzzcVarArr[i10];
        if (zznaVar.zzcV() != null) {
            if (zznaVar.zzcV() == zzzcVar) {
                if (zzzcVar != null && !zznaVar.zzcW()) {
                    zzmcVar.zzp();
                    boolean z10 = zzmcVar.zzg.zzh;
                }
            }
            zzmc zzmcVarZzp = zzmcVar.zzp();
            return zzmcVarZzp != null && zzmcVarZzp.zzc[i10] == zznaVar.zzcV();
        }
        return true;
    }

    private final void zzQ(boolean z10) throws zzjk {
        if (z10) {
            zzna zznaVar = this.zzc;
            zznaVar.getClass();
            zznaVar.zzx(17, this.zza);
        } else {
            zzna zznaVar2 = this.zza;
            zzna zznaVar3 = this.zzc;
            zznaVar3.getClass();
            zznaVar2.zzx(17, zznaVar3);
        }
    }

    private final void zzR(zzna zznaVar, zzzc zzzcVar, zzji zzjiVar, long j10, boolean z10) throws zzjk {
        if (zzW(zznaVar)) {
            if (zzzcVar != zznaVar.zzcV()) {
                zzS(zznaVar, zzjiVar);
            } else if (z10) {
                zznaVar.zzp(j10, true);
            }
        }
    }

    private final void zzS(zzna zznaVar, zzji zzjiVar) {
        boolean z10 = true;
        if (this.zza != zznaVar && this.zzc != zznaVar) {
            z10 = false;
        }
        zzgtj.zzi(z10);
        if (zzW(zznaVar)) {
            zzjiVar.zze(zznaVar);
            zzY(zznaVar);
            zznaVar.zzr();
        }
    }

    private final void zzT(boolean z10) {
        if (z10) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzna zznaVar = this.zzc;
            zznaVar.getClass();
            zznaVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(zzna zznaVar, zzmc zzmcVar, zzabi zzabiVar, zzji zzjiVar) throws zzjk {
        if (zznaVar != null && zzW(zznaVar)) {
            zzna zznaVar2 = this.zza;
            boolean z10 = zznaVar != zznaVar2;
            if ((zznaVar != zznaVar2 || !zzN()) && (zznaVar != this.zzc || !zzO())) {
                zzzc zzzcVarZzcV = zznaVar.zzcV();
                zzzc[] zzzcVarArr = zzmcVar.zzc;
                int i10 = this.zzb;
                zzzc zzzcVar = zzzcVarArr[i10];
                boolean zZza = zzabiVar.zza(i10);
                if (zZza && zzzcVarZzcV == zzzcVar) {
                    return 1;
                }
                if (!zznaVar.zzm()) {
                    zzv[] zzvVarArrZzV = zzV(zzabiVar.zzc[i10]);
                    zzzc zzzcVar2 = zzzcVarArr[i10];
                    zzzcVar2.getClass();
                    zznaVar.zzcU(zzvVarArrZzV, zzzcVar2, zzmcVar.zzc(), zzmcVar.zza(), zzmcVar.zzg.zza);
                    return 3;
                }
                if (!zznaVar.zzab()) {
                    return 0;
                }
                zzS(zznaVar, zzjiVar);
                if (!zZza || zzc()) {
                    zzT(!z10);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(zzaba zzabaVar) {
        int iZze = zzabaVar != null ? zzabaVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[iZze];
        for (int i10 = 0; i10 < iZze; i10++) {
            zzabaVar.getClass();
            zzvVarArr[i10] = zzabaVar.zzb(i10);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzna zznaVar) {
        return zznaVar.zze() != 0;
    }

    private final zzna zzX(zzmc zzmcVar) {
        if (zzmcVar != null) {
            int i10 = this.zzb;
            zzzc[] zzzcVarArr = zzmcVar.zzc;
            if (zzzcVarArr[i10] != null) {
                zzna zznaVar = this.zza;
                zzzc zzzcVarZzcV = zznaVar.zzcV();
                zzzc zzzcVar = zzzcVarArr[i10];
                if (zzzcVarZzcV == zzzcVar) {
                    return zznaVar;
                }
                zzna zznaVar2 = this.zzc;
                if (zznaVar2 != null && zznaVar2.zzcV() == zzzcVar) {
                    return zznaVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzna zznaVar) {
        if (zznaVar.zze() == 2) {
            zznaVar.zzq();
        }
    }

    private static final void zzZ(zzna zznaVar, long j10) {
        zznaVar.zzl();
        if (zznaVar instanceof zzzr) {
            throw null;
        }
    }

    public final void zzA(zzji zzjiVar) throws zzjk {
        zzS(this.zza, zzjiVar);
        zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            boolean z10 = zzW(zznaVar) && this.zzd != 3;
            zzS(zznaVar, zzjiVar);
            zzT(false);
            if (z10) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zzjk {
        int i10 = this.zzd;
        if (i10 == 3 || i10 == 4) {
            zzQ(i10 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzC(zzji zzjiVar) {
        boolean z10;
        zzna zznaVar;
        if (zzc()) {
            int i10 = this.zzd;
            if (i10 == 4) {
                z10 = true;
            } else if (i10 == 2) {
                i10 = 2;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zznaVar = this.zza;
            } else {
                zznaVar = this.zzc;
                zznaVar.getClass();
            }
            zzS(zznaVar, zzjiVar);
            zzT(z10);
            this.zzd = i10 == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzzc zzzcVar, zzji zzjiVar, long j10, boolean z10) throws zzjk {
        zzR(this.zza, zzzcVar, zzjiVar, j10, z10);
        zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zzR(zznaVar, zzzcVar, zzjiVar, j10, z10);
        }
    }

    public final void zzE(zzmc zzmcVar, long j10, boolean z10) throws zzjk {
        zzna zznaVarZzX = zzX(zzmcVar);
        if (zznaVarZzX != null) {
            zznaVarZzX.zzp(j10, z10);
        }
    }

    public final boolean zzF(zzmc zzmcVar, long j10) {
        zzna zznaVarZzX = zzX(zzmcVar);
        return zznaVarZzX != null && zznaVarZzX.zzW(j10);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzna zznaVar = this.zzc;
        if (zznaVar == null || zzW(zznaVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzmc zzmcVar, zzabi zzabiVar, zzji zzjiVar) throws zzjk {
        int iZzU = zzU(this.zza, zzmcVar, zzabiVar, zzjiVar);
        return iZzU == 1 ? zzU(this.zzc, zzmcVar, zzabiVar, zzjiVar) : iZzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(Object obj) throws zzjk {
        if (zze() != 2) {
            return;
        }
        int i10 = this.zzd;
        if (i10 != 4 && i10 != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzna zznaVar = this.zzc;
        zznaVar.getClass();
        zznaVar.zzx(1, obj);
    }

    public final void zzK(zzadr zzadrVar) throws zzjk {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzadrVar);
        zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzx(7, zzadrVar);
        }
    }

    public final void zzL(float f10) throws zzjk {
        if (zze() != 1) {
            return;
        }
        zzna zznaVar = this.zza;
        Float fValueOf = Float.valueOf(f10);
        zznaVar.zzx(2, fValueOf);
        zzna zznaVar2 = this.zzc;
        if (zznaVar2 != null) {
            zznaVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzM() {
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return zzW(this.zza);
        }
        zzna zznaVar = this.zzc;
        zznaVar.getClass();
        return zzW(zznaVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i10;
        zzgtj.zzi(!zzc());
        if (zzW(this.zza)) {
            i10 = 3;
        } else {
            zzna zznaVar = this.zzc;
            i10 = (zznaVar == null || !zzW(zznaVar)) ? 2 : 4;
        }
        this.zzd = i10;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzna zznaVar = this.zzc;
        boolean zZzW = zzW(this.zza);
        int i10 = 0;
        if (zznaVar != null && zzW(zznaVar)) {
            i10 = 1;
        }
        return (zZzW ? 1 : 0) + i10;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(zzmc zzmcVar) {
        zzna zznaVarZzX = zzX(zzmcVar);
        Objects.requireNonNull(zznaVarZzX);
        return zznaVarZzX.zzk();
    }

    public final boolean zzg(zzmc zzmcVar) {
        zzna zznaVarZzX = zzX(zzmcVar);
        zznaVarZzX.getClass();
        return zznaVarZzX.zzcW();
    }

    public final void zzh(zzmc zzmcVar, long j10) {
        zzna zznaVarZzX = zzX(zzmcVar);
        zznaVarZzX.getClass();
        zzZ(zznaVarZzX, j10);
    }

    public final void zzi(zzabi zzabiVar, zzabi zzabiVar2, long j10) {
        int i10;
        int i11 = this.zzb;
        boolean zZza = zzabiVar.zza(i11);
        boolean zZza2 = zzabiVar2.zza(i11);
        zzna zznaVar = this.zzc;
        if (zznaVar == null || (i10 = this.zzd) == 3 || (i10 == 0 && zzW(this.zza))) {
            zznaVar = this.zza;
        }
        if (!zZza || zznaVar.zzm()) {
            return;
        }
        zze();
        zznd zzndVar = zzabiVar.zzb[i11];
        zznd zzndVar2 = zzabiVar2.zzb[i11];
        if (zZza2 && Objects.equals(zzndVar2, zzndVar) && !zzc()) {
            return;
        }
        zzZ(zznaVar, j10);
    }

    public final void zzj(long j10) {
        int i10;
        zzna zznaVar = this.zza;
        if (zzW(zznaVar) && (i10 = this.zzd) != 4 && i10 != 2) {
            zzZ(zznaVar, j10);
        }
        zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zznaVar2, j10);
    }

    public final long zzk(long j10, long j11) {
        zzna zznaVar = this.zza;
        long jZzV = zzW(zznaVar) ? zznaVar.zzV(j10, j11) : Long.MAX_VALUE;
        zzna zznaVar2 = this.zzc;
        return (zznaVar2 == null || !zzW(zznaVar2)) ? jZzV : Math.min(jZzV, zznaVar2.zzV(j10, j11));
    }

    public final void zzl() {
        zzna zznaVar = this.zza;
        if (zzW(zznaVar)) {
            zznaVar.zzY();
            return;
        }
        zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2)) {
            return;
        }
        zznaVar2.zzY();
    }

    public final void zzm(float f10, float f11) throws zzjk {
        this.zza.zzX(f10, f11);
        zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzX(f10, f11);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzna zznaVar = this.zza;
        boolean zZzab = zzW(zznaVar) ? zznaVar.zzab() : true;
        zzna zznaVar2 = this.zzc;
        return (zznaVar2 == null || !zzW(zznaVar2)) ? zZzab : zZzab & zznaVar2.zzab();
    }

    public final boolean zzp(zzmc zzmcVar) {
        return zzX(zzmcVar) != null;
    }

    public final boolean zzq(zzmc zzmcVar) {
        return (zzN() && zzX(zzmcVar) == this.zza) || (zzO() && zzX(zzmcVar) == this.zzc);
    }

    public final boolean zzr(zzmc zzmcVar) {
        return zzP(zzmcVar, this.zza) && zzP(zzmcVar, this.zzc);
    }

    public final void zzs(long j10, long j11) throws zzjk {
        zzna zznaVar = this.zza;
        if (zzW(zznaVar)) {
            zznaVar.zzZ(j10, j11);
        }
        zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2)) {
            return;
        }
        zznaVar2.zzZ(j10, j11);
    }

    public final boolean zzt(zzmc zzmcVar) {
        zzna zznaVarZzX = zzX(zzmcVar);
        return zznaVarZzX == null || zznaVarZzX.zzcW() || zznaVarZzX.zzaa() || zznaVarZzX.zzab();
    }

    public final void zzu(zzmc zzmcVar) throws IOException {
        zzna zznaVarZzX = zzX(zzmcVar);
        zznaVarZzX.getClass();
        zznaVarZzX.zzn();
    }

    public final void zzv() throws zzjk {
        zzna zznaVar = this.zza;
        if (zznaVar.zze() == 1 && this.zzd != 4) {
            zznaVar.zzcT();
            return;
        }
        zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || zznaVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zznaVar2.zzcT();
    }

    public final void zzw() {
        zzna zznaVar = this.zza;
        if (zzW(zznaVar)) {
            zzY(zznaVar);
        }
        zzna zznaVar2 = this.zzc;
        if (zznaVar2 == null || !zzW(zznaVar2)) {
            return;
        }
        zzY(zznaVar2);
    }

    public final void zzx(zznd zzndVar, zzaba zzabaVar, zzzc zzzcVar, long j10, boolean z10, boolean z11, long j11, long j12, zzxk zzxkVar, zzji zzjiVar) throws zzjk {
        zzv[] zzvVarArrZzV = zzV(zzabaVar);
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.zze = true;
            zzna zznaVar = this.zza;
            zznaVar.zzf(zzndVar, zzvVarArrZzV, zzzcVar, j10, z10, z11, j11, j12, zzxkVar);
            zzjiVar.zzd(zznaVar);
            return;
        }
        this.zzf = true;
        zzna zznaVar2 = this.zzc;
        zznaVar2.getClass();
        zznaVar2.zzf(zzndVar, zzvVarArrZzV, zzzcVar, j10, z10, z11, j11, j12, zzxkVar);
        zzjiVar.zzd(zznaVar2);
    }

    public final void zzy(int i10, Object obj, zzmc zzmcVar) throws zzjk {
        zzna zznaVarZzX = zzX(zzmcVar);
        zznaVarZzX.getClass();
        zznaVarZzX.zzx(11, obj);
    }

    public final void zzz(zznh zznhVar) throws zzjk {
        this.zza.zzx(18, zznhVar);
        zzna zznaVar = this.zzc;
        if (zznaVar != null) {
            zznaVar.zzx(18, zznhVar);
        }
    }
}

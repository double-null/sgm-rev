package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzard implements zzafy {
    private final int zza;
    private final List zzb;
    private final zzet zzc;
    private final SparseIntArray zzd;
    private final zzarg zze;
    private final zzanj zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaqz zzj;
    private zzaqy zzk;
    private zzagb zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i10 = zzarc.zza;
    }

    @Deprecated
    public zzard() {
        this(1, 1, zzanj.zza, new zzfi(0L), new zzapq(0), 112800);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzafp zzafpVar = (zzafp) zzafzVar;
        zzafpVar.zzh(bArrZzi, 0, 940, false);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    zzafpVar.zze(i10, false);
                    return true;
                }
                if (bArrZzi[(i11 * 188) + i10] != 71) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        if (this.zza == 0) {
            zzagbVar = new zzanm(zzagbVar, this.zzf);
        }
        this.zzl = zzagbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.zzaqm] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.gms.internal.ads.zzari] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        ?? r10;
        ?? r11;
        zzari zzariVar;
        long j10;
        boolean z10;
        long jZzo = zzafzVar.zzo();
        if (this.zzn) {
            if (jZzo != -1) {
                zzaqz zzaqzVar = this.zzj;
                if (!zzaqzVar.zza()) {
                    return zzaqzVar.zzb(zzafzVar, zzagyVar, this.zzr);
                }
            }
            if (this.zzo) {
                j10 = 0;
            } else {
                this.zzo = true;
                zzaqz zzaqzVar2 = this.zzj;
                if (zzaqzVar2.zzc() != -9223372036854775807L) {
                    j10 = 0;
                    zzaqy zzaqyVar = new zzaqy(zzaqzVar2.zzd(), zzaqzVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzaqyVar;
                    this.zzl.zzw(zzaqyVar.zza());
                } else {
                    j10 = 0;
                    this.zzl.zzw(new zzaha(zzaqzVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                z10 = false;
                this.zzp = false;
                zze(j10, j10);
                if (zzafzVar.zzn() != j10) {
                    zzagyVar.zza = j10;
                    return 1;
                }
            } else {
                z10 = false;
            }
            zzaqy zzaqyVar2 = this.zzk;
            r10 = z10;
            if (zzaqyVar2 != null && zzaqyVar2.zzc()) {
                r10 = z10;
                return zzaqyVar2.zzd(zzafzVar, zzagyVar);
            }
        } else {
            r10 = 0;
        }
        r10 = z10;
        zzet zzetVar = this.zzc;
        byte[] bArrZzi = zzetVar.zzi();
        if (9400 - zzetVar.zzg() < 188) {
            int iZzd = zzetVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzetVar.zzg(), bArrZzi, r10, iZzd);
            }
            zzetVar.zzb(bArrZzi, iZzd);
        }
        while (zzetVar.zzd() < 188) {
            int iZze = zzetVar.zze();
            int iZza = zzafzVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                ?? r12 = r10;
                while (true) {
                    ?? r13 = this.zzg;
                    if (r12 >= r13.size()) {
                        return -1;
                    }
                    zzari zzariVar2 = (zzari) r13.valueAt(r12);
                    if (zzariVar2 instanceof zzaqm) {
                        ?? r14 = (zzaqm) zzariVar2;
                        if (r14.zzd(r10)) {
                            r14.zzc(new zzet(), 1);
                        }
                    }
                    r12++;
                }
            } else {
                zzetVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzetVar.zzg();
        int iZze2 = zzetVar.zze();
        int iZza2 = zzarj.zza(zzetVar.zzi(), iZzg, iZze2);
        zzetVar.zzh(iZza2);
        int i10 = iZza2 + 188;
        if (i10 > iZze2) {
            this.zzq += iZza2 - iZzg;
        } else {
            this.zzq = r10;
        }
        int iZze3 = zzetVar.zze();
        if (i10 > iZze3) {
            return r10;
        }
        int iZzB = zzetVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzetVar.zzh(i10);
            return r10;
        }
        ?? r15 = (4194304 & iZzB) != 0 ? 1 : r10;
        int i11 = iZzB & 32;
        int i12 = (iZzB >> 8) & 8191;
        if ((iZzB & 16) != 0) {
            zzariVar = (zzari) this.zzg.get(i12);
        } else {
            r11 = 0;
        }
        if (r11 == 0) {
            r11 = zzariVar;
            zzetVar.zzh(i10);
            return r10;
        }
        int i13 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i14 = sparseIntArray.get(i12, i13 - 1);
        sparseIntArray.put(i12, i13);
        if (i14 == i13) {
            r11 = zzariVar;
            zzetVar.zzh(i10);
            return r10;
        }
        if (i13 != ((i14 + 1) & 15)) {
            r11 = zzariVar;
            r11.zzb();
        }
        if (i11 != 0) {
            int iZzs = zzetVar.zzs();
            r15 = (r15 == true ? 1 : 0) | ((zzetVar.zzs() & 64) != 0 ? 2 : r10);
            zzetVar.zzk(iZzs - 1);
        }
        boolean z11 = this.zzn;
        if (z11 || !this.zzi.get(i12, r10)) {
            zzetVar.zzf(i10);
            r11.zzc(zzetVar, r15);
            zzetVar.zzf(iZze3);
        }
        if (!z11 && this.zzn && jZzo != -1) {
            this.zzp = true;
        }
        zzetVar.zzh(i10);
        return r10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        zzaqy zzaqyVar;
        List list = this.zzb;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfi zzfiVar = (zzfi) list.get(i10);
            if (zzfiVar.zzc() != -9223372036854775807L) {
                long jZza = zzfiVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j11) {
                    zzfiVar.zzd(j11);
                }
            } else {
                zzfiVar.zzd(j11);
            }
        }
        if (j11 != 0 && (zzaqyVar = this.zzk) != null) {
            zzaqyVar.zzb(j11);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i11 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzari) sparseArray.valueAt(i11)).zzb();
                i11++;
            }
        }
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzarg zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzagb zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i10) {
        this.zzm = i10;
    }

    final /* synthetic */ void zzp(boolean z10) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i10) {
        this.zzr = i10;
    }

    public zzard(int i10, int i11, zzanj zzanjVar, zzfi zzfiVar, zzarg zzargVar, int i12) {
        this.zze = zzargVar;
        this.zza = i11;
        this.zzf = zzanjVar;
        this.zzb = Collections.singletonList(zzfiVar);
        this.zzc = new zzet(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaqz(112800);
        this.zzl = zzagb.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzargVar.zza();
        int size = sparseArrayZza.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(sparseArrayZza.keyAt(i13), (zzari) sparseArrayZza.valueAt(i13));
        }
        this.zzg.put(0, new zzaqu(new zzara(this)));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}

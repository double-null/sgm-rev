package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaht implements zzafy {
    private final zzet zza;
    private final zzahs zzb;
    private final boolean zzc;
    private final zzanj zzd;
    private int zze;
    private zzagb zzf;
    private zzahu zzg;
    private long zzh;
    private zzahw[] zzi;
    private long zzj;
    private zzahw zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaht() {
        this(1, zzanj.zza);
    }

    private final zzahw zzi(int i10) {
        for (zzahw zzahwVar : this.zzi) {
            if (zzahwVar.zzc(i10)) {
                return zzahwVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        zzet zzetVar = this.zza;
        zzafzVar.zzi(zzetVar.zzi(), 0, 12);
        zzetVar.zzh(0);
        if (zzetVar.zzC() != 1179011410) {
            return false;
        }
        zzetVar.zzk(4);
        return zzetVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zze = 0;
        if (this.zzc) {
            zzagbVar = new zzanm(zzagbVar, this.zzd);
        }
        this.zzf = zzagbVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        boolean z10;
        long j10;
        long j11 = this.zzj;
        if (j11 != -1) {
            long jZzn = zzafzVar.zzn();
            if (j11 < jZzn || j11 > 262144 + jZzn) {
                zzagyVar.zza = j11;
                z10 = true;
            } else {
                zzafzVar.zzf((int) (j11 - jZzn));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzj = -1L;
        if (z10) {
            return 1;
        }
        int i10 = this.zze;
        zzahw zzahwVar = null;
        if (i10 == 0) {
            if (!zza(zzafzVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzafzVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i10 == 1) {
            zzet zzetVar = this.zza;
            zzafzVar.zzc(zzetVar.zzi(), 0, 12);
            zzetVar.zzh(0);
            zzahs zzahsVar = this.zzb;
            zzahsVar.zza(zzetVar);
            int i11 = zzahsVar.zza;
            if (i11 != 1414744396) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 22);
                sb2.append("LIST expected, found: ");
                sb2.append(i11);
                throw zzat.zzb(sb2.toString(), null);
            }
            int iZzC = zzetVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzahsVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzC).length() + 22);
            sb3.append("hdrl expected, found: ");
            sb3.append(iZzC);
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i10 == 2) {
            int i12 = this.zzl - 4;
            zzet zzetVar2 = new zzet(i12);
            zzafzVar.zzc(zzetVar2.zzi(), 0, i12);
            zzahx zzahxVarZzb = zzahx.zzb(1819436136, zzetVar2);
            if (zzahxVarZzb.zza() != 1819436136) {
                int iZza = zzahxVarZzb.zza();
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb4.append("Unexpected header list type ");
                sb4.append(iZza);
                throw zzat.zzb(sb4.toString(), null);
            }
            zzahu zzahuVar = (zzahu) zzahxVarZzb.zzc(zzahu.class);
            if (zzahuVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzahuVar;
            this.zzh = ((long) zzahuVar.zzc) * ((long) zzahuVar.zza);
            ArrayList arrayList = new ArrayList();
            zzgwm zzgwmVar = zzahxVarZzb.zza;
            int size = zzgwmVar.size();
            int i13 = 0;
            int i14 = 0;
            while (i13 < size) {
                zzahq zzahqVar = (zzahq) zzgwmVar.get(i13);
                if (zzahqVar.zza() == 1819440243) {
                    zzahx zzahxVar = (zzahx) zzahqVar;
                    int i15 = i14 + 1;
                    zzahv zzahvVar = (zzahv) zzahxVar.zzc(zzahv.class);
                    zzahy zzahyVar = (zzahy) zzahxVar.zzc(zzahy.class);
                    if (zzahvVar == null) {
                        zzeg.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzahyVar == null) {
                        zzeg.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzahvVar.zzd();
                        zzv zzvVar = zzahyVar.zza;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzb(i14);
                        int i16 = zzahvVar.zze;
                        if (i16 != 0) {
                            zztVarZza.zzp(i16);
                        }
                        zzahz zzahzVar = (zzahz) zzahxVar.zzc(zzahz.class);
                        if (zzahzVar != null) {
                            zztVarZza.zzc(zzahzVar.zza);
                        }
                        int iZzf = zzas.zzf(zzvVar.zzp);
                        if (iZzf == 1) {
                            zzahk zzahkVarZzu = this.zzf.zzu(i14, iZzf);
                            zzahkVarZzu.zzA(zztVarZza.zzO());
                            zzahkVarZzu.zzO(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzahwVar = new zzahw(i14, zzahvVar, zzahkVarZzu);
                        } else if (iZzf == 2) {
                            iZzf = 2;
                            zzahk zzahkVarZzu2 = this.zzf.zzu(i14, iZzf);
                            zzahkVarZzu2.zzA(zztVarZza.zzO());
                            zzahkVarZzu2.zzO(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzahwVar = new zzahw(i14, zzahvVar, zzahkVarZzu2);
                        } else {
                            zzahwVar = null;
                        }
                    }
                    if (zzahwVar != null) {
                        arrayList.add(zzahwVar);
                    }
                    i14 = i15;
                }
                i13++;
                zzahwVar = null;
            }
            this.zzi = (zzahw[]) arrayList.toArray(new zzahw[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i10 == 3) {
            long j12 = this.zzm;
            if (j12 != -1 && zzafzVar.zzn() != j12) {
                this.zzj = j12;
                return 0;
            }
            zzet zzetVar3 = this.zza;
            zzafzVar.zzi(zzetVar3.zzi(), 0, 12);
            zzafzVar.zzl();
            zzetVar3.zzh(0);
            zzahs zzahsVar2 = this.zzb;
            zzahsVar2.zza(zzetVar3);
            int iZzC2 = zzetVar3.zzC();
            int i17 = zzahsVar2.zza;
            if (i17 == 1179011410) {
                zzafzVar.zzf(12);
                return 0;
            }
            if (i17 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzafzVar.zzn() + ((long) zzahsVar2.zzb) + 8;
                return 0;
            }
            long jZzn2 = zzafzVar.zzn();
            this.zzm = jZzn2;
            long j13 = jZzn2 + ((long) zzahsVar2.zzb) + 8;
            this.zzn = j13;
            if (!this.zzp) {
                zzahu zzahuVar2 = this.zzg;
                zzahuVar2.getClass();
                if ((zzahuVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j13;
                    return 0;
                }
                this.zzf.zzw(new zzaha(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzafzVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i10 == 4) {
            zzet zzetVar4 = this.zza;
            zzafzVar.zzc(zzetVar4.zzi(), 0, 8);
            zzetVar4.zzh(0);
            int iZzC3 = zzetVar4.zzC();
            int iZzC4 = zzetVar4.zzC();
            if (iZzC3 == 829973609) {
                this.zze = 5;
                this.zzo = iZzC4;
            } else {
                this.zzj = zzafzVar.zzn() + ((long) iZzC4);
            }
            return 0;
        }
        if (i10 == 5) {
            zzet zzetVar5 = new zzet(this.zzo);
            zzafzVar.zzc(zzetVar5.zzi(), 0, this.zzo);
            if (zzetVar5.zzd() < 16) {
                j10 = 0;
            } else {
                int iZzg = zzetVar5.zzg();
                zzetVar5.zzk(8);
                long jZzC = zzetVar5.zzC();
                long j14 = this.zzm;
                j10 = jZzC > j14 ? 0L : j14 + 8;
                zzetVar5.zzh(iZzg);
            }
            while (zzetVar5.zzd() >= 16) {
                int iZzC5 = zzetVar5.zzC();
                int iZzC6 = zzetVar5.zzC();
                long jZzC2 = ((long) zzetVar5.zzC()) + j10;
                zzetVar5.zzk(4);
                zzahw zzahwVarZzi = zzi(iZzC5);
                if (zzahwVarZzi != null) {
                    zzahwVarZzi.zza(jZzC2, (iZzC6 & 16) == 16);
                }
            }
            for (zzahw zzahwVar2 : this.zzi) {
                zzahwVar2.zzb();
            }
            this.zzp = true;
            if (this.zzi.length == 0) {
                this.zzf.zzw(new zzaha(this.zzh, 0L));
            } else {
                this.zzf.zzw(new zzahr(this, this.zzh));
            }
            this.zze = 6;
            this.zzj = this.zzm;
            return 0;
        }
        if (zzafzVar.zzn() >= this.zzn) {
            return -1;
        }
        zzahw zzahwVar3 = this.zzk;
        if (zzahwVar3 != null) {
            if (!zzahwVar3.zze(zzafzVar)) {
                return 0;
            }
            this.zzk = null;
            return 0;
        }
        if ((zzafzVar.zzn() & 1) == 1) {
            zzafzVar.zzf(1);
        }
        zzet zzetVar6 = this.zza;
        zzafzVar.zzi(zzetVar6.zzi(), 0, 12);
        zzetVar6.zzh(0);
        int iZzC7 = zzetVar6.zzC();
        if (iZzC7 == 1414744396) {
            zzetVar6.zzh(8);
            zzafzVar.zzf(zzetVar6.zzC() != 1769369453 ? 8 : 12);
            zzafzVar.zzl();
            return 0;
        }
        int iZzC8 = zzetVar6.zzC();
        if (iZzC7 == 1263424842) {
            this.zzj = zzafzVar.zzn() + ((long) iZzC8) + 8;
            return 0;
        }
        zzafzVar.zzf(8);
        zzafzVar.zzl();
        zzahw zzahwVarZzi2 = zzi(iZzC7);
        if (zzahwVarZzi2 == null) {
            this.zzj = zzafzVar.zzn() + ((long) iZzC8);
            return 0;
        }
        zzahwVarZzi2.zzd(iZzC8);
        this.zzk = zzahwVarZzi2;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzahw zzahwVar : this.zzi) {
            zzahwVar.zzf(j10);
        }
        if (j10 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    final /* synthetic */ zzahw[] zzh() {
        return this.zzi;
    }

    public zzaht(int i10, zzanj zzanjVar) {
        this.zzd = zzanjVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzet(12);
        this.zzb = new zzahs(null);
        this.zzf = new zzagx();
        this.zzi = new zzahw[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}

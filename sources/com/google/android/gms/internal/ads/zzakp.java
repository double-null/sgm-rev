package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakp implements zzafy {
    public static final /* synthetic */ int zza = 0;
    private final zzet zzb;
    private final zzagv zzc;
    private final zzagr zzd;
    private final zzagt zze;
    private final zzahk zzf;
    private zzagb zzg;
    private zzahk zzh;
    private zzahk zzi;
    private int zzj;
    private zzap zzk;
    private zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private zzakt zzr;
    private boolean zzs;

    static {
        int i10 = zzakn.zza;
    }

    public zzakp() {
        throw null;
    }

    private final long zzj(long j10) {
        return this.zzm + ((j10 * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzk(zzafz zzafzVar, boolean z10) throws IOException {
        int iZzm;
        int i10;
        int iZza;
        zzafzVar.zzl();
        if (zzafzVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzafzVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzafzVar.zzm();
            if (!z10) {
                zzafzVar.zzf(iZzm);
            }
            i10 = 0;
        } else {
            iZzm = 0;
            i10 = 0;
        }
        int i11 = i10;
        int i12 = i11;
        while (true) {
            if (zzl(zzafzVar)) {
                if (i11 > 0) {
                    break;
                }
                zzm();
                throw new EOFException();
            }
            zzet zzetVar = this.zzb;
            zzetVar.zzh(0);
            int iZzB = zzetVar.zzB();
            if ((i10 == 0 || zzn(iZzB, i10)) && (iZza = zzagw.zza(iZzB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    this.zzc.zza(iZzB);
                    i10 = iZzB;
                }
                zzafzVar.zzk(iZza - 4);
            } else {
                int i13 = i12 + 1;
                if (i12 == 131072) {
                    if (z10) {
                        return false;
                    }
                    zzm();
                    throw new EOFException();
                }
                if (z10) {
                    zzafzVar.zzl();
                    zzafzVar.zzk(iZzm + i13);
                } else {
                    zzafzVar.zzf(1);
                }
                i11 = 0;
                i12 = i13;
                i10 = 0;
            }
        }
        if (z10) {
            zzafzVar.zzf(iZzm + i12);
        } else {
            zzafzVar.zzl();
        }
        this.zzj = i10;
        return true;
    }

    private final boolean zzl(zzafz zzafzVar) throws IOException {
        zzakt zzaktVar = this.zzr;
        if (zzaktVar != null) {
            long jZzg = zzaktVar.zzg();
            if (jZzg != -1 && zzafzVar.zzm() > jZzg - 4) {
                return true;
            }
        }
        try {
            return !zzafzVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzakt zzaktVar = this.zzr;
        if ((zzaktVar instanceof zzakk) && zzaktVar.zzb()) {
            long j10 = this.zzp;
            if (j10 == -1 || j10 == this.zzr.zzg()) {
                return;
            }
            zzakk zzakkVarZzi = ((zzakk) this.zzr).zzi(this.zzp);
            this.zzr = zzakkVarZzi;
            zzagb zzagbVar = this.zzg;
            zzagbVar.getClass();
            zzagbVar.zzw(zzakkVarZzi);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        return zzk(zzafzVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzg = zzagbVar;
        zzahk zzahkVarZzu = zzagbVar.zzu(0, 1);
        this.zzh = zzahkVarZzu;
        this.zzi = zzahkVarZzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        this.zzh.getClass();
        String str = zzfl.zza;
        int iZzi = zzi(zzafzVar);
        if (iZzi == -1 && (this.zzr instanceof zzakl)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzj = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        zzakt zzaktVar = this.zzr;
        if (zzaktVar instanceof zzakl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    public final void zzh() {
        this.zzs = true;
    }

    public zzakp(int i10) {
        this.zzb = new zzet(10);
        this.zzc = new zzagv();
        this.zzd = new zzagr();
        this.zzm = -9223372036854775807L;
        this.zze = new zzagt();
        zzafv zzafvVar = new zzafv();
        this.zzf = zzafvVar;
        this.zzi = zzafvVar;
        this.zzp = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    private final int zzi(zzafz zzafzVar) throws IOException {
        int iZza;
        int i10;
        int iZzB;
        zzakv zzakvVarZza;
        zzagr zzagrVar;
        zzakr zzakrVar;
        zzap zzapVar;
        long jZzn;
        long jZzo;
        long jZzb;
        long j10;
        int i11;
        zzakt zzakkVar;
        long j11;
        long j12;
        int i12;
        int i13;
        zzajr zzajrVar;
        zzakm zzakmVarZze;
        zzakt zzakkVar2;
        if (this.zzj == 0) {
            try {
                zzk(zzafzVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzr == null) {
            zzagv zzagvVar = this.zzc;
            zzet zzetVar = new zzet(zzagvVar.zzc);
            zzafzVar.zzi(zzetVar.zzi(), 0, zzagvVar.zzc);
            int i14 = 21;
            if ((zzagvVar.zza & 1) != 0) {
                if (zzagvVar.zze != 1) {
                    i14 = 36;
                }
            } else if (zzagvVar.zze == 1) {
                i14 = 13;
            }
            if (zzetVar.zze() >= i14 + 4) {
                zzetVar.zzh(i14);
                iZzB = zzetVar.zzB();
                if (iZzB != 1483304551) {
                    if (iZzB == 1231971951) {
                        iZzB = 1231971951;
                    } else if (zzetVar.zze() >= 40) {
                        zzetVar.zzh(36);
                        if (zzetVar.zzB() == 1447187017) {
                            iZzB = 1447187017;
                        } else {
                            iZzB = 0;
                        }
                    } else {
                        iZzB = 0;
                    }
                }
            } else if (zzetVar.zze() >= 40) {
                zzetVar.zzh(36);
                if (zzetVar.zzB() == 1447187017) {
                    iZzB = 1447187017;
                } else {
                    iZzB = 0;
                }
            } else {
                iZzB = 0;
            }
            if (iZzB == 1231971951) {
                zzakvVarZza = zzakv.zza(zzagvVar, zzetVar);
                zzagrVar = this.zzd;
                if (!zzagrVar.zzb() && (i12 = zzakvVarZza.zze) != -1 && (i13 = zzakvVarZza.zzf) != -1) {
                    zzagrVar.zza = i12;
                    zzagrVar.zzb = i13;
                }
                zzakrVar = zzakvVarZza.zzd;
                if (zzakrVar != null) {
                    zzapVar = new zzap(-9223372036854775807L, zzakrVar);
                } else {
                    zzapVar = null;
                }
                this.zzl = zzapVar;
                jZzn = zzafzVar.zzn();
                if (zzafzVar.zzo() != -1) {
                    j11 = zzakvVarZza.zzc;
                    if (j11 != -1) {
                        j12 = j11 + jZzn;
                        if (zzafzVar.zzo() != j12) {
                            long jZzo2 = zzafzVar.zzo();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(jZzo2).length() + 53 + String.valueOf(j12).length() + 20);
                            sb2.append("Data size mismatch between stream (");
                            sb2.append(jZzo2);
                            sb2.append(") and Xing frame (");
                            sb2.append(j12);
                            sb2.append("), using Xing value.");
                            zzeg.zzb(cTJaRZ.FeSPjmT, sb2.toString());
                        }
                    }
                }
                zzafzVar.zzf(zzagvVar.zzc);
                if (iZzB == 1483304551) {
                    zzakkVar = zzakw.zze(zzakvVarZza, jZzn);
                } else {
                    jZzo = zzafzVar.zzo();
                    jZzb = zzakvVarZza.zzb();
                    if (jZzb != -9223372036854775807L) {
                        zzakkVar = null;
                    } else {
                        j10 = zzakvVarZza.zzc;
                        if (j10 != -1) {
                            jZzo = jZzn + j10;
                            i11 = zzakvVarZza.zza.zzc;
                        } else if (jZzo != -1) {
                            j10 = jZzo - jZzn;
                            i11 = zzakvVarZza.zza.zzc;
                        } else {
                            zzakkVar = null;
                        }
                        long j13 = j10 - ((long) i11);
                        zzakkVar = new zzakk(jZzo, jZzn + ((long) zzakvVarZza.zza.zzc), zzhah.zza(zzfl.zzv(j13, 8000000L, jZzb, RoundingMode.HALF_UP)), zzhah.zza(zzhab.zza(j13, zzakvVarZza.zzb, RoundingMode.HALF_UP)), false);
                    }
                }
            } else if (iZzB != 1447187017) {
                if (iZzB != 1483304551) {
                    zzafzVar.zzl();
                } else {
                    zzakvVarZza = zzakv.zza(zzagvVar, zzetVar);
                    zzagrVar = this.zzd;
                    if (!zzagrVar.zzb()) {
                        zzagrVar.zza = i12;
                        zzagrVar.zzb = i13;
                    }
                    zzakrVar = zzakvVarZza.zzd;
                    if (zzakrVar != null) {
                        zzapVar = new zzap(-9223372036854775807L, zzakrVar);
                    } else {
                        zzapVar = null;
                    }
                    this.zzl = zzapVar;
                    jZzn = zzafzVar.zzn();
                    if (zzafzVar.zzo() != -1) {
                        j11 = zzakvVarZza.zzc;
                        if (j11 != -1) {
                            j12 = j11 + jZzn;
                            if (zzafzVar.zzo() != j12) {
                                long jZzo3 = zzafzVar.zzo();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(jZzo3).length() + 53 + String.valueOf(j12).length() + 20);
                                sb3.append("Data size mismatch between stream (");
                                sb3.append(jZzo3);
                                sb3.append(") and Xing frame (");
                                sb3.append(j12);
                                sb3.append("), using Xing value.");
                                zzeg.zzb(cTJaRZ.FeSPjmT, sb3.toString());
                            }
                        }
                    }
                    zzafzVar.zzf(zzagvVar.zzc);
                    if (iZzB == 1483304551) {
                        zzakkVar = zzakw.zze(zzakvVarZza, jZzn);
                    } else {
                        jZzo = zzafzVar.zzo();
                        jZzb = zzakvVarZza.zzb();
                        if (jZzb != -9223372036854775807L) {
                            j10 = zzakvVarZza.zzc;
                            if (j10 != -1) {
                                jZzo = jZzn + j10;
                                i11 = zzakvVarZza.zza.zzc;
                            } else if (jZzo != -1) {
                                j10 = jZzo - jZzn;
                                i11 = zzakvVarZza.zza.zzc;
                            }
                            long j14 = j10 - ((long) i11);
                            zzakkVar = new zzakk(jZzo, jZzn + ((long) zzakvVarZza.zza.zzc), zzhah.zza(zzfl.zzv(j14, 8000000L, jZzb, RoundingMode.HALF_UP)), zzhah.zza(zzhab.zza(j14, zzakvVarZza.zzb, RoundingMode.HALF_UP)), false);
                        }
                    }
                }
                zzakkVar = null;
            } else {
                zzakkVar = zzaku.zze(zzafzVar.zzo(), zzafzVar.zzn(), zzagvVar, zzetVar);
                zzafzVar.zzf(zzagvVar.zzc);
            }
            zzap zzapVar2 = this.zzk;
            long jZzn2 = zzafzVar.zzn();
            if (zzapVar2 == null || (zzajrVar = (zzajr) zzapVar2.zzc(zzajr.class, zzgtn.zza())) == null) {
                zzakmVarZze = null;
            } else {
                zzajt zzajtVar = (zzajt) zzapVar2.zzc(zzajt.class, zzako.zza);
                zzakmVarZze = zzakm.zze(jZzn2, zzajrVar, zzajtVar == null ? -9223372036854775807L : zzfl.zzs(Long.parseLong((String) zzajtVar.zzb.get(0))));
            }
            if (this.zzs) {
                zzakkVar2 = new zzaks();
            } else {
                if (zzakmVarZze != null) {
                    zzakkVar = zzakmVarZze;
                } else if (zzakkVar == null) {
                    zzakkVar = null;
                }
                if (zzakkVar == null) {
                    zzet zzetVar2 = this.zzb;
                    zzafzVar.zzi(zzetVar2.zzi(), 0, 4);
                    zzetVar2.zzh(0);
                    zzagvVar.zza(zzetVar2.zzB());
                    zzakkVar2 = new zzakk(zzafzVar.zzo(), zzafzVar.zzn(), zzagvVar, false);
                } else {
                    zzakkVar2 = zzakkVar;
                }
                this.zzh.zzO(zzakkVar2.zza());
            }
            this.zzr = zzakkVar2;
            this.zzg.zzw(zzakkVar2);
            zzap zzapVarZzf = this.zzk;
            if (zzapVarZzf != null) {
                zzap zzapVar3 = this.zzl;
                if (zzapVar3 != null) {
                    zzapVarZzf = zzapVarZzf.zzf(zzapVar3);
                }
            } else {
                zzapVarZzf = this.zzl;
            }
            zzt zztVar = new zzt();
            zztVar.zzn("audio/mpeg");
            zztVar.zzo(zzagvVar.zzb);
            zztVar.zzp(4096);
            zztVar.zzG(zzagvVar.zze);
            zztVar.zzH(zzagvVar.zzd);
            zzagr zzagrVar2 = this.zzd;
            zztVar.zzJ(zzagrVar2.zza);
            zztVar.zzK(zzagrVar2.zzb);
            zztVar.zzl(zzapVarZzf);
            if (this.zzr.zzh() != -2147483647) {
                zztVar.zzi(this.zzr.zzh());
            }
            this.zzi.zzA(zztVar.zzO());
            this.zzo = zzafzVar.zzn();
        } else {
            long j15 = this.zzo;
            if (j15 != 0) {
                long jZzn3 = zzafzVar.zzn();
                if (jZzn3 < j15) {
                    zzafzVar.zzf((int) (j15 - jZzn3));
                }
            }
        }
        int i15 = this.zzq;
        if (i15 == 0) {
            zzafzVar.zzl();
            if (zzl(zzafzVar)) {
                return -1;
            }
            zzet zzetVar3 = this.zzb;
            zzetVar3.zzh(0);
            int iZzB2 = zzetVar3.zzB();
            if (!zzn(iZzB2, this.zzj) || zzagw.zza(iZzB2) == -1) {
                zzafzVar.zzf(1);
                this.zzj = 0;
            } else {
                zzagv zzagvVar2 = this.zzc;
                zzagvVar2.zza(iZzB2);
                if (this.zzm == -9223372036854775807L) {
                    this.zzm = this.zzr.zzf(zzafzVar.zzn());
                }
                i15 = zzagvVar2.zzc;
                this.zzq = i15;
                this.zzp = zzafzVar.zzn() + ((long) i15);
                zzakt zzaktVar = this.zzr;
                if (zzaktVar instanceof zzakl) {
                    zzj(this.zzn + ((long) zzagvVar2.zzg));
                    throw null;
                }
                iZza = this.zzi.zza(zzafzVar, i15, true);
                if (iZza == -1) {
                    return -1;
                }
                i10 = this.zzq - iZza;
                this.zzq = i10;
                if (i10 <= 0) {
                    zzahk zzahkVar = this.zzi;
                    long jZzj = zzj(this.zzn);
                    zzagv zzagvVar3 = this.zzc;
                    zzahkVar.zze(jZzj, 1, zzagvVar3.zzc, 0, null);
                    this.zzn += (long) zzagvVar3.zzg;
                    this.zzq = 0;
                    return 0;
                }
            }
        } else {
            iZza = this.zzi.zza(zzafzVar, i15, true);
            if (iZza == -1) {
                return -1;
            }
            i10 = this.zzq - iZza;
            this.zzq = i10;
            if (i10 <= 0) {
                zzahk zzahkVar2 = this.zzi;
                long jZzj2 = zzj(this.zzn);
                zzagv zzagvVar4 = this.zzc;
                zzahkVar2.zze(jZzj2, 1, zzagvVar4.zzc, 0, null);
                this.zzn += (long) zzagvVar4.zzg;
                this.zzq = 0;
                return 0;
            }
        }
        return 0;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzamc implements zzafy {
    public static final /* synthetic */ int zza = 0;
    private zzagb zzA;
    private zzamb[] zzB;
    private long[][] zzC;
    private int zzD;
    private final zzanj zzb;
    private final int zzc;
    private final zzet zzd;
    private final zzet zze;
    private final zzet zzf;
    private final zzet zzg;
    private final ArrayDeque zzh;
    private final zzamg zzi;
    private final List zzj;
    private zzgwm zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzet zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    static {
        int i10 = zzaly.zza;
    }

    @Deprecated
    public zzamc() {
        this(zzanj.zza, 16);
    }

    static /* synthetic */ long zzh(zzaml zzamlVar, long j10, long j11) {
        int iZzl = zzl(zzamlVar, j10);
        return iZzl == -1 ? j11 : Math.min(zzamlVar.zzc[iZzl], j11);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0002 A[SYNTHETIC] */
    private final void zzk(long j10) throws zzat {
        ArrayList arrayList;
        zzap zzapVarZze;
        ArrayDeque arrayDeque;
        zzap zzapVar;
        int i10;
        int i11;
        long j11;
        long j12;
        int i12;
        zzagr zzagrVar;
        int size;
        ArrayList arrayList2;
        zzfv zzfvVar;
        int i13;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfx) arrayDeque2.peek()).zza != j10) {
                break;
            }
            zzfx zzfxVar = (zzfx) arrayDeque2.pop();
            if (zzfxVar.zzd == 1836019574) {
                zzfx zzfxVarZzd = zzfxVar.zzd(1835365473);
                ArrayList arrayList3 = new ArrayList();
                if (zzfxVarZzd != null) {
                    zzapVarZze = zzalj.zze(zzfxVarZzd);
                    if (this.zzy) {
                        zzapVarZze.getClass();
                        zzfv zzfvVar2 = (zzfv) zzapVarZze.zzc(zzfv.class, zzalw.zza);
                        if (zzfvVar2 != null && zzfvVar2.zzb[0] == 0) {
                            this.zzz = this.zzx + 16;
                        }
                        zzfv zzfvVar3 = (zzfv) zzapVarZze.zzc(zzfv.class, zzalx.zza);
                        zzfvVar3.getClass();
                        List listZzb = zzfvVar3.zzb();
                        ArrayList arrayList4 = new ArrayList(listZzb.size());
                        for (int i14 = 0; i14 < listZzb.size(); i14++) {
                            int iIntValue = ((Integer) listZzb.get(i14)).intValue();
                            if (iIntValue == 0) {
                                i13 = 1;
                            } else if (iIntValue == 1) {
                                i13 = 2;
                            } else if (iIntValue != 2) {
                                i13 = iIntValue != 3 ? 0 : 4;
                            } else {
                                i13 = 3;
                            }
                            arrayList4.add(Integer.valueOf(i13));
                        }
                        arrayList = arrayList4;
                    } else {
                        if (zzapVarZze != null && (this.zzc & 64) != 0 && (zzfvVar = (zzfv) zzapVarZze.zzc(zzfv.class, zzalv.zza)) != null) {
                            long jZzJ = new zzet(zzfvVar.zzb).zzJ();
                            if (jZzJ > 0) {
                                this.zzx = jZzJ;
                                this.zzw = true;
                                arrayDeque = arrayDeque2;
                            }
                            arrayDeque.clear();
                            if (!this.zzw) {
                                this.zzl = 2;
                            }
                        }
                        arrayList = arrayList3;
                    }
                } else {
                    arrayList = arrayList3;
                    zzapVarZze = null;
                }
                ArrayList arrayList5 = new ArrayList();
                int i15 = this.zzD;
                zzagr zzagrVar2 = new zzagr();
                zzfy zzfyVarZzc = zzfxVar.zzc(1969517665);
                if (zzfyVarZzc != null) {
                    zzap zzapVarZzc = zzalj.zzc(zzfyVarZzc);
                    zzagrVar2.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzao[] zzaoVarArr = new zzao[1];
                zzfy zzfyVarZzc2 = zzfxVar.zzc(1836476516);
                zzfyVarZzc2.getClass();
                boolean z10 = 1 == i15;
                zzaoVarArr[0] = zzalj.zzd(zzfyVarZzc2.zza);
                zzap zzapVar2 = new zzap(-9223372036854775807L, zzaoVarArr);
                int i16 = this.zzc;
                zzagr zzagrVar3 = zzagrVar2;
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = arrayList;
                int i17 = 0;
                List listZzb2 = zzalj.zzb(zzfxVar, zzagrVar2, -9223372036854775807L, null, 1 == (i16 & 1), z10, zzalz.zza, false);
                if (this.zzy) {
                    zzgtj.zzj(arrayList7.size() == listZzb2.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(arrayList7.size()), Integer.valueOf(listZzb2.size())));
                }
                String strZza = zzalu.zza(listZzb2);
                int i18 = 0;
                int i19 = 0;
                long j13 = -9223372036854775807L;
                int i20 = -1;
                while (i19 < listZzb2.size()) {
                    zzaml zzamlVar = (zzaml) listZzb2.get(i19);
                    int i21 = zzamlVar.zzb;
                    if (i21 == 0) {
                        arrayDeque2 = arrayDeque2;
                        i10 = i18;
                        size = i20;
                        i19 = i19;
                        zzagrVar = zzagrVar3;
                        strZza = strZza;
                        arrayList2 = arrayList6;
                    } else {
                        zzami zzamiVar = zzamlVar.zza;
                        zzagb zzagbVar = this.zzA;
                        i10 = i18 + 1;
                        int i22 = zzamiVar.zzb;
                        zzamb zzambVar = new zzamb(zzamiVar, zzamlVar, zzagbVar.zzu(i18, i22));
                        long j14 = zzamiVar.zze;
                        if (j14 == -9223372036854775807L) {
                            j14 = zzamlVar.zzi;
                        }
                        zzahk zzahkVar = zzambVar.zzc;
                        zzahkVar.zzO(j14);
                        long jMax = Math.max(j13, j14);
                        zzv zzvVar = zzamiVar.zzg;
                        String str = zzvVar.zzp;
                        int i23 = "audio/true-hd".equals(str) ? zzamlVar.zze * 16 : zzamlVar.zze + 30;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzp(i23);
                        if (i22 == 2) {
                            int i24 = zzvVar.zzf;
                            if ((i16 & 8) != 0) {
                                i24 |= i20 == -1 ? 1 : 2;
                            }
                            if (this.zzy) {
                                arrayList7 = arrayList7;
                                zztVarZza.zzh(((Integer) arrayList7.get(i19)).intValue());
                                i24 |= 32768;
                            } else {
                                arrayList7 = arrayList7;
                            }
                            zztVarZza.zzg(i24);
                            i22 = 2;
                        } else {
                            arrayList7 = arrayList7;
                        }
                        if (zzas.zzb(str)) {
                            boolean z11 = zzamlVar.zzj;
                            int iMin = Math.min(!z11 ? zzamlVar.zzh.length : i21, 20);
                            zzgtj.zzi(j14 != -9223372036854775807L);
                            long jMin = Math.min(j14, 10000000L);
                            int i25 = -1;
                            int i26 = 0;
                            int i27 = 0;
                            while (true) {
                                if (i26 >= iMin) {
                                    i11 = -1;
                                    break;
                                }
                                int i28 = z11 ? i26 : zzamlVar.zzh[i26];
                                boolean z12 = z11;
                                long j15 = zzamlVar.zzf[i28];
                                if (j15 > jMin) {
                                    i11 = -1;
                                    break;
                                }
                                if (j15 >= 0 && (i12 = zzamlVar.zzd[i28]) > i27) {
                                    i25 = i28;
                                    i27 = i12;
                                }
                                i26++;
                                iMin = iMin;
                                z11 = z12;
                            }
                            j11 = i25 == i11 ? -9223372036854775807L : zzamlVar.zzf[i25];
                            j12 = -9223372036854775807L;
                        } else {
                            j12 = -9223372036854775807L;
                            j11 = -9223372036854775807L;
                        }
                        zzap zzapVar3 = j11 != j12 ? new zzap(j12, new zzaiz(j11)) : null;
                        zzagrVar = zzagrVar3;
                        zzalt.zzb(i22, zzagrVar, zztVarZza);
                        zzap zzapVar4 = zzvVar.zzl;
                        zzap[] zzapVarArr = new zzap[4];
                        List list = this.zzj;
                        zzapVarArr[0] = list.isEmpty() ? null : new zzap(list);
                        zzapVarArr[1] = zzapVar;
                        zzapVarArr[2] = zzapVar2;
                        zzapVarArr[3] = zzapVar3;
                        zzalt.zza(i22, zzapVarZze, zztVarZza, zzapVar4, zzapVarArr);
                        zztVarZza.zzn(strZza);
                        if (Objects.equals(str, "audio/mpeg")) {
                            zzambVar.zzf = zztVarZza.zzO();
                        } else {
                            zzahkVar.zzA(zztVarZza.zzO());
                        }
                        if (i22 == 2) {
                            size = i20;
                            if (size == -1) {
                                size = arrayList6.size();
                            }
                        } else {
                            size = i20;
                        }
                        arrayList2 = arrayList6;
                        arrayList2.add(zzambVar);
                        j13 = jMax;
                    }
                    i20 = size;
                    zzagrVar3 = zzagrVar;
                    arrayList6 = arrayList2;
                    strZza = strZza;
                    i19++;
                    i18 = i10;
                    listZzb2 = listZzb2;
                    arrayDeque2 = arrayDeque2;
                    i17 = 0;
                }
                arrayDeque = arrayDeque2;
                int i29 = i20;
                int i30 = -1;
                zzamb[] zzambVarArr = (zzamb[]) arrayList6.toArray(new zzamb[i17]);
                this.zzB = zzambVarArr;
                int length = zzambVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i31 = 0; i31 < zzambVarArr.length; i31++) {
                    jArr[i31] = new long[zzambVarArr[i31].zzb.zzb];
                    jArr2[i31] = zzambVarArr[i31].zzb.zzf[0];
                }
                int i32 = 0;
                int i33 = 0;
                long j16 = 0;
                while (i33 < zzambVarArr.length) {
                    int i34 = i30;
                    long j17 = Long.MAX_VALUE;
                    for (int i35 = i32; i35 < zzambVarArr.length; i35++) {
                        if (!zArr[i35]) {
                            long j18 = jArr2[i35];
                            if (j18 <= j17) {
                                i34 = i35;
                                j17 = j18;
                            }
                        }
                    }
                    int i36 = iArr[i34];
                    long[] jArr3 = jArr[i34];
                    jArr3[i36] = j16;
                    zzaml zzamlVar2 = zzambVarArr[i34].zzb;
                    zzamb[] zzambVarArr2 = zzambVarArr;
                    int i37 = i29;
                    j16 += (long) zzamlVar2.zzd[i36];
                    int i38 = i36 + 1;
                    iArr[i34] = i38;
                    if (i38 < jArr3.length) {
                        jArr2[i34] = zzamlVar2.zzf[i38];
                    } else {
                        zArr[i34] = true;
                        i33++;
                    }
                    zzambVarArr = zzambVarArr2;
                    i29 = i37;
                    i30 = -1;
                    i32 = 0;
                }
                this.zzC = jArr;
                this.zzA.zzv();
                this.zzA.zzw(new zzama(j13, this.zzB, i29));
                arrayDeque.clear();
                if (!this.zzw) {
                    this.zzl = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfx) arrayDeque2.peek()).zzb(zzfxVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzaml zzamlVar, long j10) {
        int iZza = zzamlVar.zza(j10);
        return iZza == -1 ? zzamlVar.zzb(j10) : iZza;
    }

    private static int zzm(int i10) {
        return i10 != 1903435808 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        zzahf zzahfVarZzb = zzamh.zzb(zzafzVar);
        this.zzk = zzahfVarZzb != null ? zzgwm.zzj(zzahfVarZzb) : zzgwm.zzi();
        return zzahfVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        if ((this.zzc & 16) == 0) {
            zzagbVar = new zzanm(zzagbVar, this.zzb);
        }
        this.zzA = zzagbVar;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0328  */
    /* JADX WARN: Code duplicated, block: B:162:0x0333 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0335  */
    /* JADX WARN: Code duplicated, block: B:166:0x033c  */
    /* JADX WARN: Code duplicated, block: B:178:0x036e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0383  */
    /* JADX WARN: Code duplicated, block: B:181:0x0387  */
    /* JADX WARN: Code duplicated, block: B:183:0x0391  */
    /* JADX WARN: Code duplicated, block: B:185:0x039b  */
    /* JADX WARN: Code duplicated, block: B:186:0x039e  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:259:0x048b  */
    /* JADX WARN: Code duplicated, block: B:261:0x049a  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:267:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:274:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Instruction removed from duplicated block: B:166:0x033c, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        char c10;
        zzahk zzahkVar;
        int i10;
        int iZzc;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        long j10;
        long jZzo;
        zzfx zzfxVar;
        long j11;
        long j12;
        int i12;
        boolean z13;
        long j13;
        long j14;
        long j15;
        boolean z14;
        while (true) {
            int i13 = this.zzl;
            if (i13 == 0) {
                if (this.zzo == 0) {
                    zzet zzetVar = this.zzg;
                    z14 = false;
                    if (zzafzVar.zzb(zzetVar.zzi(), 0, 8, true)) {
                        this.zzo = 8;
                        zzetVar.zzh(0);
                        this.zzn = zzetVar.zzz();
                        this.zzm = zzetVar.zzB();
                        j10 = this.zzn;
                        if (j10 == 1) {
                            zzet zzetVar2 = this.zzg;
                            zzafzVar.zzc(zzetVar2.zzi(), 8, 8);
                            this.zzo += 8;
                            this.zzn = zzetVar2.zzJ();
                        } else if (j10 == 0) {
                            jZzo = zzafzVar.zzo();
                            if (jZzo == -1) {
                                zzfxVar = (zzfx) this.zzh.peek();
                                if (zzfxVar != null) {
                                    jZzo = zzfxVar.zza;
                                } else {
                                    jZzo = -1;
                                }
                            }
                            if (jZzo != -1) {
                                this.zzn = (jZzo - zzafzVar.zzn()) + ((long) this.zzo);
                            }
                        }
                        j11 = this.zzn;
                        int i14 = this.zzo;
                        j12 = i14;
                        if (j11 < j12) {
                            if (this.zzm == 1718773093 || i14 != 8) {
                                throw zzat.zzc("Atom size less than header length (unsupported).");
                            }
                            this.zzn = j12;
                            i14 = 8;
                        }
                        i12 = this.zzm;
                        if (i12 != 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473 || i12 == 1635284069) {
                            z13 = true;
                            long jZzn = zzafzVar.zzn();
                            j13 = this.zzn;
                            long j16 = jZzn + j13;
                            j14 = this.zzo;
                            if (j13 != j14 && this.zzm == 1835365473) {
                                zzet zzetVar3 = this.zzf;
                                zzetVar3.zza(8);
                                zzafzVar.zzi(zzetVar3.zzi(), 0, 8);
                                zzalj.zzf(zzetVar3);
                                zzafzVar.zzf(zzetVar3.zzg());
                                zzafzVar.zzl();
                            }
                            j15 = j16 - j14;
                            this.zzh.push(new zzfx(this.zzm, j15));
                            if (this.zzn == this.zzo) {
                                zzk(j15);
                            } else {
                                zzj();
                            }
                        } else if (i12 == 1835296868 || i12 == 1836476516 || i12 == 1751411826 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1937011571 || i12 == 1668576371 || i12 == 1701606260 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1953196132 || i12 == 1718909296 || i12 == 1969517665 || i12 == 1801812339 || i12 == 1768715124) {
                            zzgtj.zzi(i14 == 8);
                            zzgtj.zzi(this.zzn <= 2147483647L);
                            zzet zzetVar4 = new zzet((int) this.zzn);
                            System.arraycopy(this.zzg.zzi(), 0, zzetVar4.zzi(), 0, 8);
                            this.zzp = zzetVar4;
                            z13 = true;
                            this.zzl = 1;
                        } else {
                            this.zzp = null;
                            this.zzl = 1;
                            z14 = true;
                        }
                        z14 = z13;
                    }
                } else {
                    j10 = this.zzn;
                    if (j10 == 1) {
                        zzet zzetVar5 = this.zzg;
                        zzafzVar.zzc(zzetVar5.zzi(), 8, 8);
                        this.zzo += 8;
                        this.zzn = zzetVar5.zzJ();
                    } else if (j10 == 0) {
                        jZzo = zzafzVar.zzo();
                        if (jZzo == -1) {
                            zzfxVar = (zzfx) this.zzh.peek();
                            if (zzfxVar != null) {
                                jZzo = zzfxVar.zza;
                            } else {
                                jZzo = -1;
                            }
                        }
                        if (jZzo != -1) {
                            this.zzn = (jZzo - zzafzVar.zzn()) + ((long) this.zzo);
                        }
                    }
                    j11 = this.zzn;
                    int i15 = this.zzo;
                    j12 = i15;
                    if (j11 < j12) {
                        if (this.zzm == 1718773093) {
                        }
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    i12 = this.zzm;
                    if (i12 != 1836019574) {
                        z13 = true;
                        long jZzn2 = zzafzVar.zzn();
                        j13 = this.zzn;
                        long j17 = jZzn2 + j13;
                        j14 = this.zzo;
                        if (j13 != j14) {
                            zzet zzetVar6 = this.zzf;
                            zzetVar6.zza(8);
                            zzafzVar.zzi(zzetVar6.zzi(), 0, 8);
                            zzalj.zzf(zzetVar6);
                            zzafzVar.zzf(zzetVar6.zzg());
                            zzafzVar.zzl();
                        }
                        j15 = j17 - j14;
                        this.zzh.push(new zzfx(this.zzm, j15));
                        if (this.zzn == this.zzo) {
                            zzk(j15);
                        } else {
                            zzj();
                        }
                        z14 = z13;
                    } else {
                        z13 = true;
                        long jZzn3 = zzafzVar.zzn();
                        j13 = this.zzn;
                        long j18 = jZzn3 + j13;
                        j14 = this.zzo;
                        if (j13 != j14) {
                            zzet zzetVar7 = this.zzf;
                            zzetVar7.zza(8);
                            zzafzVar.zzi(zzetVar7.zzi(), 0, 8);
                            zzalj.zzf(zzetVar7);
                            zzafzVar.zzf(zzetVar7.zzg());
                            zzafzVar.zzl();
                        }
                        j15 = j18 - j14;
                        this.zzh.push(new zzfx(this.zzm, j15));
                        if (this.zzn == this.zzo) {
                            zzk(j15);
                        } else {
                            zzj();
                        }
                        z14 = z13;
                    }
                }
                if (!z14) {
                    return -1;
                }
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        this.zzi.zzb(zzafzVar, zzagyVar, this.zzj);
                        if (zzagyVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long jZzn4 = zzafzVar.zzn();
                    int i16 = this.zzq;
                    if (i16 == -1) {
                        int i17 = -1;
                        int i18 = -1;
                        boolean z15 = true;
                        boolean z16 = true;
                        long j19 = Long.MAX_VALUE;
                        long j20 = Long.MAX_VALUE;
                        long j21 = Long.MAX_VALUE;
                        int i19 = 0;
                        while (true) {
                            zzamb[] zzambVarArr = this.zzB;
                            if (i19 >= zzambVarArr.length) {
                                break;
                            }
                            zzamb zzambVar = zzambVarArr[i19];
                            int i20 = zzambVar.zze;
                            zzaml zzamlVar = zzambVar.zzb;
                            if (i20 != zzamlVar.zzb) {
                                long j22 = zzamlVar.zzc[i20];
                                long[][] jArr = this.zzC;
                                jArr.getClass();
                                long j23 = jArr[i19][i20];
                                long j24 = j22 - jZzn4;
                                boolean z17 = j24 < 0 || j24 >= 262144;
                                if (z17) {
                                    z10 = z16;
                                } else {
                                    if (z16) {
                                        z16 = z17;
                                        i18 = i19;
                                        j20 = j23;
                                        j21 = j24;
                                    } else {
                                        z10 = false;
                                    }
                                    if (j23 < j19) {
                                        z15 = z17;
                                        i17 = i19;
                                        j19 = j23;
                                    }
                                }
                                if (z17 != z10 || j24 >= j21) {
                                    z16 = z10;
                                } else {
                                    z16 = z17;
                                    i18 = i19;
                                    j20 = j23;
                                    j21 = j24;
                                }
                                if (j23 < j19) {
                                    z15 = z17;
                                    i17 = i19;
                                    j19 = j23;
                                }
                            }
                            i19++;
                        }
                        i16 = (j19 == Long.MAX_VALUE || !z15 || j20 < j19 + 10485760) ? i18 : i17;
                        this.zzq = i16;
                        if (i16 == -1) {
                            return -1;
                        }
                    }
                    zzamb zzambVar2 = this.zzB[i16];
                    zzahk zzahkVar2 = zzambVar2.zzc;
                    int i21 = zzambVar2.zze;
                    zzaml zzamlVar2 = zzambVar2.zzb;
                    zzahk zzahkVar3 = zzahkVar2;
                    long j25 = zzamlVar2.zzc[i21] + this.zzz;
                    int[] iArr = zzamlVar2.zzd;
                    int i22 = iArr[i21];
                    zzahl zzahlVar = zzambVar2.zzd;
                    long j26 = (j25 - jZzn4) + ((long) this.zzr);
                    if (j26 < 0 || j26 >= 262144) {
                        zzagyVar.zza = j25;
                        return 1;
                    }
                    zzami zzamiVar = zzambVar2.zza;
                    if (zzamiVar.zzh == 1) {
                        j26 += 8;
                        i22 -= 8;
                    }
                    int i23 = i22;
                    zzafzVar.zzf((int) j26);
                    zzv zzvVar = zzamiVar.zzg;
                    String str = zzvVar.zzp;
                    if (!Objects.equals(str, "video/avc") ? !(!Objects.equals(str, "video/hevc") ? !Objects.equals(str, "video/apv") : (this.zzc & 128) == 0) : (this.zzc & 32) == 0) {
                        c10 = 1;
                    } else {
                        c10 = 1;
                        this.zzu = true;
                    }
                    int i24 = zzamiVar.zzk;
                    if (i24 == 0) {
                        zzahkVar = zzahkVar3;
                        if ("audio/ac4".equals(str)) {
                            if (this.zzs == 0) {
                                zzet zzetVar8 = this.zzf;
                                zzafb.zzc(i23, zzetVar8);
                                zzahkVar.zzc(zzetVar8, 7);
                                this.zzs += 7;
                            }
                            i23 += 7;
                        } else if (zzambVar2.zzf != null && Objects.equals(str, "audio/mpeg")) {
                            zzv zzvVarZzO = zzambVar2.zzf;
                            zzet zzetVar9 = this.zzf;
                            zzetVar9.zza(4);
                            zzafzVar.zzi(zzetVar9.zzi(), 0, 4);
                            zzafzVar.zzl();
                            zzagv zzagvVar = new zzagv();
                            if (zzagvVar.zza(zzetVar9.zzB()) && !Objects.equals(zzvVarZzO.zzp, zzagvVar.zzb)) {
                                zzt zztVarZza = zzvVarZzO.zza();
                                String str2 = zzagvVar.zzb;
                                str2.getClass();
                                zztVarZza.zzo(str2);
                                zzvVarZzO = zztVarZza.zzO();
                            }
                            zzahkVar.zzA(zzvVarZzO);
                            zzambVar2.zzf = null;
                        } else if (zzahlVar != null) {
                            zzahlVar.zzb(zzafzVar);
                        }
                        while (true) {
                            int i25 = this.zzs;
                            if (i25 >= i23) {
                                break;
                            }
                            int iZza = zzahkVar.zza(zzafzVar, i23 - i25, false);
                            this.zzr += iZza;
                            this.zzs += iZza;
                            this.zzt -= iZza;
                        }
                    } else {
                        zzet zzetVar10 = this.zze;
                        byte[] bArrZzi = zzetVar10.zzi();
                        bArrZzi[0] = 0;
                        bArrZzi[c10] = 0;
                        bArrZzi[2] = 0;
                        int i26 = 4 - i24;
                        i23 += i26;
                        while (this.zzs < i23) {
                            int i27 = this.zzt;
                            if (i27 == 0) {
                                if (this.zzu || zzgp.zzc(zzvVar) + i24 > iArr[i21] - this.zzr) {
                                    i10 = i24;
                                    iZzc = 0;
                                } else {
                                    iZzc = zzgp.zzc(zzvVar);
                                    i10 = i24 + iZzc;
                                }
                                zzafzVar.zzc(bArrZzi, i26, i10);
                                this.zzr += i10;
                                zzetVar10.zzh(0);
                                int iZzB = zzetVar10.zzB();
                                if (iZzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = iZzB - iZzc;
                                zzet zzetVar11 = this.zzd;
                                zzetVar11.zzh(0);
                                zzahk zzahkVar4 = zzahkVar3;
                                zzahkVar4.zzc(zzetVar11, 4);
                                this.zzs += 4;
                                if (iZzc > 0) {
                                    zzahkVar4.zzc(zzetVar10, iZzc);
                                    this.zzs += iZzc;
                                    if (zzgp.zzd(bArrZzi, 4, iZzc, zzvVar)) {
                                        this.zzu = true;
                                    }
                                }
                                zzahkVar3 = zzahkVar4;
                            } else {
                                int iZza2 = zzahkVar3.zza(zzafzVar, i27, false);
                                this.zzr += iZza2;
                                this.zzs += iZza2;
                                this.zzt -= iZza2;
                            }
                            i24 = i24;
                        }
                        zzahkVar = zzahkVar3;
                    }
                    long j27 = zzamlVar2.zzf[i21];
                    int i28 = zzamlVar2.zzg[i21];
                    if (!this.zzu) {
                        i28 |= 67108864;
                    }
                    if (zzahlVar != null) {
                        zzahlVar.zzc(zzahkVar, j27, i28, i23, 0, null);
                        if (i21 + 1 == zzamlVar2.zzb) {
                            zzahlVar.zzd(zzahkVar, null);
                        }
                    } else {
                        zzahkVar.zze(j27, i28, i23, 0, null);
                    }
                    zzambVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j28 = this.zzn - ((long) this.zzo);
                long jZzn5 = zzafzVar.zzn() + j28;
                zzet zzetVar12 = this.zzp;
                if (zzetVar12 != null) {
                    zzafzVar.zzc(zzetVar12.zzi(), this.zzo, (int) j28);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzetVar12.zzh(8);
                        if (zzm(zzetVar12.zzB()) == 0) {
                            zzetVar12.zzk(4);
                            while (true) {
                                if (zzetVar12.zzd() <= 0) {
                                    i11 = 0;
                                    break;
                                }
                                if (zzm(zzetVar12.zzB()) != 0) {
                                    i11 = 1;
                                    break;
                                }
                            }
                        } else {
                            i11 = 1;
                            break;
                        }
                        this.zzD = i11;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfx) arrayDeque.peek()).zza(new zzfy(this.zzm, zzetVar12));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzD = 1;
                    }
                    if (j28 < 262144) {
                        zzafzVar.zzf((int) j28);
                    } else {
                        zzagyVar.zza = zzafzVar.zzn() + j28;
                        z11 = true;
                    }
                    zzk(jZzn5);
                    if (this.zzw) {
                        this.zzy = true;
                        zzagyVar.zza = this.zzx;
                        this.zzw = false;
                    } else {
                        z12 = z11;
                        if (z12) {
                            return 1;
                        }
                    }
                    if (this.zzl != 2) {
                    }
                    if (z12) {
                        return 1;
                    }
                }
                z11 = false;
                zzk(jZzn5);
                if (this.zzw) {
                    this.zzy = true;
                    zzagyVar.zza = this.zzx;
                    this.zzw = false;
                } else {
                    if (z11) {
                    }
                    if (z12) {
                        return 1;
                    }
                }
                if (this.zzl != 2) {
                }
                if (z12) {
                    return 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j10 == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzamb zzambVar : this.zzB) {
            zzaml zzamlVar = zzambVar.zzb;
            int iZza = zzamlVar.zza(j11);
            if (iZza == -1) {
                iZza = zzamlVar.zzb(j11);
            }
            zzambVar.zze = iZza;
            zzahl zzahlVar = zzambVar.zzd;
            if (zzahlVar != null) {
                zzahlVar.zza();
            }
        }
    }

    public zzamc(zzanj zzanjVar, int i10) {
        this.zzb = zzanjVar;
        this.zzc = i10;
        this.zzk = zzgwm.zzi();
        this.zzl = (i10 & 4) != 0 ? 3 : 0;
        this.zzi = new zzamg();
        this.zzj = new ArrayList();
        this.zzg = new zzet(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzet(zzgp.zza);
        this.zze = new zzet(6);
        this.zzf = new zzet();
        this.zzq = -1;
        this.zzA = zzagb.zza;
        this.zzB = new zzamb[0];
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}

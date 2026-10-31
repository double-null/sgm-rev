package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzags {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final String zzn;
    public final zzgm zzo;

    private zzags(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, String str, zzgm zzgmVar) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = i18;
        this.zzi = i19;
        this.zzj = i20;
        this.zzk = i21;
        this.zzl = f10;
        this.zzm = i22;
        this.zzn = str;
        this.zzo = zzgmVar;
    }

    public static zzags zza(zzet zzetVar) throws zzat {
        return zzc(zzetVar, false, null);
    }

    public static zzags zzb(zzet zzetVar, zzgm zzgmVar) throws zzat {
        return zzc(zzetVar, true, zzgmVar);
    }

    private static zzags zzc(zzet zzetVar, boolean z10, zzgm zzgmVar) throws zzat {
        boolean z11;
        int i10;
        zzgi zzgiVar;
        int i11 = 4;
        boolean z12 = true;
        try {
            if (z10) {
                zzetVar.zzk(4);
            } else {
                zzetVar.zzk(21);
            }
            int iZzs = zzetVar.zzs() & 3;
            int iZzs2 = zzetVar.zzs();
            int iZzg = zzetVar.zzg();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < iZzs2; i14++) {
                zzetVar.zzk(1);
                int iZzt = zzetVar.zzt();
                for (int i15 = 0; i15 < iZzt; i15++) {
                    int iZzt2 = zzetVar.zzt();
                    i13 += iZzt2 + 4;
                    zzetVar.zzk(iZzt2);
                }
            }
            zzetVar.zzh(iZzg);
            byte[] bArr = new byte[i13];
            zzgm zzgmVar2 = zzgmVar;
            int i16 = 0;
            float f10 = 1.0f;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            String strZzc = null;
            int i29 = 0;
            while (i29 < iZzs2) {
                int iZzs3 = zzetVar.zzs() & 63;
                int iZzt3 = zzetVar.zzt();
                int i30 = i12;
                zzgm zzgmVarZzf = zzgmVar2;
                while (i30 < iZzt3) {
                    try {
                        int iZzt4 = zzetVar.zzt();
                        int i31 = iZzs2;
                        System.arraycopy(zzgp.zza, i12, bArr, i16, i11);
                        int i32 = i16 + 4;
                        System.arraycopy(zzetVar.zzi(), zzetVar.zzg(), bArr, i32, iZzt4);
                        int i33 = 32;
                        if (iZzs3 == 32) {
                            if (i30 == 0) {
                                zzgmVarZzf = zzgp.zzf(bArr, i32, i32 + iZzt4);
                                i30 = i12;
                                iZzt3 = iZzt3;
                                iZzs3 = iZzs3;
                            }
                            i16 = i32 + iZzt4;
                            zzetVar.zzk(iZzt4);
                            i30++;
                            iZzs2 = i31;
                            iZzt3 = iZzt3;
                            iZzs3 = iZzs3;
                            i11 = 4;
                        } else {
                            i33 = iZzs3;
                        }
                        if (i33 != 33) {
                            iZzt3 = iZzt3;
                            iZzs3 = iZzs3;
                            if (i33 == 39 && i30 == 0) {
                                int i34 = i32 + 2;
                                int i35 = (i32 + iZzt4) - 1;
                                while (true) {
                                    byte b10 = bArr[i35];
                                    if (b10 != 0) {
                                        if (b10 != 0 && i35 > i34) {
                                            zzgw zzgwVar = new zzgw(bArr, i34, i35 + 1);
                                            while (true) {
                                                if (zzgwVar.zzd(16)) {
                                                    int iZzf = zzgwVar.zzf(8);
                                                    int i36 = 0;
                                                    while (iZzf == 255) {
                                                        i36 += 255;
                                                        iZzf = zzgwVar.zzf(8);
                                                    }
                                                    int i37 = i36 + iZzf;
                                                    int iZzf2 = zzgwVar.zzf(8);
                                                    int i38 = 0;
                                                    while (iZzf2 == 255) {
                                                        i38 += 255;
                                                        iZzf2 = zzgwVar.zzf(8);
                                                    }
                                                    int i39 = i38 + iZzf2;
                                                    if (i39 != 0 && zzgwVar.zzd(i39)) {
                                                        if (i37 == 176) {
                                                            int iZzg2 = zzgwVar.zzg();
                                                            boolean zZze = zzgwVar.zze();
                                                            int iZzg3 = zZze ? zzgwVar.zzg() : 0;
                                                            int iZzg4 = zzgwVar.zzg();
                                                            int i40 = 0;
                                                            int iZzg5 = -1;
                                                            int iZzg6 = -1;
                                                            int i41 = -1;
                                                            int iZzf3 = -1;
                                                            int i42 = -1;
                                                            int iZzf4 = -1;
                                                            while (true) {
                                                                if (i40 <= iZzg4) {
                                                                    iZzg5 = zzgwVar.zzg();
                                                                    iZzg6 = zzgwVar.zzg();
                                                                    i10 = i30;
                                                                    int iZzf5 = zzgwVar.zzf(6);
                                                                    if (iZzf5 != 63) {
                                                                        iZzf3 = zzgwVar.zzf(iZzf5 == 0 ? Math.max(0, iZzg2 - 30) : Math.max(0, (iZzf5 + iZzg2) - 31));
                                                                        if (zZze) {
                                                                            int iZzf6 = zzgwVar.zzf(6);
                                                                            if (iZzf6 != 63) {
                                                                                iZzf4 = zzgwVar.zzf(iZzf6 == 0 ? Math.max(0, iZzg3 - 30) : Math.max(0, (iZzf6 + iZzg3) - 31));
                                                                                i42 = iZzf6;
                                                                            }
                                                                        } else {
                                                                            zZze = zZze;
                                                                        }
                                                                        if (zzgwVar.zze()) {
                                                                            zzgwVar.zzb(10);
                                                                        }
                                                                        i40++;
                                                                        i41 = iZzf5;
                                                                        i30 = i10;
                                                                        zZze = zZze;
                                                                        i17 = i17;
                                                                    }
                                                                    zzgiVar = null;
                                                                } else {
                                                                    i10 = i30;
                                                                    i17 = i17;
                                                                    zzgiVar = new zzgi(iZzg2, iZzg3, iZzg4 + 1, iZzg5, iZzg6, i41, iZzf3, i42, iZzf4);
                                                                }
                                                            }
                                                        } else {
                                                            zzgwVar.zzb(i39 * 8);
                                                            i30 = i30;
                                                            i17 = i17;
                                                        }
                                                    }
                                                    i17 = i17;
                                                    zzgiVar = null;
                                                }
                                            }
                                        }
                                        if (zzgiVar == null && zzgmVarZzf != null) {
                                            i12 = 0;
                                            if (zzgiVar.zza == ((zzgc) zzgmVarZzf.zza.get(0)).zzb) {
                                                i30 = i10;
                                                i17 = i17;
                                                i27 = 4;
                                            } else {
                                                i27 = 5;
                                            }
                                        }
                                        i30 = i10;
                                        i17 = i17;
                                    } else if (i35 > i34) {
                                        i35--;
                                    }
                                    i10 = i30;
                                    i17 = i17;
                                    zzgiVar = null;
                                    if (zzgiVar == null) {
                                    }
                                }
                            } else {
                                i10 = i30;
                                i17 = i17;
                            }
                            i12 = 0;
                            i30 = i10;
                            i17 = i17;
                        } else if (i30 == 0) {
                            zzgj zzgjVarZzg = zzgp.zzg(bArr, i32, i32 + iZzt4, zzgmVarZzf);
                            int i43 = zzgjVarZzg.zza + 1;
                            int i44 = zzgjVarZzg.zze;
                            int i45 = zzgjVarZzg.zzf;
                            int i46 = zzgjVarZzg.zzg;
                            int i47 = zzgjVarZzg.zzh;
                            i22 = zzgjVarZzg.zzc + 8;
                            int i48 = zzgjVarZzg.zzd + 8;
                            int i49 = zzgjVarZzg.zzk;
                            int i50 = zzgjVarZzg.zzl;
                            int i51 = zzgjVarZzg.zzm;
                            float f11 = zzgjVarZzg.zzi;
                            int i52 = zzgjVarZzg.zzj;
                            zzge zzgeVar = zzgjVarZzg.zzb;
                            if (zzgeVar != null) {
                                strZzc = zzdq.zzc(zzgeVar.zza, zzgeVar.zzb, zzgeVar.zzc, zzgeVar.zzd, zzgeVar.zze, zzgeVar.zzf);
                            }
                            i17 = i43;
                            i18 = i44;
                            i12 = 0;
                            i20 = i46;
                            i19 = i45;
                            i28 = i52;
                            f10 = f11;
                            i26 = i51;
                            i25 = i50;
                            i24 = i49;
                            i23 = i48;
                            i21 = i47;
                        } else {
                            iZzt3 = iZzt3;
                            iZzs3 = iZzs3;
                            i10 = i30;
                            i17 = i17;
                            i12 = 0;
                            i30 = i10;
                            i17 = i17;
                        }
                        i16 = i32 + iZzt4;
                        zzetVar.zzk(iZzt4);
                        i30++;
                        iZzs2 = i31;
                        iZzt3 = iZzt3;
                        iZzs3 = iZzs3;
                        i11 = 4;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        e = e10;
                        z11 = true;
                        throw zzat.zzb("Error parsing".concat(z11 != z10 ? "HEVC config" : "L-HEVC config"), e);
                    }
                }
                i29++;
                zzgmVar2 = zzgmVarZzf;
                i11 = 4;
                z12 = true;
            }
            return new zzags(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzs + 1, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, f10, i28, strZzc, zzgmVar2);
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            z11 = z12;
        }
    }
}

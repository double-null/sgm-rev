package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzanb extends zzamz {
    private zzana zza;
    private int zzb;
    private boolean zzc;
    private zzhd zzd;
    private zzhb zze;

    zzanb() {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final long zzb(zzet zzetVar) {
        if ((zzetVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        zzana zzanaVar = this.zza;
        zzanaVar.getClass();
        byte b10 = zzetVar.zzi()[0];
        zzhd zzhdVar = zzanaVar.zza;
        zzhc[] zzhcVarArr = zzanaVar.zzd;
        int i10 = zzhcVarArr[(b10 >> 1) & (255 >>> (8 - zzhe.zza(zzhcVarArr.length + (-1))))].zza ? zzhdVar.zzf : zzhdVar.zze;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzetVar.zzj() < zzetVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzetVar.zzi(), zzetVar.zze() + 4);
            zzetVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzetVar.zzf(zzetVar.zze() + 4);
        }
        long j10 = i11;
        byte[] bArrZzi = zzetVar.zzi();
        bArrZzi[zzetVar.zze() - 4] = (byte) (j10 & 255);
        bArrZzi[zzetVar.zze() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrZzi[zzetVar.zze() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrZzi[zzetVar.zze() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03f1  */
    @Override // com.google.android.gms.internal.ads.zzamz
    protected final boolean zzc(zzet zzetVar, long j10, zzamx zzamxVar) throws IOException {
        zzana zzanaVar;
        int i10;
        int iZzb;
        int i11;
        int i12;
        if (this.zza != null) {
            zzamxVar.zza.getClass();
            return false;
        }
        zzhd zzhdVar = this.zzd;
        int i13 = 4;
        if (zzhdVar != null) {
            zzhb zzhbVar = this.zze;
            if (zzhbVar == null) {
                this.zze = zzhe.zzb(zzetVar, true, true);
            } else {
                byte[] bArr = new byte[zzetVar.zze()];
                System.arraycopy(zzetVar.zzi(), 0, bArr, 0, zzetVar.zze());
                int i14 = zzhdVar.zza;
                int i15 = 5;
                zzhe.zzc(5, zzetVar, false);
                int iZzs = zzetVar.zzs() + 1;
                zzha zzhaVar = new zzha(zzetVar.zzi());
                zzhaVar.zzc(zzetVar.zzg() * 8);
                int i16 = 0;
                while (true) {
                    int i17 = 2;
                    int i18 = 16;
                    if (i16 >= iZzs) {
                        zzhd zzhdVar2 = zzhdVar;
                        int i19 = 6;
                        int iZzb2 = zzhaVar.zzb(6) + 1;
                        for (int i20 = 0; i20 < iZzb2; i20++) {
                            if (zzhaVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i21 = 1;
                        int iZzb3 = zzhaVar.zzb(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 >= iZzb3) {
                                int i24 = 1;
                                int iZzb4 = zzhaVar.zzb(i19) + 1;
                                int i25 = 0;
                                while (i25 < iZzb4) {
                                    if (zzhaVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzhaVar.zzc(24);
                                    zzhaVar.zzc(24);
                                    zzhaVar.zzc(24);
                                    int iZzb5 = zzhaVar.zzb(i19) + i24;
                                    int i26 = 8;
                                    zzhaVar.zzc(8);
                                    int[] iArr = new int[iZzb5];
                                    for (int i27 = 0; i27 < iZzb5; i27++) {
                                        iArr[i27] = ((zzhaVar.zza() ? zzhaVar.zzb(5) : 0) * 8) + zzhaVar.zzb(3);
                                    }
                                    int i28 = 0;
                                    while (i28 < iZzb5) {
                                        int i29 = 0;
                                        while (i29 < i26) {
                                            if ((iArr[i28] & (1 << i29)) != 0) {
                                                zzhaVar.zzc(i26);
                                            }
                                            i29++;
                                            i26 = 8;
                                        }
                                        i28++;
                                        i26 = 8;
                                    }
                                    i25++;
                                    i19 = 6;
                                    i24 = 1;
                                }
                                int iZzb6 = zzhaVar.zzb(i19) + 1;
                                for (int i30 = 0; i30 < iZzb6; i30++) {
                                    int iZzb7 = zzhaVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb7).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iZzb7);
                                        zzeg.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzhaVar.zza()) {
                                            i10 = 1;
                                            iZzb = zzhaVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzhaVar.zza()) {
                                            int iZzb8 = zzhaVar.zzb(8) + i10;
                                            for (int i31 = 0; i31 < iZzb8; i31++) {
                                                int i32 = i14 - 1;
                                                zzhaVar.zzc(zzhe.zza(i32));
                                                zzhaVar.zzc(zzhe.zza(i32));
                                            }
                                        }
                                        if (zzhaVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i33 = 0; i33 < i14; i33++) {
                                                zzhaVar.zzc(4);
                                            }
                                        }
                                        for (int i34 = 0; i34 < iZzb; i34++) {
                                            zzhaVar.zzc(8);
                                            zzhaVar.zzc(8);
                                            zzhaVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzhaVar.zzb(6) + 1;
                                zzhc[] zzhcVarArr = new zzhc[iZzb9];
                                for (int i35 = 0; i35 < iZzb9; i35++) {
                                    zzhcVarArr[i35] = new zzhc(zzhaVar.zza(), zzhaVar.zzb(16), zzhaVar.zzb(16), zzhaVar.zzb(8));
                                }
                                if (!zzhaVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzanaVar = new zzana(zzhdVar2, zzhbVar, bArr, zzhcVarArr, zzhe.zza(iZzb9 - 1));
                                break;
                            }
                            int iZzb10 = zzhaVar.zzb(i18);
                            if (iZzb10 == 0) {
                                i11 = iZzb3;
                                int i36 = 8;
                                zzhaVar.zzc(8);
                                zzhaVar.zzc(16);
                                zzhaVar.zzc(16);
                                zzhaVar.zzc(6);
                                zzhaVar.zzc(8);
                                int iZzb11 = zzhaVar.zzb(4) + 1;
                                int i37 = 0;
                                while (i37 < iZzb11) {
                                    zzhaVar.zzc(i36);
                                    i37++;
                                    i36 = 8;
                                }
                            } else {
                                if (iZzb10 != i21) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb10).length() + 41);
                                    sb3.append("floor type greater than 1 not decodable: ");
                                    sb3.append(iZzb10);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                int iZzb12 = zzhaVar.zzb(i15);
                                int[] iArr2 = new int[iZzb12];
                                int i38 = -1;
                                for (int i39 = 0; i39 < iZzb12; i39++) {
                                    int iZzb13 = zzhaVar.zzb(4);
                                    iArr2[i39] = iZzb13;
                                    if (iZzb13 > i38) {
                                        i38 = iZzb13;
                                    }
                                }
                                int i40 = i38 + 1;
                                int[] iArr3 = new int[i40];
                                int i41 = 0;
                                while (i41 < i40) {
                                    iArr3[i41] = zzhaVar.zzb(i23) + 1;
                                    int iZzb14 = zzhaVar.zzb(i17);
                                    if (iZzb14 > 0) {
                                        i12 = 8;
                                        zzhaVar.zzc(8);
                                    } else {
                                        i12 = 8;
                                    }
                                    int i42 = iZzb3;
                                    int i43 = 0;
                                    for (int i44 = 1; i43 < (i44 << iZzb14); i44 = 1) {
                                        zzhaVar.zzc(i12);
                                        i43++;
                                        i12 = 8;
                                    }
                                    i41++;
                                    iZzb3 = i42;
                                    i17 = 2;
                                    i23 = 3;
                                }
                                i11 = iZzb3;
                                zzhaVar.zzc(i17);
                                int iZzb15 = zzhaVar.zzb(4);
                                int i45 = 0;
                                int i46 = 0;
                                for (int i47 = 0; i47 < iZzb12; i47++) {
                                    i45 += iArr3[iArr2[i47]];
                                    while (i46 < i45) {
                                        zzhaVar.zzc(iZzb15);
                                        i46++;
                                    }
                                }
                            }
                            i22++;
                            iZzb3 = i11;
                            i19 = 6;
                            i18 = 16;
                            i17 = 2;
                            i21 = 1;
                            i15 = 5;
                        }
                    } else {
                        if (zzhaVar.zzb(24) != 5653314) {
                            int iZzd = zzhaVar.zzd();
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(iZzd);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        int iZzb16 = zzhaVar.zzb(16);
                        int iZzb17 = zzhaVar.zzb(24);
                        if (zzhaVar.zza()) {
                            zzhaVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzhaVar.zzb(zzhe.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzhaVar.zza();
                            for (int i48 = 0; i48 < iZzb17; i48++) {
                                if (!zZza) {
                                    zzhaVar.zzc(5);
                                } else if (zzhaVar.zza()) {
                                    zzhaVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzhaVar.zzb(i13);
                        if (iZzb19 > 2) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iZzb19);
                            throw zzat.zzb(sb5.toString(), null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzhdVar = zzhdVar;
                            }
                            i16++;
                            zzhdVar = zzhdVar;
                            i13 = 4;
                        } else {
                            i17 = iZzb19;
                        }
                        zzhaVar.zzc(32);
                        zzhaVar.zzc(32);
                        int iZzb20 = zzhaVar.zzb(i13) + 1;
                        zzhaVar.zzc(1);
                        zzhaVar.zzc((int) ((i17 == 1 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i16++;
                        zzhdVar = zzhdVar;
                        i13 = 4;
                    }
                }
            }
            this.zza = zzanaVar;
            if (zzanaVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzhd zzhdVar3 = zzanaVar.zza;
            arrayList.add(zzhdVar3.zzg);
            arrayList.add(zzanaVar.zzc);
            zzap zzapVarZzb = zzahm.zzb(zzgwm.zzr(zzanaVar.zzb.zza));
            zzt zztVar = new zzt();
            zztVar.zzn("audio/ogg");
            zztVar.zzo("audio/vorbis");
            zztVar.zzi(zzhdVar3.zzd);
            zztVar.zzj(zzhdVar3.zzc);
            zztVar.zzG(zzhdVar3.zza);
            zztVar.zzH(zzhdVar3.zzb);
            zztVar.zzr(arrayList);
            zztVar.zzl(zzapVarZzb);
            zzamxVar.zza = zztVar.zzO();
            return true;
        }
        zzhe.zzc(1, zzetVar, false);
        int iZzI = zzetVar.zzI();
        int iZzs2 = zzetVar.zzs();
        int iZzI2 = zzetVar.zzI();
        int iZzC = zzetVar.zzC();
        int i49 = iZzC <= 0 ? -1 : iZzC;
        int iZzC2 = zzetVar.zzC();
        int i50 = iZzC2 <= 0 ? -1 : iZzC2;
        int iZzC3 = zzetVar.zzC();
        int i51 = iZzC3 <= 0 ? -1 : iZzC3;
        int iZzs3 = zzetVar.zzs();
        this.zzd = new zzhd(iZzI, iZzs2, iZzI2, i49, i50, i51, (int) Math.pow(2.0d, iZzs3 & 15), (int) Math.pow(2.0d, (iZzs3 & 240) >> 4), 1 == (zzetVar.zzs() & 1), Arrays.copyOf(zzetVar.zzi(), zzetVar.zze()));
        zzanaVar = null;
        this.zza = zzanaVar;
        if (zzanaVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzhd zzhdVar4 = zzanaVar.zza;
        arrayList2.add(zzhdVar4.zzg);
        arrayList2.add(zzanaVar.zzc);
        zzap zzapVarZzb2 = zzahm.zzb(zzgwm.zzr(zzanaVar.zzb.zza));
        zzt zztVar2 = new zzt();
        zztVar2.zzn("audio/ogg");
        zztVar2.zzo("audio/vorbis");
        zztVar2.zzi(zzhdVar4.zzd);
        zztVar2.zzj(zzhdVar4.zzc);
        zztVar2.zzG(zzhdVar4.zza);
        zztVar2.zzH(zzhdVar4.zzb);
        zztVar2.zzr(arrayList2);
        zztVar2.zzl(zzapVarZzb2);
        zzamxVar.zza = zztVar2.zzO();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zzj(long j10) {
        super.zzj(j10);
        this.zzc = j10 != 0;
        zzhd zzhdVar = this.zzd;
        this.zzb = zzhdVar != null ? zzhdVar.zze : 0;
    }
}

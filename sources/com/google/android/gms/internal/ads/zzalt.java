package com.google.android.gms.internal.ads;

import be.LNO.fzLzfW;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzalt {
    public static void zza(int i10, zzap zzapVar, zzt zztVar, zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(-9223372036854775807L, new zzao[0]);
        }
        if (zzapVar != null) {
            zzgwm zzgwmVarZzd = zzapVar.zzd(zzfv.class);
            int size = zzgwmVarZzd.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzfv zzfvVar = (zzfv) zzgwmVarZzd.get(i11);
                if (!zzfvVar.zza.equals("com.android.capture.fps") || i10 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfvVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzl(zzapVar2);
        }
    }

    public static void zzb(int i10, zzagr zzagrVar, zzt zztVar) {
        if (i10 == 1 && zzagrVar.zzb()) {
            zztVar.zzJ(zzagrVar.zza);
            zztVar.zzK(zzagrVar.zzb);
        }
    }

    private static zzajt zzd(int i10, String str, zzet zzetVar) {
        int iZzB = zzetVar.zzB();
        if (zzetVar.zzB() == 1684108385) {
            zzetVar.zzk(8);
            return new zzajt(str, null, zzgwm.zzj(zzetVar.zzL(iZzB - 16)));
        }
        zzeg.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfz.zze(i10)));
        return null;
    }

    private static zzajo zze(int i10, String str, zzet zzetVar, boolean z10, boolean z11) {
        int iZzf = zzf(zzetVar);
        if (z11) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z10 ? new zzajt(str, null, zzgwm.zzj(Integer.toString(iZzf))) : new zzaji("und", str, Integer.toString(iZzf));
        }
        zzeg.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfz.zze(i10)));
        return null;
    }

    private static int zzf(zzet zzetVar) {
        int iZzB = zzetVar.zzB();
        if (zzetVar.zzB() == 1684108385) {
            zzetVar.zzk(8);
            int i10 = iZzB - 16;
            if (i10 == 1) {
                return zzetVar.zzs();
            }
            if (i10 == 2) {
                return zzetVar.zzt();
            }
            if (i10 == 3) {
                return zzetVar.zzx();
            }
            if (i10 == 4 && (zzetVar.zzn() & 128) == 0) {
                return zzetVar.zzH();
            }
        }
        zzeg.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzajt zzg(int i10, String str, zzet zzetVar) {
        int iZzB = zzetVar.zzB();
        if (zzetVar.zzB() == 1684108385 && iZzB >= 22) {
            zzetVar.zzk(10);
            int iZzt = zzetVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt).length());
                sb2.append(iZzt);
                String string = sb2.toString();
                int iZzt2 = zzetVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb3 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb3.append(string);
                    sb3.append("/");
                    sb3.append(iZzt2);
                    string = sb3.toString();
                }
                return new zzajt(str, null, zzgwm.zzj(string));
            }
        }
        zzeg.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfz.zze(i10)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x028a A[Catch: all -> 0x0202, TryCatch #0 {all -> 0x0202, blocks: (B:9:0x0031, B:11:0x003c, B:13:0x0048, B:16:0x0054, B:19:0x0061, B:22:0x006e, B:25:0x007b, B:28:0x0088, B:30:0x0094, B:38:0x00af, B:39:0x00cd, B:40:0x00e0, B:43:0x00ec, B:46:0x00f9, B:49:0x0106, B:52:0x0113, B:55:0x0121, B:58:0x012e, B:61:0x013b, B:64:0x0148, B:67:0x0155, B:70:0x0165, B:74:0x0179, B:76:0x017f, B:78:0x0194, B:79:0x019b, B:81:0x01a2, B:86:0x01ad, B:91:0x01b9, B:137:0x028a, B:92:0x01ce, B:94:0x01d5, B:96:0x01e1, B:97:0x01f5, B:112:0x0222, B:115:0x022f, B:118:0x023c, B:121:0x0249, B:124:0x0255, B:127:0x0261, B:130:0x026b, B:133:0x0277, B:136:0x0283, B:138:0x02a7, B:139:0x02ae), top: B:144:0x0023 }] */
    public static zzao zzc(zzet zzetVar) {
        String str;
        zzao zzajeVar;
        int iZzg = zzetVar.zzg() + zzetVar.zzB();
        int iZzB = zzetVar.zzB();
        int i10 = (iZzB >> 24) & 255;
        String str2 = cTJaRZ.SsNtU;
        zzao zzaoVarZzd = null;
        try {
            if (i10 != 169 && i10 != 253) {
                if (iZzB == 1735291493) {
                    String strZza = zzajp.zza(zzf(zzetVar) - 1);
                    if (strZza != null) {
                        zzajeVar = new zzajt("TCON", null, zzgwm.zzj(strZza));
                        zzaoVarZzd = zzajeVar;
                    } else {
                        zzeg.zzc("MetadataUtil", "Failed to parse standard genre code");
                    }
                } else if (iZzB == 1684632427) {
                    zzaoVarZzd = zzg(1684632427, "TPOS", zzetVar);
                } else if (iZzB == 1953655662) {
                    zzaoVarZzd = zzg(1953655662, "TRCK", zzetVar);
                } else if (iZzB == 1953329263) {
                    zzaoVarZzd = zze(1953329263, "TBPM", zzetVar, true, false);
                } else if (iZzB == 1668311404) {
                    zzaoVarZzd = zze(1668311404, "TCMP", zzetVar, true, true);
                } else if (iZzB == 1668249202) {
                    int iZzB2 = zzetVar.zzB();
                    if (zzetVar.zzB() == 1684108385) {
                        int iZzB3 = zzetVar.zzB();
                        int i11 = zzalj.zza;
                        int i12 = iZzB3 & 16777215;
                        if (i12 == 13) {
                            str = "image/jpeg";
                        } else if (i12 == 14) {
                            str = "image/png";
                            i12 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 30);
                            sb2.append("Unrecognized cover art flags: ");
                            sb2.append(i12);
                            zzeg.zzc("MetadataUtil", sb2.toString());
                        } else {
                            zzetVar.zzk(4);
                            int i13 = iZzB2 - 16;
                            byte[] bArr = new byte[i13];
                            zzetVar.zzm(bArr, 0, i13);
                            zzajeVar = new zzaje(str, null, 3, bArr);
                            zzaoVarZzd = zzajeVar;
                        }
                    } else {
                        zzeg.zzc("MetadataUtil", "Failed to parse cover art attribute");
                    }
                } else if (iZzB == 1631670868) {
                    zzaoVarZzd = zzd(1631670868, "TPE2", zzetVar);
                } else if (iZzB == 1936682605) {
                    zzaoVarZzd = zzd(1936682605, "TSOT", zzetVar);
                } else if (iZzB == 1936679276) {
                    zzaoVarZzd = zzd(1936679276, "TSOA", zzetVar);
                } else if (iZzB == 1936679282) {
                    zzaoVarZzd = zzd(1936679282, fzLzfW.TwxOUg, zzetVar);
                } else if (iZzB == 1936679265) {
                    zzaoVarZzd = zzd(1936679265, "TSO2", zzetVar);
                } else if (iZzB == 1936679791) {
                    zzaoVarZzd = zzd(1936679791, "TSOC", zzetVar);
                } else if (iZzB == 1920233063) {
                    zzaoVarZzd = zze(1920233063, "ITUNESADVISORY", zzetVar, false, false);
                } else if (iZzB == 1885823344) {
                    zzaoVarZzd = zze(1885823344, "ITUNESGAPLESS", zzetVar, false, true);
                } else if (iZzB == 1936683886) {
                    zzaoVarZzd = zzd(1936683886, "TVSHOWSORT", zzetVar);
                } else if (iZzB == 1953919848) {
                    zzaoVarZzd = zzd(1953919848, "TVSHOW", zzetVar);
                } else if (iZzB == 757935405) {
                    int i14 = -1;
                    int i15 = -1;
                    String strZzL = null;
                    String strZzL2 = null;
                    while (zzetVar.zzg() < iZzg) {
                        int iZzg2 = zzetVar.zzg();
                        int iZzB4 = zzetVar.zzB();
                        int iZzB5 = zzetVar.zzB();
                        zzetVar.zzk(4);
                        if (iZzB5 == 1835360622) {
                            strZzL = zzetVar.zzL(iZzB4 - 12);
                        } else {
                            int i16 = iZzB4 - 12;
                            if (iZzB5 == 1851878757) {
                                strZzL2 = zzetVar.zzL(i16);
                            } else {
                                if (iZzB5 == 1684108385) {
                                    i15 = iZzB4;
                                }
                                if (iZzB5 == 1684108385) {
                                    i14 = iZzg2;
                                }
                                zzetVar.zzk(i16);
                            }
                        }
                    }
                    if (strZzL != null && strZzL2 != null && i14 != -1) {
                        zzetVar.zzh(i14);
                        zzetVar.zzk(16);
                        zzaoVarZzd = new zzajq(strZzL, strZzL2, zzetVar.zzL(i15 - 16));
                    }
                } else {
                    String strZze = zzfz.zze(iZzB);
                    StringBuilder sb3 = new StringBuilder(strZze.length() + 32);
                    sb3.append(str2);
                    sb3.append(strZze);
                    zzeg.zza("MetadataUtil", sb3.toString());
                }
            } else {
                int i17 = iZzB & 16777215;
                if (i17 == 6516084) {
                    int iZzB6 = zzetVar.zzB();
                    if (zzetVar.zzB() == 1684108385) {
                        zzetVar.zzk(8);
                        String strZzL3 = zzetVar.zzL(iZzB6 - 16);
                        zzaoVarZzd = new zzaji("und", strZzL3, strZzL3);
                    } else {
                        zzeg.zzc("MetadataUtil", "Failed to parse comment attribute: ".concat(zzfz.zze(iZzB)));
                    }
                } else if (i17 != 7233901 && i17 != 7631467) {
                    if (i17 != 6516589 && i17 != 7828084) {
                        if (i17 == 6578553) {
                            zzaoVarZzd = zzd(iZzB, "TDRC", zzetVar);
                        } else if (i17 == 4280916) {
                            zzaoVarZzd = zzd(iZzB, "TPE1", zzetVar);
                        } else if (i17 == 7630703) {
                            zzaoVarZzd = zzd(iZzB, "TSSE", zzetVar);
                        } else if (i17 == 6384738) {
                            zzaoVarZzd = zzd(iZzB, "TALB", zzetVar);
                        } else if (i17 == 7108978) {
                            zzaoVarZzd = zzd(iZzB, "USLT", zzetVar);
                        } else if (i17 == 6776174) {
                            zzaoVarZzd = zzd(iZzB, "TCON", zzetVar);
                        } else if (i17 == 6779504) {
                            zzaoVarZzd = zzd(iZzB, "TIT1", zzetVar);
                        } else if (i17 == 7173742) {
                            zzaoVarZzd = zzd(iZzB, "MVNM", zzetVar);
                        } else if (i17 == 7173737) {
                            zzaoVarZzd = zze(iZzB, "MVIN", zzetVar, true, false);
                        } else {
                            String strZze2 = zzfz.zze(iZzB);
                            StringBuilder sb4 = new StringBuilder(strZze2.length() + 32);
                            sb4.append(str2);
                            sb4.append(strZze2);
                            zzeg.zza("MetadataUtil", sb4.toString());
                        }
                    } else {
                        zzaoVarZzd = zzd(iZzB, "TCOM", zzetVar);
                    }
                } else {
                    zzaoVarZzd = zzd(iZzB, "TIT2", zzetVar);
                }
            }
            zzetVar.zzh(iZzg);
            return zzaoVarZzd;
        } catch (Throwable th) {
            zzetVar.zzh(iZzg);
            throw th;
        }
    }
}

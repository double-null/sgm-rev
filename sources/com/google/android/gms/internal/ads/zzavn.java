package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzavn implements zzawe {
    public static final /* synthetic */ zzavn zza;
    public static final /* synthetic */ zzavn zzb;
    public static final /* synthetic */ zzavn zzc;
    public static final /* synthetic */ zzavn zzd;
    public static final /* synthetic */ zzavn zze;
    public static final /* synthetic */ zzavn zzf;
    public static final /* synthetic */ zzavn zzg;
    public static final /* synthetic */ zzavn zzh;
    public static final /* synthetic */ zzavn zzi;
    public static final /* synthetic */ zzavn zzj;
    public static final /* synthetic */ zzavn zzk;
    public static final /* synthetic */ zzavn zzl;
    public static final /* synthetic */ zzavn zzm;
    public static final /* synthetic */ zzavn zzn;
    public static final /* synthetic */ zzavn zzo;
    public static final /* synthetic */ zzavn zzp;
    private final /* synthetic */ int zzq;

    static {
        int[] iArr = {1566288819, 1018167620, 793479703, 284165456, 1648575546, -1602978314, 292218004, 846942590, 524688209};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 12895151;
        iArr[1] = 1277237303;
        iArr[2] = 185162640;
        iArr[3] = 1411547303;
        iArr[4] = 306429832;
        iArr[5] = -1705725298;
        iArr[6] = 1113502215;
        iArr[7] = 1498617647;
        iArr[8] = 669908538;
        iArr[0] = 70788355;
        iArr[1] = 1377181904;
        iArr[2] = 713084892;
        iArr[3] = 1410740224;
        iArr[4] = 99160279;
        iArr[5] = -2098040901;
        iArr[6] = 241909610;
        iArr[7] = 1156541312;
        iArr[8] = 318561886;
        iArr[0] = 358984857;
        iArr[1] = 11257432;
        iArr[2] = 369424399;
        iArr[3] = 615188052;
        iArr[4] = 873771151;
        iArr[5] = 1734030319;
        iArr[6] = 488663950;
        iArr[7] = 1985433483;
        iArr[8] = 395279207;
        int i18 = (488663950 + ((((11257432 & (~358984857)) | 369424399) + ((358984857 & 615188052) | 873771151)) - 1734030319)) ^ (1985433483 % 395279207);
        iArr[0] = 1460082195;
        iArr[1] = 849562858;
        iArr[2] = 543970048;
        iArr[3] = 381881578;
        iArr[4] = 1279262981;
        iArr[5] = 1927825639;
        iArr[6] = 55241220;
        iArr[7] = 1122336503;
        iArr[8] = 861109485;
        iArr[0] = 279121308;
        iArr[1] = 136482862;
        iArr[2] = 293951273;
        iArr[3] = 1302561302;
        iArr[4] = 1440046744;
        iArr[5] = 2103257287;
        iArr[6] = 245798898;
        iArr[7] = 1404515797;
        iArr[8] = 695748720;
        iArr[0] = 1889804310;
        iArr[1] = 69748745;
        iArr[2] = 707083896;
        iArr[3] = 604795185;
        iArr[4] = 951435262;
        iArr[5] = 1438069009;
        iArr[6] = 153968086;
        iArr[7] = 1663080928;
        iArr[8] = 610506582;
        iArr[0] = 1402492972;
        iArr[1] = 1009329808;
        iArr[2] = 1643537068;
        iArr[3] = 503911450;
        iArr[4] = 580170602;
        iArr[5] = -1906091398;
        iArr[6] = 230124900;
        iArr[7] = 1489001354;
        iArr[8] = 953691761;
        int i19 = (230124900 + (((((~1402492972) & 1009329808) | 1643537068) + ((1402492972 & 503911450) | 580170602)) - (-1906091398))) ^ (1489001354 % 953691761);
        iArr[0] = 1953161956;
        iArr[1] = 2021553924;
        iArr[2] = 1308628610;
        iArr[3] = 813590916;
        iArr[4] = 134225131;
        iArr[5] = -1689272644;
        iArr[6] = 530788967;
        iArr[7] = 1172063133;
        iArr[8] = 990526343;
        iArr[0] = 1666231349;
        iArr[1] = 289538432;
        iArr[2] = 621649449;
        iArr[3] = 406985104;
        iArr[4] = 264059443;
        iArr[5] = 1150383422;
        iArr[6] = 56528119;
        iArr[7] = 1698487330;
        iArr[8] = 272312086;
        iArr[0] = 1389079342;
        iArr[1] = 405954790;
        iArr[2] = 5768193;
        iArr[3] = 967468022;
        iArr[4] = 1640566552;
        iArr[5] = 1700701810;
        iArr[6] = 82691308;
        iArr[7] = 1588695568;
        iArr[8] = 1155465115;
        iArr[0] = 1540846267;
        iArr[1] = 571107379;
        iArr[2] = 1484708373;
        iArr[3] = 709108258;
        iArr[4] = 1568035525;
        iArr[5] = -642115705;
        iArr[6] = 192048860;
        iArr[7] = 2037335344;
        iArr[8] = 1874960596;
        int i20 = (82691308 + ((((405954790 & (~1389079342)) | 5768193) + ((1389079342 & 967468022) | 1640566552)) - 1700701810)) ^ (1588695568 % 1155465115);
        int i21 = (56528119 + ((((289538432 & (~1666231349)) | 621649449) + ((1666231349 & 406985104) | 264059443)) - 1150383422)) ^ (1698487330 % 272312086);
        int i22 = (530788967 + ((((2021553924 & (~1953161956)) | 1308628610) + ((1953161956 & 813590916) | 134225131)) - (-1689272644))) ^ (1172063133 % 990526343);
        int i23 = (153968086 + (((((~1889804310) & 69748745) | 707083896) + ((1889804310 & 604795185) | 951435262)) - 1438069009)) ^ (1663080928 % 610506582);
        int i24 = (245798898 + (((((~279121308) & 136482862) | 293951273) + ((279121308 & 1302561302) | 1440046744)) - 2103257287)) ^ (1404515797 % 695748720);
        int i25 = (55241220 + ((((849562858 & (~1460082195)) | 543970048) + ((1460082195 & 381881578) | 1279262981)) - 1927825639)) ^ (1122336503 % 861109485);
        int i26 = (241909610 + ((((1377181904 & (~70788355)) | 713084892) + ((70788355 & 1410740224) | 99160279)) - (-2098040901))) ^ (1156541312 % 318561886);
        int i27 = (1113502215 + ((((1277237303 & (~12895151)) | 185162640) + ((12895151 & 1411547303) | 306429832)) - (-1705725298))) ^ (1498617647 % 669908538);
        int i28 = (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 524688209);
        int i29 = (192048860 + ((((571107379 & (~1540846267)) | 1484708373) + ((1540846267 & 709108258) | 1568035525)) - (-642115705))) ^ (2037335344 % 1874960596);
        iArr[0] = 464837581;
        iArr[1] = 1181588952;
        iArr[2] = 603091067;
        iArr[3] = 1544523140;
        iArr[4] = 967967255;
        iArr[5] = -2021501120;
        iArr[6] = 102524643;
        iArr[7] = 1295815494;
        iArr[8] = 753959819;
        iArr[0] = 1245644428;
        iArr[1] = 268473430;
        iArr[2] = 2019232319;
        iArr[3] = 2266696;
        iArr[4] = 1693582250;
        iArr[5] = -820691478;
        iArr[6] = 6902638;
        iArr[7] = 1308581515;
        iArr[8] = 354367395;
        zzp = new zzavn((6902638 + (((((~1245644428) & 268473430) | 2019232319) + ((1245644428 & 2266696) | 1693582250)) - (-820691478))) ^ (1308581515 % 354367395));
        zzo = new zzavn((102524643 + (((((~464837581) & 1181588952) | 603091067) + ((464837581 & 1544523140) | 967967255)) - (-2021501120))) ^ (1295815494 % 753959819));
        zzn = new zzavn(i29);
        zzm = new zzavn(i20);
        zzl = new zzavn(i21);
        zzk = new zzavn(i22);
        zzj = new zzavn(i19);
        zzi = new zzavn(i23);
        zzh = new zzavn(i24);
        zzg = new zzavn(i25);
        zzf = new zzavn(i18);
        zze = new zzavn(i26);
        zzd = new zzavn(i27);
        zzc = new zzavn(i28);
        zzb = new zzavn(1);
        zza = new zzavn(0);
    }

    private /* synthetic */ zzavn(int i10) {
        this.zzq = i10;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzauw zzauwVar;
        zzawd zzawdVar;
        zzawm zzawmVarZzd;
        zzawd zzawdVar2;
        zzawm zzawmVarZzb;
        zzawd zzawdVar3;
        zzawm zzawmVarZzd2;
        zzawm zzawmVarZzc;
        int[] iArr = {603123090, 1079339320, 204100681, 1131784560, 52466888, 1421285553, 105108813, 1216803069, 33252481};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15);
        int i19 = i17 % 33252481;
        try {
            try {
                try {
                    try {
                        try {
                            switch (this.zzq) {
                                case 0:
                                    return ((zzawh) obj).zza();
                                case 1:
                                    try {
                                        zzawd zzawdVar4 = ((zzawh) obj).zzb;
                                        long jZzm = zzawdVar4.zzc().zzm();
                                        zzawm zzawmVarZzc2 = zzawdVar4.zzc();
                                        List listZzo = zzawmVarZzc2.zzo();
                                        if (jZzm < 0) {
                                            jZzm += (long) listZzo.size();
                                        }
                                        if (jZzm < 0 || jZzm >= listZzo.size()) {
                                            throw new zzawk();
                                        }
                                        listZzo.remove((int) jZzm);
                                        zzawdVar4.zzb(zzawmVarZzc2);
                                        return Optional.empty();
                                    } catch (zzawk unused) {
                                        zzauwVar = zzauw.zzI;
                                        return Optional.of(zzauwVar);
                                    }
                                case 2:
                                    zzawh zzawhVar = (zzawh) obj;
                                    zzawd zzawdVar5 = zzawhVar.zzb;
                                    zzawm zzawmVarZzc3 = zzawdVar5.zzc();
                                    zzavq zzavqVarZzn = zzawdVar5.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzawmVarZzc3.zzk(byteArrayOutputStream);
                                    zzavq zzavqVarZzd = zzavqVarZzn.zzd(zzavq.zze(byteArrayOutputStream.toByteArray()));
                                    zzawdVar = zzawhVar.zzb;
                                    zzawmVarZzd = zzawm.zzd(zzavqVarZzd);
                                    zzawdVar.zzb(zzawmVarZzd);
                                    return Optional.empty();
                                case 3:
                                    zzawh zzawhVar2 = (zzawh) obj;
                                    zzawd zzawdVar6 = zzawhVar2.zzb;
                                    zzawm zzawmVarZzc4 = zzawdVar6.zzc();
                                    zzavq zzavqVarZzn2 = zzawdVar6.zzc().zzn();
                                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    zzavm.zzb(zzawmVarZzc4.zzm(), new zzawl(byteArrayOutputStream2, i18 ^ i19), false);
                                    zzavq zzavqVarZzd2 = zzavqVarZzn2.zzd(zzavq.zze(byteArrayOutputStream2.toByteArray()));
                                    zzawdVar = zzawhVar2.zzb;
                                    zzawmVarZzd = zzawm.zzd(zzavqVarZzd2);
                                    zzawdVar.zzb(zzawmVarZzd);
                                    return Optional.empty();
                                case 4:
                                    zzawh zzawhVar3 = (zzawh) obj;
                                    zzawhVar3.zzb.zze(-(zzawhVar3.zzc.zzb().zzb + zzawhVar3.zzd.zze()), zzawhVar3.zzb.zzc());
                                    return Optional.empty();
                                case 5:
                                    zzawdVar2 = ((zzawh) obj).zzb;
                                    zzawmVarZzb = zzawm.zzb(zzawdVar2.zzc().zzm() << ((int) zzawdVar2.zzc().zzm()));
                                    zzawdVar2.zzb(zzawmVarZzb);
                                    return Optional.empty();
                                case 6:
                                    zzawdVar2 = ((zzawh) obj).zzb;
                                    zzawmVarZzb = zzawm.zzb(zzawdVar2.zzc().zzm() >>> ((int) zzawdVar2.zzc().zzm()));
                                    zzawdVar2.zzb(zzawmVarZzb);
                                    return Optional.empty();
                                case 7:
                                    zzawdVar2 = ((zzawh) obj).zzb;
                                    zzawmVarZzb = zzawm.zzc(zzawdVar2.zzc().zzq() - zzawdVar2.zzc().zzq());
                                    zzawdVar2.zzb(zzawmVarZzb);
                                    return Optional.empty();
                                case 8:
                                    zzawdVar2 = ((zzawh) obj).zzb;
                                    zzawmVarZzb = zzawm.zzb(zzawdVar2.zzc().zzm() - zzawdVar2.zzc().zzm());
                                    zzawdVar2.zzb(zzawmVarZzb);
                                    return Optional.empty();
                                case 9:
                                    zzawh zzawhVar4 = (zzawh) obj;
                                    zzawd zzawdVar7 = zzawhVar4.zzb;
                                    long jZzm2 = zzawdVar7.zzc().zzm();
                                    zzawm zzawmVarZzc5 = zzawdVar7.zzc();
                                    zzawdVar3 = zzawhVar4.zzb;
                                    zzawmVarZzd2 = zzawdVar3.zzd(jZzm2);
                                    zzawdVar3.zze(jZzm2, zzawmVarZzc5);
                                    zzawdVar3.zzb(zzawmVarZzd2);
                                    return Optional.empty();
                                case 10:
                                    zzawh zzawhVar5 = (zzawh) obj;
                                    zzawd zzawdVar8 = zzawhVar5.zzb;
                                    long jZzm3 = zzawhVar5.zzc.zzb().zzb + zzawdVar8.zzc().zzm();
                                    zzawm zzawmVarZzc6 = zzawdVar8.zzc();
                                    zzawdVar3 = zzawhVar5.zzb;
                                    long j10 = -jZzm3;
                                    zzawmVarZzd2 = zzawdVar3.zzd(j10);
                                    zzawdVar3.zze(j10, zzawmVarZzc6);
                                    zzawdVar3.zzb(zzawmVarZzd2);
                                    return Optional.empty();
                                case 11:
                                    zzawh zzawhVar6 = (zzawh) obj;
                                    long jZze = zzawhVar6.zzc.zzb().zzb + zzawhVar6.zzd.zze();
                                    zzawm zzawmVarZzc7 = zzawhVar6.zzb.zzc();
                                    zzawdVar3 = zzawhVar6.zzb;
                                    long j11 = -jZze;
                                    zzawmVarZzd2 = zzawdVar3.zzd(j11);
                                    zzawdVar3.zze(j11, zzawmVarZzc7);
                                    zzawdVar3.zzb(zzawmVarZzd2);
                                    return Optional.empty();
                                case 12:
                                    zzawh zzawhVar7 = (zzawh) obj;
                                    long jZzm4 = zzawhVar7.zzb.zzc().zzm();
                                    try {
                                        zzawd zzawdVar9 = zzawhVar7.zzb;
                                        iArr[0] = 1349029729;
                                        iArr[1] = 1683806466;
                                        iArr[2] = 298308136;
                                        iArr[3] = -199751405;
                                        iArr[4] = -1830723495;
                                        iArr[5] = 459474285;
                                        iArr[6] = 21152635;
                                        iArr[7] = 1478326644;
                                        iArr[8] = 593443203;
                                        int i20 = 21152635 + (((((~1349029729) & 1683806466) | 298308136) + ((1349029729 & (-199751405)) | (-1830723495))) - 459474285);
                                        int i21 = 1478326644 % 593443203;
                                        if (jZzm4 == 0) {
                                            zzawmVarZzc = zzawdVar9.zzc();
                                        } else {
                                            int iZza = zzawdVar9.zza(jZzm4);
                                            zzawdVar9.zzb += i20 ^ i21;
                                            zzawmVarZzc = (zzawm) zzawdVar9.zza.remove(iZza);
                                        }
                                        zzawdVar9.zzb(zzawmVarZzc);
                                        return Optional.empty();
                                    } catch (zzawb unused2) {
                                        zzauwVar = zzauw.zzg;
                                        return Optional.of(zzauwVar);
                                    }
                                case 13:
                                    zzawh zzawhVar8 = (zzawh) obj;
                                    try {
                                        zzawd zzawdVar10 = zzawhVar8.zzb;
                                        long jZzm5 = zzawdVar10.zzc().zzm();
                                        long jZzm6 = zzawdVar10.zzc().zzm();
                                        zzawa zzawaVar = zzawhVar8.zzc;
                                        zzavv zzavvVar = zzawhVar8.zzd;
                                        zzawaVar.zza(zzavvVar.zzb(), jZzm6, zzawaVar.zzb().zzb);
                                        zzavvVar.zza(jZzm5);
                                        return Optional.empty();
                                    } catch (zzavt | zzavu unused3) {
                                        zzauwVar = zzauw.zzr;
                                        return Optional.of(zzauwVar);
                                    } catch (zzavy unused4) {
                                        zzauwVar = zzauw.zzB;
                                        return Optional.of(zzauwVar);
                                    } catch (zzavz unused5) {
                                        zzauwVar = zzauw.zzw;
                                        return Optional.of(zzauwVar);
                                    }
                                case 14:
                                    zzawh zzawhVar9 = (zzawh) obj;
                                    try {
                                        zzawhVar9.zzb.zzb(zzawm.zzg(zzawhVar9.zzb.zzc().zzl()));
                                        return Optional.empty();
                                    } catch (zzawj unused6) {
                                        zzauwVar = zzauw.zzp;
                                        return Optional.of(zzauwVar);
                                    }
                                default:
                                    try {
                                        zzawd zzawdVar11 = ((zzawh) obj).zzb;
                                        Iterator it = zzawdVar11.zzc().zzo().iterator();
                                        while (it.hasNext()) {
                                            zzawdVar11.zzb((zzawm) it.next());
                                        }
                                        return Optional.empty();
                                    } catch (zzawc unused7) {
                                        zzauwVar = zzauw.zza;
                                        return Optional.of(zzauwVar);
                                    }
                            }
                        } catch (zzawc e10) {
                            e = e10;
                            throw new AssertionError(zzavo.zza("CEiv6BFfPnitUE+D"), e);
                        }
                    } catch (zzavz | zzawb unused8) {
                        zzauwVar = zzauw.zzx;
                    }
                } catch (zzavs | zzavu | zzawj unused9) {
                    zzauwVar = zzauw.zzy;
                }
            } catch (zzawb unused10) {
                zzauwVar = zzauw.zzh;
            }
        } catch (zzawj unused11) {
            zzauwVar = zzauw.zzk;
        } catch (IOException e11) {
            e = e11;
            throw new AssertionError(zzavo.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}

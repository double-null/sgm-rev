package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzavj implements zzawe {
    public static final /* synthetic */ zzavj zza;
    public static final /* synthetic */ zzavj zzb;
    public static final /* synthetic */ zzavj zzc;
    public static final /* synthetic */ zzavj zzd;
    public static final /* synthetic */ zzavj zze;
    public static final /* synthetic */ zzavj zzf;
    public static final /* synthetic */ zzavj zzg;
    public static final /* synthetic */ zzavj zzh;
    public static final /* synthetic */ zzavj zzi;
    public static final /* synthetic */ zzavj zzj;
    public static final /* synthetic */ zzavj zzk;
    public static final /* synthetic */ zzavj zzl;
    public static final /* synthetic */ zzavj zzm;
    public static final /* synthetic */ zzavj zzn;
    public static final /* synthetic */ zzavj zzo;
    public static final /* synthetic */ zzavj zzp;
    public static final /* synthetic */ zzavj zzq;
    public static final /* synthetic */ zzavj zzr;
    public static final /* synthetic */ zzavj zzs;
    public static final /* synthetic */ zzavj zzt;
    public static final /* synthetic */ zzavj zzu;
    private final /* synthetic */ int zzv;

    static {
        int[] iArr = {1424268980, 433259076, 136627722, 299303110, 33824130, 606102243, 157354814, 1129566413, 184803526};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        iArr[0] = 1194953865;
        iArr[1] = 541827704;
        iArr[2] = 1410336387;
        iArr[3] = 676044922;
        iArr[4] = 221517442;
        iArr[5] = -1933377539;
        iArr[6] = 270744729;
        iArr[7] = 485560280;
        iArr[8] = 402724286;
        iArr[0] = 2077486715;
        iArr[1] = 1348527492;
        iArr[2] = 196553360;
        iArr[3] = 1547749134;
        iArr[4] = 218380923;
        iArr[5] = -1556363273;
        iArr[6] = 1117142618;
        iArr[7] = 1713258270;
        iArr[8] = 1573363368;
        iArr[0] = 1272469786;
        iArr[1] = 1097507524;
        iArr[2] = 723881402;
        iArr[3] = 1078604356;
        iArr[4] = 746642480;
        iArr[5] = -897741623;
        iArr[6] = 933110197;
        iArr[7] = 1544617505;
        iArr[8] = 243268139;
        int i18 = (933110197 + ((((1097507524 & (~1272469786)) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-897741623))) ^ (1544617505 % 243268139);
        iArr[0] = 2058657199;
        iArr[1] = 1077280871;
        iArr[2] = 426331554;
        iArr[3] = 1242960213;
        iArr[4] = 260153146;
        iArr[5] = 1989324759;
        iArr[6] = 535343610;
        iArr[7] = 711845894;
        iArr[8] = 404158660;
        iArr[0] = 1635905385;
        iArr[1] = 436500164;
        iArr[2] = 1627617040;
        iArr[3] = 1527677388;
        iArr[4] = 1092341018;
        iArr[5] = -139815355;
        iArr[6] = 1111783898;
        iArr[7] = 1253207672;
        iArr[8] = 570073850;
        iArr[0] = 1280321648;
        iArr[1] = 1509448282;
        iArr[2] = 1074834725;
        iArr[3] = 434689663;
        iArr[4] = 67544101;
        iArr[5] = 2051242917;
        iArr[6] = 654558235;
        iArr[7] = 1309383303;
        iArr[8] = 1129033333;
        iArr[0] = 1722060049;
        iArr[1] = 1087578905;
        iArr[2] = 70644109;
        iArr[3] = 1625428690;
        iArr[4] = 673239279;
        iArr[5] = -1074846867;
        iArr[6] = 1472576335;
        iArr[7] = 860516127;
        iArr[8] = 777720504;
        int i19 = (1472576335 + (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - (-1074846867))) ^ (860516127 % 777720504);
        iArr[0] = 2137100237;
        iArr[1] = 243279585;
        iArr[2] = 1476690352;
        iArr[3] = 1182836297;
        iArr[4] = 1215531406;
        iArr[5] = -1307577232;
        iArr[6] = 478034945;
        iArr[7] = 1251300606;
        iArr[8] = 959372260;
        iArr[0] = 257675105;
        iArr[1] = 286888065;
        iArr[2] = 1680106172;
        iArr[3] = 353998857;
        iArr[4] = 216033710;
        iArr[5] = -1837632293;
        iArr[6] = 282938351;
        iArr[7] = 2033505236;
        iArr[8] = 29777560;
        iArr[0] = 406011017;
        iArr[1] = 1269108768;
        iArr[2] = 73167649;
        iArr[3] = 2074166272;
        iArr[4] = 872470299;
        iArr[5] = -1892503949;
        iArr[6] = 524305153;
        iArr[7] = 1615935710;
        iArr[8] = 639806732;
        iArr[0] = 168057522;
        iArr[1] = 567809569;
        iArr[2] = 2007585082;
        iArr[3] = 1112917761;
        iArr[4] = 1200484666;
        iArr[5] = -1571978753;
        iArr[6] = 181271232;
        iArr[7] = 1761250573;
        iArr[8] = 1089653714;
        int i20 = (181271232 + ((((567809569 & (~168057522)) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1571978753))) ^ (1761250573 % 1089653714);
        iArr[0] = 1687776787;
        iArr[1] = 1627592001;
        iArr[2] = 771768986;
        iArr[3] = 1226806633;
        iArr[4] = 136094264;
        iArr[5] = 2011805892;
        iArr[6] = 101323875;
        iArr[7] = 992028067;
        iArr[8] = 180785147;
        iArr[0] = 627992393;
        iArr[1] = 399075139;
        iArr[2] = 1263590114;
        iArr[3] = 1418280193;
        iArr[4] = 1644468862;
        iArr[5] = -1231608040;
        iArr[6] = 270754552;
        iArr[7] = 1449228398;
        iArr[8] = 989241888;
        iArr[0] = 386839851;
        iArr[1] = 502322088;
        iArr[2] = 1879579687;
        iArr[3] = 1341449096;
        iArr[4] = 1376723987;
        iArr[5] = -1336833132;
        iArr[6] = 467350160;
        iArr[7] = 2118801173;
        iArr[8] = 1119399015;
        iArr[0] = 1111088131;
        iArr[1] = 1881672142;
        iArr[2] = 1222111317;
        iArr[3] = 807995786;
        iArr[4] = 38123124;
        iArr[5] = 1582432229;
        iArr[6] = 74248348;
        iArr[7] = 1348361729;
        iArr[8] = 788380902;
        int i21 = (467350160 + ((((502322088 & (~386839851)) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1336833132))) ^ (2118801173 % 1119399015);
        int i22 = (270754552 + ((((399075139 & (~627992393)) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1231608040))) ^ (1449228398 % 989241888);
        int i23 = (101323875 + ((((1627592001 & (~1687776787)) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 2011805892)) ^ (992028067 % 180785147);
        int i24 = (74248348 + ((((1881672142 & (~1111088131)) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1582432229)) ^ (1348361729 % 788380902);
        iArr[0] = 1374600938;
        iArr[1] = 269492393;
        iArr[2] = 962980710;
        iArr[3] = -2079309685;
        iArr[4] = -1096234186;
        iArr[5] = -75177426;
        iArr[6] = 649785905;
        iArr[7] = 1587992726;
        iArr[8] = 995234140;
        iArr[0] = 338346092;
        iArr[1] = 646267944;
        iArr[2] = 2030210865;
        iArr[3] = 109431182;
        iArr[4] = 1768591350;
        iArr[5] = -955070129;
        iArr[6] = 1725019;
        iArr[7] = 1912163036;
        iArr[8] = 671068506;
        iArr[0] = 636453333;
        iArr[1] = 363983206;
        iArr[2] = 1075208291;
        iArr[3] = 2146013964;
        iArr[4] = 1783382730;
        iArr[5] = -364134615;
        iArr[6] = 775056794;
        iArr[7] = 1564003050;
        iArr[8] = 99885196;
        zzu = new zzavj((775056794 + (((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-364134615))) ^ (1564003050 % 99885196));
        zzt = new zzavj((1725019 + (((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-955070129))) ^ (1912163036 % 671068506));
        zzs = new zzavj((649785905 + (((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-75177426))) ^ (1587992726 % 995234140));
        zzr = new zzavj(i24);
        zzq = new zzavj(i21);
        zzp = new zzavj(i22);
        zzavj zzavjVar = new zzavj(i23);
        int i25 = (524305153 + ((((1269108768 & (~406011017)) | 73167649) + ((406011017 & 2074166272) | 872470299)) - (-1892503949))) ^ (1615935710 % 639806732);
        int i26 = (282938351 + ((((286888065 & (~257675105)) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-1837632293))) ^ (2033505236 % 29777560);
        int i27 = (478034945 + ((((243279585 & (~2137100237)) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1307577232))) ^ (1251300606 % 959372260);
        int i28 = (654558235 + (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 2051242917)) ^ (1309383303 % 1129033333);
        int i29 = (1111783898 + (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-139815355))) ^ (1253207672 % 570073850);
        int i30 = (535343610 + ((((1077280871 & (~2058657199)) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1989324759)) ^ (711845894 % 404158660);
        int i31 = (1117142618 + ((((1348527492 & (~2077486715)) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - (-1556363273))) ^ (1713258270 % 1573363368);
        int i32 = (270744729 + ((((541827704 & (~1194953865)) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - (-1933377539))) ^ (485560280 % 402724286);
        int i33 = (i16 + ((((i11 & (~i10)) | i12) + ((i10 & i13) | i14)) - i15)) ^ (i17 % 184803526);
        zzo = zzavjVar;
        zzn = new zzavj(i20);
        zzm = new zzavj(i25);
        zzl = new zzavj(i26);
        zzk = new zzavj(i27);
        zzj = new zzavj(i19);
        zzi = new zzavj(i28);
        zzh = new zzavj(i29);
        zzg = new zzavj(i30);
        zzf = new zzavj(i18);
        zze = new zzavj(i31);
        zzd = new zzavj(i32);
        zzc = new zzavj(i33);
        zzb = new zzavj(1);
        zza = new zzavj(0);
    }

    private /* synthetic */ zzavj(int i10) {
        this.zzv = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x0125 A[Catch: zzawc -> 0x0098, ClassNotFoundException -> 0x0131, zzawj -> 0x0135, zzavz | zzawb -> 0x0567, TryCatch #4 {zzawc -> 0x0098, blocks: (B:199:0x056f, B:205:0x058d, B:207:0x0595, B:210:0x059f, B:212:0x05a8, B:226:0x061e, B:213:0x05b1, B:214:0x05b6, B:215:0x05b7, B:218:0x05e3, B:219:0x05e8, B:223:0x05f1, B:225:0x05f9, B:227:0x0623, B:228:0x0628, B:230:0x062a, B:6:0x003b, B:7:0x004b, B:9:0x0051, B:11:0x005f, B:12:0x0061, B:13:0x0067, B:14:0x006e, B:16:0x0086, B:17:0x0089, B:25:0x00ab, B:30:0x00ca, B:64:0x0129, B:34:0x00d5, B:38:0x00e0, B:42:0x00eb, B:46:0x00f6, B:50:0x0101, B:54:0x010c, B:58:0x0117, B:62:0x0122, B:63:0x0125, B:69:0x013d, B:73:0x0154, B:79:0x0178, B:80:0x0183, B:85:0x019e, B:89:0x01b8, B:97:0x01e1, B:99:0x01f7, B:100:0x01f9, B:101:0x01ff, B:102:0x0204, B:105:0x020c, B:107:0x0224, B:108:0x0227, B:125:0x0357, B:148:0x03f5, B:150:0x03fd, B:154:0x0409, B:155:0x040f, B:156:0x0414, B:157:0x041b, B:167:0x045a, B:170:0x0477, B:173:0x04b8, B:176:0x04ce, B:187:0x050e, B:188:0x0528, B:191:0x0530, B:194:0x054c), top: B:238:0x000a }] */
    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        zzauw zzauwVar;
        zzawd zzawdVar;
        zzawm zzawmVarZzb;
        zzawd zzawdVar2;
        zzawm zzawmVarZzb2;
        zzawd zzawdVar3;
        zzawm zzawmVarZza;
        zzauw zzauwVar2;
        zzawd zzawdVar4;
        zzawm zzawmVarZzj;
        Class<?> cls;
        zzauw zzauwVar3;
        long j10 = 1;
        int i10 = 0;
        try {
            try {
                try {
                    try {
                        switch (this.zzv) {
                            case 0:
                                zzawdVar = ((zzawh) obj).zzb;
                                zzawmVarZzb = zzawm.zzb(zzawdVar.zzc().zzm() + zzawdVar.zzc().zzm());
                                zzawdVar.zzb(zzawmVarZzb);
                                return Optional.empty();
                            case 1:
                                zzawdVar = ((zzawh) obj).zzb;
                                zzawmVarZzb = zzawm.zzc(zzawdVar.zzc().zzq() + zzawdVar.zzc().zzq());
                                zzawdVar.zzb(zzawmVarZzb);
                                return Optional.empty();
                            case 2:
                                zzawdVar = ((zzawh) obj).zzb;
                                zzawmVarZzb = zzawm.zzd(zzawdVar.zzc().zzn().zzd(zzawdVar.zzc().zzn()));
                                zzawdVar.zzb(zzawmVarZzb);
                                return Optional.empty();
                            case 3:
                                zzawh zzawhVar = (zzawh) obj;
                                try {
                                    long jZze = zzawhVar.zzd.zze();
                                    for (long j11 = 0; j11 < jZze; j11++) {
                                        zzawhVar.zzb.zzb(zzawm.zza(null));
                                    }
                                    return Optional.empty();
                                } catch (zzawc unused) {
                                    zzauwVar = zzauw.zza;
                                    return Optional.of(zzauwVar);
                                }
                            case 4:
                                zzawdVar2 = ((zzawh) obj).zzb;
                                zzawmVarZzb2 = zzawm.zzb(zzawdVar2.zzc().zzm() & zzawdVar2.zzc().zzm());
                                zzawdVar2.zzb(zzawmVarZzb2);
                                return Optional.empty();
                            case 5:
                                long j12 = 6538657 + (((((~916768482L) & 1259538933) | 805446160) + ((916768482 & (-15648283)) | (-1266372608))) - 883303887);
                                long j13 = 384868448 % 102194872;
                                zzawdVar2 = ((zzawh) obj).zzb;
                                zzawmVarZzb2 = zzawm.zzb((j12 ^ j13) ^ zzawdVar2.zzc().zzm());
                                zzawdVar2.zzb(zzawmVarZzb2);
                                return Optional.empty();
                            case 6:
                                zzawdVar2 = ((zzawh) obj).zzb;
                                zzawmVarZzb2 = zzawm.zzb(zzawdVar2.zzc().zzm() | zzawdVar2.zzc().zzm());
                                zzawdVar2.zzb(zzawmVarZzb2);
                                return Optional.empty();
                            case 7:
                                zzawdVar2 = ((zzawh) obj).zzb;
                                zzawmVarZzb2 = zzawm.zzb(zzawdVar2.zzc().zzm() ^ zzawdVar2.zzc().zzm());
                                zzawdVar2.zzb(zzawmVarZzb2);
                                return Optional.empty();
                            case 8:
                                zzawh zzawhVar2 = (zzawh) obj;
                                try {
                                    zzawd zzawdVar5 = zzawhVar2.zzb;
                                    long jZzm = zzawdVar5.zzc().zzm();
                                    zzawa zzawaVar = zzawhVar2.zzc;
                                    zzavv zzavvVar = zzawhVar2.zzd;
                                    zzawaVar.zza(zzavvVar.zzb(), 0L, zzawdVar5.zzb);
                                    zzavvVar.zza(jZzm);
                                    return Optional.empty();
                                } catch (zzavt | zzavu unused2) {
                                    zzauwVar = zzauw.zzr;
                                    return Optional.of(zzauwVar);
                                } catch (zzavy unused3) {
                                    zzauwVar = zzauw.zzB;
                                    return Optional.of(zzauwVar);
                                }
                            case 9:
                                zzawh zzawhVar3 = (zzawh) obj;
                                try {
                                    zzawd zzawdVar6 = zzawhVar3.zzb;
                                    long jZzm2 = zzawdVar6.zzc().zzm();
                                    List listZzo = zzawdVar6.zzc().zzo();
                                    int size = listZzo.size();
                                    Object objZzh = zzawdVar6.zzc().zzh();
                                    Object objZzl = zzawdVar6.zzc().zzl();
                                    if (objZzl instanceof Method) {
                                        Method method = (Method) objZzl;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (objZzh instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) objZzh).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                List listZzo2 = ((zzawm) listZzo.get(0)).zzo();
                                                if (listZzo2.size() == length) {
                                                    for (int i11 = 0; i11 < listZzo2.size(); i11++) {
                                                        objArr2[i11] = ((zzawm) listZzo2.get(i11)).zzi(parameterTypes2[i11]);
                                                    }
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                while (i10 < size) {
                                                    objArr[i10] = ((zzawm) listZzo.get(i10)).zzi(parameterTypes[i10]);
                                                    i10++;
                                                }
                                            }
                                            try {
                                                Object objInvoke = method.invoke(objZzh, objArr);
                                                if (method.getReturnType() == Void.class || method.getReturnType() == Void.TYPE) {
                                                    zzawdVar3 = zzawhVar3.zzb;
                                                    zzawmVarZza = zzawm.zza(null);
                                                } else if (jZzm2 != 0) {
                                                    zzawdVar3 = zzawhVar3.zzb;
                                                    zzawmVarZza = zzawm.zzg(objInvoke);
                                                } else {
                                                    zzawdVar3 = zzawhVar3.zzb;
                                                    zzawmVarZza = zzawm.zza(objInvoke);
                                                }
                                                zzawdVar3.zzb(zzawmVarZza);
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                zzauwVar = zzauw.zzq;
                                                return Optional.of(zzauwVar);
                                            }
                                        }
                                    }
                                    return Optional.of(zzauw.zzp);
                                } catch (zzawj unused5) {
                                    zzauwVar = zzauw.zzp;
                                }
                                break;
                            case 10:
                                int i12 = 397101755 + (((((~2084546560) & 73475461) | 438076064) + ((2084546560 & 611428101) | 2023412224)) - (-1433220034));
                                int i13 = 1073781763 % 1003463633;
                                int i14 = 149822540 + (((((~461273879) & 107429921) | 378966045) + ((461273879 & 283197472) | 1937909388)) - (-2012085812));
                                int i15 = 1917305981 % 575705360;
                                zzawh zzawhVar4 = (zzawh) obj;
                                zzawd zzawdVar7 = zzawhVar4.zzb;
                                int intExact = Math.toIntExact(zzawdVar7.zzc().zzm());
                                zzavq zzavqVarZzn = zzawdVar7.zzc().zzn();
                                zzavq zzavqVarZzn2 = zzawdVar7.zzc().zzn();
                                if (zzavqVarZzn.zza.length != (i12 ^ i13)) {
                                    return Optional.of(zzauw.zzH);
                                }
                                int[] iArr = new int[i14 ^ i15];
                                ByteBuffer.wrap(zzavqVarZzn.zza()).asIntBuffer().get(iArr);
                                zzavi zzaviVar = new zzavi(intExact, iArr);
                                int i16 = 608109803 + (((((~1183912267) & 781500673) | 1683555012) + ((1183912267 & 180666625) | 541077750)) - (-1341878771));
                                int i17 = 1527793660 % 245277883;
                                int i18 = 91904737 + (((((~95266356) & 568641509) | 183483904) + ((95266356 & 553669093) | 504469010)) - 966284501);
                                int i19 = 2026478004 % 1659239833;
                                byte[] bArrZza = zzavqVarZzn2.zza();
                                int i20 = (224048977 + (((((~1787189168) & 1360184381) | 611517270) + ((1787189168 & 1426637867) | 612056018)) - 1995525908)) ^ (1821115873 % 1010014811);
                                byte[] bArr = new byte[i20];
                                int i21 = 0;
                                while (i21 < bArrZza.length) {
                                    if (i21 % i20 == 0) {
                                        zzaviVar.zza(i21 >>> (i16 ^ i17), bArr);
                                    } else if (i21 == 0) {
                                        i21 = 0;
                                        zzaviVar.zza(i21 >>> (i16 ^ i17), bArr);
                                    }
                                    int i22 = i18 ^ i19;
                                    bArrZza[i21] = (byte) (((bArrZza[i21] ^ bArr[i21 % i20]) << i22) >> i22);
                                    i21++;
                                }
                                zzawhVar4.zzb.zzb(zzawm.zzd(zzavq.zze(bArrZza)));
                                return Optional.empty();
                            case 11:
                                zzawdVar2 = ((zzawh) obj).zzb;
                                double dZzq = zzawdVar2.zzc().zzq();
                                double dZzq2 = zzawdVar2.zzc().zzq();
                                if (dZzq == 0.0d) {
                                    zzauwVar2 = zzauw.zzF;
                                    return Optional.of(zzauwVar2);
                                }
                                zzawmVarZzb2 = zzawm.zzc(dZzq2 / dZzq);
                                zzawdVar2.zzb(zzawmVarZzb2);
                                return Optional.empty();
                            case 12:
                                zzawdVar2 = ((zzawh) obj).zzb;
                                long jZzm3 = zzawdVar2.zzc().zzm();
                                long jZzm4 = zzawdVar2.zzc().zzm();
                                if (jZzm3 == 0) {
                                    zzauwVar2 = zzauw.zzF;
                                    return Optional.of(zzauwVar2);
                                }
                                zzawmVarZzb2 = zzawm.zzb(jZzm4 / jZzm3);
                                zzawdVar2.zzb(zzawmVarZzb2);
                                return Optional.empty();
                            case 13:
                                try {
                                    ((zzawh) obj).zzb.zzc();
                                    return Optional.empty();
                                } catch (zzawb unused6) {
                                    zzauwVar = zzauw.zzA;
                                    return Optional.of(zzauwVar);
                                }
                            case 14:
                                zzawh zzawhVar5 = (zzawh) obj;
                                long jZzm5 = zzawhVar5.zzb.zzc().zzm();
                                zzawd zzawdVar8 = zzawhVar5.zzb;
                                zzawdVar8.zzb(zzawm.zzj(zzawdVar8.zzd(jZzm5)));
                                return Optional.empty();
                            case 15:
                                zzawh zzawhVar6 = (zzawh) obj;
                                long jZzm6 = zzawhVar6.zzc.zzb().zzb + zzawhVar6.zzb.zzc().zzm();
                                zzawdVar4 = zzawhVar6.zzb;
                                zzawmVarZzj = zzawm.zzj(zzawdVar4.zzd(-jZzm6));
                                zzawdVar4.zzb(zzawmVarZzj);
                                return Optional.empty();
                            case 16:
                                zzawh zzawhVar7 = (zzawh) obj;
                                long jZze2 = zzawhVar7.zzc.zzb().zzb + zzawhVar7.zzd.zze();
                                zzawdVar4 = zzawhVar7.zzb;
                                zzawmVarZzj = zzawm.zzj(zzawdVar4.zzd(-jZze2));
                                zzawdVar4.zzb(zzawmVarZzj);
                                return Optional.empty();
                            case 17:
                                try {
                                    zzawd zzawdVar9 = ((zzawh) obj).zzb;
                                    if (new zzawi(true).compare(zzawdVar9.zzc(), zzawdVar9.zzc()) != 0) {
                                        j10 = 0;
                                    }
                                    zzawdVar9.zzb(zzawm.zzb(j10));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    zzauwVar = zzauw.zzd;
                                    return Optional.of(zzauwVar);
                                }
                            case 18:
                                try {
                                    zzawd zzawdVar10 = ((zzawh) obj).zzb;
                                    String strZzc = zzawdVar10.zzc().zzn().zzc();
                                    switch (strZzc) {
                                        case "double":
                                            cls = Double.TYPE;
                                            break;
                                        case "int":
                                            cls = Integer.TYPE;
                                            break;
                                        case "byte":
                                            cls = Byte.TYPE;
                                            break;
                                        case "char":
                                            cls = Character.TYPE;
                                            break;
                                        case "long":
                                            cls = Long.TYPE;
                                            break;
                                        case "void":
                                            cls = Void.TYPE;
                                            break;
                                        case "boolean":
                                            cls = Boolean.TYPE;
                                            break;
                                        case "float":
                                            cls = Float.TYPE;
                                            break;
                                        case "short":
                                            cls = Short.TYPE;
                                            break;
                                        default:
                                            cls = Class.forName(strZzc);
                                            break;
                                    }
                                    zzawdVar10.zzb(zzawm.zza(cls));
                                    return Optional.empty();
                                } catch (zzawj unused8) {
                                    zzauwVar = zzauw.zzl;
                                    return Optional.of(zzauwVar);
                                } catch (ClassNotFoundException unused9) {
                                    zzauwVar = zzauw.zzm;
                                    return Optional.of(zzauwVar);
                                }
                            case 19:
                                try {
                                    zzawd zzawdVar11 = ((zzawh) obj).zzb;
                                    List listZzo3 = zzawdVar11.zzc().zzo();
                                    Class<?>[] clsArr = new Class[listZzo3.size()];
                                    while (i10 < listZzo3.size()) {
                                        Object objZzl2 = ((zzawm) listZzo3.get(i10)).zzl();
                                        if (!(objZzl2 instanceof Class)) {
                                            zzauwVar3 = zzauw.zzn;
                                            return Optional.of(zzauwVar3);
                                        }
                                        clsArr[i10] = (Class) objZzl2;
                                        i10++;
                                    }
                                    String strZzc2 = zzawdVar11.zzc().zzn().zzc();
                                    Object objZzl3 = zzawdVar11.zzc().zzl();
                                    if (objZzl3 instanceof Class) {
                                        zzawdVar11.zzb(zzawm.zza(((Class) objZzl3).getMethod(strZzc2, clsArr)));
                                        return Optional.empty();
                                    }
                                    zzauwVar3 = zzauw.zzn;
                                    return Optional.of(zzauwVar3);
                                } catch (zzawj unused10) {
                                    zzauwVar = zzauw.zzn;
                                    return Optional.of(zzauwVar);
                                } catch (NoSuchMethodException unused11) {
                                    zzauwVar = zzauw.zzo;
                                    return Optional.of(zzauwVar);
                                } catch (SecurityException unused12) {
                                    zzauwVar = zzauw.zzC;
                                    return Optional.of(zzauwVar);
                                }
                            default:
                                int i23 = 68643968 + (((((~306851320) & 2040670728) | 1372152390) + ((306851320 & (-1473639347)) | (-2036492681))) - 312811060);
                                int i24 = 1764892438 % 764851988;
                                zzawd zzawdVar12 = ((zzawh) obj).zzb;
                                long jZzm7 = zzawdVar12.zzc().zzm();
                                zzawm zzawmVarZzc = zzawdVar12.zzc();
                                zzawm zzawmVarZzc2 = zzawdVar12.zzc();
                                int i25 = zzawmVarZzc2.zza;
                                int i26 = (i23 ^ i24) + i25;
                                if (i25 == 0) {
                                    throw null;
                                }
                                if (i26 == 3) {
                                    zzavq zzavqVarZzn3 = zzawmVarZzc2.zzn();
                                    int i27 = 365862802 + (((((~284327308) & 44384696) | 1708231444) + ((284327308 & 1647591593) | 1951966997)) - (-722584097));
                                    int i28 = 2085308422 % 531900034;
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) zzavqVarZzn3.zza.length;
                                    }
                                    if (zzawmVarZzc.zza != (i27 ^ i28)) {
                                        throw new zzawj();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < zzavqVarZzn3.zza.length) {
                                        char cCharAt = zzavqVarZzn3.zzc().charAt((int) jZzm7);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt).length());
                                        sb2.append(cCharAt);
                                        zzawmVarZzc = zzawm.zzd(zzavq.zzf(sb2.toString()));
                                    }
                                } else {
                                    if (i26 != 4) {
                                        throw new zzawj();
                                    }
                                    List listZzo4 = zzawmVarZzc2.zzo();
                                    if (jZzm7 < 0) {
                                        jZzm7 += (long) listZzo4.size();
                                    }
                                    if (jZzm7 >= 0 && jZzm7 < listZzo4.size()) {
                                        zzawmVarZzc = (zzawm) listZzo4.get((int) jZzm7);
                                    }
                                }
                                zzawdVar12.zzb(zzawmVarZzc);
                                return Optional.empty();
                        }
                    } catch (zzawc e10) {
                        throw new AssertionError(zzavo.zza("CEiv6BFfPnitUE+D"), e10);
                    }
                } catch (zzavz | zzawb unused13) {
                    zzauwVar = zzauw.zzx;
                }
            } catch (zzawb unused14) {
                zzauwVar = zzauw.zzf;
            }
        } catch (zzavs | zzavu | zzawj unused15) {
            zzauwVar = zzauw.zzy;
        }
    }
}

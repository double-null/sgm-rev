package com.google.android.gms.internal.measurement;

import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0187  */
    /* JADX WARN: Code duplicated, block: B:104:0x0191  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01de  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:110:0x0209  */
    /* JADX WARN: Code duplicated, block: B:112:0x021a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0234  */
    /* JADX WARN: Code duplicated, block: B:116:0x023e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0256  */
    /* JADX WARN: Code duplicated, block: B:119:0x0286  */
    /* JADX WARN: Code duplicated, block: B:121:0x0298  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:138:0x031d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0324  */
    /* JADX WARN: Code duplicated, block: B:143:0x0328 A[LOOP:0: B:142:0x0326->B:143:0x0328, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x033c  */
    /* JADX WARN: Code duplicated, block: B:147:0x034e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0362  */
    /* JADX WARN: Code duplicated, block: B:151:0x036e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0379  */
    /* JADX WARN: Code duplicated, block: B:155:0x0389  */
    /* JADX WARN: Code duplicated, block: B:156:0x039c  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x0403  */
    /* JADX WARN: Code duplicated, block: B:168:0x0413  */
    /* JADX WARN: Code duplicated, block: B:169:0x0420  */
    /* JADX WARN: Code duplicated, block: B:171:0x0432  */
    /* JADX WARN: Code duplicated, block: B:173:0x0448  */
    /* JADX WARN: Code duplicated, block: B:176:0x045c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0460  */
    /* JADX WARN: Code duplicated, block: B:181:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:183:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:184:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:187:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:188:0x0517  */
    /* JADX WARN: Code duplicated, block: B:189:0x051b  */
    /* JADX WARN: Code duplicated, block: B:192:0x052f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0545  */
    /* JADX WARN: Code duplicated, block: B:196:0x0548  */
    /* JADX WARN: Code duplicated, block: B:199:0x0561  */
    /* JADX WARN: Code duplicated, block: B:200:0x0564  */
    /* JADX WARN: Code duplicated, block: B:202:0x0579  */
    /* JADX WARN: Code duplicated, block: B:205:0x058e  */
    /* JADX WARN: Code duplicated, block: B:208:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:209:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:211:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:213:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:222:0x0619  */
    /* JADX WARN: Code duplicated, block: B:224:0x0625  */
    /* JADX WARN: Code duplicated, block: B:227:0x0633 A[LOOP:1: B:225:0x062d->B:227:0x0633, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:230:0x0653  */
    /* JADX WARN: Code duplicated, block: B:232:0x0665  */
    /* JADX WARN: Code duplicated, block: B:233:0x067e  */
    /* JADX WARN: Code duplicated, block: B:245:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[PHI: r4
      0x00c0: PHI (r4v79 java.lang.String) = 
      (r4v5 java.lang.String)
      (r4v6 java.lang.String)
      (r4v7 java.lang.String)
      (r4v9 java.lang.String)
      (r4v10 java.lang.String)
      (r4v11 java.lang.String)
      (r4v12 java.lang.String)
      (r4v13 java.lang.String)
      (r4v15 java.lang.String)
      (r4v16 java.lang.String)
      (r4v17 java.lang.String)
      (r4v18 java.lang.String)
      (r4v19 java.lang.String)
      (r4v20 java.lang.String)
      (r4v23 java.lang.String)
      (r4v80 java.lang.String)
     binds: [B:89:0x0154, B:86:0x0146, B:257:?, B:256:?, B:255:?, B:254:?, B:253:?, B:252:?, B:251:?, B:250:?, B:249:?, B:248:?, B:247:?, B:246:?, B:245:?, B:43:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x0140  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x015d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0167  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c  */
    /* JADX WARN: Code duplicated, block: B:96:0x016f  */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x017d A[PHI: r3 r4 r6
      0x017d: PHI (r3v61 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v62 java.lang.String) binds: [B:97:0x0179, B:95:0x016c, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r4v78 java.lang.String) = (r4v3 java.lang.String), (r4v4 java.lang.String), (r4v79 java.lang.String) binds: [B:97:0x0179, B:95:0x016c, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r6v36 java.lang.String) = (r6v1 java.lang.String), (r6v2 java.lang.String), (r6v37 java.lang.String) binds: [B:97:0x0179, B:95:0x016c, B:44:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcG(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        byte b10;
        String strZzc;
        String str7;
        String str8;
        int iZzi;
        zzas zzasVar;
        StringBuilder sb2;
        int i10;
        String str9;
        zzao zzaoVarZza;
        int i11;
        double dDoubleValue;
        double dDoubleValue2;
        double dZzi;
        String strZzc2;
        zzao zzaoVarZza2;
        String str10;
        String str11;
        int iIndexOf;
        zzas zzasVar2;
        String str12;
        double dDoubleValue3;
        double dZzi2;
        double dMin;
        double length;
        double dZzi3;
        double dMin2;
        String str13;
        ArrayList arrayList;
        String strZzc3;
        long jZzh;
        String[] strArrSplit;
        int length2;
        int i12;
        int i13;
        boolean zIsEmpty;
        String str14;
        zzg zzgVar2;
        int iZzi2;
        int length3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !AppLovinEventTypes.USER_EXECUTED_SEARCH.equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !InAppPurchaseConstants.METHOD_TO_STRING.equals(str)) {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    if (str.equals(str5)) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1776922004:
                    str4 = "charAt";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    if (str.equals(str6)) {
                        b10 = 14;
                        str5 = r4;
                    } else {
                        str5 = r4;
                        b10 = -1;
                    }
                    break;
                case -1464939364:
                    str4 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        b10 = 12;
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    }
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                    break;
                case -1361633751:
                    str4 = "charAt";
                    if (str.equals(str4)) {
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = 0;
                    } else {
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = 1;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b10 = 13;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case -906336856:
                    if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                        b10 = 7;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b10 = 11;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b10 = 4;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case -399551817:
                    if (str.equals(str3)) {
                        b10 = 15;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        b10 = 16;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b10 = 5;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b10 = 8;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b10 = 9;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b10 = 10;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b10 = 6;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b10 = 3;
                        str4 = "charAt";
                        str5 = r4;
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    } else {
                        str4 = "charAt";
                        str5 = "hasOwnProperty";
                        str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                        b10 = -1;
                    }
                    break;
                default:
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                    break;
            }
            strZzc = AdError.UNDEFINED_DOMAIN;
            str7 = str5;
            str8 = str4;
            switch (b10) {
                case 0:
                    zzh.zzc(str8, 1, list);
                    if (list.isEmpty()) {
                        iZzi = 0;
                    } else {
                        iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                    }
                    String str15 = this.zza;
                    return (iZzi >= 0 || iZzi >= str15.length()) ? zzao.zzm : new zzas(String.valueOf(str15.charAt(iZzi)));
                case 1:
                    zzasVar = this;
                    if (!list.isEmpty()) {
                        sb2 = new StringBuilder(zzasVar.zza);
                        for (i10 = 0; i10 < list.size(); i10++) {
                            sb2.append(zzgVar.zza((zzao) list.get(i10)).zzc());
                        }
                        return new zzas(sb2.toString());
                    }
                    return zzasVar;
                case 2:
                    zzh.zza(str7, 1, list);
                    str9 = this.zza;
                    zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                    if ("length".equals(zzaoVarZza.zzc())) {
                        return zzao.zzk;
                    }
                    double dDoubleValue4 = zzaoVarZza.zzd().doubleValue();
                    return (dDoubleValue4 == Math.floor(dDoubleValue4) || (i11 = (int) dDoubleValue4) < 0 || i11 >= str9.length()) ? zzao.zzl : zzao.zzk;
                case 3:
                    zzh.zzc("indexOf", 2, list);
                    String str16 = this.zza;
                    if (list.size() > 0) {
                        strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    }
                    String str17 = strZzc;
                    if (list.size() < 2) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                    }
                    return new zzah(Double.valueOf(str16.indexOf(str17, (int) zzh.zzi(dDoubleValue))));
                case 4:
                    zzh.zzc("lastIndexOf", 2, list);
                    String str18 = this.zza;
                    if (list.size() > 0) {
                        strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    }
                    String str19 = strZzc;
                    if (list.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue2)) {
                        dZzi = Double.POSITIVE_INFINITY;
                    } else {
                        dZzi = zzh.zzi(dDoubleValue2);
                    }
                    return new zzah(Double.valueOf(str18.lastIndexOf(str19, (int) dZzi)));
                case 5:
                    zzh.zzc("match", 1, list);
                    String str20 = this.zza;
                    if (list.size() <= 0) {
                        strZzc2 = "";
                    } else {
                        strZzc2 = zzgVar.zza((zzao) list.get(0)).zzc();
                    }
                    Matcher matcher = Pattern.compile(strZzc2).matcher(str20);
                    return matcher.find() ? new zzae(Arrays.asList(new zzas(matcher.group()))) : zzao.zzg;
                case 6:
                    zzasVar = this;
                    zzh.zzc("replace", 2, list);
                    zzaoVarZza2 = zzao.zzf;
                    if (!list.isEmpty()) {
                        strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                        if (list.size() > 1) {
                            zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                        }
                    }
                    str10 = strZzc;
                    str11 = zzasVar.zza;
                    iIndexOf = str11.indexOf(str10);
                    if (iIndexOf >= 0) {
                        if (zzaoVarZza2 instanceof zzai) {
                            zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str10), new zzah(Double.valueOf(iIndexOf)), zzasVar));
                        }
                        String strSubstring = str11.substring(0, iIndexOf);
                        String strZzc4 = zzaoVarZza2.zzc();
                        String strSubstring2 = str11.substring(iIndexOf + str10.length());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc4).length() + String.valueOf(strSubstring2).length());
                        sb3.append(strSubstring);
                        sb3.append(strZzc4);
                        sb3.append(strSubstring2);
                        zzasVar2 = new zzas(sb3.toString());
                        return zzasVar2;
                    }
                    return zzasVar;
                case 7:
                    zzh.zzc(AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, list);
                    if (!list.isEmpty()) {
                        strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    }
                    Matcher matcher2 = Pattern.compile(strZzc).matcher(this.zza);
                    return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
                case 8:
                    zzh.zzc("slice", 2, list);
                    str12 = this.zza;
                    if (list.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = zzgVar.zza((zzao) list.get(0)).zzd().doubleValue();
                    }
                    dZzi2 = zzh.zzi(dDoubleValue3);
                    if (dZzi2 < 0.0d) {
                        dMin = Math.max(((double) str12.length()) + dZzi2, 0.0d);
                    } else {
                        dMin = Math.min(dZzi2, str12.length());
                    }
                    if (list.size() > 1) {
                        length = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                    } else {
                        length = str12.length();
                    }
                    dZzi3 = zzh.zzi(length);
                    if (dZzi3 < 0.0d) {
                        dMin2 = Math.max(((double) str12.length()) + dZzi3, 0.0d);
                    } else {
                        dMin2 = Math.min(dZzi3, str12.length());
                    }
                    int i14 = (int) dMin;
                    return new zzas(str12.substring(i14, Math.max(0, ((int) dMin2) - i14) + i14));
                case 9:
                    zzh.zzc("split", 2, list);
                    str13 = this.zza;
                    if (str13.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strZzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
                        if (list.size() > 1) {
                            jZzh = zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                        } else {
                            jZzh = 2147483647L;
                        }
                        if (jZzh == 0) {
                            return new zzae();
                        }
                        strArrSplit = str13.split(Pattern.quote(strZzc3), ((int) jZzh) + 1);
                        length2 = strArrSplit.length;
                        if (strZzc3.isEmpty() || length2 <= 0) {
                            i12 = length2;
                            i13 = 0;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i12 = length2 - 1;
                            if (!strArrSplit[i12].isEmpty()) {
                                i13 = zIsEmpty;
                                i12 = length2;
                                i13 = zIsEmpty;
                            }
                        }
                        i13 = zIsEmpty;
                        if (length2 > jZzh) {
                            i12--;
                        }
                        while (i13 < i12) {
                            arrayList.add(new zzas(strArrSplit[i13]));
                            i13++;
                        }
                    }
                    return new zzae(arrayList);
                case 10:
                    zzh.zzc("substring", 2, list);
                    str14 = this.zza;
                    if (list.isEmpty()) {
                        zzgVar2 = zzgVar;
                        iZzi2 = 0;
                    } else {
                        zzgVar2 = zzgVar;
                        iZzi2 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue());
                    } else {
                        length3 = str14.length();
                    }
                    int iMin = Math.min(Math.max(iZzi2, 0), str14.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str14.length());
                    zzasVar2 = new zzas(str14.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                    return zzasVar2;
                case 11:
                    zzh.zza(str2, 0, list);
                    return new zzas(this.zza.toUpperCase());
                case 12:
                    zzh.zza("toLocaleLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase());
                case 13:
                    zzh.zza("toLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                case 14:
                    zzasVar = this;
                    zzh.zza(str6, 0, list);
                    return zzasVar;
                case 15:
                    zzh.zza(str3, 0, list);
                    return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                case 16:
                    zzh.zza(str3, 0, list);
                    return new zzas(this.zza.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "toUpperCase";
        switch (str.hashCode()) {
            case -1789698943:
                str4 = "charAt";
                str5 = r4;
                str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                if (str.equals(str5)) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                if (str.equals(str6)) {
                    b10 = 14;
                    str5 = r4;
                } else {
                    str5 = r4;
                    b10 = -1;
                }
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    b10 = 12;
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                }
                str5 = "hasOwnProperty";
                str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                b10 = -1;
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = 0;
                } else {
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = 1;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = 13;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case -906336856:
                if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                    b10 = 7;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b10 = 11;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 4;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case -399551817:
                if (str.equals(str3)) {
                    b10 = 15;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    b10 = 16;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = 5;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 8;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 9;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = 10;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b10 = 6;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = 3;
                    str4 = "charAt";
                    str5 = r4;
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                } else {
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                    b10 = -1;
                }
                break;
            default:
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = InAppPurchaseConstants.METHOD_TO_STRING;
                b10 = -1;
                break;
        }
        strZzc = AdError.UNDEFINED_DOMAIN;
        str7 = str5;
        str8 = str4;
        switch (b10) {
            case 0:
                zzh.zzc(str8, 1, list);
                if (list.isEmpty()) {
                    iZzi = (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue());
                } else {
                    iZzi = 0;
                }
                String str110 = this.zza;
                if (iZzi >= 0) {
                }
                break;
            case 1:
                zzasVar = this;
                if (!list.isEmpty()) {
                    sb2 = new StringBuilder(zzasVar.zza);
                    while (i10 < list.size()) {
                        sb2.append(zzgVar.zza((zzao) list.get(i10)).zzc());
                    }
                    return new zzas(sb2.toString());
                }
                return zzasVar;
            case 2:
                zzh.zza(str7, 1, list);
                str9 = this.zza;
                zzaoVarZza = zzgVar.zza((zzao) list.get(0));
                if ("length".equals(zzaoVarZza.zzc())) {
                    return zzao.zzk;
                }
                double dDoubleValue5 = zzaoVarZza.zzd().doubleValue();
                if (dDoubleValue5 == Math.floor(dDoubleValue5)) {
                }
                break;
            case 3:
                zzh.zzc("indexOf", 2, list);
                String str111 = this.zza;
                if (list.size() > 0) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                String str112 = strZzc;
                if (list.size() < 2) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                }
                return new zzah(Double.valueOf(str111.indexOf(str112, (int) zzh.zzi(dDoubleValue))));
            case 4:
                zzh.zzc("lastIndexOf", 2, list);
                String str113 = this.zza;
                if (list.size() > 0) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                String str114 = strZzc;
                if (list.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                }
                if (Double.isNaN(dDoubleValue2)) {
                    dZzi = Double.POSITIVE_INFINITY;
                } else {
                    dZzi = zzh.zzi(dDoubleValue2);
                }
                return new zzah(Double.valueOf(str113.lastIndexOf(str114, (int) dZzi)));
            case 5:
                zzh.zzc("match", 1, list);
                String str21 = this.zza;
                if (list.size() <= 0) {
                    strZzc2 = "";
                } else {
                    strZzc2 = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                Matcher matcher3 = Pattern.compile(strZzc2).matcher(str21);
                if (matcher3.find()) {
                }
            case 6:
                zzasVar = this;
                zzh.zzc("replace", 2, list);
                zzaoVarZza2 = zzao.zzf;
                if (!list.isEmpty()) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                    if (list.size() > 1) {
                        zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
                    }
                }
                str10 = strZzc;
                str11 = zzasVar.zza;
                iIndexOf = str11.indexOf(str10);
                if (iIndexOf >= 0) {
                    if (zzaoVarZza2 instanceof zzai) {
                        zzaoVarZza2 = ((zzai) zzaoVarZza2).zza(zzgVar, Arrays.asList(new zzas(str10), new zzah(Double.valueOf(iIndexOf)), zzasVar));
                    }
                    String strSubstring3 = str11.substring(0, iIndexOf);
                    String strZzc5 = zzaoVarZza2.zzc();
                    String strSubstring4 = str11.substring(iIndexOf + str10.length());
                    StringBuilder sb4 = new StringBuilder(String.valueOf(strSubstring3).length() + String.valueOf(strZzc5).length() + String.valueOf(strSubstring4).length());
                    sb4.append(strSubstring3);
                    sb4.append(strZzc5);
                    sb4.append(strSubstring4);
                    zzasVar2 = new zzas(sb4.toString());
                    return zzasVar2;
                }
                return zzasVar;
            case 7:
                zzh.zzc(AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, list);
                if (!list.isEmpty()) {
                    strZzc = zzgVar.zza((zzao) list.get(0)).zzc();
                }
                Matcher matcher4 = Pattern.compile(strZzc).matcher(this.zza);
                if (matcher4.find()) {
                }
            case 8:
                zzh.zzc("slice", 2, list);
                str12 = this.zza;
                if (list.isEmpty()) {
                    dDoubleValue3 = zzgVar.zza((zzao) list.get(0)).zzd().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dZzi2 = zzh.zzi(dDoubleValue3);
                if (dZzi2 < 0.0d) {
                    dMin = Math.max(((double) str12.length()) + dZzi2, 0.0d);
                } else {
                    dMin = Math.min(dZzi2, str12.length());
                }
                if (list.size() > 1) {
                    length = zzgVar.zza((zzao) list.get(1)).zzd().doubleValue();
                } else {
                    length = str12.length();
                }
                dZzi3 = zzh.zzi(length);
                if (dZzi3 < 0.0d) {
                    dMin2 = Math.max(((double) str12.length()) + dZzi3, 0.0d);
                } else {
                    dMin2 = Math.min(dZzi3, str12.length());
                }
                int i15 = (int) dMin;
                return new zzas(str12.substring(i15, Math.max(0, ((int) dMin2) - i15) + i15));
            case 9:
                zzh.zzc("split", 2, list);
                str13 = this.zza;
                if (str13.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strZzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
                    if (list.size() > 1) {
                        jZzh = zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue());
                    } else {
                        jZzh = 2147483647L;
                    }
                    if (jZzh == 0) {
                        return new zzae();
                    }
                    strArrSplit = str13.split(Pattern.quote(strZzc3), ((int) jZzh) + 1);
                    length2 = strArrSplit.length;
                    if (strZzc3.isEmpty()) {
                        i12 = length2;
                        i13 = 0;
                    } else {
                        i12 = length2;
                        i13 = 0;
                    }
                    i13 = zIsEmpty;
                    if (length2 > jZzh) {
                        i12--;
                    }
                    while (i13 < i12) {
                        arrayList.add(new zzas(strArrSplit[i13]));
                        i13++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                zzh.zzc("substring", 2, list);
                str14 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZzi2 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    iZzi2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue());
                } else {
                    length3 = str14.length();
                }
                int iMin3 = Math.min(Math.max(iZzi2, 0), str14.length());
                int iMin4 = Math.min(Math.max(length3, 0), str14.length());
                zzasVar2 = new zzas(str14.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
                return zzasVar2;
            case 11:
                zzh.zza(str2, 0, list);
                return new zzas(this.zza.toUpperCase());
            case 12:
                zzh.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case 13:
                zzh.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzasVar = this;
                zzh.zza(str6, 0, list);
                return zzasVar;
            case 15:
                zzh.zza(str3, 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zza(str3, 0, list);
                return new zzas(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}

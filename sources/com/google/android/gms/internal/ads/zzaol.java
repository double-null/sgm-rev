package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.facebook.appevents.UserDataStore;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import rd.PSo.cNMUz;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaol implements zzanl {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzaoj zzh = new zzaoj(30.0f, 1, 1);

    public zzaol() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfl.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Code duplicated, block: B:193:0x034b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r6v90 */
    private static zzaoo zzd(XmlPullParser xmlPullParser, zzaoo zzaooVar) {
        ?? r10;
        Matcher matcher;
        byte b10;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z10 = false;
        zzaoo zzaooVarZze = zzaooVar;
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            String attributeName = xmlPullParser.getAttributeName(i10);
            ?? r11 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r12 = -1;
             = -1;
             = -1;
            ?? r13 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r14 = -1;
            r11 = -1;
            r11 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r10 = !attributeName.equals("fontStyle") ? -1 : 6;
                    break;
                case -1289044182:
                    r10 = !attributeName.equals("extent") ? -1 : 16;
                    break;
                case -1224696685:
                    r10 = !attributeName.equals("fontFamily") ? -1 : 3;
                    break;
                case -1065511464:
                    r10 = !attributeName.equals("textAlign") ? -1 : 7;
                    break;
                case -1008619738:
                    r10 = !attributeName.equals("origin") ? -1 : 15;
                    break;
                case -879295043:
                    r10 = !attributeName.equals("textDecoration") ? -1 : 12;
                    break;
                case -734428249:
                    r10 = !attributeName.equals("fontWeight") ? -1 : 5;
                    break;
                case 3355:
                    r10 = !attributeName.equals("id") ? -1 : z10;
                    break;
                case 3511770:
                    r10 = !attributeName.equals("ruby") ? -1 : 10;
                    break;
                case 94842723:
                    r10 = !attributeName.equals("color") ? -1 : 2;
                    break;
                case 109403361:
                    r10 = !attributeName.equals("shear") ? -1 : 14;
                    break;
                case 110138194:
                    r10 = !attributeName.equals("textCombine") ? -1 : 9;
                    break;
                case 365601008:
                    r10 = !attributeName.equals("fontSize") ? -1 : 4;
                    break;
                case 921125321:
                    r10 = !attributeName.equals("textEmphasis") ? -1 : 13;
                    break;
                case 1115953443:
                    r10 = !attributeName.equals("rubyPosition") ? -1 : 11;
                    break;
                case 1287124693:
                    r10 = !attributeName.equals("backgroundColor") ? -1 : 1;
                    break;
                case 1754920356:
                    r10 = !attributeName.equals("multiRowAlign") ? -1 : 8;
                    break;
                default:
                    r10 = -1;
                    break;
            }
            switch (r10) {
                case 0:
                    if (AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE.equals(xmlPullParser.getName())) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzs(attributeValue);
                    }
                    break;
                case 1:
                    zzaooVarZze = zze(zzaooVarZze);
                    try {
                        zzaooVarZze.zzn(zzdr.zza(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        zzeg.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 2:
                    zzaooVarZze = zze(zzaooVarZze);
                    try {
                        zzaooVarZze.zzk(zzdr.zza(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        zzeg.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 3:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzaooVarZze = zze(zzaooVarZze);
                        String str = zzfl.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 41);
                                sb2.append("Invalid number of entries for fontSize: ");
                                sb2.append(length);
                                sb2.append(".");
                                throw new zzanh(sb2.toString());
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzeg.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb3 = new StringBuilder(attributeValue.length() + 36);
                            sb3.append("Invalid expression for fontSize: '");
                            sb3.append(attributeValue);
                            sb3.append("'.");
                            throw new zzanh(sb3.toString());
                        }
                        String strGroup = matcher.group(3);
                        strGroup.getClass();
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strGroup.equals(UserDataStore.EMAIL)) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (strGroup.equals("%")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                        if (b10 == 0) {
                            zzaooVarZze.zzH(1);
                        } else if (b10 == 1) {
                            zzaooVarZze.zzH(2);
                        } else {
                            if (b10 != 2) {
                                StringBuilder sb4 = new StringBuilder(strGroup.length() + 30);
                                sb4.append("Invalid unit for fontSize: '");
                                sb4.append(strGroup);
                                sb4.append("'.");
                                throw new zzanh(sb4.toString());
                            }
                            zzaooVarZze.zzH(3);
                        }
                        String strGroup2 = matcher.group(1);
                        strGroup2.getClass();
                        zzaooVarZze.zzG(Float.parseFloat(strGroup2));
                    } catch (zzanh unused3) {
                        zzeg.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 5:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzf("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzg("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String strZza = zzgss.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals("none")) {
                            r11 = z10;
                        }
                    } else if (strZza.equals("all")) {
                        r11 = 1;
                    }
                    if (r11 == 0) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzD(z10);
                    } else if (r11 == 1) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzD(true);
                    }
                    break;
                case 10:
                    String strZza2 = zzgss.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals("baseContainer")) {
                                r14 = 2;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals("container")) {
                                r14 = z10;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals("delimiter")) {
                                r14 = 5;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals("textContainer")) {
                                r14 = 4;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals("base")) {
                                r14 = 1;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                r14 = 3;
                            }
                            break;
                    }
                    if (r14 == 0) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzu(1);
                    } else if (r14 == 1 || r14 == 2) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzu(2);
                    } else if (r14 == 3 || r14 == 4) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzu(3);
                    } else if (r14 == 5) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzu(4);
                    }
                    break;
                case 11:
                    String strZza3 = zzgss.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals("after")) {
                            r13 = 1;
                        }
                    } else if (strZza3.equals("before")) {
                        r13 = z10;
                    }
                    if (r13 == 0) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzw(1);
                    } else if (r13 == 1) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzw(2);
                    }
                    break;
                case 12:
                    String strZza4 = zzgss.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals("nounderline")) {
                                r12 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals("underline")) {
                                r12 = 2;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals("nolinethrough")) {
                                r12 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals("linethrough")) {
                                r12 = z10;
                            }
                            break;
                    }
                    if (r12 == 0) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzc(true);
                    } else if (r12 == 1) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zzc(z10);
                    } else if (r12 == 2) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zze(true);
                    } else if (r12 == 3) {
                        zzaooVarZze = zze(zzaooVarZze);
                        zzaooVarZze.zze(z10);
                    }
                    break;
                case 13:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzF(zzaoh.zza(attributeValue));
                    break;
                case 14:
                    zzaoo zzaooVarZze2 = zze(zzaooVarZze);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e10) {
                            zzeg.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e10);
                        }
                    } else {
                        zzeg.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zzaooVarZze2.zzp(fMin);
                    zzaooVarZze = zzaooVarZze2;
                    break;
                case 15:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzK(attributeValue);
                    break;
                case 16:
                    zzaooVarZze = zze(zzaooVarZze);
                    zzaooVarZze.zzM(attributeValue);
                    break;
            }
            i10++;
            z10 = false;
        }
        return zzaooVarZze;
    }

    private static zzaoo zze(zzaoo zzaooVar) {
        return zzaooVar == null ? new zzaoo() : zzaooVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static Layout.Alignment zzf(String str) {
        byte b10;
        switch (zzgss.zza(str)) {
            case "center":
                b10 = 4;
                break;
            case "end":
                b10 = 3;
                break;
            case "left":
                b10 = 0;
                break;
            case "right":
                b10 = 2;
                break;
            case "start":
                b10 = 1;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b10 == 2 || b10 == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b10 != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    private static long zzg(String str, zzaoj zzaojVar) throws zzanh {
        double d10;
        double d11;
        Matcher matcher = zzc.matcher(str);
        byte b10 = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j10 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j11 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j10 + j11;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = 0.0d;
            double d15 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d16 = d12 + d13;
            String strGroup5 = matcher.group(5);
            double d17 = strGroup5 != null ? Long.parseLong(strGroup5) / zzaojVar.zza : 0.0d;
            double d18 = d16 + d15;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d14 = (Long.parseLong(strGroup6) / ((double) zzaojVar.zzb)) / ((double) zzaojVar.zza);
            }
            return (long) ((d18 + d17 + d14) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzanh("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d19 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b10 = 5;
                            } else {
                                b10 = -1;
                            }
                        } else if (!strGroup8.equals("s")) {
                            b10 = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (strGroup8.equals("h")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (strGroup8.equals("f")) {
            b10 = 4;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                if (b10 == 3) {
                    d11 = 1000.0d;
                } else if (b10 == 4) {
                    d11 = zzaojVar.zza;
                } else if (b10 == 5) {
                    d11 = zzaojVar.zzc;
                }
                d19 /= d11;
            } else {
                d10 = 60.0d;
            }
            return (long) (d19 * 1000000.0d);
        }
        d10 = 3600.0d;
        d19 *= d10;
        return (long) (d19 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        zzanf.zza(zzb(bArr, i10, i11), zzankVar, zzdtVar);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0268 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, LOOP:1: B:110:0x0268->B:270:0x0549, LOOP_START, PHI: r3 r7 r8 r10 r11 r12 r15
      0x0268: PHI (r3v40 java.lang.String) = (r3v3 java.lang.String), (r3v76 java.lang.String) binds: [B:109:0x0266, B:270:0x0549] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r7v5 java.util.HashMap) = (r7v1 java.util.HashMap), (r7v39 java.util.HashMap) binds: [B:109:0x0266, B:270:0x0549] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r8v17 java.util.HashMap) = (r8v1 java.util.HashMap), (r8v31 java.util.HashMap) binds: [B:109:0x0266, B:270:0x0549] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r10v24 java.lang.String) = (r10v10 java.lang.String), (r10v31 java.lang.String) binds: [B:109:0x0266, B:270:0x0549] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r11v26 java.lang.String) = (r11v6 java.lang.String), (r11v46 java.lang.String) binds: [B:109:0x0266, B:270:0x0549] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r12v12 java.lang.String) = (r12v9 java.lang.String), (r12v29 java.lang.String) binds: [B:109:0x0266, B:270:0x0549] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r15v10 java.lang.String) = (r15v9 java.lang.String), (r15v12 java.lang.String) binds: [B:109:0x0266, B:270:0x0549] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0271 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0280 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x028c A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, LOOP:2: B:115:0x028a->B:116:0x028c, LOOP_END, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x029e  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a8 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02b2 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02be A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_ENTER, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02db A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fe A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0314  */
    /* JADX WARN: Code duplicated, block: B:149:0x033b A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0343 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0345 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x034d  */
    /* JADX WARN: Code duplicated, block: B:162:0x037a A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0383  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a9 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e9 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x03ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x03f1 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:195:0x0432 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x043f  */
    /* JADX WARN: Code duplicated, block: B:199:0x044b A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x0458  */
    /* JADX WARN: Code duplicated, block: B:208:0x0469  */
    /* JADX WARN: Code duplicated, block: B:210:0x0471  */
    /* JADX WARN: Code duplicated, block: B:211:0x0473  */
    /* JADX WARN: Code duplicated, block: B:213:0x0476  */
    /* JADX WARN: Code duplicated, block: B:216:0x047a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0481  */
    /* JADX WARN: Code duplicated, block: B:218:0x048b  */
    /* JADX WARN: Code duplicated, block: B:222:0x049a A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:227:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:233:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:235:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:236:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:238:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:239:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:247:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:248:0x04df  */
    /* JADX WARN: Code duplicated, block: B:251:0x04f0 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:254:0x0501 A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x050e A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, LOOP:3: B:256:0x050e->B:265:0x0532, LOOP_START, PHI: r30 r42
      0x050e: PHI (r30v6 java.util.HashMap) = (r30v5 java.util.HashMap), (r30v7 java.util.HashMap) binds: [B:255:0x050c, B:265:0x0532] A[DONT_GENERATE, DONT_INLINE]
      0x050e: PHI (r42v1 java.lang.String) = (r42v0 java.lang.String), (r42v2 java.lang.String) binds: [B:255:0x050c, B:265:0x0532] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x0529  */
    /* JADX WARN: Code duplicated, block: B:265:0x0532 A[LOOP:3: B:256:0x050e->B:265:0x0532, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:266:0x0537  */
    /* JADX WARN: Code duplicated, block: B:270:0x0549 A[LOOP:1: B:110:0x0268->B:270:0x0549, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x0553  */
    /* JADX WARN: Code duplicated, block: B:278:0x058a  */
    /* JADX WARN: Code duplicated, block: B:279:0x058d  */
    /* JADX WARN: Code duplicated, block: B:281:0x0595  */
    /* JADX WARN: Code duplicated, block: B:282:0x0599  */
    /* JADX WARN: Code duplicated, block: B:284:0x059f  */
    /* JADX WARN: Code duplicated, block: B:285:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:287:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:288:0x05af  */
    /* JADX WARN: Code duplicated, block: B:290:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:291:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:293:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:294:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:296:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:297:0x05d1 A[PHI: r11
      0x05d1: PHI (r11v24 java.lang.Object) = 
      (r11v8 java.lang.Object)
      (r11v10 java.lang.Object)
      (r11v13 java.lang.Object)
      (r11v16 java.lang.Object)
      (r11v18 java.lang.Object)
      (r11v21 java.lang.Object)
      (r11v25 java.lang.Object)
     binds: [B:295:0x05cd, B:453:?, B:452:?, B:451:?, B:450:?, B:449:?, B:278:0x058a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:299:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:301:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:303:0x05da  */
    /* JADX WARN: Code duplicated, block: B:305:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:307:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:309:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:312:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:316:0x05f6 A[Catch: zzanh -> 0x060d, IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #3 {zzanh -> 0x060d, blocks: (B:313:0x05ee, B:316:0x05f6, B:319:0x0600), top: B:417:0x05ee }] */
    /* JADX WARN: Code duplicated, block: B:318:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:319:0x0600 A[Catch: zzanh -> 0x060d, IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #3 {zzanh -> 0x060d, blocks: (B:313:0x05ee, B:316:0x05f6, B:319:0x0600), top: B:417:0x05ee }] */
    /* JADX WARN: Code duplicated, block: B:321:0x0608  */
    /* JADX WARN: Code duplicated, block: B:325:0x0612  */
    /* JADX WARN: Code duplicated, block: B:327:0x061a A[Catch: zzanh -> 0x066e, IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #5 {zzanh -> 0x066e, blocks: (B:329:0x0628, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:357:0x0689), top: B:421:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:328:0x0621 A[Catch: zzanh -> 0x066e, IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #5 {zzanh -> 0x066e, blocks: (B:329:0x0628, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:357:0x0689), top: B:421:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0641 A[Catch: zzanh -> 0x066e, IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #5 {zzanh -> 0x066e, blocks: (B:329:0x0628, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:357:0x0689), top: B:421:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x064e  */
    /* JADX WARN: Code duplicated, block: B:340:0x0652 A[Catch: zzanh -> 0x066e, IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #5 {zzanh -> 0x066e, blocks: (B:329:0x0628, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:357:0x0689), top: B:421:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0655  */
    /* JADX WARN: Code duplicated, block: B:344:0x065b A[Catch: zzanh -> 0x066e, IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #5 {zzanh -> 0x066e, blocks: (B:329:0x0628, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:357:0x0689), top: B:421:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:345:0x065e  */
    /* JADX WARN: Code duplicated, block: B:346:0x066a  */
    /* JADX WARN: Code duplicated, block: B:349:0x0670  */
    /* JADX WARN: Code duplicated, block: B:353:0x067e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0682 A[Catch: zzanh -> 0x066e, IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #5 {zzanh -> 0x066e, blocks: (B:329:0x0628, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:357:0x0689), top: B:421:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:356:0x0687 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:357:0x0689 A[Catch: zzanh -> 0x066e, IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #5 {zzanh -> 0x066e, blocks: (B:329:0x0628, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:357:0x0689), top: B:421:0x0628 }] */
    /* JADX WARN: Code duplicated, block: B:362:0x0693 A[PHI: r14
      0x0693: PHI (r14v5 long) = (r14v4 long), (r14v7 long) binds: [B:352:0x067c, B:359:0x068d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:367:0x06a8 A[Catch: zzanh -> 0x06ac, IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #2 {zzanh -> 0x06ac, blocks: (B:365:0x06a3, B:367:0x06a8), top: B:415:0x06a3 }] */
    /* JADX WARN: Code duplicated, block: B:431:0x05e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0579 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0543 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0531 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x016e A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017a A[Catch: IOException -> 0x073b, XmlPullParserException -> 0x0745, TRY_LEAVE, TryCatch #17 {IOException -> 0x073b, XmlPullParserException -> 0x0745, blocks: (B:3:0x0008, B:6:0x0065, B:8:0x0070, B:11:0x007a, B:14:0x0084, B:16:0x008c, B:18:0x0093, B:20:0x009b, B:24:0x00af, B:26:0x00ce, B:28:0x00d8, B:29:0x00dc, B:31:0x00e8, B:33:0x00f3, B:59:0x015f, B:75:0x01b2, B:78:0x01cc, B:80:0x01d2, B:82:0x01da, B:84:0x01e2, B:86:0x01ea, B:88:0x01f2, B:90:0x01fa, B:92:0x0200, B:94:0x0208, B:96:0x0210, B:98:0x0216, B:100:0x021c, B:102:0x0222, B:104:0x022a, B:107:0x0233, B:399:0x071f, B:108:0x0262, B:110:0x0268, B:112:0x0271, B:114:0x0280, B:116:0x028c, B:118:0x02a2, B:120:0x02a8, B:267:0x053b, B:122:0x02b2, B:125:0x02be, B:251:0x04f0, B:129:0x02db, B:131:0x02e5, B:133:0x02eb, B:135:0x02f3, B:139:0x02fe, B:142:0x0317, B:144:0x031e, B:146:0x032c, B:164:0x038b, B:166:0x0395, B:168:0x039b, B:170:0x03a3, B:172:0x03a9, B:175:0x03bc, B:177:0x03c3, B:179:0x03d1, B:197:0x0443, B:199:0x044b, B:220:0x0492, B:222:0x049a, B:249:0x04e3, B:181:0x03dc, B:182:0x03e9, B:185:0x03f1, B:188:0x03ff, B:190:0x0406, B:192:0x0412, B:194:0x0425, B:195:0x0432, B:148:0x0333, B:149:0x033b, B:152:0x0345, B:155:0x034e, B:157:0x0355, B:159:0x0361, B:161:0x0371, B:162:0x037a, B:254:0x0501, B:256:0x050e, B:258:0x0519, B:260:0x051f, B:262:0x052b, B:272:0x0558, B:275:0x0579, B:329:0x0628, B:310:0x05e5, B:313:0x05ee, B:376:0x06b9, B:316:0x05f6, B:319:0x0600, B:326:0x0615, B:327:0x061a, B:328:0x0621, B:336:0x0641, B:340:0x0652, B:344:0x065b, B:355:0x0682, B:363:0x0695, B:365:0x06a3, B:367:0x06a8, B:357:0x0689, B:62:0x016e, B:64:0x017a, B:67:0x0183, B:69:0x018a, B:71:0x0196, B:73:0x01a2, B:37:0x010b, B:39:0x0117, B:42:0x0120, B:44:0x0127, B:46:0x012e, B:48:0x0135, B:54:0x014b, B:58:0x0157, B:382:0x06d8, B:385:0x06e7, B:387:0x06f1, B:389:0x06fc, B:391:0x0702, B:394:0x0715, B:397:0x071b), top: B:441:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0182  */
    public final zzang zzb(byte[] bArr, int i10, int i11) {
        String str;
        String str2;
        ArrayDeque arrayDeque;
        HashMap map;
        zzaok zzaokVar;
        int i12;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        zzaoj zzaojVar;
        int attributeCount;
        zzanh zzanhVar;
        String[] strArr;
        String strSubstring;
        String str7;
        int i13;
        long jZzg;
        long jZzg2;
        long jZzg3;
        zzaoi zzaoiVar;
        long j10;
        zzaoi zzaoiVar2;
        long j11;
        long j12;
        zzaoi zzaoiVarZzb;
        long j13;
        String attributeName;
        String attributeValue;
        Object obj2;
        byte b10;
        String[] strArrZzc;
        HashMap map2;
        String str8;
        String str9;
        String str10;
        String str11;
        String strZzc;
        String strZzc2;
        String strZzc3;
        String strZzL;
        HashMap map3;
        String str12;
        String str13;
        float f10;
        float f11;
        String strZzc4;
        float f12;
        float f13;
        String strZzc5;
        float f14;
        int i14;
        String strZzc6;
        int i15;
        zzaom zzaomVar;
        String strZza;
        int iHashCode;
        byte b11;
        String strZza2;
        int iHashCode2;
        byte b12;
        Matcher matcher;
        Matcher matcher2;
        String strZzc7;
        zzaoo zzaooVar;
        Matcher matcher3;
        Matcher matcher4;
        String strZzc8;
        zzaoo zzaooVar2;
        String str14;
        String strZzc9;
        zzaoo zzaooVarZzd;
        String strZzt;
        String[] strArrZzc2;
        int length;
        int i16;
        float f15;
        int i17;
        boolean z10;
        String strZzc10;
        Matcher matcher5;
        String str15 = "";
        String str16 = "http://www.w3.org/ns/ttml#parameter";
        String str17 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            map5.put("", new zzaom("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i10, i11), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzaoj zzaojVar2 = zzh;
            zzaop zzaopVar = null;
            zzaok zzaokVar2 = null;
            zzaoj zzaojVar3 = zzaojVar2;
            int i18 = 0;
            int i19 = 15;
            while (eventType != 1) {
                zzaoi zzaoiVar3 = (zzaoi) arrayDeque2.peek();
                if (i18 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str15;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str16, "frameRate");
                            int i20 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 30;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str16, "frameRateMultiplier");
                            if (attributeValue3 != null) {
                                String str18 = zzfl.zza;
                                String[] strArrSplit = attributeValue3.split(" ", -1);
                                zzgtj.zzb(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f15 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f15 = 1.0f;
                            }
                            int i21 = zzaojVar2.zzb;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str16, "subFrameRate");
                            if (attributeValue4 != null) {
                                i21 = Integer.parseInt(attributeValue4);
                            }
                            int i22 = zzaojVar2.zzc;
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str16, "tickRate");
                            zzaojVar3 = new zzaoj(i20 * f15, i21, attributeValue5 != null ? Integer.parseInt(attributeValue5) : i22);
                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(str16, "cellResolution");
                            if (attributeValue6 == null) {
                                str2 = str16;
                                zzaojVar3 = zzaojVar3;
                                i19 = 15;
                            } else {
                                Matcher matcher6 = zzg.matcher(attributeValue6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup = matcher6.group(1);
                                        strGroup.getClass();
                                        int i23 = Integer.parseInt(strGroup);
                                        str2 = str16;
                                        try {
                                            String strGroup2 = matcher6.group(2);
                                            strGroup2.getClass();
                                            int i24 = Integer.parseInt(strGroup2);
                                            if (i23 == 0) {
                                                i17 = i24;
                                                z10 = false;
                                            } else if (i24 != 0) {
                                                i17 = i24;
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                                i17 = 0;
                                            }
                                            try {
                                                zzgtj.zzg(z10, "Invalid cell resolution %s %s", i23, i17);
                                                i19 = i17;
                                            } catch (NumberFormatException unused) {
                                                zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                                i19 = 15;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzaojVar3 = zzaojVar3;
                                            zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                            i19 = 15;
                                            strZzc10 = zzft.zzc(xmlPullParserNewPullParser, "extent");
                                            if (strZzc10 == null) {
                                                zzaokVar2 = null;
                                            } else {
                                                matcher5 = zzf.matcher(strZzc10);
                                                if (matcher5.matches()) {
                                                    try {
                                                        String strGroup3 = matcher5.group(1);
                                                        strGroup3.getClass();
                                                        int i25 = Integer.parseInt(strGroup3);
                                                        String strGroup4 = matcher5.group(2);
                                                        strGroup4.getClass();
                                                        zzaokVar2 = new zzaok(i25, Integer.parseInt(strGroup4));
                                                    } catch (NumberFormatException unused3) {
                                                        zzeg.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(strZzc10));
                                                        zzaokVar2 = null;
                                                    }
                                                } else {
                                                    zzeg.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc10));
                                                }
                                                zzaokVar2 = null;
                                            }
                                            zzaokVar = zzaokVar2;
                                            i12 = i19;
                                            str3 = "image";
                                            str4 = "metadata";
                                            str5 = "region";
                                            str6 = "head";
                                            zzaojVar3 = zzaojVar3;
                                            if (name.equals("tt")) {
                                            }
                                            if ("head".equals(name)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    if (zzft.zzb(xmlPullParserNewPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                                        strZzc9 = zzft.zzc(xmlPullParserNewPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                                                        zzaooVarZzd = zzd(xmlPullParserNewPullParser, new zzaoo());
                                                        if (strZzc9 != null) {
                                                            strArrZzc2 = zzc(strZzc9);
                                                            i16 = 0;
                                                            for (length = strArrZzc2.length; i16 < length; length = length) {
                                                                zzaooVarZzd.zzr((zzaoo) map4.get(strArrZzc2[i16]));
                                                                i16++;
                                                            }
                                                        }
                                                        strZzt = zzaooVarZzd.zzt();
                                                        if (strZzt != null) {
                                                            map4.put(strZzt, zzaooVarZzd);
                                                        }
                                                        str10 = str4;
                                                        str9 = str5;
                                                        map = map6;
                                                        str11 = str3;
                                                    } else {
                                                        str17 = str17;
                                                        str6 = str6;
                                                        if (zzft.zzb(xmlPullParserNewPullParser, str5)) {
                                                            str9 = str5;
                                                            HashMap map7 = map6;
                                                            strZzc2 = zzft.zzc(xmlPullParserNewPullParser, "id");
                                                            if (strZzc2 == null) {
                                                                map3 = map5;
                                                                str12 = str3;
                                                                str13 = str4;
                                                            } else {
                                                                strZzc3 = zzft.zzc(xmlPullParserNewPullParser, "origin");
                                                                if (strZzc3 == null) {
                                                                    strZzL = strZzc3;
                                                                } else {
                                                                    strZzL = strZzc3;
                                                                }
                                                                if (strZzL != null) {
                                                                    str12 = str3;
                                                                    matcher3 = zzb.matcher(strZzL);
                                                                    str13 = str4;
                                                                    matcher4 = zzf.matcher(strZzL);
                                                                    if (matcher3.matches()) {
                                                                        map3 = map5;
                                                                        try {
                                                                            String strGroup5 = matcher3.group(1);
                                                                            strGroup5.getClass();
                                                                            f11 = Float.parseFloat(strGroup5) / 100.0f;
                                                                            String strGroup6 = matcher3.group(2);
                                                                            strGroup6.getClass();
                                                                            f10 = Float.parseFloat(strGroup6) / 100.0f;
                                                                        } catch (NumberFormatException unused4) {
                                                                            zzeg.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                        }
                                                                    } else {
                                                                        map3 = map5;
                                                                        if (matcher4.matches()) {
                                                                            zzeg.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                                        } else if (zzaokVar == null) {
                                                                            zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                                        } else {
                                                                            try {
                                                                                String strGroup7 = matcher4.group(1);
                                                                                strGroup7.getClass();
                                                                                int i26 = Integer.parseInt(strGroup7);
                                                                                String strGroup8 = matcher4.group(2);
                                                                                strGroup8.getClass();
                                                                                int i27 = Integer.parseInt(strGroup8);
                                                                                f11 = i26 / zzaokVar.zza;
                                                                                f10 = i27 / zzaokVar.zzb;
                                                                            } catch (NumberFormatException unused5) {
                                                                                zzeg.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    map3 = map5;
                                                                    str12 = str3;
                                                                    str13 = str4;
                                                                    f10 = 0.0f;
                                                                    f11 = 0.0f;
                                                                }
                                                                float f16 = f11;
                                                                strZzc4 = zzft.zzc(xmlPullParserNewPullParser, "extent");
                                                                if (strZzc4 == null) {
                                                                    strZzc4 = zzaooVar.zzN();
                                                                }
                                                                if (strZzc4 != null) {
                                                                    matcher = zzb.matcher(strZzc4);
                                                                    matcher2 = zzf.matcher(strZzc4);
                                                                    if (matcher.matches()) {
                                                                        try {
                                                                            String strGroup9 = matcher.group(1);
                                                                            strGroup9.getClass();
                                                                            float f17 = Float.parseFloat(strGroup9) / 100.0f;
                                                                            String strGroup10 = matcher.group(2);
                                                                            strGroup10.getClass();
                                                                            f13 = Float.parseFloat(strGroup10) / 100.0f;
                                                                            f12 = f17;
                                                                        } catch (NumberFormatException unused6) {
                                                                            zzeg.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                            zzaomVar = null;
                                                                        }
                                                                    } else if (matcher2.matches()) {
                                                                        zzeg.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                                    } else if (zzaokVar == null) {
                                                                        zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                                    } else {
                                                                        try {
                                                                            String strGroup11 = matcher2.group(1);
                                                                            strGroup11.getClass();
                                                                            int i28 = Integer.parseInt(strGroup11);
                                                                            String strGroup12 = matcher2.group(2);
                                                                            strGroup12.getClass();
                                                                            int i29 = Integer.parseInt(strGroup12);
                                                                            float f18 = i28 / zzaokVar.zza;
                                                                            f13 = i29 / zzaokVar.zzb;
                                                                            f12 = f18;
                                                                        } catch (NumberFormatException unused7) {
                                                                            zzeg.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                            zzaomVar = null;
                                                                        }
                                                                    }
                                                                    if (zzaomVar != null) {
                                                                        map5 = map3;
                                                                        map5.put(zzaomVar.zza, zzaomVar);
                                                                    } else {
                                                                        map5 = map3;
                                                                    }
                                                                    map = map7;
                                                                    str11 = str12;
                                                                    str10 = str13;
                                                                } else {
                                                                    f12 = 1.0f;
                                                                    f13 = 1.0f;
                                                                }
                                                                strZzc5 = zzft.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                                if (strZzc5 != null) {
                                                                    strZza2 = zzgss.zza(strZzc5);
                                                                    iHashCode2 = strZza2.hashCode();
                                                                    if (iHashCode2 != -1364013995) {
                                                                        if (iHashCode2 != 92734940) {
                                                                            b12 = -1;
                                                                        } else {
                                                                            b12 = 1;
                                                                        }
                                                                    } else if (strZza2.equals("center")) {
                                                                        b12 = 0;
                                                                    } else {
                                                                        b12 = -1;
                                                                    }
                                                                    if (b12 != 0) {
                                                                        f14 = f10 + (f13 / 2.0f);
                                                                        i14 = 1;
                                                                    } else if (b12 != 1) {
                                                                        f14 = f10;
                                                                        i14 = 0;
                                                                    } else {
                                                                        f14 = f10 + f13;
                                                                        i14 = 2;
                                                                    }
                                                                } else {
                                                                    f14 = f10;
                                                                    i14 = 0;
                                                                }
                                                                float f19 = 1.0f / i12;
                                                                strZzc6 = zzft.zzc(xmlPullParserNewPullParser, "writingMode");
                                                                if (strZzc6 != null) {
                                                                    strZza = zzgss.zza(strZzc6);
                                                                    iHashCode = strZza.hashCode();
                                                                    if (iHashCode != 3694) {
                                                                        if (iHashCode != 3553396) {
                                                                            if (iHashCode != 3553576) {
                                                                                b11 = -1;
                                                                            } else {
                                                                                b11 = 2;
                                                                            }
                                                                        } else if (strZza.equals("tblr")) {
                                                                            b11 = 1;
                                                                        } else {
                                                                            b11 = -1;
                                                                        }
                                                                    } else if (strZza.equals("tb")) {
                                                                        b11 = 0;
                                                                    } else {
                                                                        b11 = -1;
                                                                    }
                                                                    if (b11 != 0) {
                                                                        i15 = 2;
                                                                    } else {
                                                                        i15 = 2;
                                                                    }
                                                                } else {
                                                                    i15 = Integer.MIN_VALUE;
                                                                }
                                                                zzaomVar = new zzaom(strZzc2, f16, f14, 0, i14, f12, f13, 1, f19, i15);
                                                                if (zzaomVar != null) {
                                                                    map5 = map3;
                                                                    map5.put(zzaomVar.zza, zzaomVar);
                                                                } else {
                                                                    map5 = map3;
                                                                }
                                                                map = map7;
                                                                str11 = str12;
                                                                str10 = str13;
                                                            }
                                                            zzaomVar = null;
                                                            if (zzaomVar != null) {
                                                                map5 = map3;
                                                                map5.put(zzaomVar.zza, zzaomVar);
                                                            } else {
                                                                map5 = map3;
                                                            }
                                                            map = map7;
                                                            str11 = str12;
                                                            str10 = str13;
                                                        } else {
                                                            map2 = map6;
                                                            str8 = str3;
                                                            str9 = str5;
                                                            str10 = str4;
                                                            if (zzft.zzb(xmlPullParserNewPullParser, str10)) {
                                                                while (true) {
                                                                    xmlPullParserNewPullParser.next();
                                                                    str11 = str8;
                                                                    if (zzft.zzb(xmlPullParserNewPullParser, str11)) {
                                                                        map = map2;
                                                                    } else {
                                                                        map = map2;
                                                                    }
                                                                    if (zzft.zza(xmlPullParserNewPullParser, str10)) {
                                                                        str8 = str11;
                                                                        map2 = map;
                                                                    }
                                                                }
                                                            } else {
                                                                map = map2;
                                                                str11 = str8;
                                                            }
                                                        }
                                                    }
                                                    str14 = str6;
                                                    if (zzft.zza(xmlPullParserNewPullParser, str14)) {
                                                        zzaojVar = zzaojVar3;
                                                        arrayDeque = arrayDeque2;
                                                    } else {
                                                        str6 = str14;
                                                        str3 = str11;
                                                        map6 = map;
                                                        str5 = str9;
                                                        str17 = str17;
                                                        str4 = str10;
                                                    }
                                                }
                                            } else {
                                                str17 = str17;
                                                map = map6;
                                                obj = "region";
                                                try {
                                                    attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                                    zzaoo zzaooVarZzd2 = zzd(xmlPullParserNewPullParser, null);
                                                    strArr = null;
                                                    strSubstring = null;
                                                    str7 = str;
                                                    i13 = 0;
                                                    jZzg = -9223372036854775807L;
                                                    jZzg2 = -9223372036854775807L;
                                                    jZzg3 = -9223372036854775807L;
                                                    while (i13 < attributeCount) {
                                                        try {
                                                            attributeName = xmlPullParserNewPullParser.getAttributeName(i13);
                                                            attributeValue = xmlPullParserNewPullParser.getAttributeValue(i13);
                                                            int i30 = attributeCount;
                                                            switch (attributeName.hashCode()) {
                                                                case -934795532:
                                                                    obj2 = obj;
                                                                    if (attributeName.equals(obj2)) {
                                                                        b10 = 4;
                                                                    } else {
                                                                        b10 = -1;
                                                                    }
                                                                    break;
                                                                case 99841:
                                                                    if (attributeName.equals("dur")) {
                                                                        obj2 = obj;
                                                                        b10 = 2;
                                                                    } else {
                                                                        obj2 = obj;
                                                                        b10 = -1;
                                                                    }
                                                                    break;
                                                                case 100571:
                                                                    if (attributeName.equals("end")) {
                                                                        obj2 = obj;
                                                                        b10 = 1;
                                                                    } else {
                                                                        obj2 = obj;
                                                                        b10 = -1;
                                                                    }
                                                                    break;
                                                                case 93616297:
                                                                    if (attributeName.equals("begin")) {
                                                                        obj2 = obj;
                                                                        b10 = 0;
                                                                    } else {
                                                                        obj2 = obj;
                                                                        b10 = -1;
                                                                    }
                                                                    break;
                                                                case 109780401:
                                                                    if (attributeName.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                                                        obj2 = obj;
                                                                        b10 = 3;
                                                                    } else {
                                                                        obj2 = obj;
                                                                        b10 = -1;
                                                                    }
                                                                    break;
                                                                case 1292595405:
                                                                    if (attributeName.equals("backgroundImage")) {
                                                                        obj2 = obj;
                                                                        b10 = 5;
                                                                    } else {
                                                                        obj2 = obj;
                                                                        b10 = -1;
                                                                    }
                                                                    break;
                                                                default:
                                                                    obj2 = obj;
                                                                    b10 = -1;
                                                                    break;
                                                            }
                                                            if (b10 != 0) {
                                                                attributeCount = 1;
                                                                if (b10 != 1) {
                                                                    zzaojVar = zzaojVar3;
                                                                    jZzg = zzg(attributeValue, zzaojVar);
                                                                } else if (b10 != 2) {
                                                                    if (b10 != 3) {
                                                                        attributeCount = 1;
                                                                        strArrZzc = zzc(attributeValue);
                                                                        if (strArrZzc.length > 0) {
                                                                            strArr = strArrZzc;
                                                                        }
                                                                    } else if (b10 != 4) {
                                                                        attributeCount = 1;
                                                                        if (map5.containsKey(attributeValue)) {
                                                                            str7 = attributeValue;
                                                                        }
                                                                    } else if (b10 != 5) {
                                                                        attributeCount = 1;
                                                                    } else {
                                                                        try {
                                                                            if (attributeValue.startsWith("#")) {
                                                                                attributeCount = 1;
                                                                                try {
                                                                                    strSubstring = attributeValue.substring(1);
                                                                                } catch (zzanh e10) {
                                                                                    e = e10;
                                                                                    zzanhVar = e;
                                                                                    zzaojVar = zzaojVar3;
                                                                                    arrayDeque = arrayDeque2;
                                                                                    zzeg.zzd("TtmlParser", "Suppressing parser error", zzanhVar);
                                                                                    i18 = attributeCount;
                                                                                    zzaojVar3 = zzaojVar;
                                                                                    zzaokVar2 = zzaokVar;
                                                                                    i19 = i12;
                                                                                    zzaopVar = zzaopVar;
                                                                                    xmlPullParserNewPullParser.next();
                                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                                    arrayDeque2 = arrayDeque;
                                                                                    map6 = map;
                                                                                    str15 = str;
                                                                                    zzaojVar2 = zzaojVar2;
                                                                                    str16 = str2;
                                                                                    str17 = str17;
                                                                                }
                                                                            } else {
                                                                                attributeCount = 1;
                                                                            }
                                                                        } catch (zzanh e11) {
                                                                            e = e11;
                                                                            attributeCount = 1;
                                                                        }
                                                                    }
                                                                    zzaojVar = zzaojVar3;
                                                                } else {
                                                                    zzaojVar = zzaojVar3;
                                                                    attributeCount = 1;
                                                                    jZzg3 = zzg(attributeValue, zzaojVar);
                                                                }
                                                            } else {
                                                                zzaojVar = zzaojVar3;
                                                                attributeCount = 1;
                                                                jZzg2 = zzg(attributeValue, zzaojVar);
                                                            }
                                                            try {
                                                                i13++;
                                                                zzaojVar3 = zzaojVar;
                                                                obj = obj2;
                                                                attributeCount = i30;
                                                                zzaojVar = null;
                                                            } catch (zzanh e12) {
                                                                e = e12;
                                                                zzanhVar = e;
                                                                arrayDeque = arrayDeque2;
                                                                zzeg.zzd("TtmlParser", "Suppressing parser error", zzanhVar);
                                                                i18 = attributeCount;
                                                                zzaojVar3 = zzaojVar;
                                                                zzaokVar2 = zzaokVar;
                                                                i19 = i12;
                                                                zzaopVar = zzaopVar;
                                                                xmlPullParserNewPullParser.next();
                                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                                arrayDeque2 = arrayDeque;
                                                                map6 = map;
                                                                str15 = str;
                                                                zzaojVar2 = zzaojVar2;
                                                                str16 = str2;
                                                                str17 = str17;
                                                            }
                                                        } catch (zzanh e13) {
                                                            e = e13;
                                                            zzaojVar = zzaojVar3;
                                                            attributeCount = 1;
                                                        }
                                                    }
                                                    zzaojVar = zzaojVar3;
                                                    attributeCount = 1;
                                                    try {
                                                        try {
                                                            if (zzaoiVar3 != null) {
                                                                zzaoiVar = zzaoiVar3;
                                                                j13 = zzaoiVar.zzd;
                                                                if (j13 != -9223372036854775807L) {
                                                                    if (jZzg2 != -9223372036854775807L) {
                                                                        j10 = jZzg2 + j13;
                                                                    } else {
                                                                        j10 = -9223372036854775807L;
                                                                    }
                                                                    if (jZzg != -9223372036854775807L) {
                                                                        jZzg += j13;
                                                                        zzaoiVar2 = zzaoiVar;
                                                                    } else {
                                                                        zzaoiVar2 = zzaoiVar;
                                                                        j11 = -9223372036854775807L;
                                                                        jZzg = -9223372036854775807L;
                                                                    }
                                                                    if (jZzg != j11) {
                                                                        j12 = jZzg;
                                                                    } else if (jZzg3 != j11) {
                                                                        j12 = j10 + jZzg3;
                                                                    } else {
                                                                        if (zzaoiVar2 != null) {
                                                                            jZzg = zzaoiVar2.zze;
                                                                            if (jZzg != j11) {
                                                                                j12 = jZzg;
                                                                            }
                                                                        }
                                                                        j12 = j11;
                                                                    }
                                                                    zzaoiVarZzb = zzaoi.zzb(xmlPullParserNewPullParser.getName(), j10, j12, zzaooVarZzd2, strArr, str7, strSubstring, zzaoiVar2);
                                                                    arrayDeque = arrayDeque2;
                                                                    arrayDeque.push(zzaoiVarZzb);
                                                                    if (zzaoiVar != null) {
                                                                        zzaoiVar.zzd(zzaoiVarZzb);
                                                                    }
                                                                } else {
                                                                    zzaoiVar2 = zzaoiVar;
                                                                    j10 = jZzg2;
                                                                }
                                                            } else {
                                                                zzaoiVar = zzaoiVar3;
                                                                j10 = jZzg2;
                                                                zzaoiVar2 = null;
                                                            }
                                                            arrayDeque.push(zzaoiVarZzb);
                                                            if (zzaoiVar != null) {
                                                                zzaoiVar.zzd(zzaoiVarZzb);
                                                            }
                                                        } catch (zzanh e14) {
                                                            e = e14;
                                                            zzanhVar = e;
                                                            zzeg.zzd("TtmlParser", "Suppressing parser error", zzanhVar);
                                                            i18 = attributeCount;
                                                        }
                                                        zzaoiVarZzb = zzaoi.zzb(xmlPullParserNewPullParser.getName(), j10, j12, zzaooVarZzd2, strArr, str7, strSubstring, zzaoiVar2);
                                                        arrayDeque = arrayDeque2;
                                                    } catch (zzanh e15) {
                                                        e = e15;
                                                        arrayDeque = arrayDeque2;
                                                    }
                                                    j11 = -9223372036854775807L;
                                                    if (jZzg != j11) {
                                                        j12 = jZzg;
                                                    } else if (jZzg3 != j11) {
                                                        j12 = j10 + jZzg3;
                                                    } else {
                                                        if (zzaoiVar2 != null) {
                                                            jZzg = zzaoiVar2.zze;
                                                            if (jZzg != j11) {
                                                                j12 = jZzg;
                                                            }
                                                        }
                                                        j12 = j11;
                                                    }
                                                } catch (zzanh e16) {
                                                    e = e16;
                                                    zzaojVar = zzaojVar3;
                                                    arrayDeque = arrayDeque2;
                                                    attributeCount = 1;
                                                }
                                            }
                                            zzaojVar3 = zzaojVar;
                                            zzaokVar2 = zzaokVar;
                                            i19 = i12;
                                            zzaopVar = zzaopVar;
                                            xmlPullParserNewPullParser.next();
                                            eventType = xmlPullParserNewPullParser.getEventType();
                                            arrayDeque2 = arrayDeque;
                                            map6 = map;
                                            str15 = str;
                                            zzaojVar2 = zzaojVar2;
                                            str16 = str2;
                                            str17 = str17;
                                        }
                                    } catch (NumberFormatException unused8) {
                                        str2 = str16;
                                    }
                                } else {
                                    zzeg.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                    str2 = str16;
                                    zzaojVar3 = zzaojVar3;
                                    i19 = 15;
                                }
                            }
                            strZzc10 = zzft.zzc(xmlPullParserNewPullParser, "extent");
                            if (strZzc10 == null) {
                                zzaokVar2 = null;
                            } else {
                                matcher5 = zzf.matcher(strZzc10);
                                if (matcher5.matches()) {
                                    zzeg.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc10));
                                } else {
                                    String strGroup13 = matcher5.group(1);
                                    strGroup13.getClass();
                                    int i210 = Integer.parseInt(strGroup13);
                                    String strGroup14 = matcher5.group(2);
                                    strGroup14.getClass();
                                    zzaokVar2 = new zzaok(i210, Integer.parseInt(strGroup14));
                                }
                                zzaokVar2 = null;
                            }
                        } else {
                            str2 = str16;
                            arrayDeque2 = arrayDeque2;
                            zzaojVar2 = zzaojVar2;
                            zzaopVar = zzaopVar;
                        }
                        zzaokVar = zzaokVar2;
                        i12 = i19;
                        str3 = "image";
                        str4 = "metadata";
                        str5 = "region";
                        str6 = "head";
                        zzaojVar3 = zzaojVar3;
                        if (!name.equals("tt") || name.equals("head") || name.equals(SDKConstants.PARAM_A2U_BODY) || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE) || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzft.zzb(xmlPullParserNewPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                        strZzc9 = zzft.zzc(xmlPullParserNewPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
                                        zzaooVarZzd = zzd(xmlPullParserNewPullParser, new zzaoo());
                                        if (strZzc9 != null) {
                                            strArrZzc2 = zzc(strZzc9);
                                            i16 = 0;
                                            while (i16 < length) {
                                                zzaooVarZzd.zzr((zzaoo) map4.get(strArrZzc2[i16]));
                                                i16++;
                                            }
                                        }
                                        strZzt = zzaooVarZzd.zzt();
                                        if (strZzt != null) {
                                            map4.put(strZzt, zzaooVarZzd);
                                        }
                                        str10 = str4;
                                        str9 = str5;
                                        map = map6;
                                        str11 = str3;
                                    } else {
                                        str17 = str17;
                                        str6 = str6;
                                        if (zzft.zzb(xmlPullParserNewPullParser, str5)) {
                                            str9 = str5;
                                            HashMap map8 = map6;
                                            strZzc2 = zzft.zzc(xmlPullParserNewPullParser, "id");
                                            if (strZzc2 == null) {
                                                map3 = map5;
                                                str12 = str3;
                                                str13 = str4;
                                            } else {
                                                strZzc3 = zzft.zzc(xmlPullParserNewPullParser, "origin");
                                                if (strZzc3 == null || (strZzc8 = zzft.zzc(xmlPullParserNewPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) == null || (zzaooVar2 = (zzaoo) map4.get(strZzc8)) == null) {
                                                    strZzL = strZzc3;
                                                } else {
                                                    strZzL = zzaooVar2.zzL();
                                                }
                                                if (strZzL != null) {
                                                    str12 = str3;
                                                    matcher3 = zzb.matcher(strZzL);
                                                    str13 = str4;
                                                    matcher4 = zzf.matcher(strZzL);
                                                    if (matcher3.matches()) {
                                                        map3 = map5;
                                                        String strGroup15 = matcher3.group(1);
                                                        strGroup15.getClass();
                                                        f11 = Float.parseFloat(strGroup15) / 100.0f;
                                                        String strGroup16 = matcher3.group(2);
                                                        strGroup16.getClass();
                                                        f10 = Float.parseFloat(strGroup16) / 100.0f;
                                                    } else {
                                                        map3 = map5;
                                                        if (matcher4.matches()) {
                                                            zzeg.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                        } else if (zzaokVar == null) {
                                                            zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                        } else {
                                                            String strGroup17 = matcher4.group(1);
                                                            strGroup17.getClass();
                                                            int i211 = Integer.parseInt(strGroup17);
                                                            String strGroup18 = matcher4.group(2);
                                                            strGroup18.getClass();
                                                            int i212 = Integer.parseInt(strGroup18);
                                                            f11 = i211 / zzaokVar.zza;
                                                            f10 = i212 / zzaokVar.zzb;
                                                        }
                                                    }
                                                } else {
                                                    map3 = map5;
                                                    str12 = str3;
                                                    str13 = str4;
                                                    f10 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                float f110 = f11;
                                                strZzc4 = zzft.zzc(xmlPullParserNewPullParser, "extent");
                                                if (strZzc4 == null && (strZzc7 = zzft.zzc(xmlPullParserNewPullParser, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) != null && (zzaooVar = (zzaoo) map4.get(strZzc7)) != null) {
                                                    strZzc4 = zzaooVar.zzN();
                                                }
                                                if (strZzc4 != null) {
                                                    matcher = zzb.matcher(strZzc4);
                                                    matcher2 = zzf.matcher(strZzc4);
                                                    if (matcher.matches()) {
                                                        String strGroup19 = matcher.group(1);
                                                        strGroup19.getClass();
                                                        float f111 = Float.parseFloat(strGroup19) / 100.0f;
                                                        String strGroup110 = matcher.group(2);
                                                        strGroup110.getClass();
                                                        f13 = Float.parseFloat(strGroup110) / 100.0f;
                                                        f12 = f111;
                                                    } else if (matcher2.matches()) {
                                                        zzeg.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                    } else if (zzaokVar == null) {
                                                        zzeg.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                    } else {
                                                        String strGroup111 = matcher2.group(1);
                                                        strGroup111.getClass();
                                                        int i213 = Integer.parseInt(strGroup111);
                                                        String strGroup112 = matcher2.group(2);
                                                        strGroup112.getClass();
                                                        int i214 = Integer.parseInt(strGroup112);
                                                        float f112 = i213 / zzaokVar.zza;
                                                        f13 = i214 / zzaokVar.zzb;
                                                        f12 = f112;
                                                    }
                                                    if (zzaomVar != null) {
                                                        map5 = map3;
                                                        map5.put(zzaomVar.zza, zzaomVar);
                                                    } else {
                                                        map5 = map3;
                                                    }
                                                    map = map8;
                                                    str11 = str12;
                                                    str10 = str13;
                                                } else {
                                                    f12 = 1.0f;
                                                    f13 = 1.0f;
                                                }
                                                strZzc5 = zzft.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                if (strZzc5 != null) {
                                                    strZza2 = zzgss.zza(strZzc5);
                                                    iHashCode2 = strZza2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940 && strZza2.equals(cNMUz.TDEKx)) {
                                                            b12 = 1;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                    } else if (strZza2.equals("center")) {
                                                        b12 = 0;
                                                    } else {
                                                        b12 = -1;
                                                    }
                                                    if (b12 != 0) {
                                                        f14 = f10 + (f13 / 2.0f);
                                                        i14 = 1;
                                                    } else if (b12 != 1) {
                                                        f14 = f10;
                                                        i14 = 0;
                                                    } else {
                                                        f14 = f10 + f13;
                                                        i14 = 2;
                                                    }
                                                } else {
                                                    f14 = f10;
                                                    i14 = 0;
                                                }
                                                float f113 = 1.0f / i12;
                                                strZzc6 = zzft.zzc(xmlPullParserNewPullParser, "writingMode");
                                                if (strZzc6 != null) {
                                                    strZza = zzgss.zza(strZzc6);
                                                    iHashCode = strZza.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode != 3553576 && strZza.equals("tbrl")) {
                                                                b11 = 2;
                                                            } else {
                                                                b11 = -1;
                                                            }
                                                        } else if (strZza.equals("tblr")) {
                                                            b11 = 1;
                                                        } else {
                                                            b11 = -1;
                                                        }
                                                    } else if (strZza.equals("tb")) {
                                                        b11 = 0;
                                                    } else {
                                                        b11 = -1;
                                                    }
                                                    if (b11 != 0 || b11 == 1) {
                                                        i15 = 2;
                                                    } else if (b11 != 2) {
                                                        i15 = Integer.MIN_VALUE;
                                                    } else {
                                                        i15 = 1;
                                                    }
                                                } else {
                                                    i15 = Integer.MIN_VALUE;
                                                }
                                                zzaomVar = new zzaom(strZzc2, f110, f14, 0, i14, f12, f13, 1, f113, i15);
                                                if (zzaomVar != null) {
                                                    map5 = map3;
                                                    map5.put(zzaomVar.zza, zzaomVar);
                                                } else {
                                                    map5 = map3;
                                                }
                                                map = map8;
                                                str11 = str12;
                                                str10 = str13;
                                            }
                                            zzaomVar = null;
                                            if (zzaomVar != null) {
                                                map5 = map3;
                                                map5.put(zzaomVar.zza, zzaomVar);
                                            } else {
                                                map5 = map3;
                                            }
                                            map = map8;
                                            str11 = str12;
                                            str10 = str13;
                                        } else {
                                            map2 = map6;
                                            str8 = str3;
                                            str9 = str5;
                                            str10 = str4;
                                            if (zzft.zzb(xmlPullParserNewPullParser, str10)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str11 = str8;
                                                    if (zzft.zzb(xmlPullParserNewPullParser, str11) || (strZzc = zzft.zzc(xmlPullParserNewPullParser, "id")) == null) {
                                                        map = map2;
                                                    } else {
                                                        map = map2;
                                                        map.put(strZzc, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (zzft.zza(xmlPullParserNewPullParser, str10)) {
                                                        str8 = str11;
                                                        map2 = map;
                                                    }
                                                }
                                            } else {
                                                map = map2;
                                                str11 = str8;
                                            }
                                        }
                                    }
                                    str14 = str6;
                                    if (zzft.zza(xmlPullParserNewPullParser, str14)) {
                                        zzaojVar = zzaojVar3;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        str6 = str14;
                                        str3 = str11;
                                        map6 = map;
                                        str5 = str9;
                                        str17 = str17;
                                        str4 = str10;
                                    }
                                }
                            } else {
                                str17 = str17;
                                map = map6;
                                obj = "region";
                                attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                zzaoo zzaooVarZzd3 = zzd(xmlPullParserNewPullParser, null);
                                strArr = null;
                                strSubstring = null;
                                str7 = str;
                                i13 = 0;
                                jZzg = -9223372036854775807L;
                                jZzg2 = -9223372036854775807L;
                                jZzg3 = -9223372036854775807L;
                                while (i13 < attributeCount) {
                                    attributeName = xmlPullParserNewPullParser.getAttributeName(i13);
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(i13);
                                    int i31 = attributeCount;
                                    switch (attributeName.hashCode()) {
                                        case -934795532:
                                            obj2 = obj;
                                            if (attributeName.equals(obj2)) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 99841:
                                            if (attributeName.equals("dur")) {
                                                obj2 = obj;
                                                b10 = 2;
                                            } else {
                                                obj2 = obj;
                                                b10 = -1;
                                            }
                                            break;
                                        case 100571:
                                            if (attributeName.equals("end")) {
                                                obj2 = obj;
                                                b10 = 1;
                                            } else {
                                                obj2 = obj;
                                                b10 = -1;
                                            }
                                            break;
                                        case 93616297:
                                            if (attributeName.equals("begin")) {
                                                obj2 = obj;
                                                b10 = 0;
                                            } else {
                                                obj2 = obj;
                                                b10 = -1;
                                            }
                                            break;
                                        case 109780401:
                                            if (attributeName.equals(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)) {
                                                obj2 = obj;
                                                b10 = 3;
                                            } else {
                                                obj2 = obj;
                                                b10 = -1;
                                            }
                                            break;
                                        case 1292595405:
                                            if (attributeName.equals("backgroundImage")) {
                                                obj2 = obj;
                                                b10 = 5;
                                            } else {
                                                obj2 = obj;
                                                b10 = -1;
                                            }
                                            break;
                                        default:
                                            obj2 = obj;
                                            b10 = -1;
                                            break;
                                    }
                                    if (b10 != 0) {
                                        attributeCount = 1;
                                        if (b10 != 1) {
                                            zzaojVar = zzaojVar3;
                                            jZzg = zzg(attributeValue, zzaojVar);
                                        } else if (b10 != 2) {
                                            if (b10 != 3) {
                                                attributeCount = 1;
                                                strArrZzc = zzc(attributeValue);
                                                if (strArrZzc.length > 0) {
                                                    strArr = strArrZzc;
                                                }
                                            } else if (b10 != 4) {
                                                attributeCount = 1;
                                                if (map5.containsKey(attributeValue)) {
                                                    str7 = attributeValue;
                                                }
                                            } else if (b10 != 5) {
                                                attributeCount = 1;
                                            } else if (attributeValue.startsWith("#")) {
                                                attributeCount = 1;
                                                strSubstring = attributeValue.substring(1);
                                            } else {
                                                attributeCount = 1;
                                            }
                                            zzaojVar = zzaojVar3;
                                        } else {
                                            zzaojVar = zzaojVar3;
                                            attributeCount = 1;
                                            jZzg3 = zzg(attributeValue, zzaojVar);
                                        }
                                    } else {
                                        zzaojVar = zzaojVar3;
                                        attributeCount = 1;
                                        jZzg2 = zzg(attributeValue, zzaojVar);
                                    }
                                    i13++;
                                    zzaojVar3 = zzaojVar;
                                    obj = obj2;
                                    attributeCount = i31;
                                    zzaojVar = null;
                                }
                                zzaojVar = zzaojVar3;
                                attributeCount = 1;
                                if (zzaoiVar3 != null) {
                                    zzaoiVar = zzaoiVar3;
                                    j13 = zzaoiVar.zzd;
                                    if (j13 != -9223372036854775807L) {
                                        if (jZzg2 != -9223372036854775807L) {
                                            j10 = jZzg2 + j13;
                                        } else {
                                            j10 = -9223372036854775807L;
                                        }
                                        if (jZzg != -9223372036854775807L) {
                                            jZzg += j13;
                                            zzaoiVar2 = zzaoiVar;
                                        } else {
                                            zzaoiVar2 = zzaoiVar;
                                            j11 = -9223372036854775807L;
                                            jZzg = -9223372036854775807L;
                                        }
                                        if (jZzg != j11) {
                                            j12 = jZzg;
                                        } else if (jZzg3 != j11) {
                                            j12 = j10 + jZzg3;
                                        } else {
                                            if (zzaoiVar2 != null) {
                                                jZzg = zzaoiVar2.zze;
                                                if (jZzg != j11) {
                                                    j12 = jZzg;
                                                }
                                            }
                                            j12 = j11;
                                        }
                                        zzaoiVarZzb = zzaoi.zzb(xmlPullParserNewPullParser.getName(), j10, j12, zzaooVarZzd3, strArr, str7, strSubstring, zzaoiVar2);
                                        arrayDeque = arrayDeque2;
                                        arrayDeque.push(zzaoiVarZzb);
                                        if (zzaoiVar != null) {
                                            zzaoiVar.zzd(zzaoiVarZzb);
                                        }
                                    } else {
                                        zzaoiVar2 = zzaoiVar;
                                        j10 = jZzg2;
                                    }
                                } else {
                                    zzaoiVar = zzaoiVar3;
                                    j10 = jZzg2;
                                    zzaoiVar2 = null;
                                }
                                j11 = -9223372036854775807L;
                                if (jZzg != j11) {
                                    j12 = jZzg;
                                } else if (jZzg3 != j11) {
                                    j12 = j10 + jZzg3;
                                } else {
                                    if (zzaoiVar2 != null) {
                                        jZzg = zzaoiVar2.zze;
                                        if (jZzg != j11) {
                                            j12 = jZzg;
                                        }
                                    }
                                    j12 = j11;
                                }
                                zzaoiVarZzb = zzaoi.zzb(xmlPullParserNewPullParser.getName(), j10, j12, zzaooVarZzd3, strArr, str7, strSubstring, zzaoiVar2);
                                arrayDeque = arrayDeque2;
                                arrayDeque.push(zzaoiVarZzb);
                                if (zzaoiVar != null) {
                                    zzaoiVar.zzd(zzaoiVarZzb);
                                }
                            }
                            zzaojVar3 = zzaojVar;
                            zzaokVar2 = zzaokVar;
                            i19 = i12;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb2.append(str17);
                            sb2.append(name2);
                            zzeg.zzb("TtmlParser", sb2.toString());
                            str17 = str17;
                            zzaokVar2 = zzaokVar;
                            map = map6;
                            i19 = i12;
                            zzaopVar = zzaopVar;
                            arrayDeque = arrayDeque2;
                            i18 = 1;
                        }
                    } else {
                        str2 = str16;
                        str17 = str17;
                        zzaojVar2 = zzaojVar2;
                        zzaopVar = zzaopVar;
                        map = map6;
                        arrayDeque = arrayDeque2;
                        if (eventType == 4) {
                            zzaoiVar3.getClass();
                            zzaoiVar3.zzd(zzaoi.zza(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                zzaoi zzaoiVar4 = (zzaoi) arrayDeque.peek();
                                zzaoiVar4.getClass();
                                zzaopVar = new zzaop(zzaoiVar4, map4, map5, map);
                            } else {
                                zzaopVar = zzaopVar;
                            }
                            arrayDeque.pop();
                        }
                    }
                    xmlPullParserNewPullParser.next();
                    eventType = xmlPullParserNewPullParser.getEventType();
                    arrayDeque2 = arrayDeque;
                    map6 = map;
                    str15 = str;
                    zzaojVar2 = zzaojVar2;
                    str16 = str2;
                    str17 = str17;
                } else {
                    str = str15;
                    str2 = str16;
                    str17 = str17;
                    arrayDeque = arrayDeque2;
                    zzaojVar2 = zzaojVar2;
                    zzaopVar = zzaopVar;
                    map = map6;
                    if (eventType == 2) {
                        i18++;
                    } else if (eventType == 3) {
                        i18--;
                    }
                }
                zzaopVar = zzaopVar;
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque2 = arrayDeque;
                map6 = map;
                str15 = str;
                zzaojVar2 = zzaojVar2;
                str16 = str2;
                str17 = str17;
            }
            zzaop zzaopVar2 = zzaopVar;
            zzaopVar2.getClass();
            return zzaopVar2;
        } catch (IOException e17) {
            throw new IllegalStateException("Unexpected error when reading input.", e17);
        } catch (XmlPullParserException e18) {
            throw new IllegalStateException("Unable to decode source", e18);
        }
    }
}

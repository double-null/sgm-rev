package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaob implements zzanl {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzaoa zzc;
    private final zzet zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaob() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zzb(zzet zzetVar, Charset charset) {
        while (true) {
            String strZzN = zzetVar.zzN(charset);
            if (strZzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                while (true) {
                    String strZzN2 = zzetVar.zzN(charset);
                    if (strZzN2 == null || (zzetVar.zzd() != 0 && zzetVar.zzp(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strZzN2.split(":");
                    if (strArrSplit.length == 2) {
                        byte b10 = 0;
                        String strZza = zzgss.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    b10 = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            this.zzf = Float.parseFloat(strArrSplit[1].trim());
                        } else if (b10 == 1) {
                            try {
                                this.zzg = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzaoc zzaocVarZza = null;
                while (true) {
                    String strZzN3 = zzetVar.zzN(charset);
                    if (strZzN3 != null && (zzetVar.zzd() == 0 || zzetVar.zzp(charset) != 91)) {
                        if (strZzN3.startsWith("Format:")) {
                            zzaocVarZza = zzaoc.zza(strZzN3);
                        } else if (strZzN3.startsWith("Style:")) {
                            if (zzaocVarZza == null) {
                                zzeg.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                            } else {
                                zzaoe zzaoeVarZza = zzaoe.zza(strZzN3, zzaocVarZza);
                                if (zzaoeVarZza != null) {
                                    linkedHashMap.put(zzaoeVarZza.zza, zzaoeVarZza);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                zzeg.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                return;
            }
        }
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfl.zza;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j10, List list, List list2) {
        int i10;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i10, int i11, zzank zzankVar, zzdt zzdtVar) {
        zzaoa zzaoaVarZza;
        int i12;
        zzaoa zzaoaVar;
        int i13;
        int i14;
        Layout.Alignment alignment;
        int i15;
        int i16;
        int i17;
        Integer num;
        int i18;
        zzaob zzaobVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzet zzetVar = zzaobVar.zzd;
        zzetVar.zzb(bArr, i10 + i11);
        zzetVar.zzh(i10);
        Charset charsetZzR = zzetVar.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        if (zzaobVar.zzb) {
            zzaoaVarZza = zzaobVar.zzc;
        } else {
            zzaobVar.zzb(zzetVar, charsetZzR);
            zzaoaVarZza = null;
        }
        while (true) {
            String strZzN = zzetVar.zzN(charsetZzR);
            if (strZzN == null) {
                int i19 = 0;
                while (i19 < arrayList.size()) {
                    List list = (List) arrayList.get(i19);
                    if (!list.isEmpty()) {
                        if (i19 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i19)).longValue();
                        zzdtVar.zza(new zzand(list, jLongValue, ((Long) arrayList2.get(i19 + 1)).longValue() - jLongValue));
                        i12 = 1;
                    } else if (i19 != 0) {
                        i12 = 1;
                    } else {
                        i19 = 0;
                        if (i19 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue2 = ((Long) arrayList2.get(i19)).longValue();
                        zzdtVar.zza(new zzand(list, jLongValue2, ((Long) arrayList2.get(i19 + 1)).longValue() - jLongValue2));
                        i12 = 1;
                    }
                    i19 += i12;
                }
                return;
            }
            if (strZzN.startsWith("Format:")) {
                zzaoaVarZza = zzaoa.zza(strZzN);
            } else {
                if (strZzN.startsWith("Dialogue:")) {
                    if (zzaoaVarZza == null) {
                        zzeg.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzN));
                    } else {
                        zzgtj.zza(strZzN.startsWith("Dialogue:"));
                        String strSubstring = strZzN.substring(9);
                        int i20 = zzaoaVarZza.zzf;
                        String[] strArrSplit = strSubstring.split(",", i20);
                        if (strArrSplit.length != i20) {
                            zzeg.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzN));
                        } else {
                            int i21 = zzaoaVarZza.zza;
                            if (i21 != -1) {
                                try {
                                    i13 = Integer.parseInt(strArrSplit[i21].trim());
                                } catch (RuntimeException unused) {
                                    zzeg.zzc("SsaParser", "Fail to parse layer: ".concat(String.valueOf(strArrSplit[zzaoaVarZza.zza])));
                                    i13 = 0;
                                }
                            } else {
                                i13 = 0;
                            }
                            long jZzc = zzc(strArrSplit[zzaoaVarZza.zzb]);
                            if (jZzc == -9223372036854775807L) {
                                zzeg.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                            } else {
                                long jZzc2 = zzc(strArrSplit[zzaoaVarZza.zzc]);
                                if (jZzc2 == -9223372036854775807L || jZzc2 <= jZzc) {
                                    zzaoaVar = zzaoaVarZza;
                                    zzetVar = zzetVar;
                                    zzeg.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                                } else {
                                    Map map = zzaobVar.zze;
                                    zzaoe zzaoeVar = (map == null || (i18 = zzaoaVarZza.zzd) == -1) ? null : (zzaoe) map.get(strArrSplit[i18].trim());
                                    String str = strArrSplit[zzaoaVarZza.zze];
                                    zzaod zzaodVarZza = zzaod.zza(str);
                                    String strReplace = zzaod.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f10 = zzaobVar.zzf;
                                    float f11 = zzaobVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcw zzcwVar = new zzcw();
                                    zzcwVar.zza(spannableString);
                                    zzcwVar.zzq(i13);
                                    if (zzaoeVar != null) {
                                        Integer num2 = zzaoeVar.zzc;
                                        zzaoaVar = zzaoaVarZza;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzaoeVar.zzj == 3 && (num = zzaoeVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f12 = zzaoeVar.zze;
                                        if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                                            zzcwVar.zzl(f12 / f11, 1);
                                        }
                                        boolean z10 = zzaoeVar.zzf;
                                        if (z10 && zzaoeVar.zzg) {
                                            i16 = 33;
                                            i17 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i16 = 33;
                                            i17 = 0;
                                            if (z10) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else {
                                                if (zzaoeVar.zzg) {
                                                    i14 = 2;
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                                if (zzaoeVar.zzh) {
                                                    spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i16);
                                                }
                                                if (zzaoeVar.zzi) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i16);
                                                }
                                            }
                                        }
                                        i14 = 2;
                                        if (zzaoeVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i17, spannableString.length(), i16);
                                        }
                                        if (zzaoeVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i17, spannableString.length(), i16);
                                        }
                                    } else {
                                        zzaoaVar = zzaoaVarZza;
                                        zzetVar = zzetVar;
                                        jZzc2 = jZzc2;
                                        i14 = 2;
                                    }
                                    int i22 = zzaodVarZza.zza;
                                    if (i22 == -1) {
                                        i22 = zzaoeVar != null ? zzaoeVar.zzb : -1;
                                    }
                                    switch (i22) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i22).length() + 19);
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i22);
                                            zzeg.zzc("SsaParser", sb2.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcwVar.zzd(alignment);
                                    int i23 = Integer.MIN_VALUE;
                                    switch (i22) {
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i22).length() + 19);
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i22);
                                            zzeg.zzc("SsaParser", sb3.toString());
                                        case -1:
                                            i15 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i15 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i15 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i15 = i14;
                                            break;
                                    }
                                    zzcwVar.zzj(i15);
                                    switch (i22) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(i22).length() + 19);
                                            sb4.append("Unknown alignment: ");
                                            sb4.append(i22);
                                            zzeg.zzc("SsaParser", sb4.toString());
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i23 = i14;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i23 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i23 = 0;
                                            break;
                                    }
                                    zzcwVar.zzg(i23);
                                    PointF pointF = zzaodVarZza.zzb;
                                    if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                        zzcwVar.zzi(zzd(zzcwVar.zzk()));
                                        zzcwVar.zzf(zzd(zzcwVar.zzh()), 0);
                                    } else {
                                        zzcwVar.zzi(pointF.x / f10);
                                        zzcwVar.zzf(pointF.y / f11, 0);
                                    }
                                    zzcx zzcxVarZzr = zzcwVar.zzr();
                                    int iZze = zze(jZzc2, arrayList2, arrayList);
                                    for (int iZze2 = zze(jZzc, arrayList2, arrayList); iZze2 < iZze; iZze2++) {
                                        ((List) arrayList.get(iZze2)).add(zzcxVarZzr);
                                    }
                                }
                            }
                        }
                    }
                    zzaoaVar = zzaoaVarZza;
                    zzetVar = zzetVar;
                } else {
                    zzaoaVar = zzaoaVarZza;
                    zzetVar = zzetVar;
                }
                zzaobVar = this;
                charsetZzR = charsetZzR;
                zzaoaVarZza = zzaoaVar;
                zzetVar = zzetVar;
            }
        }
    }

    public zzaob(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzet();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzj = zzfl.zzj((byte[]) list.get(0));
        zzgtj.zza(strZzj.startsWith("Format:"));
        zzaoa zzaoaVarZza = zzaoa.zza(strZzj);
        zzaoaVarZza.getClass();
        this.zzc = zzaoaVarZza;
        zzb(new zzet((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}

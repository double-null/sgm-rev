package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaoh {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgww zze = zzgww.zzj("auto", "none");
    private static final zzgww zzf = zzgww.zzk("dot", "sesame", "circle");
    private static final zzgww zzg = zzgww.zzj("filled", MRAIDPresenter.OPEN);
    private static final zzgww zzh = zzgww.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaoh(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static zzaoh zza(String str) {
        byte b10;
        int i10;
        if (str == null) {
            return null;
        }
        String strZza = zzgss.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgww zzgwwVarZzq = zzgww.zzq(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgxa.zzb(zzgyw.zza(zzh, zzgwwVarZzq), "outside");
        int iHashCode = str2.hashCode();
        int i11 = -1;
        int i12 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("outside")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        zzgyv zzgyvVarZza = zzgyw.zza(zze, zzgwwVarZzq);
        if (zzgyvVarZza.isEmpty()) {
            zzgyv zzgyvVarZza2 = zzgyw.zza(zzg, zzgwwVarZzq);
            zzgyv zzgyvVarZza3 = zzgyw.zza(zzf, zzgwwVarZzq);
            if (!zzgyvVarZza2.isEmpty() || !zzgyvVarZza3.isEmpty()) {
                String str3 = (String) zzgxa.zzb(zzgyvVarZza2, "filled");
                int i13 = ((str3.hashCode() == 3417674 && str3.equals(MRAIDPresenter.OPEN)) ? (byte) 0 : (byte) -1) != 0 ? 1 : 2;
                String str4 = (String) zzgxa.zzb(zzgyvVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i11 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i11 = 1;
                }
                if (i11 == 0) {
                    i11 = 2;
                } else if (i11 != 1) {
                    i12 = i13;
                    i11 = 1;
                } else {
                    i11 = 3;
                }
                i12 = i13;
            }
        } else {
            String str5 = (String) zzgyvVarZza.iterator().next();
            if (((str5.hashCode() == 3387192 && str5.equals("none")) ? (byte) 0 : (byte) -1) == 0) {
                i11 = 0;
            }
        }
        return new zzaoh(i11, i12, i10);
    }
}

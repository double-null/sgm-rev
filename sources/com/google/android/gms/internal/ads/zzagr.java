package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzagr {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzfl.zza;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.zza = i10;
            this.zzb = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzap zzapVar) {
        zzgwm zzgwmVarZze = zzapVar.zze(zzaji.class, zzagq.zza);
        int size = zzgwmVarZze.size();
        int i10 = 0;
        while (i10 < size) {
            boolean zZzc = zzc(((zzaji) zzgwmVarZze.get(i10)).zzc);
            i10++;
            if (zZzc) {
                return true;
            }
        }
        zzgwm zzgwmVarZze2 = zzapVar.zze(zzajq.class, zzagp.zza);
        int size2 = zzgwmVarZze2.size();
        int i11 = 0;
        while (i11 < size2) {
            boolean zZzc2 = zzc(((zzajq) zzgwmVarZze2.get(i11)).zzc);
            i11++;
            if (zZzc2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}

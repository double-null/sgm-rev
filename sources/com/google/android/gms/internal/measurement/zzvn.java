package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.common.base.p;
import com.google.common.collect.c1;
import com.google.common.collect.v;
import com.google.common.collect.w;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzvn implements zzws {
    private final zzws zza;
    private final UUID zzb;
    private final String zzc;
    private final String zzd;
    private Thread zze;

    zzvn(String str, zzws zzwsVar, zzwq zzwqVar) {
        this.zzd = (String) p.l(str);
        this.zza = zzwsVar;
        this.zzb = zzwsVar.zzc();
        this.zzc = zzwsVar.zzd();
        zzxb zzxbVar = zzwqVar.zzc;
        this.zze = Thread.currentThread();
    }

    public static String zzcL(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // com.google.android.gms.internal.measurement.zzwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = zzvy.zzb;
        p.l(this);
        zzwq zzwqVarZzd = zzvy.zzd();
        zzws zzwsVar = zzwqVarZzd.zzb;
        if (zzwsVar == null) {
            String strZze = zze();
            StringBuilder sb2 = new StringBuilder(String.valueOf(strZze).length() + 101);
            sb2.append("Tried to end [");
            sb2.append(strZze);
            sb2.append("], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
            throw new zzvv(sb2.toString());
        }
        if (this == zzwsVar) {
            zzvy.zzc(zzwqVarZzd, zzwsVar.zzb());
            this.zze = null;
            return;
        }
        String strZze2 = zze();
        String strZze3 = zzwsVar.zze();
        StringBuilder sb3 = new StringBuilder(String.valueOf(strZze2).length() + 79 + String.valueOf(strZze3).length() + 1);
        sb3.append("Tried to end span ");
        sb3.append(strZze2);
        sb3.append(", but that span is not the current span. The current span is ");
        sb3.append(strZze3);
        sb3.append(".");
        throw new zzvw(sb3.toString());
    }

    public final String toString() {
        int i10 = zzvy.zzb;
        zzws zzwsVarZzb = this;
        int i11 = 0;
        int length = 0;
        while (zzwsVarZzb != null) {
            i11++;
            length += zzwsVarZzb.zze().length();
            zzwsVarZzb = zzwsVarZzb.zzb();
            if (zzwsVarZzb != null) {
                length += 4;
            }
        }
        if (i11 > 250) {
            String[] strArr = new String[i11];
            zzws zzwsVarZzb2 = this;
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                strArr[i12] = zzwsVarZzb2.zze();
                zzwsVarZzb2 = zzwsVarZzb2.zzb();
            }
            v.a aVarB = v.b();
            c1 it = w.z(strArr).iterator();
            int i13 = 0;
            while (it.hasNext()) {
                aVarB.g(it.next(), Integer.valueOf(i13));
                i13++;
            }
            v vVarD = aVarB.d();
            int i14 = i11 >> 2;
            zzwo zzwoVar = null;
            if (vVarD.size() <= i14) {
                int[] iArr = new int[i11 + 1];
                for (int i15 = 0; i15 < i11; i15++) {
                    iArr[i15] = ((Integer) vVarD.get(strArr[i15])).intValue();
                }
                iArr[i11] = vVarD.size();
                zzwo zzwoVarZzd = zzwp.zza(iArr).zzd();
                if (zzwoVarZzd.zzc * (zzwoVarZzd.zzb - zzwoVarZzd.zza) >= i14) {
                    zzwoVar = zzwoVarZzd;
                }
            }
            String str = "";
            if (zzwoVar != null) {
                int i16 = zzwoVar.zza;
                String strConcat = i16 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i16))).concat(" -> ") : "";
                int i17 = zzwoVar.zzb;
                int i18 = zzwoVar.zzc;
                int i19 = ((i17 - i16) * i18) + i16;
                str = String.format(Locale.US, "%s{%s}x%d%s", strConcat, TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i16, i17)), Integer.valueOf(i18), i19 < i11 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i19, i11)))) : "");
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[length];
        zzws zzwsVarZzb3 = this;
        while (zzwsVarZzb3 != null) {
            String strZze = zzwsVarZzb3.zze();
            length -= strZze.length();
            strZze.getChars(0, strZze.length(), cArr, length);
            zzwsVarZzb3 = zzwsVarZzb3.zzb();
            if (zzwsVarZzb3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final Thread zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzws zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final UUID zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final String zze() {
        return this.zzd;
    }

    zzvn(String str, UUID uuid, String str2, zzwq zzwqVar) {
        this.zzd = (String) p.l(str);
        this.zza = null;
        this.zzb = uuid;
        this.zzc = str2;
        zzxb zzxbVar = zzwqVar.zzc;
        this.zze = Thread.currentThread();
    }
}

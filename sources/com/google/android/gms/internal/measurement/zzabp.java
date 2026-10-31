package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzabp extends zzabn {
    private static final String zza;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
            if (!property.matches("\\n|\\r(?:\\n)?")) {
                property = "\n";
            }
        } catch (SecurityException unused) {
        }
        zza = property;
    }

    static int zze(String str, int i10) throws zzabo {
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            if (str.charAt(i10) != '%') {
                i10 = i11;
            } else {
                if (i11 >= str.length()) {
                    throw zzabo.zzc("trailing unquoted '%' character", str, i11 - 1);
                }
                char cCharAt = str.charAt(i11);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i11 - 1;
                }
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    abstract int zzb(zzabm zzabmVar, int i10, String str, int i11, int i12, int i13) throws zzabo;

    @Override // com.google.android.gms.internal.measurement.zzabn
    protected final void zzc(zzabm zzabmVar) throws zzabo {
        int i10;
        char cCharAt;
        int i11;
        int i12;
        int i13;
        String strZzi = zzabmVar.zzi();
        int iZze = zze(strZzi, 0);
        int i14 = 0;
        int i15 = -1;
        while (iZze >= 0) {
            int i16 = iZze + 1;
            int i17 = i16;
            int i18 = 0;
            while (true) {
                if (i17 >= strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                i10 = i17 + 1;
                cCharAt = strZzi.charAt(i17);
                char c10 = (char) (cCharAt - '0');
                if (c10 < '\n') {
                    i18 = (i18 * 10) + c10;
                    if (i18 >= 1000000) {
                        throw zzabo.zza("index too large", strZzi, iZze, i10);
                    }
                    i17 = i10;
                }
            }
            if (cCharAt == '$') {
                if ((i10 - 1) - i16 == 0) {
                    throw zzabo.zza("missing index", strZzi, iZze, i10);
                }
                if (strZzi.charAt(i16) == '0') {
                    throw zzabo.zza("index has leading zero", strZzi, iZze, i10);
                }
                int i19 = i18 - 1;
                if (i10 == strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                strZzi.charAt(i10);
                i12 = i14;
                i11 = i19;
                i13 = i10;
                i10++;
            } else if (cCharAt != '<') {
                i11 = i14;
                i12 = i14 + 1;
                i13 = i16;
            } else {
                if (i15 == -1) {
                    throw zzabo.zza("invalid relative parameter", strZzi, iZze, i10);
                }
                if (i10 == strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                strZzi.charAt(i10);
                i12 = i14;
                i11 = i15;
                i13 = i10;
                i10++;
            }
            int i20 = i10 - 1;
            while (true) {
                if (i20 >= strZzi.length()) {
                    throw zzabo.zzc("unterminated parameter", strZzi, iZze);
                }
                if (((char) ((strZzi.charAt(i20) & (-33)) - 65)) < 26) {
                    break;
                } else {
                    i20++;
                }
            }
            iZze = zze(strZzi, zzb(zzabmVar, i11, strZzi, iZze, i13, i20));
            i14 = i12;
            i15 = i11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void zzd(StringBuilder sb2, String str, int i10, int i11) {
        int i12 = i10;
        while (i10 < i11) {
            int i13 = i10 + 1;
            if (str.charAt(i10) == '%') {
                if (i13 == i11) {
                    break;
                }
                char cCharAt = str.charAt(i13);
                if (cCharAt == '%') {
                    sb2.append((CharSequence) str, i12, i13);
                } else if (cCharAt == 'n') {
                    sb2.append((CharSequence) str, i12, i13 - 1);
                    sb2.append(zza);
                }
                i12 = i13 + 1;
                i10 = i12;
            }
            i10 = i13;
        }
        if (i12 < i11) {
            sb2.append((CharSequence) str, i12, i11);
        }
    }
}

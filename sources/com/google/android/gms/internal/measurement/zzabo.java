package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzabo extends RuntimeException {
    private zzabo(String str, String str2) {
        super(str);
    }

    public static zzabo zza(String str, String str2, int i10, int i11) {
        return new zzabo(zze(str, str2, i10, i11), str2);
    }

    public static zzabo zzb(String str, String str2, int i10) {
        return new zzabo(zze(str, str2, i10, i10 + 1), str2);
    }

    public static zzabo zzc(String str, String str2, int i10) {
        return new zzabo(zze(str, str2, i10, -1), str2);
    }

    public static zzabo zzd(String str, String str2) {
        return new zzabo(str, str2);
    }

    private static String zze(String str, String str2, int i10, int i11) {
        if (i11 < 0) {
            i11 = str2.length();
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(": ");
        if (i10 > 8) {
            sb2.append("...");
            sb2.append((CharSequence) str2, i10 - 5, i10);
        } else {
            sb2.append((CharSequence) str2, 0, i10);
        }
        sb2.append('[');
        sb2.append(str2.substring(i10, i11));
        sb2.append(']');
        if (str2.length() - i11 > 8) {
            sb2.append((CharSequence) str2, i11, i11 + 5);
            sb2.append("...");
        } else {
            sb2.append((CharSequence) str2, i11, str2.length());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}

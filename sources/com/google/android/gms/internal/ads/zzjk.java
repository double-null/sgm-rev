package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjk extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzxk zzh;
    final boolean zzi;

    private zzjk(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, null, false);
    }

    public static zzjk zza(IOException iOException, int i10) {
        return new zzjk(0, iOException, i10);
    }

    public static zzjk zzb(Throwable th, String str, int i10, zzv zzvVar, int i11, zzxk zzxkVar, boolean z10, int i12) {
        return new zzjk(1, th, null, i12, str, i10, zzvVar, zzvVar == null ? 4 : i11, zzxkVar, z10);
    }

    public static zzjk zzc(RuntimeException runtimeException, int i10) {
        return new zzjk(2, runtimeException, i10);
    }

    final zzjk zzd(zzxk zzxkVar) {
        String message = getMessage();
        String str = zzfl.zza;
        return new zzjk(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzxkVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzjk(int i10, Throwable th, String str, int i11, String str2, int i12, zzv zzvVar, int i13, zzxk zzxkVar, boolean z10) {
        String string;
        String str3;
        if (i10 == 0) {
            string = "Source error";
        } else if (i10 != 1) {
            string = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str4 = zzfl.zza;
            if (i13 == 0) {
                str3 = "NO";
            } else if (i13 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i13 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i12).length() + 9 + strValueOf.length() + 19 + str3.length());
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i12);
            sb2.append(", format=");
            sb2.append(strValueOf);
            sb2.append(", format_supported=");
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i11, i10, str2, i12, zzvVar, i13, zzxkVar, SystemClock.elapsedRealtime(), z10);
    }

    private zzjk(String str, Throwable th, int i10, int i11, String str2, int i12, zzv zzvVar, int i13, zzxk zzxkVar, long j10, boolean z10) {
        int i14;
        boolean z11;
        super(str, th, i10, Bundle.EMPTY, j10);
        if (z10) {
            i14 = i11;
            if (i14 == 1) {
                i14 = 1;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            i14 = i11;
            z11 = true;
        }
        zzgtj.zza(z11);
        zzgtj.zza(th != null);
        this.zzc = i14;
        this.zzd = str2;
        this.zze = i12;
        this.zzf = zzvVar;
        this.zzg = i13;
        this.zzh = zzxkVar;
        this.zzi = z10;
    }
}

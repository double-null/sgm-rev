package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzux {
    public static IOException zza(zzru zzruVar, Uri uri, IOException iOException, String str) {
        try {
            zzsr zzsrVarZzb = zzsr.zzb();
            zzsrVarZzb.zzc();
            File file = (File) zzruVar.zza(uri, zzsrVarZzb);
            if (!file.exists()) {
                return zzb(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? zzb(file, iOException, str) : zzb(file, iOException, str);
                }
                return file.canWrite() ? zzb(file, iOException, str) : zzb(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? zzb(file, iOException, str) : zzb(file, iOException, str);
            }
            return file.canWrite() ? zzb(file, iOException, str) : zzb(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    private static IOException zzb(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return zzc(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return zzc(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? zzc(file, iOException, str) : zzc(file, iOException, str);
            }
            return parentFile.canWrite() ? zzc(file, iOException, str) : zzc(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? zzc(file, iOException, str) : zzc(file, iOException, str);
        }
        return parentFile.canWrite() ? zzc(file, iOException, str) : zzc(file, iOException, str);
    }

    private static IOException zzc(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = String.format(locale, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 16);
            sb2.append("Inoperable file:");
            sb2.append(str2);
            strConcat = sb2.toString();
            try {
                String str3 = String.format(locale, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
                StringBuilder sb3 = new StringBuilder(strConcat.length() + String.valueOf(str3).length());
                sb3.append(strConcat);
                sb3.append(str3);
                strConcat = sb3.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }
}

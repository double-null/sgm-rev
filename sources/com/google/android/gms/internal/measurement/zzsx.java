package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzsx {
    String zzc();

    default InputStream zzd(Uri uri) throws IOException {
        throw new zzsk("openForRead not supported by ".concat(String.valueOf(zzc())));
    }

    default boolean zze(Uri uri) throws IOException {
        throw new zzsk("exists not supported by ".concat(String.valueOf(zzc())));
    }

    default File zzg(Uri uri) throws IOException {
        String strZzc = zzc();
        String strValueOf = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzc).length() + 28 + strValueOf.length());
        sb2.append("Cannot convert uri to file ");
        sb2.append(strZzc);
        sb2.append(" ");
        sb2.append(strValueOf);
        throw new zzsk(sb2.toString());
    }

    default OutputStream zzj(Uri uri) throws IOException {
        throw new zzsk("openForWrite not supported by ".concat(String.valueOf(zzc())));
    }

    default void zzk(Uri uri) throws IOException {
        throw new zzsk("deleteFile not supported by ".concat(String.valueOf(zzc())));
    }

    default void zzl(Uri uri, Uri uri2) throws IOException {
        throw new zzsk("rename not supported by ".concat(String.valueOf(zzc())));
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmr extends InputStream {
    final /* synthetic */ zzmu zza;

    zzmr(zzmu zzmuVar) {
        Objects.requireNonNull(zzmuVar);
        this.zza = zzmuVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            zzmu zzmuVar = this.zza;
            int iInflate = zzmuVar.zzd().inflate(bArr, i10, i11);
            if (iInflate > 0) {
                return iInflate;
            }
            if (i11 == 0) {
                return 0;
            }
            if (zzmuVar.zzd().getRemaining() == 0) {
                return -1;
            }
            int remaining = this.zza.zzd().getRemaining();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 70 + String.valueOf(remaining).length());
            sb2.append("Read no bytes (requested up to ");
            sb2.append(i11);
            sb2.append(") but did not reach end of stream, had ");
            sb2.append(remaining);
            throw new IOException(sb2.toString());
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }
}

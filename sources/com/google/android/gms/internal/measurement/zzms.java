package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzms extends InputStream {
    final /* synthetic */ zzacv zza;

    zzms(zzmu zzmuVar, zzacv zzacvVar) {
        this.zza = zzacvVar;
        Objects.requireNonNull(zzmuVar);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        if (this.zza.zzK(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        if (j10 <= 0) {
            return 0L;
        }
        int i10 = j10 > 2147483647L ? Integer.MAX_VALUE : (int) j10;
        this.zza.zzL(i10);
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.zza.zzK(bArr, i10, i11);
    }
}

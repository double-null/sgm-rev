package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzhk {
    zzhk() {
    }

    abstract int zza(int i10, byte[] bArr, int i11, int i12);

    final boolean zzb(byte[] bArr, int i10, int i11) {
        return zza(0, bArr, i10, i11) == 0;
    }
}

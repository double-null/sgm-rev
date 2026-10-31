package com.google.android.gms.internal.fido;

import c2.YDwL.tFQWuE;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbf {
    private static final zzbf zza = new zzbd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzbf zzb = new zzbd("base64Url()", tFQWuE.zrbfRJSdJXokbs, '=');
    private static final zzbf zzc = new zzbe("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzbf zzd = new zzbe("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzbf zze = new zzbc("base16()", "0123456789ABCDEF");

    zzbf() {
    }

    public static zzbf zzd() {
        return zze;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int zzb(int i10);

    public final String zze(byte[] bArr, int i10, int i11) {
        zzam.zze(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzb(i11));
        try {
            zza(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

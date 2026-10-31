package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhkl extends ThreadLocal {
    zzhkl() {
    }

    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhzz.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhjb.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}

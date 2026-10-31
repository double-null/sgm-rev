package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgba implements e0.g0 {
    public static final zzgba zza = new zzgba();
    private static final zzgax zzb;

    static {
        zzgax zzgaxVarZzd = zzgax.zzd();
        kotlin.jvm.internal.t.e(zzgaxVarZzd, "getDefaultInstance(...)");
        zzb = zzgaxVarZzd;
    }

    private zzgba() {
    }

    @Override // e0.g0
    public final /* synthetic */ Object getDefaultValue() {
        return zzb;
    }

    @Override // e0.g0
    public final Object readFrom(InputStream inputStream, zc.f fVar) {
        try {
            zzgax zzgaxVarZzc = zzgax.zzc(inputStream);
            kotlin.jvm.internal.t.c(zzgaxVarZzc);
            return zzgaxVarZzc;
        } catch (Exception unused) {
            return zzb;
        }
    }

    @Override // e0.g0
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, zc.f fVar) throws IOException {
        ((zzgax) obj).zzaO(outputStream);
        return wc.g0.f27756a;
    }
}

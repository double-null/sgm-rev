package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaun extends zzimf {
    static {
        zzimm.zzb(zzaun.class);
    }

    public zzaun(zzimg zzimgVar, zzaum zzaumVar) throws IOException {
        zzd(zzimgVar, zzimgVar.zzb(), zzaumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimf
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 7);
        sb2.append("model(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzimf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}

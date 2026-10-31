package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqu extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzqu(int i10, boolean z10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("AudioOutput write failed: ");
        sb2.append(i10);
        super(sb2.toString());
        this.zzb = z10;
        this.zza = i10;
    }
}

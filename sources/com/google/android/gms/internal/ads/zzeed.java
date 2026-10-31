package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzeed extends Exception {
    private final int zza;

    public zzeed(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzeed(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzeed(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzhq extends IOException {
    public final int zza;

    public zzhq(int i10) {
        this.zza = i10;
    }

    public zzhq(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzhq(String str, Throwable th, int i10) {
        super(str, th);
        this.zza = i10;
    }

    public zzhq(Throwable th, int i10) {
        super(th);
        this.zza = i10;
    }
}

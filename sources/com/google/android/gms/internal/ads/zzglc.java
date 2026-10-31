package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzglc extends RuntimeException {
    public zzglc() {
        this(0);
    }

    public zzglc(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 3);
        sb2.append("r: ");
        sb2.append(i10);
        super(sb2.toString());
    }

    public zzglc(int i10, Throwable th) {
        super("r: 2", th);
    }
}

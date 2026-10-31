package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmk extends RuntimeException {
    private final int zza;

    public zzmk(int i10, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2 + str.length());
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(str);
            strValueOf = sb2.toString();
        } else {
            strValueOf = String.valueOf(i10);
        }
        super(strValueOf, th);
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }
}

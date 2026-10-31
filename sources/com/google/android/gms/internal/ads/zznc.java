package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public interface zznc {
    static boolean zzac(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    String zzU();

    int zza();

    int zzad(zzv zzvVar) throws zzjk;

    int zzu() throws zzjk;

    default void zzw() {
    }

    default void zzv(zznb zznbVar) {
    }
}

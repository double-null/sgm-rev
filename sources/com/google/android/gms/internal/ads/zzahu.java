package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzahu implements zzahq {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzahu(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzahu zzb(zzet zzetVar) {
        int iZzC = zzetVar.zzC();
        zzetVar.zzk(8);
        int iZzC2 = zzetVar.zzC();
        int iZzC3 = zzetVar.zzC();
        zzetVar.zzk(4);
        int iZzC4 = zzetVar.zzC();
        zzetVar.zzk(12);
        return new zzahu(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final int zza() {
        return 1751742049;
    }
}

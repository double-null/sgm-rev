package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaaj extends zzaaq implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaaj(int i10, zzbg zzbgVar, int i11, zzaam zzaamVar, int i12) {
        super(i10, zzbgVar, i11);
        this.zze = zznc.zzac(i12, zzaamVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaaj zzaajVar) {
        return Integer.compare(this.zzf, zzaajVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(zzaaq zzaaqVar) {
        return false;
    }
}

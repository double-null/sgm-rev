package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhh implements zzhp {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzht zzd;

    protected zzhh(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(zzin zzinVar) {
        zzinVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzinVar)) {
            return;
        }
        arrayList.add(zzinVar);
        this.zzc++;
    }

    protected final void zzf(zzht zzhtVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzin) this.zzb.get(i10)).zza(this, zzhtVar, this.zza);
        }
    }

    protected final void zzg(zzht zzhtVar) {
        this.zzd = zzhtVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzin) this.zzb.get(i10)).zzb(this, zzhtVar, this.zza);
        }
    }

    protected final void zzh(int i10) {
        zzht zzhtVar = this.zzd;
        String str = zzfl.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzin) this.zzb.get(i11)).zzc(this, zzhtVar, this.zza, i10);
        }
    }

    protected final void zzi() {
        zzht zzhtVar = this.zzd;
        String str = zzfl.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzin) this.zzb.get(i10)).zzd(this, zzhtVar, this.zza);
        }
        this.zzd = null;
    }
}

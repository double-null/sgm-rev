package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzwj implements zzxm {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzxu zzc = new zzxu();
    private final zzui zzd = new zzui();
    private Looper zze;
    private zzbf zzf;
    private zzqf zzg;

    protected abstract void zza(zzin zzinVar);

    protected abstract void zzd();

    protected final void zze(zzbf zzbfVar) {
        this.zzf = zzbfVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzxl) arrayList.get(i10)).zza(this, zzbfVar);
        }
    }

    protected final zzxu zzf(zzxk zzxkVar) {
        return this.zzc.zza(0, zzxkVar);
    }

    protected final zzxu zzg(int i10, zzxk zzxkVar) {
        return this.zzc.zza(0, zzxkVar);
    }

    protected final zzui zzh(zzxk zzxkVar) {
        return this.zzd.zza(0, zzxkVar);
    }

    protected final zzui zzi(int i10, zzxk zzxkVar) {
        return this.zzd.zza(0, zzxkVar);
    }

    protected final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    protected final zzqf zzk() {
        zzqf zzqfVar = this.zzg;
        zzqfVar.getClass();
        return zzqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzl(Handler handler, zzxv zzxvVar) {
        this.zzc.zzb(handler, zzxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzm(zzxv zzxvVar) {
        this.zzc.zzc(zzxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzn(Handler handler, zzuj zzujVar) {
        this.zzd.zzb(handler, zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzo(zzuj zzujVar) {
        this.zzd.zzc(zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzp(zzxl zzxlVar, zzin zzinVar, zzqf zzqfVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        zzgtj.zza(z10);
        this.zzg = zzqfVar;
        zzbf zzbfVar = this.zzf;
        this.zza.add(zzxlVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzxlVar);
            zza(zzinVar);
        } else if (zzbfVar != null) {
            zzq(zzxlVar);
            zzxlVar.zza(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzq(zzxl zzxlVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzxlVar);
        if (zIsEmpty) {
            zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzr(zzxl zzxlVar) {
        HashSet hashSet = this.zzb;
        boolean z10 = !hashSet.isEmpty();
        hashSet.remove(zzxlVar);
        if (z10 && hashSet.isEmpty()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void zzs(zzxl zzxlVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzxlVar);
        if (!arrayList.isEmpty()) {
            zzr(zzxlVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }

    protected void zzM() {
    }

    protected void zzc() {
    }
}

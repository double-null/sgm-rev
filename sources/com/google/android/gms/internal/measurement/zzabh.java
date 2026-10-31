package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzabh {
    private final int zza;
    private final zzza zzb;

    protected zzabh(zzza zzzaVar, int i10) {
        if (zzzaVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i10 >= 0) {
            this.zza = i10;
            this.zzb = zzzaVar;
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
            sb2.append("invalid index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    protected abstract void zzb(zzabi zzabiVar, Object obj);

    public final int zzc() {
        return this.zza;
    }

    protected final zzza zzd() {
        return this.zzb;
    }

    public final void zze(zzabi zzabiVar, Object[] objArr) {
        int i10 = this.zza;
        if (i10 >= objArr.length) {
            zzabiVar.zze();
            return;
        }
        Object obj = objArr[i10];
        if (obj != null) {
            zzb(zzabiVar, obj);
        } else {
            zzabiVar.zzf();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdqd {
    public static final zzdqd zza = new zzdqd(new zzdqc());
    private final zzbnc zzb;
    private final zzbmz zzc;
    private final zzbnp zzd;
    private final zzbnm zze;
    private final zzbsk zzf;
    private final androidx.collection.h zzg;
    private final androidx.collection.h zzh;

    /* synthetic */ zzdqd(zzdqc zzdqcVar, byte[] bArr) {
        this(zzdqcVar);
    }

    public final zzbnc zza() {
        return this.zzb;
    }

    public final zzbmz zzb() {
        return this.zzc;
    }

    public final zzbnp zzc() {
        return this.zzd;
    }

    public final zzbnm zzd() {
        return this.zze;
    }

    public final zzbsk zze() {
        return this.zzf;
    }

    public final zzbni zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbni) this.zzg.get(str);
    }

    public final zzbnf zzg(String str) {
        return (zzbnf) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        androidx.collection.h hVar = this.zzg;
        ArrayList arrayList = new ArrayList(hVar.size());
        for (int i10 = 0; i10 < hVar.size(); i10++) {
            arrayList.add((String) hVar.j(i10));
        }
        return arrayList;
    }

    private zzdqd(zzdqc zzdqcVar) {
        this.zzb = zzdqcVar.zza;
        this.zzc = zzdqcVar.zzb;
        this.zzd = zzdqcVar.zzc;
        this.zzg = new androidx.collection.h(zzdqcVar.zzf);
        this.zzh = new androidx.collection.h(zzdqcVar.zzg);
        this.zze = zzdqcVar.zzd;
        this.zzf = zzdqcVar.zze;
    }
}

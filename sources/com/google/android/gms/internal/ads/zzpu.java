package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpu implements zzqd {
    public static final zzgub zza = zzps.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzqc zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpu() {
        throw null;
    }

    private final void zzl(zznn zznnVar) {
        if (zznnVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpt zzptVar = (zzpt) this.zze.get(str);
                zzptVar.getClass();
                zzm(zzptVar);
                return;
            }
            return;
        }
        zzpt zzptVar2 = (zzpt) this.zze.get(this.zzh);
        int i10 = zznnVar.zzc;
        zzxk zzxkVar = zznnVar.zzd;
        this.zzh = zzo(i10, zzxkVar).zze();
        zzc(zznnVar);
        if (zzxkVar == null || !zzxkVar.zzb()) {
            return;
        }
        if (zzptVar2 != null) {
            if (zzptVar2.zzg() == zzxkVar.zzd && zzptVar2.zzh() != null) {
                zzxk zzxkVarZzh = zzptVar2.zzh();
                if (zzxkVarZzh.zzb == zzxkVar.zzb) {
                    zzxk zzxkVarZzh2 = zzptVar2.zzh();
                    if (zzxkVarZzh2.zzc == zzxkVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i10, new zzxk(zzxkVar.zza, zzxkVar.zzd));
    }

    private final void zzm(zzpt zzptVar) {
        if (zzptVar.zzg() != -1 && zzptVar.zzi()) {
            this.zzi = zzptVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpt zzptVar = (zzpt) this.zze.get(this.zzh);
        return (zzptVar == null || zzptVar.zzg() == -1) ? this.zzi + 1 : zzptVar.zzg();
    }

    private final zzpt zzo(int i10, zzxk zzxkVar) {
        HashMap map = this.zze;
        long j10 = Long.MAX_VALUE;
        zzpt zzptVar = null;
        for (zzpt zzptVar2 : map.values()) {
            zzptVar2.zzc(i10, zzxkVar);
            if (zzptVar2.zzb(i10, zzxkVar)) {
                long jZzg = zzptVar2.zzg();
                if (jZzg == -1 || jZzg < j10) {
                    zzptVar = zzptVar2;
                    j10 = jZzg;
                } else if (jZzg == j10) {
                    String str = zzfl.zza;
                    if (zzptVar.zzh() != null && zzptVar2.zzh() != null) {
                        zzptVar = zzptVar2;
                    }
                }
            }
        }
        if (zzptVar != null) {
            return zzptVar;
        }
        String strZzp = zzp();
        zzpt zzptVar3 = new zzpt(this, strZzp, i10, zzxkVar);
        map.put(strZzp, zzptVar3);
        return zzptVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zza(zzqc zzqcVar) {
        this.zzf = zzqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized String zzb(zzbf zzbfVar, zzxk zzxkVar) {
        return zzo(zzbfVar.zzo(zzxkVar.zza, this.zzd).zzc, zzxkVar).zze();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040 A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized void zzc(zznn zznnVar) {
        int i10;
        zzpt zzptVarZzo;
        Object obj;
        int i11;
        zzpt zzptVarZzo2;
        zzpt zzptVar;
        this.zzf.getClass();
        zzbf zzbfVar = zznnVar.zzb;
        if (!zzbfVar.zzg()) {
            zzxk zzxkVar = zznnVar.zzd;
            if (zzxkVar != null) {
                long j10 = zzxkVar.zzd;
                if ((j10 == -1 || j10 >= zzi()) && ((zzptVar = (zzpt) this.zze.get(this.zzh)) == null || zzptVar.zzg() != -1 || zzptVar.zzf() == zznnVar.zzc)) {
                    i10 = zznnVar.zzc;
                    zzptVarZzo = zzo(i10, zzxkVar);
                    if (this.zzh == null) {
                        this.zzh = zzptVarZzo.zze();
                    }
                    if (zzxkVar != null && zzxkVar.zzb()) {
                        obj = zzxkVar.zza;
                        long j11 = zzxkVar.zzd;
                        i11 = zzxkVar.zzb;
                        zzptVarZzo2 = zzo(i10, new zzxk(obj, j11, i11));
                        if (!zzptVarZzo2.zzi()) {
                            zzptVarZzo2.zzj(true);
                            zzbd zzbdVar = this.zzd;
                            zzbfVar.zzo(obj, zzbdVar);
                            zzbdVar.zzc(i11);
                            Math.max(0L, zzfl.zzr(0L) + zzfl.zzr(0L));
                        }
                    }
                    if (!zzptVarZzo.zzi()) {
                        zzptVarZzo.zzj(true);
                    }
                    if (zzptVarZzo.zze().equals(this.zzh) && !zzptVarZzo.zzk()) {
                        zzptVarZzo.zzl(true);
                        this.zzf.zzc(zznnVar, zzptVarZzo.zze());
                    }
                }
            } else {
                i10 = zznnVar.zzc;
                zzptVarZzo = zzo(i10, zzxkVar);
                if (this.zzh == null) {
                    this.zzh = zzptVarZzo.zze();
                }
                if (zzxkVar != null) {
                    obj = zzxkVar.zza;
                    long j12 = zzxkVar.zzd;
                    i11 = zzxkVar.zzb;
                    zzptVarZzo2 = zzo(i10, new zzxk(obj, j12, i11));
                    if (!zzptVarZzo2.zzi()) {
                        zzptVarZzo2.zzj(true);
                        zzbd zzbdVar2 = this.zzd;
                        zzbfVar.zzo(obj, zzbdVar2);
                        zzbdVar2.zzc(i11);
                        Math.max(0L, zzfl.zzr(0L) + zzfl.zzr(0L));
                    }
                }
                if (!zzptVarZzo.zzi()) {
                    zzptVarZzo.zzj(true);
                }
                if (zzptVarZzo.zze().equals(this.zzh)) {
                    zzptVarZzo.zzl(true);
                    this.zzf.zzc(zznnVar, zzptVarZzo.zze());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized void zzd(zznn zznnVar) {
        this.zzf.getClass();
        zzbf zzbfVar = this.zzg;
        this.zzg = zznnVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpt zzptVar = (zzpt) it.next();
            if (!zzptVar.zza(zzbfVar, this.zzg) || zzptVar.zzd(zznnVar)) {
                it.remove();
                if (zzptVar.zze().equals(this.zzh)) {
                    zzm(zzptVar);
                }
                if (zzptVar.zzi()) {
                    this.zzf.zzd(zznnVar, zzptVar.zze(), false);
                }
            }
        }
        zzl(zznnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized void zze(zznn zznnVar, int i10) {
        this.zzf.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpt zzptVar = (zzpt) it.next();
            if (zzptVar.zzd(zznnVar)) {
                it.remove();
                boolean zEquals = zzptVar.zze().equals(this.zzh);
                if (zEquals) {
                    zzm(zzptVar);
                }
                if (zzptVar.zzi()) {
                    boolean z10 = false;
                    if (i10 == 0 && zEquals && zzptVar.zzk()) {
                        z10 = true;
                    }
                    this.zzf.zzd(zznnVar, zzptVar.zze(), z10);
                }
            }
        }
        zzl(zznnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final synchronized void zzg(zznn zznnVar) {
        zzqc zzqcVar;
        String str = this.zzh;
        if (str != null) {
            zzpt zzptVar = (zzpt) this.zze.get(str);
            zzptVar.getClass();
            zzm(zzptVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpt zzptVar2 = (zzpt) it.next();
            it.remove();
            if (zzptVar2.zzi() && (zzqcVar = this.zzf) != null) {
                zzqcVar.zzd(zznnVar, zzptVar2.zze(), false);
            }
        }
    }

    final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    public zzpu(zzgub zzgubVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }
}

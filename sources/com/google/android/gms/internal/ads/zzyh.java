package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyh implements zzabz, zzwz {
    final /* synthetic */ zzyq zza;
    private final long zzb;
    private final Uri zzc;
    private final zzim zzd;
    private final zzyd zze;
    private final zzagb zzf;
    private final zzds zzg;
    private final zzagy zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzht zzl;
    private zzahk zzm;
    private boolean zzn;

    public zzyh(zzyq zzyqVar, Uri uri, zzhp zzhpVar, zzyd zzydVar, zzagb zzagbVar, zzds zzdsVar) {
        Objects.requireNonNull(zzyqVar);
        this.zza = zzyqVar;
        this.zzc = uri;
        this.zzd = new zzim(zzhpVar);
        this.zze = zzydVar;
        this.zzf = zzagbVar;
        this.zzg = zzdsVar;
        this.zzh = new zzagy();
        this.zzj = true;
        this.zzb = zzxb.zza();
        this.zzl = zzi(0L, null);
    }

    private final zzht zzi(long j10, String str) {
        Map mapZzd = zzyq.zzb;
        if (str != null && !str.startsWith("W/")) {
            zzgwo zzgwoVar = new zzgwo();
            zzgwoVar.zzb(mapZzd.entrySet());
            zzgwoVar.zza("If-Range", str);
            mapZzd = zzgwoVar.zzd();
        }
        zzhs zzhsVar = new zzhs();
        zzhsVar.zza(this.zzc);
        zzhsVar.zzc(j10);
        zzhsVar.zzd(6);
        zzhsVar.zzb(mapZzd);
        return zzhsVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zza(zzet zzetVar) {
        long jMax = !this.zzn ? this.zzk : Math.max(this.zza.zzI(true), this.zzk);
        int iZzd = zzetVar.zzd();
        zzahk zzahkVar = this.zzm;
        zzahkVar.getClass();
        zzahkVar.zzc(zzetVar, iZzd);
        zzahkVar.zze(jMax, 1, iZzd, 0, null);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzabz
    public final void zzb() {
        this.zzi = true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01fc */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzabz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyh.zzc():void");
    }

    final /* synthetic */ void zzd(long j10, long j11) {
        this.zzh.zza = j10;
        this.zzk = j11;
        this.zzj = true;
        this.zzn = false;
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ zzim zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzk;
    }

    final /* synthetic */ zzht zzh() {
        return this.zzl;
    }
}

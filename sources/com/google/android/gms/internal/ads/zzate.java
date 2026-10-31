package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzate implements Comparable {
    private final zzatp zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzati zzf;
    private Integer zzg;
    private zzath zzh;
    private boolean zzi;
    private zzasn zzj;
    private zzatd zzk;
    private final zzass zzl;

    public zzate(int i10, String str, zzati zzatiVar) {
        Uri uri;
        String host;
        this.zza = zzatp.zza ? new zzatp() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzatiVar;
        this.zzl = new zzass();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzate) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzl();
        Integer num = this.zzg;
        String str = this.zzc;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(length + 5 + strConcat.length() + 8 + length2);
        sb2.append("[ ] ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final void zzc(String str) {
        if (zzatp.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    final void zzd(String str) {
        zzath zzathVar = this.zzh;
        if (zzathVar != null) {
            zzathVar.zzc(this);
        }
        if (zzatp.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzatc(this, str, id2));
                return;
            }
            zzatp zzatpVar = this.zza;
            zzatpVar.zza(str, id2);
            zzatpVar.zzb(toString());
        }
    }

    final void zze(int i10) {
        zzath zzathVar = this.zzh;
        if (zzathVar != null) {
            zzathVar.zzd(this, i10);
        }
    }

    public final zzate zzf(zzath zzathVar) {
        this.zzh = zzathVar;
        return this;
    }

    public final zzate zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final String zzi() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb2.append(string);
        sb2.append("-");
        sb2.append(str);
        return sb2.toString();
    }

    public final zzate zzj(zzasn zzasnVar) {
        this.zzj = zzasnVar;
        return this;
    }

    public final zzasn zzk() {
        return this.zzj;
    }

    public final boolean zzl() {
        synchronized (this.zze) {
        }
        return false;
    }

    public Map zzm() throws zzasm {
        return Collections.emptyMap();
    }

    public byte[] zzn() throws zzasm {
        return null;
    }

    public final int zzo() {
        return this.zzl.zza();
    }

    public final void zzp() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final boolean zzq() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    protected abstract zzatk zzr(zzata zzataVar);

    protected abstract void zzs(Object obj);

    public final void zzt(zzatn zzatnVar) {
        zzati zzatiVar;
        synchronized (this.zze) {
            zzatiVar = this.zzf;
        }
        zzatiVar.zza(zzatnVar);
    }

    final void zzu(zzatd zzatdVar) {
        synchronized (this.zze) {
            this.zzk = zzatdVar;
        }
    }

    final void zzv(zzatk zzatkVar) {
        zzatd zzatdVar;
        synchronized (this.zze) {
            zzatdVar = this.zzk;
        }
        if (zzatdVar != null) {
            zzatdVar.zza(this, zzatkVar);
        }
    }

    final void zzw() {
        zzatd zzatdVar;
        synchronized (this.zze) {
            zzatdVar = this.zzk;
        }
        if (zzatdVar != null) {
            zzatdVar.zzb(this);
        }
    }

    final /* synthetic */ zzatp zzx() {
        return this.zza;
    }

    public final zzass zzy() {
        return this.zzl;
    }
}

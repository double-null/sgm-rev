package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhcl extends zzhap.zzf implements Runnable {
    private final Runnable zza;

    zzhcl(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzb(th);
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final String zzd() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("task=[");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}

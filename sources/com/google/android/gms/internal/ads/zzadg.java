package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzadg extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzadf zzd;
    private boolean zze;

    /* synthetic */ zzadg(zzadf zzadfVar, SurfaceTexture surfaceTexture, boolean z10, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzadfVar;
        this.zza = z10;
    }

    public static synchronized boolean zza(Context context) {
        int i10;
        if (!zzc) {
            try {
                if (zzdx.zza(context)) {
                    i10 = zzdx.zzb() ? 1 : 2;
                } else {
                    i10 = 0;
                }
            } catch (zzdw e10) {
                zzeg.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e10.getMessage())));
            }
            zzb = i10;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzadg zzb(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zza(context)) {
            z11 = false;
        }
        zzgtj.zzi(z11);
        return new zzadf().zza(z10 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzadf zzadfVar = this.zzd;
        synchronized (zzadfVar) {
            if (!this.zze) {
                zzadfVar.zzb();
                this.zze = true;
            }
        }
    }
}

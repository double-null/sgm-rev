package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.adjust.sdk.network.ErrorCodes;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkd implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaep, zzrv, zzzq, zzwi, zzby, zzew {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzlh zza;

    /* synthetic */ zzkd(zzlh zzlhVar, byte[] bArr) {
        Objects.requireNonNull(zzlhVar);
        this.zza = zzlhVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzlh zzlhVar = this.zza;
        zzlhVar.zzQ(surfaceTexture);
        zzlhVar.zzS(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzlh zzlhVar = this.zza;
        zzlhVar.zzR(null);
        zzlhVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.zza.zzS(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.zza.zzS(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzew
    public final void zza(zzfd zzfdVar) {
        this.zza.zzP(zzjk.zzc(zzfdVar, ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzb(zzjb zzjbVar) {
        this.zza.zzV().zzN(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzc(String str, long j10, long j11) {
        this.zza.zzV().zzO(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzd(zzv zzvVar, zzjc zzjcVar) {
        this.zza.zzV().zzP(zzvVar, zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zze(int i10, long j10) {
        this.zza.zzV().zzQ(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzf(final zzbv zzbvVar) {
        zzea zzeaVar = new zzea() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzt(zzbvVar);
            }
        };
        zzef zzefVarZzU = this.zza.zzU();
        zzefVarZzU.zze(25, zzeaVar);
        zzefVarZzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzg(Object obj, long j10) {
        zzlh zzlhVar = this.zza;
        zzlhVar.zzV().zzT(obj, j10);
        if (zzlhVar.zzab() == obj) {
            zzef zzefVarZzU = zzlhVar.zzU();
            zzefVarZzU.zze(26, zzkc.zza);
            zzefVarZzU.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzh(String str) {
        this.zza.zzV().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzi(zzjb zzjbVar) {
        this.zza.zzV().zzS(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzj(long j10, int i10) {
        this.zza.zzV().zzU(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzk(Exception exc) {
        this.zza.zzV().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzl(zzjb zzjbVar) {
        this.zza.zzV().zzC(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzm(String str, long j10, long j11) {
        this.zza.zzV().zzD(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzn(zzv zzvVar, zzjc zzjcVar) {
        this.zza.zzV().zzE(zzvVar, zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzo(long j10) {
        this.zza.zzV().zzF(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzp(int i10, long j10, long j11) {
        this.zza.zzV().zzG(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzq(String str) {
        this.zza.zzV().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzr(zzjb zzjbVar) {
        this.zza.zzV().zzI(zzjbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzs(final boolean z10) {
        zzlh zzlhVar = this.zza;
        if (zzlhVar.zzac() == z10) {
            return;
        }
        zzlhVar.zzad(z10);
        zzef zzefVarZzU = zzlhVar.zzU();
        zzefVarZzU.zze(23, new zzea() { // from class: com.google.android.gms.internal.ads.zzjy
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzs(z10);
            }
        });
        zzefVarZzU.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzt(Exception exc) {
        this.zza.zzV().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzu(Exception exc) {
        this.zza.zzV().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzv(zzry zzryVar) {
        this.zza.zzV().zzL(zzryVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzw(zzry zzryVar) {
        this.zza.zzV().zzM(zzryVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzx(final int i10) {
        this.zza.zzY().zzb(new zzgta() { // from class: com.google.android.gms.internal.ads.zzjz
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i10);
            }
        }, new zzgta() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void zzy(zziz zzizVar) {
        this.zza.zzZ().zza(zzizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaep
    public final void zzz(zziz zzizVar) {
        this.zza.zzaa().zza(zzizVar);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}

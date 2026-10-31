package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.core.view.b3;
import com.adjust.sdk.Constants;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzclk;
import com.google.android.gms.internal.ads.zzcmq;
import com.google.android.gms.internal.ads.zzcms;
import com.google.android.gms.internal.ads.zzcne;
import com.google.android.gms.internal.ads.zzdde;
import com.google.android.gms.internal.ads.zzdky;
import com.google.android.gms.internal.ads.zzdzk;
import com.google.android.gms.internal.ads.zzdzl;
import com.google.android.gms.internal.ads.zzeks;
import com.google.android.gms.internal.ads.zzekt;
import com.google.android.gms.internal.ads.zzell;
import com.google.android.gms.internal.ads.zzeln;
import com.google.android.gms.internal.ads.zzgam;
import com.google.android.gms.internal.ads.zzgua;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzm extends zzbza implements zzah {
    static final int zza = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzo = 0;
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcku zzd;
    zzj zze;
    zzu zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzi zzl;
    private Runnable zzr;
    private boolean zzs;
    private boolean zzt;
    private Toolbar zzx;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzp = new Object();
    private final View.OnClickListener zzq = new zzd(this);
    private boolean zzu = false;
    private boolean zzv = false;
    private boolean zzw = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    private final void zzJ(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z10;
        boolean z11;
        com.google.android.gms.ads.internal.zzl zzlVar;
        boolean z12;
        int i10;
        int i11;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        boolean z13 = (adOverlayInfoParcel2 == null || (zzlVar2 = adOverlayInfoParcel2.zzo) == null || !zzlVar2.zzb) ? false : true;
        Activity activity = this.zzb;
        boolean zZzd = com.google.android.gms.ads.internal.zzt.zzf().zzd(activity, configuration);
        if (!this.zzk || z13) {
            if (zZzd) {
                if (((Boolean) zzba.zzc().zzd(zzbiq.zzbq)).booleanValue()) {
                    z10 = false;
                }
                z11 = z10;
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel == null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzg) {
                z10 = true;
                z11 = z10;
            } else {
                z10 = true;
                z11 = false;
            }
        } else if (((Boolean) zzba.zzc().zzd(zzbiq.zzbr)).booleanValue()) {
            if (zZzd) {
                if (((Boolean) zzba.zzc().zzd(zzbiq.zzbq)).booleanValue()) {
                    z10 = false;
                }
                z11 = z10;
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel == null) {
            }
            z10 = true;
            z11 = false;
        } else {
            z10 = false;
            z11 = z10;
        }
        Window window = activity.getWindow();
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzbQ)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z10) {
                i11 = z11 ? 5894 : 5380;
                z12 = true;
            } else {
                i11 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                z12 = false;
            }
            decorView.setSystemUiVisibility(i11);
        } else if (z10) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z11) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
            z12 = true;
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
            z12 = false;
        }
        if (!((Boolean) zzba.zzc().zzd(zzbiq.zzoT)).booleanValue() || (i10 = Build.VERSION.SDK_INT) > 34 || i10 < 28 || !z12) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        b3.b(window, false);
    }

    private final void zzK(View view) {
        zzeln zzelnVarZzU;
        zzell zzellVarZzV;
        zzcku zzckuVar = this.zzd;
        if (zzckuVar == null) {
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzgn)).booleanValue() && (zzellVarZzV = zzckuVar.zzV()) != null) {
            zzellVarZzV.zzf(view);
        } else if (((Boolean) zzba.zzc().zzd(zzbiq.zzgm)).booleanValue() && (zzelnVarZzU = zzckuVar.zzU()) != null && zzelnVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzelnVarZzU.zza(), view);
        }
    }

    private static final void zzL(zzeln zzelnVar, View view) {
        if (zzelnVar == null || view == null) {
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzgm)).booleanValue() && zzelnVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzelnVar.zza(), view);
    }

    protected final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzu) {
            return;
        }
        this.zzu = true;
        zzcku zzckuVar = this.zzd;
        if (zzckuVar != null) {
            zzckuVar.zzH(this.zzn - 1);
            synchronized (this.zzp) {
                if (!this.zzs && this.zzd.zzaa()) {
                    if (((Boolean) zzba.zzc().zzd(zzbiq.zzfY)).booleanValue() && !this.zzv && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzdT();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzB();
                        }
                    };
                    this.zzr = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().zzd(zzbiq.zzbJ)).longValue());
                    return;
                }
            }
        }
        zzB();
    }

    final void zzB() {
        zzcku zzckuVar;
        zzr zzrVar;
        if (this.zzv) {
            return;
        }
        this.zzv = true;
        zzcku zzckuVar2 = this.zzd;
        if (zzckuVar2 != null) {
            this.zzl.removeView(zzckuVar2.zzE());
            zzj zzjVar = this.zze;
            if (zzjVar != null) {
                this.zzd.zzai(zzjVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzba.zzc().zzd(zzbiq.zzog)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzE = this.zzd.zzE();
                zzj zzjVar2 = this.zze;
                viewGroup.addView(viewZzE, zzjVar2.zza, zzjVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdU(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzckuVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzckuVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    protected final void zzD() {
        this.zzd.zzI();
    }

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzF() {
        synchronized (this.zzp) {
            this.zzs = true;
            Runnable runnable = this.zzr;
            if (runnable != null) {
                zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzgamVar.removeCallbacks(runnable);
                zzgamVar.post(this.zzr);
            }
        }
    }

    public final void zzG(zzekt zzektVar) throws RemoteException, zzh {
        zzbyu zzbyuVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbyuVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        zzbyuVar.zzh(ObjectWrapper.wrap(zzektVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzH(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.zzb;
            zzeks zzeksVarZze = zzekt.zze();
            zzeksVarZze.zza(activity);
            zzeksVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zzeksVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcku zzckuVar = this.zzd;
        if (zzckuVar != null) {
            zzckuVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzt = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzf() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzko)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.emptyMap());
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public void zzh(Bundle bundle) {
        zzr zzrVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzw = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z10 = zzlVar.zza;
                this.zzk = z10;
                if (z10) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzl(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzl(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzw) {
                    zzdde zzddeVar = this.zzc.zzt;
                    if (zzddeVar != null) {
                        zzddeVar.zza();
                    }
                    zzr zzrVar2 = this.zzc.zzc;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdky zzdkyVar = this.zzc.zzu;
                    if (zzdkyVar != null) {
                        zzdkyVar.zzdu();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            if (adOverlayInfoParcel3 != null && (zzrVar = adOverlayInfoParcel3.zzc) != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.zzl = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
            int i10 = adOverlayInfoParcel5.zzk;
            if (i10 == 1) {
                zzy(false);
                return;
            }
            if (i10 == 2) {
                this.zze = new zzj(adOverlayInfoParcel5.zzd);
                zzy(false);
            } else if (i10 == 3) {
                zzy(true);
            } else {
                if (i10 != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzh e10) {
            String message = e10.getMessage();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzga)).booleanValue()) {
            zzcku zzckuVar = this.zzd;
            if (zzckuVar == null || zzckuVar.zzX()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzk() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzga)).booleanValue()) {
            return;
        }
        zzcku zzckuVar = this.zzd;
        if (zzckuVar != null && !zzckuVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzba.zzc().zzd(zzbiq.zzga)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzm(int i10, int i11, Intent intent) {
        zzdzl zzdzlVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            zzbih zzbihVar = zzbiq.zzoE;
            if (((Boolean) zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i11);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                zzcku zzckuVar = this.zzd;
                if (zzckuVar == null || zzckuVar.zzP() == null || (zzdzlVarZzI = zzckuVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                    return;
                }
                zzdzk zzdzkVarZza = zzdzlVarZzI.zza();
                zzdzkVarZza.zzc("action", "hilca");
                zzdzkVarZza.zzc("gqi", zzgua.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length());
                sb3.append(i11);
                zzdzkVarZza.zzc("hilr", sb3.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdzkVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdzkVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdzkVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzga)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzq() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        zzcku zzckuVar = this.zzd;
        if (zzckuVar != null) {
            try {
                this.zzl.removeView(zzckuVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z10) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzba.zzc().zzd(zzbiq.zzgd)).intValue();
        boolean z11 = ((Boolean) zzba.zzc().zzd(zzbiq.zzbM)).booleanValue() || z10;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z11 ? 0 : iIntValue;
        zztVar.zzb = true != z11 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        zzt(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzs() {
        this.zzt = true;
    }

    public final void zzt(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) zzba.zzc().zzd(zzbiq.zzbK)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z14 = ((Boolean) zzba.zzc().zzd(zzbiq.zzbL)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z10 && z11 && z13 && !z14) {
            new zzbyg(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzuVar.zza(z12);
        }
    }

    public final void zzu(boolean z10) {
        if (z10) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i10) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzd(zzbiq.zzgV)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzd(zzbiq.zzgW)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzba.zzc().zzd(zzbiq.zzgX)).intValue()) {
                    if (i11 <= ((Integer) zzba.zzc().zzd(zzbiq.zzgY)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzt = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    protected final void zzy(boolean z10) throws zzh {
        boolean z11;
        boolean z12;
        Resources.Theme theme;
        int i10;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        Activity activity = this.zzb;
        Window window = activity.getWindow();
        if (window == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzcku zzckuVar = this.zzc.zzd;
        zzcms zzcmsVarZzP = zzckuVar != null ? zzckuVar.zzP() : null;
        boolean z13 = zzcmsVarZzP != null && zzcmsVarZzP.zzk();
        this.zzm = false;
        if (z13) {
            int i11 = this.zzc.zzj;
            if (i11 == 6) {
                z11 = activity.getResources().getConfiguration().orientation == 1;
                this.zzm = z11;
            } else if (i11 == 7) {
                z11 = activity.getResources().getConfiguration().orientation == 2;
                this.zzm = z11;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(z11).length() + 41);
        sb2.append("Delay onShow to next orientation change: ");
        sb2.append(z11);
        String string = sb2.toString();
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        zzw(this.zzc.zzj);
        window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
        activity.setContentView(this.zzl);
        this.zzt = true;
        if (z10) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzcku zzckuVar2 = this.zzc.zzd;
                zzcne zzcneVarZzN = zzckuVar2 != null ? zzckuVar2.zzN() : null;
                zzcku zzckuVar3 = this.zzc.zzd;
                String strZzO = zzckuVar3 != null ? zzckuVar3.zzO() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                zzcku zzckuVar4 = adOverlayInfoParcel.zzd;
                z12 = z13;
                com.google.android.gms.ads.internal.zza zzaVarZzk = zzckuVar4 != null ? zzckuVar4.zzk() : null;
                theme = null;
                zzcku zzckuVarZza = zzclk.zza(activity, zzcneVarZzN, strZzO, true, z13, null, null, versionInfoParcel, null, null, zzaVarZzk, zzbhp.zza(), null, null, null, null, null);
                this.zzd = zzckuVarZza;
                zzcms zzcmsVarZzP2 = zzckuVarZza.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbog zzbogVar = adOverlayInfoParcel2.zzp;
                zzboi zzboiVar = adOverlayInfoParcel2.zze;
                zzad zzadVar = adOverlayInfoParcel2.zzi;
                zzcku zzckuVar5 = adOverlayInfoParcel2.zzd;
                zzcmsVarZzP2.zzab(null, zzbogVar, null, zzboiVar, zzadVar, true, null, zzckuVar5 != null ? zzckuVar5.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzP().zzG(new zzcmq() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                    @Override // com.google.android.gms.internal.ads.zzcmq
                    public final /* synthetic */ void zza(boolean z14, int i13, String str, String str2) {
                        zzcku zzckuVar6 = this.zza.zzd;
                        if (zzckuVar6 != null) {
                            zzckuVar6.zzI();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzh("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", Constants.ENCODING, null);
                }
                zzcku zzckuVar6 = this.zzc.zzd;
                if (zzckuVar6 != null) {
                    zzckuVar6.zzan(this);
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e10);
                throw new zzh("Could not obtain webview for the overlay.", e10);
            }
        } else {
            z12 = z13;
            theme = null;
            zzcku zzckuVar7 = this.zzc.zzd;
            this.zzd = zzckuVar7;
            zzckuVar7.zzai(this.zzb);
        }
        if (this.zzc.zzw) {
            i10 = 0;
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzD(), false);
            if (((Boolean) zzba.zzc().zzd(zzbiq.zzbB)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                this.zzd.zzD().setTextClassifier(TextClassifier.NO_OP);
            }
            if (((Boolean) zzba.zzc().zzd(zzbiq.zzbC)).booleanValue()) {
                this.zzd.zzD().setDownloadListener(zze.zza);
            }
        } else {
            i10 = 0;
        }
        this.zzd.zzae(this);
        zzcku zzckuVar8 = this.zzc.zzd;
        if (zzckuVar8 != null) {
            zzL(zzckuVar8.zzU(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zzd.zzE());
            }
            if (this.zzk) {
                this.zzd.zzat();
            }
            if (this.zzc.zzw) {
                Toolbar toolbar = new Toolbar(this.zzb);
                this.zzx = toolbar;
                toolbar.setId(View.generateViewId());
                this.zzd.zzE().setId(View.generateViewId());
                this.zzx.setBackgroundColor(-12303292);
                this.zzx.setVisibility(i10);
                try {
                    this.zzx.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().zzf().getDrawable(R.drawable.admob_close_button_white_cross, theme));
                } catch (Resources.NotFoundException | NullPointerException e11) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e11);
                }
                this.zzx.setNavigationOnClickListener(this.zzq);
                this.zzx.setTitleMarginStart(i10);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.zzl.addView(this.zzx, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.zzx.getId());
                layoutParams2.addRule(12);
                this.zzl.addView(this.zzd.zzE(), layoutParams2);
                zzK(this.zzx);
            } else {
                this.zzl.addView(this.zzd.zzE(), -1, -1);
            }
        }
        if (!z10 && !this.zzm) {
            zzD();
        }
        if (this.zzc.zzk != 5) {
            zzr(z12);
            if (this.zzd.zzR()) {
                zzt(z12, true);
                return;
            }
            return;
        }
        Activity activity2 = this.zzb;
        zzeks zzeksVarZze = zzekt.zze();
        zzeksVarZze.zza(activity2);
        zzeksVarZze.zzb(this);
        zzeksVarZze.zzc(this.zzc.zzq);
        zzeksVarZze.zzd(this.zzc.zzr);
        try {
            zzG(zzeksVarZze.zze());
        } catch (RemoteException | zzh e12) {
            throw new zzh(e12.getMessage(), e12);
        }
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzx;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }
}

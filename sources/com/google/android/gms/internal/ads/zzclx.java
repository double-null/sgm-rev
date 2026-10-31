package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzclx extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcku {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcma zzB;
    private boolean zzC;
    private boolean zzD;
    private zzblr zzE;
    private zzblo zzF;
    private zzbgd zzG;
    private int zzH;
    private int zzI;
    private zzbjc zzJ;
    private final zzbjc zzK;
    private zzbjc zzL;
    private final zzbjd zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbhp zzY;
    private boolean zzZ;
    private final zzcmw zzb;
    private final zzbap zzc;
    private final zzflc zzd;
    private final zzbjx zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfkf zzk;
    private zzfki zzl;
    private boolean zzm;
    private boolean zzn;
    private zzclf zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzeln zzq;
    private zzell zzr;
    private zzcne zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    protected zzclx(zzcmw zzcmwVar, zzcne zzcneVar, String str, boolean z10, boolean z11, zzbap zzbapVar, zzbjx zzbjxVar, VersionInfoParcel versionInfoParcel, zzbjf zzbjfVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbhp zzbhpVar, zzfkf zzfkfVar, zzfki zzfkiVar, zzflc zzflcVar) {
        zzfki zzfkiVar2;
        super(zzcmwVar);
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcmwVar;
        this.zzs = zzcneVar;
        this.zzt = str;
        this.zzw = z10;
        this.zzc = zzbapVar;
        this.zzd = zzflcVar;
        this.zze = zzbjxVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzv = com.google.android.gms.ads.internal.util.zzs.zzv(windowManager);
        this.zzi = displayMetricsZzv;
        this.zzj = displayMetricsZzv.density;
        this.zzY = zzbhpVar;
        this.zzk = zzfkfVar;
        this.zzl = zzfkiVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcmwVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzna)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoH)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzcmwVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzp(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzcmf(this, new zzcme() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // com.google.android.gms.internal.ads.zzcme
            public final /* synthetic */ void zza(Uri uri) {
                zzclf zzclfVarZzaS = ((zzclx) this).zzaS();
                if (zzclfVarZzaS != null) {
                    zzclfVarZzaS.zzQ(uri);
                } else {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbjd zzbjdVar = new zzbjd(new zzbjf(true, "make_wv", this.zzt));
        this.zzM = zzbjdVar;
        zzbjdVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcB)).booleanValue() && (zzfkiVar2 = this.zzl) != null && zzfkiVar2.zzb != null) {
            zzbjdVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbjdVar.zzc();
        zzbjc zzbjcVarZzf = zzbjf.zzf();
        this.zzK = zzbjcVarZzf;
        zzbjdVar.zza("native:view_create", zzbjcVarZzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcmwVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzj();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzclu
                private final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrlUnsafe");
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean boolZzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = boolZzc;
        if (boolZzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbix.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfkf zzfkfVar = this.zzk;
        if (zzfkfVar != null && zzfkfVar.zzam) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private final synchronized void zzbg() {
        Map map = this.zzW;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcja) it.next()).release();
            }
        }
        this.zzW = null;
    }

    private final void zzbh() {
        zzbjd zzbjdVar = this.zzM;
        if (zzbjdVar == null) {
            return;
        }
        zzbjf zzbjfVarZzc = zzbjdVar.zzc();
        zzbiv zzbivVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zzbivVarZza != null) {
            zzbivVarZza.zzb(zzbjfVarZzc);
        }
    }

    private final void zzbi(boolean z10) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zze("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void destroy() {
        zzbh();
        this.zzQ.zzc();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.zzp.zzq();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzr = null;
        this.zzo.zzF();
        this.zzG = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzv) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
        zzbg();
        this.zzv = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmi)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
            return;
        }
        Activity activityZzb = this.zzb.zzb();
        if (activityZzb != null && activityZzb.isDestroyed()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzY();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaZ("about:blank");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmj)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcfr.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzF();
                    com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                    zzbg();
                    zzbf();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzX()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdWebViewImpl.loadUrl");
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzX()) {
            this.zzQ.zzd();
        }
        if (this.zzZ) {
            onResume();
            this.zzZ = false;
        }
        boolean z10 = this.zzC;
        zzclf zzclfVar = this.zzo;
        if (zzclfVar != null && zzclfVar.zzl()) {
            if (!this.zzD) {
                this.zzo.zzo();
                this.zzo.zzp();
                this.zzD = true;
            }
            zzaM();
            z10 = true;
        }
        zzbi(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzclf zzclfVar;
        synchronized (this) {
            if (!zzX()) {
                this.zzQ.zze();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzclfVar = this.zzo) != null && zzclfVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zzo();
                this.zzo.zzp();
                this.zzD = false;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmx)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(getContext(), intent);
        } catch (ActivityNotFoundException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb2.append("Couldn't find an Activity to view url/mimetype: ");
            sb2.append(str);
            sb2.append(" / ");
            sb2.append(str4);
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zZzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zZzaM) {
            return;
        }
        zzmVarZzL.zzC();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[Catch: all -> 0x0209, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0074, B:47:0x008a, B:41:0x007b, B:44:0x0080, B:50:0x0097, B:52:0x009f, B:54:0x00b1, B:57:0x00b6, B:59:0x00d2, B:61:0x00da, B:60:0x00d6, B:64:0x00df, B:66:0x00e7, B:69:0x00f2, B:78:0x0116, B:80:0x011d, B:85:0x0125, B:87:0x0137, B:89:0x0145, B:93:0x0152, B:96:0x0157, B:98:0x01cc, B:99:0x01cf, B:101:0x01d6, B:106:0x01e3, B:108:0x01e9, B:109:0x01ec, B:111:0x01f0, B:112:0x01f9, B:115:0x0204), top: B:121:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final synchronized void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i10, i11);
                return;
            }
            if (this.zzs.zzi()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeK)).booleanValue()) {
                    super.onMeasure(i10, i11);
                    return;
                }
                zzcma zzcmaVarZzh = zzh();
                float fZzm = zzcmaVarZzh != null ? zzcmaVarZzh.zzm() : 0.0f;
                if (fZzm == 0.0f) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                float f10 = size2 * fZzm;
                int i16 = (int) (size / fZzm);
                if (size2 != 0) {
                    i12 = (int) f10;
                    if (size == 0) {
                        i15 = size;
                    } else if (i12 != 0) {
                        i16 = (int) (i12 / fZzm);
                        i13 = size2;
                        i14 = i12;
                        i15 = i14;
                    }
                    i13 = size2;
                    i14 = i12;
                } else if (i16 != 0) {
                    i14 = (int) (i16 * fZzm);
                    i15 = size;
                    i13 = i16;
                } else {
                    size2 = 0;
                    i12 = (int) f10;
                    if (size == 0) {
                        i15 = size;
                    } else if (i12 != 0) {
                        i16 = (int) (i12 / fZzm);
                        i13 = size2;
                        i14 = i12;
                        i15 = i14;
                    }
                    i13 = size2;
                    i14 = i12;
                }
                setMeasuredDimension(Math.min(i14, i15), Math.min(i16, i13));
                return;
            }
            if (this.zzs.zzf()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzeS)).booleanValue()) {
                    super.onMeasure(i10, i11);
                    return;
                }
                zzab("/contentHeight", new zzclr(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f11 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i10);
                int i17 = this.zzI;
                setMeasuredDimension(size3, i17 != -1 ? (int) (i17 * f11) : View.MeasureSpec.getSize(i11));
                return;
            }
            if (this.zzs.zzg()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int size4 = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size5 = View.MeasureSpec.getSize(i11);
            int i18 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size4 : Integer.MAX_VALUE;
            int i19 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
            zzcne zzcneVar = this.zzs;
            boolean z10 = zzcneVar.zzb > i18 || zzcneVar.zza > i19;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgx)).booleanValue()) {
                zzcne zzcneVar2 = this.zzs;
                float f12 = zzcneVar2.zzb;
                float f13 = this.zzj;
                z10 &= f12 / f13 <= ((float) i18) / f13 && ((float) zzcneVar2.zza) / f13 <= ((float) i19) / f13;
            }
            if (!z10) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.zzn) {
                    this.zzY.zzc(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE);
                    this.zzn = true;
                }
                zzcne zzcneVar3 = this.zzs;
                setMeasuredDimension(zzcneVar3.zzb, zzcneVar3.zza);
                return;
            }
            zzcne zzcneVar4 = this.zzs;
            float f14 = zzcneVar4.zzb;
            float f15 = this.zzj;
            int i20 = (int) (f14 / f15);
            int i21 = (int) (zzcneVar4.zza / f15);
            int i22 = (int) (size4 / f15);
            int i23 = (int) (size5 / f15);
            StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 36 + String.valueOf(i21).length() + 18 + String.valueOf(i22).length() + 1 + String.valueOf(i23).length() + 4);
            sb2.append("Not enough space to show ad. Needs ");
            sb2.append(i20);
            sb2.append("x");
            sb2.append(i21);
            sb2.append(" dp, but only has ");
            sb2.append(i22);
            sb2.append("x");
            sb2.append(i23);
            sb2.append(" dp.");
            String string = sb2.toString();
            int i24 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            if (getVisibility() != 8) {
                setVisibility(4);
            }
            setMeasuredDimension(0, 0);
            if (this.zzm) {
                return;
            }
            this.zzY.zzc(10001);
            this.zzm = true;
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzob)).booleanValue() && d1.g.a("MUTE_AUDIO")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                d1.f.m(this, true);
            }
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e10);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzob)).booleanValue() && d1.g.a("MUTE_AUDIO")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                d1.f.m(this, false);
            }
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e10);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzes)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z10) {
            zzbap zzbapVar = this.zzc;
            if (zzbapVar != null) {
                zzbapVar.zzc(motionEvent);
            }
            zzbjx zzbjxVar = this.zze;
            if (zzbjxVar != null) {
                zzbjxVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                zzblr zzblrVar = this.zzE;
                if (zzblrVar != null) {
                    zzblrVar.zzb(motionEvent);
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcku
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclf) {
            this.zzo = (zzclf) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzckl
    public final zzfkf zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzG() {
        zzbb();
        HashMap map = new HashMap(1);
        map.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzH(int i10) {
        if (i10 == 0) {
            zzbjd zzbjdVar = this.zzM;
            zzbix.zza(zzbjdVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbjd zzbjdVar2 = this.zzM;
        zzbjdVar2.zzc();
        zzbjdVar2.zzc().zzd("close_type", String.valueOf(i10));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i10));
        map.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zzf.afmaVersion);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzI() {
        if (this.zzJ == null) {
            zzbjd zzbjdVar = this.zzM;
            zzbix.zza(zzbjdVar.zzc(), this.zzK, "aes2");
            zzbjdVar.zzc();
            zzbjc zzbjcVarZzf = zzbjf.zzf();
            this.zzJ = zzbjcVarZzf;
            zzbjdVar.zza("native:view_show", zzbjcVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.zzf.afmaVersion);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzJ() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        map.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmm
    public final synchronized zzcne zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final /* synthetic */ zzcms zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmn
    public final zzbap zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final zzflc zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized zzeln zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized zzell zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcls(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzaA(final boolean z10, final int i10) {
        destroy();
        zzbho zzbhoVar = new zzbho() { // from class: com.google.android.gms.internal.ads.zzclv
            @Override // com.google.android.gms.internal.ads.zzbho
            public final /* synthetic */ void zza(zzbhv.zzt.zza zzaVar) {
                int i11 = zzclx.zza;
                zzbhv.zzbl.zza zzaVarZzq = zzbhv.zzbl.zzq();
                boolean zZzb = zzaVarZzq.zzb();
                boolean z11 = z10;
                if (zZzb != z11) {
                    zzaVarZzq.zzc(z11);
                }
                zzaVarZzq.zzg(i10);
                zzaVar.zzal(zzaVarZzq.zzbu());
            }
        };
        zzbhp zzbhpVar = this.zzY;
        zzbhpVar.zzb(zzbhoVar);
        zzbhpVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmb
    public final zzfki zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaD(zzfkf zzfkfVar, zzfki zzfkiVar) {
        this.zzk = zzfkfVar;
        this.zzl = zzfkiVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:11:0x0010, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaE(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        if (!z10) {
            zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzu(z10);
                return;
            }
            return;
        }
        setBackgroundColor(0);
        zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzu(z10);
            return;
        }
        return;
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final ListenableFuture zzaF() {
        zzbjx zzbjxVar = this.zze;
        return zzbjxVar == null ? zzhbw.zza(null) : zzbjxVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaG(boolean z10) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        this.zzo.zzv(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaI(boolean z10, int i10, boolean z11) {
        this.zzo.zzx(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaJ(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zzo.zzy(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaK(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzo.zzz(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcmk
    public final void zzaL(String str, String str2, int i10) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r10.zzV != r9) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaM() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzclf r0 = r10.zzo
            boolean r0 = r0.zzk()
            r1 = 0
            if (r0 != 0) goto L13
            com.google.android.gms.internal.ads.zzclf r0 = r10.zzo
            boolean r0 = r0.zzl()
            if (r0 != 0) goto L13
            goto L88
        L13:
            com.google.android.gms.ads.internal.client.zzay.zza()
            android.util.DisplayMetrics r0 = r10.zzi
            int r2 = r0.widthPixels
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r2)
            com.google.android.gms.ads.internal.client.zzay.zza()
            int r2 = r0.heightPixels
            int r5 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r2)
            com.google.android.gms.internal.ads.zzcmw r2 = r10.zzb
            android.app.Activity r2 = r2.zzb()
            r3 = 1
            if (r2 == 0) goto L52
            android.view.Window r6 = r2.getWindow()
            if (r6 != 0) goto L37
            goto L52
        L37:
            com.google.android.gms.ads.internal.zzt.zzc()
            int[] r2 = com.google.android.gms.ads.internal.util.zzs.zzV(r2)
            com.google.android.gms.ads.internal.client.zzay.zza()
            r6 = r2[r1]
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r6)
            com.google.android.gms.ads.internal.client.zzay.zza()
            r2 = r2[r3]
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r0, r2)
            r7 = r2
            goto L54
        L52:
            r6 = r4
            r7 = r5
        L54:
            com.google.android.gms.ads.internal.zzt.zzc()
            android.view.WindowManager r2 = r10.zzX
            android.view.Display r2 = r2.getDefaultDisplay()
            int r9 = r2.getRotation()
            int r2 = r10.zzS
            if (r2 != r4) goto L89
            int r2 = r10.zzR
            if (r2 != r5) goto L89
            int r2 = r10.zzT
            if (r2 != r6) goto L89
            int r2 = r10.zzU
            if (r2 != r7) goto L89
            com.google.android.gms.internal.ads.zzbih r2 = com.google.android.gms.internal.ads.zzbiq.zzaF
            com.google.android.gms.internal.ads.zzbio r8 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L88
            int r2 = r10.zzV
            if (r2 == r9) goto L88
            goto L89
        L88:
            return r1
        L89:
            int r2 = r10.zzS
            if (r2 != r4) goto La7
            int r2 = r10.zzR
            if (r2 != r5) goto La7
            com.google.android.gms.internal.ads.zzbih r2 = com.google.android.gms.internal.ads.zzbiq.zzaF
            com.google.android.gms.internal.ads.zzbio r8 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r8.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto La8
            int r2 = r10.zzV
            if (r2 == r9) goto La8
        La7:
            r1 = r3
        La8:
            r10.zzS = r4
            r10.zzR = r5
            r10.zzT = r6
            r10.zzU = r7
            r10.zzV = r9
            com.google.android.gms.internal.ads.zzbyg r3 = new com.google.android.gms.internal.ads.zzbyg
            java.lang.String r2 = ""
            r3.<init>(r10, r2)
            float r8 = r0.density
            r3.zzl(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclx.zzaM():boolean");
    }

    protected final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzclf zzaS() {
        return this.zzo;
    }

    final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    final /* synthetic */ void zzaY(int i10) {
        this.zzI = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzab(String str, zzbpq zzbpqVar) {
        zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzB(str, zzbpqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzac(String str, zzbpq zzbpqVar) {
        zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzC(str, zzbpqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzad(String str, Predicate predicate) {
        zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaf(zzcne zzcneVar) {
        this.zzs = zzcneVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzag(boolean z10) {
        boolean z11 = this.zzw;
        this.zzw = z10;
        zzbc();
        if (z10 != z11) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaD)).booleanValue() || !this.zzs.zzg()) {
                new zzbyg(this, "").zzk(true != z10 ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzai(Context context) {
        zzcmw zzcmwVar = this.zzb;
        zzcmwVar.setBaseContext(context);
        this.zzQ.zza(zzcmwVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaj(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(this.zzo.zzk(), z10);
        } else {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzak(zzeln zzelnVar) {
        this.zzq = zzelnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzal(zzell zzellVar) {
        this.zzr = zzellVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzam(int i10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzw(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzao(boolean z10) {
        this.zzz = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzap() {
        if (this.zzL == null) {
            zzbjd zzbjdVar = this.zzM;
            zzbjdVar.zzc();
            zzbjc zzbjcVarZzf = zzbjf.zzf();
            this.zzL = zzbjcVarZzf;
            zzbjdVar.zza("native:view_load", zzbjcVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzaq(zzblr zzblrVar) {
        this.zzE = zzblrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized zzblr zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzas(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i10 = this.zzH + (true != z10 ? -1 : 1);
        this.zzH = i10;
        if (i10 > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzau(String str, String str2, String str3) {
        String str4;
        if (zzX()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaC);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, str5);
            jSONObject.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e10);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzcml.zza(str2, strArr), "text/html", Constants.ENCODING, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final void zzaw(boolean z10) {
        this.zzo.zzO(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzax(zzblo zzbloVar) {
        this.zzF = zzbloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized void zzay(zzbgd zzbgdVar) {
        this.zzG = zzbgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final synchronized zzbgd zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzc(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb2.append(str);
        sb2.append("(");
        sb2.append(str2);
        sb2.append(");");
        zzaP(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        String string2 = sb2.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string2));
        zzaP(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdR() {
        zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(zzbep zzbepVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzbepVar.zzj;
            this.zzC = z10;
        }
        zzbi(z10);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final zzchc zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzdn(boolean z10) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final void zzdu() {
        zzclf zzclfVar = this.zzo;
        if (zzclfVar != null) {
            zzclfVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final synchronized zzcma zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final zzbjc zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmg, com.google.android.gms.internal.ads.zzchn
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized String zzn() {
        zzfki zzfkiVar = this.zzl;
        if (zzfkiVar == null) {
            return null;
        }
        return zzfkiVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzo(int i10) {
        this.zzN = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final zzbjd zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized zzcja zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcja) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmo, com.google.android.gms.internal.ads.zzchn
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzt(String str, zzcja zzcjaVar) {
        if (this.zzW == null) {
            this.zzW = new HashMap();
        }
        this.zzW.put(str, zzcjaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzu(boolean z10, long j10) {
        HashMap map = new HashMap(2);
        map.put(GraphResponse.SUCCESS_KEY, true != z10 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        map.put("duration", Long.toString(j10));
        zze("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzw(zzcma zzcmaVar) {
        if (this.zzB == null) {
            this.zzB = zzcmaVar;
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final synchronized void zzz() {
        zzblo zzbloVar = this.zzF;
        if (zzbloVar != null) {
            zzbloVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcku
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcku, com.google.android.gms.internal.ads.zzcmp
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzA(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzchn
    public final void zzv(int i10) {
    }
}

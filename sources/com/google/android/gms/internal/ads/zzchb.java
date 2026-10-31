package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzchb extends FrameLayout implements zzcgs {
    final zzchp zza;
    private final zzchn zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbjf zze;
    private final long zzf;
    private final zzcgt zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzchb(Context context, zzchn zzchnVar, int i10, boolean z10, zzbjf zzbjfVar, zzchm zzchmVar, zzdzl zzdzlVar) {
        super(context);
        this.zzb = zzchnVar;
        this.zze = zzbjfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzchnVar.zzk());
        zzcgu zzcguVar = zzchnVar.zzk().zza;
        zzcho zzchoVar = new zzcho(context, zzchnVar.zzs(), zzchnVar.zzm(), zzbjfVar, zzchnVar.zzi());
        zzcgt zzckjVar = i10 == 3 ? new zzckj(context, zzchoVar) : i10 == 2 ? new zzcif(context, zzchoVar, zzchnVar, z10, zzcgu.zza(zzchnVar), zzchmVar, zzdzlVar) : new zzcgr(context, zzchnVar, z10, zzcgu.zza(zzchnVar), zzchmVar, new zzcho(context, zzchnVar.zzs(), zzchnVar.zzm(), zzbjfVar, zzchnVar.zzi()), zzdzlVar);
        this.zzg = zzckjVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzckjVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzat)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzaq)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzav)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzas)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbjfVar != null) {
            zzbjfVar.zzd("spinner_used", true != zBooleanValue ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        this.zza = new zzchp(this);
        zzckjVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzchn zzchnVar = this.zzb;
        if (zzchnVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzchnVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcgt zzcgtVar = this.zzg;
            if (zzcgtVar != null) {
                zzcfr.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcgtVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcha
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgs
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgx(this, z10));
    }

    public final void zzA(int i10) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzB(i10);
    }

    public final void zzB(int i10) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzC(i10);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        TextView textView = new TextView(zzcgtVar.getContext());
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        textView.setText(String.valueOf(resourcesZzf == null ? "AdMob - " : resourcesZzf.getString(R.string.watermark_label_prefix)).concat(zzcgtVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null) {
            zzcgtVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        long jZzh = zzcgtVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f10 = jZzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcB)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(zzcgtVar.zzo()), "qoeCachedBytes", String.valueOf(zzcgtVar.zzn()), "qoeLoadedBytes", String.valueOf(zzcgtVar.zzm()), "droppedFrames", String.valueOf(zzcgtVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = jZzh;
    }

    final /* synthetic */ void zzG(boolean z10) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzb() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcgtVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcgtVar.zzk()), "videoHeight", String.valueOf(zzcgtVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcD)).booleanValue()) {
            this.zza.zzb();
        }
        zzchn zzchnVar = this.zzb;
        if (zzchnVar.zzj() != null && !this.zzi) {
            boolean z10 = (zzchnVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                zzchnVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcD)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzcgtVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb2.append("Spinner frame grab took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbjf zzbjfVar = this.zze;
            if (zzbjfVar != null) {
                zzbjfVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbih zzbihVar = zzbiq.zzau;
            int iMax = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null) {
            return zzcgtVar.zzw();
        }
        return null;
    }

    public final void zzm(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzat)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzn(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i10).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length() + 3 + String.valueOf(i13).length());
            sb2.append("Set video bounds to x:");
            sb2.append(i10);
            sb2.append(";y:");
            sb2.append(i11);
            sb2.append(";w:");
            sb2.append(i12);
            sb2.append(";h:");
            sb2.append(i13);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f10, float f11) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null) {
            zzcgtVar.zzj(f10, f11);
        }
    }

    public final void zzq(Integer num) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcgtVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzf();
    }

    public final void zzs() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zze();
    }

    public final void zzt(int i10) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzi(i10);
    }

    public final void zzu() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzb.zza(true);
        zzcgtVar.zzq();
    }

    public final void zzv() {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzb.zza(false);
        zzcgtVar.zzq();
    }

    public final void zzw(float f10) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzb.zzb(f10);
        zzcgtVar.zzq();
    }

    public final void zzx(int i10) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzy(i10);
    }

    public final void zzy(int i10) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzz(i10);
    }

    public final void zzz(int i10) {
        zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzA(i10);
    }
}

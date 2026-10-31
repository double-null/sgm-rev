package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.RoundedCorner;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.view.d3;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeuv implements zzfck {
    private final zzfck zza;
    private final zzfky zzb;
    private final Context zzc;
    private final zzcfd zzd;

    zzeuv(zzewy zzewyVar, zzfky zzfkyVar, Context context, zzcfd zzcfdVar) {
        this.zza = zzewyVar;
        this.zzb = zzfkyVar;
        this.zzc = context;
        this.zzd = zzcfdVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i10, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i10 / f10);
    }

    private static final androidx.core.graphics.g zzf(androidx.core.graphics.g gVar, float f10) {
        return f10 == 0.0f ? androidx.core.graphics.g.f1850e : androidx.core.graphics.g.b((int) Math.ceil(gVar.f1851a / f10), (int) Math.ceil(gVar.f1852b / f10), (int) Math.ceil(gVar.f1853c / f10), (int) Math.ceil(gVar.f1854d / f10));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return zzhbw.zzk(this.zza.zza(), new zzgta() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfct) obj);
            }
        }, zzcfr.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 7;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:104:0x0222 A[PHI: r11
      0x0222: PHI (r11v6 androidx.core.graphics.g) = 
      (r11v5 androidx.core.graphics.g)
      (r11v5 androidx.core.graphics.g)
      (r11v10 androidx.core.graphics.g)
      (r11v10 androidx.core.graphics.g)
      (r11v15 androidx.core.graphics.g)
     binds: [B:100:0x01ed, B:106:0x0236, B:108:0x0254, B:110:0x025c, B:103:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x0226  */
    /* JADX WARN: Code duplicated, block: B:107:0x0238  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01df  */
    final /* synthetic */ zzeuw zzc(zzfct zzfctVar) {
        boolean z10;
        String str;
        int i10;
        int i11;
        int i12;
        float f10;
        String strZzu;
        int iHeight;
        String str2;
        int i13;
        String str3;
        Window window;
        View decorView;
        d3 d3VarQ;
        androidx.core.graphics.g gVarZzf;
        androidx.core.graphics.g gVar;
        zzeut zzeutVar;
        WindowManager windowManager;
        androidx.core.graphics.g gVarB;
        WindowManager windowManager2;
        WindowInsets windowInsets;
        WindowManager windowManager3;
        Context context;
        WindowManager windowManager4;
        Resources resources;
        DisplayMetrics displayMetrics;
        int i14;
        int i15;
        WindowManager windowManager5;
        DisplayMetrics displayMetrics2;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzb.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            str = null;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z13 = zzrVar2.zzi;
                if (!z13 && !z11) {
                    str = zzrVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z10 = zzrVar.zzi;
        }
        Context context2 = this.zzc;
        Resources resources2 = context2.getResources();
        Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (activityZzd == null) {
            i10 = -1;
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoW)).booleanValue()) {
            try {
                i10 = context2.getPackageManager().getActivityInfo(activityZzd.getComponentName(), 0).screenOrientation;
            } catch (PackageManager.NameNotFoundException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdSizeParcelSignal.Source.readOrientationFromManifest");
                i10 = -1;
            }
        } else {
            i10 = -1;
        }
        if (resources2 == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null) {
            i11 = 0;
            i12 = 0;
            f10 = 0.0f;
            strZzu = null;
        } else {
            zzcfd zzcfdVar = this.zzd;
            float f11 = displayMetrics2.density;
            i12 = displayMetrics2.widthPixels;
            i11 = displayMetrics2.heightPixels;
            strZzu = zzcfdVar.zzo().zzu();
            f10 = f11;
        }
        zzbih zzbihVar = zzbiq.zzoT;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() || (i15 = Build.VERSION.SDK_INT) > 34 || i15 < 28 || (windowManager5 = (WindowManager) this.zzc.getSystemService("window")) == null) {
            iHeight = i11;
        } else if (i15 >= 30) {
            WindowMetrics currentWindowMetrics = windowManager5.getCurrentWindowMetrics();
            int iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
            i12 = iWidth;
        } else {
            Point point = new Point();
            windowManager5.getDefaultDisplay().getRealSize(point);
            int i16 = point.x;
            i11 = point.y;
            i12 = i16;
            iHeight = i11;
        }
        StringBuilder sb2 = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr2 = zzrVar.zzg;
        if (zzrVarArr2 != null) {
            int i17 = 0;
            boolean z14 = false;
            while (i17 < zzrVarArr2.length) {
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVarArr2[i17];
                com.google.android.gms.ads.internal.client.zzr[] zzrVarArr3 = zzrVarArr2;
                if (zzrVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i18 = zzrVar3.zze;
                    if (i18 == -1) {
                        i18 = f10 != 0.0f ? (int) (zzrVar3.zzf / f10) : -1;
                    }
                    sb2.append(i18);
                    sb2.append("x");
                    int i19 = zzrVar3.zzb;
                    if (i19 == -2) {
                        i19 = f10 != 0.0f ? (int) (zzrVar3.zzc / f10) : -2;
                    }
                    sb2.append(i19);
                }
                i17++;
                zzrVarArr2 = zzrVarArr3;
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i14 = 0;
                    sb2.insert(0, "|");
                } else {
                    i14 = 0;
                }
                sb2.insert(i14, "320x50");
            }
        }
        String string = sb2.toString();
        zzfky zzfkyVar = this.zzb;
        int i20 = Build.VERSION.SDK_INT;
        if (i20 >= 35) {
            zzbih zzbihVar2 = zzbiq.zzoN;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoR)).booleanValue()) {
                    context = this.zzc;
                    windowManager4 = (WindowManager) context.getSystemService("window");
                    if (windowManager4 == null) {
                        i13 = i10;
                    } else {
                        i13 = i10;
                        if (i20 >= 30) {
                            WindowMetrics currentWindowMetrics2 = windowManager4.getCurrentWindowMetrics();
                            int iWidth2 = currentWindowMetrics2.getBounds().width();
                            int iHeight2 = currentWindowMetrics2.getBounds().height();
                            resources = context.getResources();
                            if (resources == null) {
                            }
                        }
                    }
                    str3 = strZzu;
                } else {
                    i13 = i10;
                    str3 = strZzu;
                }
                Context context3 = this.zzc;
                gVarB = androidx.core.graphics.g.f1850e;
                windowManager2 = (WindowManager) context3.getSystemService("window");
                if (windowManager2 != null) {
                    windowInsets = windowManager2.getCurrentWindowMetrics().getWindowInsets();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2)).booleanValue()) {
                        gVarB = androidx.core.graphics.g.d(windowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
                    } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoO)).booleanValue()) {
                        gVarB = androidx.core.graphics.g.d(windowInsets.getInsets(WindowInsets.Type.displayCutout()));
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoP)).booleanValue()) {
                        }
                    }
                    str2 = string;
                } else {
                    str2 = string;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoQ)).booleanValue()) {
                    int iMax = Math.max(gVarB.f1851a, gVarB.f1853c);
                    gVarB = androidx.core.graphics.g.b(iMax, gVarB.f1852b, iMax, gVarB.f1854d);
                }
                gVarZzf = zzf(gVarB, f10);
                gVar = gVarZzf;
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoO)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoR)).booleanValue()) {
                    context = this.zzc;
                    windowManager4 = (WindowManager) context.getSystemService("window");
                    if (windowManager4 == null) {
                        i13 = i10;
                    } else {
                        i13 = i10;
                        if (i20 >= 30) {
                            WindowMetrics currentWindowMetrics3 = windowManager4.getCurrentWindowMetrics();
                            int iWidth3 = currentWindowMetrics3.getBounds().width();
                            int iHeight3 = currentWindowMetrics3.getBounds().height();
                            resources = context.getResources();
                            if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                                str3 = strZzu;
                                int i21 = displayMetrics.widthPixels;
                                int i22 = displayMetrics.heightPixels;
                                if (iWidth3 > i21 || iHeight3 > i22) {
                                    str2 = string;
                                }
                            }
                        }
                    }
                    str3 = strZzu;
                } else {
                    i13 = i10;
                    str3 = strZzu;
                }
                Context context4 = this.zzc;
                gVarB = androidx.core.graphics.g.f1850e;
                windowManager2 = (WindowManager) context4.getSystemService("window");
                if (windowManager2 != null) {
                    windowInsets = windowManager2.getCurrentWindowMetrics().getWindowInsets();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2)).booleanValue()) {
                        gVarB = androidx.core.graphics.g.d(windowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
                    } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoO)).booleanValue()) {
                        gVarB = androidx.core.graphics.g.d(windowInsets.getInsets(WindowInsets.Type.displayCutout()));
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoP)).booleanValue() && (windowManager3 = (WindowManager) context4.getSystemService("window")) != null) {
                            WindowInsets windowInsets2 = windowManager3.getCurrentWindowMetrics().getWindowInsets();
                            int iZzd = zzd(windowInsets2, 0);
                            int iZzd2 = zzd(windowInsets2, 1);
                            str2 = string;
                            int iZzd3 = zzd(windowInsets2, 3);
                            int iZzd4 = zzd(windowInsets2, 2);
                            gVarB = iHeight >= i12 ? androidx.core.graphics.g.b(gVarB.f1851a, Math.max(gVarB.f1852b, Math.max(iZzd, iZzd2)), gVarB.f1853c, Math.max(gVarB.f1854d, Math.max(iZzd3, iZzd4))) : androidx.core.graphics.g.b(Math.max(gVarB.f1851a, Math.max(iZzd, iZzd3)), gVarB.f1852b, Math.max(gVarB.f1853c, Math.max(iZzd2, iZzd4)), gVarB.f1854d);
                        }
                    }
                    str2 = string;
                } else {
                    str2 = string;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoQ)).booleanValue() && iHeight < i12) {
                    int iMax2 = Math.max(gVarB.f1851a, gVarB.f1853c);
                    gVarB = androidx.core.graphics.g.b(iMax2, gVarB.f1852b, iMax2, gVarB.f1854d);
                }
                gVarZzf = zzf(gVarB, f10);
                gVar = gVarZzf;
            } else {
                str2 = string;
                i13 = i10;
                str3 = strZzu;
            }
            gVar = null;
        } else {
            str2 = string;
            i13 = i10;
            str3 = strZzu;
            if (i20 > 34 || i20 < 28 || !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                gVar = null;
            } else {
                androidx.core.graphics.g gVarF = androidx.core.graphics.g.f1850e;
                if (i20 >= 30) {
                    WindowManager windowManager6 = (WindowManager) this.zzc.getSystemService("window");
                    if (windowManager6 != null) {
                        gVarF = androidx.core.graphics.g.d(windowManager6.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
                    }
                } else {
                    Activity activityZzd2 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
                    if (activityZzd2 != null && (window = activityZzd2.getWindow()) != null && (decorView = window.getDecorView()) != null && (d3VarQ = androidx.core.view.z0.q(decorView)) != null) {
                        gVarF = d3VarQ.f(d3.m.c() | d3.m.a());
                    }
                }
                gVarZzf = zzf(gVarF, f10);
                gVar = gVarZzf;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzoS)).booleanValue() || i20 < 31 || f10 == 0.0f || (windowManager = (WindowManager) this.zzc.getSystemService("window")) == null) {
            zzeutVar = null;
        } else {
            WindowInsets windowInsets3 = windowManager.getCurrentWindowMetrics().getWindowInsets();
            zzeutVar = new zzeut(zze(zzd(windowInsets3, 0), f10), zze(zzd(windowInsets3, 1), f10), zze(zzd(windowInsets3, 3), f10), zze(zzd(windowInsets3, 2), f10));
        }
        return new zzeuw(zzrVar, str, z10, str2, f10, i12, iHeight, str3, i13, zzfkyVar.zzr, gVar, zzeutVar);
    }
}

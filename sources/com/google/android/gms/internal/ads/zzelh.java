package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzelh implements zzeli {
    static /* synthetic */ zzeln zzl(String str, String str2, String str3, zzelj zzeljVar, String str4, WebView webView, String str5, String str6, zzelk zzelkVar) {
        zzfuy zzfuyVarZza = zzfuy.zza("Google", str2);
        zzfux zzfuxVarZzn = zzn("javascript");
        zzfup zzfupVarZzp = zzp(zzeljVar.toString());
        zzfux zzfuxVar = zzfux.NONE;
        if (zzfuxVarZzn == zzfuxVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfupVarZzp == null) {
            String strValueOf = String.valueOf(zzeljVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzfux zzfuxVarZzn2 = zzn(str4);
        if (zzfupVarZzp != zzfup.VIDEO || zzfuxVarZzn2 != zzfuxVar) {
            zzfum zzfumVarZza = zzfum.zza(zzfuyVarZza, webView, str5, "");
            return new zzeln(zzfuk.zze(zzful.zza(zzfupVarZzp, zzo(zzelkVar.toString()), zzfuxVarZzn, zzfuxVarZzn2, true), zzfumVarZza), zzfumVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    static /* synthetic */ zzeln zzm(String str, String str2, String str3, String str4, zzelj zzeljVar, WebView webView, String str5, String str6, zzelk zzelkVar) {
        zzfuy zzfuyVarZza = zzfuy.zza(str, str2);
        zzfux zzfuxVarZzn = zzn("javascript");
        zzfux zzfuxVarZzn2 = zzn(str4);
        zzfup zzfupVarZzp = zzp(zzeljVar.toString());
        zzfux zzfuxVar = zzfux.NONE;
        if (zzfuxVarZzn == zzfuxVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfupVarZzp == null) {
            String strValueOf = String.valueOf(zzeljVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfupVarZzp != zzfup.VIDEO || zzfuxVarZzn2 != zzfuxVar) {
            zzfum zzfumVarZzb = zzfum.zzb(zzfuyVarZza, webView, str5, "");
            return new zzeln(zzfuk.zze(zzful.zza(zzfupVarZzp, zzo(zzelkVar.toString()), zzfuxVarZzn, zzfuxVarZzn2, true), zzfumVarZzb), zzfumVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzfux zzn(String str) {
        if ("native".equals(str)) {
            return zzfux.NATIVE;
        }
        return "javascript".equals(str) ? zzfux.JAVASCRIPT : zzfux.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfus zzo(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals("beginToRender")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return zzfus.BEGIN_TO_RENDER;
        }
        if (b10 != 1) {
            return b10 != 2 ? zzfus.UNSPECIFIED : zzfus.ONE_PIXEL;
        }
        return zzfus.DEFINED_BY_JAVASCRIPT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfup zzp(String str) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("video")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b10 = 0;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return zzfup.HTML_DISPLAY;
        }
        if (b10 == 1) {
            return zzfup.NATIVE_DISPLAY;
        }
        if (b10 != 2) {
            return null;
        }
        return zzfup.VIDEO;
    }

    private static final Object zzq(zzelg zzelgVar) {
        try {
            return zzelgVar.zza();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "omid exception");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzelg() { // from class: com.google.android.gms.internal.ads.zzelf
                @Override // com.google.android.gms.internal.ads.zzelg
                public final /* synthetic */ Object zza() {
                    if (zzfui.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfui.zza(context);
                    return Boolean.valueOf(zzfui.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue()) {
            return (String) zzq(zzekw.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final zzeln zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzelk zzelkVar, final zzelj zzeljVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue() || !zzfui.zzb()) {
            return null;
        }
        final String str6 = "";
        final String str7 = "javascript";
        final String str8 = "Google";
        return (zzeln) zzq(new zzelg(str8, str, str7, zzeljVar, str4, webView, str5, str6, zzelkVar) { // from class: com.google.android.gms.internal.ads.zzekx
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzelj zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzelk zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzeljVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzelkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelg
            public final /* synthetic */ Object zza() {
                return zzelh.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final zzeln zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzelk zzelkVar, final zzelj zzeljVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue() || !zzfui.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzeln) zzq(new zzelg(str5, str, str8, str4, zzeljVar, webView, str6, str7, zzelkVar) { // from class: com.google.android.gms.internal.ads.zzeky
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzelj zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzelk zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzeljVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzelkVar;
            }

            @Override // com.google.android.gms.internal.ads.zzelg
            public final /* synthetic */ Object zza() {
                return zzelh.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zze(final zzfuk zzfukVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue() && zzfui.zzb()) {
            Objects.requireNonNull(zzfukVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfukVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzf(final zzfuk zzfukVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzekz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue() && zzfui.zzb()) {
                    zzfukVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzg(final zzfuk zzfukVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzela
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue() && zzfui.zzb()) {
                    zzfukVar.zzd(view, zzfur.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzh(final zzfuk zzfukVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue() && zzfui.zzb()) {
                    zzfukVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final zzfuw zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z10) {
        final boolean z11 = true;
        return (zzfuw) zzq(new zzelg(webView, z11) { // from class: com.google.android.gms.internal.ads.zzelc
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzelg
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i10 = versionInfoParcel2.buddyApkVersion;
                int i11 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
                sb2.append(i10);
                sb2.append(".");
                sb2.append(i11);
                return zzfuw.zza(zzfuy.zza("Google", sb2.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzj(final zzfuw zzfuwVar, final zzfuv zzfuvVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfuwVar.zzb(zzfuvVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeli
    public final void zzk(final zzfuw zzfuwVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzele
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfuwVar.zzd(view, zzfur.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, XDucgbzInpQa.tzxH);
        }
    }
}

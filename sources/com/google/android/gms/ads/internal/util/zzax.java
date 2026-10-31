package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzecq;
import com.google.android.gms.internal.ads.zzecr;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k9.dW.xjwcmjDeOXR;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzax {
    private zzecr zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = "";

    /* JADX WARN: Code duplicated, block: B:18:0x0068 A[Catch: all -> 0x007f, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0032, B:12:0x003a, B:14:0x004f, B:17:0x0061, B:9:0x0029, B:18:0x0068, B:19:0x006a), top: B:29:0x000b, inners: #0, #1 }] */
    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i10 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes(StandardCharsets.UTF_8));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        int i11 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error writing to file in internal storage.", e10);
                    }
                    str4 = this.zzc;
                } else {
                    str4 = this.zzc;
                }
            } else {
                str4 = this.zzc;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final void zza(zzecr zzecrVar) {
        this.zzg = zzecrVar;
    }

    public final zzecr zzb() {
        return this.zzg;
    }

    public final void zzc(Context context) {
        zzecr zzecrVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkD)).booleanValue() || (zzecrVar = this.zzg) == null) {
            return;
        }
        zzecrVar.zzo(new zzau(this, context), zzecq.DEBUG_MENU);
    }

    final boolean zzd(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfT), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZzo.trim());
            String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkD)).booleanValue()) {
                String str3 = this.zza;
                boolean z10 = AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str3) || "2".equals(str3);
                zzj(z10);
                zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (!z10) {
                    str = "";
                }
                zzgVarZzo.zzM(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (JSONException e10) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get in app preview response json.", e10);
            return false;
        }
    }

    public final boolean zze(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfU), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(new JSONObject(strZzo.trim()).optString("debug_mode"));
            zzj(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkD)).booleanValue()) {
                zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzo.zzM(str);
            }
            return zEquals;
        } catch (JSONException e10) {
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get debug mode response json.", e10);
            return false;
        }
    }

    public final void zzf(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzZ(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfS), str, str2));
    }

    public final boolean zzg(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfV), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzO(context, str, builderBuildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzj(boolean z10) {
        synchronized (this.zzb) {
            this.zzf = z10;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(z10);
                zzecr zzecrVar = this.zzg;
                if (zzecrVar != null) {
                    zzecrVar.zzb(z10);
                }
            }
        }
    }

    public final boolean zzk() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzf;
        }
        return z10;
    }

    public final void zzl(boolean z10) {
        synchronized (this.zzb) {
            this.zze = z10;
        }
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zze;
        }
        return z10;
    }

    protected final void zzn(Context context, String str, boolean z10, boolean z11) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzaw(this, context, str, z10, z11));
        } else {
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static final String zzo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put(xjwcmjDeOXR.nVSPPbJQBjMpcVb, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str2));
        ListenableFuture listenableFutureZzb = new zzbl(context).zzb(0, str, map, null);
        try {
            return (String) listenableFutureZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfW)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            String strValueOf = String.valueOf(str);
            int i10 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Interrupted while retrieving a response from: ".concat(strValueOf), e10);
            listenableFutureZzb.cancel(true);
            return null;
        } catch (TimeoutException e11) {
            String strValueOf2 = String.valueOf(str);
            int i11 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout while retrieving a response from: ".concat(strValueOf2), e11);
            listenableFutureZzb.cancel(true);
            return null;
        } catch (Exception e12) {
            String strValueOf3 = String.valueOf(str);
            int i12 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving a response from: ".concat(strValueOf3), e12);
            return null;
        }
    }
}

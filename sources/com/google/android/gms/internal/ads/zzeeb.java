package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeeb {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final Executor zzc;
    private final AtomicReference zzd = new AtomicReference("");

    zzeeb(Context context, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = executor;
    }

    private final String zzc() {
        String name;
        VersionInfoParcel versionInfoParcel = this.zzb;
        String strZzd = null;
        if (versionInfoParcel.isClientJar) {
            name = zzclf.class.getName();
        } else {
            try {
                name = (String) new JSONObject(zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpM))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e10) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpL)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "SdkIE");
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strZzd = zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpN));
        } catch (IllegalArgumentException e11) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpL)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(strZzd)) {
            return "3";
        }
        try {
            for (Method method : this.zza.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strZzd)) {
                    return AppEventsConstants.EVENT_PARAM_VALUE_YES;
                }
            }
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final String zzd(String str) throws IllegalArgumentException {
        String str2 = new String(Base64.decode((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpO), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
        char[] charArray = str3.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            charArray[i10] = (char) (charArray[i10] ^ str2.charAt(i10 % str2.length()));
        }
        return new String(charArray);
    }

    public final String zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpK)).booleanValue()) {
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpM)).isEmpty()) {
                if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpN)).isEmpty()) {
                    if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzpO)).isEmpty()) {
                        String str = (String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeea
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzb();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            if (((String) atomicReference.get()).isEmpty()) {
                atomicReference.set(zzc());
            }
        }
    }
}

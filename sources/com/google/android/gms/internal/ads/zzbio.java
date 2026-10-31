package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbio implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbis.zza(new zzgub() { // from class: com.google.android.gms.internal.ads.zzbil
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x011f A[Catch: all -> 0x017a, TRY_ENTER, TryCatch #3 {, blocks: (B:7:0x0008, B:9:0x000c, B:11:0x000e, B:13:0x0013, B:14:0x0015, B:16:0x0027, B:17:0x002b, B:18:0x002d, B:43:0x009d, B:44:0x00a4, B:53:0x00d3, B:54:0x00da, B:68:0x011f, B:69:0x0126, B:82:0x0168, B:83:0x016f, B:86:0x0172, B:87:0x0179, B:20:0x0042, B:33:0x005d, B:35:0x0066, B:36:0x006e, B:38:0x0074, B:40:0x0084, B:42:0x0099, B:46:0x00a6, B:48:0x00aa, B:50:0x00ba, B:52:0x00cf, B:56:0x00dc, B:66:0x011b, B:71:0x0128, B:73:0x0135, B:75:0x0143, B:76:0x014c, B:78:0x015a, B:80:0x015e, B:81:0x0161, B:59:0x00ed, B:61:0x00fb, B:63:0x0103, B:64:0x010e, B:24:0x0049, B:28:0x0053), top: B:98:0x0008, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0128 A[Catch: all -> 0x0171, TRY_ENTER, TryCatch #0 {all -> 0x0171, blocks: (B:20:0x0042, B:33:0x005d, B:35:0x0066, B:36:0x006e, B:38:0x0074, B:40:0x0084, B:42:0x0099, B:46:0x00a6, B:48:0x00aa, B:50:0x00ba, B:52:0x00cf, B:56:0x00dc, B:66:0x011b, B:71:0x0128, B:73:0x0135, B:75:0x0143, B:76:0x014c, B:78:0x015a, B:80:0x015e, B:81:0x0161, B:59:0x00ed, B:61:0x00fb, B:63:0x0103, B:64:0x010e, B:24:0x0049, B:28:0x0053), top: B:93:0x0042, outer: #3 }] */
    public final void zza(Context context) {
        Context applicationContext;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context2 = this.zzg;
                SharedPreferences sharedPreferencesZzb = null;
                if (context2 == null) {
                    context2 = null;
                } else {
                    try {
                        applicationContext = context2.createPackageContext("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        applicationContext = null;
                    }
                    if (applicationContext != null || (applicationContext = context2.getApplicationContext()) != null) {
                        context2 = applicationContext;
                    }
                }
                if (context2 != null) {
                    com.google.android.gms.ads.internal.client.zzba.zza();
                    sharedPreferencesZzb = zzbij.zzb(context2);
                }
                if (sharedPreferencesZzb != null) {
                    zzbli.zzc(new zzbik(this, sharedPreferencesZzb));
                }
                if (!this.zzi) {
                    zzbka zzbkaVar = zzbki.zzd;
                    if (((Long) zzbkaVar.zze()).longValue() > 0 && zzbib.zzd(this.zzg) >= ((Long) zzbkaVar.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                }
                if (!this.zzi) {
                    zzbka zzbkaVar2 = zzbki.zzf;
                    if (((Long) zzbkaVar2.zze()).longValue() > 0 && zzbib.zzc(this.zzg) >= ((Long) zzbkaVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                }
                Context context3 = this.zzg;
                if (!((Boolean) zzbkq.zzk.zze()).booleanValue()) {
                    if (((Boolean) zzbkq.zzl.zze()).booleanValue() && (sharedPreferences = context3.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) != null) {
                        try {
                            if (new JSONObject((String) zzbis.zza(new zzgub() { // from class: com.google.android.gms.internal.ads.zzbim
                                @Override // com.google.android.gms.internal.ads.zzgub
                                public final /* synthetic */ Object zza() {
                                    return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                }
                            })).optBoolean("local_flags_enabled")) {
                            }
                        } catch (JSONException unused3) {
                        }
                    }
                    if (context2 == null) {
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzba.zza();
                    this.zze = zzbij.zzb(context2);
                    if (!this.zzi && ((Boolean) zzbkq.zze.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                    }
                    if (!((Boolean) zzbkq.zzc.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    this.zza = false;
                    this.zzc.open();
                }
                context2 = this.zzg;
                if (context2 == null) {
                    this.zza = false;
                    this.zzc.open();
                    return;
                }
                com.google.android.gms.ads.internal.client.zzba.zza();
                this.zze = zzbij.zzb(context2);
                if (!this.zzi) {
                    com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                }
                if (!((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                }
                zzg(this.zze);
                this.zzd = true;
                this.zza = false;
                this.zzc.open();
            } catch (Throwable th) {
                this.zza = false;
                this.zzc.open();
                throw th;
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbih zzbihVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbihVar.zzf();
            }
        }
        if (zzbihVar.zzm() != 2) {
            return (zzbihVar.zzm() == 1 && this.zzh.has(zzbihVar.zze())) ? zzbihVar.zzc(this.zzh) : zzbis.zza(new zzgub() { // from class: com.google.android.gms.internal.ads.zzbin
                @Override // com.google.android.gms.internal.ads.zzgub
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbihVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbihVar.zzf() : zzbihVar.zza(bundle);
    }

    public final Object zze(zzbih zzbihVar) {
        return (this.zzd || this.zza) ? zzd(zzbihVar) : zzbihVar.zzf();
    }

    final /* synthetic */ Object zzf(zzbih zzbihVar) {
        return zzbihVar.zzd(this.zze);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (XDucgbzInpQa.gcvEEhsWnurSkSx.equals(str)) {
            zzg(sharedPreferences);
        }
    }
}

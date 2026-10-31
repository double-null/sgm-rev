package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbjs extends androidx.browser.customtabs.b {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlo)).split(","));
    private final zzbjv zzc;
    private final androidx.browser.customtabs.b zzd;
    private final zzdzq zze;

    zzbjs(zzbjv zzbjvVar, androidx.browser.customtabs.b bVar, zzdzq zzdzqVar) {
        this.zzd = bVar;
        this.zzc = zzbjvVar;
        this.zze = zzdzqVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.b
    public final void extraCallback(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            return bVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.b
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.zza.set(false);
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onNavigationEvent(i10, bundle);
        }
        zzbjv zzbjvVar = this.zzc;
        zzbjvVar.zzg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        zzbjvVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.b
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e10);
        }
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.b
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        androidx.browser.customtabs.b bVar = this.zzd;
        if (bVar != null) {
            bVar.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}

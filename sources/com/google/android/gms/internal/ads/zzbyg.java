package com.google.android.gms.internal.ads;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzbyg {
    private final zzcku zza;
    private final String zzb;

    public zzbyg(zzcku zzckuVar, String str) {
        this.zza = zzckuVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.zzb);
            zzcku zzckuVar = this.zza;
            if (zzckuVar != null) {
                zzckuVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e10);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e10);
        }
    }

    public final void zzi(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i12).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i13));
        } catch (JSONException e10) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e10);
        }
    }

    public final void zzj(int i10, int i11, int i12, int i13) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i12).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i13));
        } catch (JSONException e10) {
            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e10);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put(ServerProtocol.DIALOG_PARAM_STATE, str));
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e10);
        }
    }

    public final void zzl(int i10, int i11, int i12, int i13, float f10, int i14) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i10).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f10).put("rotation", i14));
        } catch (JSONException e10) {
            int i15 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e10);
        }
    }
}

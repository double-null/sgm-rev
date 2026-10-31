package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaif;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhd {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzhd(zzhh zzhhVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    public final Bundle zza() {
        byte b10;
        if (this.zzd == null) {
            zzhh zzhhVar = this.zza;
            String string = zzhhVar.zzd().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b10 = 3;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b10 = 0;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b10 == 3) {
                                zzaif.zza();
                                if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaP)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i11 = 0; i11 < length; i11++) {
                                        iArr[i11] = jSONArray2.optInt(i11);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (b10 != 4) {
                                zzhhVar.zzu.zzaW().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                zzaif.zza();
                                if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaP)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i12 = 0; i12 < length2; i12++) {
                                        jArr[i12] = jSONArray3.optLong(i12);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaW().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    this.zza.zzu.zzaW().zzb().zza("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }

    public final void zzb(Bundle bundle) {
        zzhh zzhhVar;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhh zzhhVar2 = this.zza;
        SharedPreferences.Editor editorEdit = zzhhVar2.zzd().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzaif.zza();
                        zzic zzicVar = zzhhVar2.zzu;
                        zzhhVar = zzhhVar2;
                        if (zzicVar.zzc().zzp(null, zzfy.zzaP)) {
                            try {
                                if (obj instanceof String) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", "s");
                                } else if (obj instanceof Long) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", "l");
                                } else if (obj instanceof int[]) {
                                    jSONObject.put("v", Arrays.toString((int[]) obj));
                                    jSONObject.put("t", "ia");
                                } else if (obj instanceof long[]) {
                                    jSONObject.put("v", Arrays.toString((long[]) obj));
                                    jSONObject.put("t", "la");
                                } else if (obj instanceof Double) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", "d");
                                } else {
                                    zzicVar.zzaW().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                }
                                jSONArray.put(jSONObject);
                            } catch (JSONException e10) {
                                e = e10;
                                this.zza.zzu.zzaW().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e);
                            }
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzicVar.zzaW().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e11) {
                        e = e11;
                        zzhhVar = zzhhVar2;
                    }
                    zzhhVar2 = zzhhVar;
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }
}

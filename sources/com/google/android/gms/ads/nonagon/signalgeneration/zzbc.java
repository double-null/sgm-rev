package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzdyu;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {
    public final String zza;
    public String zzb;
    public zzcbd zzc;
    public Bundle zzd = new Bundle();
    private long zze;
    private long zzf;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    public zzbc(JsonReader jsonReader, zzcbd zzcbdVar) throws IOException {
        Bundle bundle;
        byte b10;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzc = zzcbdVar;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b10 = 2;
                    break;
                case "params":
                    b10 = 0;
                    break;
                case "signal_dictionary":
                    b10 = 1;
                    break;
                case "end_time":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                strNextString = jsonReader.nextString();
            } else if (b10 == 1) {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b10 == 2) {
                this.zze = jsonReader.nextLong();
            } else if (b10 != 3) {
                jsonReader.skipValue();
            } else {
                this.zzf = jsonReader.nextLong();
            }
        }
        this.zza = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcN)).booleanValue() || zzcbdVar == null || (bundle = zzcbdVar.zzm) == null) {
            return;
        }
        bundle.putLong(zzdyu.GET_SIGNALS_SDKCORE_START.zza(), this.zze);
        zzcbdVar.zzm.putLong(zzdyu.GET_SIGNALS_SDKCORE_END.zza(), this.zzf);
    }
}

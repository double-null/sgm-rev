package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeap {
    public final long zza;
    public final int[] zzb;

    private zzeap(long j10, int[] iArr) {
        this.zza = j10;
        this.zzb = iArr;
    }

    public static zzgwm zza(JsonReader jsonReader) throws IOException {
        int i10 = zzgwm.zzd;
        zzgwj zzgwjVar = new zzgwj();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgwm zzgwmVarZzi = zzgwm.zzi();
            jsonReader.beginObject();
            zzeap zzeapVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgwj zzgwjVar2 = new zzgwj();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgwjVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgwmVarZzi = zzgwjVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgwmVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgwmVarZzi.size()];
                for (int i11 = 0; i11 < zzgwmVarZzi.size(); i11++) {
                    iArr[i11] = ((Integer) zzgwmVarZzi.get(i11)).intValue();
                }
                zzeapVar = new zzeap(jLongValue, iArr);
            }
            if (zzeapVar != null) {
                zzgwjVar.zzf(zzeapVar);
            }
        }
        jsonReader.endArray();
        return zzgwjVar.zzi();
    }
}

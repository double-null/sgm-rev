package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import c0.IbU.elEbP;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfkh {
    private String zza;

    public final String zza() {
        return this.zza;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    zzfkh(JsonReader jsonReader) throws IOException {
        byte b10;
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int iHashCode = strNextName.hashCode();
            if (iHashCode != -1724546052) {
                if (iHashCode == 3059181 && strNextName.equals(elEbP.iWxvPtU)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (strNextName.equals("description")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 != 0) {
                if (b10 != 1) {
                    jsonReader.skipValue();
                } else {
                    strNextString = jsonReader.nextString();
                }
            } else {
                jsonReader.nextInt();
            }
        }
        jsonReader.endObject();
        this.zza = strNextString;
    }
}

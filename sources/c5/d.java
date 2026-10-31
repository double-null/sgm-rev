package c5;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public b a(String str, Context context) {
        try {
            if (str == null) {
                i5.d.c("Cannot create mechanism: Mechanism name cannot be null");
                return null;
            }
            if (context == null) {
                i5.d.c("Cannot create mechanism: Context cannot be null");
                return null;
            }
            if ("FireTVFOSDAT".equals(str)) {
                return new i(context);
            }
            return null;
        } catch (Exception e10) {
            i5.d.b("Error creating attestation mechanism: " + str, e10);
            return null;
        }
    }
}

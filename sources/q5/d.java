package q5;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public b a(String str, Context context) {
        try {
            if (str == null) {
                w5.d.c("Cannot create mechanism: Mechanism name cannot be null");
                return null;
            }
            if (context == null) {
                w5.d.c("Cannot create mechanism: Context cannot be null");
                return null;
            }
            if ("FireTVFOSDAT".equals(str)) {
                return new i(context);
            }
            return null;
        } catch (Exception e10) {
            w5.d.b("Error creating attestation mechanism: " + str, e10);
            return null;
        }
    }
}

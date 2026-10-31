package c5;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f4742a = new d();

    public static void a(Context context, String str, a aVar) {
        try {
            if (context == null) {
                i5.d.c("Attestation failed: Application Context cannot be null");
                return;
            }
            if (str != null && !str.trim().isEmpty()) {
                if (aVar == null) {
                    i5.d.c("Attestation failed: Attestation arguments cannot be null");
                    return;
                }
                if (!c.a(context).c(str)) {
                    i5.d.e("Mechanism not supported on this device: " + str);
                    return;
                }
                b bVarA = f4742a.a(str, context);
                if (bVarA != null) {
                    bVarA.a(aVar);
                    return;
                }
                i5.d.e("Failed to create mechanism: " + str);
                return;
            }
            i5.d.c("Attestation failed: Mechanism name cannot be null or empty");
        } catch (Exception e10) {
            i5.d.b("Error during attestation with mechanism: " + str, e10);
        }
    }
}

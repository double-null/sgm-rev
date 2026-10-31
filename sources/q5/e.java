package q5;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f24429a = new d();

    public static void a(Context context, String str, a aVar) {
        try {
            if (context == null) {
                w5.d.c("Attestation failed: Application Context cannot be null");
                return;
            }
            if (str != null && !str.trim().isEmpty()) {
                if (aVar == null) {
                    w5.d.c("Attestation failed: Attestation arguments cannot be null");
                    return;
                }
                if (!c.b(context).c(str)) {
                    w5.d.e("Mechanism not supported on this device: " + str);
                    return;
                }
                b bVarA = f24429a.a(str, context);
                if (bVarA != null) {
                    bVarA.a(aVar);
                    return;
                }
                w5.d.e("Failed to create mechanism: " + str);
                return;
            }
            w5.d.c("Attestation failed: Mechanism name cannot be null or empty");
        } catch (Exception e10) {
            w5.d.b("Error during attestation with mechanism: " + str, e10);
        }
    }
}

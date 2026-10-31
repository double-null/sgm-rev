package c5;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import com.facebook.internal.ServerProtocol;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f4749b;

    i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f4748a = context;
        this.f4749b = j.a(context);
    }

    private String b(String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    private boolean c(String str) {
        try {
            new URL(str);
            return str.startsWith("https://") || str.startsWith("http://");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // c5.b
    public String a() {
        return "FireTVFOSDAT";
    }

    @Override // c5.b
    public void a(a aVar) {
        String str;
        String str2;
        if (!this.f4749b.b()) {
            str = "Attestation failed: Full attestation capability not available";
        } else if (aVar == null) {
            str = "Attestation failed: AttestationArgs is null";
        } else if (aVar.a() == null) {
            str = "Attestation failed: attestationData is null";
        } else {
            String str3 = aVar.a().get("verifierurl");
            String strB = b(aVar.a().get(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION));
            if (str3 == null || str3.trim().isEmpty()) {
                str = "Attestation failed: verifier URL is null or empty";
            } else {
                if (c(str3)) {
                    i5.d.a("Starting FireTV's FOS device attestation with verifier URL: " + str3);
                    try {
                        if (this.f4748a == null) {
                            i5.d.c("Attestation failed: application context is null");
                            return;
                        } else {
                            PrivacyPass.getInstance(this.f4748a).attest(new VerificationContext(Collections.singletonList(str3)), (AttestAPICallback) null, strB);
                            return;
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        str2 = "Attestation failed: Invalid input parameters";
                        i5.d.b(str2, e);
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        str2 = "Attestation failed: unexpected error";
                        i5.d.b(str2, e);
                        return;
                    }
                }
                str = "Attestation failed: invalid verifier URL format: " + str3;
            }
        }
        i5.d.c(str);
    }

    @Override // c5.b
    public h b() {
        return h.NATIVE;
    }

    @Override // c5.b
    public List<String> c() {
        return Collections.singletonList("1.0");
    }
}

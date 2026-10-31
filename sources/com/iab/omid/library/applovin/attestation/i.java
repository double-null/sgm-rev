package com.iab.omid.library.applovin.attestation;

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
    private final Context f12526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f12527b;

    i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f12526a = context;
        this.f12527b = j.a(context);
    }

    @Override // com.iab.omid.library.applovin.attestation.b
    public String a() {
        return "FireTVFOSDAT";
    }

    @Override // com.iab.omid.library.applovin.attestation.b
    public h b() {
        return h.NATIVE;
    }

    @Override // com.iab.omid.library.applovin.attestation.b
    public List<String> c() {
        return Collections.singletonList("1.0");
    }

    private String a(String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    private boolean b(String str) {
        try {
            new URL(str);
            return str.startsWith("https://") || str.startsWith("http://");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.applovin.attestation.b
    public void a(a aVar) {
        String str;
        String str2;
        if (!this.f12527b.b()) {
            str = "Attestation failed: Full attestation capability not available";
        } else if (aVar == null) {
            str = "Attestation failed: AttestationArgs is null";
        } else if (aVar.a() == null) {
            str = "Attestation failed: attestationData is null";
        } else {
            String str3 = aVar.a().get("verifierurl");
            String strA = a(aVar.a().get(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION));
            if (str3 == null || str3.trim().isEmpty()) {
                str = "Attestation failed: verifier URL is null or empty";
            } else {
                if (b(str3)) {
                    com.iab.omid.library.applovin.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: " + str3);
                    try {
                        if (this.f12526a == null) {
                            com.iab.omid.library.applovin.utils.d.b("Attestation failed: application context is null");
                            return;
                        } else {
                            PrivacyPass.getInstance(this.f12526a).attest(new VerificationContext(Collections.singletonList(str3)), (AttestAPICallback) null, strA);
                            return;
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        str2 = "Attestation failed: Invalid input parameters";
                        com.iab.omid.library.applovin.utils.d.a(str2, e);
                        return;
                    } catch (Exception e11) {
                        e = e11;
                        str2 = "Attestation failed: unexpected error";
                        com.iab.omid.library.applovin.utils.d.a(str2, e);
                        return;
                    }
                }
                str = "Attestation failed: invalid verifier URL format: " + str3;
            }
        }
        com.iab.omid.library.applovin.utils.d.b(str);
    }
}

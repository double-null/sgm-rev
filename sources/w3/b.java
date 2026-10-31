package w3;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: IidStore.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f27514c = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f27515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27516b;

    public b(FirebaseApp firebaseApp) {
        this.f27515a = firebaseApp.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f27516b = b(firebaseApp);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f27515a) {
            string = this.f27515a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f27515a) {
            String string = this.f27515a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyE = e(string);
            if (publicKeyE == null) {
                return null;
            }
            return c(publicKeyE);
        }
    }

    public String f() {
        synchronized (this.f27515a) {
            String strG = g();
            if (strG != null) {
                return strG;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.f27515a) {
            for (String str : f27514c) {
                String string = this.f27515a.getString(a(this.f27516b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}

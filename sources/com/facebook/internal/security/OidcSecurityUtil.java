package com.facebook.internal.security;

import android.util.Base64;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.internal.security.OidcSecurityUtil;
import fd.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;
import org.json.JSONObject;
import rd.c0;
import rd.d;
import wc.g0;

/* JADX INFO: compiled from: OidcSecurityUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OidcSecurityUtil {
    public static final OidcSecurityUtil INSTANCE = new OidcSecurityUtil();
    private static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";
    public static final String SIGNATURE_ALGORITHM_SHA256 = "SHA256withRSA";
    public static final long TIMEOUT_IN_MILLISECONDS = 5000;

    private OidcSecurityUtil() {
    }

    public static final PublicKey getPublicKeyFromString(String key) throws InvalidKeySpecException {
        t.f(key, "key");
        byte[] bArrDecode = Base64.decode(c0.K(c0.K(c0.K(key, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        t.e(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        t.e(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String getRawKeyFromEndPoint(final String kid) {
        t.f(kid, "kid");
        final URL url = new URL("https", "www." + FacebookSdk.getFacebookDomain(), OPENID_KEYS_PATH);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final h0 h0Var = new h0();
        FacebookSdk.getExecutor().execute(new Runnable() { // from class: z1.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                OidcSecurityUtil.getRawKeyFromEndPoint$lambda$1(url, h0Var, kid, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) h0Var.f21514a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final void getRawKeyFromEndPoint$lambda$1(URL openIdKeyUrl, h0 result, String kid, ReentrantLock lock, Condition condition) throws IOException {
        t.f(openIdKeyUrl, "$openIdKeyUrl");
        t.f(result, "$result");
        t.f(kid, "$kid");
        t.f(lock, "$lock");
        URLConnection uRLConnectionOpenConnection = openIdKeyUrl.openConnection();
        t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                t.e(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, d.f24999b);
                String strD = l.d(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                result.f21514a = new JSONObject(strD).optString(kid);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    g0 g0Var = g0.f27756a;
                } finally {
                    lock.unlock();
                }
            } catch (Exception e10) {
                String name = INSTANCE.getClass().getName();
                String message = e10.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                lock.lock();
                try {
                    condition.signal();
                    g0 g0Var2 = g0.f27756a;
                } finally {
                    lock.unlock();
                }
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                g0 g0Var3 = g0.f27756a;
                throw th;
            } finally {
                lock.unlock();
            }
        }
    }

    public static final boolean verify(PublicKey publicKey, String data, String signature) {
        t.f(publicKey, "publicKey");
        t.f(data, "data");
        t.f(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance(SIGNATURE_ALGORITHM_SHA256);
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(d.f24999b);
            t.e(bytes, "this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            t.e(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }

    public final String getOPENID_KEYS_PATH() {
        return OPENID_KEYS_PATH;
    }
}

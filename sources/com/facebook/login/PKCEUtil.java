package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.ServerProtocol;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;

/* JADX INFO: compiled from: PKCEUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class PKCEUtil {
    public static final PKCEUtil INSTANCE = new PKCEUtil();

    private PKCEUtil() {
    }

    public static final GraphRequest createCodeExchangeRequest(String authorizationCode, String redirectUri, String codeVerifier) {
        kotlin.jvm.internal.t.f(authorizationCode, "authorizationCode");
        kotlin.jvm.internal.t.f(redirectUri, "redirectUri");
        kotlin.jvm.internal.t.f(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        bundle.putString("client_id", FacebookSdk.getApplicationId());
        bundle.putString(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest graphRequestNewGraphPathRequest = GraphRequest.Companion.newGraphPathRequest(null, "oauth/access_token", null);
        graphRequestNewGraphPathRequest.setHttpMethod(HttpMethod.GET);
        graphRequestNewGraphPathRequest.setParameters(bundle);
        return graphRequestNewGraphPathRequest;
    }

    public static final String generateCodeChallenge(String codeVerifier, CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        kotlin.jvm.internal.t.f(codeVerifier, "codeVerifier");
        kotlin.jvm.internal.t.f(codeChallengeMethod, "codeChallengeMethod");
        if (!isValidCodeVerifier(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(rd.d.f25003f);
            kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            kotlin.jvm.internal.t.e(strEncodeToString, "{\n      // try to genera… or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e10) {
            throw new FacebookException(e10);
        }
    }

    public static final String generateCodeVerifier() {
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(86) + 43;
        List listD0 = b0.d0(b0.d0(b0.d0(b0.d0(b0.c0(b0.b0(new od.c('a', 'z'), new od.c('A', 'Z')), new od.c('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iNextInt);
        for (int i10 = 0; i10 < iNextInt; i10++) {
            arrayList.add(Character.valueOf(((Character) listD0.get(secureRandom.nextInt(listD0.size()))).charValue()));
        }
        return b0.V(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public static final boolean isValidCodeVerifier(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new rd.o("^[-._~A-Za-z0-9]+$").e(str);
    }
}

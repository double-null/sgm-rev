package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.Validate;
import com.facebook.internal.security.OidcSecurityUtil;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import k9.dW.xjwcmjDeOXR;
import org.json.JSONException;
import org.json.JSONObject;
import rd.PSo.cNMUz;
import rd.f0;

/* JADX INFO: compiled from: AuthenticationToken.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AuthenticationToken implements Parcelable {
    public static final String AUTHENTICATION_TOKEN_KEY = "id_token";
    private static final String CLAIMS_KEY = "claims";
    private static final String EXPECTED_NONCE_KEY = "expected_nonce";
    private static final String HEADER_KEY = "header";
    private static final String SIGNATURE_KEY = "signature";
    private static final String TOKEN_STRING_KEY = "token_string";
    private final AuthenticationTokenClaims claims;
    private final String expectedNonce;
    private final AuthenticationTokenHeader header;
    private final String signature;
    private final String token;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new Parcelable.Creator<AuthenticationToken>() { // from class: com.facebook.AuthenticationToken$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationToken createFromParcel(Parcel source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new AuthenticationToken(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationToken[] newArray(int i10) {
            return new AuthenticationToken[i10];
        }
    };

    /* JADX INFO: compiled from: AuthenticationToken.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final AuthenticationToken getCurrentAuthenticationToken() {
            return AuthenticationTokenManager.Companion.getInstance().getCurrentAuthenticationToken();
        }

        public final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.Companion.getInstance().setCurrentAuthenticationToken(authenticationToken);
        }
    }

    public AuthenticationToken(String token, String expectedNonce) {
        kotlin.jvm.internal.t.f(token, "token");
        kotlin.jvm.internal.t.f(expectedNonce, "expectedNonce");
        Validate.notEmpty(token, "token");
        Validate.notEmpty(expectedNonce, "expectedNonce");
        List listK0 = f0.K0(token, new String[]{"."}, false, 0, 6, null);
        if (!(listK0.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str = (String) listK0.get(0);
        String str2 = (String) listK0.get(1);
        String str3 = (String) listK0.get(2);
        this.token = token;
        this.expectedNonce = expectedNonce;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str);
        this.header = authenticationTokenHeader;
        this.claims = new AuthenticationTokenClaims(str2, expectedNonce);
        if (!isValidSignature(str, str2, str3, authenticationTokenHeader.getKid())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.signature = str3;
    }

    public static final AuthenticationToken getCurrentAuthenticationToken() {
        return Companion.getCurrentAuthenticationToken();
    }

    private final boolean isValidSignature(String str, String str2, String str3, String str4) {
        try {
            String rawKeyFromEndPoint = OidcSecurityUtil.getRawKeyFromEndPoint(str4);
            if (rawKeyFromEndPoint == null) {
                return false;
            }
            return OidcSecurityUtil.verify(OidcSecurityUtil.getPublicKeyFromString(rawKeyFromEndPoint), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    public static final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
        Companion.setCurrentAuthenticationToken(authenticationToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return kotlin.jvm.internal.t.a(this.token, authenticationToken.token) && kotlin.jvm.internal.t.a(this.expectedNonce, authenticationToken.expectedNonce) && kotlin.jvm.internal.t.a(this.header, authenticationToken.header) && kotlin.jvm.internal.t.a(this.claims, authenticationToken.claims) && kotlin.jvm.internal.t.a(this.signature, authenticationToken.signature);
    }

    public final AuthenticationTokenClaims getClaims() {
        return this.claims;
    }

    public final String getExpectedNonce() {
        return this.expectedNonce;
    }

    public final AuthenticationTokenHeader getHeader() {
        return this.header;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return ((((((((527 + this.token.hashCode()) * 31) + this.expectedNonce.hashCode()) * 31) + this.header.hashCode()) * 31) + this.claims.hashCode()) * 31) + this.signature.hashCode();
    }

    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TOKEN_STRING_KEY, this.token);
        jSONObject.put(EXPECTED_NONCE_KEY, this.expectedNonce);
        jSONObject.put(HEADER_KEY, this.header.toJSONObject$facebook_core_release());
        jSONObject.put(CLAIMS_KEY, this.claims.toJSONObject$facebook_core_release());
        jSONObject.put(SIGNATURE_KEY, this.signature);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.t.f(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.expectedNonce);
        dest.writeParcelable(this.header, i10);
        dest.writeParcelable(this.claims, i10);
        dest.writeString(this.signature);
    }

    public AuthenticationToken(Parcel parcel) {
        kotlin.jvm.internal.t.f(parcel, cNMUz.XgCFU);
        this.token = Validate.notNullOrEmpty(parcel.readString(), xjwcmjDeOXR.rcYvhFSK);
        this.expectedNonce = Validate.notNullOrEmpty(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.header = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.claims = (AuthenticationTokenClaims) parcelable2;
                this.signature = Validate.notNullOrEmpty(parcel.readString(), SIGNATURE_KEY);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public AuthenticationToken(JSONObject jsonObject) throws JSONException {
        kotlin.jvm.internal.t.f(jsonObject, "jsonObject");
        String string = jsonObject.getString(TOKEN_STRING_KEY);
        kotlin.jvm.internal.t.e(string, "jsonObject.getString(TOKEN_STRING_KEY)");
        this.token = string;
        String string2 = jsonObject.getString(EXPECTED_NONCE_KEY);
        kotlin.jvm.internal.t.e(string2, wHzciBnJlYkdX.peXsKLXflotwT);
        this.expectedNonce = string2;
        String string3 = jsonObject.getString(SIGNATURE_KEY);
        kotlin.jvm.internal.t.e(string3, "jsonObject.getString(SIGNATURE_KEY)");
        this.signature = string3;
        JSONObject headerJSONObject = jsonObject.getJSONObject(HEADER_KEY);
        JSONObject claimsJSONObject = jsonObject.getJSONObject(CLAIMS_KEY);
        kotlin.jvm.internal.t.e(headerJSONObject, "headerJSONObject");
        this.header = new AuthenticationTokenHeader(headerJSONObject);
        AuthenticationTokenClaims.Companion companion = AuthenticationTokenClaims.Companion;
        kotlin.jvm.internal.t.e(claimsJSONObject, "claimsJSONObject");
        this.claims = companion.createFromJSONObject$facebook_core_release(claimsJSONObject);
    }
}

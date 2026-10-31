package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.internal.Validate;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AuthenticationTokenHeader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationTokenHeader implements Parcelable {
    private final String alg;
    private final String kid;
    private final String typ;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new Parcelable.Creator<AuthenticationTokenHeader>() { // from class: com.facebook.AuthenticationTokenHeader$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenHeader createFromParcel(Parcel source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new AuthenticationTokenHeader(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationTokenHeader[] newArray(int i10) {
            return new AuthenticationTokenHeader[i10];
        }
    };

    /* JADX INFO: compiled from: AuthenticationTokenHeader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public AuthenticationTokenHeader(String encodedHeaderString) throws JSONException {
        kotlin.jvm.internal.t.f(encodedHeaderString, "encodedHeaderString");
        if (!isValidHeader(encodedHeaderString)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.t.e(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, rd.d.f24999b));
        String string = jSONObject.getString("alg");
        kotlin.jvm.internal.t.e(string, "jsonObj.getString(\"alg\")");
        this.alg = string;
        String string2 = jSONObject.getString(ClientData.KEY_TYPE);
        kotlin.jvm.internal.t.e(string2, "jsonObj.getString(\"typ\")");
        this.typ = string2;
        String string3 = jSONObject.getString("kid");
        kotlin.jvm.internal.t.e(string3, "jsonObj.getString(\"kid\")");
        this.kid = string3;
    }

    private final boolean isValidHeader(String str) {
        Validate.notEmpty(str, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(str, 0);
        kotlin.jvm.internal.t.e(decodedBytes, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, rd.d.f24999b));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.t.e(alg, "alg");
            boolean z10 = (alg.length() > 0) && kotlin.jvm.internal.t.a(alg, "RS256");
            String strOptString = jSONObject.optString("kid");
            kotlin.jvm.internal.t.e(strOptString, "jsonObj.optString(\"kid\")");
            boolean z11 = strOptString.length() > 0;
            String strOptString2 = jSONObject.optString(ClientData.KEY_TYPE);
            kotlin.jvm.internal.t.e(strOptString2, "jsonObj.optString(\"typ\")");
            return z10 && z11 && (strOptString2.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return kotlin.jvm.internal.t.a(this.alg, authenticationTokenHeader.alg) && kotlin.jvm.internal.t.a(this.typ, authenticationTokenHeader.typ) && kotlin.jvm.internal.t.a(this.kid, authenticationTokenHeader.kid);
    }

    public final String getAlg() {
        return this.alg;
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getTyp() {
        return this.typ;
    }

    public int hashCode() {
        return ((((527 + this.alg.hashCode()) * 31) + this.typ.hashCode()) * 31) + this.kid.hashCode();
    }

    public final String toEnCodedString() {
        byte[] bytes = toString().getBytes(rd.d.f24999b);
        kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        kotlin.jvm.internal.t.e(strEncodeToString, "encodeToString(claimsJso…eArray(), Base64.DEFAULT)");
        return strEncodeToString;
    }

    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.alg);
        jSONObject.put(ClientData.KEY_TYPE, this.typ);
        jSONObject.put("kid", this.kid);
        return jSONObject;
    }

    public String toString() {
        String string = toJSONObject$facebook_core_release().toString();
        kotlin.jvm.internal.t.e(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.t.f(dest, "dest");
        dest.writeString(this.alg);
        dest.writeString(this.typ);
        dest.writeString(this.kid);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        kotlin.jvm.internal.t.f(parcel, "parcel");
        this.alg = Validate.notNullOrEmpty(parcel.readString(), "alg");
        this.typ = Validate.notNullOrEmpty(parcel.readString(), ClientData.KEY_TYPE);
        this.kid = Validate.notNullOrEmpty(parcel.readString(), "kid");
    }

    public AuthenticationTokenHeader(JSONObject jsonObject) throws JSONException {
        kotlin.jvm.internal.t.f(jsonObject, "jsonObject");
        String string = jsonObject.getString("alg");
        kotlin.jvm.internal.t.e(string, "jsonObject.getString(\"alg\")");
        this.alg = string;
        String string2 = jsonObject.getString(ClientData.KEY_TYPE);
        kotlin.jvm.internal.t.e(string2, "jsonObject.getString(\"typ\")");
        this.typ = string2;
        String string3 = jsonObject.getString("kid");
        kotlin.jvm.internal.t.e(string3, "jsonObject.getString(\"kid\")");
        this.kid = string3;
    }

    public AuthenticationTokenHeader(String alg, String typ, String kid) {
        kotlin.jvm.internal.t.f(alg, "alg");
        kotlin.jvm.internal.t.f(typ, "typ");
        kotlin.jvm.internal.t.f(kid, "kid");
        this.alg = alg;
        this.typ = typ;
        this.kid = kid;
    }
}

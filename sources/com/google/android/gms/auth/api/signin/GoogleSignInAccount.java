package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.b;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pb.vBC.NyXuoef;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    public static final Clock zaa = DefaultClock.getInstance();
    final List zab;
    private final String zac;
    private final String zad;
    private final String zae;
    private final String zaf;
    private final Uri zag;
    private String zah;
    private final long zai;
    private final String zaj;
    private final String zak;
    private final String zal;
    private final Set zam = new HashSet();

    GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.zac = str;
        this.zad = str2;
        this.zae = str3;
        this.zaf = str4;
        this.zag = uri;
        this.zah = str5;
        this.zai = j10;
        this.zaj = str6;
        this.zab = list;
        this.zak = str7;
        this.zal = str8;
    }

    public static GoogleSignInAccount createDefault() {
        return zae(new Account("<<default account>>", "com.google"), new HashSet());
    }

    public static GoogleSignInAccount fromAccount(Account account) {
        return zae(account, new b());
    }

    public static GoogleSignInAccount fromAccountAndScopes(Account account, Scope scope, Scope... scopeArr) {
        Preconditions.checkNotNull(account);
        Preconditions.checkNotNull(scope);
        HashSet hashSet = new HashSet();
        hashSet.add(scope);
        hashSet.addAll(Arrays.asList(scopeArr));
        return zae(account, hashSet);
    }

    public static GoogleSignInAccount zab(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(str, str2, str3, str4, uri, null, l10.longValue(), Preconditions.checkNotEmpty(str7), new ArrayList((Collection) Preconditions.checkNotNull(set)), str5, str6);
    }

    private static GoogleSignInAccount zae(Account account, Set set) {
        return zab(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.zaj.equals(this.zaj) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    public Account getAccount() {
        String str = this.zae;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String getDisplayName() {
        return this.zaf;
    }

    public String getEmail() {
        return this.zae;
    }

    public String getFamilyName() {
        return this.zal;
    }

    public String getGivenName() {
        return this.zak;
    }

    public Set<Scope> getGrantedScopes() {
        return new HashSet(this.zab);
    }

    public String getId() {
        return this.zac;
    }

    public String getIdToken() {
        return this.zad;
    }

    public Uri getPhotoUrl() {
        return this.zag;
    }

    public Set<Scope> getRequestedScopes() {
        HashSet hashSet = new HashSet(this.zab);
        hashSet.addAll(this.zam);
        return hashSet;
    }

    public String getServerAuthCode() {
        return this.zah;
    }

    public int hashCode() {
        return ((this.zaj.hashCode() + 527) * 31) + getRequestedScopes().hashCode();
    }

    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.zai + (-300);
    }

    public GoogleSignInAccount requestExtraScopes(Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.zam, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getId(), false);
        SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i10, false);
        SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        SafeParcelWriter.writeLong(parcel, 8, this.zai);
        SafeParcelWriter.writeString(parcel, 9, this.zaj, false);
        SafeParcelWriter.writeTypedList(parcel, 10, this.zab, false);
        SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zac() {
        return this.zaj;
    }

    public final String zad() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put(NyXuoef.gsVAUCLLGTE, getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put(SDKConstants.PARAM_EXPIRATION_TIME, this.zai);
            jSONObject.put("obfuscatedIdentifier", this.zaj);
            JSONArray jSONArray = new JSONArray();
            List list = this.zab;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, zaa.zaa);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static GoogleSignInAccount zaa(String str) throws JSONException {
        Uri uri;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        String strOptString5;
        String strOptString6 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString7 = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(strOptString7)) {
            uri = Uri.parse(strOptString7);
        } else {
            uri = null;
        }
        long j10 = Long.parseLong(jSONObject.getString(RHIpdOnfgiYkEj.TUH));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString8 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            strOptString = jSONObject.optString("tokenId");
        } else {
            strOptString = null;
        }
        if (jSONObject.has("email")) {
            strOptString2 = jSONObject.optString("email");
        } else {
            strOptString2 = null;
        }
        if (jSONObject.has("displayName")) {
            strOptString3 = jSONObject.optString("displayName");
        } else {
            strOptString3 = null;
        }
        if (jSONObject.has("givenName")) {
            strOptString4 = jSONObject.optString("givenName");
        } else {
            strOptString4 = null;
        }
        if (jSONObject.has("familyName")) {
            strOptString5 = jSONObject.optString("familyName");
        } else {
            strOptString5 = null;
        }
        GoogleSignInAccount googleSignInAccountZab = zab(strOptString8, strOptString, strOptString2, strOptString3, strOptString4, strOptString5, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            strOptString6 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccountZab.zah = strOptString6;
        return googleSignInAccountZab;
    }
}

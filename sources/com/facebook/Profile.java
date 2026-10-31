package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Profile.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Profile implements Parcelable {
    private static final String FIRST_NAME_KEY = "first_name";
    private static final String ID_KEY = "id";
    private static final String LAST_NAME_KEY = "last_name";
    private static final String LINK_URI_KEY = "link_uri";
    private static final String MIDDLE_NAME_KEY = "middle_name";
    private static final String NAME_KEY = "name";
    private static final String PICTURE_URI_KEY = "picture_uri";
    private final String firstName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f10941id;
    private final String lastName;
    private final Uri linkUri;
    private final String middleName;
    private final String name;
    private final Uri pictureUri;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = Profile.class.getSimpleName();
    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>() { // from class: com.facebook.Profile$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Profile createFromParcel(Parcel source) {
            kotlin.jvm.internal.t.f(source, "source");
            return new Profile(source, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Profile[] newArray(int i10) {
            return new Profile[i10];
        }
    };

    /* JADX INFO: compiled from: Profile.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final void fetchProfileForCurrentAccessToken() {
            AccessToken.Companion companion = AccessToken.Companion;
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            if (currentAccessToken == null) {
                return;
            }
            if (companion.isCurrentAccessTokenActive()) {
                Utility.getGraphMeRequestWithCacheAsync(currentAccessToken.getToken(), new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.Profile$Companion$fetchProfileForCurrentAccessToken$1
                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onFailure(FacebookException facebookException) {
                        Log.e(Profile.TAG, "Got unexpected exception: " + facebookException);
                    }

                    @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                    public void onSuccess(JSONObject jSONObject) {
                        String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
                        if (strOptString == null) {
                            Log.w(Profile.TAG, "No user ID returned on Me request");
                            return;
                        }
                        String strOptString2 = jSONObject.optString("link");
                        String strOptString3 = jSONObject.optString("profile_picture", null);
                        Profile.Companion.setCurrentProfile(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_MIDDLE_NAME), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
                    }
                });
            } else {
                setCurrentProfile(null);
            }
        }

        public final Profile getCurrentProfile() {
            return ProfileManager.Companion.getInstance().getCurrentProfile();
        }

        public final void setCurrentProfile(Profile profile) {
            ProfileManager.Companion.getInstance().setCurrentProfile(profile);
        }
    }

    public /* synthetic */ Profile(Parcel parcel, kotlin.jvm.internal.k kVar) {
        this(parcel);
    }

    public static final void fetchProfileForCurrentAccessToken() {
        Companion.fetchProfileForCurrentAccessToken();
    }

    public static final Profile getCurrentProfile() {
        return Companion.getCurrentProfile();
    }

    public static final void setCurrentProfile(Profile profile) {
        Companion.setCurrentProfile(profile);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f10941id;
        return ((str5 == null && ((Profile) obj).f10941id == null) || kotlin.jvm.internal.t.a(str5, ((Profile) obj).f10941id)) && (((str = this.firstName) == null && ((Profile) obj).firstName == null) || kotlin.jvm.internal.t.a(str, ((Profile) obj).firstName)) && ((((str2 = this.middleName) == null && ((Profile) obj).middleName == null) || kotlin.jvm.internal.t.a(str2, ((Profile) obj).middleName)) && ((((str3 = this.lastName) == null && ((Profile) obj).lastName == null) || kotlin.jvm.internal.t.a(str3, ((Profile) obj).lastName)) && ((((str4 = this.name) == null && ((Profile) obj).name == null) || kotlin.jvm.internal.t.a(str4, ((Profile) obj).name)) && ((((uri = this.linkUri) == null && ((Profile) obj).linkUri == null) || kotlin.jvm.internal.t.a(uri, ((Profile) obj).linkUri)) && (((uri2 = this.pictureUri) == null && ((Profile) obj).pictureUri == null) || kotlin.jvm.internal.t.a(uri2, ((Profile) obj).pictureUri))))));
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getId() {
        return this.f10941id;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getPictureUri() {
        return this.pictureUri;
    }

    public final Uri getProfilePictureUri(int i10, int i11) {
        String token;
        Uri uri = this.pictureUri;
        if (uri != null) {
            return uri;
        }
        AccessToken.Companion companion = AccessToken.Companion;
        if (companion.isCurrentAccessTokenActive()) {
            AccessToken currentAccessToken = companion.getCurrentAccessToken();
            token = currentAccessToken != null ? currentAccessToken.getToken() : null;
        } else {
            token = "";
        }
        return ImageRequest.Companion.getProfilePictureUri(this.f10941id, i10, i11, token);
    }

    public int hashCode() {
        String str = this.f10941id;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f10941id);
            jSONObject.put(FIRST_NAME_KEY, this.firstName);
            jSONObject.put("middle_name", this.middleName);
            jSONObject.put(LAST_NAME_KEY, this.lastName);
            jSONObject.put("name", this.name);
            Uri uri = this.linkUri;
            if (uri != null) {
                jSONObject.put(LINK_URI_KEY, uri.toString());
            }
            Uri uri2 = this.pictureUri;
            if (uri2 != null) {
                jSONObject.put(PICTURE_URI_KEY, uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.t.f(dest, "dest");
        dest.writeString(this.f10941id);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.name);
        Uri uri = this.linkUri;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.pictureUri;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        this(str, str2, str3, str4, str5, uri, null, 64, null);
    }

    public /* synthetic */ Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, int i10, kotlin.jvm.internal.k kVar) {
        this(str, str2, str3, str4, str5, uri, (i10 & 64) != 0 ? null : uri2);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        Validate.notNullOrEmpty(str, "id");
        this.f10941id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }

    public Profile(JSONObject jsonObject) {
        kotlin.jvm.internal.t.f(jsonObject, "jsonObject");
        this.f10941id = jsonObject.optString("id", null);
        this.firstName = jsonObject.optString(FIRST_NAME_KEY, null);
        this.middleName = jsonObject.optString("middle_name", null);
        this.lastName = jsonObject.optString(LAST_NAME_KEY, null);
        this.name = jsonObject.optString("name", null);
        String strOptString = jsonObject.optString(LINK_URI_KEY, null);
        this.linkUri = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jsonObject.optString(PICTURE_URI_KEY, null);
        this.pictureUri = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    private Profile(Parcel parcel) {
        this.f10941id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String string = parcel.readString();
        this.linkUri = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.pictureUri = string2 != null ? Uri.parse(string2) : null;
    }
}

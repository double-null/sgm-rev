package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import g7.EinF.ZHgPsTG;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.l0;

/* JADX INFO: compiled from: ImageRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageRequest {
    private static final String ACCESS_TOKEN_PARAM = "access_token";
    public static final Companion Companion = new Companion(null);
    private static final String HEIGHT_PARAM = "height";
    private static final String MIGRATION_PARAM = "migration_overrides";
    private static final String MIGRATION_VALUE = "{october_2012:true}";
    private static final String PATH = "%s/%s/picture";
    public static final int UNSPECIFIED_DIMENSION = 0;
    private static final String WIDTH_PARAM = "width";
    private final boolean allowCachedRedirects;
    private final Callback callback;
    private final Object callerTag;
    private final Context context;
    private final Uri imageUri;

    /* JADX INFO: compiled from: ImageRequest.kt */
    public static final class Builder {
        private boolean allowCachedRedirects;
        private Callback callback;
        private Object callerTag;
        private final Context context;
        private final Uri imageUri;

        public Builder(Context context, Uri imageUri) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(imageUri, "imageUri");
            this.context = context;
            this.imageUri = imageUri;
        }

        private final Context component1() {
            return this.context;
        }

        private final Uri component2() {
            return this.imageUri;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Context context, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = builder.context;
            }
            if ((i10 & 2) != 0) {
                uri = builder.imageUri;
            }
            return builder.copy(context, uri);
        }

        public final ImageRequest build() {
            Context context = this.context;
            Uri uri = this.imageUri;
            Callback callback = this.callback;
            boolean z10 = this.allowCachedRedirects;
            Object obj = this.callerTag;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            return new ImageRequest(context, uri, callback, z10, obj, null);
        }

        public final Builder copy(Context context, Uri imageUri) {
            kotlin.jvm.internal.t.f(context, "context");
            kotlin.jvm.internal.t.f(imageUri, "imageUri");
            return new Builder(context, imageUri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return kotlin.jvm.internal.t.a(this.context, builder.context) && kotlin.jvm.internal.t.a(this.imageUri, builder.imageUri);
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.imageUri.hashCode();
        }

        public final Builder setAllowCachedRedirects(boolean z10) {
            this.allowCachedRedirects = z10;
            return this;
        }

        public final Builder setCallback(Callback callback) {
            this.callback = callback;
            return this;
        }

        public final Builder setCallerTag(Object obj) {
            this.callerTag = obj;
            return this;
        }

        public String toString() {
            return "Builder(context=" + this.context + ", imageUri=" + this.imageUri + ')';
        }
    }

    /* JADX INFO: compiled from: ImageRequest.kt */
    public interface Callback {
        void onCompleted(ImageResponse imageResponse);
    }

    /* JADX INFO: compiled from: ImageRequest.kt */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Uri getProfilePictureUri(String str, int i10, int i11) {
            return getProfilePictureUri(str, i10, i11, "");
        }

        public final Uri getProfilePictureUri(String str, int i10, int i11, String str2) {
            Validate.notNullOrEmpty(str, "userId");
            int iMax = Math.max(i10, 0);
            int iMax2 = Math.max(i11, 0);
            if (!((iMax == 0 && iMax2 == 0) ? false : true)) {
                throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
            }
            Uri.Builder builderBuildUpon = Uri.parse(ServerProtocol.getGraphUrlBase()).buildUpon();
            l0 l0Var = l0.f21527a;
            String str3 = String.format(Locale.US, ImageRequest.PATH, Arrays.copyOf(new Object[]{FacebookSdk.getGraphApiVersion(), str}, 2));
            kotlin.jvm.internal.t.e(str3, ZHgPsTG.bmMfnyATZinsH);
            Uri.Builder builderPath = builderBuildUpon.path(str3);
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter(ImageRequest.MIGRATION_PARAM, ImageRequest.MIGRATION_VALUE);
            if (!Utility.isNullOrEmpty(str2)) {
                builderPath.appendQueryParameter("access_token", str2);
            } else if (Utility.isNullOrEmpty(FacebookSdk.getClientToken()) || Utility.isNullOrEmpty(FacebookSdk.getApplicationId())) {
                Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
            } else {
                builderPath.appendQueryParameter("access_token", FacebookSdk.getApplicationId() + '|' + FacebookSdk.getClientToken());
            }
            Uri uriBuild = builderPath.build();
            kotlin.jvm.internal.t.e(uriBuild, "builder.build()");
            return uriBuild;
        }
    }

    public /* synthetic */ ImageRequest(Context context, Uri uri, Callback callback, boolean z10, Object obj, kotlin.jvm.internal.k kVar) {
        this(context, uri, callback, z10, obj);
    }

    public static final Uri getProfilePictureUri(String str, int i10, int i11) {
        return Companion.getProfilePictureUri(str, i10, i11);
    }

    public final boolean getAllowCachedRedirects() {
        return this.allowCachedRedirects;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final Object getCallerTag() {
        return this.callerTag;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final boolean isCachedRedirectAllowed() {
        return this.allowCachedRedirects;
    }

    private ImageRequest(Context context, Uri uri, Callback callback, boolean z10, Object obj) {
        this.context = context;
        this.imageUri = uri;
        this.callback = callback;
        this.allowCachedRedirects = z10;
        this.callerTag = obj;
    }

    public static final Uri getProfilePictureUri(String str, int i10, int i11, String str2) {
        return Companion.getProfilePictureUri(str, i10, i11, str2);
    }
}

package com.facebook.gamingservices.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.HttpMethod;
import com.facebook.internal.Utility;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: GamingMediaUploader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GamingMediaUploader {
    public static final GamingMediaUploader INSTANCE = new GamingMediaUploader();
    private static final String photoUploadEdge = "me/photos";

    private GamingMediaUploader() {
    }

    public static final GraphRequestAsyncTask uploadToGamingServices(String str, Bitmap imageBitmap, Bundle bundle, GraphRequest.Callback callback) {
        t.f(imageBitmap, "imageBitmap");
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, imageBitmap, str, bundle, callback).executeAsync();
    }

    public static final GraphRequestAsyncTask uploadToGamingServices(String str, File imageFile, Bundle bundle, GraphRequest.Callback callback) throws FileNotFoundException {
        t.f(imageFile, "imageFile");
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, imageFile, str, bundle, callback).executeAsync();
    }

    public static final GraphRequestAsyncTask uploadToGamingServices(String str, Uri imageUri, Bundle bundle, GraphRequest.Callback callback) throws FileNotFoundException {
        t.f(imageUri, "imageUri");
        if (!Utility.isFileUri(imageUri) && !Utility.isContentUri(imageUri)) {
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putString("url", imageUri.toString());
            if (!(str == null || str.length() == 0)) {
                bundle2.putString(ShareConstants.FEED_CAPTION_PARAM, str);
            }
            return new GraphRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, bundle2, HttpMethod.POST, callback, null, 32, null).executeAsync();
        }
        return GraphRequest.Companion.newUploadPhotoRequest(AccessToken.Companion.getCurrentAccessToken(), photoUploadEdge, imageUri, str, bundle, callback).executeAsync();
    }
}

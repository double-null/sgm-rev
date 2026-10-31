package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import d5.LXP.wcAlQCOdREZdI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.s;
import kotlin.collections.u;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rd.c0;
import rd.f0;

/* JADX INFO: compiled from: ShareInternalUtility.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShareInternalUtility {
    public static final ShareInternalUtility INSTANCE = new ShareInternalUtility();
    public static final String MY_STAGING_RESOURCES = "me/staging_resources";
    public static final String STAGING_PARAM = "file";

    private ShareInternalUtility() {
    }

    private final AppCall getAppCallFromActivityResult(int i10, int i11, Intent intent) {
        UUID callIdFromIntent = NativeProtocol.getCallIdFromIntent(intent);
        if (callIdFromIntent == null) {
            return null;
        }
        return AppCall.Companion.finishPendingCall(callIdFromIntent, i10);
    }

    private final NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, ShareMedia<?, ?> shareMedia) {
        Uri localUrl;
        Bitmap bitmap;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.getBitmap();
            localUrl = sharePhoto.getImageUrl();
        } else if (shareMedia instanceof ShareVideo) {
            localUrl = ((ShareVideo) shareMedia).getLocalUrl();
            bitmap = null;
        } else {
            localUrl = null;
            bitmap = null;
        }
        return getAttachment(uuid, localUrl, bitmap);
    }

    public static final Bundle getBackgroundAssetMediaInfo(ShareStoryContent shareStoryContent, UUID appCallId) {
        t.f(appCallId, "appCallId");
        Bundle bundle = null;
        if (shareStoryContent != null && shareStoryContent.getBackgroundAsset() != null) {
            ShareMedia<?, ?> backgroundAsset = shareStoryContent.getBackgroundAsset();
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, backgroundAsset);
            if (attachment == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString("type", backgroundAsset.getMediaType().name());
            bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            String uriExtension = getUriExtension(attachment.getOriginalUri());
            if (uriExtension != null) {
                Utility.putNonEmptyString(bundle, ShareConstants.MEDIA_EXTENSION, uriExtension);
            }
            NativeAppCallAttachmentStore.addAttachments(s.e(attachment));
        }
        return bundle;
    }

    public static final Pair<String, String> getFieldNameAndNamespaceFromFullName(String fullName) {
        String strSubstring;
        int i10;
        t.f(fullName, "fullName");
        int iH0 = f0.h0(fullName, ':', 0, false, 6, null);
        if (iH0 == -1 || fullName.length() <= (i10 = iH0 + 1)) {
            strSubstring = null;
        } else {
            strSubstring = fullName.substring(0, iH0);
            t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            fullName = fullName.substring(i10);
            t.e(fullName, "this as java.lang.String).substring(startIndex)");
        }
        return new Pair<>(strSubstring, fullName);
    }

    public static final List<Bundle> getMediaInfos(ShareMediaContent shareMediaContent, UUID appCallId) {
        List<ShareMedia<?, ?>> media;
        Bundle bundle;
        t.f(appCallId, "appCallId");
        if (shareMediaContent == null || (media = shareMediaContent.getMedia()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia<?, ?> shareMedia : media) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, shareMedia);
            if (attachment == null) {
                bundle = null;
            } else {
                arrayList.add(attachment);
                bundle = new Bundle();
                bundle.putString("type", shareMedia.getMediaType().name());
                bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return arrayList2;
    }

    public static final String getNativeDialogCompletionGesture(Bundle result) {
        t.f(result, "result");
        return result.containsKey(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY) ? result.getString(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY) : result.getString(NativeProtocol.EXTRA_DIALOG_COMPLETION_GESTURE_KEY);
    }

    public static final String getShareDialogPostId(Bundle result) {
        t.f(result, "result");
        if (result.containsKey(ShareConstants.RESULT_POST_ID)) {
            return result.getString(ShareConstants.RESULT_POST_ID);
        }
        return result.containsKey(ShareConstants.EXTRA_RESULT_POST_ID) ? result.getString(ShareConstants.EXTRA_RESULT_POST_ID) : result.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
    }

    public static final ResultProcessor getShareResultProcessor(FacebookCallback<Sharer.Result> facebookCallback) {
        return new ResultProcessor(facebookCallback) { // from class: com.facebook.share.internal.ShareInternalUtility.getShareResultProcessor.1
            final /* synthetic */ FacebookCallback<Sharer.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(facebookCallback);
                this.$callback = facebookCallback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onCancel(AppCall appCall) {
                t.f(appCall, "appCall");
                ShareInternalUtility.invokeOnCancelCallback(this.$callback);
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onError(AppCall appCall, FacebookException error) {
                t.f(appCall, "appCall");
                t.f(error, "error");
                ShareInternalUtility.invokeOnErrorCallback(this.$callback, error);
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(AppCall appCall, Bundle bundle) {
                t.f(appCall, "appCall");
                if (bundle != null) {
                    String nativeDialogCompletionGesture = ShareInternalUtility.getNativeDialogCompletionGesture(bundle);
                    if (nativeDialogCompletionGesture == null || c0.B("post", nativeDialogCompletionGesture, true)) {
                        ShareInternalUtility.invokeOnSuccessCallback(this.$callback, ShareInternalUtility.getShareDialogPostId(bundle));
                    } else if (c0.B("cancel", nativeDialogCompletionGesture, true)) {
                        ShareInternalUtility.invokeOnCancelCallback(this.$callback);
                    } else {
                        ShareInternalUtility.invokeOnErrorCallback(this.$callback, new FacebookException(NativeProtocol.ERROR_UNKNOWN_ERROR));
                    }
                }
            }
        };
    }

    public static final Bundle getStickerUrl(ShareStoryContent shareStoryContent, UUID appCallId) {
        t.f(appCallId, "appCallId");
        if (shareStoryContent == null || shareStoryContent.getStickerAsset() == null) {
            return null;
        }
        new ArrayList().add(shareStoryContent.getStickerAsset());
        NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, shareStoryContent.getStickerAsset());
        if (attachment == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ShareConstants.MEDIA_URI, attachment.getAttachmentUrl());
        String uriExtension = getUriExtension(attachment.getOriginalUri());
        if (uriExtension != null) {
            Utility.putNonEmptyString(bundle, ShareConstants.MEDIA_EXTENSION, uriExtension);
        }
        NativeAppCallAttachmentStore.addAttachments(s.e(attachment));
        return bundle;
    }

    public static final Bundle getTextureUrlBundle(ShareCameraEffectContent shareCameraEffectContent, UUID appCallId) {
        CameraEffectTextures textures;
        t.f(appCallId, "appCallId");
        if (shareCameraEffectContent == null || (textures = shareCameraEffectContent.getTextures()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : textures.keySet()) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(appCallId, textures.getTextureUri(str), textures.getTextureBitmap(str));
            if (attachment != null) {
                arrayList.add(attachment);
                bundle.putString(str, attachment.getAttachmentUrl());
            }
        }
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return bundle;
    }

    public static final String getUriExtension(Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        t.e(string, "uri.toString()");
        int iN0 = f0.n0(string, '.', 0, false, 6, null);
        if (iN0 == -1) {
            return null;
        }
        String strSubstring = string.substring(iN0);
        t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final String getVideoUrl(ShareVideoContent shareVideoContent, UUID appCallId) {
        ShareVideo video;
        Uri localUrl;
        t.f(appCallId, "appCallId");
        if (shareVideoContent == null || (video = shareVideoContent.getVideo()) == null || (localUrl = video.getLocalUrl()) == null) {
            return null;
        }
        NativeAppCallAttachmentStore.Attachment attachmentCreateAttachment = NativeAppCallAttachmentStore.createAttachment(appCallId, localUrl);
        NativeAppCallAttachmentStore.addAttachments(s.e(attachmentCreateAttachment));
        return attachmentCreateAttachment.getAttachmentUrl();
    }

    public static final boolean handleActivityResult(int i10, int i11, Intent intent, ResultProcessor resultProcessor) {
        AppCall appCallFromActivityResult = INSTANCE.getAppCallFromActivityResult(i10, i11, intent);
        if (appCallFromActivityResult == null) {
            return false;
        }
        NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appCallFromActivityResult.getCallId());
        if (resultProcessor == null) {
            return true;
        }
        FacebookException exceptionFromErrorData = intent != null ? NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(intent)) : null;
        if (exceptionFromErrorData == null) {
            resultProcessor.onSuccess(appCallFromActivityResult, intent != null ? NativeProtocol.getSuccessResultsFromIntent(intent) : null);
        } else if (exceptionFromErrorData instanceof FacebookOperationCanceledException) {
            resultProcessor.onCancel(appCallFromActivityResult);
        } else {
            resultProcessor.onError(appCallFromActivityResult, exceptionFromErrorData);
        }
        return true;
    }

    public static final void invokeCallbackWithError(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        invokeOnErrorCallback(facebookCallback, str);
    }

    public static final void invokeCallbackWithException(FacebookCallback<Sharer.Result> facebookCallback, Exception exception) {
        t.f(exception, "exception");
        if (exception instanceof FacebookException) {
            invokeOnErrorCallback(facebookCallback, (FacebookException) exception);
            return;
        }
        invokeCallbackWithError(facebookCallback, "Error preparing share content: " + exception.getLocalizedMessage());
    }

    public static final void invokeCallbackWithResults(FacebookCallback<Sharer.Result> facebookCallback, String str, GraphResponse graphResponse) {
        t.f(graphResponse, "graphResponse");
        FacebookRequestError error = graphResponse.getError();
        if (error == null) {
            invokeOnSuccessCallback(facebookCallback, str);
            return;
        }
        String errorMessage = error.getErrorMessage();
        if (Utility.isNullOrEmpty(errorMessage)) {
            errorMessage = "Unexpected error sharing.";
        }
        invokeOnErrorCallback(facebookCallback, graphResponse, errorMessage);
    }

    public static final void invokeOnCancelCallback(FacebookCallback<Sharer.Result> facebookCallback) {
        INSTANCE.logShareResult(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, null);
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, GraphResponse graphResponse, String str) {
        INSTANCE.logShareResult("error", str);
        if (facebookCallback != null) {
            facebookCallback.onError(new FacebookGraphResponseException(graphResponse, str));
        }
    }

    public static final void invokeOnSuccessCallback(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        INSTANCE.logShareResult(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED, null);
        if (facebookCallback != null) {
            facebookCallback.onSuccess(new Sharer.Result(str));
        }
    }

    private final void logShareResult(String str, String str2) {
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_OUTCOME, str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_SHARE_RESULT, bundle);
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Bitmap bitmap, GraphRequest.Callback callback) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(STAGING_PARAM, bitmap);
        return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, null, 32, null);
    }

    public static final void registerSharerCallback(final int i10, CallbackManager callbackManager, final FacebookCallback<Sharer.Result> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(i10, new CallbackManagerImpl.Callback() { // from class: com.facebook.share.internal.b
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i11, Intent intent) {
                return ShareInternalUtility.registerSharerCallback$lambda$1(i10, facebookCallback, i11, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerSharerCallback$lambda$1(int i10, FacebookCallback facebookCallback, int i11, Intent intent) {
        return handleActivityResult(i10, i11, intent, getShareResultProcessor(facebookCallback));
    }

    public static final void registerStaticShareCallback(final int i10) {
        CallbackManagerImpl.Companion.registerStaticCallback(i10, new CallbackManagerImpl.Callback() { // from class: com.facebook.share.internal.a
            @Override // com.facebook.internal.CallbackManagerImpl.Callback
            public final boolean onActivityResult(int i11, Intent intent) {
                return ShareInternalUtility.registerStaticShareCallback$lambda$0(i10, i11, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerStaticShareCallback$lambda$0(int i10, int i11, Intent intent) {
        return handleActivityResult(i10, i11, intent, getShareResultProcessor(null));
    }

    public static final JSONArray removeNamespacesFromOGJsonArray(JSONArray jsonArray, boolean z10) throws JSONException {
        t.f(jsonArray, "jsonArray");
        JSONArray jSONArray = new JSONArray();
        int length = jsonArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objRemoveNamespacesFromOGJsonObject = jsonArray.get(i10);
            if (objRemoveNamespacesFromOGJsonObject instanceof JSONArray) {
                objRemoveNamespacesFromOGJsonObject = removeNamespacesFromOGJsonArray((JSONArray) objRemoveNamespacesFromOGJsonObject, z10);
            } else if (objRemoveNamespacesFromOGJsonObject instanceof JSONObject) {
                objRemoveNamespacesFromOGJsonObject = removeNamespacesFromOGJsonObject((JSONObject) objRemoveNamespacesFromOGJsonObject, z10);
            }
            jSONArray.put(objRemoveNamespacesFromOGJsonObject);
        }
        return jSONArray;
    }

    public static final JSONObject removeNamespacesFromOGJsonObject(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames == null) {
                return null;
            }
            int length = jSONArrayNames.length();
            for (int i10 = 0; i10 < length; i10++) {
                String key = jSONArrayNames.getString(i10);
                Object objRemoveNamespacesFromOGJsonArray = jSONObject.get(key);
                if (objRemoveNamespacesFromOGJsonArray instanceof JSONObject) {
                    objRemoveNamespacesFromOGJsonArray = removeNamespacesFromOGJsonObject((JSONObject) objRemoveNamespacesFromOGJsonArray, true);
                } else if (objRemoveNamespacesFromOGJsonArray instanceof JSONArray) {
                    objRemoveNamespacesFromOGJsonArray = removeNamespacesFromOGJsonArray((JSONArray) objRemoveNamespacesFromOGJsonArray, true);
                }
                t.e(key, "key");
                Pair<String, String> fieldNameAndNamespaceFromFullName = getFieldNameAndNamespaceFromFullName(key);
                String str = (String) fieldNameAndNamespaceFromFullName.first;
                String str2 = (String) fieldNameAndNamespaceFromFullName.second;
                if (z10) {
                    if (str != null && t.a(str, DeviceRequestsHelper.SDK_HEADER)) {
                        jSONObject2.put(key, objRemoveNamespacesFromOGJsonArray);
                    } else if (str == null || t.a(str, "og")) {
                        jSONObject2.put(str2, objRemoveNamespacesFromOGJsonArray);
                    } else {
                        jSONObject3.put(str2, objRemoveNamespacesFromOGJsonArray);
                    }
                } else if (str == null || !t.a(str, "fb")) {
                    jSONObject2.put(str2, objRemoveNamespacesFromOGJsonArray);
                } else {
                    jSONObject2.put(key, objRemoveNamespacesFromOGJsonArray);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    public static final List<String> getPhotoUrls(SharePhotoContent sharePhotoContent, UUID uuid) {
        List<SharePhoto> photos;
        t.f(uuid, wcAlQCOdREZdI.raQWTO);
        if (sharePhotoContent == null || (photos = sharePhotoContent.getPhotos()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = photos.iterator();
        while (it.hasNext()) {
            NativeAppCallAttachmentStore.Attachment attachment = INSTANCE.getAttachment(uuid, (SharePhoto) it.next());
            if (attachment != null) {
                arrayList.add(attachment);
            }
        }
        ArrayList arrayList2 = new ArrayList(u.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((NativeAppCallAttachmentStore.Attachment) it2.next()).getAttachmentUrl());
        }
        NativeAppCallAttachmentStore.addAttachments(arrayList);
        return arrayList2;
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        INSTANCE.logShareResult("error", str);
        if (facebookCallback != null) {
            facebookCallback.onError(new FacebookException(str));
        }
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, File file, GraphRequest.Callback callback) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(STAGING_PARAM, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, null, 32, null);
    }

    public static final void invokeOnErrorCallback(FacebookCallback<Sharer.Result> facebookCallback, FacebookException ex) {
        t.f(ex, "ex");
        INSTANCE.logShareResult("error", ex.getMessage());
        if (facebookCallback != null) {
            facebookCallback.onError(ex);
        }
    }

    private final NativeAppCallAttachmentStore.Attachment getAttachment(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
        }
        if (uri != null) {
            return NativeAppCallAttachmentStore.createAttachment(uuid, uri);
        }
        return null;
    }

    public static final GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Uri imageUri, GraphRequest.Callback callback) throws FileNotFoundException {
        t.f(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (Utility.isFileUri(imageUri) && path != null) {
            return newUploadStagingResourceWithImageRequest(accessToken, new File(path), callback);
        }
        if (Utility.isContentUri(imageUri)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(imageUri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(STAGING_PARAM, parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, MY_STAGING_RESOURCES, bundle, HttpMethod.POST, callback, null, 32, null);
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }
}

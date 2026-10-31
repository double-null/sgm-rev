package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.share.Sharer;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ShareDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public class ShareDialog extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result> implements Sharer {
    private static final String FEED_DIALOG = "feed";
    private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
    public static final String WEB_SHARE_DIALOG = "share";
    private boolean isAutomaticMode;
    private final List<FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler> orderedModeHandlers;
    private boolean shouldFailOnDataError;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ShareDialog.class.getSimpleName();
    private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();

    /* JADX INFO: compiled from: ShareDialog.kt */
    private final class CameraEffectHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public CameraEffectHandler() {
            super();
            this.mode = Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            t.f(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> content, boolean z10) {
            t.f(content, "content");
            return (content instanceof ShareCameraEffectContent) && ShareDialog.Companion.canShowNative(content.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(final ShareContent<?, ?> content) {
            t.f(content, "content");
            ShareContentValidation.validateForNativeShare(content);
            final AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = ShareDialog.this.getShouldFailOnDataError();
            DialogFeature feature = ShareDialog.Companion.getFeature(content.getClass());
            if (feature == null) {
                return null;
            }
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$CameraEffectHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getLegacyParameters() {
                    return LegacyNativeDialogParameters.create(appCallCreateBaseAppCall.getCallId(), content, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getParameters() {
                    return NativeDialogParameters.create(appCallCreateBaseAppCall.getCallId(), content, shouldFailOnDataError);
                }
            }, feature);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: ShareDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean canShowNative(Class<? extends ShareContent<?, ?>> cls) {
            DialogFeature feature = getFeature(cls);
            return feature != null && DialogPresenter.canPresentNativeDialogWithFeature(feature);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final boolean canShowWebCheck(ShareContent<?, ?> shareContent) {
            return canShowWebTypeCheck(shareContent.getClass());
        }

        private final boolean canShowWebTypeCheck(Class<? extends ShareContent<?, ?>> cls) {
            return ShareLinkContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.Companion.isCurrentAccessTokenActive());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DialogFeature getFeature(Class<? extends ShareContent<?, ?>> cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.SHARE_DIALOG;
            }
            if (SharePhotoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.PHOTOS;
            }
            if (ShareVideoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.VIDEO;
            }
            if (ShareMediaContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.MULTIMEDIA;
            }
            if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
                return CameraEffectFeature.SHARE_CAMERA_EFFECT;
            }
            if (ShareStoryContent.class.isAssignableFrom(cls)) {
                return ShareStoryFeature.SHARE_STORY_ASSET;
            }
            return null;
        }

        public boolean canShow(Class<? extends ShareContent<?, ?>> contentType) {
            t.f(contentType, "contentType");
            return canShowWebTypeCheck(contentType) || canShowNative(contentType);
        }

        public void show(Activity activity, ShareContent<?, ?> shareContent) {
            t.f(activity, "activity");
            t.f(shareContent, "shareContent");
            new ShareDialog(activity).show(shareContent);
        }

        public void show(Fragment fragment, ShareContent<?, ?> shareContent) {
            t.f(fragment, "fragment");
            t.f(shareContent, ykDFMuXDQMaR.hGFaf);
            show(new FragmentWrapper(fragment), shareContent);
        }

        public void show(android.app.Fragment fragment, ShareContent<?, ?> shareContent) {
            t.f(fragment, "fragment");
            t.f(shareContent, "shareContent");
            show(new FragmentWrapper(fragment), shareContent);
        }

        private final void show(FragmentWrapper fragmentWrapper, ShareContent<?, ?> shareContent) {
            new ShareDialog(fragmentWrapper, 0, 2, null).show(shareContent);
        }
    }

    /* JADX INFO: compiled from: ShareDialog.kt */
    private final class FeedHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public FeedHandler() {
            super();
            this.mode = Mode.FEED;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            t.f(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> content, boolean z10) {
            t.f(content, "content");
            return (content instanceof ShareLinkContent) || (content instanceof ShareFeedContent);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ShareContent<?, ?> content) {
            Bundle bundleCreateForFeed;
            t.f(content, "content");
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), content, Mode.FEED);
            AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            if (content instanceof ShareLinkContent) {
                ShareContentValidation.validateForWebShare(content);
                bundleCreateForFeed = WebDialogParameters.createForFeed((ShareLinkContent) content);
            } else {
                if (!(content instanceof ShareFeedContent)) {
                    return null;
                }
                bundleCreateForFeed = WebDialogParameters.createForFeed((ShareFeedContent) content);
            }
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, ShareDialog.FEED_DIALOG, bundleCreateForFeed);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: ShareDialog.kt */
    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* JADX INFO: compiled from: ShareDialog.kt */
    private final class NativeHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public NativeHandler() {
            super();
            this.mode = Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            t.f(obj, "<set-?>");
            this.mode = obj;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0046  */
        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> content, boolean z10) {
            boolean zCanPresentNativeDialogWithFeature;
            t.f(content, "content");
            if ((content instanceof ShareCameraEffectContent) || (content instanceof ShareStoryContent)) {
                return false;
            }
            if (z10) {
                zCanPresentNativeDialogWithFeature = true;
            } else {
                zCanPresentNativeDialogWithFeature = content.getShareHashtag() != null ? DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.HASHTAG) : true;
                if (content instanceof ShareLinkContent) {
                    String quote = ((ShareLinkContent) content).getQuote();
                    if (!(quote == null || quote.length() == 0)) {
                        if (zCanPresentNativeDialogWithFeature && DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.LINK_SHARE_QUOTES)) {
                            zCanPresentNativeDialogWithFeature = true;
                        } else {
                            zCanPresentNativeDialogWithFeature = false;
                        }
                    }
                }
            }
            return zCanPresentNativeDialogWithFeature && ShareDialog.Companion.canShowNative(content.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(final ShareContent<?, ?> content) {
            t.f(content, "content");
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), content, Mode.NATIVE);
            ShareContentValidation.validateForNativeShare(content);
            final AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = ShareDialog.this.getShouldFailOnDataError();
            DialogFeature feature = ShareDialog.Companion.getFeature(content.getClass());
            if (feature == null) {
                return null;
            }
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$NativeHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getLegacyParameters() {
                    return LegacyNativeDialogParameters.create(appCallCreateBaseAppCall.getCallId(), content, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getParameters() {
                    return NativeDialogParameters.create(appCallCreateBaseAppCall.getCallId(), content, shouldFailOnDataError);
                }
            }, feature);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: ShareDialog.kt */
    private final class ShareStoryHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public ShareStoryHandler() {
            super();
            this.mode = Mode.NATIVE;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            t.f(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> content, boolean z10) {
            t.f(content, "content");
            return (content instanceof ShareStoryContent) && ShareDialog.Companion.canShowNative(content.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(final ShareContent<?, ?> content) {
            t.f(content, "content");
            ShareContentValidation.validateForStoryShare(content);
            final AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            final boolean shouldFailOnDataError = ShareDialog.this.getShouldFailOnDataError();
            DialogFeature feature = ShareDialog.Companion.getFeature(content.getClass());
            if (feature == null) {
                return null;
            }
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new DialogPresenter.ParameterProvider() { // from class: com.facebook.share.widget.ShareDialog$ShareStoryHandler$createAppCall$1
                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getLegacyParameters() {
                    return LegacyNativeDialogParameters.create(appCallCreateBaseAppCall.getCallId(), content, shouldFailOnDataError);
                }

                @Override // com.facebook.internal.DialogPresenter.ParameterProvider
                public Bundle getParameters() {
                    return NativeDialogParameters.create(appCallCreateBaseAppCall.getCallId(), content, shouldFailOnDataError);
                }
            }, feature);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: ShareDialog.kt */
    private final class WebShareHandler extends FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler {
        private Object mode;

        public WebShareHandler() {
            super();
            this.mode = Mode.WEB;
        }

        private final SharePhotoContent createAndMapAttachments(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.Builder from = new SharePhotoContent.Builder().readFrom(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sharePhotoContent.getPhotos().size();
            for (int i10 = 0; i10 < size; i10++) {
                SharePhoto sharePhotoBuild = sharePhotoContent.getPhotos().get(i10);
                Bitmap bitmap = sharePhotoBuild.getBitmap();
                if (bitmap != null) {
                    NativeAppCallAttachmentStore.Attachment attachmentCreateAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
                    sharePhotoBuild = new SharePhoto.Builder().readFrom(sharePhotoBuild).setImageUrl(Uri.parse(attachmentCreateAttachment.getAttachmentUrl())).setBitmap(null).build();
                    arrayList2.add(attachmentCreateAttachment);
                }
                arrayList.add(sharePhotoBuild);
            }
            from.setPhotos(arrayList);
            NativeAppCallAttachmentStore.addAttachments(arrayList2);
            return from.build();
        }

        private final String getActionName(ShareContent<?, ?> shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            return null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return this.mode;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public void setMode(Object obj) {
            t.f(obj, "<set-?>");
            this.mode = obj;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(ShareContent<?, ?> content, boolean z10) {
            t.f(content, "content");
            return ShareDialog.Companion.canShowWebCheck(content);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(ShareContent<?, ?> content) {
            Bundle bundleCreate;
            t.f(content, "content");
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.logDialogShare(shareDialog.getActivityContext(), content, Mode.WEB);
            AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            ShareContentValidation.validateForWebShare(content);
            if (content instanceof ShareLinkContent) {
                bundleCreate = WebDialogParameters.create((ShareLinkContent) content);
            } else {
                if (!(content instanceof SharePhotoContent)) {
                    return null;
                }
                bundleCreate = WebDialogParameters.create(createAndMapAttachments((SharePhotoContent) content, appCallCreateBaseAppCall.getCallId()));
            }
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, getActionName(content), bundleCreate);
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX INFO: compiled from: ShareDialog.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity) {
        this(activity, DEFAULT_REQUEST_CODE);
        t.f(activity, "activity");
    }

    public static boolean canShow(Class<? extends ShareContent<?, ?>> cls) {
        return Companion.canShow(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDialogShare(Context context, ShareContent<?, ?> shareContent, Mode mode) {
        String str;
        if (this.isAutomaticMode) {
            mode = Mode.AUTOMATIC;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        String str2 = "unknown";
        if (i10 == 1) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC;
        } else if (i10 != 2) {
            str = i10 != 3 ? "unknown" : "native";
        } else {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB;
        }
        DialogFeature feature = Companion.getFeature(shareContent.getClass());
        if (feature == ShareDialogFeature.SHARE_DIALOG) {
            str2 = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS;
        } else if (feature == ShareDialogFeature.PHOTOS) {
            str2 = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO;
        } else if (feature == ShareDialogFeature.VIDEO) {
            str2 = "video";
        }
        InternalAppEventsLogger internalAppEventsLoggerCreateInstance = InternalAppEventsLogger.Companion.createInstance(context, FacebookSdk.getApplicationId());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str2);
        internalAppEventsLoggerCreateInstance.logEventImplicitly("fb_share_dialog_show", bundle);
    }

    public static void show(Activity activity, ShareContent<?, ?> shareContent) {
        Companion.show(activity, shareContent);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected List<FacebookDialogBase<ShareContent<?, ?>, Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        return this.orderedModeHandlers;
    }

    public boolean getShouldFailOnDataError() {
        return this.shouldFailOnDataError;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    protected void registerCallbackImpl(CallbackManagerImpl callbackManager, FacebookCallback<Sharer.Result> callback) {
        t.f(callbackManager, "callbackManager");
        t.f(callback, "callback");
        ShareInternalUtility.registerSharerCallback(getRequestCode(), callbackManager, callback);
    }

    public void setShouldFailOnDataError(boolean z10) {
        this.shouldFailOnDataError = z10;
    }

    public ShareDialog(int i10) {
        super(i10);
        this.isAutomaticMode = true;
        this.orderedModeHandlers = kotlin.collections.t.g(new NativeHandler(), new FeedHandler(), new WebShareHandler(), new CameraEffectHandler(), new ShareStoryHandler());
        ShareInternalUtility.registerStaticShareCallback(i10);
    }

    public static void show(android.app.Fragment fragment, ShareContent<?, ?> shareContent) {
        Companion.show(fragment, shareContent);
    }

    public boolean canShow(ShareContent<?, ?> content, Mode mode) {
        t.f(content, "content");
        t.f(mode, "mode");
        Object obj = mode;
        if (mode == Mode.AUTOMATIC) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        return canShowImpl(content, obj);
    }

    public static void show(Fragment fragment, ShareContent<?, ?> shareContent) {
        Companion.show(fragment, shareContent);
    }

    public void show(ShareContent<?, ?> content, Mode mode) {
        t.f(content, "content");
        t.f(mode, "mode");
        boolean z10 = mode == Mode.AUTOMATIC;
        this.isAutomaticMode = z10;
        Object obj = mode;
        if (z10) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        showImpl(content, obj);
    }

    public /* synthetic */ ShareDialog(int i10, int i11, k kVar) {
        this((i11 & 1) != 0 ? DEFAULT_REQUEST_CODE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment), 0, 2, null);
        t.f(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment), 0, 2, null);
        t.f(fragment, "fragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity, int i10) {
        super(activity, i10);
        t.f(activity, "activity");
        this.isAutomaticMode = true;
        this.orderedModeHandlers = kotlin.collections.t.g(new NativeHandler(), new FeedHandler(), new WebShareHandler(), new CameraEffectHandler(), new ShareStoryHandler());
        ShareInternalUtility.registerStaticShareCallback(i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(Fragment fragment, int i10) {
        this(new FragmentWrapper(fragment), i10);
        t.f(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareDialog(android.app.Fragment fragment, int i10) {
        this(new FragmentWrapper(fragment), i10);
        t.f(fragment, "fragment");
    }

    public /* synthetic */ ShareDialog(FragmentWrapper fragmentWrapper, int i10, int i11, k kVar) {
        this(fragmentWrapper, (i11 & 2) != 0 ? DEFAULT_REQUEST_CODE : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareDialog(FragmentWrapper fragmentWrapper, int i10) {
        super(fragmentWrapper, i10);
        t.f(fragmentWrapper, "fragmentWrapper");
        this.isAutomaticMode = true;
        this.orderedModeHandlers = kotlin.collections.t.g(new NativeHandler(), new FeedHandler(), new WebShareHandler(), new CameraEffectHandler(), new ShareStoryHandler());
        ShareInternalUtility.registerStaticShareCallback(i10);
    }
}

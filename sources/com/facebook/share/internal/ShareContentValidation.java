package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ShareContentValidation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShareContentValidation {
    public static final ShareContentValidation INSTANCE = new ShareContentValidation();
    private static final Validator webShareValidator = new WebShareValidator();
    private static final Validator defaultValidator = new Validator();
    private static final Validator apiValidator = new ApiValidator();
    private static final Validator storyValidator = new StoryShareValidator();

    /* JADX INFO: compiled from: ShareContentValidation.kt */
    private static final class ApiValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(SharePhoto photo) {
            t.f(photo, "photo");
            ShareContentValidation.INSTANCE.validatePhotoForApi(photo, this);
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareVideoContent videoContent) {
            t.f(videoContent, "videoContent");
            if (!Utility.isNullOrEmpty(videoContent.getPlaceId())) {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            }
            if (!Utility.isNullOrEmpty(videoContent.getPeopleIds())) {
                throw new FacebookException("Cannot share video content with people IDs using the share api");
            }
            if (!Utility.isNullOrEmpty(videoContent.getRef())) {
                throw new FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareMediaContent mediaContent) {
            t.f(mediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareLinkContent linkContent) {
            t.f(linkContent, "linkContent");
            if (!Utility.isNullOrEmpty(linkContent.getQuote())) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }
    }

    /* JADX INFO: compiled from: ShareContentValidation.kt */
    private static final class StoryShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }

    /* JADX INFO: compiled from: ShareContentValidation.kt */
    public static class Validator {
        public void validate(ShareLinkContent linkContent) {
            t.f(linkContent, "linkContent");
            ShareContentValidation.INSTANCE.validateLinkContent(linkContent, this);
        }

        public void validate(SharePhotoContent photoContent) {
            t.f(photoContent, "photoContent");
            ShareContentValidation.INSTANCE.validatePhotoContent(photoContent, this);
        }

        public void validate(ShareVideoContent videoContent) {
            t.f(videoContent, "videoContent");
            ShareContentValidation.INSTANCE.validateVideoContent(videoContent, this);
        }

        public void validate(ShareMediaContent mediaContent) {
            t.f(mediaContent, "mediaContent");
            ShareContentValidation.INSTANCE.validateMediaContent(mediaContent, this);
        }

        public void validate(ShareCameraEffectContent cameraEffectContent) {
            t.f(cameraEffectContent, "cameraEffectContent");
            ShareContentValidation.INSTANCE.validateCameraEffectContent(cameraEffectContent);
        }

        public void validate(SharePhoto photo) {
            t.f(photo, "photo");
            ShareContentValidation.INSTANCE.validatePhotoForNativeDialog(photo, this);
        }

        public void validate(ShareVideo shareVideo) {
            ShareContentValidation.INSTANCE.validateVideo(shareVideo, this);
        }

        public void validate(ShareMedia<?, ?> medium) {
            t.f(medium, "medium");
            ShareContentValidation.validateMedium(medium, this);
        }

        public void validate(ShareStoryContent shareStoryContent) {
            ShareContentValidation.INSTANCE.validateStoryContent(shareStoryContent, this);
        }
    }

    /* JADX INFO: compiled from: ShareContentValidation.kt */
    private static final class WebShareValidator extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareVideoContent videoContent) {
            t.f(videoContent, "videoContent");
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(ShareMediaContent mediaContent) {
            t.f(mediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(SharePhoto photo) {
            t.f(photo, "photo");
            ShareContentValidation.INSTANCE.validatePhotoForWebDialog(photo, this);
        }
    }

    private ShareContentValidation() {
    }

    private final void validate(ShareContent<?, ?> shareContent, Validator validator) throws FacebookException {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            validator.validate((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            validator.validate((SharePhotoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            validator.validate((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            validator.validate((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            validator.validate((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            validator.validate((ShareStoryContent) shareContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateCameraEffectContent(ShareCameraEffectContent shareCameraEffectContent) {
        if (Utility.isNullOrEmpty(shareCameraEffectContent.getEffectId())) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    public static final void validateForApiShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, apiValidator);
    }

    public static final void validateForMessage(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    public static final void validateForNativeShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, defaultValidator);
    }

    public static final void validateForStoryShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, storyValidator);
    }

    public static final void validateForWebShare(ShareContent<?, ?> shareContent) {
        INSTANCE.validate(shareContent, webShareValidator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateLinkContent(ShareLinkContent shareLinkContent, Validator validator) {
        Uri contentUrl = shareLinkContent.getContentUrl();
        if (contentUrl != null && !Utility.isWebUri(contentUrl)) {
            throw new FacebookException("Content Url must be an http:// or https:// url");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateMediaContent(ShareMediaContent shareMediaContent, Validator validator) {
        List<ShareMedia<?, ?>> media = shareMediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        }
        if (media.size() <= 6) {
            Iterator<ShareMedia<?, ?>> it = media.iterator();
            while (it.hasNext()) {
                validator.validate(it.next());
            }
        } else {
            l0 l0Var = l0.f21527a;
            String str = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            t.e(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }
    }

    public static final void validateMedium(ShareMedia<?, ?> medium, Validator validator) {
        t.f(medium, "medium");
        t.f(validator, "validator");
        if (medium instanceof SharePhoto) {
            validator.validate((SharePhoto) medium);
        } else {
            if (medium instanceof ShareVideo) {
                validator.validate((ShareVideo) medium);
                return;
            }
            l0 l0Var = l0.f21527a;
            String str = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{medium.getClass().getSimpleName()}, 1));
            t.e(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }
    }

    private final void validatePhoto(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && imageUrl == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoContent(SharePhotoContent sharePhotoContent, Validator validator) {
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        }
        if (photos.size() <= 6) {
            Iterator<SharePhoto> it = photos.iterator();
            while (it.hasNext()) {
                validator.validate(it.next());
            }
        } else {
            l0 l0Var = l0.f21527a;
            String str = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            t.e(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForApi(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && Utility.isWebUri(imageUrl)) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForNativeDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhotoForApi(sharePhoto, validator);
        if (sharePhoto.getBitmap() == null && Utility.isWebUri(sharePhoto.getImageUrl())) {
            return;
        }
        Validate.hasContentProvider(FacebookSdk.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePhotoForWebDialog(SharePhoto sharePhoto, Validator validator) {
        validatePhoto(sharePhoto);
    }

    private final void validateShareMessengerActionButton(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton == null) {
            return;
        }
        if (Utility.isNullOrEmpty(shareMessengerActionButton.getTitle())) {
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
        if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
            validateShareMessengerURLActionButton((ShareMessengerURLActionButton) shareMessengerActionButton);
        }
    }

    private final void validateShareMessengerURLActionButton(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.getUrl() == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateStoryContent(ShareStoryContent shareStoryContent, Validator validator) {
        if (shareStoryContent == null || (shareStoryContent.getBackgroundAsset() == null && shareStoryContent.getStickerAsset() == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.getBackgroundAsset() != null) {
            validator.validate(shareStoryContent.getBackgroundAsset());
        }
        if (shareStoryContent.getStickerAsset() != null) {
            validator.validate(shareStoryContent.getStickerAsset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideoContent(ShareVideoContent shareVideoContent, Validator validator) {
        validator.validate(shareVideoContent.getVideo());
        SharePhoto previewPhoto = shareVideoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            validator.validate(previewPhoto);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateVideo(ShareVideo shareVideo, Validator validator) {
        if (shareVideo == null) {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        Uri localUrl = shareVideo.getLocalUrl();
        if (localUrl == null) {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        if (!Utility.isContentUri(localUrl) && !Utility.isFileUri(localUrl)) {
            throw new FacebookException(CwEo.icTSoOyyA);
        }
    }
}

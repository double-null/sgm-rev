package com.facebook.share.internal;

import android.os.Bundle;
import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.facebook.internal.Utility;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.u;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: WebDialogParameters.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class WebDialogParameters {
    public static final WebDialogParameters INSTANCE = new WebDialogParameters();

    private WebDialogParameters() {
    }

    public static final Bundle create(AppGroupCreationContent appGroupCreationContent) {
        String lowerCase;
        String string;
        t.f(appGroupCreationContent, "appGroupCreationContent");
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "name", appGroupCreationContent.getName());
        Utility.putNonEmptyString(bundle, "description", appGroupCreationContent.getDescription());
        AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy = appGroupCreationContent.getAppGroupPrivacy();
        if (appGroupPrivacy == null || (string = appGroupPrivacy.toString()) == null) {
            lowerCase = null;
        } else {
            Locale ENGLISH = Locale.ENGLISH;
            t.e(ENGLISH, "ENGLISH");
            lowerCase = string.toLowerCase(ENGLISH);
            t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        }
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_PRIVACY, lowerCase);
        return bundle;
    }

    public static final Bundle createBaseParameters(ShareContent<?, ?> shareContent) {
        t.f(shareContent, "shareContent");
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag != null ? shareHashtag.getHashtag() : null);
        return bundle;
    }

    public static final Bundle createForFeed(ShareLinkContent shareLinkContent) {
        t.f(shareLinkContent, "shareLinkContent");
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "link", Utility.getUriString(shareLinkContent.getContentUrl()));
        Utility.putNonEmptyString(bundle, edUJlCZxhVnO.LQk, shareLinkContent.getQuote());
        ShareHashtag shareHashtag = shareLinkContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag != null ? shareHashtag.getHashtag() : null);
        return bundle;
    }

    public static final Bundle create(GameRequestContent gameRequestContent) {
        String lowerCase;
        String string;
        String string2;
        t.f(gameRequestContent, "gameRequestContent");
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "message", gameRequestContent.getMessage());
        Utility.putCommaSeparatedStringList(bundle, "to", gameRequestContent.getRecipients());
        Utility.putNonEmptyString(bundle, "title", gameRequestContent.getTitle());
        Utility.putNonEmptyString(bundle, "data", gameRequestContent.getData());
        GameRequestContent.ActionType actionType = gameRequestContent.getActionType();
        String lowerCase2 = null;
        if (actionType == null || (string2 = actionType.toString()) == null) {
            lowerCase = null;
        } else {
            Locale ENGLISH = Locale.ENGLISH;
            t.e(ENGLISH, "ENGLISH");
            lowerCase = string2.toLowerCase(ENGLISH);
            t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        }
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, lowerCase);
        Utility.putNonEmptyString(bundle, "object_id", gameRequestContent.getObjectId());
        GameRequestContent.Filters filters = gameRequestContent.getFilters();
        if (filters != null && (string = filters.toString()) != null) {
            Locale ENGLISH2 = Locale.ENGLISH;
            t.e(ENGLISH2, "ENGLISH");
            lowerCase2 = string.toLowerCase(ENGLISH2);
            t.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        }
        Utility.putNonEmptyString(bundle, "filters", lowerCase2);
        Utility.putCommaSeparatedStringList(bundle, ShareConstants.WEB_DIALOG_PARAM_SUGGESTIONS, gameRequestContent.getSuggestions());
        return bundle;
    }

    public static final Bundle createForFeed(ShareFeedContent shareFeedContent) {
        t.f(shareFeedContent, "shareFeedContent");
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "to", shareFeedContent.getToId());
        Utility.putNonEmptyString(bundle, "link", shareFeedContent.getLink());
        Utility.putNonEmptyString(bundle, "picture", shareFeedContent.getPicture());
        Utility.putNonEmptyString(bundle, ShareConstants.FEED_SOURCE_PARAM, shareFeedContent.getMediaSource());
        Utility.putNonEmptyString(bundle, "name", shareFeedContent.getLinkName());
        Utility.putNonEmptyString(bundle, ShareConstants.FEED_CAPTION_PARAM, shareFeedContent.getLinkCaption());
        Utility.putNonEmptyString(bundle, "description", shareFeedContent.getLinkDescription());
        return bundle;
    }

    public static final Bundle create(ShareLinkContent shareLinkContent) {
        t.f(shareLinkContent, "shareLinkContent");
        Bundle bundleCreateBaseParameters = createBaseParameters(shareLinkContent);
        Utility.putUri(bundleCreateBaseParameters, ShareConstants.WEB_DIALOG_PARAM_HREF, shareLinkContent.getContentUrl());
        Utility.putNonEmptyString(bundleCreateBaseParameters, ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        return bundleCreateBaseParameters;
    }

    public static final Bundle create(SharePhotoContent sharePhotoContent) {
        t.f(sharePhotoContent, "sharePhotoContent");
        Bundle bundleCreateBaseParameters = createBaseParameters(sharePhotoContent);
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null) {
            photos = kotlin.collections.t.k();
        }
        ArrayList arrayList = new ArrayList(u.u(photos, 10));
        Iterator<T> it = photos.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((SharePhoto) it.next()).getImageUrl()));
        }
        bundleCreateBaseParameters.putStringArray(ShareConstants.WEB_DIALOG_PARAM_MEDIA, (String[]) arrayList.toArray(new String[0]));
        return bundleCreateBaseParameters;
    }
}

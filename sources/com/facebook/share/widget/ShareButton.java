package com.facebook.share.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.R;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.CallbackManagerImpl;
import h.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareButton extends ShareButtonBase {
    public ShareButton(Context context) {
        super(context, null, 0, AnalyticsEvents.EVENT_SHARE_BUTTON_CREATE, AnalyticsEvents.EVENT_SHARE_BUTTON_DID_TAP);
    }

    @Override // com.facebook.share.widget.ShareButtonBase, com.facebook.FacebookButtonBase
    protected void configureButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        super.configureButton(context, attributeSet, i10, i11);
        setCompoundDrawablesWithIntrinsicBounds(a.b(getContext(), R.drawable.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultRequestCode() {
        return CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    }

    @Override // com.facebook.FacebookButtonBase
    protected int getDefaultStyleResource() {
        return com.facebook.share.R.style.com_facebook_button_share;
    }

    @Override // com.facebook.share.widget.ShareButtonBase
    protected ShareDialog getDialog() {
        ShareDialog shareDialog;
        if (getFragment() != null) {
            shareDialog = new ShareDialog(getFragment(), getRequestCode());
        } else {
            shareDialog = getNativeFragment() != null ? new ShareDialog(getNativeFragment(), getRequestCode()) : new ShareDialog(getActivity(), getRequestCode());
        }
        shareDialog.setCallbackManager(getCallbackManager());
        return shareDialog;
    }

    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, AnalyticsEvents.EVENT_SHARE_BUTTON_CREATE, AnalyticsEvents.EVENT_SHARE_BUTTON_DID_TAP);
    }

    public ShareButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, AnalyticsEvents.EVENT_SHARE_BUTTON_CREATE, AnalyticsEvents.EVENT_SHARE_BUTTON_DID_TAP);
    }
}

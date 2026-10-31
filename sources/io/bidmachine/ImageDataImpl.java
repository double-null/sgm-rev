package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class ImageDataImpl implements ImageData {
    private Drawable image;
    private Uri localUri;
    private String remoteUrl;

    public ImageDataImpl() {
    }

    public void destroy() {
        this.remoteUrl = null;
        this.image = null;
        this.localUri = null;
    }

    @Override // io.bidmachine.ImageData
    public Drawable getImage() {
        return this.image;
    }

    @Override // io.bidmachine.ImageData
    public Uri getLocalUri() {
        return this.localUri;
    }

    @Override // io.bidmachine.ImageData
    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public ImageDataImpl setImage(Drawable drawable) {
        this.image = drawable;
        return this;
    }

    public ImageDataImpl setLocalUri(Uri uri) {
        this.localUri = uri;
        return this;
    }

    public ImageDataImpl setRemoteUrl(String str) {
        this.remoteUrl = str;
        return this;
    }

    public ImageDataImpl(String str) {
        this.remoteUrl = str;
    }

    public ImageDataImpl(Drawable drawable) {
        this.image = drawable;
    }

    public ImageDataImpl(ImageData imageData) {
        if (imageData != null) {
            this.remoteUrl = imageData.getRemoteUrl();
            this.image = imageData.getImage();
            this.localUri = imageData.getLocalUri();
        }
    }
}

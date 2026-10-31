package com.facebook.internal;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: ImageResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ImageResponse {
    private final Bitmap bitmap;
    private final Exception error;
    private final boolean isCachedRedirect;
    private final ImageRequest request;

    public ImageResponse(ImageRequest request, Exception exc, boolean z10, Bitmap bitmap) {
        kotlin.jvm.internal.t.f(request, "request");
        this.request = request;
        this.error = exc;
        this.isCachedRedirect = z10;
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Exception getError() {
        return this.error;
    }

    public final ImageRequest getRequest() {
        return this.request;
    }

    public final boolean isCachedRedirect() {
        return this.isCachedRedirect;
    }
}

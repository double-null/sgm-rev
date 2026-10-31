package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public interface ImageData {
    Drawable getImage();

    Uri getLocalUri();

    String getRemoteUrl();
}

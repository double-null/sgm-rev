package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class ImageViewUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, final l lVar, final ImageView imageView, Uri uri) {
        try {
            InputStream inputStreamOpenStream = new URL(str).openStream();
            try {
                final Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenStream);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageViewUtils.a(lVar, bitmapDecodeStream, imageView);
                    }
                });
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } catch (Throwable th) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("ImageViewUtils", "Failed to fetch image: " + uri, th3);
            }
            lVar.Q().a("ImageViewUtils", th3);
            lVar.E().a("ImageViewUtils", "setImageUri", th3);
        }
    }

    public static void setAndDownscaleBitmap(final ImageView imageView, final Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        l lVar = l.E0;
        if (lVar == null) {
            p.h("ImageViewUtils", "SDK has not been initialized");
        } else {
            lVar.s0().b().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.a
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.a(uri, imageView);
                }
            });
        }
    }

    public static void setAndDownscaleImageUri(final ImageView imageView, final Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new Runnable() { // from class: com.applovin.impl.sdk.utils.c
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.setAndDownscaleBitmap(imageView, uri);
                }
            });
        } else {
            setAndDownscaleBitmap(imageView, uri);
        }
    }

    public static void setImageUri(final ImageView imageView, final Uri uri, final l lVar) {
        if (imageView == null || uri == null) {
            return;
        }
        final String string = uri.toString();
        if (URLUtil.isFileUrl(string) || URLUtil.isContentUrl(string)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.f
                @Override // java.lang.Runnable
                public final void run() {
                    ImageViewUtils.b(imageView, uri);
                }
            });
            return;
        }
        if (lVar == null) {
            return;
        }
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("ImageViewUtils", "Fetching image: " + uri);
        }
        lVar.s0().b().execute(new Runnable() { // from class: com.applovin.impl.sdk.utils.e
            @Override // java.lang.Runnable
            public final void run() {
                ImageViewUtils.a(string, lVar, imageView, uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(l lVar, Bitmap bitmap, ImageView imageView) {
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("ImageViewUtils", yhXxbqGRMeI.qcScxoK);
        }
        imageView.setImageDrawable(new BitmapDrawable(l.p().getResources(), bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Uri uri, final ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point pointB = p0.b(imageView.getContext());
            height = Math.min(pointB.x, pointB.y);
            width = height;
        }
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > height || i12 > width) {
            while (true) {
                int i13 = i10 * 2;
                if (i11 / i13 < height && i12 / i13 < width) {
                    break;
                } else {
                    i10 = i13;
                }
            }
        }
        options.inSampleSize = i10;
        options.inJustDecodeBounds = false;
        l.E0.Q();
        if (p.a()) {
            l.E0.Q().a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(uri.getPath(), options);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setImageBitmap(bitmapDecodeFile);
            }
        });
    }
}

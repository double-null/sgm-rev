package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import id.l;
import id.p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.c0;
import wc.g0;

/* JADX INFO: compiled from: ImageLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageLoader {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ImageLoader.class.getSimpleName();
    private static final ImageLoader instance = new ImageLoader();

    /* JADX INFO: compiled from: ImageLoader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final ImageLoader getInstance() {
            return ImageLoader.instance;
        }
    }

    private ImageLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m319displayImage$lambda0(String str, l onImageLoaded) {
        t.f(onImageLoaded, "$onImageLoaded");
        if (c0.O(str, "file://", false, 2, null)) {
            String strSubstring = str.substring(7);
            t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                onImageLoaded.invoke(bitmapDecodeFile);
                return;
            }
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            t.e(TAG2, "TAG");
            companion.w(TAG2, "decode bitmap failed.");
        }
    }

    public final void displayImage(final String str, final l<? super Bitmap, g0> onImageLoaded) {
        t.f(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            t.e(TAG2, "TAG");
            companion.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            Logger.Companion companion2 = Logger.Companion;
            String TAG3 = TAG;
            t.e(TAG3, "TAG");
            companion2.w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.e
                @Override // java.lang.Runnable
                public final void run() {
                    ImageLoader.m319displayImage$lambda0(str, onImageLoaded);
                }
            });
        }
    }

    public final void getImageSize(String str, p<? super Integer, ? super Integer, g0> onImageSizeLoaded) {
        t.f(onImageSizeLoaded, "onImageSizeLoaded");
        if ((str == null || str.length() == 0) || !c0.O(str, "file://", false, 2, null)) {
            Logger.Companion companion = Logger.Companion;
            String TAG2 = TAG;
            t.e(TAG2, "TAG");
            companion.w(TAG2, "the valid uri is required.");
            return;
        }
        String strSubstring = str.substring(7);
        t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strSubstring, options);
        onImageSizeLoaded.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final void init(Executor ioExecutor) {
        t.f(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}

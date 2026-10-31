package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.h2;
import com.applovin.impl.k5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinNativeAdImpl f8528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0119a f8529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f8530i;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.nativeAd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0119a {
        void a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public a(AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.l lVar, InterfaceC0119a interfaceC0119a) {
        super("TaskCacheNativeAd", lVar);
        this.f8530i = UUID.randomUUID().toString();
        this.f8528g = appLovinNativeAdImpl;
        this.f8529h = interfaceC0119a;
    }

    private float a(Uri uri) {
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                int i10 = options.outWidth;
                int i11 = options.outHeight;
                if (i10 <= 0 || i11 <= 0) {
                    fileInputStream.close();
                    return -1.0f;
                }
                float f10 = i10 / i11;
                fileInputStream.close();
                return f10;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.a(this.f6991b, "Failed to calculate aspect ratio", e10);
            }
        }
    }

    private Uri b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Attempting to cache resource: " + uri);
        }
        String strA = this.f6990a.I().a(a(), uri.toString(), this.f8528g.getCachePrefix(), Collections.emptyList(), false, false, 1, this.f8530i, h2.a(this.f8528g));
        if (TextUtils.isEmpty(strA)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileA = this.f6990a.I().a(strA, a());
        if (fileA != null) {
            Uri uriFromFile = Uri.fromFile(fileA);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6992c.b(this.f6991b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.b(this.f6991b, "Unable to retrieve File from cached image filename = " + strA);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Begin caching ad #" + this.f8528g.getAdIdNumber() + "...");
        }
        Uri uriB = b(this.f8528g.getIconUri());
        if (uriB != null) {
            this.f8528g.setIconUri(uriB);
        }
        Uri uriB2 = b(this.f8528g.getMainImageUri());
        if (uriB2 != null) {
            this.f8528g.setMainImageUri(uriB2);
            float fA = a(uriB2);
            if (fA > 0.0f) {
                this.f8528g.setMainImageAspectRatio(fA);
            }
        }
        Uri uriB3 = b(this.f8528g.getPrivacyIconUri());
        if (uriB3 != null) {
            this.f8528g.setPrivacyIconUri(uriB3);
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6992c.a(this.f6991b, "Finished caching ad #" + this.f8528g.getAdIdNumber());
        }
        this.f8529h.a(this.f8528g);
    }
}

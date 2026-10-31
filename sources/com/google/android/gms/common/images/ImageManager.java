package com.google.android.gms.common.images;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zaj;
import com.google.android.gms.internal.base.zar;
import com.google.android.gms.internal.base.zas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static final HashSet zab = new HashSet();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new zas(Looper.getMainLooper());
    private final ExecutorService zaf = zar.zaa().zaa(4, 2);
    private final zaj zag = new zaj();
    private final Map zah = new HashMap();
    private final Map zai = new HashMap();
    private final Map zaj = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager zaa;
        private final Uri zab;
        private final ArrayList zac;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ImageReceiver(ImageManager imageManager, Uri uri) {
            super(new zas(Looper.getMainLooper()));
            Objects.requireNonNull(imageManager);
            this.zaa = imageManager;
            this.zab = uri;
            this.zac = new ArrayList();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i10, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            AssetFileDescriptor assetFileDescriptor = parcelFileDescriptor != null ? new AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L)) : null;
            ImageManager imageManager = this.zaa;
            imageManager.zaf().execute(new zaa(imageManager, this.zab, assetFileDescriptor));
        }

        public final void zaa(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zac() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zab);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            int i10 = Build.VERSION.SDK_INT;
            Context contextZad = this.zaa.zad();
            if (i10 < 34) {
                contextZad.sendBroadcast(intent);
            } else {
                contextZad.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }

        final /* synthetic */ ArrayList zad() {
            return this.zac;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z10);
    }

    private ImageManager(Context context, boolean z10) {
        this.zad = context.getApplicationContext();
    }

    public static ImageManager create(Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(ImageView imageView, int i10) {
        zaa(new zae(imageView, i10));
    }

    public final void zaa(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }

    final /* synthetic */ Context zad() {
        return this.zad;
    }

    final /* synthetic */ Handler zae() {
        return this.zae;
    }

    final /* synthetic */ ExecutorService zaf() {
        return this.zaf;
    }

    final /* synthetic */ zaj zag() {
        return this.zag;
    }

    final /* synthetic */ Map zah() {
        return this.zah;
    }

    final /* synthetic */ Map zai() {
        return this.zai;
    }

    final /* synthetic */ Map zaj() {
        return this.zaj;
    }

    public void loadImage(ImageView imageView, Uri uri) {
        zaa(new zae(imageView, uri));
    }

    public void loadImage(ImageView imageView, Uri uri, int i10) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i10;
        zaa(zaeVar);
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zaa(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i10) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i10;
        zaa(zafVar);
    }
}

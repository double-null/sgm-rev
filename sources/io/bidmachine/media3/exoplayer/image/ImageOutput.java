package io.bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public interface ImageOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageOutput f19085a = new a();

    void a();

    void onImageAvailable(long j10, Bitmap bitmap);

    class a implements ImageOutput {
        a() {
        }

        @Override // io.bidmachine.media3.exoplayer.image.ImageOutput
        public void a() {
        }

        @Override // io.bidmachine.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j10, Bitmap bitmap) {
        }
    }
}

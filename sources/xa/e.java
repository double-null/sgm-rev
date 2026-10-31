package xa;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes5.dex */
public interface e extends TextureView.SurfaceTextureListener {
    @Override // android.view.TextureView.SurfaceTextureListener
    default void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    default void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}

package za;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.FrameLayout;
import kotlin.jvm.internal.t;
import wc.g0;
import xa.e;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mb.a f29095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f29096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer f29097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f29098d;

    private final class a implements MediaPlayer.OnVideoSizeChangedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            b.this.setVideoAspectRatio(i10 / i11);
        }
    }

    /* JADX INFO: renamed from: za.b$b, reason: collision with other inner class name */
    private final class C0492b implements e {
        public C0492b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            t.f(surfaceTexture, "surfaceTexture");
            b bVar = b.this;
            Surface surface = new Surface(surfaceTexture);
            b.this.a(surface);
            bVar.f29098d = surface;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            t.f(surfaceTexture, "surfaceTexture");
            c listener = b.this.getListener();
            if (listener == null) {
                return false;
            }
            listener.a();
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        t.f(context, "context");
        mb.a aVar = new mb.a(context);
        aVar.setSurfaceTextureListener(new C0492b());
        this.f29095a = aVar;
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g0 a(Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.f29097c;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
                return g0.f27756a;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private final void d() {
        Surface surface = this.f29098d;
        if (surface != null) {
            surface.release();
        }
        this.f29098d = null;
    }

    public final void c() {
        a(null);
        d();
        this.f29097c = null;
        this.f29095a.setSurfaceTextureListener(null);
    }

    public final c getListener() {
        return this.f29096b;
    }

    public final void setListener(c cVar) {
        this.f29096b = cVar;
    }

    public final void setMediaPlayer(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new a());
        } else {
            mediaPlayer = null;
        }
        this.f29097c = mediaPlayer;
    }

    public final void setVideoAspectRatio(float f10) {
        this.f29095a.setVideoAspectRatio(f10);
    }
}

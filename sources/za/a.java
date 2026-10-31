package za;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import java.io.IOException;
import pb.b0;

/* JADX INFO: loaded from: classes5.dex */
public class a extends xa.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f29086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MediaPlayer f29087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final za.b f29088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f29089o = 1.0f;

    /* JADX INFO: renamed from: za.a$a, reason: collision with other inner class name */
    protected class C0491a implements za.c {
        protected C0491a() {
        }

        @Override // za.c
        public void a() {
            if (a.this.d()) {
                a.this.M(new b0("Surface Destroyed"));
            }
        }
    }

    protected class b implements MediaPlayer.OnCompletionListener {
        protected b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            a.this.r();
        }
    }

    protected class c implements MediaPlayer.OnErrorListener {
        protected c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            a.this.D(new b0("MediaPlayer - onError (what - " + i10 + ", extra - " + i11 + ")"));
            return true;
        }
    }

    protected class d implements MediaPlayer.OnPreparedListener {
        protected d() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(1);
            a.this.h0();
        }
    }

    protected class e implements MediaPlayer.OnSeekCompleteListener {
        protected e() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            a aVar = a.this;
            aVar.K(aVar.d0());
        }
    }

    public a(Context context) {
        this.f29086l = context.getApplicationContext();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f29087m = mediaPlayer;
        mediaPlayer.setLooping(false);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        mediaPlayer.setOnPreparedListener(new d());
        mediaPlayer.setOnErrorListener(new c());
        mediaPlayer.setOnSeekCompleteListener(new e());
        mediaPlayer.setOnCompletionListener(new b());
        za.b bVar = new za.b(context);
        this.f29088n = bVar;
        bVar.setListener(new C0491a());
        bVar.setMediaPlayer(mediaPlayer);
    }

    @Override // xa.a
    protected void A(long j10) {
        this.f29087m.seekTo((int) j10);
    }

    @Override // xa.a
    protected long G() {
        return this.f29087m.getDuration();
    }

    @Override // xa.a
    protected void J(Uri uri) throws IOException {
        this.f29087m.reset();
        this.f29087m.setDataSource(this.f29086l, uri);
    }

    @Override // xa.a
    public float N() {
        return this.f29089o;
    }

    @Override // xa.a
    protected void O(float f10) {
        this.f29089o = f10;
        super.O(f10);
        H(f10);
    }

    @Override // xa.a
    protected boolean V() {
        return this.f29087m.isPlaying();
    }

    @Override // xa.a
    protected boolean X() {
        return false;
    }

    @Override // xa.a
    protected void Y() {
        this.f29087m.pause();
    }

    @Override // xa.a
    protected void Z() {
        this.f29087m.start();
    }

    @Override // xa.a
    protected void a0() {
        this.f29087m.prepareAsync();
    }

    @Override // xa.a
    protected void b0() {
        this.f29087m.stop();
    }

    @Override // xa.a, xa.b
    public void destroy() {
        super.destroy();
        this.f29088n.c();
        this.f29087m.reset();
        this.f29087m.release();
    }

    @Override // xa.b
    public View l() {
        return this.f29088n;
    }

    @Override // xa.a
    protected void n0() {
        super.n0();
        f0();
    }

    @Override // xa.a
    protected void o0() {
        super.o0();
        g0();
    }

    @Override // xa.a
    protected long y() {
        return this.f29087m.getCurrentPosition();
    }

    @Override // xa.a
    protected void z(float f10) {
        this.f29087m.setVolume(f10, f10);
    }
}

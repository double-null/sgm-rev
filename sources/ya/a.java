package ya;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import io.bidmachine.media3.common.PlaybackException;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.ui.x;
import u7.s;
import u7.y;

/* JADX INFO: loaded from: classes5.dex */
public class a extends xa.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExoPlayer f28868l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final x f28869m;

    /* JADX INFO: renamed from: ya.a$a, reason: collision with other inner class name */
    protected class C0489a implements y.d {
        protected C0489a() {
        }

        @Override // u7.y.d
        public void I(int i10) {
            if (i10 == 3) {
                a.this.h0();
            } else if (i10 == 4) {
                a.this.r();
            }
        }

        @Override // u7.y.d
        public void P(PlaybackException playbackException) {
            a.this.C(playbackException);
        }

        @Override // u7.y.d
        public void Y(y.e eVar, y.e eVar2, int i10) {
            a.this.K(Long.valueOf(eVar2.f26540g));
        }

        @Override // u7.y.d
        public void c0(float f10) {
            a.this.H(f10);
        }

        @Override // u7.y.d
        public void q0(boolean z10) {
            if (z10) {
                a.this.g0();
            } else {
                a.this.f0();
            }
        }
    }

    public a(Context context) {
        ExoPlayer exoPlayerE = new ExoPlayer.b(context).e();
        this.f28868l = exoPlayerE;
        exoPlayerE.i(new C0489a());
        x xVar = new x(context);
        this.f28869m = xVar;
        xVar.setPlayer(exoPlayerE);
        xVar.setUseController(false);
    }

    @Override // xa.a
    protected void A(long j10) {
        this.f28868l.N(j10);
    }

    @Override // xa.a
    protected long G() {
        return this.f28868l.getDuration();
    }

    @Override // xa.a
    protected void J(Uri uri) {
        this.f28868l.K(new s.c().f(uri).a());
    }

    @Override // xa.a
    public float N() {
        return this.f28868l.getVolume();
    }

    @Override // xa.a
    protected boolean V() {
        return this.f28868l.isPlaying();
    }

    @Override // xa.a
    protected boolean X() {
        return false;
    }

    @Override // xa.a
    protected void Y() {
        this.f28868l.pause();
    }

    @Override // xa.a
    protected void Z() {
        this.f28868l.n();
    }

    @Override // xa.a
    protected void a0() {
        this.f28868l.k();
    }

    @Override // xa.a
    protected void b0() {
        this.f28868l.stop();
    }

    @Override // xa.a, xa.b
    public void destroy() {
        super.destroy();
        this.f28868l.release();
        this.f28869m.setPlayer(null);
    }

    @Override // xa.b
    public View l() {
        return this.f28869m;
    }

    @Override // xa.a
    protected long y() {
        return this.f28868l.getCurrentPosition();
    }

    @Override // xa.a
    protected void z(float f10) {
        this.f28868l.setVolume(f10);
    }
}

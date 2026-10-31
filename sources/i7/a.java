package i7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import pb.a1;
import wb.g0;

/* JADX INFO: loaded from: classes4.dex */
public class a extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private final List O;
    private final List P;
    private final Runnable Q;
    private final Runnable R;
    private final b S;
    private final b T;
    private final LinkedList U;
    private int V;
    private float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16009a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final b f16010a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    m7.c f16011b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f16012b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    FrameLayout f16013c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final MediaPlayer.OnCompletionListener f16014c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Surface f16015d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final MediaPlayer.OnErrorListener f16016d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    FrameLayout f16017e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final MediaPlayer.OnPreparedListener f16018e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    n7.a f16019f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final MediaPlayer.OnVideoSizeChangedListener f16020f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g7.j f16021g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private h7.d.a f16022g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g7.k f16023h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final View.OnTouchListener f16024h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g7.s f16025i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final WebChromeClient f16026i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g7.q f16027j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final WebViewClient f16028j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g7.p f16029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g7.r f16030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    g7.l f16031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    MediaPlayer f16032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    View f16033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    l7.g f16034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    l7.g f16035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ImageView f16036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    io.bidmachine.iab.mraid.y f16037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    h7.g f16038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c f16039u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h7.m f16040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h7.f f16041w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e7.c f16042x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private e7.b f16043y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d0 f16044z;

    class a0 extends d0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ WeakReference f16046f;

        /* JADX INFO: renamed from: i7.a$a0$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0248a implements View.OnClickListener {
            ViewOnClickListenerC0248a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.y0();
                a.this.i0();
            }
        }

        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                a.this.f16013c.setVisibility(8);
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.y0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(Context context, Uri uri, String str, WeakReference weakReference) {
            super(context, uri, str);
            this.f16046f = weakReference;
        }

        @Override // i7.a.d0
        void d(Bitmap bitmap) {
            ImageView imageView = (ImageView) this.f16046f.get();
            if (imageView != null) {
                if (bitmap == null) {
                    imageView.setOnClickListener(new ViewOnClickListenerC0248a());
                    return;
                }
                imageView.setImageBitmap(bitmap);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).setDuration(100L).setListener(new b()).start();
                imageView.setOnClickListener(new c());
            }
        }
    }

    private interface b {
        void a(int i10, int i11, float f10);
    }

    private class b0 implements g7.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f16051a;

        public b0(List list) {
            this.f16051a = list;
        }

        @Override // g7.i
        public void b() {
            a.this.B(this.f16051a);
            if (a.this.f16042x != null) {
                a.this.f16042x.onAdClicked();
            }
        }

        @Override // g7.i
        public void c() {
            if (a.this.z0()) {
                a.this.setLoadingViewVisibility(false);
            } else if (a.this.E) {
                a.this.W0();
            } else {
                a.this.L0();
            }
        }
    }

    private final class c0 implements io.bidmachine.iab.mraid.z {
        private c0() {
        }

        @Override // io.bidmachine.iab.mraid.z
        public void a(io.bidmachine.iab.mraid.y yVar, c7.b bVar) {
            a.this.M(bVar);
        }

        @Override // io.bidmachine.iab.mraid.z
        public void b(io.bidmachine.iab.mraid.y yVar) {
            a aVar = a.this;
            if (aVar.f16039u.f16062j) {
                aVar.setLoadingViewVisibility(false);
                yVar.z(a.this, false);
            }
        }

        @Override // io.bidmachine.iab.mraid.z
        public void c(io.bidmachine.iab.mraid.y yVar, c7.b bVar) {
            a.this.M(bVar);
        }

        @Override // io.bidmachine.iab.mraid.z
        public void e(io.bidmachine.iab.mraid.y yVar, c7.b bVar) {
            a.this.m(bVar);
        }

        @Override // io.bidmachine.iab.mraid.z
        public void g(io.bidmachine.iab.mraid.y yVar, String str, g7.i iVar) {
            iVar.c();
            a aVar = a.this;
            aVar.J(aVar.f16035q, str);
        }

        @Override // io.bidmachine.iab.mraid.z
        public void k(io.bidmachine.iab.mraid.y yVar) {
            a.this.m0();
        }

        /* synthetic */ c0(a aVar, o oVar) {
            this();
        }

        @Override // io.bidmachine.iab.mraid.z
        public void f(io.bidmachine.iab.mraid.y yVar) {
        }

        @Override // io.bidmachine.iab.mraid.z
        public void d(io.bidmachine.iab.mraid.y yVar, a1 a1Var) {
        }

        @Override // io.bidmachine.iab.mraid.z
        public void j(io.bidmachine.iab.mraid.y yVar, String str) {
        }

        @Override // io.bidmachine.iab.mraid.z
        public void h(io.bidmachine.iab.mraid.y yVar, String str, g7.i iVar) {
        }

        @Override // io.bidmachine.iab.mraid.z
        public void i(io.bidmachine.iab.mraid.y yVar, String str, g7.i iVar) {
        }
    }

    private static class d implements e7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f16068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e7.b f16069b;

        public d(a aVar, e7.b bVar) {
            this.f16068a = aVar;
            this.f16069b = bVar;
        }

        @Override // e7.a
        public void A(ViewGroup viewGroup) {
            this.f16069b.A(this.f16068a);
        }

        @Override // e7.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void M(WebView webView) {
            this.f16069b.M(webView);
        }

        @Override // e7.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void P(WebView webView) {
            this.f16069b.P(webView);
        }

        @Override // e7.b
        public String d(String str) {
            return this.f16069b.d(str);
        }

        @Override // e7.a
        public void j() {
            this.f16069b.j();
        }

        @Override // e7.a
        public void l(c7.b bVar) {
            this.f16069b.l(bVar);
        }

        @Override // e7.a
        public void onAdClicked() {
            this.f16069b.onAdClicked();
        }
    }

    private static abstract class d0 extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f16070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f16071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f16072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f16073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f16074e;

        /* JADX INFO: renamed from: i7.a$d0$a, reason: collision with other inner class name */
        class RunnableC0250a implements Runnable {
            RunnableC0250a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d0 d0Var = d0.this;
                d0Var.d(d0Var.f16073d);
            }
        }

        d0(Context context, Uri uri, String str) {
            this.f16070a = new WeakReference(context);
            this.f16071b = uri;
            this.f16072c = str;
            if (str == null && (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(uri.getPath()).exists())) {
                d(null);
            } else {
                start();
            }
        }

        void c() {
            this.f16074e = true;
        }

        abstract void d(Bitmap bitmap);

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Context context = (Context) this.f16070a.get();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (context != null) {
                try {
                    Uri uri = this.f16071b;
                    if (uri != null) {
                        mediaMetadataRetriever.setDataSource(context, uri);
                    } else {
                        String str = this.f16072c;
                        if (str != null) {
                            mediaMetadataRetriever.setDataSource(str, new HashMap());
                        }
                    }
                    this.f16073d = mediaMetadataRetriever.getFrameAtTime((Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) / 2) * 1000, 2);
                } catch (Exception e10) {
                    h7.e.b("MediaFrameRetriever", e10.getMessage(), new Object[0]);
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e11) {
                h7.e.b("MediaFrameRetriever", e11.getMessage(), new Object[0]);
            }
            if (this.f16074e) {
                return;
            }
            g7.y.r(new RunnableC0250a());
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.D0()) {
                a.this.c0();
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.D0() && a.this.f16032n.isPlaying()) {
                    int duration = a.this.f16032n.getDuration();
                    int currentPosition = a.this.f16032n.getCurrentPosition();
                    if (currentPosition > 0) {
                        float f10 = (currentPosition * 100.0f) / duration;
                        a.this.S.a(duration, currentPosition, f10);
                        a.this.T.a(duration, currentPosition, f10);
                        a.this.f16010a0.a(duration, currentPosition, f10);
                        if (f10 > 105.0f) {
                            h7.e.b(a.this.f16009a, "Playback tracking: video hang detected", new Object[0]);
                            a.this.p0();
                        }
                    }
                }
            } catch (Exception e10) {
                h7.e.b(a.this.f16009a, "Playback tracking exception: %s", e10.getMessage());
            }
            a.this.postDelayed(this, 16L);
        }
    }

    class g implements b {
        g() {
        }

        @Override // i7.a.b
        public void a(int i10, int i11, float f10) {
            g7.k kVar;
            a aVar = a.this;
            c cVar = aVar.f16039u;
            if (cVar.f16061i || cVar.f16054b == 0.0f || !aVar.E(aVar.f16038t)) {
                return;
            }
            a aVar2 = a.this;
            float f11 = aVar2.f16039u.f16054b * 1000.0f;
            float f12 = i11;
            float f13 = f11 - f12;
            int i12 = (int) ((f12 * 100.0f) / f11);
            h7.e.a(aVar2.f16009a, "Skip percent: %s", Integer.valueOf(i12));
            if (i12 < 100 && (kVar = a.this.f16023h) != null) {
                kVar.r(i12, (int) Math.ceil(((double) f13) / 1000.0d));
            }
            if (f13 <= 0.0f) {
                a aVar3 = a.this;
                c cVar2 = aVar3.f16039u;
                cVar2.f16054b = 0.0f;
                cVar2.f16061i = true;
                aVar3.setCloseControlsVisible(true);
            }
        }
    }

    class h implements b {
        h() {
        }

        @Override // i7.a.b
        public void a(int i10, int i11, float f10) {
            a aVar = a.this;
            c cVar = aVar.f16039u;
            if (cVar.f16060h && cVar.f16055c == 3) {
                return;
            }
            if (aVar.f16038t.I() > 0 && i11 > a.this.f16038t.I() && a.this.f16038t.O() == h7.n.Rewarded) {
                a aVar2 = a.this;
                aVar2.f16039u.f16061i = true;
                aVar2.setCloseControlsVisible(true);
            }
            a aVar3 = a.this;
            int i12 = aVar3.f16039u.f16055c;
            if (f10 > i12 * 25.0f) {
                if (i12 == 3) {
                    h7.e.a(aVar3.f16009a, "Video at third quartile: (%s)", Float.valueOf(f10));
                    a.this.X(h7.a.thirdQuartile);
                    if (a.this.f16041w != null) {
                        a.this.f16041w.X();
                    }
                } else if (i12 == 0) {
                    h7.e.a(aVar3.f16009a, "Video at start: (%s)", Float.valueOf(f10));
                    a.this.X(h7.a.start);
                    if (a.this.f16041w != null) {
                        a.this.f16041w.Z(i10, a.this.f16039u.f16058f ? 0.0f : 1.0f);
                    }
                } else if (i12 == 1) {
                    h7.e.a(aVar3.f16009a, "Video at first quartile: (%s)", Float.valueOf(f10));
                    a.this.X(h7.a.firstQuartile);
                    if (a.this.f16041w != null) {
                        a.this.f16041w.g0();
                    }
                } else if (i12 == 2) {
                    h7.e.a(aVar3.f16009a, "Video at midpoint: (%s)", Float.valueOf(f10));
                    a.this.X(h7.a.midpoint);
                    if (a.this.f16041w != null) {
                        a.this.f16041w.V();
                    }
                }
                a.this.f16039u.f16055c++;
            }
        }
    }

    class i implements b {
        i() {
        }

        @Override // i7.a.b
        public void a(int i10, int i11, float f10) {
            if (a.this.U.size() == 2 && ((Integer) a.this.U.getFirst()).intValue() > ((Integer) a.this.U.getLast()).intValue()) {
                h7.e.b(a.this.f16009a, "Playing progressing error: seek", new Object[0]);
                a.this.U.removeFirst();
            }
            if (a.this.U.size() == 19) {
                Integer num = (Integer) a.this.U.getFirst();
                int iIntValue = num.intValue();
                Integer num2 = (Integer) a.this.U.getLast();
                int iIntValue2 = num2.intValue();
                h7.e.a(a.this.f16009a, "Playing progressing position: last=%d, first=%d)", num2, num);
                if (iIntValue2 > iIntValue) {
                    a.this.U.removeFirst();
                } else {
                    a.K0(a.this);
                    if (a.this.V >= 3) {
                        a.this.W(c7.b.f("Playing progressing error: video hang detected"));
                        return;
                    }
                }
            }
            try {
                a.this.U.addLast(Integer.valueOf(i11));
                if (i10 == 0 || i11 <= 0) {
                    return;
                }
                a aVar = a.this;
                if (aVar.f16030l != null) {
                    h7.e.a(aVar.f16009a, "Playing progressing percent: %s", Float.valueOf(f10));
                    if (a.this.W < f10) {
                        a.this.W = f10;
                        int i12 = i10 / 1000;
                        a.this.f16030l.r(f10, Math.min(i12, (int) Math.ceil(i11 / 1000.0f)), i12);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    class k implements MediaPlayer.OnCompletionListener {
        k() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            h7.e.a(a.this.f16009a, "MediaPlayer - onCompletion", new Object[0]);
            a.this.p0();
        }
    }

    class l implements MediaPlayer.OnErrorListener {
        l() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            a.this.W(c7.b.f(String.format("MediaPlayer - onError: what - %s, extra - %s", Integer.valueOf(i10), Integer.valueOf(i11))));
            return true;
        }
    }

    class m implements MediaPlayer.OnPreparedListener {
        m() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            h7.e.a(a.this.f16009a, "MediaPlayer - onPrepared", new Object[0]);
            a aVar = a.this;
            if (aVar.f16039u.f16062j) {
                return;
            }
            aVar.X(h7.a.creativeView);
            a.this.X(h7.a.fullscreen);
            a.this.m1();
            a.this.setLoadingViewVisibility(false);
            a.this.J = true;
            if (!a.this.f16039u.f16059g) {
                mediaPlayer.start();
                a.this.e1();
            }
            a.this.k1();
            int i10 = a.this.f16039u.f16056d;
            if (i10 > 0) {
                mediaPlayer.seekTo(i10);
                a.this.X(h7.a.resume);
                if (a.this.f16041w != null) {
                    a.this.f16041w.f0();
                }
            }
            a aVar2 = a.this;
            if (!aVar2.f16039u.f16065m) {
                aVar2.L0();
            }
            a aVar3 = a.this;
            if (aVar3.f16039u.f16063k) {
                return;
            }
            aVar3.t0();
            if (a.this.f16038t.a0()) {
                a.this.D(false);
            }
        }
    }

    class n implements MediaPlayer.OnVideoSizeChangedListener {
        n() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            h7.e.a(a.this.f16009a, "onVideoSizeChanged", new Object[0]);
            a.this.C = i10;
            a.this.D = i11;
            a.this.c0();
        }
    }

    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.D0() || a.this.f16039u.f16062j) {
                a.this.c1();
            }
        }
    }

    class p implements h7.d.a {
        p() {
        }

        @Override // h7.d.a
        public void a(boolean z10) {
            a.this.o1();
        }
    }

    class q implements View.OnTouchListener {
        q() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0 && action != 1) {
                return false;
            }
            a.this.O.add(view);
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    class r extends qb.a {
        r() {
        }

        private boolean a(JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            h7.e.a("JS alert", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            h7.e.a("JS confirm", str2, new Object[0]);
            return a(jsResult);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            h7.e.a("JS prompt", str2, new Object[0]);
            return a(jsPromptResult);
        }
    }

    class t implements h7.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c7.a f16092b;

        t(boolean z10, c7.a aVar) {
            this.f16091a = z10;
            this.f16092b = aVar;
        }

        @Override // h7.l
        public void a(h7.g gVar, j7.b bVar) {
            a.this.r(gVar, bVar, this.f16091a);
        }

        @Override // h7.l
        public void b(h7.g gVar, c7.b bVar) {
            a aVar = a.this;
            aVar.P(aVar.f16040v, gVar, c7.b.i(String.format("Error loading video after showing with %s - %s", this.f16092b, bVar)));
        }
    }

    class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.y0();
        }
    }

    class w implements View.OnClickListener {
        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h7.g gVar = a.this.f16038t;
            if (gVar != null && gVar.R()) {
                a aVar = a.this;
                if (!aVar.f16039u.f16064l && aVar.y0()) {
                    return;
                }
            }
            if (a.this.I) {
                a.this.i0();
            } else {
                a.this.v0();
            }
        }
    }

    class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.b();
        }
    }

    class y implements View.OnClickListener {
        y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.U0();
        }
    }

    class z implements View.OnClickListener {
        z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.y0();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(List list) {
        if (C0()) {
            if (list == null || list.isEmpty()) {
                h7.e.a(this.f16009a, "\turl list is null", new Object[0]);
                return;
            }
            h7.g gVar = this.f16038t;
            if (gVar != null) {
                gVar.B(list, null);
            }
        }
    }

    private void C(Map map, h7.a aVar) {
        if (map == null || map.isEmpty()) {
            h7.e.a(this.f16009a, "Processing Event - fail: %s (tracking event map is null or empty)", aVar);
        } else {
            B((List) map.get(aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z10) {
        if (C0()) {
            o oVar = null;
            if (!z10) {
                l7.g gVarM = this.f16038t.M().m(getAvailableWidth(), getAvailableHeight());
                if (this.f16035q != gVarM) {
                    if (gVarM == null || !this.f16038t.b0()) {
                        this.B = this.A;
                    } else {
                        this.B = g7.y.s(gVarM.A0(), gVarM.w0());
                    }
                    this.f16035q = gVarM;
                    io.bidmachine.iab.mraid.y yVar = this.f16037s;
                    if (yVar != null) {
                        yVar.o();
                        this.f16037s = null;
                    }
                }
            }
            if (this.f16035q == null) {
                if (this.f16036r == null) {
                    this.f16036r = j(getContext());
                    return;
                }
                return;
            }
            if (this.f16037s == null) {
                S0();
                String strY0 = this.f16035q.y0();
                if (strY0 == null) {
                    M(c7.b.a("Companion creative is null"));
                    return;
                }
                l7.e eVarI = this.f16038t.M().i();
                l7.o oVarO = eVarI != null ? eVarI.o() : null;
                io.bidmachine.iab.mraid.y.a aVarL = io.bidmachine.iab.mraid.y.w().e(null).f(c7.a.FullLoad).h(this.f16038t.D()).b(this.f16038t.Q()).k(false).c(this.f16043y).l(new c0(this, oVar));
                if (oVarO != null) {
                    aVarL.g(oVarO.b());
                    aVarL.i(oVarO.x());
                    aVarL.m(oVarO.z());
                    aVarL.p(oVarO.B());
                    aVarL.j(oVarO.u0());
                    aVarL.o(oVarO.v0());
                    if (oVarO.w0()) {
                        aVarL.b(true);
                    }
                    aVarL.q(oVarO.h());
                    aVarL.r(oVarO.f());
                }
                try {
                    io.bidmachine.iab.mraid.y yVarA = aVarL.a(getContext());
                    this.f16037s = yVarA;
                    yVarA.v(strY0);
                } catch (Throwable th) {
                    M(c7.b.j("Exception during companion creation", th));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean E(h7.g gVar) {
        return gVar.O() != h7.n.Rewarded || gVar.I() <= 0;
    }

    private boolean F(h7.g gVar, Boolean bool, boolean z10) {
        b1();
        if (!z10) {
            this.f16039u = new c();
        }
        if (bool != null) {
            this.f16039u.f16057e = bool.booleanValue();
        }
        this.f16038t = gVar;
        if (gVar == null) {
            i0();
            h7.e.b(this.f16009a, "VastRequest is null. Stop playing...", new Object[0]);
            return false;
        }
        j7.b bVarM = gVar.M();
        if (bVarM == null) {
            i0();
            h7.e.b(this.f16009a, "VastAd is null. Stop playing...", new Object[0]);
            return false;
        }
        c7.a aVarC = gVar.C();
        if (aVarC == c7.a.PartialLoad && !F0()) {
            q(gVar, bVarM, aVarC, z10);
            return true;
        }
        if (aVarC != c7.a.Stream || F0()) {
            r(gVar, bVarM, z10);
            return true;
        }
        q(gVar, bVarM, aVarC, z10);
        gVar.W(getContext().getApplicationContext(), null);
        return true;
    }

    private void H0() {
        h7.e.a(this.f16009a, "finishVideoPlaying", new Object[0]);
        b1();
        h7.g gVar = this.f16038t;
        if (gVar == null || gVar.P() || !(this.f16038t.M().i() == null || this.f16038t.M().i().o().x0())) {
            i0();
            return;
        }
        if (E0()) {
            X(h7.a.close);
        }
        setLoadingViewVisibility(false);
        Q0();
        Y0();
    }

    private boolean I(List list, String str) {
        h7.e.a(this.f16009a, "processClickThroughEvent: %s", str);
        this.f16039u.f16064l = true;
        if (str == null) {
            return false;
        }
        if (this.f16040v != null && this.f16038t != null) {
            L0();
            setLoadingViewVisibility(true);
            this.f16040v.f(this, this.f16038t, new b0(list), str);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J(l7.g gVar, String str) {
        h7.g gVar2 = this.f16038t;
        ArrayList arrayList = null;
        j7.b bVarM = gVar2 != null ? gVar2.M() : null;
        ArrayList<String> arrayListS = bVarM != null ? bVarM.s() : null;
        List<String> listV0 = gVar != null ? gVar.v0() : null;
        if (arrayListS != null || listV0 != null) {
            arrayList = new ArrayList();
            if (listV0 != null) {
                arrayList.addAll(listV0);
            }
            if (arrayListS != null) {
                arrayList.addAll(arrayListS);
            }
        }
        return I(arrayList, str);
    }

    private void J0() {
        if (this.f16036r != null) {
            S0();
        } else {
            io.bidmachine.iab.mraid.y yVar = this.f16037s;
            if (yVar != null) {
                yVar.o();
                this.f16037s = null;
                this.f16035q = null;
            }
        }
        this.I = false;
    }

    static /* synthetic */ int K0(a aVar) {
        int i10 = aVar.V;
        aVar.V = i10 + 1;
        return i10;
    }

    private void L() {
        d0 d0Var = this.f16044z;
        if (d0Var != null) {
            d0Var.c();
            this.f16044z = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
        if (!D0() || this.f16039u.f16059g) {
            return;
        }
        h7.e.a(this.f16009a, "pausePlayback", new Object[0]);
        c cVar = this.f16039u;
        cVar.f16059g = true;
        cVar.f16056d = this.f16032n.getCurrentPosition();
        this.f16032n.pause();
        V();
        l();
        X(h7.a.pause);
        h7.f fVar = this.f16041w;
        if (fVar != null) {
            fVar.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(c7.b bVar) {
        h7.g gVar;
        h7.e.b(this.f16009a, "handleCompanionShowError - %s", bVar);
        s(h7.j.f15705m);
        t(this.f16040v, this.f16038t, bVar);
        if (this.f16035q != null) {
            J0();
            S(true);
            return;
        }
        h7.m mVar = this.f16040v;
        if (mVar == null || (gVar = this.f16038t) == null) {
            return;
        }
        mVar.e(this, gVar, A0());
    }

    private void N(h7.a aVar) {
        h7.e.a(this.f16009a, "Track Companion Event: %s", aVar);
        l7.g gVar = this.f16035q;
        if (gVar != null) {
            C(gVar.z0(), aVar);
        }
    }

    private void N0() {
        h7.e.b(this.f16009a, "performVideoCloseClick", new Object[0]);
        b1();
        if (this.K) {
            i0();
            return;
        }
        if (!this.f16039u.f16060h) {
            X(h7.a.skip);
            h7.f fVar = this.f16041w;
            if (fVar != null) {
                fVar.m();
            }
        }
        h7.g gVar = this.f16038t;
        if (gVar != null && gVar.O() == h7.n.Rewarded && this.f16039u.f16060h) {
            h7.f fVar2 = this.f16041w;
            if (fVar2 != null) {
                fVar2.onVideoCompleted();
            }
            h7.m mVar = this.f16040v;
            if (mVar != null) {
                mVar.b(this, this.f16038t);
            }
        }
        H0();
    }

    private void O(h7.c cVar) {
        if (cVar != null && !cVar.x().e0().booleanValue()) {
            g7.k kVar = this.f16023h;
            if (kVar != null) {
                kVar.l();
                return;
            }
            return;
        }
        if (this.f16023h == null) {
            g7.k kVar2 = new g7.k(null);
            this.f16023h = kVar2;
            this.P.add(kVar2);
        }
        this.f16023h.g(getContext(), this.f16017e, k(cVar, cVar != null ? cVar.x() : null));
    }

    private void O0() {
        try {
            if (!C0() || this.f16039u.f16062j) {
                return;
            }
            if (this.f16032n == null) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f16032n = mediaPlayer;
                mediaPlayer.setLooping(false);
                this.f16032n.setAudioStreamType(3);
                this.f16032n.setOnCompletionListener(this.f16014c0);
                this.f16032n.setOnErrorListener(this.f16016d0);
                this.f16032n.setOnPreparedListener(this.f16018e0);
                this.f16032n.setOnVideoSizeChangedListener(this.f16020f0);
            }
            this.f16032n.setSurface(this.f16015d);
            Uri uriE = F0() ? this.f16038t.E() : null;
            if (uriE == null) {
                setLoadingViewVisibility(true);
                this.f16032n.setDataSource(this.f16038t.M().q().l0());
            } else {
                setLoadingViewVisibility(false);
                this.f16032n.setDataSource(getContext(), uriE);
            }
            this.f16032n.prepareAsync();
        } catch (Exception e10) {
            h7.e.c(this.f16009a, e10);
            W(c7.b.j("Exception during preparing MediaPlayer", e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(h7.m mVar, h7.g gVar, c7.b bVar) {
        t(mVar, gVar, bVar);
        if (mVar == null || gVar == null) {
            return;
        }
        mVar.e(this, gVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0() {
        View view = this.f16033o;
        if (view != null) {
            g7.y.u(view);
            this.f16033o = null;
        }
    }

    private void S(boolean z10) {
        h7.m mVar;
        if (!C0() || this.I) {
            return;
        }
        this.I = true;
        this.f16039u.f16062j = true;
        int i10 = getResources().getConfiguration().orientation;
        int i11 = this.B;
        if (i10 != i11 && (mVar = this.f16040v) != null) {
            mVar.a(this, this.f16038t, i11);
        }
        g7.r rVar = this.f16030l;
        if (rVar != null) {
            rVar.l();
        }
        g7.q qVar = this.f16027j;
        if (qVar != null) {
            qVar.l();
        }
        g7.s sVar = this.f16025i;
        if (sVar != null) {
            sVar.l();
        }
        l();
        if (this.f16039u.f16066n) {
            if (this.f16036r == null) {
                this.f16036r = j(getContext());
            }
            this.f16036r.setImageBitmap(this.f16011b.getBitmap());
            addView(this.f16036r, new FrameLayout.LayoutParams(-1, -1));
            this.f16017e.bringToFront();
            return;
        }
        D(z10);
        if (this.f16035q == null) {
            setCloseControlsVisible(true);
            if (this.f16036r != null) {
                this.f16044z = new a0(getContext(), this.f16038t.E(), this.f16038t.M().q().l0(), new WeakReference(this.f16036r));
            }
            addView(this.f16036r, new FrameLayout.LayoutParams(-1, -1));
        } else {
            setCloseControlsVisible(false);
            this.f16013c.setVisibility(8);
            Q0();
            g7.l lVar = this.f16031m;
            if (lVar != null) {
                lVar.o(8);
            }
            io.bidmachine.iab.mraid.y yVar = this.f16037s;
            if (yVar == null) {
                setLoadingViewVisibility(false);
                M(c7.b.f("CompanionInterstitial is null"));
            } else if (yVar.s()) {
                setLoadingViewVisibility(false);
                this.f16037s.z(this, false);
            } else {
                setLoadingViewVisibility(true);
            }
        }
        b1();
        this.f16017e.bringToFront();
        N(h7.a.creativeView);
    }

    private void S0() {
        if (this.f16036r != null) {
            L();
            removeView(this.f16036r);
            this.f16036r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        if (C0()) {
            c cVar = this.f16039u;
            cVar.f16062j = false;
            cVar.f16056d = 0;
            J0();
            x0(this.f16038t.M().i());
            a1("restartPlayback");
        }
    }

    private void V() {
        removeCallbacks(this.R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(c7.b bVar) {
        h7.e.b(this.f16009a, "handlePlaybackError - %s", bVar);
        this.K = true;
        s(h7.j.f15704l);
        t(this.f16040v, this.f16038t, bVar);
        H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        c cVar = this.f16039u;
        if (!cVar.f16065m) {
            if (D0()) {
                this.f16032n.start();
                this.f16032n.pause();
                setLoadingViewVisibility(false);
                return;
            } else {
                if (this.f16039u.f16062j) {
                    return;
                }
                a1("resumePlayback (canAutoResume: false)");
                return;
            }
        }
        if (cVar.f16059g && this.E) {
            h7.e.a(this.f16009a, "resumePlayback", new Object[0]);
            this.f16039u.f16059g = false;
            if (!D0()) {
                if (this.f16039u.f16062j) {
                    return;
                }
                a1("resumePlayback");
                return;
            }
            this.f16032n.start();
            m1();
            e1();
            setLoadingViewVisibility(false);
            X(h7.a.resume);
            h7.f fVar = this.f16041w;
            if (fVar != null) {
                fVar.f0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(h7.a aVar) {
        h7.e.a(this.f16009a, "Track Event: %s", aVar);
        h7.g gVar = this.f16038t;
        j7.b bVarM = gVar != null ? gVar.M() : null;
        if (bVarM != null) {
            C(bVarM.r(), aVar);
        }
    }

    private void Y(h7.c cVar) {
        if (cVar == null || !cVar.p()) {
            return;
        }
        this.P.clear();
    }

    private void Y0() {
        S(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        setMute(!this.f16039u.f16058f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        int i10;
        int i11 = this.C;
        if (i11 == 0 || (i10 = this.D) == 0) {
            h7.e.a(this.f16009a, "configureVideoSurface - skip: videoWidth or videoHeight is 0", new Object[0]);
        } else {
            this.f16011b.a(i11, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((g7.o) it.next()).q();
        }
    }

    private void d0(h7.c cVar) {
        if (cVar == null || cVar.z().e0().booleanValue()) {
            if (this.f16029k == null) {
                this.f16029k = new g7.p(null);
            }
            this.f16029k.g(getContext(), this, k(cVar, cVar != null ? cVar.z() : null));
        } else {
            g7.p pVar = this.f16029k;
            if (pVar != null) {
                pVar.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        h1();
        V();
        this.R.run();
    }

    private int getAvailableHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getAvailableWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h1() {
        this.U.clear();
        this.V = 0;
        this.W = 0.0f;
    }

    private View i(Context context, l7.g gVar) {
        float fA0;
        float fW0;
        boolean zM = g7.y.m(context);
        if (gVar.A0() > 0) {
            fA0 = gVar.A0();
        } else {
            fA0 = zM ? 728.0f : 320.0f;
        }
        int iH = g7.y.h(context, fA0);
        if (gVar.w0() > 0) {
            fW0 = gVar.w0();
        } else {
            fW0 = zM ? 90.0f : 50.0f;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iH, g7.y.h(context, fW0));
        WebView webView = new WebView(context);
        webView.setId(g0.e());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollContainer(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setScrollBarStyle(33554432);
        webView.setFocusableInTouchMode(false);
        webView.setBackgroundColor(0);
        webView.setOnTouchListener(this.f16024h0);
        webView.setWebViewClient(this.f16028j0);
        webView.setWebChromeClient(this.f16026i0);
        String strX0 = gVar.x0();
        if (strX0 != null) {
            webView.loadDataWithBaseURL("", strX0, "text/html", "utf-8", null);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(g0.e());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        h7.g gVar;
        h7.e.b(this.f16009a, "handleClose", new Object[0]);
        X(h7.a.close);
        h7.m mVar = this.f16040v;
        if (mVar == null || (gVar = this.f16038t) == null) {
            return;
        }
        mVar.e(this, gVar, A0());
    }

    private void i1() {
        boolean z10;
        boolean z11;
        if (this.L) {
            z10 = true;
            if (E0() || this.I) {
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        } else {
            z11 = false;
            z10 = false;
        }
        g7.j jVar = this.f16021g;
        if (jVar != null) {
            jVar.o(z10 ? 0 : 8);
        }
        g7.k kVar = this.f16023h;
        if (kVar != null) {
            kVar.o(z11 ? 0 : 8);
        }
    }

    private ImageView j(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }

    private void j0(h7.c cVar) {
        if (cVar != null && !cVar.e().e0().booleanValue()) {
            g7.q qVar = this.f16027j;
            if (qVar != null) {
                qVar.l();
                return;
            }
            return;
        }
        if (this.f16027j == null) {
            g7.q qVar2 = new g7.q(new x());
            this.f16027j = qVar2;
            this.P.add(qVar2);
        }
        this.f16027j.g(getContext(), this.f16017e, k(cVar, cVar != null ? cVar.e() : null));
    }

    private g7.n k(h7.c cVar, g7.n nVar) {
        if (cVar == null) {
            return null;
        }
        if (nVar == null) {
            g7.n nVar2 = new g7.n();
            nVar2.w0(cVar.n());
            nVar2.k0(cVar.c());
            return nVar2;
        }
        if (!nVar.a0()) {
            nVar.w0(cVar.n());
        }
        if (!nVar.Y()) {
            nVar.k0(cVar.c());
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1() {
        g7.q qVar;
        if (!D0() || (qVar = this.f16027j) == null) {
            return;
        }
        qVar.t(this.f16039u.f16058f);
        if (this.f16039u.f16058f) {
            this.f16032n.setVolume(0.0f, 0.0f);
            h7.f fVar = this.f16041w;
            if (fVar != null) {
                fVar.y(0.0f);
                return;
            }
            return;
        }
        this.f16032n.setVolume(1.0f, 1.0f);
        h7.f fVar2 = this.f16041w;
        if (fVar2 != null) {
            fVar2.y(1.0f);
        }
    }

    private void l() {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ((g7.o) it.next()).k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(c7.b bVar) {
        h7.e.b(this.f16009a, "handleCompanionExpired - %s", bVar);
        s(h7.j.f15705m);
        if (this.f16035q != null) {
            J0();
            D(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        h7.g gVar;
        h7.e.b(this.f16009a, "handleCompanionClose", new Object[0]);
        N(h7.a.close);
        h7.m mVar = this.f16040v;
        if (mVar == null || (gVar = this.f16038t) == null) {
            return;
        }
        mVar.e(this, gVar, A0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m1() {
        if (C0()) {
            c1();
        }
    }

    private void n(h7.a aVar) {
        h7.e.a(this.f16009a, "Track Banner Event: %s", aVar);
        l7.g gVar = this.f16034p;
        if (gVar != null) {
            C(gVar.z0(), aVar);
        }
    }

    private void n0(h7.c cVar) {
        this.f16019f.setCountDownStyle(k(cVar, cVar != null ? cVar.x() : null));
        if (B0()) {
            this.f16019f.setCloseStyle(k(cVar, cVar != null ? cVar.b() : null));
            this.f16019f.setCloseClickListener(new u());
        }
        d0(cVar);
    }

    private void o(h7.c cVar) {
        if (cVar != null && !cVar.b().e0().booleanValue()) {
            g7.j jVar = this.f16021g;
            if (jVar != null) {
                jVar.l();
                return;
            }
            return;
        }
        if (this.f16021g == null) {
            g7.j jVar2 = new g7.j(new w());
            this.f16021g = jVar2;
            this.P.add(jVar2);
        }
        this.f16021g.g(getContext(), this.f16017e, k(cVar, cVar != null ? cVar.b() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        if (!this.E || !h7.d.e(getContext())) {
            L0();
            return;
        }
        if (this.F) {
            this.F = false;
            a1("onWindowFocusChanged");
        } else if (this.f16039u.f16062j) {
            setLoadingViewVisibility(false);
        } else {
            W0();
        }
    }

    private void p(h7.c cVar, boolean z10) {
        if (z10 || !(cVar == null || cVar.s().e0().booleanValue())) {
            g7.l lVar = this.f16031m;
            if (lVar != null) {
                lVar.l();
                return;
            }
            return;
        }
        if (this.f16031m == null) {
            g7.l lVar2 = new g7.l(new v());
            this.f16031m = lVar2;
            this.P.add(lVar2);
        }
        this.f16031m.g(getContext(), this.f16017e, k(cVar, cVar != null ? cVar.s() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        h7.e.a(this.f16009a, "handleComplete", new Object[0]);
        c cVar = this.f16039u;
        cVar.f16061i = true;
        if (!this.K && !cVar.f16060h) {
            cVar.f16060h = true;
            h7.f fVar = this.f16041w;
            if (fVar != null) {
                fVar.onVideoCompleted();
            }
            h7.m mVar = this.f16040v;
            if (mVar != null) {
                mVar.b(this, this.f16038t);
            }
            h7.g gVar = this.f16038t;
            if (gVar != null && gVar.S() && !this.f16039u.f16064l) {
                y0();
            }
            X(h7.a.complete);
        }
        if (this.f16039u.f16060h) {
            H0();
        }
    }

    private void q(h7.g gVar, j7.b bVar, c7.a aVar, boolean z10) {
        gVar.Z(new t(z10, aVar));
        n0(bVar.i());
        setPlaceholderViewVisible(true);
        setLoadingViewVisibility(true);
    }

    private void q0(h7.c cVar) {
        if (cVar != null && !cVar.B().e0().booleanValue()) {
            g7.r rVar = this.f16030l;
            if (rVar != null) {
                rVar.l();
                return;
            }
            return;
        }
        if (this.f16030l == null) {
            g7.r rVar2 = new g7.r(null);
            this.f16030l = rVar2;
            this.P.add(rVar2);
        }
        this.f16030l.g(getContext(), this.f16017e, k(cVar, cVar != null ? cVar.B() : null));
        this.f16030l.r(0.0f, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(h7.g gVar, j7.b bVar, boolean z10) {
        l7.e eVarI = bVar.i();
        this.A = gVar.K();
        if (eVarI == null || !eVarI.s().e0().booleanValue()) {
            this.f16034p = null;
        } else {
            this.f16034p = eVarI.t0();
        }
        if (this.f16034p == null) {
            this.f16034p = bVar.j(getContext());
        }
        x0(eVarI);
        p(eVarI, this.f16033o != null);
        o(eVarI);
        O(eVarI);
        j0(eVarI);
        u0(eVarI);
        q0(eVarI);
        d0(eVarI);
        Y(eVarI);
        setLoadingViewVisibility(false);
        e7.c cVar = this.f16042x;
        if (cVar != null) {
            cVar.A(this);
            this.f16042x.P(this.f16011b);
        }
        h7.m mVar = this.f16040v;
        if (mVar != null) {
            mVar.a(this, gVar, this.f16039u.f16062j ? this.B : this.A);
        }
        if (!z10) {
            this.f16039u.f16053a = gVar.H();
            c cVar2 = this.f16039u;
            cVar2.f16065m = this.M;
            cVar2.f16066n = this.N;
            if (eVarI != null) {
                cVar2.f16058f = eVarI.u0();
            }
            this.f16039u.f16054b = gVar.G();
            e7.c cVar3 = this.f16042x;
            if (cVar3 != null) {
                cVar3.M(this.f16011b);
                this.f16042x.j();
            }
            h7.m mVar2 = this.f16040v;
            if (mVar2 != null) {
                mVar2.c(this, gVar);
            }
        }
        setCloseControlsVisible(E(gVar));
        a1("load (restoring: " + z10 + ")");
    }

    private void s(h7.j jVar) {
        h7.g gVar = this.f16038t;
        if (gVar != null) {
            gVar.X(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseControlsVisible(boolean z10) {
        this.L = z10;
        i1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadingViewVisibility(boolean z10) {
        g7.p pVar = this.f16029k;
        if (pVar == null) {
            return;
        }
        if (!z10) {
            pVar.o(8);
        } else {
            pVar.o(0);
            this.f16029k.i();
        }
    }

    private void setMute(boolean z10) {
        this.f16039u.f16058f = z10;
        k1();
        X(this.f16039u.f16058f ? h7.a.mute : h7.a.unmute);
    }

    private void setPlaceholderViewVisible(boolean z10) {
        n7.a aVar = this.f16019f;
        h7.g gVar = this.f16038t;
        aVar.n(z10, gVar != null ? gVar.J() : 3.0f);
    }

    private void t(h7.m mVar, h7.g gVar, c7.b bVar) {
        if (mVar == null || gVar == null) {
            return;
        }
        mVar.d(this, gVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        h7.e.a(this.f16009a, "handleImpressions", new Object[0]);
        h7.g gVar = this.f16038t;
        if (gVar != null) {
            this.f16039u.f16063k = true;
            B(gVar.M().p());
        }
    }

    private void u0(h7.c cVar) {
        if (cVar == null || !cVar.k().e0().booleanValue()) {
            g7.s sVar = this.f16025i;
            if (sVar != null) {
                sVar.l();
                return;
            }
            return;
        }
        if (this.f16025i == null) {
            g7.s sVar2 = new g7.s(new y());
            this.f16025i = sVar2;
            this.P.add(sVar2);
        }
        this.f16025i.g(getContext(), this.f16017e, k(cVar, cVar.k()));
    }

    private void x0(h7.c cVar) {
        g7.n nVarG;
        g7.n nVarG2 = cVar != null ? g7.a.f15405q.g(cVar.g()) : g7.a.f15405q;
        if (cVar == null || !cVar.p()) {
            this.f16013c.setOnClickListener(null);
            this.f16013c.setClickable(false);
        } else {
            this.f16013c.setOnClickListener(new z());
        }
        this.f16013c.setBackgroundColor(nVarG2.k().intValue());
        Q0();
        if (this.f16034p == null || this.f16039u.f16062j) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f16013c.setLayoutParams(layoutParams);
            return;
        }
        this.f16033o = i(getContext(), this.f16034p);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f16033o.getLayoutParams());
        if ("inline".equals(nVarG2.K())) {
            nVarG = g7.a.f15400l;
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams2.addRule(15);
                layoutParams3.height = -1;
                layoutParams3.addRule(10);
                layoutParams3.addRule(12);
                if (nVarG2.t().intValue() == 3) {
                    layoutParams2.addRule(9);
                    layoutParams2.addRule(0, this.f16033o.getId());
                    layoutParams3.addRule(11);
                } else {
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(1, this.f16033o.getId());
                    layoutParams3.addRule(9);
                }
            } else {
                layoutParams2.addRule(14);
                layoutParams3.width = -1;
                layoutParams3.addRule(9);
                layoutParams3.addRule(11);
                if (nVarG2.N().intValue() == 48) {
                    layoutParams2.addRule(10);
                    layoutParams2.addRule(2, this.f16033o.getId());
                    layoutParams3.addRule(12);
                } else {
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(3, this.f16033o.getId());
                    layoutParams3.addRule(10);
                }
            }
        } else {
            g7.n nVar = g7.a.f15399k;
            layoutParams2.addRule(13);
            nVarG = nVar;
        }
        if (cVar != null) {
            nVarG = nVarG.g(cVar.s());
        }
        nVarG.e(getContext(), this.f16033o);
        nVarG.c(getContext(), layoutParams3);
        nVarG.f(layoutParams3);
        this.f16033o.setBackgroundColor(nVarG.k().intValue());
        nVarG2.e(getContext(), this.f16013c);
        nVarG2.c(getContext(), layoutParams2);
        this.f16013c.setLayoutParams(layoutParams2);
        addView(this.f16033o, layoutParams3);
        n(h7.a.creativeView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y0() {
        h7.e.b(this.f16009a, "handleInfoClicked", new Object[0]);
        h7.g gVar = this.f16038t;
        if (gVar != null) {
            return I(gVar.M().l(), this.f16038t.M().k());
        }
        return false;
    }

    public boolean A0() {
        h7.g gVar = this.f16038t;
        return gVar != null && ((gVar.D() == 0.0f && this.f16039u.f16060h) || (this.f16038t.D() > 0.0f && this.f16039u.f16062j));
    }

    public boolean B0() {
        return this.f16039u.f16057e;
    }

    public boolean C0() {
        h7.g gVar = this.f16038t;
        return (gVar == null || gVar.M() == null) ? false : true;
    }

    public boolean D0() {
        return this.f16032n != null && this.J;
    }

    public boolean E0() {
        c cVar = this.f16039u;
        return cVar.f16061i || cVar.f16054b == 0.0f;
    }

    public boolean F0() {
        h7.g gVar = this.f16038t;
        return gVar != null && gVar.v();
    }

    public void a1(String str) {
        h7.e.a(this.f16009a, "startPlayback: %s", str);
        if (C0()) {
            setPlaceholderViewVisible(false);
            if (this.f16039u.f16062j) {
                Y0();
                return;
            }
            if (!this.E) {
                this.F = true;
                return;
            }
            if (this.G) {
                b1();
                J0();
                c0();
                O0();
                h7.d.d(this, this.f16022g0);
            } else {
                this.H = true;
            }
            if (this.f16013c.getVisibility() != 0) {
                this.f16013c.setVisibility(0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        super.addView(view);
        this.f16017e.bringToFront();
    }

    public void b1() {
        this.f16039u.f16059g = false;
        if (this.f16032n != null) {
            h7.e.a(this.f16009a, "stopPlayback", new Object[0]);
            try {
                if (this.f16032n.isPlaying()) {
                    this.f16032n.stop();
                }
                this.f16032n.setSurface(null);
                this.f16032n.release();
            } catch (Exception e10) {
                h7.e.c(this.f16009a, e10);
            }
            this.f16032n = null;
            this.J = false;
            this.K = false;
            V();
            h7.d.f(this);
        }
    }

    public void f0() {
        io.bidmachine.iab.mraid.y yVar = this.f16037s;
        if (yVar != null) {
            yVar.o();
            this.f16037s = null;
            this.f16035q = null;
        }
        this.f16040v = null;
        this.f16041w = null;
        this.f16042x = null;
        this.f16043y = null;
        d0 d0Var = this.f16044z;
        if (d0Var != null) {
            d0Var.c();
            this.f16044z = null;
        }
    }

    public boolean g0(h7.g gVar, Boolean bool) {
        return F(gVar, bool, false);
    }

    public h7.m getListener() {
        return this.f16040v;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.E) {
            a1("onAttachedToWindow");
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (C0()) {
            x0(this.f16038t.M().i());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b1();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0246a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0246a c0246a = (C0246a) parcelable;
        super.onRestoreInstanceState(c0246a.getSuperState());
        c cVar = c0246a.f16045a;
        if (cVar != null) {
            this.f16039u = cVar;
        }
        h7.g gVarA = h7.i.a(this.f16039u.f16053a);
        if (gVarA != null) {
            F(gVarA, null, true);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (D0()) {
            this.f16039u.f16056d = this.f16032n.getCurrentPosition();
        }
        C0246a c0246a = new C0246a(super.onSaveInstanceState());
        c0246a.f16045a = this.f16039u;
        return c0246a;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        removeCallbacks(this.Q);
        post(this.Q);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        h7.e.a(this.f16009a, "onWindowFocusChanged: %s", Boolean.valueOf(z10));
        this.E = z10;
        o1();
    }

    public void setAdMeasurer(e7.c cVar) {
        this.f16042x = cVar;
    }

    public void setCanAutoResume(boolean z10) {
        this.M = z10;
        this.f16039u.f16065m = z10;
    }

    public void setCanIgnorePostBanner(boolean z10) {
        this.N = z10;
        this.f16039u.f16066n = z10;
    }

    public void setListener(h7.m mVar) {
        this.f16040v = mVar;
    }

    public void setPlaybackListener(h7.f fVar) {
        this.f16041w = fVar;
    }

    public void setPostBannerAdMeasurer(e7.b bVar) {
        this.f16043y = bVar != null ? new d(this, bVar) : null;
    }

    public void v0() {
        if (this.f16019f.m() && this.f16019f.k()) {
            P(this.f16040v, this.f16038t, c7.b.i("OnBackPress event fired"));
            return;
        }
        if (E0()) {
            if (!z0()) {
                N0();
                return;
            }
            h7.g gVar = this.f16038t;
            if (gVar == null || gVar.O() != h7.n.NonRewarded) {
                return;
            }
            if (this.f16035q == null) {
                i0();
                return;
            }
            io.bidmachine.iab.mraid.y yVar = this.f16037s;
            if (yVar != null) {
                yVar.p();
            } else {
                m0();
            }
        }
    }

    public boolean z0() {
        return this.f16039u.f16062j;
    }

    /* JADX INFO: renamed from: i7.a$a, reason: collision with other inner class name */
    static class C0246a extends View.BaseSavedState {
        public static final Parcelable.Creator<C0246a> CREATOR = new C0247a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f16045a;

        /* JADX INFO: renamed from: i7.a$a$a, reason: collision with other inner class name */
        class C0247a implements Parcelable.Creator {
            C0247a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0246a createFromParcel(Parcel parcel) {
                return new C0246a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0246a[] newArray(int i10) {
                return new C0246a[i10];
            }
        }

        C0246a(Parcel parcel) {
            super(parcel);
            this.f16045a = (c) parcel.readParcelable(c.class.getClassLoader());
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f16045a, 0);
        }

        C0246a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    class s extends WebViewClient {
        s() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            webView.setBackgroundColor(0);
            webView.setLayerType(1, null);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            a.this.Q0();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.hasGesture()) {
                a.this.O.add(webView);
            }
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!a.this.O.contains(webView)) {
                return true;
            }
            h7.e.a(a.this.f16009a, "banner clicked", new Object[0]);
            a aVar = a.this;
            aVar.J(aVar.f16034p, str);
            return true;
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16009a = "VastView-" + Integer.toHexString(hashCode());
        this.f16039u = new c();
        this.A = 0;
        this.B = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = false;
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new e();
        this.R = new f();
        this.S = new g();
        this.T = new h();
        this.U = new LinkedList();
        this.V = 0;
        this.W = 0.0f;
        this.f16010a0 = new i();
        j jVar = new j();
        this.f16012b0 = jVar;
        this.f16014c0 = new k();
        this.f16016d0 = new l();
        this.f16018e0 = new m();
        this.f16020f0 = new n();
        this.f16022g0 = new p();
        this.f16024h0 = new q();
        this.f16026i0 = new r();
        this.f16028j0 = new s();
        setBackgroundColor(-16777216);
        setOnClickListener(new o());
        m7.c cVar = new m7.c(context);
        this.f16011b = cVar;
        cVar.setSurfaceTextureListener(jVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16013c = frameLayout;
        frameLayout.addView(this.f16011b, new FrameLayout.LayoutParams(-1, -1, 17));
        addView(this.f16013c, new RelativeLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f16017e = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        addView(this.f16017e, new ViewGroup.LayoutParams(-1, -1));
        n7.a aVar = new n7.a(getContext());
        this.f16019f = aVar;
        aVar.setBackgroundColor(0);
        addView(this.f16019f, new ViewGroup.LayoutParams(-1, -1));
    }

    static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new C0249a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f16053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f16054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f16055c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16056d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f16057e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f16058f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f16059g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f16060h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f16061i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f16062j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f16063k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f16064l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f16065m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f16066n;

        /* JADX INFO: renamed from: i7.a$c$a, reason: collision with other inner class name */
        class C0249a implements Parcelable.Creator {
            C0249a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        c() {
            this.f16053a = null;
            this.f16054b = 5.0f;
            this.f16055c = 0;
            this.f16056d = 0;
            this.f16057e = true;
            this.f16058f = false;
            this.f16059g = false;
            this.f16060h = false;
            this.f16061i = false;
            this.f16062j = false;
            this.f16063k = false;
            this.f16064l = false;
            this.f16065m = true;
            this.f16066n = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f16053a);
            parcel.writeFloat(this.f16054b);
            parcel.writeInt(this.f16055c);
            parcel.writeInt(this.f16056d);
            parcel.writeByte(this.f16057e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16058f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16059g ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16060h ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16061i ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16062j ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16063k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16064l ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16065m ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f16066n ? (byte) 1 : (byte) 0);
        }

        c(Parcel parcel) {
            this.f16053a = null;
            this.f16054b = 5.0f;
            this.f16055c = 0;
            this.f16056d = 0;
            this.f16057e = true;
            this.f16058f = false;
            this.f16059g = false;
            this.f16060h = false;
            this.f16061i = false;
            this.f16062j = false;
            this.f16063k = false;
            this.f16064l = false;
            this.f16065m = true;
            this.f16066n = false;
            this.f16053a = parcel.readString();
            this.f16054b = parcel.readFloat();
            this.f16055c = parcel.readInt();
            this.f16056d = parcel.readInt();
            this.f16057e = parcel.readByte() != 0;
            this.f16058f = parcel.readByte() != 0;
            this.f16059g = parcel.readByte() != 0;
            this.f16060h = parcel.readByte() != 0;
            this.f16061i = parcel.readByte() != 0;
            this.f16062j = parcel.readByte() != 0;
            this.f16063k = parcel.readByte() != 0;
            this.f16064l = parcel.readByte() != 0;
            this.f16065m = parcel.readByte() != 0;
            this.f16066n = parcel.readByte() != 0;
        }
    }

    class u implements n7.a.InterfaceC0378a {
        u() {
        }

        @Override // n7.a.InterfaceC0378a
        public void d() {
            a aVar = a.this;
            aVar.P(aVar.f16040v, a.this.f16038t, c7.b.i("Close button clicked"));
        }

        @Override // n7.a.InterfaceC0378a
        public void a() {
        }
    }

    class j implements TextureView.SurfaceTextureListener {
        j() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            h7.e.a(a.this.f16009a, "onSurfaceTextureAvailable", new Object[0]);
            a.this.f16015d = new Surface(surfaceTexture);
            a.this.G = true;
            if (a.this.H) {
                a.this.H = false;
                a.this.a1("onSurfaceTextureAvailable");
            } else if (a.this.D0()) {
                a aVar = a.this;
                aVar.f16032n.setSurface(aVar.f16015d);
                a.this.W0();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            h7.e.a(a.this.f16009a, "onSurfaceTextureDestroyed", new Object[0]);
            a aVar = a.this;
            aVar.f16015d = null;
            aVar.G = false;
            if (a.this.D0()) {
                a.this.f16032n.setSurface(null);
                a.this.L0();
            }
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            h7.e.a(a.this.f16009a, "onSurfaceTextureSizeChanged: %d/%d", Integer.valueOf(i10), Integer.valueOf(i11));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}

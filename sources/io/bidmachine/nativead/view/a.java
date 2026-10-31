package io.bidmachine.nativead.view;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import c0.IbU.elEbP;
import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import h7.g;
import ha.h;
import ha.i;
import ha.j;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import ka.p;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import rd.f0;
import wb.d0;
import wb.y;
import wc.k;
import wc.m;

/* JADX INFO: compiled from: MediaView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener, VideoPlayerActivity.c {
    public static final C0332a C = new C0332a(null);
    public static VideoPlayerActivity.c D;
    private p A;
    private final k B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f20338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f20339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f20340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f20342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ProgressBar f20343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f20344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m7.a f20345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaPlayer f20346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextureView f20347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Timer f20348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile boolean f20357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f20359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f20360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f20361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20362y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f20363z;

    /* JADX INFO: renamed from: io.bidmachine.nativead.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MediaView.kt */
    public static final class C0332a {
        private C0332a() {
        }

        public /* synthetic */ C0332a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: MediaView.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.Playing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Paused.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: MediaView.kt */
    public static final class c implements ia.c.a {
        c() {
        }

        @Override // ia.c.a
        public void a(ia.c task) {
            t.f(task, "task");
            io.bidmachine.core.a.c("MediaView video is not loaded");
            a.this.c0(p.Image);
            a.this.f20356s = false;
        }

        @Override // ia.c.a
        public void b(ia.c task, Uri videoFileUri) {
            t.f(task, "task");
            t.f(videoFileUri, "videoFileUri");
            io.bidmachine.core.a.c("MediaView video is loaded");
            j nativeMediaData = a.this.getNativeMediaData();
            if (nativeMediaData != null) {
                nativeMediaData.n(videoFileUri);
            }
            a.this.R();
        }
    }

    /* JADX INFO: compiled from: MediaView.kt */
    public static final class d implements ia.b.a {
        d() {
        }

        @Override // ia.b.a
        public void a(ia.b task, Uri videoFileUri, g vastRequest) {
            t.f(task, "task");
            t.f(videoFileUri, "videoFileUri");
            t.f(vastRequest, "vastRequest");
            io.bidmachine.core.a.c("MediaView video is loaded");
            j nativeMediaData = a.this.getNativeMediaData();
            if (nativeMediaData != null) {
                nativeMediaData.n(videoFileUri);
            }
            j nativeMediaData2 = a.this.getNativeMediaData();
            if (nativeMediaData2 != null) {
                nativeMediaData2.a(vastRequest);
            }
            a.this.R();
        }

        @Override // ia.b.a
        public void b(ia.b task) {
            t.f(task, "task");
            io.bidmachine.core.a.c("MediaView video is not loaded");
            a.this.c0(p.Image);
            a.this.f20356s = false;
        }
    }

    /* JADX INFO: compiled from: MediaView.kt */
    static final class e extends u implements id.a<la.g> {
        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final la.g invoke() {
            la.f fVar = la.f.f21923a;
            Context context = a.this.getContext();
            t.e(context, elEbP.qqSqAEfmQ);
            return fVar.a(o7.d.b(context));
        }
    }

    /* JADX INFO: compiled from: MediaView.kt */
    public static final class f extends TimerTask {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(a this$0) {
            t.f(this$0, "this$0");
            this$0.Q();
            if (this$0.f20358u) {
                this$0.Y();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String i(int i10) {
            return "Video started: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j(int i10) {
            return "Video at first quartile: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String k(int i10) {
            return "Video at midpoint: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l(int i10) {
            return "Video at third quartile: " + i10 + '%';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(a this$0) {
            t.f(this$0, "this$0");
            this$0.Z();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            final int currentPosition;
            try {
                if (a.this.f20357t) {
                    a.this.z();
                    return;
                }
                if (!a.this.L()) {
                    final a aVar = a.this;
                    io.bidmachine.core.h.S(new Runnable() { // from class: ka.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            io.bidmachine.nativead.view.a.f.h(aVar);
                        }
                    });
                    return;
                }
                try {
                    MediaPlayer mediaPlayer = a.this.f20346i;
                    if (mediaPlayer != null && a.this.M() && !a.this.f20357t && mediaPlayer.isPlaying()) {
                        if (a.this.f20359v == 0) {
                            a.this.f20359v = mediaPlayer.getDuration();
                        }
                        if (a.this.f20359v != 0 && (currentPosition = (mediaPlayer.getCurrentPosition() * 100) / a.this.f20359v) >= a.this.f20360w * 25) {
                            if (a.this.f20360w == 0) {
                                io.bidmachine.core.a.d(new qc.b() { // from class: ka.h
                                    @Override // qc.b
                                    public final Object get() {
                                        return io.bidmachine.nativead.view.a.f.i(currentPosition);
                                    }
                                });
                                a.this.T(h7.a.start);
                            } else if (a.this.f20360w == 1) {
                                io.bidmachine.core.a.d(new qc.b() { // from class: ka.i
                                    @Override // qc.b
                                    public final Object get() {
                                        return io.bidmachine.nativead.view.a.f.j(currentPosition);
                                    }
                                });
                                a.this.T(h7.a.firstQuartile);
                            } else if (a.this.f20360w == 2) {
                                io.bidmachine.core.a.d(new qc.b() { // from class: ka.j
                                    @Override // qc.b
                                    public final Object get() {
                                        return io.bidmachine.nativead.view.a.f.k(currentPosition);
                                    }
                                });
                                a.this.T(h7.a.midpoint);
                            } else if (a.this.f20360w == 3) {
                                io.bidmachine.core.a.d(new qc.b() { // from class: ka.k
                                    @Override // qc.b
                                    public final Object get() {
                                        return io.bidmachine.nativead.view.a.f.l(currentPosition);
                                    }
                                });
                                a.this.T(h7.a.thirdQuartile);
                            }
                            a.this.f20360w++;
                        }
                    }
                    io.bidmachine.core.a.c("MediaView is on screen");
                    final a aVar2 = a.this;
                    io.bidmachine.core.h.S(new Runnable() { // from class: ka.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            io.bidmachine.nativead.view.a.f.m(aVar2);
                        }
                    });
                } catch (IllegalStateException unused) {
                    a.this.z();
                }
            } catch (Throwable unused2) {
                a.this.z();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 0, 0, 14, null);
        t.f(context, EFLCCdIRcb.kwotpF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(a this$0) {
        t.f(this$0, "this$0");
        try {
            this$0.f20355r = false;
            this$0.y();
            this$0.c0(p.Image);
            this$0.Y();
            this$0.f20357t = true;
            this$0.f20356s = false;
            this$0.S();
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
        }
    }

    private final void B() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        this.f20342e = imageView;
        addView(imageView);
    }

    private final MediaPlayer C() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnVideoSizeChangedListener(this);
        mediaPlayer.setAudioStreamType(3);
        this.f20346i = mediaPlayer;
        d0();
        return mediaPlayer;
    }

    private final void D() {
        Context context = getContext();
        float fX = io.bidmachine.core.h.x(context);
        int iA = kd.c.a(40 * fX);
        int iA2 = kd.c.a(8 * fX);
        m7.a aVar = new m7.a(context);
        aVar.h(g7.a.f15389a, g7.a.f15391c);
        aVar.setPadding(iA2, iA2, iA2, iA2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        aVar.setLayoutParams(layoutParams);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: ka.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.nativead.view.a.E(this.f21285a, view);
            }
        });
        this.f20345h = aVar;
        a0();
        addView(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(a this$0, View view) {
        t.f(this$0, "this$0");
        if (this$0.M()) {
            if (this$0.f20351n) {
                MediaPlayer mediaPlayer = this$0.f20346i;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(1.0f, 1.0f);
                }
                this$0.f20351n = false;
            } else {
                MediaPlayer mediaPlayer2 = this$0.f20346i;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                }
                this$0.f20351n = true;
            }
            this$0.a0();
        }
    }

    private final void F(Object obj) {
        Uri uriI;
        int iA = kd.c.a(50 * io.bidmachine.core.h.x(getContext()));
        String path = null;
        ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleLarge);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams);
        Integer numW = d0.w("#6b000000");
        if (numW != null) {
            progressBar.setBackgroundColor(numW.intValue());
        }
        progressBar.setVisibility(4);
        this.f20343f = progressBar;
        addView(progressBar);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.ic_media_play);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams2.addRule(13, -1);
        imageView.setLayoutParams(layoutParams2);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ka.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.nativead.view.a.G(this.f21282a, view);
            }
        });
        imageView.setVisibility(4);
        this.f20344g = imageView;
        addView(imageView);
        final TextureView textureView = new TextureView(getContext());
        textureView.setSurfaceTextureListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13);
        textureView.setLayoutParams(layoutParams3);
        textureView.setOnClickListener(new View.OnClickListener() { // from class: ka.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.nativead.view.a.H(this.f21283a, textureView, view);
            }
        });
        this.f20347j = textureView;
        addView(textureView);
        D();
        C();
        h hVar = this.f20338a;
        j jVar = this.f20339b;
        if (jVar != null && (uriI = jVar.i()) != null) {
            path = uriI.getPath();
        }
        boolean z10 = true;
        if (path != null && new File(path).exists()) {
            this.f20355r = true;
            return;
        }
        if (hVar != null) {
            c0(p.Loading);
            String strK = hVar.k();
            String strM = hVar.m();
            if (!(strK == null || f0.k0(strK))) {
                J(new ia.c(obj, getRepository(), new c(), strK, null, 16, null));
                return;
            }
            if (strM != null && !f0.k0(strM)) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            d dVar = new d();
            Context context = getContext();
            t.e(context, "context");
            J(new ia.b(context, obj, getRepository(), dVar, strM, null, 32, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(a this$0, View view) {
        t.f(this$0, "this$0");
        this$0.f20355r = true;
        this$0.Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(a this$0, TextureView this_apply, View view) {
        Uri uriI;
        String path;
        MediaPlayer mediaPlayer;
        t.f(this$0, "this$0");
        t.f(this_apply, "$this_apply");
        j jVar = this$0.f20339b;
        if (jVar == null || (uriI = jVar.i()) == null || (path = uriI.getPath()) == null || (mediaPlayer = this$0.f20346i) == null) {
            return;
        }
        io.bidmachine.core.a.c("Video has been clicked");
        D = this$0;
        this$0.f20358u = true;
        int currentPosition = (this$0.M() && mediaPlayer.isPlaying()) ? mediaPlayer.getCurrentPosition() : 0;
        this$0.Q();
        io.bidmachine.core.h.f0(this_apply.getContext(), VideoPlayerActivity.e(this_apply.getContext(), path, currentPosition));
    }

    private final void I(Object obj) {
        if (!this.f20341d) {
            this.f20341d = true;
            B();
            if (this.f20356s) {
                F(obj);
            } else {
                c0(p.Image);
            }
        }
        j jVar = this.f20339b;
        ImageView imageView = this.f20342e;
        if (jVar == null || imageView == null) {
            return;
        }
        ja.a.d(getContext(), imageView, jVar.e(), jVar.g());
    }

    private final void J(Runnable runnable) {
        ja.b.a().execute(runnable);
    }

    private final void K(List<String> list) {
        if (list == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            io.bidmachine.core.h.e0(it.next(), ja.b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L() {
        return getGlobalVisibleRect(new Rect()) && isShown() && hasWindowFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M() {
        return (this.f20357t || this.f20346i == null) ? false : true;
    }

    private final void N() {
        if (this.f20350m) {
            return;
        }
        T(h7.a.complete);
        this.f20350m = true;
        io.bidmachine.core.a.c("MediaView: video finished");
    }

    private final void O() {
        if (this.f20349l) {
            return;
        }
        U();
        this.f20349l = true;
        io.bidmachine.core.a.c("MediaView: video started");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q() {
        try {
            MediaPlayer mediaPlayer = this.f20346i;
            if (mediaPlayer == null) {
                return;
            }
            if (M() && mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
            if (this.A != p.Loading) {
                c0(p.Paused);
            }
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        Uri uriI;
        try {
            j jVar = this.f20339b;
            if (jVar == null || (uriI = jVar.i()) == null || this.f20352o || this.f20353p || this.f20357t) {
                return;
            }
            MediaPlayer mediaPlayer = this.f20346i;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), uriI);
                mediaPlayer.prepareAsync();
            }
            this.f20353p = true;
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
        }
    }

    private final void S() {
        g gVarF;
        j jVar = this.f20339b;
        if (jVar == null || (gVarF = jVar.f()) == null) {
            return;
        }
        gVarF.X(h7.j.f15704l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(h7.a aVar) {
        i iVar;
        g gVarF;
        j7.b bVarM;
        Map<h7.a, List<String>> mapR;
        j jVar = this.f20339b;
        if (jVar != null && (gVarF = jVar.f()) != null && (bVarM = gVarF.M()) != null && (mapR = bVarM.r()) != null) {
            K(mapR.get(aVar));
        }
        if (aVar != h7.a.complete || (iVar = this.f20340c) == null) {
            return;
        }
        iVar.l();
    }

    private final void U() {
        g gVarF;
        j7.b bVarM;
        List<String> listP;
        j jVar = this.f20339b;
        if (jVar == null || (gVarF = jVar.f()) == null || (bVarM = gVarF.M()) == null || (listP = bVarM.p()) == null) {
            return;
        }
        K(listP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(a this$0) {
        t.f(this$0, "this$0");
        this$0.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        try {
            MediaPlayer mediaPlayerC = this.f20346i;
            if (mediaPlayerC == null) {
                mediaPlayerC = C();
            }
            if (!this.f20352o) {
                R();
            }
            if (M() && this.f20352o && this.f20354q && L()) {
                if (!mediaPlayerC.isPlaying()) {
                    mediaPlayerC.start();
                    O();
                    if (this.f20348k == null) {
                        X();
                    }
                }
                if (mediaPlayerC.getCurrentPosition() > 0) {
                    p pVar = this.A;
                    p pVar2 = p.Playing;
                    if (pVar != pVar2) {
                        c0(pVar2);
                    }
                }
            }
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
            z();
        }
    }

    private final void a0() {
        if (this.f20351n) {
            m7.a aVar = this.f20345h;
            if (aVar != null) {
                aVar.setImage(g7.a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII="));
                return;
            }
            return;
        }
        m7.a aVar2 = this.f20345h;
        if (aVar2 != null) {
            aVar2.setImage(g7.a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg=="));
        }
    }

    private final void b0() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0 || !this.f20363z || this.f20361x == 0 || this.f20362y == 0) {
            return;
        }
        this.f20363z = false;
        TextureView textureView = this.f20347j;
        if (textureView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
        int i10 = this.f20361x;
        int i11 = this.f20362y;
        if (i10 > i11) {
            layoutParams.width = width;
            layoutParams.height = (width * i11) / i10;
        } else {
            layoutParams.width = (i10 * height) / i11;
            layoutParams.height = height;
        }
        textureView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(p pVar) {
        this.A = pVar;
        int i10 = b.$EnumSwitchMapping$0[pVar.ordinal()];
        if (i10 == 1) {
            ImageView imageView = this.f20342e;
            if (imageView != null) {
                imageView.setVisibility(0);
                imageView.bringToFront();
            }
            if (this.f20356s) {
                TextureView textureView = this.f20347j;
                if (textureView != null) {
                    textureView.setVisibility(4);
                }
                ProgressBar progressBar = this.f20343f;
                if (progressBar != null) {
                    progressBar.setVisibility(4);
                }
                ImageView imageView2 = this.f20344g;
                if (imageView2 != null) {
                    imageView2.setVisibility(4);
                }
                m7.a aVar = this.f20345h;
                if (aVar == null) {
                    return;
                }
                aVar.setVisibility(4);
                return;
            }
            return;
        }
        if (i10 == 2) {
            ImageView imageView3 = this.f20342e;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
                imageView3.bringToFront();
            }
            if (this.f20356s) {
                ProgressBar progressBar2 = this.f20343f;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
                ProgressBar progressBar3 = this.f20343f;
                if (progressBar3 != null) {
                    progressBar3.bringToFront();
                }
                TextureView textureView2 = this.f20347j;
                if (textureView2 != null) {
                    textureView2.setVisibility(4);
                }
                ImageView imageView4 = this.f20344g;
                if (imageView4 != null) {
                    imageView4.setVisibility(4);
                }
                m7.a aVar2 = this.f20345h;
                if (aVar2 == null) {
                    return;
                }
                aVar2.setVisibility(4);
                return;
            }
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            ImageView imageView5 = this.f20342e;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                imageView5.bringToFront();
            }
            if (this.f20356s) {
                ImageView imageView6 = this.f20344g;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                }
                ImageView imageView7 = this.f20344g;
                if (imageView7 != null) {
                    imageView7.bringToFront();
                }
                TextureView textureView3 = this.f20347j;
                if (textureView3 != null) {
                    textureView3.setVisibility(4);
                }
                ProgressBar progressBar4 = this.f20343f;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(4);
                }
                m7.a aVar3 = this.f20345h;
                if (aVar3 == null) {
                    return;
                }
                aVar3.setVisibility(4);
                return;
            }
            return;
        }
        ImageView imageView8 = this.f20342e;
        if (imageView8 != null) {
            imageView8.setVisibility(4);
        }
        if (this.f20356s) {
            TextureView textureView4 = this.f20347j;
            if (textureView4 != null) {
                textureView4.setVisibility(0);
            }
            TextureView textureView5 = this.f20347j;
            if (textureView5 != null) {
                textureView5.bringToFront();
            }
            m7.a aVar4 = this.f20345h;
            if (aVar4 != null) {
                aVar4.setVisibility(0);
            }
            m7.a aVar5 = this.f20345h;
            if (aVar5 != null) {
                aVar5.bringToFront();
            }
            a0();
            ProgressBar progressBar5 = this.f20343f;
            if (progressBar5 != null) {
                progressBar5.setVisibility(4);
            }
            ImageView imageView9 = this.f20344g;
            if (imageView9 == null) {
                return;
            }
            imageView9.setVisibility(4);
        }
    }

    private final void d0() {
        if (M()) {
            if (this.f20351n) {
                MediaPlayer mediaPlayer = this.f20346i;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                    return;
                }
                return;
            }
            MediaPlayer mediaPlayer2 = this.f20346i;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setVolume(1.0f, 1.0f);
            }
        }
    }

    private final void e0() {
        MediaPlayer mediaPlayer;
        N();
        Y();
        Q();
        if (M() && (mediaPlayer = this.f20346i) != null) {
            mediaPlayer.seekTo(0);
        }
        this.f20358u = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f0(int i10, boolean z10) {
        return "MediaView videoPlayerActivityClosed, position: " + i10 + ", finished: " + z10;
    }

    private final la.g getRepository() {
        return (la.g) this.B.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    private final void x(Object obj, h hVar, j jVar, i iVar) {
        this.f20338a = hVar;
        this.f20339b = jVar;
        this.f20340c = iVar;
        if (jVar.i() == null) {
            String strK = hVar.k();
            if (strK == null || f0.k0(strK)) {
                String strM = hVar.m();
                if (!(strM == null || f0.k0(strM))) {
                    this.f20356s = true;
                }
            } else {
                this.f20356s = true;
            }
        } else {
            this.f20356s = true;
        }
        I(obj);
    }

    private final void y() {
        MediaPlayer mediaPlayer = this.f20346i;
        if (mediaPlayer == null) {
            return;
        }
        this.f20346i = null;
        try {
            if (!this.f20357t) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.reset();
            }
            mediaPlayer.setOnCompletionListener(null);
            mediaPlayer.setOnErrorListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setOnVideoSizeChangedListener(null);
            mediaPlayer.release();
        } catch (Throwable th) {
            io.bidmachine.core.a.o(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        io.bidmachine.core.h.S(new Runnable() { // from class: ka.c
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.nativead.view.a.A(this.f21281a);
            }
        });
    }

    public final void P() {
        io.bidmachine.core.a.c("MediaView: onViewAppearOnScreen");
        this.f20354q = true;
        if (this.f20355r) {
            Z();
        } else if (this.A != p.Loading) {
            c0(p.Paused);
        }
    }

    public final void V() {
        new Thread(new Runnable() { // from class: ka.a
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.nativead.view.a.W(this.f21278a);
            }
        }).start();
    }

    public final void X() {
        if (this.f20356s) {
            Timer timer = new Timer();
            this.f20348k = timer;
            timer.schedule(new f(), 0L, 500);
        }
    }

    public final void Y() {
        Timer timer = this.f20348k;
        if (timer != null) {
            timer.cancel();
        }
        this.f20348k = null;
    }

    @Override // io.bidmachine.nativead.view.VideoPlayerActivity.c
    public void a(final int i10, final boolean z10) {
        MediaPlayer mediaPlayer;
        io.bidmachine.core.a.d(new qc.b() { // from class: ka.b
            @Override // qc.b
            public final Object get() {
                return io.bidmachine.nativead.view.a.f0(i10, z10);
            }
        });
        try {
            if (z10) {
                e0();
            } else if (M() && (mediaPlayer = this.f20346i) != null) {
                mediaPlayer.seekTo(i10);
            }
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
        }
        D = null;
    }

    public final h getNativeData() {
        return this.f20338a;
    }

    public final i getNativeInteractor() {
        return this.f20340c;
    }

    public final j getNativeMediaData() {
        return this.f20339b;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        e0();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        io.bidmachine.core.a.c("MediaView: onError");
        z();
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, measuredWidth);
        } else if (mode != 1073741824) {
            size = measuredWidth;
        }
        int i12 = (int) (size * 0.5625f);
        if (mode2 != 1073741824 || size2 >= i12) {
            size2 = i12;
        } else {
            size = (int) (size2 * 1.7777778f);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        io.bidmachine.core.a.c("MediaView: onPrepared");
        this.f20352o = true;
        if (this.f20355r) {
            Z();
        } else {
            c0(p.Paused);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        t.f(surfaceTexture, "surfaceTexture");
        try {
            MediaPlayer mediaPlayerC = this.f20346i;
            if (mediaPlayerC == null) {
                mediaPlayerC = C();
            }
            mediaPlayerC.setSurface(new Surface(surfaceTexture));
            R();
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
            c0(p.Image);
            this.f20356s = false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        t.f(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        t.f(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
        t.f(surface, "surface");
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        this.f20361x = i10;
        this.f20362y = i11;
        this.f20363z = true;
        b0();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        if (i10 != 0) {
            Q();
        } else if (this.f20355r) {
            Z();
        }
        super.onWindowVisibilityChanged(i10);
    }

    public final void setInitialized(boolean z10) {
        this.f20341d = z10;
    }

    public final void setNativeAdObject(ha.f nativeAdObject) {
        t.f(nativeAdObject, "nativeAdObject");
        y yVarG = nativeAdObject.G();
        t.e(yVarG, "nativeAdObject.tag");
        x(yVarG, nativeAdObject, nativeAdObject, nativeAdObject);
    }

    public final void setNativeData(h hVar) {
        this.f20338a = hVar;
    }

    public final void setNativeInteractor(i iVar) {
        this.f20340c = iVar;
    }

    public final void setNativeMediaData(j jVar) {
        this.f20339b = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        t.f(context, "context");
        this.f20351n = true;
        this.f20363z = true;
        this.A = p.Image;
        this.B = m.a(new e());
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, int i12, kotlin.jvm.internal.k kVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }
}

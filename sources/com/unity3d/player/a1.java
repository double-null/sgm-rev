package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.MediaController;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceView f12846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SurfaceHolder f12847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f12850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f12852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f12853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a1 f12854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f12855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f12856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f12857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f12858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MediaPlayer f12859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MediaController f12860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f12862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f12863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f12865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f12866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C f12867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Y0 f12868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Z0 f12869y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile int f12870z;

    protected a1(Context context, UnityPlayer unityPlayer, String str, int i10, int i11, int i12, boolean z10, long j10, long j11, Y0 y10) {
        super(context);
        this.f12861q = false;
        this.f12862r = false;
        this.f12863s = 0;
        this.f12864t = false;
        this.f12865u = 0;
        this.f12866v = false;
        this.f12867w = null;
        this.f12870z = 0;
        this.f12868x = y10;
        this.f12845a = context;
        this.f12854j = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f12846b = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f12847c = holder;
        holder.addCallback(this);
        setBackgroundColor(i10);
        addView(surfaceView);
        this.f12848d = str;
        this.f12849e = i11;
        this.f12850f = i12;
        this.f12851g = z10;
        this.f12852h = j10;
        this.f12853i = j11;
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f12867w = D.a(unityPlayer.getActivity(), 1000000, new X0(this));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    public void cancelOnPrepare() {
        a(2);
    }

    protected void destroyPlayer() {
        if (!this.f12864t) {
            pause();
        }
        doCleanUp();
        C c10 = this.f12867w;
        if (c10 != null) {
            c10.unregisterOnBackPressedCallback();
            this.f12867w = null;
        }
    }

    protected void doCleanUp() {
        Z0 z10 = this.f12869y;
        if (z10 != null) {
            z10.f12843b = true;
            this.f12869y = null;
        }
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f12859o.release();
            this.f12859o = null;
        }
        this.f12857m = 0;
        this.f12858n = 0;
        this.f12862r = false;
        this.f12861q = false;
    }

    public boolean exitOnKeypress(int i10, KeyEvent keyEvent) {
        Runnable runnable;
        if (i10 != 4 && (this.f12849e != 2 || i10 == 0 || keyEvent.isSystem())) {
            return false;
        }
        j6.c cVar = this.f12867w.f12712a;
        if ((cVar != null) && (runnable = ((B) cVar).f12710a) != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f12851g) {
            return this.f12863s;
        }
        return 100;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        boolean z10 = this.f12862r && this.f12861q;
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer == null) {
            return !z10;
        }
        return mediaPlayer.isPlaying() || !z10;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f12863s = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        destroyPlayer();
        a(3);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        MediaController mediaController = this.f12860p;
        return mediaController != null ? mediaController.onKeyDown(i10, keyEvent) : super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (exitOnKeypress(i10, keyEvent)) {
            return true;
        }
        MediaController mediaController = this.f12860p;
        return mediaController != null ? mediaController.onKeyUp(i10, keyEvent) : super.onKeyUp(i10, keyEvent);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Z0 z10 = this.f12869y;
        if (z10 != null) {
            z10.f12843b = true;
            this.f12869y = null;
        }
        int i10 = this.f12849e;
        if (i10 == 0 || i10 == 1) {
            MediaController mediaController = new MediaController(this.f12845a);
            this.f12860p = mediaController;
            mediaController.setMediaPlayer(this);
            this.f12860p.setAnchorView(this);
            this.f12860p.setEnabled(true);
            Context context = this.f12845a;
            if (context instanceof Activity) {
                this.f12860p.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f12860p.show();
        }
        this.f12862r = true;
        if (!this.f12861q || isPlaying()) {
            return;
        }
        a(1);
        updateVideoLayout();
        if (this.f12864t) {
            return;
        }
        start();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f12849e != 2 || action != 0) {
            MediaController mediaController = this.f12860p;
            return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
        }
        destroyPlayer();
        a(3);
        return true;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.f12861q = true;
        this.f12857m = i10;
        this.f12858n = i11;
        if (!this.f12862r || isPlaying()) {
            return;
        }
        a(1);
        updateVideoLayout();
        if (this.f12864t) {
            return;
        }
        start();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f12866v) {
            this.f12865u = mediaPlayer.getCurrentPosition();
            this.f12859o.pause();
        }
        this.f12864t = true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.seekTo(i10);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        MediaPlayer mediaPlayer = this.f12859o;
        if (mediaPlayer == null) {
            return;
        }
        if (this.f12866v) {
            int i10 = this.f12865u;
            if (i10 > 0) {
                mediaPlayer.seekTo(i10);
            }
            this.f12859o.start();
            this.f12865u = 0;
        }
        this.f12864t = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (this.f12855k == i11 && this.f12856l == i12) {
            return;
        }
        this.f12855k = i11;
        this.f12856l = i12;
        if (this.f12866v) {
            updateVideoLayout();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        FileInputStream fileInputStream;
        this.f12866v = true;
        if (this.f12864t) {
            MediaPlayer mediaPlayer = this.f12859o;
            if (mediaPlayer == null || this.f12865u <= 0) {
                return;
            }
            mediaPlayer.setDisplay(this.f12847c);
            this.f12859o.seekTo(this.f12865u);
            return;
        }
        MediaPlayer mediaPlayer2 = this.f12859o;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setDisplay(this.f12847c);
            if (this.f12864t) {
                return;
            }
            int i10 = this.f12865u;
            if (i10 > 0) {
                this.f12859o.seekTo(i10);
            }
            this.f12859o.start();
            this.f12865u = 0;
            return;
        }
        a(0);
        doCleanUp();
        try {
            MediaPlayer mediaPlayer3 = new MediaPlayer();
            this.f12859o = mediaPlayer3;
            if (this.f12851g) {
                mediaPlayer3.setDataSource(this.f12845a, Uri.parse(this.f12848d));
            } else {
                if (this.f12853i != 0) {
                    fileInputStream = new FileInputStream(this.f12848d);
                    this.f12859o.setDataSource(fileInputStream.getFD(), this.f12852h, this.f12853i);
                } else {
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenFd = getResources().getAssets().openFd(this.f12848d);
                        this.f12859o.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused) {
                        fileInputStream = new FileInputStream(this.f12848d);
                        this.f12859o.setDataSource(fileInputStream.getFD());
                        fileInputStream.close();
                    }
                }
                fileInputStream.close();
            }
            this.f12859o.setDisplay(this.f12847c);
            this.f12859o.setScreenOnWhilePlaying(true);
            this.f12859o.setOnBufferingUpdateListener(this);
            this.f12859o.setOnCompletionListener(this);
            this.f12859o.setOnPreparedListener(this);
            this.f12859o.setOnVideoSizeChangedListener(this);
            this.f12859o.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
            this.f12859o.prepareAsync();
            this.f12869y = new Z0(this);
            new Thread(this.f12869y).start();
        } catch (Exception unused2) {
            a(2);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f12866v = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r8 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void updateVideoLayout() {
        /*
            r10 = this;
            android.media.MediaPlayer r0 = r10.f12859o
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = r10.f12845a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            if (r0 <= 0) goto L27
            int r1 = r1.heightPixels
            if (r1 <= 0) goto L27
            r10.f12855k = r0
            r10.f12856l = r1
        L27:
            int r0 = r10.f12855k
            int r1 = r10.f12856l
            boolean r2 = r10.f12861q
            if (r2 == 0) goto L55
            int r2 = r10.f12857m
            float r3 = (float) r2
            int r4 = r10.f12858n
            float r5 = (float) r4
            float r3 = r3 / r5
            float r5 = (float) r0
            float r6 = (float) r1
            float r7 = r5 / r6
            int r8 = r10.f12850f
            r9 = 1
            if (r8 != r9) goto L44
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 > 0) goto L4f
            goto L4b
        L44:
            r9 = 2
            if (r8 != r9) goto L52
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 < 0) goto L4f
        L4b:
            float r5 = r5 / r3
            int r4 = (int) r5
            r2 = r0
            goto L57
        L4f:
            float r6 = r6 * r3
            int r2 = (int) r6
            goto L56
        L52:
            if (r8 != 0) goto L55
            goto L57
        L55:
            r2 = r0
        L56:
            r4 = r1
        L57:
            if (r0 != r2) goto L5b
            if (r1 == r4) goto L69
        L5b:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 17
            r0.<init>(r2, r4, r1)
            com.unity3d.player.a1 r1 = r10.f12854j
            android.view.SurfaceView r2 = r10.f12846b
            r1.updateViewLayout(r2, r0)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.a1.updateVideoLayout():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        this.f12870z = i10;
        Y0 y10 = this.f12868x;
        if (y10 != null) {
            ((c1) y10).a(this.f12870z);
        }
    }

    final boolean a() {
        return this.f12864t;
    }
}

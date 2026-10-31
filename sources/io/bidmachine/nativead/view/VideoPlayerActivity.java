package io.bidmachine.nativead.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import io.bidmachine.core.h;

/* JADX INFO: loaded from: classes4.dex */
public class VideoPlayerActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoView f20334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f20335c;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayerActivity.this.c();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                VideoPlayerActivity.this.getWindow().clearFlags(128);
            } catch (Exception e10) {
                io.bidmachine.core.a.o(e10);
            }
        }
    }

    interface c {
        void a(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f20335c != null) {
            this.f20335c.a(this.f20334b.isPlaying() ? this.f20334b.getCurrentPosition() : 0, false);
        }
        d();
    }

    private void d() {
        runOnUiThread(new b());
        finish();
    }

    public static Intent e(Context context, String str, int i10) {
        Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("io.bidmachine.fileUri", str);
        intent.putExtra("io.bidmachine.seekTo", i10);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String f() {
        return String.format("VideoPlayerActivity started, position: %s", Integer.valueOf(this.f20333a));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        c cVar = this.f20335c;
        if (cVar != null) {
            cVar.a(0, true);
        }
        d();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("io.bidmachine.fileUri");
        this.f20333a = intent.getIntExtra("io.bidmachine.seekTo", 0);
        io.bidmachine.core.a.d(new qc.b() { // from class: ka.q
            @Override // qc.b
            public final Object get() {
                return this.f21298a.f();
            }
        });
        if (stringExtra == null) {
            return;
        }
        this.f20335c = io.bidmachine.nativead.view.a.D;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f20334b = new VideoView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f20334b.setLayoutParams(layoutParams);
        this.f20334b.setOnCompletionListener(this);
        this.f20334b.setOnPreparedListener(this);
        this.f20334b.setVideoPath(stringExtra);
        relativeLayout.addView(this.f20334b);
        float fX = h.x(this);
        int iRound = Math.round(24.0f * fX);
        int iRound2 = Math.round(fX * 8.0f);
        m7.a aVar = new m7.a(this);
        aVar.h(g7.a.f15389a, g7.a.f15391c);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound, iRound);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(10, -1);
        layoutParams2.setMargins(iRound2, iRound2, iRound2, iRound2);
        aVar.setImage(g7.a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
        aVar.setLayoutParams(layoutParams2);
        aVar.setOnClickListener(new a());
        relativeLayout.addView(aVar);
        setContentView(relativeLayout);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        d();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoView videoView = this.f20334b;
        if (videoView == null || !videoView.canSeekForward()) {
            return;
        }
        this.f20334b.seekTo(this.f20333a);
        this.f20334b.start();
    }
}

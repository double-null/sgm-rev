package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f18323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x7.n f18324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18325d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f18326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x7.n f18327b;

        public a(x7.n nVar, b bVar) {
            this.f18327b = nVar;
            this.f18326a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (d.this.f18325d) {
                this.f18326a.x();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f18327b.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18317a.b();
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public interface b {
        void x();
    }

    public d(Context context, Looper looper, Looper looper2, b bVar, x7.h hVar) {
        this.f18322a = context.getApplicationContext();
        this.f18324c = hVar.b(looper, null);
        this.f18323b = new a(hVar.b(looper2, null), bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f18322a.registerReceiver(this.f18323b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f18322a.unregisterReceiver(this.f18323b);
    }

    public void f(boolean z10) {
        if (z10 == this.f18325d) {
            return;
        }
        if (z10) {
            this.f18324c.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18101a.d();
                }
            });
            this.f18325d = true;
        } else {
            this.f18324c.i(new Runnable() { // from class: io.bidmachine.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18307a.e();
                }
            });
            this.f18325d = false;
        }
    }
}

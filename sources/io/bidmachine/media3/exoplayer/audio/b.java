package io.bidmachine.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;
import x7.l0;

/* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f18216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f18217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f18218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f18219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f18220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.audio.a f18221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.audio.c f18222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u7.c f18223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18224j;

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.audio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    private static final class C0321b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            v7.d.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            v7.d.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            b bVar = b.this;
            bVar.f(io.bidmachine.media3.exoplayer.audio.a.f(bVar.f18215a, b.this.f18223i, b.this.f18222h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (l0.s(audioDeviceInfoArr, b.this.f18222h)) {
                b.this.f18222h = null;
            }
            b bVar = b.this;
            bVar.f(io.bidmachine.media3.exoplayer.audio.a.f(bVar.f18215a, b.this.f18223i, b.this.f18222h));
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    private final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f18226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f18227b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f18226a = contentResolver;
            this.f18227b = uri;
        }

        public void a() {
            this.f18226a.registerContentObserver(this.f18227b, false, this);
        }

        public void b() {
            this.f18226a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            b bVar = b.this;
            bVar.f(io.bidmachine.media3.exoplayer.audio.a.f(bVar.f18215a, b.this.f18223i, b.this.f18222h));
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            b bVar = b.this;
            bVar.f(io.bidmachine.media3.exoplayer.audio.a.e(context, intent, bVar.f18223i, b.this.f18222h));
        }
    }

    /* JADX INFO: compiled from: AudioCapabilitiesReceiver.java */
    public interface f {
        void a(io.bidmachine.media3.exoplayer.audio.a aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Context context, f fVar, u7.c cVar, io.bidmachine.media3.exoplayer.audio.c cVar2) {
        Context applicationContext = context.getApplicationContext();
        this.f18215a = applicationContext;
        this.f18216b = (f) x7.a.e(fVar);
        this.f18223i = cVar;
        this.f18222h = cVar2;
        Handler handlerC = l0.C();
        this.f18217c = handlerC;
        Object[] objArr = 0;
        this.f18218d = l0.f28136a >= 23 ? new c() : null;
        this.f18219e = new e();
        Uri uriI = io.bidmachine.media3.exoplayer.audio.a.i();
        this.f18220f = uriI != null ? new d(handlerC, applicationContext.getContentResolver(), uriI) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(io.bidmachine.media3.exoplayer.audio.a aVar) {
        if (!this.f18224j || aVar.equals(this.f18221g)) {
            return;
        }
        this.f18221g = aVar;
        this.f18216b.a(aVar);
    }

    public io.bidmachine.media3.exoplayer.audio.a g() {
        c cVar;
        if (this.f18224j) {
            return (io.bidmachine.media3.exoplayer.audio.a) x7.a.e(this.f18221g);
        }
        this.f18224j = true;
        d dVar = this.f18220f;
        if (dVar != null) {
            dVar.a();
        }
        if (l0.f28136a >= 23 && (cVar = this.f18218d) != null) {
            C0321b.a(this.f18215a, cVar, this.f18217c);
        }
        io.bidmachine.media3.exoplayer.audio.a aVarE = io.bidmachine.media3.exoplayer.audio.a.e(this.f18215a, this.f18215a.registerReceiver(this.f18219e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f18217c), this.f18223i, this.f18222h);
        this.f18221g = aVarE;
        return aVarE;
    }

    public void h(u7.c cVar) {
        this.f18223i = cVar;
        f(io.bidmachine.media3.exoplayer.audio.a.f(this.f18215a, cVar, this.f18222h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        io.bidmachine.media3.exoplayer.audio.c cVar = this.f18222h;
        if (Objects.equals(audioDeviceInfo, cVar == null ? null : cVar.f18230a)) {
            return;
        }
        io.bidmachine.media3.exoplayer.audio.c cVar2 = audioDeviceInfo != null ? new io.bidmachine.media3.exoplayer.audio.c(audioDeviceInfo) : null;
        this.f18222h = cVar2;
        f(io.bidmachine.media3.exoplayer.audio.a.f(this.f18215a, this.f18223i, cVar2));
    }

    public void j() {
        c cVar;
        if (this.f18224j) {
            this.f18221g = null;
            if (l0.f28136a >= 23 && (cVar = this.f18218d) != null) {
                C0321b.b(this.f18215a, cVar);
            }
            this.f18215a.unregisterReceiver(this.f18219e);
            d dVar = this.f18220f;
            if (dVar != null) {
                dVar.b();
            }
            this.f18224j = false;
        }
    }
}

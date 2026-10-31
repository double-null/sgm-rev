package v7;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;
import x7.l0;

/* JADX INFO: compiled from: AudioFocusRequestCompat.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f27204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f27205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u7.c f27206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f27207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f27208f;

    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f27209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f27210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f27211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private u7.c f27212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f27213e;

        public a a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f27210b;
            if (onAudioFocusChangeListener != null) {
                return new a(this.f27209a, onAudioFocusChangeListener, (Handler) x7.a.e(this.f27211c), this.f27212d, this.f27213e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(u7.c cVar) {
            x7.a.e(cVar);
            this.f27212d = cVar;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            x7.a.e(onAudioFocusChangeListener);
            x7.a.e(handler);
            this.f27210b = onAudioFocusChangeListener;
            this.f27211c = handler;
            return this;
        }

        public b d(boolean z10) {
            this.f27213e = z10;
            return this;
        }

        public b(int i10) {
            this.f27212d = u7.c.f25984g;
            this.f27209a = i10;
        }

        private b(a aVar) {
            this.f27209a = aVar.e();
            this.f27210b = aVar.f();
            this.f27211c = aVar.d();
            this.f27212d = aVar.b();
            this.f27213e = aVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    static class c implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f27214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f27215b;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f27215b = onAudioFocusChangeListener;
            this.f27214a = l0.z(handler.getLooper(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            this.f27215b.onAudioFocusChange(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            l0.c1(this.f27214a, new Runnable() { // from class: v7.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27216a.b(i10);
                }
            });
        }
    }

    a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, u7.c cVar, boolean z10) {
        this.f27203a = i10;
        this.f27205c = handler;
        this.f27206d = cVar;
        this.f27207e = z10;
        int i11 = l0.f28136a;
        if (i11 < 26) {
            this.f27204b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f27204b = onAudioFocusChangeListener;
        }
        if (i11 >= 26) {
            this.f27208f = new AudioFocusRequest.Builder(i10).setAudioAttributes(cVar.a().f25996a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f27208f = null;
        }
    }

    public b a() {
        return new b();
    }

    public u7.c b() {
        return this.f27206d;
    }

    AudioFocusRequest c() {
        return (AudioFocusRequest) x7.a.e(this.f27208f);
    }

    public Handler d() {
        return this.f27205c;
    }

    public int e() {
        return this.f27203a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27203a == aVar.f27203a && this.f27207e == aVar.f27207e && Objects.equals(this.f27204b, aVar.f27204b) && Objects.equals(this.f27205c, aVar.f27205c) && Objects.equals(this.f27206d, aVar.f27206d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f27204b;
    }

    public boolean g() {
        return this.f27207e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27203a), this.f27204b, this.f27205c, this.f27206d, Boolean.valueOf(this.f27207e));
    }
}

package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.w<AudioManager> f18641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f18642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f18643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u7.c f18644d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18646f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v7.a f18648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18649i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f18647g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18645e = 0;

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public interface a {
        void f(float f10);

        void g(int i10);
    }

    public g(final Context context, Looper looper, a aVar) {
        this.f18641a = com.google.common.base.x.a(new com.google.common.base.w() { // from class: io.bidmachine.media3.exoplayer.f
            @Override // com.google.common.base.w
            public final Object get() {
                return v7.d.c(context);
            }
        });
        this.f18643c = aVar;
        this.f18642b = new Handler(looper);
    }

    private void c() {
        int i10 = this.f18645e;
        if (i10 == 1 || i10 == 0 || this.f18648h == null) {
            return;
        }
        v7.d.b(this.f18641a.get(), this.f18648h);
    }

    private static int d(u7.c cVar) {
        if (cVar == null) {
            return 0;
        }
        switch (cVar.f25992c) {
            case 0:
                x7.r.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (cVar.f25990a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                x7.r.h("AudioFocusManager", "Unidentified audio usage: " + cVar.f25992c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i10) {
        a aVar = this.f18643c;
        if (aVar != null) {
            aVar.g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !p()) {
                m(4);
                return;
            } else {
                e(0);
                m(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            m(1);
        } else if (i10 == 1) {
            m(2);
            e(1);
        } else {
            x7.r.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    private int j() {
        if (this.f18645e == 2) {
            return 1;
        }
        if (k() == 1) {
            m(2);
            return 1;
        }
        m(1);
        return -1;
    }

    private int k() {
        v7.a aVar = this.f18648h;
        if (aVar == null || this.f18649i) {
            this.f18648h = (aVar == null ? new v7.a.b(this.f18646f) : aVar.a()).b((u7.c) x7.a.e(this.f18644d)).d(p()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: io.bidmachine.media3.exoplayer.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i10) {
                    this.f18597a.g(i10);
                }
            }, this.f18642b).a();
            this.f18649i = false;
        }
        return v7.d.i(this.f18641a.get(), this.f18648h);
    }

    private void m(int i10) {
        if (this.f18645e == i10) {
            return;
        }
        this.f18645e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f18647g == f10) {
            return;
        }
        this.f18647g = f10;
        a aVar = this.f18643c;
        if (aVar != null) {
            aVar.f(f10);
        }
    }

    private boolean n(int i10) {
        return i10 != 1 && this.f18646f == 1;
    }

    private boolean p() {
        u7.c cVar = this.f18644d;
        return cVar != null && cVar.f25990a == 1;
    }

    public float f() {
        return this.f18647g;
    }

    public void i() {
        this.f18643c = null;
        c();
        m(0);
    }

    public void l(u7.c cVar) {
        if (Objects.equals(this.f18644d, cVar)) {
            return;
        }
        this.f18644d = cVar;
        int iD = d(cVar);
        this.f18646f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        x7.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int o(boolean z10, int i10) {
        if (!n(i10)) {
            c();
            m(0);
            return 1;
        }
        if (z10) {
            return j();
        }
        int i11 = this.f18645e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }
}

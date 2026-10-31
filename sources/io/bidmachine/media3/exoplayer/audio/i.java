package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import u7.q;
import u7.w;
import x7.l0;

/* JADX INFO: compiled from: DefaultAudioOffloadSupportProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements DefaultAudioSink.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f18282b;

    /* JADX INFO: compiled from: DefaultAudioOffloadSupportProvider.java */
    private static final class a {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? d.f18231d : new d.b().e(true).g(z10).d();
        }
    }

    /* JADX INFO: compiled from: DefaultAudioOffloadSupportProvider.java */
    private static final class b {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return d.f18231d;
            }
            return new d.b().e(true).f(l0.f28136a > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public i(Context context) {
        this.f18281a = context;
    }

    private boolean b(Context context) {
        Boolean bool = this.f18282b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = v7.d.c(context).getParameters("offloadVariableRateSupported");
            this.f18282b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f18282b = Boolean.FALSE;
        }
        return this.f18282b.booleanValue();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.d
    public d a(q qVar, u7.c cVar) {
        x7.a.e(qVar);
        x7.a.e(cVar);
        int i10 = l0.f28136a;
        if (i10 < 29 || qVar.F == -1) {
            return d.f18231d;
        }
        boolean zB = b(this.f18281a);
        int iF = w.f((String) x7.a.e(qVar.f26252o), qVar.f26248k);
        if (iF == 0 || i10 < l0.K(iF)) {
            return d.f18231d;
        }
        int iM = l0.M(qVar.E);
        if (iM == 0) {
            return d.f18231d;
        }
        try {
            AudioFormat audioFormatL = l0.L(qVar.F, iM, iF);
            return i10 >= 31 ? b.a(audioFormatL, cVar.a().f25996a, zB) : a.a(audioFormatL, cVar.a().f25996a, zB);
        } catch (IllegalArgumentException unused) {
            return d.f18231d;
        }
    }
}

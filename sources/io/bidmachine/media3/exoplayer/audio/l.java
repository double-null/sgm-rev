package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import x7.l0;

/* JADX INFO: compiled from: DefaultAudioTrackProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public class l implements DefaultAudioSink.f {
    private AudioTrack b(AudioSink.a aVar, u7.c cVar, int i10) {
        return new AudioTrack(e(cVar, aVar.f18119d), l0.L(aVar.f18117b, aVar.f18118c, aVar.f18116a), aVar.f18121f, 1, i10);
    }

    private AudioTrack c(AudioSink.a aVar, u7.c cVar, int i10) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(cVar, aVar.f18119d)).setAudioFormat(l0.L(aVar.f18117b, aVar.f18118c, aVar.f18116a)).setTransferMode(1).setBufferSizeInBytes(aVar.f18121f).setSessionId(i10);
        if (l0.f28136a >= 29) {
            g(sessionId, aVar.f18120e);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(u7.c cVar, boolean z10) {
        return z10 ? f() : cVar.a().f25996a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.DefaultAudioSink.f
    public final AudioTrack a(AudioSink.a aVar, u7.c cVar, int i10) {
        return l0.f28136a >= 23 ? c(aVar, cVar, i10) : b(aVar, cVar, i10);
    }

    protected AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}

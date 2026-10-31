package b8;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.bidmachine.media3.exoplayer.audio.AudioSink;
import io.bidmachine.media3.exoplayer.audio.DefaultAudioSink;
import io.bidmachine.media3.exoplayer.h2;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.mediacodec.g f4151b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4154e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4159j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4152c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4153d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.mediacodec.l f4155f = io.bidmachine.media3.exoplayer.mediacodec.l.f19301a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f4160k = -9223372036854775807L;

    public d(Context context) {
        this.f4150a = context;
        this.f4151b = new io.bidmachine.media3.exoplayer.mediacodec.g(context);
    }

    @Override // b8.z
    public h2[] a(Handler handler, io.bidmachine.media3.exoplayer.video.p pVar, io.bidmachine.media3.exoplayer.audio.e eVar, p8.h hVar, l8.b bVar) {
        ArrayList<h2> arrayList = new ArrayList<>();
        k(this.f4150a, this.f4152c, this.f4155f, this.f4154e, handler, pVar, this.f4153d, arrayList);
        AudioSink audioSinkD = d(this.f4150a, this.f4156g, this.f4157h);
        if (audioSinkD != null) {
            c(this.f4150a, this.f4152c, this.f4155f, this.f4154e, audioSinkD, handler, eVar, arrayList);
        }
        j(this.f4150a, hVar, handler.getLooper(), this.f4152c, arrayList);
        g(this.f4150a, bVar, handler.getLooper(), this.f4152c, arrayList);
        e(this.f4150a, this.f4152c, arrayList);
        f(arrayList);
        h(this.f4150a, handler, this.f4152c, arrayList);
        return (h2[]) arrayList.toArray(new h2[0]);
    }

    @Override // b8.z
    public h2 b(h2 h2Var, Handler handler, io.bidmachine.media3.exoplayer.video.p pVar, io.bidmachine.media3.exoplayer.audio.e eVar, p8.h hVar, l8.b bVar) {
        if (h2Var.g() == 2) {
            return i(h2Var, this.f4150a, this.f4152c, this.f4155f, this.f4154e, handler, pVar, this.f4153d);
        }
        return null;
    }

    protected void c(Context context, int i10, io.bidmachine.media3.exoplayer.mediacodec.l lVar, boolean z10, AudioSink audioSink, Handler handler, io.bidmachine.media3.exoplayer.audio.e eVar, ArrayList<h2> arrayList) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        arrayList.add(new io.bidmachine.media3.exoplayer.audio.m(context, l(), lVar, z10, handler, eVar, audioSink));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (h2) Class.forName("io.bidmachine.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, io.bidmachine.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                    x7.r.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new IllegalStateException("Error instantiating MIDI extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (h2) Class.forName("io.bidmachine.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, io.bidmachine.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                    x7.r.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (h2) Class.forName("io.bidmachine.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, io.bidmachine.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                        x7.r.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i12 = i13;
                        i13 = i12;
                    }
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    try {
                        i14 = i13 + 1;
                        try {
                            arrayList.add(i13, (h2) Class.forName("io.bidmachine.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, io.bidmachine.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                            x7.r.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused7) {
                            i13 = i14;
                            i14 = i13;
                        }
                    } catch (Exception e11) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e11);
                    }
                } catch (ClassNotFoundException unused8) {
                }
                try {
                    try {
                        i15 = i14 + 1;
                        try {
                            arrayList.add(i14, (h2) Class.forName("io.bidmachine.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, io.bidmachine.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(context, handler, eVar, audioSink));
                            x7.r.f("DefaultRenderersFactory", "Loaded LibiamfAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                            i14 = i15;
                            i15 = i14;
                        }
                    } catch (Exception e12) {
                        throw new IllegalStateException("Error instantiating IAMF extension", e12);
                    }
                } catch (ClassNotFoundException unused10) {
                }
                try {
                    arrayList.add(i15, (h2) Class.forName("io.bidmachine.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, io.bidmachine.media3.exoplayer.audio.e.class, AudioSink.class).newInstance(handler, eVar, audioSink));
                    x7.r.f("DefaultRenderersFactory", "Loaded MpeghAudioRenderer.");
                } catch (ClassNotFoundException unused11) {
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating MPEG-H extension", e13);
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating FLAC extension", e14);
            }
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating Opus extension", e15);
        }
    }

    protected AudioSink d(Context context, boolean z10, boolean z11) {
        return new DefaultAudioSink.g(context).l(z10).k(z11).j();
    }

    protected void e(Context context, int i10, ArrayList<h2> arrayList) {
        arrayList.add(new u8.b());
    }

    protected void f(ArrayList<h2> arrayList) {
        arrayList.add(new j8.e(m(), null));
    }

    protected void g(Context context, l8.b bVar, Looper looper, int i10, ArrayList<h2> arrayList) {
        arrayList.add(new l8.c(bVar, looper));
        arrayList.add(new l8.c(bVar, looper));
    }

    protected h2 i(h2 h2Var, Context context, int i10, io.bidmachine.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, io.bidmachine.media3.exoplayer.video.p pVar, long j10) {
        if (this.f4158i && h2Var.getClass() == io.bidmachine.media3.exoplayer.video.h.class) {
            return new io.bidmachine.media3.exoplayer.video.h.d(context).q(l()).v(lVar).p(j10).r(z10).s(handler).t(pVar).u(50).o(this.f4159j).n(this.f4160k).m();
        }
        return null;
    }

    protected void j(Context context, p8.h hVar, Looper looper, int i10, ArrayList<h2> arrayList) {
        arrayList.add(new p8.i(hVar, looper));
    }

    protected void k(Context context, int i10, io.bidmachine.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, io.bidmachine.media3.exoplayer.video.p pVar, long j10, ArrayList<h2> arrayList) {
        int i11;
        int i12;
        arrayList.add(new io.bidmachine.media3.exoplayer.video.h.d(context).q(l()).v(lVar).p(j10).r(z10).s(handler).t(pVar).u(50).o(this.f4159j).n(this.f4160k).m());
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (h2) Class.forName("io.bidmachine.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, io.bidmachine.media3.exoplayer.video.p.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, pVar, 50));
                    x7.r.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (h2) Class.forName("io.bidmachine.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, io.bidmachine.media3.exoplayer.video.p.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, pVar, 50));
                        x7.r.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(i12, (h2) Class.forName("io.bidmachine.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, io.bidmachine.media3.exoplayer.video.p.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, pVar, 50));
                    x7.r.f("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e10) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e10);
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating AV1 extension", e11);
            }
        } catch (Exception e12) {
            throw new IllegalStateException("Error instantiating VP9 extension", e12);
        }
    }

    protected io.bidmachine.media3.exoplayer.mediacodec.h.b l() {
        return this.f4151b;
    }

    protected j8.c.a m() {
        return j8.c.a.f20679a;
    }

    protected void h(Context context, Handler handler, int i10, ArrayList<h2> arrayList) {
    }
}

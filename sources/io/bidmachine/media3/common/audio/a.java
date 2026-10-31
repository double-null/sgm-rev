package io.bidmachine.media3.common.audio;

import com.google.common.collect.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: AudioProcessingPipeline.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u<AudioProcessor> f17940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<AudioProcessor> f17941b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f17942c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f17943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f17944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17945f;

    public a(u<AudioProcessor> uVar) {
        this.f17940a = uVar;
        AudioProcessor.a aVar = AudioProcessor.a.f17935e;
        this.f17943d = aVar;
        this.f17944e = aVar;
        this.f17945f = false;
    }

    private int c() {
        return this.f17942c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f17942c[i10].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f17941b.get(i10);
                    if (!audioProcessor.b()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f17942c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f17933a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.f(byteBuffer2);
                        this.f17942c[i10] = audioProcessor.e();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f17942c[i10].hasRemaining();
                    } else if (!this.f17942c[i10].hasRemaining() && i10 < c()) {
                        this.f17941b.get(i10 + 1).g();
                    }
                }
            }
        }
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f17935e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i10 = 0; i10 < this.f17940a.size(); i10++) {
            AudioProcessor audioProcessor = this.f17940a.get(i10);
            AudioProcessor.a aVarD = audioProcessor.d(aVar);
            if (audioProcessor.c()) {
                x7.a.g(!aVarD.equals(AudioProcessor.a.f17935e));
                aVar = aVarD;
            }
        }
        this.f17944e = aVar;
        return aVar;
    }

    public void b() {
        this.f17941b.clear();
        this.f17943d = this.f17944e;
        this.f17945f = false;
        for (int i10 = 0; i10 < this.f17940a.size(); i10++) {
            AudioProcessor audioProcessor = this.f17940a.get(i10);
            audioProcessor.flush();
            if (audioProcessor.c()) {
                this.f17941b.add(audioProcessor);
            }
        }
        this.f17942c = new ByteBuffer[this.f17941b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f17942c[i11] = this.f17941b.get(i11).e();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.f17933a;
        }
        ByteBuffer byteBuffer = this.f17942c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(AudioProcessor.f17933a);
        return this.f17942c[c()];
    }

    public boolean e() {
        return this.f17945f && this.f17941b.get(c()).b() && !this.f17942c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f17940a.size() != aVar.f17940a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f17940a.size(); i10++) {
            if (this.f17940a.get(i10) != aVar.f17940a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f17941b.isEmpty();
    }

    public void h() {
        if (!f() || this.f17945f) {
            return;
        }
        this.f17945f = true;
        this.f17941b.get(0).g();
    }

    public int hashCode() {
        return this.f17940a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f17945f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f17940a.size(); i10++) {
            AudioProcessor audioProcessor = this.f17940a.get(i10);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f17942c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.f17935e;
        this.f17943d = aVar;
        this.f17944e = aVar;
        this.f17945f = false;
    }
}

package io.bidmachine.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AudioProcessor.a f17946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected AudioProcessor.a f17947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f17948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f17949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f17950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f17951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17952h;

    public b() {
        ByteBuffer byteBuffer = AudioProcessor.f17933a;
        this.f17950f = byteBuffer;
        this.f17951g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f17935e;
        this.f17948d = aVar;
        this.f17949e = aVar;
        this.f17946b = aVar;
        this.f17947c = aVar;
    }

    protected final boolean a() {
        return this.f17951g.hasRemaining();
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public boolean b() {
        return this.f17952h && this.f17951g == AudioProcessor.f17933a;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public boolean c() {
        return this.f17949e != AudioProcessor.a.f17935e;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final AudioProcessor.a d(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f17948d = aVar;
        this.f17949e = h(aVar);
        return c() ? this.f17949e : AudioProcessor.a.f17935e;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.f17951g;
        this.f17951g = AudioProcessor.f17933a;
        return byteBuffer;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f17951g = AudioProcessor.f17933a;
        this.f17952h = false;
        this.f17946b = this.f17948d;
        this.f17947c = this.f17949e;
        i();
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void g() {
        this.f17952h = true;
        j();
    }

    protected abstract AudioProcessor.a h(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    protected final ByteBuffer l(int i10) {
        if (this.f17950f.capacity() < i10) {
            this.f17950f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f17950f.clear();
        }
        ByteBuffer byteBuffer = this.f17950f;
        this.f17951g = byteBuffer;
        return byteBuffer;
    }

    @Override // io.bidmachine.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f17950f = AudioProcessor.f17933a;
        AudioProcessor.a aVar = AudioProcessor.a.f17935e;
        this.f17948d = aVar;
        this.f17949e = aVar;
        this.f17946b = aVar;
        this.f17947c = aVar;
        k();
    }

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }
}

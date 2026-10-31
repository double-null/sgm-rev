package b8;

import x7.l0;

/* JADX INFO: compiled from: DecoderCounters.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4139l;

    private void b(long j10, int i10) {
        this.f4138k += j10;
        this.f4139l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return l0.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f4128a), Integer.valueOf(this.f4129b), Integer.valueOf(this.f4130c), Integer.valueOf(this.f4131d), Integer.valueOf(this.f4132e), Integer.valueOf(this.f4133f), Integer.valueOf(this.f4134g), Integer.valueOf(this.f4135h), Integer.valueOf(this.f4136i), Integer.valueOf(this.f4137j), Long.valueOf(this.f4138k), Integer.valueOf(this.f4139l));
    }
}

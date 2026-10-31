package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FMODAudioDevice f23414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f23415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Thread f23418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f23419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioRecord f23420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23421h;

    a(FMODAudioDevice fMODAudioDevice, int i10, int i11) {
        this.f23414a = fMODAudioDevice;
        this.f23416c = i10;
        this.f23417d = i11;
        this.f23415b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i10, i11, 2));
    }

    private void b() {
        AudioRecord audioRecord = this.f23420g;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f23420g.stop();
            }
            this.f23420g.release();
            this.f23420g = null;
        }
        this.f23415b.position(0);
        this.f23421h = false;
    }

    public final int a() {
        return this.f23415b.capacity();
    }

    public final void c() {
        if (this.f23418e != null) {
            d();
        }
        this.f23419f = true;
        this.f23418e = new Thread(this);
        this.f23418e.start();
    }

    public final void d() {
        while (this.f23418e != null) {
            this.f23419f = false;
            try {
                this.f23418e.join();
                this.f23418e = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 3;
        while (this.f23419f) {
            if (!this.f23421h && i10 > 0) {
                b();
                AudioRecord audioRecord = new AudioRecord(1, this.f23416c, this.f23417d, 2, this.f23415b.capacity());
                this.f23420g = audioRecord;
                boolean z10 = audioRecord.getState() == 1;
                this.f23421h = z10;
                if (z10) {
                    this.f23415b.position(0);
                    this.f23420g.startRecording();
                    i10 = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f23420g.getState() + ")");
                    i10 += -1;
                    b();
                }
            }
            if (this.f23421h && this.f23420g.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f23420g;
                ByteBuffer byteBuffer = this.f23415b;
                this.f23414a.fmodProcessMicData(this.f23415b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f23415b.position(0);
            }
        }
        b();
    }
}

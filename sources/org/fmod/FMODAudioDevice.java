package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class FMODAudioDevice implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Thread f23407a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f23408b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f23409c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23410d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f23411e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f23412f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile a f23413g;

    private native int fmodGetInfo(int i10);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f23409c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f23409c.stop();
            }
            this.f23409c.release();
            this.f23409c = null;
        }
        this.f23411e = null;
        this.f23412f = null;
        this.f23410d = false;
    }

    public synchronized void close() {
        stop();
    }

    native int fmodProcessMicData(ByteBuffer byteBuffer, int i10);

    public boolean isRunning() {
        return this.f23407a != null && this.f23407a.isAlive();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = 3;
        while (this.f23408b) {
            if (!this.f23410d && i10 > 0) {
                releaseAudioTrack();
                int iFmodGetInfo = fmodGetInfo(0);
                int i11 = fmodGetInfo(4) == 1 ? 4 : 12;
                int minBufferSize = AudioTrack.getMinBufferSize(iFmodGetInfo, i11, 2);
                int iFmodGetInfo2 = fmodGetInfo(4) * 2;
                int iRound = Math.round(minBufferSize * 1.1f) & (~(iFmodGetInfo2 - 1));
                int iFmodGetInfo3 = fmodGetInfo(1);
                int iFmodGetInfo4 = fmodGetInfo(2) * iFmodGetInfo3 * iFmodGetInfo2;
                AudioTrack audioTrack = new AudioTrack(3, iFmodGetInfo, i11, 2, iFmodGetInfo4 > iRound ? iFmodGetInfo4 : iRound, 1);
                this.f23409c = audioTrack;
                boolean z10 = audioTrack.getState() == 1;
                this.f23410d = z10;
                if (z10) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iFmodGetInfo3 * iFmodGetInfo2);
                    this.f23411e = byteBufferAllocateDirect;
                    this.f23412f = new byte[byteBufferAllocateDirect.capacity()];
                    this.f23409c.play();
                    i10 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f23409c.getState() + ")");
                    releaseAudioTrack();
                    i10 += -1;
                }
            }
            if (this.f23410d) {
                if (fmodGetInfo(3) == 1) {
                    fmodProcess(this.f23411e);
                    ByteBuffer byteBuffer = this.f23411e;
                    byteBuffer.get(this.f23412f, 0, byteBuffer.capacity());
                    this.f23409c.write(this.f23412f, 0, this.f23411e.capacity());
                    this.f23411e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f23407a != null) {
            stop();
        }
        this.f23407a = new Thread(this, "FMODAudioDevice");
        this.f23407a.setPriority(10);
        this.f23408b = true;
        this.f23407a.start();
        if (this.f23413g != null) {
            this.f23413g.c();
        }
    }

    public synchronized int startAudioRecord(int i10, int i11, int i12) {
        if (this.f23413g == null) {
            this.f23413g = new a(this, i10, i11);
            this.f23413g.c();
        }
        return this.f23413g.a();
    }

    public synchronized void stop() {
        while (this.f23407a != null) {
            this.f23408b = false;
            try {
                this.f23407a.join();
                this.f23407a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.f23413g != null) {
            this.f23413g.d();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.f23413g != null) {
            this.f23413g.d();
            this.f23413g = null;
        }
    }
}

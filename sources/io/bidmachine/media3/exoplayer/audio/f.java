package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f18242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f18243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f18244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f18245f;

    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f18246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f18247b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f18248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f18249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f18250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f18252g;

        public a(AudioTrack audioTrack) {
            this.f18246a = audioTrack;
        }

        public void a() {
            this.f18251f = true;
        }

        public long b() {
            return this.f18250e;
        }

        public long c() {
            return this.f18247b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f18246a.getTimestamp(this.f18247b);
            if (timestamp) {
                long j10 = this.f18247b.framePosition;
                long j11 = this.f18249d;
                if (j11 > j10) {
                    if (this.f18251f) {
                        this.f18252g += j11;
                        this.f18251f = false;
                    } else {
                        this.f18248c++;
                    }
                }
                this.f18249d = j10;
                this.f18250e = j10 + this.f18252g + (this.f18248c << 32);
            }
            return timestamp;
        }
    }

    public f(AudioTrack audioTrack) {
        this.f18240a = new a(audioTrack);
        h();
    }

    private void i(int i10) {
        this.f18241b = i10;
        if (i10 == 0) {
            this.f18244e = 0L;
            this.f18245f = -1L;
            this.f18242c = System.nanoTime() / 1000;
            this.f18243d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f18243d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f18243d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f18243d = 500000L;
        }
    }

    public void a() {
        if (this.f18241b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f18240a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f18240a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f18240a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f18241b == 2;
    }

    public boolean f(long j10) {
        a aVar = this.f18240a;
        if (aVar == null || j10 - this.f18244e < this.f18243d) {
            return false;
        }
        this.f18244e = j10;
        boolean zD = aVar.d();
        int i10 = this.f18241b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zD) {
                        h();
                    }
                } else if (!zD) {
                    h();
                }
            } else if (!zD) {
                h();
            } else if (this.f18240a.b() > this.f18245f) {
                i(2);
            }
        } else if (zD) {
            if (this.f18240a.c() < this.f18242c) {
                return false;
            }
            this.f18245f = this.f18240a.b();
            i(1);
        } else if (j10 - this.f18242c > 500000) {
            i(3);
        }
        return zD;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f18240a != null) {
            i(0);
        }
    }
}

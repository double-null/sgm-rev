package s8;

import android.os.SystemClock;
import io.bidmachine.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: SntpClient.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f25307a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25308b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f25309c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f25310d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f25311e = "time.android.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25312f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f25313g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f25314h = -9223372036854775807L;

    /* JADX INFO: renamed from: s8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SntpClient.java */
    public interface InterfaceC0413b {
        void a(IOException iOException);

        void onInitialized();
    }

    private static void h(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f25308b) {
            j10 = f25309c ? f25310d : -9223372036854775807L;
        }
        return j10;
    }

    public static String j() {
        String str;
        synchronized (f25308b) {
            str = f25311e;
        }
        return str;
    }

    public static int k() {
        int i10;
        synchronized (f25308b) {
            i10 = f25312f;
        }
        return i10;
    }

    public static void l(Loader loader, InterfaceC0413b interfaceC0413b) {
        if (m()) {
            if (interfaceC0413b != null) {
                interfaceC0413b.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.n(new d(), new c(interfaceC0413b), 1);
        }
    }

    public static boolean m() {
        boolean z10;
        synchronized (f25308b) {
            if (f25314h != -9223372036854775807L && f25313g != -9223372036854775807L) {
                f25309c = f25309c && SystemClock.elapsedRealtime() - f25314h < f25313g;
            }
            z10 = f25309c;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & 255;
                    long jP = p(bArr, 24);
                    long jP2 = p(bArr, 32);
                    long jP3 = p(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jP3);
                    long j11 = (j10 + (((jP2 - jP) + (jP3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        throw ((SocketTimeoutException) x7.a.e(socketTimeoutException));
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) x7.a.e(socketTimeoutException));
        } catch (Throwable th) {
            try {
                datagramSocket.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static long o(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long p(byte[] bArr, int i10) {
        long jO = o(bArr, i10);
        long jO2 = o(bArr, i10 + 4);
        if (jO == 0 && jO2 == 0) {
            return 0L;
        }
        return ((jO - 2208988800L) * 1000) + ((jO2 * 1000) / 4294967296L);
    }

    private static void q(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (j13 >> 24);
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j13 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j13 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j13 >> 0);
        long j14 = (j12 * 4294967296L) / 1000;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j14 >> 24);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j14 >> 16);
        bArr[i16] = (byte) (j14 >> 8);
        bArr[i16 + 1] = (byte) (Math.random() * 255.0d);
    }

    /* JADX INFO: compiled from: SntpClient.java */
    private static final class d implements Loader.e {
        private d() {
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
        public void load() throws IOException {
            synchronized (b.f25307a) {
                synchronized (b.f25308b) {
                    if (b.f25309c) {
                        return;
                    }
                    long jN = b.n();
                    synchronized (b.f25308b) {
                        long unused = b.f25314h = SystemClock.elapsedRealtime();
                        long unused2 = b.f25310d = jN;
                        boolean unused3 = b.f25309c = true;
                    }
                }
            }
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.e
        public void b() {
        }
    }

    /* JADX INFO: compiled from: SntpClient.java */
    private static final class c implements Loader.b<Loader.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0413b f25315a;

        public c(InterfaceC0413b interfaceC0413b) {
            this.f25315a = interfaceC0413b;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        public void m(Loader.e eVar, long j10, long j11) {
            if (this.f25315a != null) {
                if (b.m()) {
                    this.f25315a.onInitialized();
                } else {
                    this.f25315a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        public Loader.c s(Loader.e eVar, long j10, long j11, IOException iOException, int i10) {
            InterfaceC0413b interfaceC0413b = this.f25315a;
            if (interfaceC0413b != null) {
                interfaceC0413b.a(iOException);
            }
            return Loader.f19788f;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Loader.b
        public void o(Loader.e eVar, long j10, long j11, boolean z10) {
        }
    }
}

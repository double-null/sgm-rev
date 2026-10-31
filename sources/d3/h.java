package d3;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: QueueFile.java */
/* JADX INFO: loaded from: classes4.dex */
class h implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f13271g = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f13272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f13273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f13275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f13276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f13277f = new byte[16];

    /* JADX INFO: compiled from: QueueFile.java */
    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f13278a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f13279b;

        a(StringBuilder sb2) {
            this.f13279b = sb2;
        }

        @Override // d3.h.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f13278a) {
                this.f13278a = false;
            } else {
                this.f13279b.append(", ");
            }
            this.f13279b.append(i10);
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f13281c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f13283b;

        b(int i10, int i11) {
            this.f13282a = i10;
            this.f13283b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f13282a + ", length = " + this.f13283b + "]";
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    private final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13285b;

        /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            h.u(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f13285b;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            h.this.H(this.f13284a, bArr, i10, i11);
            this.f13284a = h.this.L(this.f13284a + i11);
            this.f13285b -= i11;
            return i11;
        }

        private c(b bVar) {
            this.f13284a = h.this.L(bVar.f13282a + 4);
            this.f13285b = bVar.f13283b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f13285b == 0) {
                return -1;
            }
            h.this.f13272a.seek(this.f13284a);
            int i10 = h.this.f13272a.read();
            this.f13284a = h.this.L(this.f13284a + 1);
            this.f13285b--;
            return i10;
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            s(file);
        }
        this.f13272a = v(file);
        B();
    }

    private void B() throws IOException {
        this.f13272a.seek(0L);
        this.f13272a.readFully(this.f13277f);
        int iC = C(this.f13277f, 0);
        this.f13273b = iC;
        if (iC <= this.f13272a.length()) {
            this.f13274c = C(this.f13277f, 4);
            int iC2 = C(this.f13277f, 8);
            int iC3 = C(this.f13277f, 12);
            this.f13275d = z(iC2);
            this.f13276e = z(iC3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f13273b + ", Actual length: " + this.f13272a.length());
    }

    private static int C(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    private int F() {
        return this.f13273b - K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iL = L(i10);
        int i13 = iL + i12;
        int i14 = this.f13273b;
        if (i13 <= i14) {
            this.f13272a.seek(iL);
            this.f13272a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iL;
        this.f13272a.seek(iL);
        this.f13272a.readFully(bArr, i11, i15);
        this.f13272a.seek(16L);
        this.f13272a.readFully(bArr, i11 + i15, i12 - i15);
    }

    private void I(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iL = L(i10);
        int i13 = iL + i12;
        int i14 = this.f13273b;
        if (i13 <= i14) {
            this.f13272a.seek(iL);
            this.f13272a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iL;
        this.f13272a.seek(iL);
        this.f13272a.write(bArr, i11, i15);
        this.f13272a.seek(16L);
        this.f13272a.write(bArr, i11 + i15, i12 - i15);
    }

    private void J(int i10) throws IOException {
        this.f13272a.setLength(i10);
        this.f13272a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(int i10) {
        int i11 = this.f13273b;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    private void N(int i10, int i11, int i12, int i13) throws IOException {
        Y(this.f13277f, i10, i11, i12, i13);
        this.f13272a.seek(0L);
        this.f13272a.write(this.f13277f);
    }

    private static void U(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    private static void Y(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            U(bArr, i10, i11);
            i10 += 4;
        }
    }

    private void o(int i10) throws IOException {
        int i11 = i10 + 4;
        int iF = F();
        if (iF >= i11) {
            return;
        }
        int i12 = this.f13273b;
        do {
            iF += i12;
            i12 <<= 1;
        } while (iF < i11);
        J(i12);
        b bVar = this.f13276e;
        int iL = L(bVar.f13282a + 4 + bVar.f13283b);
        if (iL < this.f13275d.f13282a) {
            FileChannel channel = this.f13272a.getChannel();
            channel.position(this.f13273b);
            long j10 = iL - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f13276e.f13282a;
        int i14 = this.f13275d.f13282a;
        if (i13 < i14) {
            int i15 = (this.f13273b + i13) - 16;
            N(i12, this.f13274c, i14, i15);
            this.f13276e = new b(i15, this.f13276e.f13283b);
        } else {
            N(i12, this.f13274c, i14, i13);
        }
        this.f13273b = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T u(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile v(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private b z(int i10) throws IOException {
        if (i10 == 0) {
            return b.f13281c;
        }
        this.f13272a.seek(i10);
        return new b(i10, this.f13272a.readInt());
    }

    public synchronized void G() throws IOException {
        if (t()) {
            throw new NoSuchElementException();
        }
        if (this.f13274c == 1) {
            n();
        } else {
            b bVar = this.f13275d;
            int iL = L(bVar.f13282a + 4 + bVar.f13283b);
            H(iL, this.f13277f, 0, 4);
            int iC = C(this.f13277f, 0);
            N(this.f13273b, this.f13274c - 1, iL, this.f13276e.f13282a);
            this.f13274c--;
            this.f13275d = new b(iL, iC);
        }
    }

    public int K() {
        if (this.f13274c == 0) {
            return 16;
        }
        b bVar = this.f13276e;
        int i10 = bVar.f13282a;
        int i11 = this.f13275d.f13282a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f13283b + 16 : (((i10 + 4) + bVar.f13283b) + this.f13273b) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f13272a.close();
    }

    public void h(byte[] bArr) throws IOException {
        k(bArr, 0, bArr.length);
    }

    public synchronized void k(byte[] bArr, int i10, int i11) throws IOException {
        int iL;
        u(bArr, "buffer");
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        o(i11);
        boolean zT = t();
        if (zT) {
            iL = 16;
        } else {
            b bVar = this.f13276e;
            iL = L(bVar.f13282a + 4 + bVar.f13283b);
        }
        b bVar2 = new b(iL, i11);
        U(this.f13277f, 0, i11);
        I(bVar2.f13282a, this.f13277f, 0, 4);
        I(bVar2.f13282a + 4, bArr, i10, i11);
        N(this.f13273b, this.f13274c + 1, zT ? bVar2.f13282a : this.f13275d.f13282a, bVar2.f13282a);
        this.f13276e = bVar2;
        this.f13274c++;
        if (zT) {
            this.f13275d = bVar2;
        }
    }

    public synchronized void n() throws IOException {
        N(4096, 0, 0, 0);
        this.f13274c = 0;
        b bVar = b.f13281c;
        this.f13275d = bVar;
        this.f13276e = bVar;
        if (this.f13273b > 4096) {
            J(4096);
        }
        this.f13273b = 4096;
    }

    public synchronized void p(d dVar) throws IOException {
        int iL = this.f13275d.f13282a;
        for (int i10 = 0; i10 < this.f13274c; i10++) {
            b bVarZ = z(iL);
            dVar.a(new c(this, bVarZ, null), bVarZ.f13283b);
            iL = L(bVarZ.f13282a + 4 + bVarZ.f13283b);
        }
    }

    public synchronized boolean t() {
        return this.f13274c == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f13273b);
        sb2.append(", size=");
        sb2.append(this.f13274c);
        sb2.append(", first=");
        sb2.append(this.f13275d);
        sb2.append(", last=");
        sb2.append(this.f13276e);
        sb2.append(", element lengths=[");
        try {
            p(new a(sb2));
        } catch (IOException e10) {
            f13271g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    private static void s(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileV = v(file2);
        try {
            randomAccessFileV.setLength(4096L);
            randomAccessFileV.seek(0L);
            byte[] bArr = new byte[16];
            Y(bArr, 4096, 0, 0, 0);
            randomAccessFileV.write(bArr);
            randomAccessFileV.close();
            if (!file2.renameTo(file)) {
                throw new IOException(edUJlCZxhVnO.naDKcOdUK);
            }
        } catch (Throwable th) {
            randomAccessFileV.close();
            throw th;
        }
    }
}

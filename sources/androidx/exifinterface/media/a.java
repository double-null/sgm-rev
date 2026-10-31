package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import c0.IbU.elEbP;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import pb.vBC.NyXuoef;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: ExifInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static SimpleDateFormat T;
    private static SimpleDateFormat U;
    private static final d[] Y;
    private static final d[] Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final d[] f2417a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d[] f2418b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d[] f2419c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final d f2420d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final d[] f2421e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final d[] f2422f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final d[] f2423g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final d[] f2424h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final d[][] f2425i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final d[] f2426j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final HashMap<Integer, d>[] f2427k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap<String, d>[] f2428l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashSet<String> f2429m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f2430n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final Charset f2431o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final byte[] f2432p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final byte[] f2433q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f2434r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f2435s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f2436t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f2438u0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f2445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f2446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, c>[] f2449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<Integer> f2450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f2451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f2457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f2463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f2437u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List<Integer> f2439v = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List<Integer> f2440w = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f2441x = {8, 8, 8};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f2442y = {4};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f2443z = {8};
    static final byte[] A = {-1, -40, -1};
    private static final byte[] B = {102, 116, 121, 112};
    private static final byte[] C = {109, 105, 102, 49};
    private static final byte[] D = {104, 101, 105, 99};
    private static final byte[] E = {79, 76, 89, 77, 80, 0};
    private static final byte[] F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] G = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] H = {101, 88, 73, 102};
    private static final byte[] I = {73, 72, 68, 82};
    private static final byte[] J = {73, 69, 78, 68};
    private static final byte[] K = {82, 73, 70, 70};
    private static final byte[] L = {87, 69, 66, 80};
    private static final byte[] M = {69, 88, 73, 70};
    private static final byte[] N = {-99, 1, 42};
    private static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] X = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: compiled from: ExifInterface.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final ByteOrder f2467e = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final ByteOrder f2468f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final DataInputStream f2469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteOrder f2470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f2472d;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f2469a.available();
        }

        public int b() {
            return this.f2471c;
        }

        public long c() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public void e(ByteOrder byteOrder) {
            this.f2470b = byteOrder;
        }

        public void f(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f2469a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f2472d == null) {
                        this.f2472d = new byte[8192];
                    }
                    iSkip = this.f2469a.read(this.f2472d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f2471c += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f2471c++;
            return this.f2469a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f2471c++;
            return this.f2469a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f2471c++;
            int i10 = this.f2469a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f2471c += 2;
            return this.f2469a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f2471c += i11;
            this.f2469a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f2471c += 4;
            int i10 = this.f2469a.read();
            int i11 = this.f2469a.read();
            int i12 = this.f2469a.read();
            int i13 = this.f2469a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2470b;
            if (byteOrder == f2467e) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f2468f) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f2470b);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f2471c += 8;
            int i10 = this.f2469a.read();
            int i11 = this.f2469a.read();
            int i12 = this.f2469a.read();
            int i13 = this.f2469a.read();
            int i14 = this.f2469a.read();
            int i15 = this.f2469a.read();
            int i16 = this.f2469a.read();
            int i17 = this.f2469a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2470b;
            if (byteOrder == f2467e) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == f2468f) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f2470b);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f2471c += 2;
            int i10 = this.f2469a.read();
            int i11 = this.f2469a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2470b;
            if (byteOrder == f2467e) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == f2468f) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f2470b);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f2471c += 2;
            return this.f2469a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f2471c++;
            return this.f2469a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f2471c += 2;
            int i10 = this.f2469a.read();
            int i11 = this.f2469a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2470b;
            if (byteOrder == f2467e) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == f2468f) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f2470b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f2470b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2469a = dataInputStream;
            dataInputStream.mark(0);
            this.f2471c = 0;
            this.f2470b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f2469a.read(bArr, i10, i11);
            this.f2471c += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f2471c += bArr.length;
            this.f2469a.readFully(bArr);
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f2475c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f2476d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f2431o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.W[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.W[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f2481a);
                byteBufferWrap.putInt((int) eVar.f2482b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.W[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i10 < eVarArr.length) {
                sb2.append(eVarArr[i10].f2481a);
                sb2.append('/');
                sb2.append(eVarArr[i10].f2482b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:182:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:409), block:B:151:0x0198 */
        Object k(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte b11;
            byte[] bArr;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f2476d);
                    try {
                        bVar.e(byteOrder);
                        int length = 0;
                        boolean z10 = true;
                        switch (this.f2473a) {
                            case 1:
                            case 6:
                                byte[] bArr2 = this.f2476d;
                                if (bArr2.length != 1 || (b10 = bArr2[0]) < 0 || b10 > 1) {
                                    String str = new String(bArr2, a.f2431o0);
                                    try {
                                        bVar.close();
                                        break;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    }
                                    return str;
                                }
                                String str2 = new String(new char[]{(char) (b10 + 48)});
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f2474b >= a.X.length) {
                                    int i10 = 0;
                                    while (true) {
                                        bArr = a.X;
                                        if (i10 < bArr.length) {
                                            if (this.f2476d[i10] != bArr[i10]) {
                                                z10 = false;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                    if (z10) {
                                        length = bArr.length;
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (length < this.f2474b && (b11 = this.f2476d[length]) != 0) {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                String string = sb2.toString();
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                return string;
                            case 3:
                                int[] iArr = new int[this.f2474b];
                                while (length < this.f2474b) {
                                    iArr[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f2474b];
                                while (length < this.f2474b) {
                                    jArr[length] = bVar.c();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                }
                                return jArr;
                            case 5:
                                e[] eVarArr = new e[this.f2474b];
                                while (length < this.f2474b) {
                                    eVarArr[length] = new e(bVar.c(), bVar.c());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                }
                                return eVarArr;
                            case 8:
                                int[] iArr2 = new int[this.f2474b];
                                while (length < this.f2474b) {
                                    iArr2[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f2474b];
                                while (length < this.f2474b) {
                                    iArr3[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                }
                                return iArr3;
                            case 10:
                                e[] eVarArr2 = new e[this.f2474b];
                                while (length < this.f2474b) {
                                    eVarArr2[length] = new e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                }
                                return eVarArr2;
                            case 11:
                                double[] dArr = new double[this.f2474b];
                                while (length < this.f2474b) {
                                    dArr[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e19) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f2474b];
                                while (length < this.f2474b) {
                                    dArr2[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e20) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                                }
                                return dArr2;
                            default:
                                try {
                                    bVar.close();
                                    break;
                                } catch (IOException e21) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                                }
                                return null;
                        }
                    } catch (IOException e22) {
                        e = e22;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e23) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e23);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e24) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e24);
                        }
                    }
                    throw th;
                }
            } catch (IOException e25) {
                e = e25;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public String toString() {
            return "(" + a.V[this.f2473a] + ", data length:" + this.f2476d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f2473a = i10;
            this.f2474b = i11;
            this.f2475c = j10;
            this.f2476d = bArr;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2482b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f2481a = 0L;
                this.f2482b = 1L;
            } else {
                this.f2481a = j10;
                this.f2482b = j11;
            }
        }

        public double a() {
            return this.f2481a / this.f2482b;
        }

        public String toString() {
            return this.f2481a + "/" + this.f2482b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new d("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new d("DateTime", 306, 2), new d("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new d("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new d("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, 4), new d("JPEGInterchangeFormatLength", EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d(UICvx.umVndNRBNXtx, 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f2417a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f2418b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", UserVerificationMethods.USER_VERIFY_HANDPRINT, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new d("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new d("DateTime", 306, 2), new d("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new d("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new d("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE, 4), new d("JPEGInterchangeFormatLength", EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f2419c0 = dVarArr5;
        f2420d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", UserVerificationMethods.USER_VERIFY_HANDPRINT, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f2421e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f2422f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f2423g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f2424h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f2425i0 = dVarArr10;
        f2426j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f2427k0 = new HashMap[dVarArr10.length];
        f2428l0 = new HashMap[dVarArr10.length];
        f2429m0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2430n0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f2431o0 = charsetForName;
        f2432p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f2433q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f2425i0;
            if (i10 >= dVarArr11.length) {
                HashMap<Integer, Integer> map = f2430n0;
                d[] dVarArr12 = f2426j0;
                map.put(Integer.valueOf(dVarArr12[0].f2477a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f2477a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f2477a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f2477a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f2477a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f2477a), 8);
                f2434r0 = Pattern.compile(".*[1-9].*");
                f2435s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f2436t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f2438u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2427k0[i10] = new HashMap<>();
            f2428l0[i10] = new HashMap<>();
            for (d dVar : dVarArr11[i10]) {
                f2427k0[i10].put(Integer.valueOf(dVar.f2477a), dVar);
                f2428l0[i10].put(dVar.f2478b, dVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    private boolean A(HashMap map) throws IOException {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f2451h) <= 512 && cVar2.i(this.f2451h) <= 512;
    }

    private boolean B(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    private void C(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f2425i0.length; i10++) {
            try {
                try {
                    this.f2449f[i10] = new HashMap<>();
                } catch (Throwable th) {
                    a();
                    if (f2437u) {
                        E();
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException e10) {
                boolean z10 = f2437u;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (!z10) {
                    return;
                }
            }
        }
        if (!this.f2448e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
            this.f2447d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (L(this.f2447d)) {
            f fVar = new f(inputStream);
            if (this.f2448e) {
                n(fVar);
            } else {
                int i11 = this.f2447d;
                if (i11 == 12) {
                    e(fVar);
                } else if (i11 == 7) {
                    h(fVar);
                } else if (i11 == 10) {
                    m(fVar);
                } else {
                    k(fVar);
                }
            }
            fVar.h(this.f2459p);
            K(fVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f2447d;
            if (i12 == 4) {
                f(bVar, 0, 0);
            } else if (i12 == 13) {
                i(bVar);
            } else if (i12 == 9) {
                j(bVar);
            } else if (i12 == 14) {
                o(bVar);
            }
        }
        a();
        if (!f2437u) {
            return;
        }
        E();
    }

    private void D(b bVar) throws IOException {
        ByteOrder byteOrderF = F(bVar);
        this.f2451h = byteOrderF;
        bVar.e(byteOrderF);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f2447d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.f(i12);
        }
    }

    private void E() {
        for (int i10 = 0; i10 < this.f2449f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f2449f[i10].size());
            for (Map.Entry<String, c> entry : this.f2449f[i10].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.f2451h) + "'");
            }
        }
    }

    private ByteOrder F(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f2437u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f2437u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void G(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        D(fVar);
        H(fVar, i10);
    }

    private void I(int i10, String str, String str2) {
        if (this.f2449f[i10].isEmpty() || this.f2449f[i10].get(str) == null) {
            return;
        }
        HashMap<String, c> map = this.f2449f[i10];
        map.put(str2, map.get(str));
        this.f2449f[i10].remove(str);
    }

    private void K(b bVar) throws Throwable {
        HashMap<String, c> map = this.f2449f[4];
        c cVar = map.get("Compression");
        if (cVar == null) {
            this.f2458o = 6;
            p(bVar, map);
            return;
        }
        int i10 = cVar.i(this.f2451h);
        this.f2458o = i10;
        if (i10 != 1) {
            if (i10 == 6) {
                p(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        if (z(map)) {
            q(bVar, map);
        }
    }

    private static boolean L(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void M(int i10, int i11) throws Throwable {
        if (this.f2449f[i10].isEmpty() || this.f2449f[i11].isEmpty()) {
            if (f2437u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = this.f2449f[i10].get("ImageLength");
        c cVar2 = this.f2449f[i10].get("ImageWidth");
        c cVar3 = this.f2449f[i11].get("ImageLength");
        c cVar4 = this.f2449f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f2437u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f2437u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i12 = cVar.i(this.f2451h);
        int i13 = cVar2.i(this.f2451h);
        int i14 = cVar3.i(this.f2451h);
        int i15 = cVar4.i(this.f2451h);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap<String, c>[] mapArr = this.f2449f;
        HashMap<String, c> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private void N(f fVar, int i10) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = this.f2449f[i10].get("DefaultCropSize");
        c cVar2 = this.f2449f[i10].get("SensorTopBorder");
        c cVar3 = this.f2449f[i10].get("SensorLeftBorder");
        c cVar4 = this.f2449f[i10].get("SensorBottomBorder");
        c cVar5 = this.f2449f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                J(fVar, i10);
                return;
            }
            int i11 = cVar2.i(this.f2451h);
            int i12 = cVar4.i(this.f2451h);
            int i13 = cVar5.i(this.f2451h);
            int i14 = cVar3.i(this.f2451h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            c cVarF3 = c.f(i12 - i11, this.f2451h);
            c cVarF4 = c.f(i13 - i14, this.f2451h);
            this.f2449f[i10].put("ImageLength", cVarF3);
            this.f2449f[i10].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.f2473a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f2451h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.f2451h);
            cVarF2 = c.d(eVarArr[1], this.f2451h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f2451h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.f2451h);
            cVarF2 = c.f(iArr[1], this.f2451h);
        }
        this.f2449f[i10].put("ImageWidth", cVarF);
        this.f2449f[i10].put("ImageLength", cVarF2);
    }

    private void O() throws Throwable {
        M(0, 5);
        M(0, 4);
        M(5, 4);
        c cVar = this.f2449f[1].get("PixelXDimension");
        c cVar2 = this.f2449f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f2449f[0].put("ImageWidth", cVar);
            this.f2449f[0].put("ImageLength", cVar2);
        }
        if (this.f2449f[4].isEmpty() && A(this.f2449f[5])) {
            HashMap<String, c>[] mapArr = this.f2449f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!A(this.f2449f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        I(0, "ThumbnailOrientation", "Orientation");
        I(0, "ThumbnailImageLength", "ImageLength");
        I(0, "ThumbnailImageWidth", "ImageWidth");
        I(5, "ThumbnailOrientation", "Orientation");
        I(5, "ThumbnailImageLength", "ImageLength");
        I(5, "ThumbnailImageWidth", "ImageWidth");
        I(4, "Orientation", "ThumbnailOrientation");
        I(4, "ImageLength", "ThumbnailImageLength");
        I(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.f2449f[0].put("DateTime", c.a(strB));
        }
        if (b("ImageWidth") == null) {
            this.f2449f[0].put("ImageWidth", c.b(0L, this.f2451h));
        }
        if (b("ImageLength") == null) {
            this.f2449f[0].put("ImageLength", c.b(0L, this.f2451h));
        }
        if (b("Orientation") == null) {
            this.f2449f[0].put("Orientation", c.b(0L, this.f2451h));
        }
        if (b("LightSource") == null) {
            this.f2449f[1].put("LightSource", c.b(0L, this.f2451h));
        }
    }

    private c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f2437u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f2425i0.length; i10++) {
            c cVar = this.f2449f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void e(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                androidx.exifinterface.media.b.C0043b.a(mediaMetadataRetriever, new C0042a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f2449f[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f2451h));
                }
                if (strExtractMetadata2 != null) {
                    this.f2449f[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata2), this.f2451h));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    this.f2449f[0].put("Orientation", c.f(i10, this.f2451h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.h(i12);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f2432p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    if (fVar.read(bArr2) != i15) {
                        throw new IOException("Can't read exif");
                    }
                    this.f2459p = i14;
                    G(bArr2, 0);
                }
                if (f2437u) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    private int g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE);
        byte[] bArr = new byte[Sdk.SDKError.Reason.MEDIATION_ERROR_VALUE];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (t(bArr)) {
            return 4;
        }
        if (w(bArr)) {
            return 9;
        }
        if (s(bArr)) {
            return 12;
        }
        if (u(bArr)) {
            return 7;
        }
        if (x(bArr)) {
            return 10;
        }
        if (v(bArr)) {
            return 13;
        }
        return B(bArr) ? 14 : 0;
    }

    private void h(f fVar) throws Throwable {
        int i10;
        int i11;
        k(fVar);
        c cVar = this.f2449f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f2476d);
            fVar2.e(this.f2451h);
            byte[] bArr = E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.h(0L);
            byte[] bArr3 = F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.h(12L);
            }
            H(fVar2, 6);
            c cVar2 = this.f2449f[7].get("PreviewImageStart");
            c cVar3 = this.f2449f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f2449f[5].put("JPEGInterchangeFormat", cVar2);
                this.f2449f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f2449f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f2451h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarF = c.f(i14, this.f2451h);
                c cVarF2 = c.f(i15, this.f2451h);
                this.f2449f[0].put("ImageWidth", cVarF);
                this.f2449f[0].put("ImageLength", cVarF2);
            }
        }
    }

    private void i(b bVar) throws Throwable {
        if (f2437u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.BIG_ENDIAN);
        byte[] bArr = G;
        bVar.f(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int i10 = bVar.readInt();
                int i11 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i12 = i11 + 4;
                if (i12 == 16 && !Arrays.equals(bArr2, I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, J)) {
                    return;
                }
                if (Arrays.equals(bArr2, H)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int i13 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i13) {
                        this.f2459p = i12;
                        G(bArr3, 0);
                        O();
                        K(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i13 + ", calculated CRC value: " + crc32.getValue());
                }
                int i14 = i10 + 4;
                bVar.f(i14);
                length = i12 + i14;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) throws Throwable {
        boolean z10 = f2437u;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.f(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.f(i10 - bVar.b());
        bVar.read(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.f(i12 - bVar.b());
        bVar.e(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f2420d0.f2477a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarF = c.f(s10, this.f2451h);
                c cVarF2 = c.f(s11, this.f2451h);
                this.f2449f[0].put("ImageLength", cVarF);
                this.f2449f[0].put("ImageWidth", cVarF2);
                if (f2437u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.f(unsignedShort2);
        }
    }

    private void k(f fVar) throws Throwable {
        c cVar;
        D(fVar);
        H(fVar, 0);
        N(fVar, 0);
        N(fVar, 5);
        N(fVar, 4);
        O();
        if (this.f2447d != 8 || (cVar = this.f2449f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f2476d);
        fVar2.e(this.f2451h);
        fVar2.f(6);
        H(fVar2, 9);
        c cVar2 = this.f2449f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f2449f[1].put("ColorSpace", cVar2);
        }
    }

    private void m(f fVar) throws Throwable {
        if (f2437u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = this.f2449f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f2476d), (int) cVar.f2475c, 5);
        }
        c cVar2 = this.f2449f[0].get("ISO");
        c cVar3 = this.f2449f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f2449f[1].put("PhotographicSensitivity", cVar2);
    }

    private void n(f fVar) throws IOException {
        byte[] bArr = f2432p0;
        fVar.f(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f2459p = bArr.length;
        G(bArr2, 0);
    }

    private void o(b bVar) throws Throwable {
        if (f2437u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.e(ByteOrder.LITTLE_ENDIAN);
        bVar.f(K.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.f(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 4 + 4;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f2459p = i12;
                        G(bArr3, 0);
                        K(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.f(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void p(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f2451h);
        int i11 = cVar2.i(this.f2451h);
        if (this.f2447d == 7) {
            i10 += this.f2460q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f2452i = true;
            if (this.f2444a == null && this.f2446c == null && this.f2445b == null) {
                byte[] bArr = new byte[i11];
                bVar.skip(i10);
                bVar.read(bArr);
                this.f2457n = bArr;
            }
            this.f2455l = i10;
            this.f2456m = i11;
        }
        if (f2437u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    private void q(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrB = androidx.exifinterface.media.b.b(cVar.k(this.f2451h));
        long[] jArrB2 = androidx.exifinterface.media.b.b(cVar2.k(this.f2451h));
        if (jArrB == null || jArrB.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrB2 == null || jArrB2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrB.length != jArrB2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrB2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f2454k = true;
        this.f2453j = true;
        this.f2452i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrB.length; i13++) {
            int i14 = (int) jArrB[i13];
            int i15 = (int) jArrB2[i13];
            if (i13 < jArrB.length - 1 && i14 + i15 != jArrB[i13 + 1]) {
                this.f2454k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j12 = i16;
            if (bVar.skip(j12) != j12) {
                Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (bVar.read(bArr2) != i15) {
                Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f2457n = bArr;
        if (this.f2454k) {
            this.f2455l = (int) jArrB[0];
            this.f2456m = i10;
        }
    }

    private static boolean r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f2432p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f2432p0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean s(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.read(bArr2);
                    if (!Arrays.equals(bArr2, B)) {
                        bVar2.close();
                        return false;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j10 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        if (bVar2.read(bArr3) != 4) {
                            bVar2.close();
                            return false;
                        }
                        if (j12 != 1) {
                            if (Arrays.equals(bArr3, C)) {
                                z10 = true;
                            } else if (Arrays.equals(bArr3, D)) {
                                z11 = true;
                            }
                            if (z10 && z11) {
                                bVar2.close();
                                return true;
                            }
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f2437u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean t(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean u(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderF = F(bVar2);
                this.f2451h = byteOrderF;
                bVar2.e(byteOrderF);
                short s10 = bVar2.readShort();
                boolean z10 = s10 == 20306 || s10 == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean v(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = G;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean w(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean x(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderF = F(bVar2);
                this.f2451h = byteOrderF;
                bVar2.e(byteOrderF);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean y(FileDescriptor fileDescriptor) {
        try {
            androidx.exifinterface.media.b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f2437u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean z(HashMap map) throws IOException {
        c cVar;
        int i10;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f2451h);
            int[] iArr2 = f2441x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f2447d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f2451h)) == 1 && Arrays.equals(iArr, f2443z)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f2437u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    public int c(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD == null) {
            return i10;
        }
        try {
            return cVarD.i(this.f2451h);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    /* JADX INFO: loaded from: classes.dex */
    private static class f extends b {
        f(byte[] bArr) throws IOException {
            super(bArr);
            this.f2469a.mark(Integer.MAX_VALUE);
        }

        public void h(long j10) throws IOException {
            int i10 = this.f2471c;
            if (i10 > j10) {
                this.f2471c = 0;
                this.f2469a.reset();
            } else {
                j10 -= (long) i10;
            }
            f((int) j10);
        }

        f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f2469a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    public a(InputStream inputStream, int i10) throws IOException {
        d[][] dVarArr = f2425i0;
        this.f2449f = new HashMap[dVarArr.length];
        this.f2450g = new HashSet(dVarArr.length);
        this.f2451h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f2444a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f2432p0.length);
            if (!r(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f2448e = true;
            this.f2446c = null;
            this.f2445b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f2446c = (AssetManager.AssetInputStream) inputStream;
            this.f2445b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (y(fileInputStream.getFD())) {
                this.f2446c = null;
                this.f2445b = fileInputStream.getFD();
            } else {
                this.f2446c = null;
                this.f2445b = null;
            }
        } else {
            this.f2446c = null;
            this.f2445b = null;
        }
        C(inputStream);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:115:0x0317  */
    /* JADX WARN: Code duplicated, block: B:139:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:52:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x0167  */
    /* JADX WARN: Code duplicated, block: B:57:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0174  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01db  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x0200  */
    /* JADX WARN: Code duplicated, block: B:74:0x0203  */
    /* JADX WARN: Code duplicated, block: B:76:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0208  */
    /* JADX WARN: Code duplicated, block: B:79:0x020c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0218  */
    /* JADX WARN: Code duplicated, block: B:84:0x021d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0222  */
    /* JADX WARN: Code duplicated, block: B:88:0x0229  */
    /* JADX WARN: Code duplicated, block: B:91:0x0247  */
    /* JADX WARN: Code duplicated, block: B:93:0x0254  */
    /* JADX WARN: Code duplicated, block: B:94:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0261  */
    /* JADX WARN: Code duplicated, block: B:96:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0285  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a0  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0149, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01db, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0261, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0285, please report this as an issue */
    private void H(f fVar, int i10) throws IOException {
        String str;
        short s10;
        long j10;
        boolean z10;
        Integer num;
        String str2;
        long j11;
        int unsignedShort;
        long jC;
        int i11;
        this.f2450g.add(Integer.valueOf(fVar.f2471c));
        short s11 = fVar.readShort();
        String str3 = "ExifInterface";
        if (f2437u) {
            Log.d("ExifInterface", NyXuoef.JSLhmBBtZ + ((int) s11));
        }
        if (s11 <= 0) {
            return;
        }
        char c10 = 0;
        short s12 = 0;
        while (s12 < s11) {
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i12 = fVar.readInt();
            long jB = ((long) fVar.b()) + 4;
            d dVar = f2427k0[i10].get(Integer.valueOf(unsignedShort2));
            boolean z11 = f2437u;
            if (z11) {
                Object[] objArr = new Object[5];
                objArr[c10] = Integer.valueOf(i10);
                objArr[1] = Integer.valueOf(unsignedShort2);
                objArr[2] = dVar != null ? dVar.f2478b : null;
                objArr[3] = Integer.valueOf(unsignedShort3);
                objArr[4] = Integer.valueOf(i12);
                Log.d(str3, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (dVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = W;
                    if (unsignedShort3 < iArr.length) {
                        if (dVar.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = dVar.f2479c;
                            }
                            str = str3;
                            s10 = s12;
                            j10 = ((long) i12) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z11) {
                                    Log.d(str, "Skip the tag entry since the number of components is invalid: " + i12);
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (z11) {
                            Log.d(str3, "Skip the tag entry since data format (" + V[unsignedShort3] + ") is unexpected for tag: " + dVar.f2478b);
                        }
                    }
                    if (z10) {
                        if (j10 > 4) {
                            i11 = fVar.readInt();
                            if (z11) {
                                Log.d(str, "seek to data offset: " + i11);
                            }
                            if (this.f2447d == 7) {
                                if ("MakerNote".equals(dVar.f2478b)) {
                                    this.f2460q = i11;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar.f2478b)) {
                                    this.f2461r = i11;
                                    this.f2462s = i12;
                                    c cVarF = c.f(6, this.f2451h);
                                    c cVarB = c.b(this.f2461r, this.f2451h);
                                    c cVarB2 = c.b(this.f2462s, this.f2451h);
                                    this.f2449f[4].put("Compression", cVarF);
                                    this.f2449f[4].put("JPEGInterchangeFormat", cVarB);
                                    this.f2449f[4].put("JPEGInterchangeFormatLength", cVarB2);
                                }
                            }
                            fVar.h(i11);
                        } else {
                            jB = jB;
                            str = str;
                            i12 = i12;
                        }
                        num = f2430n0.get(Integer.valueOf(unsignedShort2));
                        if (z11) {
                            str2 = str;
                            Log.d(str2, "nextIfdType: " + num + " byteCount: " + j10);
                        } else {
                            str2 = str;
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    jC = fVar.c();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    jC = -1;
                                }
                                if (z11) {
                                    Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jC), dVar.f2478b));
                                }
                                if (jC > 0) {
                                    if (!this.f2450g.contains(Integer.valueOf((int) jC))) {
                                        fVar.h(jC);
                                        H(fVar, num.intValue());
                                    } else if (z11) {
                                        Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jC + ")");
                                    }
                                } else if (z11) {
                                    Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jC);
                                }
                                fVar.h(jB);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            jC = unsignedShort;
                            if (z11) {
                                Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jC), dVar.f2478b));
                            }
                            if (jC > 0) {
                                if (!this.f2450g.contains(Integer.valueOf((int) jC))) {
                                    fVar.h(jC);
                                    H(fVar, num.intValue());
                                } else if (z11) {
                                    Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jC + ")");
                                }
                            } else if (z11) {
                                Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jC);
                            }
                            fVar.h(jB);
                        } else {
                            j11 = jB;
                            int iB = fVar.b() + this.f2459p;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            c cVar = new c(unsignedShort3, i12, iB, bArr);
                            this.f2449f[i10].put(dVar.f2478b, cVar);
                            if ("DNGVersion".equals(dVar.f2478b)) {
                                this.f2447d = 3;
                            }
                            if (((!"Make".equals(dVar.f2478b) || "Model".equals(dVar.f2478b)) && cVar.j(this.f2451h).contains("PENTAX")) || ("Compression".equals(dVar.f2478b) && cVar.i(this.f2451h) == 65535)) {
                                this.f2447d = 8;
                            }
                            if (fVar.b() != j11) {
                                fVar.h(j11);
                            }
                        }
                    } else {
                        fVar.h(jB);
                        s11 = s11;
                        str2 = str;
                    }
                    s12 = (short) (s10 + 1);
                    str3 = str2;
                    s11 = s11;
                    c10 = 0;
                }
                str = str3;
                s10 = s12;
                if (z11) {
                    Log.d(str, "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z10 = false;
                if (z10) {
                    fVar.h(jB);
                    s11 = s11;
                    str2 = str;
                } else {
                    if (j10 > 4) {
                        i11 = fVar.readInt();
                        if (z11) {
                            Log.d(str, "seek to data offset: " + i11);
                        }
                        if (this.f2447d == 7) {
                            if ("MakerNote".equals(dVar.f2478b)) {
                                this.f2460q = i11;
                            } else if (i10 != 6) {
                            }
                        }
                        fVar.h(i11);
                    } else {
                        jB = jB;
                        str = str;
                        i12 = i12;
                    }
                    num = f2430n0.get(Integer.valueOf(unsignedShort2));
                    if (z11) {
                        str2 = str;
                        Log.d(str2, "nextIfdType: " + num + " byteCount: " + j10);
                    } else {
                        str2 = str;
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                jC = fVar.c();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z11) {
                                Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jC), dVar.f2478b));
                            }
                            if (jC > 0) {
                                if (!this.f2450g.contains(Integer.valueOf((int) jC))) {
                                    fVar.h(jC);
                                    H(fVar, num.intValue());
                                } else if (z11) {
                                    Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jC + ")");
                                }
                            } else if (z11) {
                                Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jC);
                            }
                            fVar.h(jB);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        jC = unsignedShort;
                        if (z11) {
                            Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jC), dVar.f2478b));
                        }
                        if (jC > 0) {
                            if (!this.f2450g.contains(Integer.valueOf((int) jC))) {
                                fVar.h(jC);
                                H(fVar, num.intValue());
                            } else if (z11) {
                                Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jC + ")");
                            }
                        } else if (z11) {
                            Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jC);
                        }
                        fVar.h(jB);
                    } else {
                        j11 = jB;
                        int iB2 = fVar.b() + this.f2459p;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(unsignedShort3, i12, iB2, bArr2);
                        this.f2449f[i10].put(dVar.f2478b, cVar2);
                        if ("DNGVersion".equals(dVar.f2478b)) {
                            this.f2447d = 3;
                        }
                        if (!"Make".equals(dVar.f2478b)) {
                        }
                        this.f2447d = 8;
                        if (fVar.b() != j11) {
                            fVar.h(j11);
                        }
                    }
                }
                s12 = (short) (s10 + 1);
                str3 = str2;
                s11 = s11;
                c10 = 0;
            } else if (z11) {
                Log.d(str3, "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            str = str3;
            s10 = s12;
            j10 = 0;
            z10 = false;
            if (z10) {
                fVar.h(jB);
                s11 = s11;
                str2 = str;
            } else {
                if (j10 > 4) {
                    i11 = fVar.readInt();
                    if (z11) {
                        Log.d(str, "seek to data offset: " + i11);
                    }
                    if (this.f2447d == 7) {
                        if ("MakerNote".equals(dVar.f2478b)) {
                            this.f2460q = i11;
                        } else if (i10 != 6) {
                        }
                    }
                    fVar.h(i11);
                } else {
                    jB = jB;
                    str = str;
                    i12 = i12;
                }
                num = f2430n0.get(Integer.valueOf(unsignedShort2));
                if (z11) {
                    str2 = str;
                    Log.d(str2, "nextIfdType: " + num + " byteCount: " + j10);
                } else {
                    str2 = str;
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            jC = fVar.c();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z11) {
                            Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jC), dVar.f2478b));
                        }
                        if (jC > 0) {
                            if (!this.f2450g.contains(Integer.valueOf((int) jC))) {
                                fVar.h(jC);
                                H(fVar, num.intValue());
                            } else if (z11) {
                                Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jC + ")");
                            }
                        } else if (z11) {
                            Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jC);
                        }
                        fVar.h(jB);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    jC = unsignedShort;
                    if (z11) {
                        Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(jC), dVar.f2478b));
                    }
                    if (jC > 0) {
                        if (!this.f2450g.contains(Integer.valueOf((int) jC))) {
                            fVar.h(jC);
                            H(fVar, num.intValue());
                        } else if (z11) {
                            Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jC + ")");
                        }
                    } else if (z11) {
                        Log.d(str2, "Skip jump into the IFD since its offset is invalid: " + jC);
                    }
                    fVar.h(jB);
                } else {
                    j11 = jB;
                    int iB3 = fVar.b() + this.f2459p;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(unsignedShort3, i12, iB3, bArr3);
                    this.f2449f[i10].put(dVar.f2478b, cVar3);
                    if ("DNGVersion".equals(dVar.f2478b)) {
                        this.f2447d = 3;
                    }
                    if (!"Make".equals(dVar.f2478b)) {
                    }
                    this.f2447d = 8;
                    if (fVar.b() != j11) {
                        fVar.h(j11);
                    }
                }
            }
            s12 = (short) (s10 + 1);
            str3 = str2;
            s11 = s11;
            c10 = 0;
        }
        String str4 = str3;
        int i13 = fVar.readInt();
        boolean z12 = f2437u;
        if (z12) {
            Log.d(str4, String.format("nextIfdOffset: %d", Integer.valueOf(i13)));
        }
        long j12 = i13;
        if (j12 <= 0) {
            if (z12) {
                Log.d(str4, "Stop reading file since a wrong offset may cause an infinite loop: " + i13);
                return;
            }
            return;
        }
        if (this.f2450g.contains(Integer.valueOf(i13))) {
            if (z12) {
                Log.d(str4, "Stop reading file since re-reading an IFD may cause an infinite loop: " + i13);
                return;
            }
            return;
        }
        fVar.h(j12);
        if (this.f2449f[4].isEmpty()) {
            H(fVar, 4);
        } else if (this.f2449f[5].isEmpty()) {
            H(fVar, 5);
        }
    }

    private void J(f fVar, int i10) throws Throwable {
        c cVar = this.f2449f[i10].get(TwDPD.BftKzOoBokz);
        c cVar2 = this.f2449f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f2449f[i10].get("JPEGInterchangeFormat");
            c cVar4 = this.f2449f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f2451h);
            int i12 = cVar3.i(this.f2451h);
            fVar.h(i11);
            byte[] bArr = new byte[i12];
            fVar.read(bArr);
            f(new b(bArr), i11, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0185 A[LOOP:0: B:10:0x0038->B:63:0x0185, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x018f A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void f(androidx.exifinterface.media.a.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.f(androidx.exifinterface.media.a$b, int, int):void");
    }

    public String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            if (!f2429m0.contains(str)) {
                return cVarD.j(this.f2451h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarD.f2473a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", elEbP.qZlCGcvfuwVRGv + cVarD.f2473a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarD.k(this.f2451h);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    e eVar2 = eVarArr[1];
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (eVar.f2481a / eVar.f2482b)), Integer.valueOf((int) (eVar2.f2481a / eVar2.f2482b)), Integer.valueOf((int) (eVar3.f2481a / eVar3.f2482b)));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(cVarD.h(this.f2451h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: ExifInterface.java */
    /* JADX INFO: loaded from: classes.dex */
    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2480d;

        d(String str, int i10, int i11) {
            this.f2478b = str;
            this.f2477a = i10;
            this.f2479c = i11;
            this.f2480d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f2479c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f2480d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f2478b = str;
            this.f2477a = i10;
            this.f2479c = i11;
            this.f2480d = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExifInterface.java */
    /* JADX INFO: loaded from: classes.dex */
    class C0042a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f2464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f2465b;

        C0042a(f fVar) {
            this.f2465b = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f2464a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f2465b.available())) {
                        return -1;
                    }
                    this.f2465b.h(j10);
                    this.f2464a = j10;
                }
                if (i11 > this.f2465b.available()) {
                    i11 = this.f2465b.available();
                }
                int i12 = this.f2465b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f2464a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f2464a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}

package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f2126b = new j(y.f2396d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f2127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<g> f2128d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2129a = 0;

    /* JADX INFO: compiled from: ByteString.java */
    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2130a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2131b;

        a() {
            this.f2131b = g.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2130a < this.f2131b;
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0040g
        public byte nextByte() {
            int i10 = this.f2130a;
            if (i10 >= this.f2131b) {
                throw new NoSuchElementException();
            }
            this.f2130a = i10 + 1;
            return g.this.t(i10);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    class b implements Comparator<g> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0040g it = gVar.iterator();
            InterfaceC0040g it2 = gVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(g.F(it.nextByte())).compareTo(Integer.valueOf(g.F(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    static abstract class c implements InterfaceC0040g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f2133f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f2134g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            g.g(i10, i10 + i11, bArr.length);
            this.f2133f = i10;
            this.f2134g = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.g.j
        protected int U() {
            return this.f2133f;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte e(int i10) {
            g.f(i10, size());
            return this.f2137e[this.f2133f + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        protected void s(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2137e, U() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f2134g;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        byte t(int i10) {
            return this.f2137e[this.f2133f + i10];
        }

        Object writeReplace() {
            return g.H(D());
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private interface f {
        byte[] copyFrom(byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteString.java */
    public interface InterfaceC0040g extends Iterator<Byte> {
        byte nextByte();
    }

    /* JADX INFO: compiled from: ByteString.java */
    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f2135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f2136b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public g a() {
            this.f2135a.c();
            return new j(this.f2136b);
        }

        public CodedOutputStream b() {
            return this.f2135a;
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f2136b = bArr;
            this.f2135a = CodedOutputStream.f0(bArr);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    static abstract class i extends g {
        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        private i() {
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f2137e;

        j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f2137e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g C(int i10, int i11) {
            int iG = g.g(i10, i11, size());
            return iG == 0 ? g.f2126b : new e(this.f2137e, U() + i10, iG);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        final void K(androidx.datastore.preferences.protobuf.f fVar) throws IOException {
            fVar.a(this.f2137e, U(), size());
        }

        final boolean N(g gVar, int i10, int i11) {
            if (i11 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + gVar.size());
            }
            if (!(gVar instanceof j)) {
                return gVar.C(i10, i12).equals(C(0, i11));
            }
            j jVar = (j) gVar;
            byte[] bArr = this.f2137e;
            byte[] bArr2 = jVar.f2137e;
            int iU = U() + i11;
            int iU2 = U();
            int iU3 = jVar.U() + i10;
            while (iU2 < iU) {
                if (bArr[iU2] != bArr2[iU3]) {
                    return false;
                }
                iU2++;
                iU3++;
            }
            return true;
        }

        protected int U() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte e(int i10) {
            return this.f2137e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iB = B();
            int iB2 = jVar.B();
            if (iB == 0 || iB2 == 0 || iB == iB2) {
                return N(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected void s(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f2137e, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f2137e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        byte t(int i10) {
            return this.f2137e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final androidx.datastore.preferences.protobuf.h x() {
            return androidx.datastore.preferences.protobuf.h.k(this.f2137e, U(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final int z(int i10, int i11, int i12) {
            return y.h(i10, this.f2137e, U() + i11, i12);
        }
    }

    /* JADX INFO: compiled from: ByteString.java */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] copyFrom(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f2127c = androidx.datastore.preferences.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f2128d = new b();
    }

    g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(byte b10) {
        return b10 & 255;
    }

    private String G() {
        if (size() <= 50) {
            return j1.a(this);
        }
        return j1.a(C(0, 47)) + "...";
    }

    static g H(byte[] bArr) {
        return new j(bArr);
    }

    static g I(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void f(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int g(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static g h(byte[] bArr) {
        return o(bArr, 0, bArr.length);
    }

    public static g o(byte[] bArr, int i10, int i11) {
        g(i10, i10 + i11, bArr.length);
        return new j(f2127c.copyFrom(bArr, i10, i11));
    }

    public static g p(String str) {
        return new j(str.getBytes(y.f2394b));
    }

    static h w(int i10) {
        return new h(i10, null);
    }

    protected final int B() {
        return this.f2129a;
    }

    public abstract g C(int i10, int i11);

    public final byte[] D() {
        int size = size();
        if (size == 0) {
            return y.f2396d;
        }
        byte[] bArr = new byte[size];
        s(bArr, 0, 0, size);
        return bArr;
    }

    abstract void K(androidx.datastore.preferences.protobuf.f fVar) throws IOException;

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZ = this.f2129a;
        if (iZ == 0) {
            int size = size();
            iZ = z(size, 0, size);
            if (iZ == 0) {
                iZ = 1;
            }
            this.f2129a = iZ;
        }
        return iZ;
    }

    protected abstract void s(byte[] bArr, int i10, int i11, int i12);

    public abstract int size();

    abstract byte t(int i10);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), G());
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceC0040g iterator() {
        return new a();
    }

    public abstract androidx.datastore.preferences.protobuf.h x();

    protected abstract int z(int i10, int i11, int i12);
}

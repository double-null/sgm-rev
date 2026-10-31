package com.explorestack.protobuf;

import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: RopeByteString.java */
/* JADX INFO: loaded from: classes.dex */
final class a2 extends ByteString {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f10173f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, EventTypeExtended.EVENT_TYPE_EXTENDED_RESUME_VALUE, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteString f10175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteString f10176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f10178e;

    /* JADX INFO: compiled from: RopeByteString.java */
    class a extends ByteString.AbstractByteIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f10179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ByteString.ByteIterator f10180b = a();

        a() {
            this.f10179a = new c(a2.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.explorestack.protobuf.ByteString$ByteIterator] */
        private ByteString.ByteIterator a() {
            if (this.f10179a.hasNext()) {
                return this.f10179a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10180b != null;
        }

        @Override // com.explorestack.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f10180b;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.f10180b.hasNext()) {
                this.f10180b = a();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    private static final class c implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<a2> f10183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteString.LeafByteString f10184b;

        /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        private ByteString.LeafByteString a(ByteString byteString) {
            while (byteString instanceof a2) {
                a2 a2Var = (a2) byteString;
                this.f10183a.push(a2Var);
                byteString = a2Var.f10175b;
            }
            return (ByteString.LeafByteString) byteString;
        }

        private ByteString.LeafByteString b() {
            ByteString.LeafByteString leafByteStringA;
            do {
                ArrayDeque<a2> arrayDeque = this.f10183a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByteStringA = a(this.f10183a.pop().f10176c);
            } while (leafByteStringA.isEmpty());
            return leafByteStringA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f10184b;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.f10184b = b();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10184b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(ByteString byteString) {
            if (!(byteString instanceof a2)) {
                this.f10183a = null;
                this.f10184b = (ByteString.LeafByteString) byteString;
                return;
            }
            a2 a2Var = (a2) byteString;
            ArrayDeque<a2> arrayDeque = new ArrayDeque<>(a2Var.getTreeDepth());
            this.f10183a = arrayDeque;
            arrayDeque.push(a2Var);
            this.f10184b = a(a2Var.f10175b);
        }
    }

    /* synthetic */ a2(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    static ByteString f(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return g(byteString, byteString2);
        }
        if (byteString instanceof a2) {
            a2 a2Var = (a2) byteString;
            if (a2Var.f10176c.size() + byteString2.size() < 128) {
                return new a2(a2Var.f10175b, g(a2Var.f10176c, byteString2));
            }
            if (a2Var.f10175b.getTreeDepth() > a2Var.f10176c.getTreeDepth() && a2Var.getTreeDepth() > byteString2.getTreeDepth()) {
                return new a2(a2Var.f10175b, new a2(a2Var.f10176c, byteString2));
            }
        }
        return size >= o(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new a2(byteString, byteString2) : new b(null).b(byteString, byteString2);
    }

    private static ByteString g(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean h(ByteString byteString) {
        ByteString.LeafByteString next;
        a aVar = null;
        c cVar = new c(this, aVar);
        ByteString.LeafByteString next2 = cVar.next();
        c cVar2 = new c(byteString, aVar);
        ByteString.LeafByteString next3 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next2.size() - i10;
            int size2 = next3.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next2.equalsRange(next3, i11, iMin) : next3.equalsRange(next2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f10174a;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = cVar2.next();
                i11 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i11 += iMin;
            }
        }
    }

    static int o(int i10) {
        int[] iArr = f10173f;
        if (i10 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.explorestack.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte byteAt(int i10) {
        ByteString.checkIndex(i10, this.f10174a);
        return internalByteAt(i10);
    }

    @Override // com.explorestack.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.f10175b.copyTo(byteBuffer);
        this.f10176c.copyTo(byteBuffer);
    }

    @Override // com.explorestack.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f10177d;
        if (i13 <= i14) {
            this.f10175b.copyToInternal(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f10176c.copyToInternal(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f10175b.copyToInternal(bArr, i10, i11, i15);
            this.f10176c.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f10174a != byteString.size()) {
            return false;
        }
        if (this.f10174a == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return h(byteString);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int getTreeDepth() {
        return this.f10178e;
    }

    @Override // com.explorestack.protobuf.ByteString
    byte internalByteAt(int i10) {
        int i11 = this.f10177d;
        return i10 < i11 ? this.f10175b.internalByteAt(i10) : this.f10176c.internalByteAt(i10 - i11);
    }

    @Override // com.explorestack.protobuf.ByteString
    protected boolean isBalanced() {
        return this.f10174a >= o(this.f10178e);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f10175b.partialIsValidUtf8(0, 0, this.f10177d);
        ByteString byteString = this.f10176c;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.explorestack.protobuf.ByteString
    public n newCodedInput() {
        return n.i(asReadOnlyByteBufferList(), true);
    }

    @Override // com.explorestack.protobuf.ByteString
    public InputStream newInput() {
        return new d();
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f10177d;
        if (i13 <= i14) {
            return this.f10175b.partialHash(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f10176c.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f10176c.partialHash(this.f10175b.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.explorestack.protobuf.ByteString
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f10177d;
        if (i13 <= i14) {
            return this.f10175b.partialIsValidUtf8(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f10176c.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f10176c.partialIsValidUtf8(this.f10175b.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.explorestack.protobuf.ByteString
    public int size() {
        return this.f10174a;
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        int iCheckRange = ByteString.checkRange(i10, i11, this.f10174a);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.f10174a) {
            return this;
        }
        int i12 = this.f10177d;
        if (i11 <= i12) {
            return this.f10175b.substring(i10, i11);
        }
        return i10 >= i12 ? this.f10176c.substring(i10 - i12, i11 - i12) : new a2(this.f10175b.substring(i10), this.f10176c.substring(0, i11 - this.f10177d));
    }

    @Override // com.explorestack.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    Object writeReplace() {
        return ByteString.wrap(toByteArray());
    }

    @Override // com.explorestack.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f10175b.writeTo(outputStream);
        this.f10176c.writeTo(outputStream);
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f10177d;
        if (i12 <= i13) {
            this.f10175b.writeToInternal(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f10176c.writeToInternal(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f10175b.writeToInternal(outputStream, i10, i14);
            this.f10176c.writeToInternal(outputStream, 0, i11 - i14);
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeToReverse(l lVar) throws IOException {
        this.f10176c.writeToReverse(lVar);
        this.f10175b.writeToReverse(lVar);
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<ByteString> f10182a;

        private b() {
            this.f10182a = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.f10182a.pop();
            while (!this.f10182a.isEmpty()) {
                byteStringPop = new a2(this.f10182a.pop(), byteStringPop, null);
            }
            return byteStringPop;
        }

        private void c(ByteString byteString) {
            if (byteString.isBalanced()) {
                e(byteString);
                return;
            }
            if (byteString instanceof a2) {
                a2 a2Var = (a2) byteString;
                c(a2Var.f10175b);
                c(a2Var.f10176c);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(a2.f10173f, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(ByteString byteString) {
            a aVar;
            int iD = d(byteString.size());
            int iO = a2.o(iD + 1);
            if (this.f10182a.isEmpty() || this.f10182a.peek().size() >= iO) {
                this.f10182a.push(byteString);
                return;
            }
            int iO2 = a2.o(iD);
            ByteString byteStringPop = this.f10182a.pop();
            while (true) {
                aVar = null;
                if (this.f10182a.isEmpty() || this.f10182a.peek().size() >= iO2) {
                    break;
                } else {
                    byteStringPop = new a2(this.f10182a.pop(), byteStringPop, aVar);
                }
            }
            a2 a2Var = new a2(byteStringPop, byteString, aVar);
            while (!this.f10182a.isEmpty()) {
                if (this.f10182a.peek().size() >= a2.o(d(a2Var.size()) + 1)) {
                    break;
                } else {
                    a2Var = new a2(this.f10182a.pop(), a2Var, aVar);
                }
            }
            this.f10182a.push(a2Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private a2(ByteString byteString, ByteString byteString2) {
        this.f10175b = byteString;
        this.f10176c = byteString2;
        int size = byteString.size();
        this.f10177d = size;
        this.f10174a = size + byteString2.size();
        this.f10178e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.explorestack.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.explorestack.protobuf.ByteString
    void writeTo(l lVar) throws IOException {
        this.f10175b.writeTo(lVar);
        this.f10176c.writeTo(lVar);
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    private class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f10185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteString.LeafByteString f10186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10190f;

        public d() {
            e();
        }

        private void b() {
            if (this.f10186b != null) {
                int i10 = this.f10188d;
                int i11 = this.f10187c;
                if (i10 == i11) {
                    this.f10189e += i11;
                    this.f10188d = 0;
                    if (!this.f10185a.hasNext()) {
                        this.f10186b = null;
                        this.f10187c = 0;
                    } else {
                        ByteString.LeafByteString next = this.f10185a.next();
                        this.f10186b = next;
                        this.f10187c = next.size();
                    }
                }
            }
        }

        private int c() {
            return a2.this.size() - (this.f10189e + this.f10188d);
        }

        private void e() {
            c cVar = new c(a2.this, null);
            this.f10185a = cVar;
            ByteString.LeafByteString next = cVar.next();
            this.f10186b = next;
            this.f10187c = next.size();
            this.f10188d = 0;
            this.f10189e = 0;
        }

        private int f(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                b();
                if (this.f10186b == null) {
                    break;
                }
                int iMin = Math.min(this.f10187c - this.f10188d, i12);
                if (bArr != null) {
                    this.f10186b.copyTo(bArr, this.f10188d, i10, iMin);
                    i10 += iMin;
                }
                this.f10188d += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return c();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f10190f = this.f10189e + this.f10188d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            int iF = f(bArr, i10, i11);
            if (iF != 0) {
                return iF;
            }
            if (i11 > 0 || c() == 0) {
                return -1;
            }
            return iF;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            e();
            f(null, 0, this.f10190f);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return f(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            b();
            ByteString.LeafByteString leafByteString = this.f10186b;
            if (leafByteString == null) {
                return -1;
            }
            int i10 = this.f10188d;
            this.f10188d = i10 + 1;
            return leafByteString.byteAt(i10) & 255;
        }
    }
}

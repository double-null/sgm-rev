package com.google.protobuf;

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
/* JADX INFO: loaded from: classes4.dex */
final class k1 extends i {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, EventTypeExtended.EVENT_TYPE_EXTENDED_RESUME_VALUE, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final i left;
    private final int leftLength;
    private final i right;
    private final int totalLength;
    private final int treeDepth;

    /* JADX INFO: compiled from: RopeByteString.java */
    class a extends i.c {
        i.g current = nextPiece();
        final c pieces;

        a() {
            this.pieces = new c(k1.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.i$g] */
        private i.g nextPiece() {
            if (this.pieces.hasNext()) {
                return this.pieces.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current != null;
        }

        @Override // com.google.protobuf.i.c, com.google.protobuf.i.g
        public byte nextByte() {
            i.g gVar = this.current;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return bNextByte;
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    private static final class c implements Iterator<i.AbstractC0158i> {
        private final ArrayDeque<k1> breadCrumbs;
        private i.AbstractC0158i next;

        /* synthetic */ c(i iVar, a aVar) {
            this(iVar);
        }

        private i.AbstractC0158i getLeafByLeft(i iVar) {
            while (iVar instanceof k1) {
                k1 k1Var = (k1) iVar;
                this.breadCrumbs.push(k1Var);
                iVar = k1Var.left;
            }
            return (i.AbstractC0158i) iVar;
        }

        private i.AbstractC0158i getNextNonEmptyLeaf() {
            i.AbstractC0158i leafByLeft;
            do {
                ArrayDeque<k1> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(i iVar) {
            if (!(iVar instanceof k1)) {
                this.breadCrumbs = null;
                this.next = (i.AbstractC0158i) iVar;
                return;
            }
            k1 k1Var = (k1) iVar;
            ArrayDeque<k1> arrayDeque = new ArrayDeque<>(k1Var.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(k1Var);
            this.next = getLeafByLeft(k1Var.left);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public i.AbstractC0158i next() {
            i.AbstractC0158i abstractC0158i = this.next;
            if (abstractC0158i == null) {
                throw new NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return abstractC0158i;
        }
    }

    /* synthetic */ k1(i iVar, i iVar2, a aVar) {
        this(iVar, iVar2);
    }

    static i concatenate(i iVar, i iVar2) {
        if (iVar2.size() == 0) {
            return iVar;
        }
        if (iVar.size() == 0) {
            return iVar2;
        }
        int size = iVar.size() + iVar2.size();
        if (size < 128) {
            return concatenateBytes(iVar, iVar2);
        }
        if (iVar instanceof k1) {
            k1 k1Var = (k1) iVar;
            if (k1Var.right.size() + iVar2.size() < 128) {
                return new k1(k1Var.left, concatenateBytes(k1Var.right, iVar2));
            }
            if (k1Var.left.getTreeDepth() > k1Var.right.getTreeDepth() && k1Var.getTreeDepth() > iVar2.getTreeDepth()) {
                return new k1(k1Var.left, new k1(k1Var.right, iVar2));
            }
        }
        return size >= minLength(Math.max(iVar.getTreeDepth(), iVar2.getTreeDepth()) + 1) ? new k1(iVar, iVar2) : new b(null).balance(iVar, iVar2);
    }

    private static i concatenateBytes(i iVar, i iVar2) {
        int size = iVar.size();
        int size2 = iVar2.size();
        byte[] bArr = new byte[size + size2];
        iVar.copyTo(bArr, 0, 0, size);
        iVar2.copyTo(bArr, 0, size, size2);
        return i.wrap(bArr);
    }

    private boolean equalsFragments(i iVar) {
        i.AbstractC0158i next;
        a aVar = null;
        c cVar = new c(this, aVar);
        i.AbstractC0158i next2 = cVar.next();
        c cVar2 = new c(iVar, aVar);
        i.AbstractC0158i next3 = cVar2.next();
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
            int i13 = this.totalLength;
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

    static int minLength(int i10) {
        int[] iArr = minLengthByDepth;
        if (i10 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    static k1 newInstanceForTest(i iVar, i iVar2) {
        return new k1(iVar, iVar2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.i
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.i
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.i
    public byte byteAt(int i10) {
        i.checkIndex(i10, this.totalLength);
        return internalByteAt(i10);
    }

    @Override // com.google.protobuf.i
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.i
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.leftLength;
        if (i13 <= i14) {
            this.left.copyToInternal(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.right.copyToInternal(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.left.copyToInternal(bArr, i10, i11, i15);
            this.right.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.protobuf.i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.totalLength != iVar.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = iVar.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsFragments(iVar);
        }
        return false;
    }

    @Override // com.google.protobuf.i
    protected int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.i
    byte internalByteAt(int i10) {
        int i11 = this.leftLength;
        return i10 < i11 ? this.left.internalByteAt(i10) : this.right.internalByteAt(i10 - i11);
    }

    @Override // com.google.protobuf.i
    protected boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.i
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        i iVar = this.right;
        return iVar.partialIsValidUtf8(iPartialIsValidUtf8, 0, iVar.size()) == 0;
    }

    @Override // com.google.protobuf.i
    public j newCodedInput() {
        return j.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.i
    public InputStream newInput() {
        return new d();
    }

    @Override // com.google.protobuf.i
    protected int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.leftLength;
        if (i13 <= i14) {
            return this.left.partialHash(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.right.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.right.partialHash(this.left.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.i
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.leftLength;
        if (i13 <= i14) {
            return this.left.partialIsValidUtf8(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.right.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.i
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.i
    public i substring(int i10, int i11) {
        int iCheckRange = i.checkRange(i10, i11, this.totalLength);
        if (iCheckRange == 0) {
            return i.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i12 = this.leftLength;
        if (i11 <= i12) {
            return this.left.substring(i10, i11);
        }
        return i10 >= i12 ? this.right.substring(i10 - i12, i11 - i12) : new k1(this.left.substring(i10), this.right.substring(0, i11 - this.leftLength));
    }

    @Override // com.google.protobuf.i
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    Object writeReplace() {
        return i.wrap(toByteArray());
    }

    @Override // com.google.protobuf.i
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.i
    void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            this.left.writeToInternal(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.right.writeToInternal(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.left.writeToInternal(outputStream, i10, i14);
            this.right.writeToInternal(outputStream, 0, i11 - i14);
        }
    }

    @Override // com.google.protobuf.i
    void writeToReverse(h hVar) throws IOException {
        this.right.writeToReverse(hVar);
        this.left.writeToReverse(hVar);
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    private static class b {
        private final ArrayDeque<i> prefixesStack;

        private b() {
            this.prefixesStack = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public i balance(i iVar, i iVar2) {
            doBalance(iVar);
            doBalance(iVar2);
            i iVarPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                iVarPop = new k1(this.prefixesStack.pop(), iVarPop, null);
            }
            return iVarPop;
        }

        private void doBalance(i iVar) {
            if (iVar.isBalanced()) {
                insert(iVar);
                return;
            }
            if (iVar instanceof k1) {
                k1 k1Var = (k1) iVar;
                doBalance(k1Var.left);
                doBalance(k1Var.right);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + iVar.getClass());
            }
        }

        private int getDepthBinForLength(int i10) {
            int iBinarySearch = Arrays.binarySearch(k1.minLengthByDepth, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void insert(i iVar) {
            a aVar;
            int depthBinForLength = getDepthBinForLength(iVar.size());
            int iMinLength = k1.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength) {
                this.prefixesStack.push(iVar);
                return;
            }
            int iMinLength2 = k1.minLength(depthBinForLength);
            i iVarPop = this.prefixesStack.pop();
            while (true) {
                aVar = null;
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                    break;
                } else {
                    iVarPop = new k1(this.prefixesStack.pop(), iVarPop, aVar);
                }
            }
            k1 k1Var = new k1(iVarPop, iVar, aVar);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= k1.minLength(getDepthBinForLength(k1Var.size()) + 1)) {
                    break;
                } else {
                    k1Var = new k1(this.prefixesStack.pop(), k1Var, aVar);
                }
            }
            this.prefixesStack.push(k1Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private k1(i iVar, i iVar2) {
        this.left = iVar;
        this.right = iVar2;
        int size = iVar.size();
        this.leftLength = size;
        this.totalLength = size + iVar2.size();
        this.treeDepth = Math.max(iVar.getTreeDepth(), iVar2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.i, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.google.protobuf.i
    void writeTo(h hVar) throws IOException {
        this.left.writeTo(hVar);
        this.right.writeTo(hVar);
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    private class d extends InputStream {
        private i.AbstractC0158i currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private c pieceIterator;

        public d() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i10 = this.currentPieceIndex;
                int i11 = this.currentPieceSize;
                if (i10 == i11) {
                    this.currentPieceOffsetInRope += i11;
                    this.currentPieceIndex = 0;
                    if (!this.pieceIterator.hasNext()) {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    } else {
                        i.AbstractC0158i next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return k1.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            c cVar = new c(k1.this, null);
            this.pieceIterator = cVar;
            i.AbstractC0158i next = cVar.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private int readSkipInternal(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int iMin = Math.min(this.currentPieceSize - this.currentPieceIndex, i12);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i10, iMin);
                    i10 += iMin;
                }
                this.currentPieceIndex += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
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
            int skipInternal = readSkipInternal(bArr, i10, i11);
            if (skipInternal != 0) {
                return skipInternal;
            }
            if (i11 > 0 || availableInternal() == 0) {
                return -1;
            }
            return skipInternal;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            i.AbstractC0158i abstractC0158i = this.currentPiece;
            if (abstractC0158i == null) {
                return -1;
            }
            int i10 = this.currentPieceIndex;
            this.currentPieceIndex = i10 + 1;
            return abstractC0158i.byteAt(i10) & 255;
        }
    }
}

package com.applovin.shadow.okio;

import java.util.Arrays;
import k9.dW.xjwcmjDeOXR;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    /* JADX INFO: compiled from: Segment.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        kotlin.jvm.internal.t.c(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        kotlin.jvm.internal.t.c(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        kotlin.jvm.internal.t.f(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        kotlin.jvm.internal.t.c(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i10) {
        Segment segmentTake;
        if (!(i10 > 0 && i10 <= this.limit - this.pos)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i11 = this.pos;
            kotlin.collections.m.g(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        segmentTake.limit = segmentTake.pos + i10;
        this.pos += i10;
        Segment segment = this.prev;
        kotlin.jvm.internal.t.c(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.t.e(bArrCopyOf, "copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment sink, int i10) {
        kotlin.jvm.internal.t.f(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = sink.limit;
        if (i11 + i10 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.pos;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            kotlin.collections.m.g(bArr, bArr, 0, i12, i11, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i13 = sink.limit;
        int i14 = this.pos;
        kotlin.collections.m.d(bArr2, bArr3, i13, i14, i14 + i10);
        sink.limit += i10;
        this.pos += i10;
    }

    public final void compact() {
        Segment segment = this.prev;
        int i10 = 0;
        if (!(segment != this)) {
            throw new IllegalStateException(xjwcmjDeOXR.ifmrpapZFMPeTh.toString());
        }
        kotlin.jvm.internal.t.c(segment);
        if (segment.owner) {
            int i11 = this.limit - this.pos;
            Segment segment2 = this.prev;
            kotlin.jvm.internal.t.c(segment2);
            int i12 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            kotlin.jvm.internal.t.c(segment3);
            if (!segment3.shared) {
                Segment segment4 = this.prev;
                kotlin.jvm.internal.t.c(segment4);
                i10 = segment4.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            Segment segment5 = this.prev;
            kotlin.jvm.internal.t.c(segment5);
            writeTo(segment5, i11);
            pop();
            SegmentPool.recycle(this);
        }
    }

    public Segment(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.t.f(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}

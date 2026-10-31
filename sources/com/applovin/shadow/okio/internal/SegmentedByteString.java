package com.applovin.shadow.okio.internal;

import com.applovin.mediation.ads.Zfi.OgqfiHA;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C0503SegmentedByteString;
import com.applovin.shadow.okio.Segment;
import id.q;
import kotlin.collections.m;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i10, int i11, int i12) {
        t.f(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(C0503SegmentedByteString c0503SegmentedByteString, int i10, byte[] target, int i11, int i12) {
        t.f(c0503SegmentedByteString, "<this>");
        t.f(target, "target");
        long j10 = i12;
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0503SegmentedByteString.size(), i10, j10);
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c0503SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0503SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c0503SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            m.d(c0503SegmentedByteString.getSegments$okio()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C0503SegmentedByteString c0503SegmentedByteString, Object obj) {
        t.f(c0503SegmentedByteString, "<this>");
        if (obj == c0503SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0503SegmentedByteString.size() && c0503SegmentedByteString.rangeEquals(0, byteString, 0, c0503SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C0503SegmentedByteString c0503SegmentedByteString) {
        t.f(c0503SegmentedByteString, "<this>");
        return c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C0503SegmentedByteString c0503SegmentedByteString) {
        t.f(c0503SegmentedByteString, "<this>");
        int hashCode$okio = c0503SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c0503SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0503SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c0503SegmentedByteString.getDirectory$okio()[i10];
            byte[] bArr = c0503SegmentedByteString.getSegments$okio()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c0503SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(C0503SegmentedByteString c0503SegmentedByteString, int i10) {
        t.f(c0503SegmentedByteString, "<this>");
        com.applovin.shadow.okio.SegmentedByteString.checkOffsetAndCount(c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length - 1], i10, 1L);
        int iSegment = segment(c0503SegmentedByteString, i10);
        return c0503SegmentedByteString.getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : c0503SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C0503SegmentedByteString c0503SegmentedByteString, int i10, ByteString other, int i11, int i12) {
        t.f(c0503SegmentedByteString, "<this>");
        t.f(other, "other");
        if (i10 < 0 || i10 > c0503SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0503SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0503SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c0503SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c0503SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C0503SegmentedByteString c0503SegmentedByteString, int i10, int i11) {
        t.f(c0503SegmentedByteString, "<this>");
        int iResolveDefaultParameter = com.applovin.shadow.okio.SegmentedByteString.resolveDefaultParameter(c0503SegmentedByteString, i11);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (!(iResolveDefaultParameter <= c0503SegmentedByteString.size())) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c0503SegmentedByteString.size() + ')').toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c0503SegmentedByteString.size()) {
            return c0503SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c0503SegmentedByteString, i10);
        int iSegment2 = segment(c0503SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) m.j(c0503SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = 0;
            int i14 = iSegment;
            while (true) {
                iArr[i13] = Math.min(c0503SegmentedByteString.getDirectory$okio()[i14] - i10, i12);
                int i15 = i13 + 1;
                iArr[i13 + bArr.length] = c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length + i14];
                if (i14 == iSegment2) {
                    break;
                }
                i14++;
                i13 = i15;
            }
        }
        int i16 = iSegment != 0 ? c0503SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C0503SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C0503SegmentedByteString c0503SegmentedByteString) {
        t.f(c0503SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0503SegmentedByteString.size()];
        int length = c0503SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0503SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c0503SegmentedByteString.getDirectory$okio()[i10];
            int i15 = i14 - i11;
            m.d(c0503SegmentedByteString.getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(C0503SegmentedByteString c0503SegmentedByteString, Buffer buffer, int i10, int i11) {
        t.f(c0503SegmentedByteString, "<this>");
        t.f(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c0503SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c0503SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c0503SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(c0503SegmentedByteString.getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                t.c(segment2);
                Segment segment3 = segment2.prev;
                t.c(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i11));
    }

    public static final void forEachSegment(C0503SegmentedByteString c0503SegmentedByteString, q<? super byte[], ? super Integer, ? super Integer, g0> action) {
        t.f(c0503SegmentedByteString, "<this>");
        t.f(action, "action");
        int length = c0503SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c0503SegmentedByteString.getDirectory$okio()[length + i10];
            int i13 = c0503SegmentedByteString.getDirectory$okio()[i10];
            action.invoke(c0503SegmentedByteString.getSegments$okio()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(C0503SegmentedByteString c0503SegmentedByteString, int i10) {
        t.f(c0503SegmentedByteString, OgqfiHA.vpvHH);
        int iBinarySearch = binarySearch(c0503SegmentedByteString.getDirectory$okio(), i10 + 1, 0, c0503SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C0503SegmentedByteString c0503SegmentedByteString, int i10, int i11, q<? super byte[], ? super Integer, ? super Integer, g0> qVar) {
        int iSegment = segment(c0503SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c0503SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i13 = c0503SegmentedByteString.getDirectory$okio()[iSegment] - i12;
            int i14 = c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            qVar.invoke(c0503SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C0503SegmentedByteString c0503SegmentedByteString, int i10, byte[] other, int i11, int i12) {
        t.f(c0503SegmentedByteString, "<this>");
        t.f(other, "other");
        if (i10 < 0 || i10 > c0503SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0503SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0503SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c0503SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c0503SegmentedByteString.getDirectory$okio()[c0503SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!com.applovin.shadow.okio.SegmentedByteString.arrayRangeEquals(c0503SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}

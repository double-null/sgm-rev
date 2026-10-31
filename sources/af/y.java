package af;

import com.facebook.internal.NativeProtocol;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f408a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f409b = NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x f410c = new x(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference<x>[] f412e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f411d = iHighestOneBit;
        AtomicReference<x>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f412e = atomicReferenceArr;
    }

    private y() {
    }

    private final AtomicReference<x> a() {
        return f412e[(int) (Thread.currentThread().getId() & (((long) f411d) - 1))];
    }

    public static final void b(x segment) {
        AtomicReference<x> atomicReferenceA;
        x xVar;
        x andSet;
        kotlin.jvm.internal.t.f(segment, "segment");
        if (!(segment.f406f == null && segment.f407g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f404d || (andSet = (atomicReferenceA = f408a.a()).getAndSet((xVar = f410c))) == xVar) {
            return;
        }
        int i10 = andSet != null ? andSet.f403c : 0;
        if (i10 >= f409b) {
            atomicReferenceA.set(andSet);
            return;
        }
        segment.f406f = andSet;
        segment.f402b = 0;
        segment.f403c = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final x c() {
        AtomicReference<x> atomicReferenceA = f408a.a();
        x xVar = f410c;
        x andSet = atomicReferenceA.getAndSet(xVar);
        if (andSet == xVar) {
            return new x();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new x();
        }
        atomicReferenceA.set(andSet.f406f);
        andSet.f406f = null;
        andSet.f403c = 0;
        return andSet;
    }
}

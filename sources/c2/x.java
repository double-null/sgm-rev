package c2;

import android.util.SparseArray;

/* JADX INFO: compiled from: QosTier.java */
/* JADX INFO: loaded from: classes3.dex */
public enum x {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    f4702d(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseArray<x> f4706h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4708a;

    x(int i10) {
        this.f4708a = i10;
    }

    static {
        x xVar = DEFAULT;
        x xVar2 = UNMETERED_ONLY;
        x xVar3 = f4702d;
        x xVar4 = FAST_IF_RADIO_AWAKE;
        x xVar5 = NEVER;
        x xVar6 = UNRECOGNIZED;
        SparseArray<x> sparseArray = new SparseArray<>();
        f4706h = sparseArray;
        sparseArray.put(0, xVar);
        sparseArray.put(1, xVar2);
        sparseArray.put(2, xVar3);
        sparseArray.put(3, xVar4);
        sparseArray.put(4, xVar5);
        sparseArray.put(-1, xVar6);
    }
}

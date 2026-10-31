package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1302Vn implements InterfaceC1257Tt {
    public final List<C1262Ty> A00 = new ArrayList();
    public final boolean A01;
    public final /* synthetic */ C1301Vm A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1257Tt
    public final synchronized int A6P() {
        int i10;
        i10 = 0;
        Iterator<C1262Ty> it = this.A00.iterator();
        while (it.hasNext()) {
            i10 += it.next().A01;
        }
        return i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public C1302Vn(C1301Vm c1301Vm, List<C1253Tp> list, boolean z10) throws IOException {
        this.A02 = c1301Vm;
        this.A01 = z10;
        for (C1253Tp fetch : list) {
            C1252To c1252ToA01 = fetch.A01();
            this.A00.add(new C1262Ty(new C1250Tm(fetch.A00(), c1252ToA01.A01()), c1252ToA01.A00() - c1252ToA01.A01(), c1252ToA01.A00()));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C1262Ty A00() {
        return this.A00.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    public final C1262Ty A01() {
        return this.A00.get(this.A00.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1257Tt
    public final void A5h() throws U3 {
        this.A02.A03(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1257Tt
    public final boolean ABp() {
        return this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Vn != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.A06(this);
    }
}

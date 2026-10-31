package ba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s9.k;
import x7.l0;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes4.dex */
final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d> f4228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f4229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f4230c;

    public j(List<d> list) {
        this.f4228a = Collections.unmodifiableList(new ArrayList(list));
        this.f4229b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f4229b;
            jArr[i11] = dVar.f4199b;
            jArr[i11 + 1] = dVar.f4200c;
        }
        long[] jArr2 = this.f4229b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f4230c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(d dVar, d dVar2) {
        return Long.compare(dVar.f4199b, dVar2.f4199b);
    }

    @Override // s9.k
    public int a(long j10) {
        int iD = l0.d(this.f4230c, j10, false, false);
        if (iD < this.f4230c.length) {
            return iD;
        }
        return -1;
    }

    @Override // s9.k
    public List<w7.a> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f4228a.size(); i10++) {
            long[] jArr = this.f4229b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f4228a.get(i10);
                w7.a aVar = dVar.f4198a;
                if (aVar.f27547e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: ba.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return j.f((d) obj, (d) obj2);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f4198a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // s9.k
    public long c(int i10) {
        x7.a.a(i10 >= 0);
        x7.a.a(i10 < this.f4230c.length);
        return this.f4230c[i10];
    }

    @Override // s9.k
    public int d() {
        return this.f4230c.length;
    }
}

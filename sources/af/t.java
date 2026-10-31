package af;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t extends kotlin.collections.d<h> implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f388c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f390b;

    /* JADX INFO: compiled from: Options.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final void a(long j10, e eVar, int i10, List<? extends h> list, int i11, int i12, List<Integer> list2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (!(list.get(i17).F() >= i16)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            h hVar = list.get(i11);
            h hVar2 = list.get(i12 - 1);
            int i18 = -1;
            if (i16 == hVar.F()) {
                int iIntValue = list2.get(i11).intValue();
                int i19 = i11 + 1;
                h hVar3 = list.get(i19);
                i13 = i19;
                i14 = iIntValue;
                hVar = hVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (hVar.g(i16) == hVar2.g(i16)) {
                int iMin = Math.min(hVar.F(), hVar2.F());
                int i20 = 0;
                for (int i21 = i16; i21 < iMin && hVar.g(i21) == hVar2.g(i21); i21++) {
                    i20++;
                }
                long jC = j10 + c(eVar) + ((long) 2) + ((long) i20) + 1;
                eVar.writeInt(-i20);
                eVar.writeInt(i14);
                int i22 = i16 + i20;
                while (i16 < i22) {
                    eVar.writeInt(hVar.g(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (!(i22 == list.get(i13).F())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    eVar.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    e eVar2 = new e();
                    eVar.writeInt(((int) (c(eVar2) + jC)) * (-1));
                    a(jC, eVar2, i22, list, i13, i12, list2);
                    eVar.V(eVar2);
                    return;
                }
            }
            int i23 = 1;
            for (int i24 = i13 + 1; i24 < i12; i24++) {
                if (list.get(i24 - 1).g(i16) != list.get(i24).g(i16)) {
                    i23++;
                }
            }
            long jC2 = j10 + c(eVar) + ((long) 2) + ((long) (i23 * 2));
            eVar.writeInt(i23);
            eVar.writeInt(i14);
            for (int i25 = i13; i25 < i12; i25++) {
                byte bG = list.get(i25).g(i16);
                if (i25 == i13 || bG != list.get(i25 - 1).g(i16)) {
                    eVar.writeInt(bG & 255);
                }
            }
            e eVar3 = new e();
            while (i13 < i12) {
                byte bG2 = list.get(i13).g(i16);
                int i26 = i13 + 1;
                int i27 = i26;
                while (true) {
                    if (i27 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bG2 != list.get(i27).g(i16)) {
                            i15 = i27;
                            break;
                        }
                        i27++;
                    }
                }
                if (i26 == i15 && i16 + 1 == list.get(i13).F()) {
                    eVar.writeInt(list2.get(i13).intValue());
                } else {
                    eVar.writeInt(((int) (jC2 + c(eVar3))) * i18);
                    a(jC2, eVar3, i16 + 1, list, i13, i15, list2);
                }
                eVar3 = eVar3;
                i13 = i15;
                i18 = -1;
            }
            eVar.V(eVar3);
        }

        static /* synthetic */ void b(a aVar, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            aVar.a((i13 & 1) != 0 ? 0L : j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(e eVar) {
            return eVar.size() / ((long) 4);
        }

        public final t d(h... byteStrings) throws IOException {
            kotlin.jvm.internal.t.f(byteStrings, "byteStrings");
            int i10 = 0;
            kotlin.jvm.internal.k kVar = null;
            if (byteStrings.length == 0) {
                return new t(new h[0], new int[]{0, -1}, kVar);
            }
            List listX = kotlin.collections.o.X(byteStrings);
            kotlin.collections.x.x(listX);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (h hVar : byteStrings) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List listP = kotlin.collections.t.p(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                listP.set(kotlin.collections.t.j(listX, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (!(((h) listX.get(0)).F() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i13 = 0;
            while (i13 < listX.size()) {
                h hVar2 = (h) listX.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listX.size()) {
                    h hVar3 = (h) listX.get(i15);
                    if (!hVar3.G(hVar2)) {
                        break;
                    }
                    if (!(hVar3.F() != hVar2.F())) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar3).toString());
                    }
                    if (((Number) listP.get(i15)).intValue() > ((Number) listP.get(i13)).intValue()) {
                        listX.remove(i15);
                        listP.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            e eVar = new e();
            b(this, 0L, eVar, 0, listX, 0, 0, listP, 53, null);
            int[] iArr = new int[(int) c(eVar)];
            while (!eVar.exhausted()) {
                iArr[i10] = eVar.readInt();
                i10++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.t.e(objArrCopyOf, "copyOf(this, size)");
            return new t((h[]) objArrCopyOf, iArr, kVar);
        }
    }

    public /* synthetic */ t(h[] hVarArr, int[] iArr, kotlin.jvm.internal.k kVar) {
        this(hVarArr, iArr);
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return e((h) obj);
        }
        return false;
    }

    public /* bridge */ boolean e(h hVar) {
        return super.contains(hVar);
    }

    @Override // kotlin.collections.d, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h get(int i10) {
        return this.f389a[i10];
    }

    public final h[] g() {
        return this.f389a;
    }

    @Override // kotlin.collections.d, kotlin.collections.b
    public int getSize() {
        return this.f389a.length;
    }

    public final int[] getTrie$okio() {
        return this.f390b;
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return o((h) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return p((h) obj);
        }
        return -1;
    }

    public /* bridge */ int o(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int p(h hVar) {
        return super.lastIndexOf(hVar);
    }

    private t(h[] hVarArr, int[] iArr) {
        this.f389a = hVarArr;
        this.f390b = iArr;
    }
}

package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: CodedOutputStreamWriter.java */
/* JADX INFO: loaded from: classes.dex */
final class p implements e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f10734a;

    /* JADX INFO: compiled from: CodedOutputStreamWriter.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10735a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f10735a = iArr;
            try {
                iArr[c3.b.f10261j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10735a[c3.b.f10260i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10735a[c3.b.f10258g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10735a[c3.b.f10268q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10735a[c3.b.f10270s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10735a[c3.b.f10266o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10735a[c3.b.f10259h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10735a[c3.b.f10256e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10735a[c3.b.f10269r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10735a[c3.b.f10271t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10735a[c3.b.f10257f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10735a[c3.b.f10262k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private p(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) l0.b(codedOutputStream, "output");
        this.f10734a = codedOutputStream2;
        codedOutputStream2.f9690a = this;
    }

    public static p g(CodedOutputStream codedOutputStream) {
        p pVar = codedOutputStream.f9690a;
        return pVar != null ? pVar : new p(codedOutputStream);
    }

    private <V> void h(int i10, boolean z10, V v10, x0.b<Boolean, V> bVar) throws IOException {
        this.f10734a.b1(i10, 2);
        this.f10734a.d1(x0.b(bVar, Boolean.valueOf(z10), v10));
        x0.f(this.f10734a, bVar, Boolean.valueOf(z10), v10);
    }

    private <V> void i(int i10, x0.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f10734a.b1(i10, 2);
            this.f10734a.d1(x0.b(bVar, Integer.valueOf(i13), v10));
            x0.f(this.f10734a, bVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void j(int i10, x0.b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f10734a.b1(i10, 2);
            this.f10734a.d1(x0.b(bVar, Long.valueOf(j10), v10));
            x0.f(this.f10734a, bVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void k(int i10, x0.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.f10735a[bVar.f10864a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    h(i10, false, v10, bVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    h(i10, true, v11, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(i10, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                j(i10, bVar, map);
                return;
            case 12:
                l(i10, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f10864a);
        }
    }

    private <V> void l(int i10, x0.b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f10734a.b1(i10, 2);
            this.f10734a.d1(x0.b(bVar, str, v10));
            x0.f(this.f10734a, bVar, str, v10);
        }
    }

    private void m(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f10734a.Z0(i10, (String) obj);
        } else {
            this.f10734a.r0(i10, (ByteString) obj);
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void a(int i10, Object obj, b2 b2Var) throws IOException {
        this.f10734a.E0(i10, (MessageLite) obj, b2Var);
    }

    @Override // com.explorestack.protobuf.e3
    public void b(int i10, List<?> list, b2 b2Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            f(i10, list.get(i11), b2Var);
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void c(int i10, ByteString byteString) throws IOException {
        this.f10734a.r0(i10, byteString);
    }

    @Override // com.explorestack.protobuf.e3
    public void d(int i10, List<?> list, b2 b2Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            a(i10, list.get(i11), b2Var);
        }
    }

    @Override // com.explorestack.protobuf.e3
    public <K, V> void e(int i10, x0.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f10734a.g0()) {
            k(i10, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f10734a.b1(i10, 2);
            this.f10734a.d1(x0.b(bVar, entry.getKey(), entry.getValue()));
            x0.f(this.f10734a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void f(int i10, Object obj, b2 b2Var) throws IOException {
        this.f10734a.M0(i10, (MessageLite) obj, b2Var);
    }

    @Override // com.explorestack.protobuf.e3
    public e3.a fieldOrder() {
        return e3.a.ASCENDING;
    }

    @Override // com.explorestack.protobuf.e3
    public void writeBool(int i10, boolean z10) throws IOException {
        this.f10734a.n0(i10, z10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeBoolList(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.n0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += CodedOutputStream.f(list.get(i12).booleanValue());
        }
        this.f10734a.d1(iF);
        while (i11 < list.size()) {
            this.f10734a.o0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeBytesList(int i10, List<ByteString> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f10734a.r0(i10, list.get(i11));
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeDouble(int i10, double d10) throws IOException {
        this.f10734a.t0(i10, d10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeDoubleList(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.t0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.k(list.get(i12).doubleValue());
        }
        this.f10734a.d1(iK);
        while (i11 < list.size()) {
            this.f10734a.u0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeEndGroup(int i10) throws IOException {
        this.f10734a.b1(i10, 4);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeEnum(int i10, int i11) throws IOException {
        this.f10734a.v0(i10, i11);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeEnumList(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.v0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.m(list.get(i12).intValue());
        }
        this.f10734a.d1(iM);
        while (i11 < list.size()) {
            this.f10734a.w0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeFixed32(int i10, int i11) throws IOException {
        this.f10734a.x0(i10, i11);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.x0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.o(list.get(i12).intValue());
        }
        this.f10734a.d1(iO);
        while (i11 < list.size()) {
            this.f10734a.y0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeFixed64(int i10, long j10) throws IOException {
        this.f10734a.z0(i10, j10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.z0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.q(list.get(i12).longValue());
        }
        this.f10734a.d1(iQ);
        while (i11 < list.size()) {
            this.f10734a.A0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeFloat(int i10, float f10) throws IOException {
        this.f10734a.B0(i10, f10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeFloatList(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.B0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += CodedOutputStream.s(list.get(i12).floatValue());
        }
        this.f10734a.d1(iS);
        while (i11 < list.size()) {
            this.f10734a.C0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeGroup(int i10, Object obj) throws IOException {
        this.f10734a.D0(i10, (MessageLite) obj);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeGroupList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeGroup(i10, list.get(i11));
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeInt32(int i10, int i11) throws IOException {
        this.f10734a.H0(i10, i11);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.H0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).intValue());
        }
        this.f10734a.d1(iY);
        while (i11 < list.size()) {
            this.f10734a.I0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeInt64(int i10, long j10) throws IOException {
        this.f10734a.J0(i10, j10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.J0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += CodedOutputStream.A(list.get(i12).longValue());
        }
        this.f10734a.d1(iA);
        while (i11 < list.size()) {
            this.f10734a.K0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeMessage(int i10, Object obj) throws IOException {
        this.f10734a.L0(i10, (MessageLite) obj);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeMessageList(int i10, List<?> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            writeMessage(i10, list.get(i11));
        }
    }

    @Override // com.explorestack.protobuf.e3
    public final void writeMessageSetItem(int i10, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f10734a.P0(i10, (ByteString) obj);
        } else {
            this.f10734a.O0(i10, (MessageLite) obj);
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSFixed32(int i10, int i11) throws IOException {
        this.f10734a.R0(i10, i11);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSFixed32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.R0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.O(list.get(i12).intValue());
        }
        this.f10734a.d1(iO);
        while (i11 < list.size()) {
            this.f10734a.S0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSFixed64(int i10, long j10) throws IOException {
        this.f10734a.T0(i10, j10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSFixed64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.T0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.Q(list.get(i12).longValue());
        }
        this.f10734a.d1(iQ);
        while (i11 < list.size()) {
            this.f10734a.U0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSInt32(int i10, int i11) throws IOException {
        this.f10734a.V0(i10, i11);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.V0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += CodedOutputStream.S(list.get(i12).intValue());
        }
        this.f10734a.d1(iS);
        while (i11 < list.size()) {
            this.f10734a.W0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSInt64(int i10, long j10) throws IOException {
        this.f10734a.X0(i10, j10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeSInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.X0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iU = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iU += CodedOutputStream.U(list.get(i12).longValue());
        }
        this.f10734a.d1(iU);
        while (i11 < list.size()) {
            this.f10734a.Y0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeStartGroup(int i10) throws IOException {
        this.f10734a.b1(i10, 3);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeString(int i10, String str) throws IOException {
        this.f10734a.Z0(i10, str);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeStringList(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof r0)) {
            while (i11 < list.size()) {
                this.f10734a.Z0(i10, list.get(i11));
                i11++;
            }
        } else {
            r0 r0Var = (r0) list;
            while (i11 < list.size()) {
                m(i10, r0Var.getRaw(i11));
                i11++;
            }
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeUInt32(int i10, int i11) throws IOException {
        this.f10734a.c1(i10, i11);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeUInt32List(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.c1(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += CodedOutputStream.Z(list.get(i12).intValue());
        }
        this.f10734a.d1(iZ);
        while (i11 < list.size()) {
            this.f10734a.d1(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.explorestack.protobuf.e3
    public void writeUInt64(int i10, long j10) throws IOException {
        this.f10734a.e1(i10, j10);
    }

    @Override // com.explorestack.protobuf.e3
    public void writeUInt64List(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10734a.e1(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10734a.b1(i10, 2);
        int iB0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB0 += CodedOutputStream.b0(list.get(i12).longValue());
        }
        this.f10734a.d1(iB0);
        while (i11 < list.size()) {
            this.f10734a.f1(list.get(i11).longValue());
            i11++;
        }
    }
}

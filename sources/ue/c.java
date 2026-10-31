package ue;

import af.c0;
import af.q;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f26869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ue.b[] f26870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<af.h, Integer> f26871c;

    private c() {
    }

    private final Map<af.h, Integer> d() {
        ue.b[] bVarArr = f26870b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        int length = bVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            ue.b[] bVarArr2 = f26870b;
            if (!linkedHashMap.containsKey(bVarArr2[i10].f26866a)) {
                linkedHashMap.put(bVarArr2[i10].f26866a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<af.h, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final af.h a(af.h name) throws IOException {
        t.f(name, "name");
        int iF = name.F();
        int i10 = 0;
        while (i10 < iF) {
            int i11 = i10 + 1;
            byte bG = name.g(i10);
            if (65 <= bG && bG <= 90) {
                throw new IOException(t.n("PROTOCOL_ERROR response malformed: mixed case name: ", name.I()));
            }
            i10 = i11;
        }
        return name;
    }

    public final Map<af.h, Integer> b() {
        return f26871c;
    }

    public final ue.b[] c() {
        return f26870b;
    }

    static {
        c cVar = new c();
        f26869a = cVar;
        af.h hVar = ue.b.f26862g;
        af.h hVar2 = ue.b.f26863h;
        af.h hVar3 = ue.b.f26864i;
        af.h hVar4 = ue.b.f26861f;
        f26870b = new ue.b[]{new ue.b(ue.b.f26865j, ""), new ue.b(hVar, "GET"), new ue.b(hVar, "POST"), new ue.b(hVar2, "/"), new ue.b(hVar2, "/index.html"), new ue.b(hVar3, "http"), new ue.b(hVar3, "https"), new ue.b(hVar4, "200"), new ue.b(hVar4, "204"), new ue.b(hVar4, "206"), new ue.b(hVar4, "304"), new ue.b(hVar4, "400"), new ue.b(hVar4, "404"), new ue.b(hVar4, "500"), new ue.b("accept-charset", ""), new ue.b("accept-encoding", "gzip, deflate"), new ue.b("accept-language", ""), new ue.b("accept-ranges", ""), new ue.b("accept", ""), new ue.b("access-control-allow-origin", ""), new ue.b("age", ""), new ue.b("allow", ""), new ue.b("authorization", ""), new ue.b("cache-control", ""), new ue.b("content-disposition", ""), new ue.b("content-encoding", ""), new ue.b("content-language", ""), new ue.b("content-length", ""), new ue.b(UyXgnuLGEkgnZE.nIkPkXJgZoH, ""), new ue.b("content-range", ""), new ue.b("content-type", ""), new ue.b("cookie", ""), new ue.b("date", ""), new ue.b("etag", ""), new ue.b("expect", ""), new ue.b("expires", ""), new ue.b("from", ""), new ue.b("host", ""), new ue.b("if-match", ""), new ue.b("if-modified-since", ""), new ue.b("if-none-match", ""), new ue.b("if-range", ""), new ue.b("if-unmodified-since", ""), new ue.b("last-modified", ""), new ue.b("link", ""), new ue.b("location", ""), new ue.b("max-forwards", ""), new ue.b("proxy-authenticate", ""), new ue.b("proxy-authorization", ""), new ue.b("range", ""), new ue.b("referer", ""), new ue.b("refresh", ""), new ue.b("retry-after", ""), new ue.b("server", ""), new ue.b("set-cookie", ""), new ue.b("strict-transport-security", ""), new ue.b("transfer-encoding", ""), new ue.b("user-agent", ""), new ue.b("vary", ""), new ue.b("via", ""), new ue.b("www-authenticate", "")};
        f26871c = cVar.d();
    }

    /* JADX INFO: compiled from: Hpack.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ue.b> f26874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final af.g f26875d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ue.b[] f26876e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f26877f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f26878g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f26879h;

        public a(c0 source, int i10, int i11) {
            t.f(source, "source");
            this.f26872a = i10;
            this.f26873b = i11;
            this.f26874c = new ArrayList();
            this.f26875d = q.d(source);
            ue.b[] bVarArr = new ue.b[8];
            this.f26876e = bVarArr;
            this.f26877f = bVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f26873b;
            int i11 = this.f26879h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            m.n(this.f26876e, null, 0, 0, 6, null);
            this.f26877f = this.f26876e.length - 1;
            this.f26878g = 0;
            this.f26879h = 0;
        }

        private final int c(int i10) {
            return this.f26877f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f26876e.length;
                while (true) {
                    length--;
                    i11 = this.f26877f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    ue.b bVar = this.f26876e[length];
                    t.c(bVar);
                    int i13 = bVar.f26868c;
                    i10 -= i13;
                    this.f26879h -= i13;
                    this.f26878g--;
                    i12++;
                }
                ue.b[] bVarArr = this.f26876e;
                System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f26878g);
                this.f26877f += i12;
            }
            return i12;
        }

        private final af.h f(int i10) throws IOException {
            if (h(i10)) {
                return c.f26869a.c()[i10].f26866a;
            }
            int iC = c(i10 - c.f26869a.c().length);
            if (iC >= 0) {
                ue.b[] bVarArr = this.f26876e;
                if (iC < bVarArr.length) {
                    ue.b bVar = bVarArr[iC];
                    t.c(bVar);
                    return bVar.f26866a;
                }
            }
            throw new IOException(t.n("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void g(int i10, ue.b bVar) {
            this.f26874c.add(bVar);
            int i11 = bVar.f26868c;
            if (i10 != -1) {
                ue.b bVar2 = this.f26876e[c(i10)];
                t.c(bVar2);
                i11 -= bVar2.f26868c;
            }
            int i12 = this.f26873b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f26879h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f26878g + 1;
                ue.b[] bVarArr = this.f26876e;
                if (i13 > bVarArr.length) {
                    ue.b[] bVarArr2 = new ue.b[bVarArr.length * 2];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f26877f = this.f26876e.length - 1;
                    this.f26876e = bVarArr2;
                }
                int i14 = this.f26877f;
                this.f26877f = i14 - 1;
                this.f26876e[i14] = bVar;
                this.f26878g++;
            } else {
                this.f26876e[i10 + c(i10) + iD] = bVar;
            }
            this.f26879h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= c.f26869a.c().length - 1;
        }

        private final int i() throws IOException {
            return ne.d.d(this.f26875d.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f26874c.add(c.f26869a.c()[i10]);
                return;
            }
            int iC = c(i10 - c.f26869a.c().length);
            if (iC >= 0) {
                ue.b[] bVarArr = this.f26876e;
                if (iC < bVarArr.length) {
                    List<ue.b> list = this.f26874c;
                    ue.b bVar = bVarArr[iC];
                    t.c(bVar);
                    list.add(bVar);
                    return;
                }
            }
            throw new IOException(t.n("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void n(int i10) throws IOException {
            g(-1, new ue.b(f(i10), j()));
        }

        private final void o() throws IOException {
            g(-1, new ue.b(c.f26869a.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f26874c.add(new ue.b(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f26874c.add(new ue.b(c.f26869a.a(j()), j()));
        }

        public final List<ue.b> e() {
            List<ue.b> listP0 = b0.p0(this.f26874c);
            this.f26874c.clear();
            return listP0;
        }

        public final af.h j() throws IOException {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.f26875d.readByteString(jM);
            }
            af.e eVar = new af.e();
            j.f27048a.b(this.f26875d, jM, eVar);
            return eVar.readByteString();
        }

        public final void k() throws IOException {
            while (!this.f26875d.exhausted()) {
                int iD = ne.d.d(this.f26875d.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, 127) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.f26873b = iM;
                    if (iM < 0 || iM > this.f26872a) {
                        throw new IOException(t.n("Invalid dynamic table size update ", Integer.valueOf(this.f26873b)));
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(c0 c0Var, int i10, int i11, int i12, kotlin.jvm.internal.k kVar) {
            this(c0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* JADX INFO: compiled from: Hpack.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f26881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final af.e f26882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f26883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f26884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f26885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ue.b[] f26886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f26887h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f26888i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26889j;

        public b(int i10, boolean z10, af.e out) {
            t.f(out, "out");
            this.f26880a = i10;
            this.f26881b = z10;
            this.f26882c = out;
            this.f26883d = Integer.MAX_VALUE;
            this.f26885f = i10;
            ue.b[] bVarArr = new ue.b[8];
            this.f26886g = bVarArr;
            this.f26887h = bVarArr.length - 1;
        }

        private final void a() {
            int i10 = this.f26885f;
            int i11 = this.f26889j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            m.n(this.f26886g, null, 0, 0, 6, null);
            this.f26887h = this.f26886g.length - 1;
            this.f26888i = 0;
            this.f26889j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f26886g.length;
                while (true) {
                    length--;
                    i11 = this.f26887h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    ue.b bVar = this.f26886g[length];
                    t.c(bVar);
                    i10 -= bVar.f26868c;
                    int i13 = this.f26889j;
                    ue.b bVar2 = this.f26886g[length];
                    t.c(bVar2);
                    this.f26889j = i13 - bVar2.f26868c;
                    this.f26888i--;
                    i12++;
                }
                ue.b[] bVarArr = this.f26886g;
                System.arraycopy(bVarArr, i11 + 1, bVarArr, i11 + 1 + i12, this.f26888i);
                ue.b[] bVarArr2 = this.f26886g;
                int i14 = this.f26887h;
                Arrays.fill(bVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f26887h += i12;
            }
            return i12;
        }

        private final void d(ue.b bVar) {
            int i10 = bVar.f26868c;
            int i11 = this.f26885f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f26889j + i10) - i11);
            int i12 = this.f26888i + 1;
            ue.b[] bVarArr = this.f26886g;
            if (i12 > bVarArr.length) {
                ue.b[] bVarArr2 = new ue.b[bVarArr.length * 2];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f26887h = this.f26886g.length - 1;
                this.f26886g = bVarArr2;
            }
            int i13 = this.f26887h;
            this.f26887h = i13 - 1;
            this.f26886g[i13] = bVar;
            this.f26888i++;
            this.f26889j += i10;
        }

        public final void e(int i10) {
            this.f26880a = i10;
            int iMin = Math.min(i10, Http2.INITIAL_MAX_FRAME_SIZE);
            int i11 = this.f26885f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f26883d = Math.min(this.f26883d, iMin);
            }
            this.f26884e = true;
            this.f26885f = iMin;
            a();
        }

        public final void f(af.h data) throws IOException {
            t.f(data, "data");
            if (this.f26881b) {
                j jVar = j.f27048a;
                if (jVar.d(data) < data.F()) {
                    af.e eVar = new af.e();
                    jVar.c(data, eVar);
                    af.h byteString = eVar.readByteString();
                    h(byteString.F(), 127, 128);
                    this.f26882c.D(byteString);
                    return;
                }
            }
            h(data.F(), 127, 0);
            this.f26882c.D(data);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0081  */
        public final void g(List<ue.b> headerBlock) throws IOException {
            int length;
            int length2;
            t.f(headerBlock, "headerBlock");
            if (this.f26884e) {
                int i10 = this.f26883d;
                if (i10 < this.f26885f) {
                    h(i10, 31, 32);
                }
                this.f26884e = false;
                this.f26883d = Integer.MAX_VALUE;
                h(this.f26885f, 31, 32);
            }
            int size = headerBlock.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                ue.b bVar = headerBlock.get(i11);
                af.h hVarH = bVar.f26866a.H();
                af.h hVar = bVar.f26867b;
                c cVar = c.f26869a;
                Integer num = cVar.b().get(hVarH);
                if (num != null) {
                    length2 = num.intValue() + 1;
                    if (!(2 <= length2 && length2 < 8)) {
                        length = length2;
                        length2 = -1;
                    } else if (t.a(cVar.c()[length2 - 1].f26867b, hVar)) {
                        length = length2;
                    } else if (t.a(cVar.c()[length2].f26867b, hVar)) {
                        length2++;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i13 = this.f26887h + 1;
                    int length3 = this.f26886g.length;
                    while (i13 < length3) {
                        int i14 = i13 + 1;
                        ue.b bVar2 = this.f26886g[i13];
                        t.c(bVar2);
                        if (t.a(bVar2.f26866a, hVarH)) {
                            ue.b bVar3 = this.f26886g[i13];
                            t.c(bVar3);
                            if (t.a(bVar3.f26867b, hVar)) {
                                length2 = c.f26869a.c().length + (i13 - this.f26887h);
                                break;
                            } else if (length == -1) {
                                length = c.f26869a.c().length + (i13 - this.f26887h);
                            }
                        }
                        i13 = i14;
                    }
                }
                if (length2 != -1) {
                    h(length2, 127, 128);
                } else if (length == -1) {
                    this.f26882c.writeByte(64);
                    f(hVarH);
                    f(hVar);
                    d(bVar);
                } else if (!hVarH.G(ue.b.f26860e) || t.a(ue.b.f26865j, hVarH)) {
                    h(length, 63, 64);
                    f(hVar);
                    d(bVar);
                } else {
                    h(length, 15, 0);
                    f(hVar);
                }
                i11 = i12;
            }
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f26882c.writeByte(i10 | i12);
                return;
            }
            this.f26882c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f26882c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f26882c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, af.e eVar, int i11, kotlin.jvm.internal.k kVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}

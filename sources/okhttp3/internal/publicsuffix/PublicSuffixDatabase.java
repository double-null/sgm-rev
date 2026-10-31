package okhttp3.internal.publicsuffix;

import af.g;
import af.n;
import af.q;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import fd.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ne.d;
import qd.r;
import rd.f0;
import wc.g0;
import we.h;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23399e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f23400f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f23401g = s.e(yhXxbqGRMeI.kUcgLQlvRw);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PublicSuffixDatabase f23402h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f23403a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CountDownLatch f23404b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f23405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f23406d;

    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int iD;
            int iD2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iD = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        iD = d.d(bArr2[i17][i18], 255);
                    }
                    iD2 = iD - d.d(bArr[i14 + i19], 255);
                    if (iD2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        i18 = -1;
                        z11 = true;
                    }
                }
                if (iD2 >= 0) {
                    if (iD2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                t.e(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f23402h;
        }
    }

    private final List<String> b(List<String> list) {
        String str;
        String str2;
        String strB;
        if (this.f23403a.get() || !this.f23403a.compareAndSet(false, true)) {
            try {
                this.f23404b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (!(this.f23405c != null)) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            String str3 = list.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            t.e(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            t.e(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                str = null;
                break;
            }
            int i12 = i11 + 1;
            a aVar = f23399e;
            byte[] bArr2 = this.f23405c;
            if (bArr2 == null) {
                t.u("publicSuffixListBytes");
                bArr2 = null;
            }
            String strB2 = aVar.b(bArr2, bArr, i11);
            if (strB2 != null) {
                str = strB2;
                break;
            }
            i11 = i12;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                str2 = null;
                break;
            }
            int i14 = i13 + 1;
            bArr3[i13] = f23400f;
            a aVar2 = f23399e;
            byte[] bArr4 = this.f23405c;
            if (bArr4 == null) {
                t.u("publicSuffixListBytes");
                bArr4 = null;
            }
            String strB3 = aVar2.b(bArr4, bArr3, i13);
            if (strB3 != null) {
                str2 = strB3;
                break;
            }
            i13 = i14;
        }
        if (str2 == null) {
            strB = null;
            break;
        }
        int i15 = size - 1;
        int i16 = 0;
        while (true) {
            if (i16 >= i15) {
                strB = null;
                break;
            }
            int i17 = i16 + 1;
            a aVar3 = f23399e;
            byte[] bArr5 = this.f23406d;
            if (bArr5 == null) {
                t.u("publicSuffixExceptionListBytes");
                bArr5 = null;
            }
            strB = aVar3.b(bArr5, bArr, i16);
            if (strB != null) {
                break;
            }
            i16 = i17;
        }
        if (strB != null) {
            return f0.J0(t.n("!", strB), new char[]{'.'}, false, 0, 6, null);
        }
        if (str == null && str2 == null) {
            return f23401g;
        }
        List<String> listJ0 = str == null ? null : f0.J0(str, new char[]{'.'}, false, 0, 6, null);
        if (listJ0 == null) {
            listJ0 = kotlin.collections.t.k();
        }
        List<String> listJ1 = str2 != null ? f0.J0(str2, new char[]{'.'}, false, 0, 6, null) : null;
        if (listJ1 == null) {
            listJ1 = kotlin.collections.t.k();
        }
        return listJ0.size() > listJ1.size() ? listJ0 : listJ1;
    }

    private final void d() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        g gVarD = q.d(new n(q.k(resourceAsStream)));
        try {
            byte[] byteArray = gVarD.readByteArray(gVarD.readInt());
            byte[] byteArray2 = gVarD.readByteArray(gVarD.readInt());
            g0 g0Var = g0.f27756a;
            b.a(gVarD, null);
            synchronized (this) {
                t.c(byteArray);
                this.f23405c = byteArray;
                t.c(byteArray2);
                this.f23406d = byteArray2;
            }
            this.f23404b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(gVarD, th);
                throw th2;
            }
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    h.f27895a.g().k("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> f(String str) {
        List<String> listJ0 = f0.J0(str, new char[]{'.'}, false, 0, 6, null);
        return t.a(b0.X(listJ0), "") ? b0.K(listJ0, 1) : listJ0;
    }

    public final String c(String domain) {
        int size;
        int size2;
        t.f(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        t.e(unicodeDomain, "unicodeDomain");
        List<String> listF = f(unicodeDomain);
        List<String> listB = b(listF);
        if (listF.size() == listB.size() && listB.get(0).charAt(0) != '!') {
            return null;
        }
        if (listB.get(0).charAt(0) == '!') {
            size = listF.size();
            size2 = listB.size();
        } else {
            size = listF.size();
            size2 = listB.size() + 1;
        }
        return r.u(r.m(b0.E(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}

package ne;

import af.e;
import af.g;
import af.h;
import c2.YDwL.tFQWuE;
import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.jvm.internal.l0;
import me.a0;
import me.c0;
import me.r;
import me.t;
import me.x;
import od.k;
import rd.f0;
import rd.o;
import wc.f;
import wc.g0;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f22991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f22992b = t.f22535b.h(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f22993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f22994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final af.t f22995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f22996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o f22997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f22998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f22999i;

    static {
        byte[] bArr = new byte[0];
        f22991a = bArr;
        f22993c = c0.b.i(c0.Companion, bArr, null, 1, null);
        f22994d = a0.a.o(a0.Companion, bArr, null, 0, 0, 7, null);
        af.t.a aVar = af.t.f388c;
        h.a aVar2 = h.f361d;
        f22995e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.t.c(timeZone);
        f22996f = timeZone;
        f22997g = new o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f22998h = false;
        String name = x.class.getName();
        kotlin.jvm.internal.t.e(name, "OkHttpClient::class.java.name");
        f22999i = f0.C0(f0.B0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return z(str, i10, i11);
    }

    public static final int B(String str, int i10, int i11) {
        kotlin.jvm.internal.t.f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char cCharAt = str.charAt(i12);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12 = i13;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int C(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B(str, i10, i11);
    }

    public static final int D(String str, int i10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] other, Comparator<? super String> comparator) {
        kotlin.jvm.internal.t.f(strArr, "<this>");
        kotlin.jvm.internal.t.f(other, "other");
        kotlin.jvm.internal.t.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = other.length;
            int i11 = 0;
            while (i11 < length2) {
                String str2 = other[i11];
                i11++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean G(Socket socket, g source) {
        kotlin.jvm.internal.t.f(socket, "<this>");
        kotlin.jvm.internal.t.f(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean H(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        return rd.c0.B(name, "Authorization", true) || rd.c0.B(name, "Cookie", true) || rd.c0.B(name, "Proxy-Authorization", true) || rd.c0.B(name, "Set-Cookie", true);
    }

    public static final int I(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if (!('A' <= c10 && c10 < 'G')) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset J(g gVar, Charset charset) throws IOException {
        kotlin.jvm.internal.t.f(gVar, "<this>");
        kotlin.jvm.internal.t.f(charset, "default");
        int iL0 = gVar.l0(f22995e);
        if (iL0 == -1) {
            return charset;
        }
        if (iL0 == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.t.e(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iL0 == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            kotlin.jvm.internal.t.e(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iL0 == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            kotlin.jvm.internal.t.e(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iL0 == 3) {
            return rd.d.f24998a.a();
        }
        if (iL0 == 4) {
            return rd.d.f24998a.b();
        }
        throw new AssertionError();
    }

    public static final int K(g gVar) throws IOException {
        kotlin.jvm.internal.t.f(gVar, "<this>");
        return d(gVar.readByte(), 255) | (d(gVar.readByte(), 255) << 16) | (d(gVar.readByte(), 255) << 8);
    }

    public static final int L(e eVar, byte b10) throws EOFException {
        kotlin.jvm.internal.t.f(eVar, "<this>");
        int i10 = 0;
        while (!eVar.exhausted() && eVar.t(0L) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final boolean M(af.c0 c0Var, int i10, TimeUnit timeUnit) throws IOException {
        kotlin.jvm.internal.t.f(c0Var, "<this>");
        kotlin.jvm.internal.t.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = c0Var.timeout().e() ? c0Var.timeout().c() - jNanoTime : Long.MAX_VALUE;
        c0Var.timeout().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            e eVar = new e();
            while (c0Var.read(eVar, 8192L) != -1) {
                eVar.b();
            }
            if (jC == Long.MAX_VALUE) {
                c0Var.timeout().a();
            } else {
                c0Var.timeout().d(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                c0Var.timeout().a();
            } else {
                c0Var.timeout().d(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                c0Var.timeout().a();
            } else {
                c0Var.timeout().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final ThreadFactory N(final String name, final boolean z10) {
        kotlin.jvm.internal.t.f(name, "name");
        return new ThreadFactory() { // from class: ne.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return d.O(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread O(String name, boolean z10, Runnable runnable) {
        kotlin.jvm.internal.t.f(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<ue.b> P(t tVar) {
        kotlin.jvm.internal.t.f(tVar, "<this>");
        od.h hVarN = k.n(0, tVar.size());
        ArrayList arrayList = new ArrayList(u.u(hVarN, 10));
        Iterator<Integer> it = hVarN.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j0) it).nextInt();
            arrayList.add(new ue.b(tVar.c(iNextInt), tVar.e(iNextInt)));
        }
        return arrayList;
    }

    public static final t Q(List<ue.b> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        t.a aVar = new t.a();
        for (ue.b bVar : list) {
            aVar.c(bVar.a().I(), bVar.b().I());
        }
        return aVar.d();
    }

    public static final String R(me.u uVar, boolean z10) {
        String strH;
        kotlin.jvm.internal.t.f(uVar, "<this>");
        if (f0.U(uVar.h(), ":", false, 2, null)) {
            strH = '[' + uVar.h() + ']';
        } else {
            strH = uVar.h();
        }
        if (!z10 && uVar.l() == me.u.f22538k.c(uVar.p())) {
            return strH;
        }
        return strH + ':' + uVar.l();
    }

    public static /* synthetic */ String S(me.u uVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return R(uVar, z10);
    }

    public static final <T> List<T> T(List<? extends T> list) {
        kotlin.jvm.internal.t.f(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(b0.r0(list));
        kotlin.jvm.internal.t.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> U(Map<K, ? extends V> map) {
        kotlin.jvm.internal.t.f(map, "<this>");
        if (map.isEmpty()) {
            return o0.h();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        kotlin.jvm.internal.t.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long V(String str, long j10) {
        kotlin.jvm.internal.t.f(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int W(String str, int i10) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (lValueOf == null) {
            return i10;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String X(String str, int i10, int i11) {
        kotlin.jvm.internal.t.f(str, "<this>");
        int iZ = z(str, i10, i11);
        String strSubstring = str.substring(iZ, B(str, iZ, i11));
        kotlin.jvm.internal.t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String Y(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return X(str, i10, i11);
    }

    public static final Throwable Z(Exception exc, List<? extends Exception> suppressed) {
        kotlin.jvm.internal.t.f(exc, "<this>");
        kotlin.jvm.internal.t.f(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            f.a(exc, it.next());
        }
        return exc;
    }

    public static final void a0(af.f fVar, int i10) throws IOException {
        kotlin.jvm.internal.t.f(fVar, "<this>");
        fVar.writeByte((i10 >>> 16) & 255);
        fVar.writeByte((i10 >>> 8) & 255);
        fVar.writeByte(i10 & 255);
    }

    public static final <E> void c(List<E> list, E e10) {
        kotlin.jvm.internal.t.f(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final r.c g(final r rVar) {
        kotlin.jvm.internal.t.f(rVar, "<this>");
        return new r.c() { // from class: ne.c
            @Override // me.r.c
            public final r a(me.e eVar) {
                return d.h(rVar, eVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r h(r this_asFactory, me.e it) {
        kotlin.jvm.internal.t.f(this_asFactory, "$this_asFactory");
        kotlin.jvm.internal.t.f(it, "it");
        return this_asFactory;
    }

    public static final boolean i(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        return f22997g.e(str);
    }

    public static final boolean j(me.u uVar, me.u other) {
        kotlin.jvm.internal.t.f(uVar, "<this>");
        kotlin.jvm.internal.t.f(other, "other");
        return kotlin.jvm.internal.t.a(uVar.h(), other.h()) && uVar.l() == other.l() && kotlin.jvm.internal.t.a(uVar.p(), other.p());
    }

    public static final int k(String name, long j10, TimeUnit timeUnit) {
        kotlin.jvm.internal.t.f(name, "name");
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalStateException(kotlin.jvm.internal.t.n(name, " < 0").toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (!(millis <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.t.n(name, " too large.").toString());
        }
        if (millis == 0 && j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return (int) millis;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.t.n(name, " too small.").toString());
    }

    public static final void l(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        kotlin.jvm.internal.t.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        kotlin.jvm.internal.t.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!kotlin.jvm.internal.t.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String value) {
        kotlin.jvm.internal.t.f(strArr, "<this>");
        kotlin.jvm.internal.t.f(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        kotlin.jvm.internal.t.e(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[kotlin.collections.o.C(strArr2)] = value;
        return strArr2;
    }

    public static final int p(String str, char c10, int i10, int i11) {
        kotlin.jvm.internal.t.f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int q(String str, String delimiters, int i10, int i11) {
        kotlin.jvm.internal.t.f(str, "<this>");
        kotlin.jvm.internal.t.f(delimiters, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (f0.T(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return p(str, c10, i10, i11);
    }

    public static final boolean s(af.c0 c0Var, int i10, TimeUnit timeUnit) {
        kotlin.jvm.internal.t.f(c0Var, "<this>");
        kotlin.jvm.internal.t.f(timeUnit, "timeUnit");
        try {
            return M(c0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String format, Object... args) {
        kotlin.jvm.internal.t.f(format, "format");
        kotlin.jvm.internal.t.f(args, "args");
        l0 l0Var = l0.f21527a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        kotlin.jvm.internal.t.e(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        kotlin.jvm.internal.t.f(strArr, "<this>");
        kotlin.jvm.internal.t.f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator itA = kotlin.jvm.internal.c.a(strArr2);
                    while (itA.hasNext()) {
                        if (comparator.compare(str, (String) itA.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long v(me.b0 b0Var) {
        kotlin.jvm.internal.t.f(b0Var, "<this>");
        String strA = b0Var.s().a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        return V(strA, -1L);
    }

    @SafeVarargs
    public static final <T> List<T> w(T... elements) {
        kotlin.jvm.internal.t.f(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(kotlin.collections.t.n(Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.t.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int x(String[] strArr, String value, Comparator<String> comparator) {
        kotlin.jvm.internal.t.f(strArr, "<this>");
        kotlin.jvm.internal.t.f(value, "value");
        kotlin.jvm.internal.t.f(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        kotlin.jvm.internal.t.f(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (kotlin.jvm.internal.t.g(cCharAt, 31) <= 0 || kotlin.jvm.internal.t.g(cCharAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final boolean F(ve.a aVar, File file) throws IOException {
        kotlin.jvm.internal.t.f(aVar, "<this>");
        kotlin.jvm.internal.t.f(file, yhXxbqGRMeI.YNzNLKQ);
        af.a0 a0VarSink = aVar.sink(file);
        try {
            try {
                aVar.delete(file);
                fd.b.a(a0VarSink, null);
                return true;
            } catch (IOException unused) {
                g0 g0Var = g0.f27756a;
                fd.b.a(a0VarSink, null);
                aVar.delete(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(a0VarSink, th);
                throw th2;
            }
        }
    }

    public static final int z(String str, int i10, int i11) {
        kotlin.jvm.internal.t.f(str, tFQWuE.gvEIxKhmGNAD);
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }
}

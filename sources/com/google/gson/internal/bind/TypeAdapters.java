package com.google.gson.internal.bind;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes4.dex */
public final class TypeAdapters {
    public static final g4.s<String> A;
    public static final g4.s<BigDecimal> B;
    public static final g4.s<BigInteger> C;
    public static final g4.t D;
    public static final g4.s<StringBuilder> E;
    public static final g4.t F;
    public static final g4.s<StringBuffer> G;
    public static final g4.t H;
    public static final g4.s<URL> I;
    public static final g4.t J;
    public static final g4.s<URI> K;
    public static final g4.t L;
    public static final g4.s<InetAddress> M;
    public static final g4.t N;
    public static final g4.s<UUID> O;
    public static final g4.t P;
    public static final g4.s<Currency> Q;
    public static final g4.t R;
    public static final g4.t S;
    public static final g4.s<Calendar> T;
    public static final g4.t U;
    public static final g4.s<Locale> V;
    public static final g4.t W;
    public static final g4.s<g4.l> X;
    public static final g4.t Y;
    public static final g4.t Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g4.s<Class> f12396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g4.t f12397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g4.s<BitSet> f12398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g4.t f12399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g4.s<Boolean> f12400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g4.s<Boolean> f12401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g4.t f12402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g4.s<Number> f12403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g4.t f12404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g4.s<Number> f12405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g4.t f12406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g4.s<Number> f12407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g4.t f12408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g4.s<AtomicInteger> f12409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g4.t f12410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g4.s<AtomicBoolean> f12411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g4.t f12412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g4.s<AtomicIntegerArray> f12413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g4.t f12414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g4.s<Number> f12415t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g4.s<Number> f12416u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g4.s<Number> f12417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g4.s<Number> f12418w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g4.t f12419x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g4.s<Character> f12420y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g4.t f12421z;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    class AnonymousClass31 implements g4.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l4.a f12424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g4.s f12425b;

        @Override // g4.t
        public <T> g4.s<T> a(g4.f fVar, l4.a<T> aVar) {
            if (aVar.equals(this.f12424a)) {
                return this.f12425b;
            }
            return null;
        }
    }

    class a extends g4.s<AtomicIntegerArray> {
        a() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(m4.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.p()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.B()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            aVar.k();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.e();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.H(atomicIntegerArray.get(i10));
            }
            cVar.k();
        }
    }

    class a0 extends g4.s<Number> {
        a0() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            try {
                return Integer.valueOf(aVar.B());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            cVar.J(number);
        }
    }

    class b extends g4.s<Number> {
        b() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            try {
                return Long.valueOf(aVar.C());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            cVar.J(number);
        }
    }

    class b0 extends g4.s<AtomicInteger> {
        b0() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(m4.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.B());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.H(atomicInteger.get());
        }
    }

    class c extends g4.s<Number> {
        c() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return Float.valueOf((float) aVar.z());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            cVar.J(number);
        }
    }

    class c0 extends g4.s<AtomicBoolean> {
        c0() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(m4.a aVar) throws IOException {
            return new AtomicBoolean(aVar.v());
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.L(atomicBoolean.get());
        }
    }

    class d extends g4.s<Number> {
        d() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return Double.valueOf(aVar.z());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            cVar.J(number);
        }
    }

    private static final class d0<T extends Enum<T>> extends g4.s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, T> f12438a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<T, String> f12439b = new HashMap();

        class a implements PrivilegedAction<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Field f12440a;

            a(Field field) {
                this.f12440a = field;
            }

            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void run() {
                this.f12440a.setAccessible(true);
                return null;
            }
        }

        public d0(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum r10 = (Enum) field.get(null);
                        String strName = r10.name();
                        h4.c cVar = (h4.c) field.getAnnotation(h4.c.class);
                        if (cVar != null) {
                            strName = cVar.value();
                            for (String str : cVar.alternate()) {
                                this.f12438a.put(str, (T) r10);
                            }
                        }
                        this.f12438a.put(strName, (T) r10);
                        this.f12439b.put((T) r10, strName);
                    }
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return this.f12438a.get(aVar.J());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, T t10) throws IOException {
            cVar.K(t10 == null ? null : this.f12439b.get(t10));
        }
    }

    class e extends g4.s<Number> {
        e() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            m4.b bVarL = aVar.L();
            int i10 = v.f12442a[bVarL.ordinal()];
            if (i10 == 1 || i10 == 3) {
                return new i4.f(aVar.J());
            }
            if (i10 == 4) {
                aVar.H();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + bVarL);
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            cVar.J(number);
        }
    }

    class f extends g4.s<Character> {
        f() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            String strJ = aVar.J();
            if (strJ.length() == 1) {
                return Character.valueOf(strJ.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + strJ);
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Character ch) throws IOException {
            cVar.K(ch == null ? null : String.valueOf(ch));
        }
    }

    class g extends g4.s<String> {
        g() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(m4.a aVar) throws IOException {
            m4.b bVarL = aVar.L();
            if (bVarL != m4.b.NULL) {
                return bVarL == m4.b.BOOLEAN ? Boolean.toString(aVar.v()) : aVar.J();
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, String str) throws IOException {
            cVar.K(str);
        }
    }

    class h extends g4.s<BigDecimal> {
        h() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            try {
                return new BigDecimal(aVar.J());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.J(bigDecimal);
        }
    }

    class i extends g4.s<BigInteger> {
        i() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            try {
                return new BigInteger(aVar.J());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, BigInteger bigInteger) throws IOException {
            cVar.J(bigInteger);
        }
    }

    class j extends g4.s<StringBuilder> {
        j() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return new StringBuilder(aVar.J());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, StringBuilder sb2) throws IOException {
            cVar.K(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends g4.s<Class> {
        k() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(m4.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends g4.s<StringBuffer> {
        l() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return new StringBuffer(aVar.J());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.K(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends g4.s<URL> {
        m() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            String strJ = aVar.J();
            if ("null".equals(strJ)) {
                return null;
            }
            return new URL(strJ);
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, URL url) throws IOException {
            cVar.K(url == null ? null : url.toExternalForm());
        }
    }

    class n extends g4.s<URI> {
        n() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            try {
                String strJ = aVar.J();
                if ("null".equals(strJ)) {
                    return null;
                }
                return new URI(strJ);
            } catch (URISyntaxException e10) {
                throw new JsonIOException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, URI uri) throws IOException {
            cVar.K(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends g4.s<InetAddress> {
        o() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return InetAddress.getByName(aVar.J());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, InetAddress inetAddress) throws IOException {
            cVar.K(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends g4.s<UUID> {
        p() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return UUID.fromString(aVar.J());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, UUID uuid) throws IOException {
            cVar.K(uuid == null ? null : uuid.toString());
        }
    }

    class q extends g4.s<Currency> {
        q() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(m4.a aVar) throws IOException {
            return Currency.getInstance(aVar.J());
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Currency currency) throws IOException {
            cVar.K(currency.getCurrencyCode());
        }
    }

    class r extends g4.s<Calendar> {
        r() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            aVar.c();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.L() != m4.b.END_OBJECT) {
                String strF = aVar.F();
                int iB = aVar.B();
                if ("year".equals(strF)) {
                    i10 = iB;
                } else if ("month".equals(strF)) {
                    i11 = iB;
                } else if ("dayOfMonth".equals(strF)) {
                    i12 = iB;
                } else if ("hourOfDay".equals(strF)) {
                    i13 = iB;
                } else if ("minute".equals(strF)) {
                    i14 = iB;
                } else if ("second".equals(strF)) {
                    i15 = iB;
                }
            }
            aVar.n();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.u();
                return;
            }
            cVar.f();
            cVar.s("year");
            cVar.H(calendar.get(1));
            cVar.s("month");
            cVar.H(calendar.get(2));
            cVar.s("dayOfMonth");
            cVar.H(calendar.get(5));
            cVar.s("hourOfDay");
            cVar.H(calendar.get(11));
            cVar.s("minute");
            cVar.H(calendar.get(12));
            cVar.s("second");
            cVar.H(calendar.get(13));
            cVar.n();
        }
    }

    class s extends g4.s<Locale> {
        s() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.J(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Locale locale) throws IOException {
            cVar.K(locale == null ? null : locale.toString());
        }
    }

    class t extends g4.s<g4.l> {
        t() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g4.l b(m4.a aVar) throws IOException {
            switch (v.f12442a[aVar.L().ordinal()]) {
                case 1:
                    return new g4.o(new i4.f(aVar.J()));
                case 2:
                    return new g4.o(Boolean.valueOf(aVar.v()));
                case 3:
                    return new g4.o(aVar.J());
                case 4:
                    aVar.H();
                    return g4.m.f15373a;
                case 5:
                    g4.i iVar = new g4.i();
                    aVar.b();
                    while (aVar.p()) {
                        iVar.i(b(aVar));
                    }
                    aVar.k();
                    return iVar;
                case 6:
                    g4.n nVar = new g4.n();
                    aVar.c();
                    while (aVar.p()) {
                        nVar.i(aVar.F(), b(aVar));
                    }
                    aVar.n();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, g4.l lVar) throws IOException {
            if (lVar == null || lVar.f()) {
                cVar.u();
                return;
            }
            if (lVar.h()) {
                g4.o oVarD = lVar.d();
                if (oVarD.s()) {
                    cVar.J(oVarD.o());
                    return;
                } else if (oVarD.q()) {
                    cVar.L(oVarD.i());
                    return;
                } else {
                    cVar.K(oVarD.p());
                    return;
                }
            }
            if (lVar.e()) {
                cVar.e();
                Iterator<g4.l> it = lVar.a().iterator();
                while (it.hasNext()) {
                    d(cVar, it.next());
                }
                cVar.k();
                return;
            }
            if (!lVar.g()) {
                throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
            }
            cVar.f();
            for (Map.Entry<String, g4.l> entry : lVar.c().j()) {
                cVar.s(entry.getKey());
                d(cVar, entry.getValue());
            }
            cVar.n();
        }
    }

    class u extends g4.s<BitSet> {
        u() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002e  */
        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(m4.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.b();
            m4.b bVarL = aVar.L();
            int i10 = 0;
            while (bVarL != m4.b.END_ARRAY) {
                int i11 = v.f12442a[bVarL.ordinal()];
                boolean zV = true;
                if (i11 != 1) {
                    if (i11 == 2) {
                        zV = aVar.v();
                    } else {
                        if (i11 != 3) {
                            throw new JsonSyntaxException("Invalid bitset value type: " + bVarL);
                        }
                        String strJ = aVar.J();
                        try {
                            if (Integer.parseInt(strJ) == 0) {
                                zV = false;
                            }
                        } catch (NumberFormatException unused) {
                            throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + strJ);
                        }
                    }
                } else if (aVar.B() == 0) {
                    zV = false;
                }
                if (zV) {
                    bitSet.set(i10);
                }
                i10++;
                bVarL = aVar.L();
            }
            aVar.k();
            return bitSet;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, BitSet bitSet) throws IOException {
            cVar.e();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.H(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.k();
        }
    }

    static /* synthetic */ class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12442a;

        static {
            int[] iArr = new int[m4.b.values().length];
            f12442a = iArr;
            try {
                iArr[m4.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12442a[m4.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12442a[m4.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12442a[m4.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12442a[m4.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12442a[m4.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12442a[m4.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12442a[m4.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12442a[m4.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12442a[m4.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    class w extends g4.s<Boolean> {
        w() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(m4.a aVar) throws IOException {
            m4.b bVarL = aVar.L();
            if (bVarL != m4.b.NULL) {
                return bVarL == m4.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.J())) : Boolean.valueOf(aVar.v());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Boolean bool) throws IOException {
            cVar.I(bool);
        }
    }

    class x extends g4.s<Boolean> {
        x() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return Boolean.valueOf(aVar.J());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Boolean bool) throws IOException {
            cVar.K(bool == null ? "null" : bool.toString());
        }
    }

    class y extends g4.s<Number> {
        y() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.B());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            cVar.J(number);
        }
    }

    class z extends g4.s<Number> {
        z() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            if (aVar.L() == m4.b.NULL) {
                aVar.H();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.B());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            cVar.J(number);
        }
    }

    static {
        g4.s<Class> sVarA = new k().a();
        f12396a = sVarA;
        f12397b = a(Class.class, sVarA);
        g4.s<BitSet> sVarA2 = new u().a();
        f12398c = sVarA2;
        f12399d = a(BitSet.class, sVarA2);
        w wVar = new w();
        f12400e = wVar;
        f12401f = new x();
        f12402g = b(Boolean.TYPE, Boolean.class, wVar);
        y yVar = new y();
        f12403h = yVar;
        f12404i = b(Byte.TYPE, Byte.class, yVar);
        z zVar = new z();
        f12405j = zVar;
        f12406k = b(Short.TYPE, Short.class, zVar);
        a0 a0Var = new a0();
        f12407l = a0Var;
        f12408m = b(Integer.TYPE, Integer.class, a0Var);
        g4.s<AtomicInteger> sVarA3 = new b0().a();
        f12409n = sVarA3;
        f12410o = a(AtomicInteger.class, sVarA3);
        g4.s<AtomicBoolean> sVarA4 = new c0().a();
        f12411p = sVarA4;
        f12412q = a(AtomicBoolean.class, sVarA4);
        g4.s<AtomicIntegerArray> sVarA5 = new a().a();
        f12413r = sVarA5;
        f12414s = a(AtomicIntegerArray.class, sVarA5);
        f12415t = new b();
        f12416u = new c();
        f12417v = new d();
        e eVar = new e();
        f12418w = eVar;
        f12419x = a(Number.class, eVar);
        f fVar = new f();
        f12420y = fVar;
        f12421z = b(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = a(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = a(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = d(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        g4.s<Currency> sVarA6 = new q().a();
        Q = sVarA6;
        R = a(Currency.class, sVarA6);
        S = new g4.t() { // from class: com.google.gson.internal.bind.TypeAdapters.26

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
            class a extends g4.s<Timestamp> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ g4.s f12422a;

                a(g4.s sVar) {
                    this.f12422a = sVar;
                }

                @Override // g4.s
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Timestamp b(m4.a aVar) throws IOException {
                    Date date = (Date) this.f12422a.b(aVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // g4.s
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public void d(m4.c cVar, Timestamp timestamp) throws IOException {
                    this.f12422a.d(cVar, timestamp);
                }
            }

            @Override // g4.t
            public <T> g4.s<T> a(g4.f fVar2, l4.a<T> aVar) {
                if (aVar.c() != Timestamp.class) {
                    return null;
                }
                return new a(fVar2.k(Date.class));
            }
        };
        r rVar = new r();
        T = rVar;
        U = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        V = sVar;
        W = a(Locale.class, sVar);
        t tVar = new t();
        X = tVar;
        Y = d(g4.l.class, tVar);
        Z = new g4.t() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // g4.t
            public <T> g4.s<T> a(g4.f fVar2, l4.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                    return null;
                }
                if (!clsC.isEnum()) {
                    clsC = clsC.getSuperclass();
                }
                return new d0(clsC);
            }
        };
    }

    public static <TT> g4.t a(final Class<TT> cls, final g4.s<TT> sVar) {
        return new g4.t() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // g4.t
            public <T> g4.s<T> a(g4.f fVar, l4.a<T> aVar) {
                if (aVar.c() == cls) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> g4.t b(final Class<TT> cls, final Class<TT> cls2, final g4.s<? super TT> sVar) {
        return new g4.t() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // g4.t
            public <T> g4.s<T> a(g4.f fVar, l4.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return edUJlCZxhVnO.QRBUCbVUFYb + cls2.getName() + "+" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> g4.t c(final Class<TT> cls, final Class<? extends TT> cls2, final g4.s<? super TT> sVar) {
        return new g4.t() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // g4.t
            public <T> g4.s<T> a(g4.f fVar, l4.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC == cls || clsC == cls2) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <T1> g4.t d(final Class<T1> cls, final g4.s<T1> sVar) {
        return new g4.t() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* JADX INFO: Add missing generic type declarations: [T1] */
            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            class a<T1> extends g4.s<T1> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Class f12436a;

                a(Class cls) {
                    this.f12436a = cls;
                }

                @Override // g4.s
                public T1 b(m4.a aVar) throws IOException {
                    T1 t10 = (T1) sVar.b(aVar);
                    if (t10 == null || this.f12436a.isInstance(t10)) {
                        return t10;
                    }
                    throw new JsonSyntaxException("Expected a " + this.f12436a.getName() + " but was " + t10.getClass().getName());
                }

                @Override // g4.s
                public void d(m4.c cVar, T1 t10) throws IOException {
                    sVar.d(cVar, t10);
                }
            }

            @Override // g4.t
            public <T2> g4.s<T2> a(g4.f fVar, l4.a<T2> aVar) {
                Class<? super T2> clsC = aVar.c();
                if (cls.isAssignableFrom(clsC)) {
                    return new a(clsC);
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }
}

package g4;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final l4.a<?> f15329v = l4.a.a(Object.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<l4.a<?>, C0230f<?>>> f15330a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<l4.a<?>, s<?>> f15331b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i4.c f15332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f15333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<t> f15334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Excluder f15335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final g4.e f15336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Map<Type, h<?>> f15337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f15338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final boolean f15339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f15340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f15341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f15342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f15343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f15344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final String f15345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f15346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f15347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final r f15348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final List<t> f15349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final List<t> f15350u;

    /* JADX INFO: compiled from: Gson.java */
    class a extends s<Number> {
        a() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return Double.valueOf(aVar.z());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.u();
            } else {
                f.d(number.doubleValue());
                cVar.J(number);
            }
        }
    }

    /* JADX INFO: compiled from: Gson.java */
    class b extends s<Number> {
        b() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return Float.valueOf((float) aVar.z());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.u();
            } else {
                f.d(number.floatValue());
                cVar.J(number);
            }
        }
    }

    /* JADX INFO: compiled from: Gson.java */
    class c extends s<Number> {
        c() {
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(m4.a aVar) throws IOException {
            if (aVar.L() != m4.b.NULL) {
                return Long.valueOf(aVar.C());
            }
            aVar.H();
            return null;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.u();
            } else {
                cVar.K(number.toString());
            }
        }
    }

    /* JADX INFO: compiled from: Gson.java */
    class d extends s<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f15353a;

        d(s sVar) {
            this.f15353a = sVar;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(m4.a aVar) throws IOException {
            return new AtomicLong(((Number) this.f15353a.b(aVar)).longValue());
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, AtomicLong atomicLong) throws IOException {
            this.f15353a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: compiled from: Gson.java */
    class e extends s<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f15354a;

        e(s sVar) {
            this.f15354a = sVar;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(m4.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.p()) {
                arrayList.add(Long.valueOf(((Number) this.f15354a.b(aVar)).longValue()));
            }
            aVar.k();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // g4.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(m4.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.e();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f15354a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.k();
        }
    }

    /* JADX INFO: renamed from: g4.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Gson.java */
    static class C0230f<T> extends s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s<T> f15355a;

        C0230f() {
        }

        @Override // g4.s
        public T b(m4.a aVar) throws IOException {
            s<T> sVar = this.f15355a;
            if (sVar != null) {
                return sVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // g4.s
        public void d(m4.c cVar, T t10) throws IOException {
            s<T> sVar = this.f15355a;
            if (sVar == null) {
                throw new IllegalStateException();
            }
            sVar.d(cVar, t10);
        }

        public void e(s<T> sVar) {
            if (this.f15355a != null) {
                throw new AssertionError();
            }
            this.f15355a = sVar;
        }
    }

    f(Excluder excluder, g4.e eVar, Map<Type, h<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, r rVar, String str, int i10, int i11, List<t> list, List<t> list2, List<t> list3) {
        this.f15335f = excluder;
        this.f15336g = eVar;
        this.f15337h = map;
        i4.c cVar = new i4.c(map);
        this.f15332c = cVar;
        this.f15338i = z10;
        this.f15339j = z11;
        this.f15340k = z12;
        this.f15341l = z13;
        this.f15342m = z14;
        this.f15343n = z15;
        this.f15344o = z16;
        this.f15348s = rVar;
        this.f15345p = str;
        this.f15346q = i10;
        this.f15347r = i11;
        this.f15349t = list;
        this.f15350u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.f12359b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f12408m);
        arrayList.add(TypeAdapters.f12402g);
        arrayList.add(TypeAdapters.f12404i);
        arrayList.add(TypeAdapters.f12406k);
        s<Number> sVarN = n(rVar);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, sVarN));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, e(z16)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, f(z16)));
        arrayList.add(TypeAdapters.f12419x);
        arrayList.add(TypeAdapters.f12410o);
        arrayList.add(TypeAdapters.f12412q);
        arrayList.add(TypeAdapters.a(AtomicLong.class, b(sVarN)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, c(sVarN)));
        arrayList.add(TypeAdapters.f12414s);
        arrayList.add(TypeAdapters.f12421z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.C));
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f12399d);
        arrayList.add(DateTypeAdapter.f12350b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.f12381b);
        arrayList.add(SqlDateTypeAdapter.f12379b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.f12344c);
        arrayList.add(TypeAdapters.f12397b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar));
        arrayList.add(new MapTypeAdapterFactory(cVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar);
        this.f15333d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar, eVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f15334e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, m4.a aVar) {
        if (obj != null) {
            try {
                if (aVar.L() == m4.b.END_DOCUMENT) {
                } else {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    private static s<AtomicLong> b(s<Number> sVar) {
        return new d(sVar).a();
    }

    private static s<AtomicLongArray> c(s<Number> sVar) {
        return new e(sVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private s<Number> e(boolean z10) {
        return z10 ? TypeAdapters.f12417v : new a();
    }

    private s<Number> f(boolean z10) {
        return z10 ? TypeAdapters.f12416u : new b();
    }

    private static s<Number> n(r rVar) {
        return rVar == r.f15376a ? TypeAdapters.f12415t : new c();
    }

    public <T> T g(Reader reader, Type type) throws JsonSyntaxException, JsonIOException {
        m4.a aVarO = o(reader);
        T t10 = (T) j(aVarO, type);
        a(t10, aVarO);
        return t10;
    }

    public <T> T h(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) i4.j.b(cls).cast(i(str, cls));
    }

    public <T> T i(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) g(new StringReader(str), type);
    }

    public <T> T j(m4.a aVar, Type type) throws JsonSyntaxException, JsonIOException {
        boolean zS = aVar.s();
        boolean z10 = true;
        aVar.e0(true);
        try {
            try {
                try {
                    aVar.L();
                    z10 = false;
                    T tB = l(l4.a.b(type)).b(aVar);
                    aVar.e0(zS);
                    return tB;
                } catch (AssertionError e10) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.8): " + e10.getMessage());
                    assertionError.initCause(e10);
                    throw assertionError;
                } catch (IllegalStateException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (EOFException e12) {
                if (!z10) {
                    throw new JsonSyntaxException(e12);
                }
                aVar.e0(zS);
                return null;
            } catch (IOException e13) {
                throw new JsonSyntaxException(e13);
            }
        } catch (Throwable th) {
            aVar.e0(zS);
            throw th;
        }
    }

    public <T> s<T> k(Class<T> cls) {
        return l(l4.a.a(cls));
    }

    public <T> s<T> l(l4.a<T> aVar) {
        boolean z10;
        s<T> sVar = (s) this.f15331b.get(aVar == null ? f15329v : aVar);
        if (sVar != null) {
            return sVar;
        }
        Map<l4.a<?>, C0230f<?>> map = this.f15330a.get();
        if (map == null) {
            map = new HashMap<>();
            this.f15330a.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        C0230f<?> c0230f = map.get(aVar);
        if (c0230f != null) {
            return c0230f;
        }
        try {
            C0230f<?> c0230f2 = new C0230f<>();
            map.put(aVar, c0230f2);
            Iterator<t> it = this.f15334e.iterator();
            while (it.hasNext()) {
                s<T> sVarA = it.next().a(this, aVar);
                if (sVarA != null) {
                    c0230f2.e(sVarA);
                    this.f15331b.put(aVar, sVarA);
                    map.remove(aVar);
                    if (z10) {
                        this.f15330a.remove();
                    }
                    return sVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.8) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z10) {
                this.f15330a.remove();
            }
            throw th;
        }
    }

    public <T> s<T> m(t tVar, l4.a<T> aVar) {
        if (!this.f15334e.contains(tVar)) {
            tVar = this.f15333d;
        }
        boolean z10 = false;
        for (t tVar2 : this.f15334e) {
            if (z10) {
                s<T> sVarA = tVar2.a(this, aVar);
                if (sVarA != null) {
                    return sVarA;
                }
            } else if (tVar2 == tVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public m4.a o(Reader reader) {
        m4.a aVar = new m4.a(reader);
        aVar.e0(this.f15343n);
        return aVar;
    }

    public String toString() {
        return "{serializeNulls:" + this.f15338i + cTJaRZ.BWDaKYeiJsLlrCa + this.f15334e + ",instanceCreators:" + this.f15332c + "}";
    }
}

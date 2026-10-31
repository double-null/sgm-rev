package pe;

import af.a0;
import af.c0;
import af.g;
import af.q;
import com.facebook.appevents.AppEventsConstants;
import id.l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import rd.f0;
import rd.o;
import wc.g0;
import we.h;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.a f24296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f24297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f24300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f24301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f24302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final File f24303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f24304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private af.f f24305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashMap<String, c> f24306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f24308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f24309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f24310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f24312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f24313r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f24314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final qe.d f24315t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final e f24316u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f24291v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f24292w = "journal";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f24293x = "journal.tmp";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f24294y = "journal.bkp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f24295z = "libcore.io.DiskLruCache";
    public static final String A = AppEventsConstants.EVENT_PARAM_VALUE_YES;
    public static final long B = -1;
    public static final o C = new o("[a-z0-9_-]{1,120}");
    public static final String D = "CLEAN";
    public static final String E = "DIRTY";
    public static final String F = "REMOVE";
    public static final String G = "READ";

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f24317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f24318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f24320d;

        /* JADX INFO: compiled from: DiskLruCache.kt */
        static final class a extends u implements l<IOException, g0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d f24321d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f24322e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, b bVar) {
                super(1);
                this.f24321d = dVar;
                this.f24322e = bVar;
            }

            @Override // id.l
            public /* bridge */ /* synthetic */ g0 invoke(IOException iOException) {
                invoke2(iOException);
                return g0.f27756a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IOException it) {
                t.f(it, "it");
                d dVar = this.f24321d;
                b bVar = this.f24322e;
                synchronized (dVar) {
                    bVar.c();
                    g0 g0Var = g0.f27756a;
                }
            }
        }

        public b(d this$0, c entry) {
            t.f(this$0, "this$0");
            t.f(entry, "entry");
            this.f24320d = this$0;
            this.f24317a = entry;
            this.f24318b = entry.g() ? null : new boolean[this$0.H()];
        }

        public final void a() throws IOException {
            d dVar = this.f24320d;
            synchronized (dVar) {
                if (!(!this.f24319c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (t.a(d().b(), this)) {
                    dVar.s(this, false);
                }
                this.f24319c = true;
                g0 g0Var = g0.f27756a;
            }
        }

        public final void b() throws IOException {
            d dVar = this.f24320d;
            synchronized (dVar) {
                if (!(!this.f24319c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (t.a(d().b(), this)) {
                    dVar.s(this, true);
                }
                this.f24319c = true;
                g0 g0Var = g0.f27756a;
            }
        }

        public final void c() throws IOException {
            if (t.a(this.f24317a.b(), this)) {
                if (this.f24320d.f24309n) {
                    this.f24320d.s(this, false);
                } else {
                    this.f24317a.q(true);
                }
            }
        }

        public final c d() {
            return this.f24317a;
        }

        public final boolean[] e() {
            return this.f24318b;
        }

        public final a0 f(int i10) {
            d dVar = this.f24320d;
            synchronized (dVar) {
                if (!(!this.f24319c)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!t.a(d().b(), this)) {
                    return q.b();
                }
                if (!d().g()) {
                    boolean[] zArrE = e();
                    t.c(zArrE);
                    zArrE[i10] = true;
                }
                try {
                    return new pe.e(dVar.F().sink(d().c().get(i10)), new a(dVar, this));
                } catch (FileNotFoundException unused) {
                    return q.b();
                }
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f24324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<File> f24325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<File> f24326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f24328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f24329g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f24330h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f24331i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f24332j;

        /* JADX INFO: compiled from: DiskLruCache.kt */
        public static final class a extends af.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f24333a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f24334b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f24335c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f24336d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, d dVar, c cVar) {
                super(c0Var);
                this.f24334b = c0Var;
                this.f24335c = dVar;
                this.f24336d = cVar;
            }

            @Override // af.k, af.c0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.f24333a) {
                    return;
                }
                this.f24333a = true;
                d dVar = this.f24335c;
                c cVar = this.f24336d;
                synchronized (dVar) {
                    cVar.n(cVar.f() - 1);
                    if (cVar.f() == 0 && cVar.i()) {
                        dVar.e0(cVar);
                    }
                    g0 g0Var = g0.f27756a;
                }
            }
        }

        public c(d this$0, String key) {
            t.f(this$0, "this$0");
            t.f(key, "key");
            this.f24332j = this$0;
            this.f24323a = key;
            this.f24324b = new long[this$0.H()];
            this.f24325c = new ArrayList();
            this.f24326d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int iH = this$0.H();
            for (int i10 = 0; i10 < iH; i10++) {
                sb2.append(i10);
                this.f24325c.add(new File(this.f24332j.C(), sb2.toString()));
                sb2.append(".tmp");
                this.f24326d.add(new File(this.f24332j.C(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> list) throws IOException {
            throw new IOException(t.n("unexpected journal line: ", list));
        }

        private final c0 k(int i10) throws FileNotFoundException {
            c0 c0VarSource = this.f24332j.F().source(this.f24325c.get(i10));
            if (this.f24332j.f24309n) {
                return c0VarSource;
            }
            this.f24330h++;
            return new a(c0VarSource, this.f24332j, this);
        }

        public final List<File> a() {
            return this.f24325c;
        }

        public final b b() {
            return this.f24329g;
        }

        public final List<File> c() {
            return this.f24326d;
        }

        public final String d() {
            return this.f24323a;
        }

        public final long[] e() {
            return this.f24324b;
        }

        public final int f() {
            return this.f24330h;
        }

        public final boolean g() {
            return this.f24327e;
        }

        public final long h() {
            return this.f24331i;
        }

        public final boolean i() {
            return this.f24328f;
        }

        public final void l(b bVar) {
            this.f24329g = bVar;
        }

        public final void m(List<String> strings) throws IOException {
            t.f(strings, "strings");
            if (strings.size() != this.f24332j.H()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    this.f24324b[i10] = Long.parseLong(strings.get(i10));
                    i10 = i11;
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i10) {
            this.f24330h = i10;
        }

        public final void o(boolean z10) {
            this.f24327e = z10;
        }

        public final void p(long j10) {
            this.f24331i = j10;
        }

        public final void q(boolean z10) {
            this.f24328f = z10;
        }

        public final C0395d r() {
            d dVar = this.f24332j;
            if (ne.d.f22998h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + dVar);
            }
            if (!this.f24327e) {
                return null;
            }
            if (!this.f24332j.f24309n && (this.f24329g != null || this.f24328f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f24324b.clone();
            try {
                int iH = this.f24332j.H();
                for (int i10 = 0; i10 < iH; i10++) {
                    arrayList.add(k(i10));
                }
                return new C0395d(this.f24332j, this.f24323a, this.f24331i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ne.d.m((c0) it.next());
                }
                try {
                    this.f24332j.e0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(af.f writer) throws IOException {
            t.f(writer, "writer");
            long[] jArr = this.f24324b;
            int length = jArr.length;
            int i10 = 0;
            while (i10 < length) {
                long j10 = jArr[i10];
                i10++;
                writer.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* JADX INFO: renamed from: pe.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskLruCache.kt */
    public final class C0395d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f24338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c0> f24339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f24340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f24341e;

        /* JADX WARN: Multi-variable type inference failed */
        public C0395d(d this$0, String key, long j10, List<? extends c0> sources, long[] lengths) {
            t.f(this$0, "this$0");
            t.f(key, "key");
            t.f(sources, "sources");
            t.f(lengths, "lengths");
            this.f24341e = this$0;
            this.f24337a = key;
            this.f24338b = j10;
            this.f24339c = sources;
            this.f24340d = lengths;
        }

        public final b b() throws IOException {
            return this.f24341e.u(this.f24337a, this.f24338b);
        }

        public final c0 c(int i10) {
            return this.f24339c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<c0> it = this.f24339c.iterator();
            while (it.hasNext()) {
                ne.d.m(it.next());
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    public static final class e extends qe.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // qe.a
        public long f() {
            d dVar = d.this;
            synchronized (dVar) {
                if (!dVar.f24310o || dVar.B()) {
                    return -1L;
                }
                try {
                    dVar.j0();
                } catch (IOException unused) {
                    dVar.f24312q = true;
                }
                try {
                    if (dVar.J()) {
                        dVar.Y();
                        dVar.f24307l = 0;
                    }
                } catch (IOException unused2) {
                    dVar.f24313r = true;
                    dVar.f24305j = q.c(q.b());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.kt */
    static final class f extends u implements l<IOException, g0> {
        f() {
            super(1);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(IOException iOException) {
            invoke2(iOException);
            return g0.f27756a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(IOException it) {
            t.f(it, "it");
            d dVar = d.this;
            if (!ne.d.f22998h || Thread.holdsLock(dVar)) {
                d.this.f24308m = true;
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + dVar);
        }
    }

    public d(ve.a fileSystem, File directory, int i10, int i11, long j10, qe.e taskRunner) {
        t.f(fileSystem, "fileSystem");
        t.f(directory, "directory");
        t.f(taskRunner, "taskRunner");
        this.f24296a = fileSystem;
        this.f24297b = directory;
        this.f24298c = i10;
        this.f24299d = i11;
        this.f24300e = j10;
        this.f24306k = new LinkedHashMap<>(0, 0.75f, true);
        this.f24315t = taskRunner.i();
        this.f24316u = new e(t.n(ne.d.f22999i, " Cache"));
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (!(i11 > 0)) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.f24301f = new File(directory, f24292w);
        this.f24302g = new File(directory, f24293x);
        this.f24303h = new File(directory, f24294y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J() {
        int i10 = this.f24307l;
        return i10 >= 2000 && i10 >= this.f24306k.size();
    }

    private final af.f K() throws FileNotFoundException {
        return q.c(new pe.e(this.f24296a.appendingSink(this.f24301f), new f()));
    }

    private final void L() throws IOException {
        this.f24296a.delete(this.f24302g);
        Iterator<c> it = this.f24306k.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            t.e(next, "i.next()");
            c cVar = next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f24299d;
                while (i10 < i11) {
                    this.f24304i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f24299d;
                while (i10 < i12) {
                    this.f24296a.delete(cVar.a().get(i10));
                    this.f24296a.delete(cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void N() throws IOException {
        g gVarD = q.d(this.f24296a.source(this.f24301f));
        try {
            String utf8LineStrict = gVarD.readUtf8LineStrict();
            String utf8LineStrict2 = gVarD.readUtf8LineStrict();
            String utf8LineStrict3 = gVarD.readUtf8LineStrict();
            String utf8LineStrict4 = gVarD.readUtf8LineStrict();
            String utf8LineStrict5 = gVarD.readUtf8LineStrict();
            if (t.a(f24295z, utf8LineStrict) && t.a(A, utf8LineStrict2) && t.a(String.valueOf(this.f24298c), utf8LineStrict3) && t.a(String.valueOf(H()), utf8LineStrict4)) {
                int i10 = 0;
                if (!(utf8LineStrict5.length() > 0)) {
                    while (true) {
                        try {
                            U(gVarD.readUtf8LineStrict());
                            i10++;
                        } catch (EOFException unused) {
                            this.f24307l = i10 - G().size();
                            if (gVarD.exhausted()) {
                                this.f24305j = K();
                            } else {
                                Y();
                            }
                            g0 g0Var = g0.f27756a;
                            fd.b.a(gVarD, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + ']');
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(gVarD, th);
                throw th2;
            }
        }
    }

    private final void U(String str) throws IOException {
        String strSubstring;
        int iH0 = f0.h0(str, ' ', 0, false, 6, null);
        if (iH0 == -1) {
            throw new IOException(t.n("unexpected journal line: ", str));
        }
        int i10 = iH0 + 1;
        int iH1 = f0.h0(str, ' ', i10, false, 4, null);
        if (iH1 == -1) {
            strSubstring = str.substring(i10);
            t.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = F;
            if (iH0 == str2.length() && rd.c0.O(str, str2, false, 2, null)) {
                this.f24306k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iH1);
            t.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c cVar = this.f24306k.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f24306k.put(strSubstring, cVar);
        }
        if (iH1 != -1) {
            String str3 = D;
            if (iH0 == str3.length() && rd.c0.O(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iH1 + 1);
                t.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listJ0 = f0.J0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listJ0);
                return;
            }
        }
        if (iH1 == -1) {
            String str4 = E;
            if (iH0 == str4.length() && rd.c0.O(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iH1 == -1) {
            String str5 = G;
            if (iH0 == str5.length() && rd.c0.O(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException(t.n("unexpected journal line: ", str));
    }

    private final boolean i0() throws IOException {
        for (c toEvict : this.f24306k.values()) {
            if (!toEvict.i()) {
                t.e(toEvict, "toEvict");
                e0(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void k0(String str) {
        if (C.e(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    private final synchronized void p() {
        if (!(!this.f24311p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ b v(d dVar, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = B;
        }
        return dVar.u(str, j10);
    }

    public final boolean B() {
        return this.f24311p;
    }

    public final File C() {
        return this.f24297b;
    }

    public final ve.a F() {
        return this.f24296a;
    }

    public final LinkedHashMap<String, c> G() {
        return this.f24306k;
    }

    public final int H() {
        return this.f24299d;
    }

    public final synchronized void I() throws IOException {
        if (ne.d.f22998h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f24310o) {
            return;
        }
        if (this.f24296a.exists(this.f24303h)) {
            if (this.f24296a.exists(this.f24301f)) {
                this.f24296a.delete(this.f24303h);
            } else {
                this.f24296a.rename(this.f24303h, this.f24301f);
            }
        }
        this.f24309n = ne.d.F(this.f24296a, this.f24303h);
        if (this.f24296a.exists(this.f24301f)) {
            try {
                N();
                L();
                this.f24310o = true;
                return;
            } catch (IOException e10) {
                h.f27895a.g().k("DiskLruCache " + this.f24297b + " is corrupt: " + ((Object) e10.getMessage()) + ", removing", 5, e10);
                try {
                    t();
                    this.f24311p = false;
                    Y();
                    this.f24310o = true;
                } catch (Throwable th) {
                    this.f24311p = false;
                    throw th;
                }
            }
        }
        Y();
        this.f24310o = true;
    }

    public final synchronized void Y() throws IOException {
        af.f fVar = this.f24305j;
        if (fVar != null) {
            fVar.close();
        }
        af.f fVarC = q.c(this.f24296a.sink(this.f24302g));
        try {
            fVarC.writeUtf8(f24295z).writeByte(10);
            fVarC.writeUtf8(A).writeByte(10);
            fVarC.writeDecimalLong(this.f24298c).writeByte(10);
            fVarC.writeDecimalLong(H()).writeByte(10);
            fVarC.writeByte(10);
            for (c cVar : G().values()) {
                if (cVar.b() != null) {
                    fVarC.writeUtf8(E).writeByte(32);
                    fVarC.writeUtf8(cVar.d());
                    fVarC.writeByte(10);
                } else {
                    fVarC.writeUtf8(D).writeByte(32);
                    fVarC.writeUtf8(cVar.d());
                    cVar.s(fVarC);
                    fVarC.writeByte(10);
                }
            }
            g0 g0Var = g0.f27756a;
            fd.b.a(fVarC, null);
            if (this.f24296a.exists(this.f24301f)) {
                this.f24296a.rename(this.f24301f, this.f24303h);
            }
            this.f24296a.rename(this.f24302g, this.f24301f);
            this.f24296a.delete(this.f24303h);
            this.f24305j = K();
            this.f24308m = false;
            this.f24313r = false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(fVarC, th);
                throw th2;
            }
        }
    }

    public final synchronized boolean a0(String key) throws IOException {
        t.f(key, "key");
        I();
        p();
        k0(key);
        c cVar = this.f24306k.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zE0 = e0(cVar);
        if (zE0 && this.f24304i <= this.f24300e) {
            this.f24312q = false;
        }
        return zE0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b bVarB;
        if (this.f24310o && !this.f24311p) {
            Collection<c> collectionValues = this.f24306k.values();
            t.e(collectionValues, "lruEntries.values");
            int i10 = 0;
            Object[] array = collectionValues.toArray(new c[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c[] cVarArr = (c[]) array;
            int length = cVarArr.length;
            while (i10 < length) {
                c cVar = cVarArr[i10];
                i10++;
                if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                    bVarB.c();
                }
            }
            j0();
            af.f fVar = this.f24305j;
            t.c(fVar);
            fVar.close();
            this.f24305j = null;
            this.f24311p = true;
            return;
        }
        this.f24311p = true;
    }

    public final boolean e0(c entry) throws IOException {
        af.f fVar;
        t.f(entry, "entry");
        if (!this.f24309n) {
            if (entry.f() > 0 && (fVar = this.f24305j) != null) {
                fVar.writeUtf8(E);
                fVar.writeByte(32);
                fVar.writeUtf8(entry.d());
                fVar.writeByte(10);
                fVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i10 = this.f24299d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f24296a.delete(entry.a().get(i11));
            this.f24304i -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f24307l++;
        af.f fVar2 = this.f24305j;
        if (fVar2 != null) {
            fVar2.writeUtf8(F);
            fVar2.writeByte(32);
            fVar2.writeUtf8(entry.d());
            fVar2.writeByte(10);
        }
        this.f24306k.remove(entry.d());
        if (J()) {
            qe.d.j(this.f24315t, this.f24316u, 0L, 2, null);
        }
        return true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f24310o) {
            p();
            j0();
            af.f fVar = this.f24305j;
            t.c(fVar);
            fVar.flush();
        }
    }

    public final void j0() throws IOException {
        while (this.f24304i > this.f24300e) {
            if (!i0()) {
                return;
            }
        }
        this.f24312q = false;
    }

    public final synchronized void s(b editor, boolean z10) throws IOException {
        t.f(editor, "editor");
        c cVarD = editor.d();
        if (!t.a(cVarD.b(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i10 = 0;
        if (z10 && !cVarD.g()) {
            int i11 = this.f24299d;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                boolean[] zArrE = editor.e();
                t.c(zArrE);
                if (!zArrE[i12]) {
                    editor.a();
                    throw new IllegalStateException(t.n("Newly created entry didn't create value for index ", Integer.valueOf(i12)));
                }
                if (!this.f24296a.exists(cVarD.c().get(i12))) {
                    editor.a();
                    return;
                }
                i12 = i13;
            }
        }
        int i14 = this.f24299d;
        while (i10 < i14) {
            int i15 = i10 + 1;
            File file = cVarD.c().get(i10);
            if (!z10 || cVarD.i()) {
                this.f24296a.delete(file);
            } else if (this.f24296a.exists(file)) {
                File file2 = cVarD.a().get(i10);
                this.f24296a.rename(file, file2);
                long j10 = cVarD.e()[i10];
                long size = this.f24296a.size(file2);
                cVarD.e()[i10] = size;
                this.f24304i = (this.f24304i - j10) + size;
            }
            i10 = i15;
        }
        cVarD.l(null);
        if (cVarD.i()) {
            e0(cVarD);
            return;
        }
        this.f24307l++;
        af.f fVar = this.f24305j;
        t.c(fVar);
        if (cVarD.g() || z10) {
            cVarD.o(true);
            fVar.writeUtf8(D).writeByte(32);
            fVar.writeUtf8(cVarD.d());
            cVarD.s(fVar);
            fVar.writeByte(10);
            if (z10) {
                long j11 = this.f24314s;
                this.f24314s = 1 + j11;
                cVarD.p(j11);
            }
        } else {
            G().remove(cVarD.d());
            fVar.writeUtf8(F).writeByte(32);
            fVar.writeUtf8(cVarD.d());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.f24304i > this.f24300e || J()) {
            qe.d.j(this.f24315t, this.f24316u, 0L, 2, null);
        }
    }

    public final void t() throws IOException {
        close();
        this.f24296a.deleteContents(this.f24297b);
    }

    public final synchronized b u(String key, long j10) throws IOException {
        t.f(key, "key");
        I();
        p();
        k0(key);
        c cVar = this.f24306k.get(key);
        if (j10 != B && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar == null ? null : cVar.b()) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f24312q && !this.f24313r) {
            af.f fVar = this.f24305j;
            t.c(fVar);
            fVar.writeUtf8(E).writeByte(32).writeUtf8(key).writeByte(10);
            fVar.flush();
            if (this.f24308m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f24306k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        qe.d.j(this.f24315t, this.f24316u, 0L, 2, null);
        return null;
    }

    public final synchronized C0395d z(String key) throws IOException {
        t.f(key, "key");
        I();
        p();
        k0(key);
        c cVar = this.f24306k.get(key);
        if (cVar == null) {
            return null;
        }
        C0395d c0395dR = cVar.r();
        if (c0395dR == null) {
            return null;
        }
        this.f24307l++;
        af.f fVar = this.f24305j;
        t.c(fVar);
        fVar.writeUtf8(G).writeByte(32).writeUtf8(key).writeByte(10);
        if (J()) {
            qe.d.j(this.f24315t, this.f24316u, 0L, 2, null);
        }
        return c0395dR;
    }
}

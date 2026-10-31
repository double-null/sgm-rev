package v8;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f27352s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a f27353t = new a(new a.InterfaceC0456a() { // from class: v8.j
        @Override // v8.l.a.InterfaceC0456a
        public final Constructor a() {
            return l.m();
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final a f27354u = new a(new a.InterfaceC0456a() { // from class: v8.k
        @Override // v8.l.a.InterfaceC0456a
        public final Constructor a() {
            return l.n();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f27363j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.common.collect.u<u7.q> f27366m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f27371r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f27364k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27367n = 112800;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private s9.r.a f27369p = new s9.h();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f27368o = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0456a f27372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f27373b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Constructor<? extends p> f27374c;

        /* JADX INFO: renamed from: v8.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
        public interface InterfaceC0456a {
            Constructor<? extends p> a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public a(InterfaceC0456a interfaceC0456a) {
            this.f27372a = interfaceC0456a;
        }

        private Constructor<? extends p> b() {
            synchronized (this.f27373b) {
                if (this.f27373b.get()) {
                    return this.f27374c;
                }
                try {
                    return this.f27372a.a();
                } catch (ClassNotFoundException unused) {
                    this.f27373b.set(true);
                    return this.f27374c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public p a(Object... objArr) {
            Constructor<? extends p> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void j(int i10, List<p> list) {
        switch (i10) {
            case 0:
                list.add(new ca.b());
                break;
            case 1:
                list.add(new ca.e());
                break;
            case 2:
                list.add(new ca.h(((this.f27357d | (this.f27355b ? 1 : 0)) == true ? 1 : 0) | (this.f27356c ? 2 : 0)));
                break;
            case 3:
                list.add(new w8.b(this.f27358e | (this.f27355b ? 1 : 0) | (this.f27356c ? 2 : 0)));
                break;
            case 4:
                p pVarA = f27353t.a(Integer.valueOf(this.f27359f));
                if (pVarA == null) {
                    list.add(new a9.d(this.f27359f));
                } else {
                    list.add(pVarA);
                }
                break;
            case 5:
                list.add(new io.bidmachine.media3.extractor.flv.b());
                break;
            case 6:
                list.add(new n9.e(this.f27369p, (this.f27368o ? 0 : 2) | this.f27360g));
                break;
            case 7:
                list.add(new o9.f(this.f27363j | (this.f27355b ? 1 : 0) | (this.f27356c ? 2 : 0)));
                break;
            case 8:
                list.add(new p9.h(this.f27369p, this.f27362i | p9.h.j(this.f27370q) | (this.f27368o ? 0 : 32)));
                list.add(new p9.n(this.f27369p, this.f27361h | p9.n.r(this.f27370q) | (this.f27368o ? 0 : 16)));
                break;
            case 9:
                list.add(new q9.d());
                break;
            case 10:
                list.add(new ca.c0());
                break;
            case 11:
                if (this.f27366m == null) {
                    this.f27366m = com.google.common.collect.u.H();
                }
                list.add(new ca.k0(this.f27364k, !this.f27368o ? 1 : 0, this.f27369p, new x7.g0(0L), new ca.j(this.f27365l, this.f27366m), this.f27367n));
                break;
            case 12:
                list.add(new da.b());
                break;
            case 14:
                list.add(new d9.a(this.f27371r));
                break;
            case 15:
                p pVarA2 = f27354u.a(new Object[0]);
                if (pVarA2 != null) {
                    list.add(pVarA2);
                }
                break;
            case 16:
                list.add(new x8.b(1 ^ (this.f27368o ? 1 : 0), this.f27369p));
                break;
            case 17:
                list.add(new r9.a());
                break;
            case 18:
                list.add(new ea.a());
                break;
            case 19:
                list.add(new z8.a());
                break;
            case 20:
                int i11 = this.f27361h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new c9.a());
                    break;
                }
                break;
            case 21:
                list.add(new y8.a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p> m() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("io.bidmachine.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("io.bidmachine.media3.decoder.flac.FlacExtractor").asSubclass(p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p> n() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("io.bidmachine.media3.decoder.midi.MidiExtractor").asSubclass(p.class).getConstructor(new Class[0]);
    }

    @Override // v8.u
    public synchronized p[] f(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f27352s;
        arrayList = new ArrayList(iArr.length);
        int iB = u7.n.b(map);
        if (iB != -1) {
            j(iB, arrayList);
        }
        int iC = u7.n.c(uri);
        if (iC != -1 && iC != iB) {
            j(iC, arrayList);
        }
        for (int i10 : iArr) {
            if (i10 != iB && i10 != iC) {
                j(i10, arrayList);
            }
        }
        return (p[]) arrayList.toArray(new p[arrayList.size()]);
    }

    @Override // v8.u
    public synchronized p[] g() {
        return f(Uri.EMPTY, new HashMap());
    }

    @Override // v8.u
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized l b(int i10) {
        this.f27370q = i10;
        return this;
    }

    @Override // v8.u
    @Deprecated
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public synchronized l e(boolean z10) {
        this.f27368o = z10;
        return this;
    }

    public synchronized l o(int i10) {
        this.f27371r = i10;
        return this;
    }

    @Override // v8.u
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public synchronized l a(s9.r.a aVar) {
        this.f27369p = aVar;
        return this;
    }
}

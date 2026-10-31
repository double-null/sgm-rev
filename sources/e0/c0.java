package e0;

import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ud.g1;

/* JADX INFO: compiled from: MulticastFileObserver.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends FileObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13554c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f13555d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, c0> f13556e = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<id.l<String, wc.g0>> f13558b;

    /* JADX INFO: compiled from: MulticastFileObserver.android.kt */
    public static final class a {

        /* JADX INFO: renamed from: e0.c0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MulticastFileObserver.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
        static final class C0182a extends kotlin.coroutines.jvm.internal.l implements id.p<wd.s<? super wc.g0>, zc.f<? super wc.g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f13559h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            int f13560i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f13561j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ File f13562k;

            /* JADX INFO: renamed from: e0.c0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: MulticastFileObserver.android.kt */
            static final class C0183a extends kotlin.jvm.internal.u implements id.a<wc.g0> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ g1 f13563d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0183a(g1 g1Var) {
                    super(0);
                    this.f13563d = g1Var;
                }

                @Override // id.a
                public /* bridge */ /* synthetic */ wc.g0 invoke() {
                    invoke2();
                    return wc.g0.f27756a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.f13563d.e();
                }
            }

            /* JADX INFO: renamed from: e0.c0$a$a$b */
            /* JADX INFO: compiled from: MulticastFileObserver.android.kt */
            static final class b extends kotlin.jvm.internal.u implements id.l<String, wc.g0> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ File f13564d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ wd.s<wc.g0> f13565e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(File file, wd.s<? super wc.g0> sVar) {
                    super(1);
                    this.f13564d = file;
                    this.f13565e = sVar;
                }

                public final void b(String str) {
                    if (kotlin.jvm.internal.t.a(str, this.f13564d.getName())) {
                        wd.m.b(this.f13565e, wc.g0.f27756a);
                    }
                }

                @Override // id.l
                public /* bridge */ /* synthetic */ wc.g0 invoke(String str) {
                    b(str);
                    return wc.g0.f27756a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0182a(File file, zc.f<? super C0182a> fVar) {
                super(2, fVar);
                this.f13562k = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                C0182a c0182a = new C0182a(this.f13562k, fVar);
                c0182a.f13561j = obj;
                return c0182a;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(wd.s<? super wc.g0> sVar, zc.f<? super wc.g0> fVar) {
                return ((C0182a) create(sVar, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                g1 g1VarD;
                wd.s sVar;
                Object objF = ad.d.f();
                int i10 = this.f13560i;
                if (i10 != 0) {
                    if (i10 == 1) {
                        g1VarD = (g1) this.f13559h;
                        sVar = (wd.s) this.f13561j;
                        wc.s.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wc.s.b(obj);
                    }
                    return wc.g0.f27756a;
                }
                wc.s.b(obj);
                wd.s sVar2 = (wd.s) this.f13561j;
                b bVar = new b(this.f13562k, sVar2);
                a aVar = c0.f13554c;
                File parentFile = this.f13562k.getParentFile();
                kotlin.jvm.internal.t.c(parentFile);
                g1VarD = aVar.d(parentFile, bVar);
                wc.g0 g0Var = wc.g0.f27756a;
                this.f13561j = sVar2;
                this.f13559h = g1VarD;
                this.f13560i = 1;
                if (sVar2.j(g0Var, this) == objF) {
                    return objF;
                }
                sVar = sVar2;
                C0183a c0183a = new C0183a(g1VarD);
                this.f13561j = null;
                this.f13559h = null;
                this.f13560i = 2;
                if (wd.q.a(sVar, c0183a, this) == objF) {
                    return objF;
                }
                return wc.g0.f27756a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final g1 d(File file, final id.l<? super String, wc.g0> lVar) {
            final String key = file.getCanonicalFile().getPath();
            synchronized (c0.f13555d) {
                Map<String, c0> mapC = c0.f13554c.c();
                kotlin.jvm.internal.t.e(key, "key");
                c0 c0Var = mapC.get(key);
                if (c0Var == null) {
                    c0Var = new c0(key, null);
                    mapC.put(key, c0Var);
                }
                c0 c0Var2 = c0Var;
                c0Var2.f13558b.add(lVar);
                if (c0Var2.f13558b.size() == 1) {
                    c0Var2.startWatching();
                }
                wc.g0 g0Var = wc.g0.f27756a;
            }
            return new g1() { // from class: e0.b0
                @Override // ud.g1
                public final void e() {
                    c0.a.f(key, lVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(String str, id.l observer) {
            kotlin.jvm.internal.t.f(observer, "$observer");
            synchronized (c0.f13555d) {
                a aVar = c0.f13554c;
                c0 c0Var = aVar.c().get(str);
                if (c0Var != null) {
                    c0Var.f13558b.remove(observer);
                    if (c0Var.f13558b.isEmpty()) {
                        aVar.c().remove(str);
                        c0Var.stopWatching();
                    }
                }
                wc.g0 g0Var = wc.g0.f27756a;
            }
        }

        public final Map<String, c0> c() {
            return c0.f13556e;
        }

        public final xd.c<wc.g0> e(File file) {
            kotlin.jvm.internal.t.f(file, "file");
            return xd.e.e(new C0182a(file, null));
        }
    }

    public /* synthetic */ c0(String str, kotlin.jvm.internal.k kVar) {
        this(str);
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        Iterator<T> it = this.f13558b.iterator();
        while (it.hasNext()) {
            ((id.l) it.next()).invoke(str);
        }
    }

    private c0(String str) {
        super(str, 128);
        this.f13557a = str;
        this.f13558b = new CopyOnWriteArrayList<>();
    }
}

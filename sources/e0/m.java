package e0;

import androidx.datastore.core.CorruptionException;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import ud.b2;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m<T> implements e0.k<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f13626m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0<T> f13627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0.g<T> f13628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ud.o0 f13629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xd.c<T> f13630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final de.a f13631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b2 f13633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0.n<T> f13634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m<T>.b f13635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wc.k<m0<T>> f13636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wc.k f13637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i0<e0.y.a<T>> f13638l;

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    private final class b extends f0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<? extends id.p<? super e0.u<T>, ? super zc.f<? super wc.g0>, ? extends Object>> f13639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f13640d;

        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f13641h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f13642i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ m<T>.b f13643j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f13644k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m<T>.b bVar, zc.f<? super a> fVar) {
                super(fVar);
                this.f13643j = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13642i = obj;
                this.f13644k |= Integer.MIN_VALUE;
                return this.f13643j.b(this);
            }
        }

        /* JADX INFO: renamed from: e0.m$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 546, 468}, m = "invokeSuspend")
        static final class C0186b extends kotlin.coroutines.jvm.internal.l implements id.l<zc.f<? super e0.h<T>>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f13645h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            Object f13646i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f13647j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f13648k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f13649l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f13650m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f13651n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ m<T> f13652o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ m<T>.b f13653p;

            /* JADX INFO: renamed from: e0.m$b$b$a */
            /* JADX INFO: compiled from: DataStoreImpl.kt */
            public static final class a implements e0.u<T> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ de.a f13654a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.e0 f13655b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.h0<T> f13656c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ m<T> f13657d;

                /* JADX INFO: renamed from: e0.m$b$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: DataStoreImpl.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                static final class C0187a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f13658h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    Object f13659i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f13660j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f13661k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    Object f13662l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    /* synthetic */ Object f13663m;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f13665o;

                    C0187a(zc.f fVar) {
                        super(fVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f13663m = obj;
                        this.f13665o |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(de.a aVar, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.h0<T> h0Var, m<T> mVar) {
                    this.f13654a = aVar;
                    this.f13655b = e0Var;
                    this.f13656c = h0Var;
                    this.f13657d = mVar;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:35:0x00b0, B:37:0x00b8), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
                /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // e0.u
                public Object a(id.p<? super T, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) throws Throwable {
                    C0187a c0187a;
                    de.a aVar;
                    kotlin.jvm.internal.e0 e0Var;
                    kotlin.jvm.internal.h0<T> h0Var;
                    m mVar;
                    de.a aVar2;
                    de.a aVar3;
                    m mVar2;
                    T t10;
                    kotlin.jvm.internal.h0<T> h0Var2;
                    if (fVar instanceof C0187a) {
                        c0187a = (C0187a) fVar;
                        int i10 = c0187a.f13665o;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0187a.f13665o = i10 - Integer.MIN_VALUE;
                        } else {
                            c0187a = new C0187a(fVar);
                        }
                    } else {
                        c0187a = new C0187a(fVar);
                    }
                    Object obj = c0187a.f13663m;
                    Object objF = ad.d.f();
                    int i11 = c0187a.f13665o;
                    try {
                        if (i11 == 0) {
                            wc.s.b(obj);
                            aVar = this.f13654a;
                            e0Var = this.f13655b;
                            h0Var = this.f13656c;
                            mVar = this.f13657d;
                            c0187a.f13658h = pVar;
                            c0187a.f13659i = aVar;
                            c0187a.f13660j = e0Var;
                            c0187a.f13661k = h0Var;
                            c0187a.f13662l = mVar;
                            c0187a.f13665o = 1;
                            if (aVar.d(null, c0187a) == objF) {
                                return objF;
                            }
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    t10 = (T) c0187a.f13660j;
                                    h0Var2 = (kotlin.jvm.internal.h0) c0187a.f13659i;
                                    aVar2 = (de.a) c0187a.f13658h;
                                    try {
                                        wc.s.b(obj);
                                        h0Var2.f21514a = t10;
                                        h0Var = h0Var2;
                                        T t11 = h0Var.f21514a;
                                        aVar2.c(null);
                                        return t11;
                                    } catch (Throwable th) {
                                        th = th;
                                        aVar2.c(null);
                                        throw th;
                                    }
                                }
                                m mVar3 = (m) c0187a.f13660j;
                                h0Var = (kotlin.jvm.internal.h0) c0187a.f13659i;
                                aVar3 = (de.a) c0187a.f13658h;
                                try {
                                    wc.s.b(obj);
                                    mVar2 = mVar3;
                                    if (kotlin.jvm.internal.t.a(obj, h0Var.f21514a)) {
                                        aVar2 = aVar3;
                                    } else {
                                        c0187a.f13658h = aVar3;
                                        c0187a.f13659i = h0Var;
                                        c0187a.f13660j = obj;
                                        c0187a.f13665o = 3;
                                        if (mVar2.B(obj, false, c0187a) == objF) {
                                            return objF;
                                        }
                                        t10 = (T) obj;
                                        h0Var2 = h0Var;
                                        aVar2 = aVar3;
                                        h0Var2.f21514a = t10;
                                        h0Var = h0Var2;
                                    }
                                    T t12 = h0Var.f21514a;
                                    aVar2.c(null);
                                    return t12;
                                } catch (Throwable th2) {
                                    th = th2;
                                    aVar2 = aVar3;
                                    aVar2.c(null);
                                    throw th;
                                }
                            }
                            m mVar4 = (m) c0187a.f13662l;
                            h0Var = (kotlin.jvm.internal.h0) c0187a.f13661k;
                            e0Var = (kotlin.jvm.internal.e0) c0187a.f13660j;
                            de.a aVar4 = (de.a) c0187a.f13659i;
                            id.p<? super T, ? super zc.f<? super T>, ? extends Object> pVar2 = (id.p) c0187a.f13658h;
                            wc.s.b(obj);
                            aVar = aVar4;
                            mVar = mVar4;
                            pVar = pVar2;
                        }
                        if (!(true ^ e0Var.f21509a)) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.".toString());
                        }
                        T t13 = h0Var.f21514a;
                        c0187a.f13658h = aVar;
                        c0187a.f13659i = h0Var;
                        c0187a.f13660j = mVar;
                        c0187a.f13661k = null;
                        c0187a.f13662l = null;
                        c0187a.f13665o = 2;
                        Object objInvoke = pVar.invoke(t13, c0187a);
                        if (objInvoke == objF) {
                            return objF;
                        }
                        aVar3 = aVar;
                        obj = objInvoke;
                        mVar2 = mVar;
                        if (kotlin.jvm.internal.t.a(obj, h0Var.f21514a)) {
                            c0187a.f13658h = aVar3;
                            c0187a.f13659i = h0Var;
                            c0187a.f13660j = obj;
                            c0187a.f13665o = 3;
                            if (mVar2.B(obj, false, c0187a) == objF) {
                                return objF;
                            }
                            t10 = (T) obj;
                            h0Var2 = h0Var;
                            aVar2 = aVar3;
                            h0Var2.f21514a = t10;
                            h0Var = h0Var2;
                        } else {
                            aVar2 = aVar3;
                        }
                        T t14 = h0Var.f21514a;
                        aVar2.c(null);
                        return t14;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar;
                        aVar2.c(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0186b(m<T> mVar, m<T>.b bVar, zc.f<? super C0186b> fVar) {
                super(1, fVar);
                this.f13652o = mVar;
                this.f13653p = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(zc.f<?> fVar) {
                return new C0186b(this.f13652o, this.f13653p, fVar);
            }

            @Override // id.l
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(zc.f<? super e0.h<T>> fVar) {
                return ((C0186b) create(fVar)).invokeSuspend(wc.g0.f27756a);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e7 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
            /* JADX WARN: Code duplicated, block: B:39:0x010e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:40:0x010f  */
            /* JADX WARN: Code duplicated, block: B:49:0x00c8 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:22:0x00aa->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                de.a aVarB;
                kotlin.jvm.internal.e0 e0Var;
                kotlin.jvm.internal.h0 h0Var;
                kotlin.jvm.internal.h0 h0Var2;
                C0186b c0186b;
                kotlin.jvm.internal.e0 e0Var2;
                de.a aVar;
                Iterator<T> it;
                de.a aVar2;
                kotlin.jvm.internal.e0 e0Var3;
                kotlin.jvm.internal.h0 h0Var3;
                a aVar3;
                kotlin.jvm.internal.h0 h0Var4;
                id.p pVar;
                Object obj2;
                int iHashCode;
                int i10;
                Object objF = ad.d.f();
                int i11 = this.f13651n;
                if (i11 != 0) {
                    if (i11 == 1) {
                        h0Var = (kotlin.jvm.internal.h0) this.f13648k;
                        h0Var2 = (kotlin.jvm.internal.h0) this.f13647j;
                        e0Var = (kotlin.jvm.internal.e0) this.f13646i;
                        aVarB = (de.a) this.f13645h;
                        wc.s.b(obj);
                    } else if (i11 == 2) {
                        it = (Iterator) this.f13649l;
                        aVar3 = (a) this.f13648k;
                        h0Var3 = (kotlin.jvm.internal.h0) this.f13647j;
                        e0Var3 = (kotlin.jvm.internal.e0) this.f13646i;
                        aVar2 = (de.a) this.f13645h;
                        wc.s.b(obj);
                        c0186b = this;
                        while (it.hasNext()) {
                            pVar = (id.p) it.next();
                            c0186b.f13645h = aVar2;
                            c0186b.f13646i = e0Var3;
                            c0186b.f13647j = h0Var3;
                            c0186b.f13648k = aVar3;
                            c0186b.f13649l = it;
                            c0186b.f13651n = 2;
                            if (pVar.invoke(aVar3, c0186b) == objF) {
                                return objF;
                            }
                        }
                        h0Var2 = h0Var3;
                        e0Var2 = e0Var3;
                        aVar = aVar2;
                        ((b) c0186b.f13653p).f13639c = null;
                        c0186b.f13645h = e0Var2;
                        c0186b.f13646i = h0Var2;
                        c0186b.f13647j = aVar;
                        c0186b.f13648k = null;
                        c0186b.f13649l = null;
                        c0186b.f13651n = 3;
                        if (aVar.d(null, c0186b) == objF) {
                            return objF;
                        }
                        h0Var4 = h0Var2;
                        e0Var2.f21509a = true;
                        wc.g0 g0Var = wc.g0.f27756a;
                        aVar.c(null);
                        obj2 = h0Var4.f21514a;
                        if (obj2 != null) {
                        }
                        e0.v vVarR = c0186b.f13652o.r();
                        c0186b.f13645h = obj2;
                        c0186b.f13646i = null;
                        c0186b.f13647j = null;
                        c0186b.f13650m = iHashCode;
                        c0186b.f13651n = 4;
                        obj = vVarR.a(c0186b);
                        if (obj == objF) {
                            return objF;
                        }
                        i10 = iHashCode;
                    } else if (i11 == 3) {
                        aVar = (de.a) this.f13647j;
                        h0Var4 = (kotlin.jvm.internal.h0) this.f13646i;
                        e0Var2 = (kotlin.jvm.internal.e0) this.f13645h;
                        wc.s.b(obj);
                        c0186b = this;
                        try {
                            e0Var2.f21509a = true;
                            wc.g0 g0Var2 = wc.g0.f27756a;
                            aVar.c(null);
                            obj2 = h0Var4.f21514a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            e0.v vVarR2 = c0186b.f13652o.r();
                            c0186b.f13645h = obj2;
                            c0186b.f13646i = null;
                            c0186b.f13647j = null;
                            c0186b.f13650m = iHashCode;
                            c0186b.f13651n = 4;
                            obj = vVarR2.a(c0186b);
                            if (obj == objF) {
                                return objF;
                            }
                            i10 = iHashCode;
                        } catch (Throwable th) {
                            aVar.c(null);
                            throw th;
                        }
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = this.f13650m;
                        obj2 = this.f13645h;
                        wc.s.b(obj);
                    }
                    return new e0.h(obj2, i10, ((Number) obj).intValue());
                }
                wc.s.b(obj);
                aVarB = de.g.b(false, 1, null);
                e0Var = new kotlin.jvm.internal.e0();
                h0Var = new kotlin.jvm.internal.h0();
                m<T> mVar = this.f13652o;
                this.f13645h = aVarB;
                this.f13646i = e0Var;
                this.f13647j = h0Var;
                this.f13648k = h0Var;
                this.f13651n = 1;
                obj = mVar.y(true, this);
                if (obj == objF) {
                    return objF;
                }
                h0Var2 = h0Var;
                h0Var.f21514a = (T) ((e0.h) obj).c();
                a aVar4 = new a(aVarB, e0Var, h0Var2, this.f13652o);
                List list = ((b) this.f13653p).f13639c;
                if (list != null) {
                    it = list.iterator();
                    aVar2 = aVarB;
                    e0Var3 = e0Var;
                    h0Var3 = h0Var2;
                    aVar3 = aVar4;
                    c0186b = this;
                    while (it.hasNext()) {
                        pVar = (id.p) it.next();
                        c0186b.f13645h = aVar2;
                        c0186b.f13646i = e0Var3;
                        c0186b.f13647j = h0Var3;
                        c0186b.f13648k = aVar3;
                        c0186b.f13649l = it;
                        c0186b.f13651n = 2;
                        if (pVar.invoke(aVar3, c0186b) == objF) {
                            return objF;
                        }
                    }
                    h0Var2 = h0Var3;
                    e0Var2 = e0Var3;
                    aVar = aVar2;
                } else {
                    c0186b = this;
                    e0Var2 = e0Var;
                    aVar = aVarB;
                }
                ((b) c0186b.f13653p).f13639c = null;
                c0186b.f13645h = e0Var2;
                c0186b.f13646i = h0Var2;
                c0186b.f13647j = aVar;
                c0186b.f13648k = null;
                c0186b.f13649l = null;
                c0186b.f13651n = 3;
                if (aVar.d(null, c0186b) == objF) {
                    return objF;
                }
                h0Var4 = h0Var2;
                e0Var2.f21509a = true;
                wc.g0 g0Var3 = wc.g0.f27756a;
                aVar.c(null);
                obj2 = h0Var4.f21514a;
                if (obj2 != null) {
                }
                e0.v vVarR3 = c0186b.f13652o.r();
                c0186b.f13645h = obj2;
                c0186b.f13646i = null;
                c0186b.f13647j = null;
                c0186b.f13650m = iHashCode;
                c0186b.f13651n = 4;
                obj = vVarR3.a(c0186b);
                if (obj == objF) {
                    return objF;
                }
                i10 = iHashCode;
                return new e0.h(obj2, i10, ((Number) obj).intValue());
            }
        }

        public b(m mVar, List<? extends id.p<? super e0.u<T>, ? super zc.f<? super wc.g0>, ? extends Object>> initTasksList) {
            kotlin.jvm.internal.t.f(initTasksList, "initTasksList");
            this.f13640d = mVar;
            this.f13639c = kotlin.collections.b0.p0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // e0.f0
        protected Object b(zc.f<? super wc.g0> fVar) throws Throwable {
            a aVar;
            b bVar;
            e0.h hVar;
            if (fVar instanceof a) {
                aVar = (a) fVar;
                int i10 = aVar.f13644k;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f13644k = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, fVar);
                }
            } else {
                aVar = new a(this, fVar);
            }
            Object objY = aVar.f13642i;
            Object objF = ad.d.f();
            int i11 = aVar.f13644k;
            if (i11 == 0) {
                wc.s.b(objY);
                List<? extends id.p<? super e0.u<T>, ? super zc.f<? super wc.g0>, ? extends Object>> list = this.f13639c;
                if (list != null) {
                    kotlin.jvm.internal.t.c(list);
                    if (!list.isEmpty()) {
                        e0.v vVarR = this.f13640d.r();
                        C0186b c0186b = new C0186b(this.f13640d, this, null);
                        aVar.f13641h = this;
                        aVar.f13644k = 2;
                        objY = vVarR.d(c0186b, aVar);
                        if (objY == objF) {
                            return objF;
                        }
                        bVar = this;
                        hVar = (e0.h) objY;
                    }
                }
                m<T> mVar = this.f13640d;
                aVar.f13641h = this;
                aVar.f13644k = 1;
                objY = mVar.y(false, aVar);
                if (objY == objF) {
                    return objF;
                }
                bVar = this;
                hVar = (e0.h) objY;
            } else if (i11 == 1) {
                bVar = (b) aVar.f13641h;
                wc.s.b(objY);
                hVar = (e0.h) objY;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f13641h;
                wc.s.b(objY);
                hVar = (e0.h) objY;
            }
            ((m) bVar.f13640d).f13634h.c(hVar);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    static final class c extends kotlin.jvm.internal.u implements id.a<e0.v> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f13666d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m<T> mVar) {
            super(0);
            this.f13666d = mVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0.v invoke() {
            return this.f13666d.s().d();
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements id.p<xd.d<? super T>, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13667h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13668i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f13669j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m<T> f13670k;

        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<xd.d<? super k0<T>>, zc.f<? super wc.g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f13671h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ m<T> f13672i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m<T> mVar, zc.f<? super a> fVar) {
                super(2, fVar);
                this.f13672i = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                return new a(this.f13672i, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xd.d<? super k0<T>> dVar, zc.f<? super wc.g0> fVar) {
                return ((a) create(dVar, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f13671h;
                if (i10 == 0) {
                    wc.s.b(obj);
                    m<T> mVar = this.f13672i;
                    this.f13671h = 1;
                    if (mVar.u(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return wc.g0.f27756a;
            }
        }

        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.l implements id.p<k0<T>, zc.f<? super Boolean>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f13673h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f13674i;

            b(zc.f<? super b> fVar) {
                super(2, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                b bVar = new b(fVar);
                bVar.f13674i = obj;
                return bVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k0<T> k0Var, zc.f<? super Boolean> fVar) {
                return ((b) create(k0Var, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f13673h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((k0) this.f13674i) instanceof e0.t));
            }
        }

        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.l implements id.p<k0<T>, zc.f<? super Boolean>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f13675h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            /* synthetic */ Object f13676i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k0<T> f13677j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(k0<T> k0Var, zc.f<? super c> fVar) {
                super(2, fVar);
                this.f13677j = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                c cVar = new c(this.f13677j, fVar);
                cVar.f13676i = obj;
                return cVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k0<T> k0Var, zc.f<? super Boolean> fVar) {
                return ((c) create(k0Var, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f13675h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                k0 k0Var = (k0) this.f13676i;
                return kotlin.coroutines.jvm.internal.b.a((k0Var instanceof e0.h) && k0Var.a() <= this.f13677j.a());
            }
        }

        /* JADX INFO: renamed from: e0.m$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        static final class C0188d extends kotlin.coroutines.jvm.internal.l implements id.q<xd.d<? super T>, Throwable, zc.f<? super wc.g0>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f13678h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ m<T> f13679i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0188d(m<T> mVar, zc.f<? super C0188d> fVar) {
                super(3, fVar);
                this.f13679i = mVar;
            }

            @Override // id.q
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xd.d<? super T> dVar, Throwable th, zc.f<? super wc.g0> fVar) {
                return new C0188d(this.f13679i, fVar).invokeSuspend(wc.g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = ad.d.f();
                int i10 = this.f13678h;
                if (i10 == 0) {
                    wc.s.b(obj);
                    m<T> mVar = this.f13679i;
                    this.f13678h = 1;
                    if (mVar.p(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return wc.g0.f27756a;
            }
        }

        /* JADX INFO: compiled from: SafeCollector.common.kt */
        public static final class e implements xd.c<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ xd.c f13680a;

            /* JADX INFO: compiled from: Emitters.kt */
            public static final class a<T> implements xd.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ xd.d f13681a;

                /* JADX INFO: renamed from: e0.m$d$e$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class C0189a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    /* synthetic */ Object f13682h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    int f13683i;

                    public C0189a(zc.f fVar) {
                        super(fVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f13682h = obj;
                        this.f13683i |= Integer.MIN_VALUE;
                        return a.this.b(null, this);
                    }
                }

                public a(xd.d dVar) {
                    this.f13681a = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xd.d
                public final Object b(Object obj, zc.f fVar) throws Throwable {
                    C0189a c0189a;
                    if (fVar instanceof C0189a) {
                        c0189a = (C0189a) fVar;
                        int i10 = c0189a.f13683i;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0189a.f13683i = i10 - Integer.MIN_VALUE;
                        } else {
                            c0189a = new C0189a(fVar);
                        }
                    } else {
                        c0189a = new C0189a(fVar);
                    }
                    Object obj2 = c0189a.f13682h;
                    Object objF = ad.d.f();
                    int i11 = c0189a.f13683i;
                    if (i11 == 0) {
                        wc.s.b(obj2);
                        xd.d dVar = this.f13681a;
                        k0 k0Var = (k0) obj;
                        if (k0Var instanceof d0) {
                            throw ((d0) k0Var).b();
                        }
                        if (!(k0Var instanceof e0.h)) {
                            if (k0Var instanceof e0.t ? true : k0Var instanceof o0) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object objC = ((e0.h) k0Var).c();
                        c0189a.f13683i = 1;
                        if (dVar.b(objC, c0189a) == objF) {
                            return objF;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wc.s.b(obj2);
                    }
                    return wc.g0.f27756a;
                }
            }

            public e(xd.c cVar) {
                this.f13680a = cVar;
            }

            @Override // xd.c
            public Object a(xd.d dVar, zc.f fVar) {
                Object objA = this.f13680a.a(new a(dVar), fVar);
                return objA == ad.d.f() ? objA : wc.g0.f27756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m<T> mVar, zc.f<? super d> fVar) {
            super(2, fVar);
            this.f13670k = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            d dVar = new d(this.f13670k, fVar);
            dVar.f13669j = obj;
            return dVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(xd.d<? super T> dVar, zc.f<? super wc.g0> fVar) {
            return ((d) create(dVar, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00bc A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, xd.d] */
        /* JADX WARN: Type inference failed for: r1v6, types: [xd.d] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ?? r10;
            k0 k0Var;
            ?? r11;
            k0 k0Var2;
            ?? r12;
            xd.c cVarN;
            Object objF = ad.d.f();
            int i10 = this.f13668i;
            if (i10 != 0) {
                if (i10 == 1) {
                    xd.d dVar = (xd.d) this.f13669j;
                    wc.s.b(obj);
                    r10 = dVar;
                } else if (i10 == 2) {
                    k0Var2 = (k0) this.f13667h;
                    xd.d dVar2 = (xd.d) this.f13669j;
                    wc.s.b(obj);
                    r11 = dVar2;
                    k0Var = k0Var2;
                    r12 = r11;
                    r12 = r10;
                    cVarN = xd.e.n(new e(xd.e.g(xd.e.p(xd.e.o(((m) this.f13670k).f13634h.b(), new a(this.f13670k, null)), new b(null)), new c(k0Var, null))), new C0188d(this.f13670k, null));
                    this.f13669j = null;
                    this.f13667h = null;
                    this.f13668i = 3;
                    if (xd.e.i(r12, cVarN, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return wc.g0.f27756a;
            }
            wc.s.b(obj);
            xd.d dVar3 = (xd.d) this.f13669j;
            m<T> mVar = this.f13670k;
            this.f13669j = dVar3;
            this.f13668i = 1;
            Object objZ = mVar.z(false, this);
            if (objZ == objF) {
                return objF;
            }
            r10 = dVar3;
            obj = objZ;
            k0Var = (k0) obj;
            if (k0Var instanceof e0.h) {
                Object objC = ((e0.h) k0Var).c();
                this.f13669j = r10;
                this.f13667h = k0Var;
                this.f13668i = 2;
                if (r10.b(objC, this) == objF) {
                    return objF;
                }
                r11 = r10;
                k0Var2 = k0Var;
                k0Var = k0Var2;
                r12 = r11;
            } else {
                if (k0Var instanceof o0) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                }
                if (k0Var instanceof d0) {
                    throw ((d0) k0Var).b();
                }
                if (k0Var instanceof e0.t) {
                    r12 = r10;
                    return wc.g0.f27756a;
                }
            }
            r12 = r10;
            cVarN = xd.e.n(new e(xd.e.g(xd.e.p(xd.e.o(((m) this.f13670k).f13634h.b(), new a(this.f13670k, null)), new b(null)), new c(k0Var, null))), new C0188d(this.f13670k, null));
            this.f13669j = null;
            this.f13667h = null;
            this.f13668i = 3;
            if (xd.e.i(r12, cVarN, this) == objF) {
                return objF;
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13685h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13686i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13687j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m<T> f13688k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13689l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m<T> mVar, zc.f<? super e> fVar) {
            super(fVar);
            this.f13688k = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13687j = obj;
            this.f13689l |= Integer.MIN_VALUE;
            return this.f13688k.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    static final class f<R> extends kotlin.coroutines.jvm.internal.l implements id.l<zc.f<? super R>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13690h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ id.l<zc.f<? super R>, Object> f13691i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(id.l<? super zc.f<? super R>, ? extends Object> lVar, zc.f<? super f> fVar) {
            super(1, fVar);
            this.f13691i = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(zc.f<?> fVar) {
            return new f(this.f13691i, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f<? super R> fVar) {
            return ((f) create(fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f13690h;
            if (i10 == 0) {
                wc.s.b(obj);
                id.l<zc.f<? super R>, Object> lVar = this.f13691i;
                this.f13690h = 1;
                obj = lVar.invoke(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13692h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13693i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f13694j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f13695k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ m<T> f13696l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13697m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m<T> mVar, zc.f<? super g> fVar) {
            super(fVar);
            this.f13696l = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13695k = obj;
            this.f13697m |= Integer.MIN_VALUE;
            return this.f13696l.t(null, this);
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13698h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13699i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13700j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m<T> f13701k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13702l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m<T> mVar, zc.f<? super h> fVar) {
            super(fVar);
            this.f13701k = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13700j = obj;
            this.f13702l |= Integer.MIN_VALUE;
            return this.f13701k.u(this);
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13703h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ m<T> f13704i;

        /* JADX INFO: compiled from: DataStoreImpl.kt */
        static final class a<T> implements xd.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m<T> f13705a;

            a(m<T> mVar) {
                this.f13705a = mVar;
            }

            @Override // xd.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(wc.g0 g0Var, zc.f<? super wc.g0> fVar) throws Throwable {
                if (((m) this.f13705a).f13634h.a() instanceof e0.t) {
                    return wc.g0.f27756a;
                }
                Object objW = this.f13705a.w(true, fVar);
                return objW == ad.d.f() ? objW : wc.g0.f27756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(m<T> mVar, zc.f<? super i> fVar) {
            super(2, fVar);
            this.f13704i = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return new i(this.f13704i, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super wc.g0> fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f13703h;
            if (i10 != 0) {
                if (i10 == 1) {
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
            b bVar = ((m) this.f13704i).f13635i;
            this.f13703h = 1;
            if (bVar.a(this) == objF) {
                return objF;
            }
            xd.c cVarF = xd.e.f(this.f13704i.r().c());
            a aVar = new a(this.f13704i);
            this.f13703h = 2;
            if (cVarF.a(aVar, this) == objF) {
                return objF;
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13706h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13707i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13708j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m<T> f13709k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13710l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(m<T> mVar, zc.f<? super j> fVar) {
            super(fVar);
            this.f13709k = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13708j = obj;
            this.f13710l |= Integer.MIN_VALUE;
            return this.f13709k.v(this);
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "readDataAndUpdateCache")
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13711h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13712i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13713j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f13714k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ m<T> f13715l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13716m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(m<T> mVar, zc.f<? super k> fVar) {
            super(fVar);
            this.f13715l = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13714k = obj;
            this.f13716m |= Integer.MIN_VALUE;
            return this.f13715l.w(false, this);
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements id.l<zc.f<? super wc.q<? extends k0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13717h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13718i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m<T> f13719j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(m<T> mVar, zc.f<? super l> fVar) {
            super(1, fVar);
            this.f13719j = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(zc.f<?> fVar) {
            return new l(this.f13719j, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f<? super wc.q<? extends k0<T>, Boolean>> fVar) {
            return ((l) create(fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            k0 d0Var;
            Object objF = ad.d.f();
            int i10 = this.f13718i;
            try {
                if (i10 == 0) {
                    wc.s.b(obj);
                    m<T> mVar = this.f13719j;
                    this.f13718i = 1;
                    obj = mVar.y(true, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.f13717h;
                        wc.s.b(obj);
                        d0Var = new d0(th, ((Number) obj).intValue());
                        return wc.w.a(d0Var, kotlin.coroutines.jvm.internal.b.a(true));
                    }
                    wc.s.b(obj);
                }
                d0Var = (k0) obj;
            } catch (Throwable th2) {
                e0.v vVarR = this.f13719j.r();
                this.f13717h = th2;
                this.f13718i = 2;
                Object objA = vVarR.a(this);
                if (objA == objF) {
                    return objF;
                }
                th = th2;
                obj = objA;
            }
            return wc.w.a(d0Var, kotlin.coroutines.jvm.internal.b.a(true));
        }
    }

    /* JADX INFO: renamed from: e0.m$m, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend")
    static final class C0190m extends kotlin.coroutines.jvm.internal.l implements id.p<Boolean, zc.f<? super wc.q<? extends k0<T>, ? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13720h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13721i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ boolean f13722j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m<T> f13723k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13724l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0190m(m<T> mVar, int i10, zc.f<? super C0190m> fVar) {
            super(2, fVar);
            this.f13723k = mVar;
            this.f13724l = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            C0190m c0190m = new C0190m(this.f13723k, this.f13724l, fVar);
            c0190m.f13722j = ((Boolean) obj).booleanValue();
            return c0190m;
        }

        public final Object f(boolean z10, zc.f<? super wc.q<? extends k0<T>, Boolean>> fVar) {
            return ((C0190m) create(Boolean.valueOf(z10), fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return f(bool.booleanValue(), (zc.f) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            int iIntValue;
            ?? r10;
            ?? r11;
            k0 k0Var;
            ?? r12;
            Object objF = ad.d.f();
            ?? r13 = this.f13721i;
            try {
                if (r13 == 0) {
                    wc.s.b(obj);
                    boolean z10 = this.f13722j;
                    m<T> mVar = this.f13723k;
                    boolean z11 = z10;
                    this.f13722j = z10;
                    this.f13721i = 1;
                    obj = mVar.y(z11, this);
                    r13 = z10;
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (r13 != 1) {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z12 = this.f13722j;
                        th = (Throwable) this.f13720h;
                        wc.s.b(obj);
                        r11 = z12;
                        iIntValue = ((Number) obj).intValue();
                        r10 = r11;
                        d0 d0Var = new d0(th, iIntValue);
                        r12 = r10;
                        k0Var = d0Var;
                        return wc.w.a(k0Var, kotlin.coroutines.jvm.internal.b.a(r12));
                    }
                    boolean z13 = this.f13722j;
                    wc.s.b(obj);
                    r13 = z13;
                }
                k0Var = (k0) obj;
                r12 = r13;
            } catch (Throwable th2) {
                if (r13 != 0) {
                    e0.v vVarR = this.f13723k.r();
                    this.f13720h = th2;
                    this.f13722j = r13;
                    this.f13721i = 2;
                    Object objA = vVarR.a(this);
                    if (objA == objF) {
                        return objF;
                    }
                    r11 = r13;
                    th = th2;
                    obj = objA;
                } else {
                    ?? r14 = r13;
                    th = th2;
                    iIntValue = this.f13724l;
                    r10 = r14 == true ? 1 : 0;
                }
                d0 d0Var2 = new d0(th, iIntValue);
                r12 = r10;
                k0Var = d0Var2;
                return wc.w.a(k0Var, kotlin.coroutines.jvm.internal.b.a(r12));
            }
            return wc.w.a(k0Var, kotlin.coroutines.jvm.internal.b.a(r12));
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13726i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f13727j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f13728k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f13729l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13730m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f13731n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ m<T> f13732o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f13733p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(m<T> mVar, zc.f<? super n> fVar) {
            super(fVar);
            this.f13732o = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13731n = obj;
            this.f13733p |= Integer.MIN_VALUE;
            return this.f13732o.y(false, this);
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements id.p<Boolean, zc.f<? super e0.h<T>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ boolean f13736j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m<T> f13737k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13738l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(m<T> mVar, int i10, zc.f<? super o> fVar) {
            super(2, fVar);
            this.f13737k = mVar;
            this.f13738l = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            o oVar = new o(this.f13737k, this.f13738l, fVar);
            oVar.f13736j = ((Boolean) obj).booleanValue();
            return oVar;
        }

        public final Object f(boolean z10, zc.f<? super e0.h<T>> fVar) {
            return ((o) create(Boolean.valueOf(z10), fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return f(bool.booleanValue(), (zc.f) obj);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objF = ad.d.f();
            int i10 = this.f13735i;
            if (i10 != 0) {
                if (i10 == 1) {
                    z10 = this.f13736j;
                    wc.s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f13734h;
                    wc.s.b(obj);
                }
                iIntValue = ((Number) obj).intValue();
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new e0.h(obj2, iHashCode, iIntValue);
            }
            wc.s.b(obj);
            z10 = this.f13736j;
            m<T> mVar = this.f13737k;
            this.f13736j = z10;
            this.f13735i = 1;
            obj = mVar.x(this);
            if (obj == objF) {
                return objF;
            }
            if (z10) {
                e0.v vVarR = this.f13737k.r();
                this.f13734h = obj;
                this.f13735i = 2;
                Object objA = vVarR.a(this);
                if (objA == objF) {
                    return objF;
                }
                obj2 = obj;
                obj = objA;
                iIntValue = ((Number) obj).intValue();
            } else {
                obj2 = obj;
                iIntValue = this.f13738l;
            }
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new e0.h(obj2, iHashCode, iIntValue);
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements id.l<zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13739h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13740i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.h0<T> f13741j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ m<T> f13742k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.f0 f13743l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(kotlin.jvm.internal.h0<T> h0Var, m<T> mVar, kotlin.jvm.internal.f0 f0Var, zc.f<? super p> fVar) {
            super(1, fVar);
            this.f13741j = h0Var;
            this.f13742k = mVar;
            this.f13743l = f0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(zc.f<?> fVar) {
            return new p(this.f13741j, this.f13742k, this.f13743l, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f<? super wc.g0> fVar) {
            return ((p) create(fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.f0 f0Var;
            kotlin.jvm.internal.h0<T> h0Var;
            kotlin.jvm.internal.f0 f0Var2;
            Object objF = ad.d.f();
            int i10 = this.f13740i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        h0Var = (kotlin.jvm.internal.h0) this.f13739h;
                        wc.s.b(obj);
                    } else {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f0Var = (kotlin.jvm.internal.f0) this.f13739h;
                            wc.s.b(obj);
                            f0Var.f21511a = ((Number) obj).intValue();
                            return wc.g0.f27756a;
                        }
                        f0Var2 = (kotlin.jvm.internal.f0) this.f13739h;
                        wc.s.b(obj);
                    }
                    f0Var2.f21511a = ((Number) obj).intValue();
                    return wc.g0.f27756a;
                }
                wc.s.b(obj);
                h0Var = this.f13741j;
                m<T> mVar = this.f13742k;
                this.f13739h = h0Var;
                this.f13740i = 1;
                obj = (T) mVar.x(this);
                if (obj == objF) {
                    return objF;
                }
                h0Var.f21514a = (T) obj;
                f0Var2 = this.f13743l;
                e0.v vVarR = this.f13742k.r();
                this.f13739h = f0Var2;
                this.f13740i = 2;
                obj = (T) vVarR.a(this);
                if (obj == objF) {
                    return objF;
                }
                f0Var2.f21511a = ((Number) obj).intValue();
            } catch (CorruptionException unused) {
                kotlin.jvm.internal.f0 f0Var3 = this.f13743l;
                m<T> mVar2 = this.f13742k;
                T t10 = this.f13741j.f21514a;
                this.f13739h = f0Var3;
                this.f13740i = 3;
                Object objB = mVar2.B(t10, true, this);
                if (objB == objF) {
                    return objF;
                }
                f0Var = f0Var3;
                obj = (T) objB;
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super k0<T>>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13744h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ m<T> f13745i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f13746j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(m<T> mVar, boolean z10, zc.f<? super q> fVar) {
            super(2, fVar);
            this.f13745i = mVar;
            this.f13746j = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return new q(this.f13745i, this.f13746j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super k0<T>> fVar) {
            return ((q) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f13744h;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        wc.s.b(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wc.s.b(obj);
                    }
                    return (k0) obj;
                }
                wc.s.b(obj);
                if (((m) this.f13745i).f13634h.a() instanceof e0.t) {
                    return ((m) this.f13745i).f13634h.a();
                }
                m<T> mVar = this.f13745i;
                this.f13744h = 1;
                if (mVar.v(this) == objF) {
                    return objF;
                }
                m<T> mVar2 = this.f13745i;
                boolean z10 = this.f13746j;
                this.f13744h = 2;
                obj = mVar2.w(z10, this);
                if (obj == objF) {
                    return objF;
                }
                return (k0) obj;
            } catch (Throwable th) {
                return new d0(th, -1);
            }
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    static final class r extends kotlin.jvm.internal.u implements id.a<m0<T>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f13747d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(m<T> mVar) {
            super(0);
            this.f13747d = mVar;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0<T> invoke() {
            return ((m) this.f13747d).f13627a.a();
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    static final class s extends kotlin.coroutines.jvm.internal.l implements id.l<zc.f<? super T>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13748h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13749i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m<T> f13750j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ zc.j f13751k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ id.p<T, zc.f<? super T>, Object> f13752l;

        /* JADX INFO: compiled from: DataStoreImpl.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super T>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f13753h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ id.p<T, zc.f<? super T>, Object> f13754i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ e0.h<T> f13755j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(id.p<? super T, ? super zc.f<? super T>, ? extends Object> pVar, e0.h<T> hVar, zc.f<? super a> fVar) {
                super(2, fVar);
                this.f13754i = pVar;
                this.f13755j = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
                return new a(this.f13754i, this.f13755j, fVar);
            }

            @Override // id.p
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ud.o0 o0Var, zc.f<? super T> fVar) {
                return ((a) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to e0.m$s$a for r3v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = ad.b.f()
                    int r1 = r3.f13753h
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    wc.s.b(r4)
                    goto L2b
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    wc.s.b(r4)
                    id.p<T, zc.f<? super T>, java.lang.Object> r4 = r3.f13754i
                    e0.h<T> r1 = r3.f13755j
                    java.lang.Object r1 = r1.c()
                    r3.f13753h = r2
                    java.lang.Object r4 = r4.invoke(r1, r3)
                    if (r4 != r0) goto L2b
                    return r0
                L2b:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: e0.m.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(m<T> mVar, zc.j jVar, id.p<? super T, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super s> fVar) {
            super(1, fVar);
            this.f13750j = mVar;
            this.f13751k = jVar;
            this.f13752l = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(zc.f<?> fVar) {
            return new s(this.f13750j, this.f13751k, this.f13752l, fVar);
        }

        @Override // id.l
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zc.f<? super T> fVar) {
            return ((s) create(fVar)).invokeSuspend(wc.g0.f27756a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type zc.f to e0.m$s for r8v1 'this'  zc.f
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ad.b.f()
                int r1 = r8.f13749i
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f13748h
                wc.s.b(r9)
                goto L6c
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f13748h
                e0.h r1 = (e0.h) r1
                wc.s.b(r9)
                goto L51
            L27:
                wc.s.b(r9)
                goto L39
            L2b:
                wc.s.b(r9)
                e0.m<T> r9 = r8.f13750j
                r8.f13749i = r4
                java.lang.Object r9 = e0.m.n(r9, r4, r8)
                if (r9 != r0) goto L39
                return r0
            L39:
                r1 = r9
                e0.h r1 = (e0.h) r1
                zc.j r9 = r8.f13751k
                e0.m$s$a r5 = new e0.m$s$a
                id.p<T, zc.f<? super T>, java.lang.Object> r6 = r8.f13752l
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f13748h = r1
                r8.f13749i = r3
                java.lang.Object r9 = ud.i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                return r0
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.t.a(r1, r9)
                if (r1 != 0) goto L6d
                e0.m<T> r1 = r8.f13750j
                r8.f13748h = r9
                r8.f13749i = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
                return r0
            L6b:
                r0 = r9
            L6c:
                r9 = r0
            L6d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.m.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    static final class t extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super T>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13756h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f13757i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m<T> f13758j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ id.p<T, zc.f<? super T>, Object> f13759k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(m<T> mVar, id.p<? super T, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super t> fVar) {
            super(2, fVar);
            this.f13758j = mVar;
            this.f13759k = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            t tVar = new t(this.f13758j, this.f13759k, fVar);
            tVar.f13757i = obj;
            return tVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super T> fVar) {
            return ((t) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f13756h;
            if (i10 == 0) {
                wc.s.b(obj);
                ud.o0 o0Var = (ud.o0) this.f13757i;
                ud.x xVarB = ud.z.b(null, 1, null);
                ((m) this.f13758j).f13638l.e(new e0.y.a(this.f13759k, xVarB, ((m) this.f13758j).f13634h.a(), o0Var.q()));
                this.f13756h = 1;
                obj = xVarB.j0(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    static final class u extends kotlin.jvm.internal.u implements id.l<Throwable, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m<T> f13760d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(m<T> mVar) {
            super(1);
            this.f13760d = mVar;
        }

        public final void b(Throwable th) {
            if (th != null) {
                ((m) this.f13760d).f13634h.c(new e0.t(th));
            }
            if (((m) this.f13760d).f13636j.isInitialized()) {
                this.f13760d.s().close();
            }
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ wc.g0 invoke(Throwable th) {
            b(th);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    static final class v extends kotlin.jvm.internal.u implements id.p<e0.y.a<T>, Throwable, wc.g0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v f13761d = new v();

        v() {
            super(2);
        }

        public final void b(e0.y.a<T> msg, Throwable th) {
            kotlin.jvm.internal.t.f(msg, "msg");
            ud.x<T> xVarA = msg.a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            xVarA.F(th);
        }

        @Override // id.p
        public /* bridge */ /* synthetic */ wc.g0 invoke(Object obj, Throwable th) {
            b((e0.y.a) obj, th);
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements id.p<e0.y.a<T>, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f13763i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m<T> f13764j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(m<T> mVar, zc.f<? super w> fVar) {
            super(2, fVar);
            this.f13764j = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            w wVar = new w(this.f13764j, fVar);
            wVar.f13763i = obj;
            return wVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e0.y.a<T> aVar, zc.f<? super wc.g0> fVar) {
            return ((w) create(aVar, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f13762h;
            if (i10 == 0) {
                wc.s.b(obj);
                e0.y.a aVar = (e0.y.a) this.f13763i;
                m<T> mVar = this.f13764j;
                this.f13762h = 1;
                if (mVar.t(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return wc.g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13765h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f13766i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m<T> f13767j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f13768k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(m<T> mVar, zc.f<? super x> fVar) {
            super(fVar);
            this.f13767j = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13766i = obj;
            this.f13768k |= Integer.MIN_VALUE;
            return this.f13767j.B(null, false, this);
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    static final class y extends kotlin.coroutines.jvm.internal.l implements id.p<r0<T>, zc.f<? super wc.g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13769h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13770i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f13771j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.f0 f13772k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ m<T> f13773l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ T f13774m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f13775n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(kotlin.jvm.internal.f0 f0Var, m<T> mVar, T t10, boolean z10, zc.f<? super y> fVar) {
            super(2, fVar);
            this.f13772k = f0Var;
            this.f13773l = mVar;
            this.f13774m = t10;
            this.f13775n = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            y yVar = new y(this.f13772k, this.f13773l, this.f13774m, this.f13775n, fVar);
            yVar.f13771j = obj;
            return yVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r0<T> r0Var, zc.f<? super wc.g0> fVar) {
            return ((y) create(r0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0061  */
        /* JADX WARN: Code duplicated, block: B:21:0x006d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.f0 f0Var;
            r0 r0Var;
            T t10;
            int iHashCode;
            Object objF = ad.d.f();
            int i10 = this.f13770i;
            if (i10 != 0) {
                if (i10 == 1) {
                    f0Var = (kotlin.jvm.internal.f0) this.f13769h;
                    r0Var = (r0) this.f13771j;
                    wc.s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                if (this.f13775n) {
                    e0.n nVar = ((m) this.f13773l).f13634h;
                    t10 = this.f13774m;
                    if (t10 != null) {
                        iHashCode = t10.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    nVar.c(new e0.h(t10, iHashCode, this.f13772k.f21511a));
                }
                return wc.g0.f27756a;
            }
            wc.s.b(obj);
            r0 r0Var2 = (r0) this.f13771j;
            f0Var = this.f13772k;
            e0.v vVarR = this.f13773l.r();
            this.f13771j = r0Var2;
            this.f13769h = f0Var;
            this.f13770i = 1;
            Object objB = vVarR.b(this);
            if (objB == objF) {
                return objF;
            }
            r0Var = r0Var2;
            obj = objB;
            f0Var.f21511a = ((Number) obj).intValue();
            T t11 = this.f13774m;
            this.f13771j = null;
            this.f13769h = null;
            this.f13770i = 2;
            if (r0Var.b(t11, this) == objF) {
                return objF;
            }
            if (this.f13775n) {
                e0.n nVar2 = ((m) this.f13773l).f13634h;
                t10 = this.f13774m;
                if (t10 != null) {
                    iHashCode = t10.hashCode();
                } else {
                    iHashCode = 0;
                }
                nVar2.c(new e0.h(t10, iHashCode, this.f13772k.f21511a));
            }
            return wc.g0.f27756a;
        }
    }

    public m(l0<T> storage, List<? extends id.p<? super e0.u<T>, ? super zc.f<? super wc.g0>, ? extends Object>> initTasksList, e0.g<T> corruptionHandler, ud.o0 scope) {
        kotlin.jvm.internal.t.f(storage, "storage");
        kotlin.jvm.internal.t.f(initTasksList, "initTasksList");
        kotlin.jvm.internal.t.f(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.t.f(scope, "scope");
        this.f13627a = storage;
        this.f13628b = corruptionHandler;
        this.f13629c = scope;
        this.f13630d = xd.e.m(new d(this, null));
        this.f13631e = de.g.b(false, 1, null);
        this.f13634h = new e0.n<>();
        this.f13635i = new b(this, initTasksList);
        this.f13636j = wc.m.a(new r(this));
        this.f13637k = wc.m.a(new c(this));
        this.f13638l = new i0<>(scope, new u(this), v.f13761d, new w(this, null));
    }

    private final Object A(id.p<? super T, ? super zc.f<? super T>, ? extends Object> pVar, zc.j jVar, zc.f<? super T> fVar) {
        return r().d(new s(this, jVar, pVar, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(zc.f<? super wc.g0> fVar) throws Throwable {
        e eVar;
        m<T> mVar;
        de.a aVar;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.f13689l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f13689l = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, fVar);
            }
        } else {
            eVar = new e(this, fVar);
        }
        Object obj = eVar.f13687j;
        Object objF = ad.d.f();
        int i11 = eVar.f13689l;
        if (i11 == 0) {
            wc.s.b(obj);
            de.a aVar2 = this.f13631e;
            eVar.f13685h = this;
            eVar.f13686i = aVar2;
            eVar.f13689l = 1;
            if (aVar2.d(null, eVar) == objF) {
                return objF;
            }
            mVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (de.a) eVar.f13686i;
            mVar = (m) eVar.f13685h;
            wc.s.b(obj);
        }
        try {
            int i12 = mVar.f13632f - 1;
            mVar.f13632f = i12;
            if (i12 == 0) {
                b2 b2Var = mVar.f13633g;
                if (b2Var != null) {
                    b2.a.a(b2Var, null, 1, null);
                }
                mVar.f13633g = null;
            }
            wc.g0 g0Var = wc.g0.f27756a;
            return wc.g0.f27756a;
        } finally {
            aVar.c(null);
        }
    }

    private final <R> Object q(boolean z10, id.l<? super zc.f<? super R>, ? extends Object> lVar, zc.f<? super R> fVar) {
        return z10 ? lVar.invoke(fVar) : r().d(new f(lVar, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e0.v r() {
        return (e0.v) this.f13637k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [e0.m] */
    /* JADX WARN: Type inference failed for: r8v0, types: [e0.m, e0.m<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [e0.y$a, e0.y$a<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [e0.y$a] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [ud.x] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Object t(e0.y.a<T> aVar, zc.f<? super wc.g0> fVar) throws Throwable {
        g gVar;
        Object objC;
        ?? r10;
        ud.x xVarA;
        ?? r11;
        Object objA;
        ?? r12;
        ud.x xVar;
        if (fVar instanceof g) {
            gVar = (g) fVar;
            int i10 = gVar.f13697m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f13697m = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, fVar);
            }
        } else {
            gVar = new g(this, fVar);
        }
        Object obj = gVar.f13695k;
        Object objF = ad.d.f();
        int i11 = gVar.f13697m;
        boolean z10 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    xVar = (ud.x) gVar.f13692h;
                } else if (i11 == 2) {
                    ud.x xVar2 = (ud.x) gVar.f13694j;
                    m mVar = (m) gVar.f13693i;
                    e0.y.a aVar2 = (e0.y.a) gVar.f13692h;
                    wc.s.b(obj);
                    xVarA = xVar2;
                    r11 = mVar;
                    r12 = (e0.y.a<T>) aVar2;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (e0.y.a<T>) ((ud.x) gVar.f13692h);
                }
                wc.s.b(obj);
                aVar = xVar;
                objC = wc.r.c(obj);
                r10 = aVar;
                ud.z.c(r10, objC);
                return wc.g0.f27756a;
            }
            wc.s.b(obj);
            xVarA = aVar.a();
            try {
                wc.r.a aVar3 = wc.r.f27774b;
                k0<T> k0VarA = this.f13634h.a();
                if (k0VarA instanceof e0.h) {
                    id.p pVarD = aVar.d();
                    zc.j jVarB = aVar.b();
                    gVar.f13692h = xVarA;
                    gVar.f13697m = 1;
                    objA = A(pVarD, jVarB, gVar);
                    if (objA == objF) {
                        return objF;
                    }
                } else {
                    if (!(k0VarA instanceof d0)) {
                        z10 = k0VarA instanceof o0;
                    }
                    if (!z10) {
                        if (k0VarA instanceof e0.t) {
                            throw ((e0.t) k0VarA).b();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (k0VarA != aVar.c()) {
                        kotlin.jvm.internal.t.d(k0VarA, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                        throw ((d0) k0VarA).b();
                    }
                    gVar.f13692h = aVar;
                    gVar.f13693i = this;
                    gVar.f13694j = xVarA;
                    gVar.f13697m = 2;
                    if (v(gVar) == objF) {
                        return objF;
                    }
                    r11 = this;
                    r12 = aVar;
                }
                ud.x xVar3 = xVarA;
                obj = objA;
                aVar = xVar3;
                objC = wc.r.c(obj);
                r10 = aVar;
            } catch (Throwable th) {
                th = th;
                aVar = xVarA;
                wc.r.a aVar4 = wc.r.f27774b;
                objC = wc.r.c(wc.s.a(th));
                r10 = aVar;
            }
            ud.z.c(r10, objC);
            return wc.g0.f27756a;
            id.p pVarD2 = r12.d();
            zc.j jVarB2 = r12.b();
            gVar.f13692h = xVarA;
            gVar.f13693i = null;
            gVar.f13694j = null;
            gVar.f13697m = 3;
            objA = r11.A(pVarD2, jVarB2, gVar);
            if (objA == objF) {
                return objF;
            }
            ud.x xVar4 = xVarA;
            obj = objA;
            aVar = xVar4;
            objC = wc.r.c(obj);
            r10 = aVar;
        } catch (Throwable th2) {
            th = th2;
        }
        ud.z.c(r10, objC);
        return wc.g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(zc.f<? super wc.g0> fVar) throws Throwable {
        h hVar;
        m<T> mVar;
        de.a aVar;
        if (fVar instanceof h) {
            hVar = (h) fVar;
            int i10 = hVar.f13702l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f13702l = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, fVar);
            }
        } else {
            hVar = new h(this, fVar);
        }
        Object obj = hVar.f13700j;
        Object objF = ad.d.f();
        int i11 = hVar.f13702l;
        if (i11 == 0) {
            wc.s.b(obj);
            de.a aVar2 = this.f13631e;
            hVar.f13698h = this;
            hVar.f13699i = aVar2;
            hVar.f13702l = 1;
            if (aVar2.d(null, hVar) == objF) {
                return objF;
            }
            mVar = this;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (de.a) hVar.f13699i;
            mVar = (m) hVar.f13698h;
            wc.s.b(obj);
        }
        try {
            int i12 = mVar.f13632f + 1;
            mVar.f13632f = i12;
            if (i12 == 1) {
                mVar.f13633g = ud.k.d(mVar.f13629c, null, null, new i(mVar, null), 3, null);
            }
            wc.g0 g0Var = wc.g0.f27756a;
            return wc.g0.f27756a;
        } finally {
            aVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v(zc.f<? super wc.g0> fVar) throws Throwable {
        j jVar;
        m<T> mVar;
        int iIntValue;
        int i10;
        Throwable th;
        m<T> mVar2;
        if (fVar instanceof j) {
            jVar = (j) fVar;
            int i11 = jVar.f13710l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f13710l = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, fVar);
            }
        } else {
            jVar = new j(this, fVar);
        }
        Object objA = jVar.f13708j;
        Object objF = ad.d.f();
        int i12 = jVar.f13710l;
        try {
            if (i12 == 0) {
                wc.s.b(objA);
                e0.v vVarR = r();
                jVar.f13706h = this;
                jVar.f13710l = 1;
                objA = vVarR.a(jVar);
                if (objA == objF) {
                    return objF;
                }
                mVar = this;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = jVar.f13707i;
                    mVar2 = (m) jVar.f13706h;
                    try {
                        wc.s.b(objA);
                        return wc.g0.f27756a;
                    } catch (Throwable th2) {
                        th = th2;
                        mVar2.f13634h.c(new d0(th, i10));
                        throw th;
                    }
                }
                mVar = (m) jVar.f13706h;
                wc.s.b(objA);
            }
            m<T>.b bVar = mVar.f13635i;
            jVar.f13706h = mVar;
            jVar.f13707i = iIntValue;
            jVar.f13710l = 2;
            if (bVar.c(jVar) == objF) {
                return objF;
            }
            return wc.g0.f27756a;
        } catch (Throwable th3) {
            i10 = iIntValue;
            th = th3;
            mVar2 = mVar;
            mVar2.f13634h.c(new d0(th, i10));
            throw th;
        }
        iIntValue = ((Number) objA).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(boolean z10, zc.f<? super k0<T>> fVar) throws Throwable {
        k kVar;
        k0<T> k0Var;
        Object obj;
        boolean z11;
        m<T> mVar;
        wc.q qVar;
        k0<T> k0Var2;
        if (fVar instanceof k) {
            kVar = (k) fVar;
            int i10 = kVar.f13716m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f13716m = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, fVar);
            }
        } else {
            kVar = new k(this, fVar);
        }
        Object objE = kVar.f13714k;
        Object objF = ad.d.f();
        int i11 = kVar.f13716m;
        if (i11 == 0) {
            wc.s.b(objE);
            k0<T> k0VarA = this.f13634h.a();
            if (!(!(k0VarA instanceof o0))) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
            }
            e0.v vVarR = r();
            kVar.f13711h = this;
            kVar.f13712i = k0VarA;
            kVar.f13713j = z10;
            kVar.f13716m = 1;
            Object objA = vVarR.a(kVar);
            if (objA == objF) {
                return objF;
            }
            k0Var = k0VarA;
            obj = objA;
            z11 = z10;
            mVar = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    mVar = (m) kVar.f13711h;
                    wc.s.b(objE);
                    qVar = (wc.q) objE;
                    k0Var2 = (k0) qVar.b();
                    if (((Boolean) qVar.c()).booleanValue()) {
                        mVar.f13634h.c(k0Var2);
                    }
                    return k0Var2;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar = (m) kVar.f13711h;
                wc.s.b(objE);
                qVar = (wc.q) objE;
                k0Var2 = (k0) qVar.b();
                if (((Boolean) qVar.c()).booleanValue()) {
                    mVar.f13634h.c(k0Var2);
                }
                return k0Var2;
            }
            boolean z12 = kVar.f13713j;
            k0<T> k0Var3 = (k0) kVar.f13712i;
            m<T> mVar2 = (m) kVar.f13711h;
            wc.s.b(objE);
            z11 = z12;
            mVar = mVar2;
            k0Var = k0Var3;
            obj = objE;
        }
        int iIntValue = ((Number) obj).intValue();
        boolean z13 = k0Var instanceof e0.h;
        int iA = z13 ? k0Var.a() : -1;
        if (z13 && iIntValue == iA) {
            return k0Var;
        }
        if (z11) {
            e0.v vVarR2 = mVar.r();
            l lVar = new l(mVar, null);
            kVar.f13711h = mVar;
            kVar.f13712i = null;
            kVar.f13716m = 2;
            objE = vVarR2.d(lVar, kVar);
            if (objE == objF) {
                return objF;
            }
            qVar = (wc.q) objE;
            k0Var2 = (k0) qVar.b();
            if (((Boolean) qVar.c()).booleanValue()) {
                mVar.f13634h.c(k0Var2);
            }
            return k0Var2;
        }
        e0.v vVarR3 = mVar.r();
        C0190m c0190m = new C0190m(mVar, iA, null);
        kVar.f13711h = mVar;
        kVar.f13712i = null;
        kVar.f13716m = 3;
        objE = vVarR3.e(c0190m, kVar);
        if (objE == objF) {
            return objF;
        }
        qVar = (wc.q) objE;
        k0Var2 = (k0) qVar.b();
        if (((Boolean) qVar.c()).booleanValue()) {
            mVar.f13634h.c(k0Var2);
        }
        return k0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(zc.f<? super T> fVar) {
        return n0.a(s(), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x014f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [e0.m, e0.m<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [e0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v10, types: [e0.m] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [e0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [e0.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [e0.m] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final Object y(boolean z10, zc.f<? super e0.h<T>> fVar) throws Throwable {
        n nVar;
        ?? r10;
        kotlin.jvm.internal.h0 h0Var;
        Object objA;
        CorruptionException corruptionException;
        kotlin.jvm.internal.h0 h0Var2;
        ?? r11;
        kotlin.jvm.internal.f0 f0Var;
        boolean z11;
        CorruptionException corruptionException2;
        p pVar;
        kotlin.jvm.internal.f0 f0Var2;
        kotlin.jvm.internal.h0 h0Var3;
        ?? r12;
        ?? r13;
        int iHashCode;
        Object objA2;
        boolean z12;
        int i10;
        Object obj;
        ?? r14;
        ?? r15;
        if (fVar instanceof n) {
            nVar = (n) fVar;
            int i11 = nVar.f13733p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f13733p = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, fVar);
            }
        } else {
            nVar = new n(this, fVar);
        }
        Object obj2 = (T) nVar.f13731n;
        Object objF = ad.d.f();
        ?? r16 = nVar.f13733p;
        try {
            switch (r16) {
                case 0:
                    wc.s.b(obj2);
                    try {
                        if (!z10) {
                            e0.v vVarR = r();
                            nVar.f13725h = this;
                            nVar.f13729l = z10;
                            nVar.f13733p = 3;
                            obj2 = (T) vVarR.a(nVar);
                            if (obj2 == objF) {
                                return objF;
                            }
                            r12 = this;
                            int iIntValue = ((Number) obj2).intValue();
                            e0.v vVarR2 = r12.r();
                            o oVar = new o(r12, iIntValue, null);
                            nVar.f13725h = r12;
                            nVar.f13729l = z10;
                            nVar.f13733p = 4;
                            obj2 = (T) vVarR2.e(oVar, nVar);
                            if (obj2 == objF) {
                                return objF;
                            }
                            return (e0.h) obj2;
                        }
                        nVar.f13725h = this;
                        nVar.f13729l = z10;
                        nVar.f13733p = 1;
                        obj2 = (T) x(nVar);
                        if (obj2 == objF) {
                            return objF;
                        }
                        r13 = this;
                        if (obj2 != null) {
                            try {
                                iHashCode = obj2.hashCode();
                            } catch (CorruptionException e10) {
                                e = e10;
                                r14 = r13;
                                r10 = r14;
                                h0Var = new kotlin.jvm.internal.h0();
                                e0.g<T> gVar = r10.f13628b;
                                nVar.f13725h = r10;
                                nVar.f13726i = e;
                                nVar.f13727j = h0Var;
                                nVar.f13728k = h0Var;
                                nVar.f13729l = z10;
                                nVar.f13733p = 5;
                                objA = gVar.a(e, nVar);
                                if (objA == objF) {
                                    return objF;
                                }
                                corruptionException = e;
                                obj2 = (T) objA;
                                h0Var2 = h0Var;
                                r11 = r10;
                                h0Var2.f21514a = (T) obj2;
                                f0Var = new kotlin.jvm.internal.f0();
                                z11 = z10;
                                try {
                                    pVar = new p(h0Var, r11, f0Var, null);
                                    nVar.f13725h = corruptionException;
                                    nVar.f13726i = h0Var;
                                    nVar.f13727j = f0Var;
                                    nVar.f13728k = null;
                                    nVar.f13733p = 6;
                                    if (r11.q(z11, pVar, nVar) == objF) {
                                        return objF;
                                    }
                                    f0Var2 = f0Var;
                                    h0Var3 = h0Var;
                                    T t10 = h0Var3.f21514a;
                                    return new e0.h(t10, t10 != null ? t10.hashCode() : 0, f0Var2.f21511a);
                                } catch (Throwable th) {
                                    th = th;
                                    corruptionException2 = corruptionException;
                                    wc.f.a(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                        } else {
                            iHashCode = 0;
                        }
                        e0.v vVarR3 = r13.r();
                        nVar.f13725h = r13;
                        nVar.f13726i = obj2;
                        nVar.f13729l = z10;
                        nVar.f13730m = iHashCode;
                        nVar.f13733p = 2;
                        objA2 = vVarR3.a(nVar);
                        if (objA2 == objF) {
                            return objF;
                        }
                        int i12 = iHashCode;
                        z12 = z10;
                        i10 = i12;
                        obj = obj2;
                        obj2 = (T) objA2;
                        r15 = r13;
                        return new e0.h(obj, i10, ((Number) obj2).intValue());
                    } catch (CorruptionException e11) {
                        e = e11;
                        r10 = this;
                        h0Var = new kotlin.jvm.internal.h0();
                        e0.g<T> gVar2 = r10.f13628b;
                        nVar.f13725h = r10;
                        nVar.f13726i = e;
                        nVar.f13727j = h0Var;
                        nVar.f13728k = h0Var;
                        nVar.f13729l = z10;
                        nVar.f13733p = 5;
                        objA = gVar2.a(e, nVar);
                        if (objA == objF) {
                            return objF;
                        }
                        corruptionException = e;
                        obj2 = (T) objA;
                        h0Var2 = h0Var;
                        r11 = r10;
                        h0Var2.f21514a = (T) obj2;
                        f0Var = new kotlin.jvm.internal.f0();
                        if (z10) {
                        }
                        pVar = new p(h0Var, r11, f0Var, null);
                        nVar.f13725h = corruptionException;
                        nVar.f13726i = h0Var;
                        nVar.f13727j = f0Var;
                        nVar.f13728k = null;
                        nVar.f13733p = 6;
                        if (r11.q(z11, pVar, nVar) == objF) {
                            return objF;
                        }
                        f0Var2 = f0Var;
                        h0Var3 = h0Var;
                        T t11 = h0Var3.f21514a;
                        return new e0.h(t11, t11 != null ? t11.hashCode() : 0, f0Var2.f21511a);
                    }
                case 1:
                    z10 = nVar.f13729l;
                    m mVar = (m) nVar.f13725h;
                    wc.s.b(obj2);
                    r13 = mVar;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    e0.v vVarR4 = r13.r();
                    nVar.f13725h = r13;
                    nVar.f13726i = obj2;
                    nVar.f13729l = z10;
                    nVar.f13730m = iHashCode;
                    nVar.f13733p = 2;
                    objA2 = vVarR4.a(nVar);
                    if (objA2 == objF) {
                        return objF;
                    }
                    int i13 = iHashCode;
                    z12 = z10;
                    i10 = i13;
                    obj = obj2;
                    obj2 = (T) objA2;
                    r15 = r13;
                    return new e0.h(obj, i10, ((Number) obj2).intValue());
                case 2:
                    i10 = nVar.f13730m;
                    z12 = nVar.f13729l;
                    obj = nVar.f13726i;
                    r15 = (m) nVar.f13725h;
                    try {
                        wc.s.b(obj2);
                        r15 = r15;
                        return new e0.h(obj, i10, ((Number) obj2).intValue());
                    } catch (CorruptionException e12) {
                        e = e12;
                        z10 = z12;
                        r14 = r15;
                        r10 = r14;
                        h0Var = new kotlin.jvm.internal.h0();
                        e0.g<T> gVar3 = r10.f13628b;
                        nVar.f13725h = r10;
                        nVar.f13726i = e;
                        nVar.f13727j = h0Var;
                        nVar.f13728k = h0Var;
                        nVar.f13729l = z10;
                        nVar.f13733p = 5;
                        objA = gVar3.a(e, nVar);
                        if (objA == objF) {
                            return objF;
                        }
                        corruptionException = e;
                        obj2 = (T) objA;
                        h0Var2 = h0Var;
                        r11 = r10;
                        h0Var2.f21514a = (T) obj2;
                        f0Var = new kotlin.jvm.internal.f0();
                        if (z10) {
                        }
                        pVar = new p(h0Var, r11, f0Var, null);
                        nVar.f13725h = corruptionException;
                        nVar.f13726i = h0Var;
                        nVar.f13727j = f0Var;
                        nVar.f13728k = null;
                        nVar.f13733p = 6;
                        if (r11.q(z11, pVar, nVar) == objF) {
                            return objF;
                        }
                        f0Var2 = f0Var;
                        h0Var3 = h0Var;
                        T t12 = h0Var3.f21514a;
                        return new e0.h(t12, t12 != null ? t12.hashCode() : 0, f0Var2.f21511a);
                    }
                case 3:
                    z10 = nVar.f13729l;
                    m mVar2 = (m) nVar.f13725h;
                    wc.s.b(obj2);
                    r12 = mVar2;
                    int iIntValue2 = ((Number) obj2).intValue();
                    e0.v vVarR5 = r12.r();
                    o oVar2 = new o(r12, iIntValue2, null);
                    nVar.f13725h = r12;
                    nVar.f13729l = z10;
                    nVar.f13733p = 4;
                    obj2 = (T) vVarR5.e(oVar2, nVar);
                    if (obj2 == objF) {
                        return objF;
                    }
                    return (e0.h) obj2;
                case 4:
                    boolean z13 = nVar.f13729l;
                    wc.s.b(obj2);
                    return (e0.h) obj2;
                case 5:
                    z10 = nVar.f13729l;
                    kotlin.jvm.internal.h0 h0Var4 = (kotlin.jvm.internal.h0) nVar.f13728k;
                    kotlin.jvm.internal.h0 h0Var5 = (kotlin.jvm.internal.h0) nVar.f13727j;
                    corruptionException = (CorruptionException) nVar.f13726i;
                    m mVar3 = (m) nVar.f13725h;
                    wc.s.b(obj2);
                    h0Var2 = h0Var4;
                    h0Var = h0Var5;
                    r11 = mVar3;
                    h0Var2.f21514a = (T) obj2;
                    f0Var = new kotlin.jvm.internal.f0();
                    if (z10) {
                    }
                    pVar = new p(h0Var, r11, f0Var, null);
                    nVar.f13725h = corruptionException;
                    nVar.f13726i = h0Var;
                    nVar.f13727j = f0Var;
                    nVar.f13728k = null;
                    nVar.f13733p = 6;
                    if (r11.q(z11, pVar, nVar) == objF) {
                        return objF;
                    }
                    f0Var2 = f0Var;
                    h0Var3 = h0Var;
                    T t13 = h0Var3.f21514a;
                    return new e0.h(t13, t13 != null ? t13.hashCode() : 0, f0Var2.f21511a);
                case 6:
                    f0Var2 = (kotlin.jvm.internal.f0) nVar.f13727j;
                    h0Var3 = (kotlin.jvm.internal.h0) nVar.f13726i;
                    corruptionException2 = (CorruptionException) nVar.f13725h;
                    try {
                        wc.s.b(obj2);
                        T t14 = h0Var3.f21514a;
                        return new e0.h(t14, t14 != null ? t14.hashCode() : 0, f0Var2.f21511a);
                    } catch (Throwable th2) {
                        th = th2;
                        wc.f.a(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e13) {
            e = e13;
            r10 = r16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(boolean z10, zc.f<? super k0<T>> fVar) {
        return ud.i.g(this.f13629c.q(), new q(this, z10, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(T t10, boolean z10, zc.f<? super Integer> fVar) throws Throwable {
        x xVar;
        kotlin.jvm.internal.f0 f0Var;
        if (fVar instanceof x) {
            xVar = (x) fVar;
            int i10 = xVar.f13768k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f13768k = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, fVar);
            }
        } else {
            xVar = new x(this, fVar);
        }
        Object obj = xVar.f13766i;
        Object objF = ad.d.f();
        int i11 = xVar.f13768k;
        if (i11 == 0) {
            wc.s.b(obj);
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            m0<T> m0VarS = s();
            y yVar = new y(f0Var2, this, t10, z10, null);
            xVar.f13765h = f0Var2;
            xVar.f13768k = 1;
            if (m0VarS.e(yVar, xVar) == objF) {
                return objF;
            }
            f0Var = f0Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = (kotlin.jvm.internal.f0) xVar.f13765h;
            wc.s.b(obj);
        }
        return kotlin.coroutines.jvm.internal.b.c(f0Var.f21511a);
    }

    @Override // e0.k
    public Object a(id.p<? super T, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) {
        q0 q0Var = (q0) fVar.getContext().e(q0.a.C0191a.f13801a);
        if (q0Var != null) {
            q0Var.a(this);
        }
        return ud.i.g(new q0(q0Var, this), new t(this, pVar, null), fVar);
    }

    @Override // e0.k
    public xd.c<T> getData() {
        return this.f13630d;
    }

    public final m0<T> s() {
        return this.f13636j.getValue();
    }
}

package io.bidmachine.analytics.internal.q;

import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import id.l;
import io.bidmachine.analytics.ReaderConfig;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import rd.f0;
import wc.r;
import wc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends io.bidmachine.analytics.internal.n.a implements io.bidmachine.analytics.internal.h.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f17347n = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p002a.a f17348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l f17349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f17350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private io.bidmachine.analytics.internal.q.b f17351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f17352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f17354m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends u implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17355a = new a();

        a() {
            super(1);
        }

        @Override // id.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.analytics.internal.q.b invoke(Context context) {
            return new io.bidmachine.analytics.internal.q.b(context);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f17356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f17357b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f17359d;

        c(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f17357b = obj;
            this.f17359d |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    public /* synthetic */ f(io.bidmachine.analytics.internal.p002a.a aVar, l lVar, int i10, k kVar) {
        this(aVar, (i10 & 2) != 0 ? a.f17355a : lVar);
    }

    private final g d() {
        return this.f17348g.c().c();
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f17354m;
    }

    @Override // io.bidmachine.analytics.internal.n.a
    public boolean c() {
        return this.f17353l;
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void e(Context context) {
        super.e(context);
        io.bidmachine.analytics.internal.q.b bVar = this.f17351j;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    public void f(Context context) {
        io.bidmachine.analytics.internal.q.b bVar = this.f17351j;
        if (bVar != null) {
            bVar.i();
        }
        super.f(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.bidmachine.analytics.internal.n.a
    public Object a(ReaderConfig.Rule rule, zc.f fVar) throws Throwable {
        c cVar;
        f fVar2;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.f17359d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f17359d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object objA = cVar.f17357b;
        Object objF = ad.d.f();
        int i11 = cVar.f17359d;
        if (i11 == 0) {
            s.b(objA);
            io.bidmachine.analytics.internal.q.b bVar = this.f17351j;
            if (bVar == null) {
                throw new IllegalArgumentException("Not configured");
            }
            sd.a.C0418a c0418a = sd.a.f25407b;
            long jP = sd.a.p(sd.c.s(10, sd.d.SECONDS));
            cVar.f17356a = this;
            cVar.f17359d = 1;
            objA = bVar.a(jP, cVar);
            if (objA == objF) {
                return objF;
            }
            fVar2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar2 = (f) cVar.f17356a;
            s.b(objA);
        }
        io.bidmachine.analytics.internal.q.a aVar = (io.bidmachine.analytics.internal.q.a) objA;
        fVar2.d().a(aVar);
        e eVar = fVar2.f17352k;
        if (aVar != null && eVar != null) {
            eVar.a();
            eVar.a(io.bidmachine.analytics.internal.r.b.f17371a.a(aVar));
        }
        if (aVar == null) {
            throw new FileNotFoundException("Data not received yet");
        }
        if (aVar.f()) {
            throw new FileNotFoundException("Data is empty");
        }
        return aVar.b();
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
        this.f17350i = context;
    }

    public f(io.bidmachine.analytics.internal.p002a.a aVar, l lVar) {
        this.f17348g = aVar;
        this.f17349h = lVar;
        this.f17353l = true;
        this.f17354m = "apur";
    }

    @Override // io.bidmachine.analytics.internal.n.a, io.bidmachine.analytics.internal.h.d
    /* JADX INFO: renamed from: a */
    public void b(io.bidmachine.analytics.internal.n.a.C0295a c0295a) {
        super.b(c0295a);
        Context context = this.f17350i;
        if (context != null) {
            if (c0295a.c().size() == 1) {
                ReaderConfig.Rule rule = (ReaderConfig.Rule) b0.O(c0295a.c());
                if (rule instanceof ReaderConfig.Rule.PurRule) {
                    ReaderConfig.Rule.PurRule purRule = (ReaderConfig.Rule.PurRule) rule;
                    List listK0 = f0.K0(io.bidmachine.analytics.internal.E.e.b(purRule.getPath()), new String[]{"-"}, false, 0, 6, null);
                    if (listK0.size() == 2) {
                        io.bidmachine.analytics.internal.a.e.a aVar = io.bidmachine.analytics.internal.p002a.e.f16862d;
                        io.bidmachine.analytics.internal.p002a.e eVarA = aVar.a(f0.d1((String) listK0.get(0)).toString());
                        if (eVarA != null) {
                            io.bidmachine.analytics.internal.p002a.e eVarA2 = aVar.a(f0.d1((String) listK0.get(1)).toString());
                            if (eVarA2 != null) {
                                io.bidmachine.analytics.internal.q.b bVar = this.f17351j;
                                if (bVar == null) {
                                    bVar = (io.bidmachine.analytics.internal.q.b) this.f17349h.invoke(context);
                                }
                                this.f17351j = bVar;
                                io.bidmachine.analytics.internal.p002a.e eVarL = bVar.l();
                                if (eVarL != null) {
                                    if (eVarL.compareTo(eVarA) >= 0 && eVarL.compareTo(eVarA2) <= 0) {
                                        if (bVar.u()) {
                                            if (bVar.t()) {
                                                this.f17353l = purRule.getShouldReport();
                                                e eVar = this.f17352k;
                                                if (eVar != null) {
                                                    r.b(eVar.b());
                                                }
                                                String query = purRule.getQuery();
                                                this.f17352k = query != null ? e.f17343c.a(query) : null;
                                                return;
                                            }
                                            throw new IllegalStateException("No permission");
                                        }
                                        throw new IllegalStateException("No host found");
                                    }
                                    throw new IllegalStateException(("Version " + eVarL + " not supported by config").toString());
                                }
                                throw new IllegalStateException("Version not found");
                            }
                            throw new IllegalStateException("Max version not found");
                        }
                        throw new IllegalStateException("Min version not found");
                    }
                    throw new IllegalStateException("Path should contains min and max value");
                }
                throw new IllegalStateException(("Reader " + a() + " accept only PurRule").toString());
            }
            throw new IllegalStateException(("Reader " + a() + " should contains only one rule, received " + c0295a.c().size()).toString());
        }
        throw new IllegalArgumentException("Context is null");
    }

    @Override // io.bidmachine.analytics.internal.h.a
    public Object a(String str) {
        e eVar;
        if (!t.a(str, AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE) || (eVar = this.f17352k) == null) {
            return null;
        }
        Object objC = eVar.c();
        return (Boolean) (r.k(objC) ? null : objC);
    }
}

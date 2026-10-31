package fb;

import id.l;
import id.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.o;
import kotlin.jvm.internal.t;
import pa.h;
import pb.d0;
import pb.e0;
import pb.f0;
import ud.k;
import ud.o0;
import wc.g0;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements fb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f14914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f14915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f14916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o0 f14917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f14918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f14919g;

    public final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f14920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f14921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f14922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f14923d;

        public a(c cVar, f0 eventType, List baseEventTaskParamsList, Object... params) {
            t.f(eventType, "eventType");
            t.f(baseEventTaskParamsList, "baseEventTaskParamsList");
            t.f(params, "params");
            this.f14923d = cVar;
            this.f14920a = eventType;
            this.f14921b = baseEventTaskParamsList;
            this.f14922c = params;
        }

        public void a(List list) {
            g0 g0Var;
            if (list != null) {
                c cVar = this.f14923d;
                f0 f0Var = this.f14920a;
                Object[] objArr = this.f14922c;
                cVar.c(list, f0Var, Arrays.copyOf(objArr, objArr.length));
                g0Var = g0.f27756a;
            } else {
                g0Var = null;
            }
            if (g0Var == null) {
                c cVar2 = this.f14923d;
                List list2 = this.f14921b;
                f0 f0Var2 = this.f14920a;
                Object[] objArr2 = this.f14922c;
                cVar2.m(list2, f0Var2, Arrays.copyOf(objArr2, objArr2.length));
            }
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((List) obj);
            return g0.f27756a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f14924h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object[] f14926j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ f0 f14927k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object[] objArr, f0 f0Var, zc.f fVar) {
            super(2, fVar);
            this.f14926j = objArr;
            this.f14927k = f0Var;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return c.this.new b(this.f14926j, this.f14927k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f14924h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            e eVar = c.this.f14915c;
            List listR0 = b0.r0(o.x(this.f14926j));
            listR0.add(0, this.f14927k);
            if (eVar.a(listR0)) {
                return g0.f27756a;
            }
            List list = (List) c.this.f14919g.get(this.f14927k);
            if (list != null) {
                c cVar = c.this;
                f0 f0Var = this.f14927k;
                Object[] objArr = this.f14926j;
                cVar.c(list, f0Var, Arrays.copyOf(objArr, objArr.length));
            }
            return g0.f27756a;
        }
    }

    public c(String sourceName, e stateGroupEventInterceptor, e animationEventInterceptor, d callbackProcessor, o0 coroutineScope, h coroutineDispatchers, Map map) {
        t.f(sourceName, "sourceName");
        t.f(stateGroupEventInterceptor, "stateGroupEventInterceptor");
        t.f(animationEventInterceptor, "animationEventInterceptor");
        t.f(callbackProcessor, "callbackProcessor");
        t.f(coroutineScope, "coroutineScope");
        t.f(coroutineDispatchers, "coroutineDispatchers");
        this.f14913a = sourceName;
        this.f14914b = stateGroupEventInterceptor;
        this.f14915c = animationEventInterceptor;
        this.f14916d = callbackProcessor;
        this.f14917e = coroutineScope;
        this.f14918f = coroutineDispatchers;
        this.f14919g = map == null ? new EnumMap(f0.class) : map;
    }

    @Override // fb.b
    public void c() {
        f(f0.OnThirdQuartile, new Object[0]);
    }

    @Override // fb.b
    public void d() {
        f(f0.OnBillableImpression, new Object[0]);
    }

    @Override // fb.b
    public void e() {
        f(f0.OnSkip, new Object[0]);
    }

    @Override // fb.b
    public void f() {
        f(f0.OnExpand, new Object[0]);
    }

    @Override // fb.b
    public String g() {
        return this.f14913a;
    }

    @Override // fb.b
    public void h() {
        f(f0.OnPause, new Object[0]);
    }

    @Override // fb.b
    public void i() {
        f(f0.OnMidpoint, new Object[0]);
    }

    @Override // fb.b
    public void j() {
        f(f0.OnScheduled, new Object[0]);
    }

    @Override // fb.b
    public void l() {
        f(f0.OnClickResolved, new Object[0]);
    }

    @Override // fb.b
    public void m() {
        f(f0.OnFirstQuartile, new Object[0]);
    }

    @Override // fb.b
    public void o() {
        f(f0.OnCollapse, new Object[0]);
    }

    @Override // fb.b
    public void onClose() {
        f(f0.OnClose, new Object[0]);
    }

    @Override // fb.b
    public void p(Integer num) {
        f(f0.OnUnMute, num);
    }

    @Override // fb.b
    public void q(Integer num) {
        f(f0.OnMute, num);
    }

    @Override // fb.b
    public void r() {
        f(f0.OnStart, new Object[0]);
    }

    @Override // fb.b
    public void s() {
        f(f0.OnImpression, new Object[0]);
    }

    @Override // fb.b
    public void t(boolean z10) {
        f(f0.OnUseCustomClose, Boolean.valueOf(z10));
    }

    @Override // fb.b
    public void u(long j10, long j11) {
        f(f0.OnProgress, Long.valueOf(j10), Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(List list, f0 f0Var, Object... objArr) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.f14914b.a(((d0) obj).b())) {
                arrayList.add(obj);
            }
        }
        List listR0 = b0.r0(arrayList);
        Iterator it = listR0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((d0) next).a() != e0.RequestPermission);
        if (next != null) {
            listR0.remove(next);
        }
        d0 d0Var = (d0) next;
        if (d0Var == null) {
            m(listR0, f0Var, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        d dVar = this.f14916d;
        Object objZ = o.z(objArr);
        dVar.b(d0Var, f0Var, objZ != null ? wb.e0.Y(objZ, null, 1, null) : null, listR0, new a(this, f0Var, listR0, Arrays.copyOf(objArr, objArr.length)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(List list, f0 f0Var, Object... objArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f14916d.a(f0Var, (d0) it.next(), Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // fb.b
    public void a(int i10) {
        f(f0.OnClick, Integer.valueOf(i10));
    }

    @Override // fb.b
    public void b() {
        f(f0.OnResume, new Object[0]);
    }

    public final void f(f0 eventType, Object... params) {
        t.f(eventType, "eventType");
        t.f(params, "params");
        k.d(this.f14917e, this.f14918f.d(), null, new b(params, eventType, null), 2, null);
    }

    @Override // fb.b
    public void a() {
        f(f0.OnComplete, new Object[0]);
    }

    @Override // fb.b
    public void a(String url) {
        t.f(url, "url");
        f(f0.OnNavigate, url);
    }
}

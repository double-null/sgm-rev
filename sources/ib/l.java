package ib;

import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f16340b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bc.c f16341a;

    private static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f16342h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f16343i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f16344j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f16345k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f16347m;

        b(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f16345k = obj;
            this.f16347m |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    static final class c extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f16348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f16349e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j10) {
            super(0);
            this.f16348d = str;
            this.f16349e = j10;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f16348d + " took " + (System.currentTimeMillis() - this.f16349e) + " ms";
        }
    }

    public l(bc.c logger) {
        t.f(logger, "logger");
        this.f16341a = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, id.l lVar, zc.f fVar) throws Throwable {
        b bVar;
        long jCurrentTimeMillis;
        l lVar2;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f16347m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16347m = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object objInvoke = bVar.f16345k;
        Object objF = ad.d.f();
        int i11 = bVar.f16347m;
        if (i11 == 0) {
            s.b(objInvoke);
            jCurrentTimeMillis = System.currentTimeMillis();
            bVar.f16342h = this;
            bVar.f16343i = str;
            bVar.f16344j = jCurrentTimeMillis;
            bVar.f16347m = 1;
            objInvoke = lVar.invoke(bVar);
            if (objInvoke == objF) {
                return objF;
            }
            lVar2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = bVar.f16344j;
            String str2 = (String) bVar.f16343i;
            lVar2 = (l) bVar.f16342h;
            s.b(objInvoke);
            jCurrentTimeMillis = j10;
            str = str2;
        }
        lVar2.f16341a.b("MeanPerformanceMeasurer", new c(str, jCurrentTimeMillis));
        return objInvoke;
    }
}

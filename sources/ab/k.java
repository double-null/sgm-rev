package ab;

import android.view.View;
import id.p;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.t;
import ud.o0;
import wb.i0;
import wc.g0;
import wc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements ab.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pa.h f223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f224c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f225h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pa.d f227j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f228k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ pb.f f229l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(pa.d dVar, boolean z10, pb.f fVar, zc.f fVar2) {
            super(2, fVar2);
            this.f227j = dVar;
            this.f228k = z10;
            this.f229l = fVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new a(this.f227j, this.f228k, this.f229l, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f225h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k kVar = k.this;
            pa.d dVar = this.f227j;
            this.f225h = 1;
            obj = kVar.n(dVar, this);
            if (obj == objF) {
                return objF;
            }
            View view = (View) obj;
            if (view != null) {
                pa.d dVar2 = this.f227j;
                boolean z10 = this.f228k;
                k kVar2 = k.this;
                pb.f fVar = this.f229l;
                ab.b bVarA = ab.e.a(dVar2.g(), z10);
                boolean zH = dVar2.h();
                this.f225h = 2;
                if (kVar2.k(view, bVarA, fVar, zH, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f230h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pa.e f232j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ pb.f f233k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(pa.e eVar, pb.f fVar, zc.f fVar2) {
            super(2, fVar2);
            this.f232j = eVar;
            this.f233k = fVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new b(this.f232j, this.f233k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f230h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k kVar = k.this;
            pa.e eVar = this.f232j;
            this.f230h = 1;
            obj = kVar.o(eVar, this);
            if (obj == objF) {
                return objF;
            }
            View view = (View) obj;
            if (view != null) {
                pa.e eVar2 = this.f232j;
                k kVar2 = k.this;
                pb.f fVar = this.f233k;
                ab.b bVarB = ab.e.b(eVar2.e());
                this.f230h = 2;
                if (kVar2.k(view, bVarB, fVar, true, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f234h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f235i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f236j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f237k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f239m;

        c(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f237k = obj;
            this.f239m |= Integer.MIN_VALUE;
            return k.this.k(null, null, null, false, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f240h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pa.d f242j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ pb.f f243k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f244l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Runnable f245m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Runnable f246n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(pa.d dVar, pb.f fVar, boolean z10, Runnable runnable, Runnable runnable2, zc.f fVar2) {
            super(2, fVar2);
            this.f242j = dVar;
            this.f243k = fVar;
            this.f244l = z10;
            this.f245m = runnable;
            this.f246n = runnable2;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new d(this.f242j, this.f243k, this.f244l, this.f245m, this.f246n, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f240h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k kVar = k.this;
            pa.d dVar = this.f242j;
            this.f240h = 1;
            obj = kVar.n(dVar, this);
            if (obj == objF) {
                return objF;
            }
            View view = (View) obj;
            if (view != null) {
                k kVar2 = k.this;
                pb.f fVar = this.f243k;
                boolean z10 = this.f244l;
                pa.d dVar2 = this.f242j;
                Runnable runnable = this.f245m;
                Runnable runnable2 = this.f246n;
                boolean zH = dVar2.h();
                this.f240h = 2;
                if (kVar2.l(view, fVar, z10, zH, runnable, runnable2, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f247h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pa.e f249j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ pb.f f250k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f251l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Runnable f252m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Runnable f253n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(pa.e eVar, pb.f fVar, boolean z10, Runnable runnable, Runnable runnable2, zc.f fVar2) {
            super(2, fVar2);
            this.f249j = eVar;
            this.f250k = fVar;
            this.f251l = z10;
            this.f252m = runnable;
            this.f253n = runnable2;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new e(this.f249j, this.f250k, this.f251l, this.f252m, this.f253n, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f247h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k kVar = k.this;
            pa.e eVar = this.f249j;
            this.f247h = 1;
            obj = kVar.o(eVar, this);
            if (obj == objF) {
                return objF;
            }
            View view = (View) obj;
            if (view != null) {
                k kVar2 = k.this;
                pb.f fVar = this.f250k;
                boolean z10 = this.f251l;
                Runnable runnable = this.f252m;
                Runnable runnable2 = this.f253n;
                this.f247h = 2;
                if (kVar2.l(view, fVar, z10, true, runnable, runnable2, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f254h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f255i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f256j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f257k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f258l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f259m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f260n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f262p;

        f(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f260n = obj;
            this.f262p |= Integer.MIN_VALUE;
            return k.this.l(null, null, false, false, null, null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f263h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ View f264i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(View view, zc.f fVar) {
            super(2, fVar);
            this.f264i = view;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((g) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new g(this.f264i, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f263h;
            if (i10 == 0) {
                s.b(obj);
                View view = this.f264i;
                this.f263h = 1;
                obj = i0.g(view, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return obj;
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f265h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ pa.d f266i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(pa.d dVar, zc.f fVar) {
            super(2, fVar);
            this.f266i = dVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new h(this.f266i, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f265h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return this.f266i.o();
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ pa.e f268i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(pa.e eVar, zc.f fVar) {
            super(2, fVar);
            this.f268i = eVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((i) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new i(this.f268i, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f267h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return this.f268i.f();
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f269h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pa.d f271j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ pb.f f272k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f273l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Runnable f274m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Runnable f275n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(pa.d dVar, pb.f fVar, boolean z10, Runnable runnable, Runnable runnable2, zc.f fVar2) {
            super(2, fVar2);
            this.f271j = dVar;
            this.f272k = fVar;
            this.f273l = z10;
            this.f274m = runnable;
            this.f275n = runnable2;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((j) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new j(this.f271j, this.f272k, this.f273l, this.f274m, this.f275n, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f269h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k kVar = k.this;
            pa.d dVar = this.f271j;
            this.f269h = 1;
            obj = kVar.n(dVar, this);
            if (obj == objF) {
                return objF;
            }
            View view = (View) obj;
            if (view != null) {
                k kVar2 = k.this;
                pb.f fVar = this.f272k;
                boolean z10 = this.f273l;
                pa.d dVar2 = this.f271j;
                Runnable runnable = this.f274m;
                Runnable runnable2 = this.f275n;
                boolean zH = dVar2.h();
                this.f269h = 2;
                if (kVar2.q(view, fVar, z10, zH, runnable, runnable2, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: renamed from: ab.k$k, reason: collision with other inner class name */
    static final class C0004k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f277i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f278j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f279k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f280l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f281m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f282n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f284p;

        C0004k(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f282n = obj;
            this.f284p |= Integer.MIN_VALUE;
            return k.this.q(null, null, false, false, null, null, this);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f285h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pa.d f287j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(pa.d dVar, zc.f fVar) {
            super(2, fVar);
            this.f287j = dVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((l) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new l(this.f287j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f285h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k kVar = k.this;
            pa.d dVar = this.f287j;
            this.f285h = 1;
            obj = kVar.n(dVar, this);
            if (obj == objF) {
                return objF;
            }
            View view = (View) obj;
            if (view != null) {
                k kVar2 = k.this;
                this.f285h = 2;
                if (kVar2.r(view, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f288h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pa.e f290j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(pa.e eVar, zc.f fVar) {
            super(2, fVar);
            this.f290j = eVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((m) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new m(this.f290j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f288h;
            if (i10 != 0) {
                if (i10 == 1) {
                    s.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return g0.f27756a;
            }
            s.b(obj);
            k kVar = k.this;
            pa.e eVar = this.f290j;
            this.f288h = 1;
            obj = kVar.o(eVar, this);
            if (obj == objF) {
                return objF;
            }
            View view = (View) obj;
            if (view != null) {
                k kVar2 = k.this;
                this.f288h = 2;
                if (kVar2.r(view, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f291h;

        n(zc.f fVar) {
            super(2, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((n) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return k.this.new n(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f291h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Iterator it = k.this.f224c.entrySet().iterator();
            while (it.hasNext()) {
                ((ab.b) ((Map.Entry) it.next()).getValue()).b();
            }
            k.this.f224c.clear();
            return g0.f27756a;
        }
    }

    public k(o0 coroutineScope, pa.h coroutineDispatchers) {
        t.f(coroutineScope, "coroutineScope");
        t.f(coroutineDispatchers, "coroutineDispatchers");
        this.f222a = coroutineScope;
        this.f223b = coroutineDispatchers;
        this.f224c = new ConcurrentHashMap();
    }

    private final Object m(View view, zc.f fVar) {
        return ud.i.g(this.f223b.i(), new g(view, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(pa.d dVar, zc.f fVar) {
        return ud.i.g(this.f223b.i(), new h(dVar, null), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(pa.e eVar, zc.f fVar) {
        return ud.i.g(this.f223b.i(), new i(eVar, null), fVar);
    }

    @Override // ab.c
    public boolean a(int i10) {
        ab.b bVar = (ab.b) this.f224c.get(Integer.valueOf(i10));
        return bVar != null && bVar.g();
    }

    @Override // ab.c
    public void b(pa.d adElement, boolean z10, pb.f eventType) {
        t.f(adElement, "adElement");
        t.f(eventType, "eventType");
        ud.k.d(this.f222a, this.f223b.h(), null, new a(adElement, z10, eventType, null), 2, null);
    }

    @Override // ab.c
    public void c(pa.d adElement) {
        t.f(adElement, "adElement");
        ud.k.d(this.f222a, this.f223b.h(), null, new l(adElement, null), 2, null);
    }

    @Override // ab.c
    public void d(pa.e adPhase) {
        t.f(adPhase, "adPhase");
        ud.k.d(this.f222a, this.f223b.h(), null, new m(adPhase, null), 2, null);
    }

    @Override // ab.c
    public void e(pa.e adPhase, pb.f eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        t.f(adPhase, "adPhase");
        t.f(eventType, "eventType");
        ud.k.d(this.f222a, this.f223b.i(), null, new e(adPhase, eventType, z10, runnable, runnable2, null), 2, null);
    }

    @Override // ab.c
    public void g(pa.d adElement, pb.f eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        t.f(adElement, "adElement");
        t.f(eventType, "eventType");
        ud.k.d(this.f222a, this.f223b.h(), null, new j(adElement, eventType, z10, runnable, runnable2, null), 2, null);
    }

    @Override // ab.c
    public void h(pa.d adElement, pb.f eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        t.f(adElement, "adElement");
        t.f(eventType, "eventType");
        ud.k.d(this.f222a, this.f223b.h(), null, new d(adElement, eventType, z10, runnable, runnable2, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(View view, ab.b bVar, pb.f fVar, boolean z10, zc.f fVar2) throws Throwable {
        c cVar;
        if (fVar2 instanceof c) {
            cVar = (c) fVar2;
            int i10 = cVar.f239m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f239m = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar2);
            }
        } else {
            cVar = new c(fVar2);
        }
        Object obj = cVar.f237k;
        Object objF = ad.d.f();
        int i11 = cVar.f239m;
        if (i11 == 0) {
            s.b(obj);
            this.f224c.put(kotlin.coroutines.jvm.internal.b.c(view.getId()), bVar);
            if (z10) {
                cVar.f234h = view;
                cVar.f235i = bVar;
                cVar.f236j = fVar;
                cVar.f239m = 1;
                if (m(view, cVar) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (pb.f) cVar.f236j;
            bVar = (ab.b) cVar.f235i;
            view = (View) cVar.f234h;
            s.b(obj);
        }
        bVar.e(view, fVar);
        return g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(View view, pb.f fVar, boolean z10, boolean z11, Runnable runnable, Runnable runnable2, zc.f fVar2) throws Throwable {
        f fVar3;
        View view2;
        pb.f fVar4;
        boolean z12;
        Runnable runnable3;
        Runnable runnable4;
        ab.b bVar;
        if (fVar2 instanceof f) {
            fVar3 = (f) fVar2;
            int i10 = fVar3.f262p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar3.f262p = i10 - Integer.MIN_VALUE;
            } else {
                fVar3 = new f(fVar2);
            }
        } else {
            fVar3 = new f(fVar2);
        }
        Object obj = fVar3.f260n;
        Object objF = ad.d.f();
        int i11 = fVar3.f262p;
        if (i11 == 0) {
            s.b(obj);
            ab.b bVar2 = (ab.b) this.f224c.get(kotlin.coroutines.jvm.internal.b.c(view.getId()));
            if (bVar2 == null) {
                if (runnable != null) {
                    runnable.run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
            } else {
                if (z11) {
                    fVar3.f254h = view;
                    fVar3.f255i = fVar;
                    fVar3.f256j = runnable;
                    fVar3.f257k = runnable2;
                    fVar3.f258l = bVar2;
                    fVar3.f259m = z10;
                    fVar3.f262p = 1;
                    if (m(view, fVar3) == objF) {
                        return objF;
                    }
                }
                view2 = view;
                fVar4 = fVar;
                z12 = z10;
                runnable3 = runnable;
                runnable4 = runnable2;
                bVar = bVar2;
            }
            return g0.f27756a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z13 = fVar3.f259m;
        ab.b bVar3 = (ab.b) fVar3.f258l;
        Runnable runnable5 = (Runnable) fVar3.f257k;
        Runnable runnable6 = (Runnable) fVar3.f256j;
        pb.f fVar5 = (pb.f) fVar3.f255i;
        View view3 = (View) fVar3.f254h;
        s.b(obj);
        bVar = bVar3;
        fVar4 = fVar5;
        z12 = z13;
        view2 = view3;
        runnable3 = runnable6;
        runnable4 = runnable5;
        bVar.f(view2, fVar4, runnable3, runnable4, z12);
        return g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(View view, pb.f fVar, boolean z10, boolean z11, Runnable runnable, Runnable runnable2, zc.f fVar2) throws Throwable {
        C0004k c0004k;
        View view2;
        pb.f fVar3;
        boolean z12;
        Runnable runnable3;
        Runnable runnable4;
        ab.b bVar;
        if (fVar2 instanceof C0004k) {
            c0004k = (C0004k) fVar2;
            int i10 = c0004k.f284p;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0004k.f284p = i10 - Integer.MIN_VALUE;
            } else {
                c0004k = new C0004k(fVar2);
            }
        } else {
            c0004k = new C0004k(fVar2);
        }
        Object obj = c0004k.f282n;
        Object objF = ad.d.f();
        int i11 = c0004k.f284p;
        if (i11 == 0) {
            s.b(obj);
            ab.b bVar2 = (ab.b) this.f224c.get(kotlin.coroutines.jvm.internal.b.c(view.getId()));
            if (bVar2 == null) {
                if (runnable != null) {
                    runnable.run();
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
            } else {
                if (z11) {
                    c0004k.f276h = view;
                    c0004k.f277i = fVar;
                    c0004k.f278j = runnable;
                    c0004k.f279k = runnable2;
                    c0004k.f280l = bVar2;
                    c0004k.f281m = z10;
                    c0004k.f284p = 1;
                    if (m(view, c0004k) == objF) {
                        return objF;
                    }
                }
                view2 = view;
                fVar3 = fVar;
                z12 = z10;
                runnable3 = runnable;
                runnable4 = runnable2;
                bVar = bVar2;
            }
            return g0.f27756a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z13 = c0004k.f281m;
        ab.b bVar3 = (ab.b) c0004k.f280l;
        Runnable runnable5 = (Runnable) c0004k.f279k;
        Runnable runnable6 = (Runnable) c0004k.f278j;
        pb.f fVar4 = (pb.f) c0004k.f277i;
        View view3 = (View) c0004k.f276h;
        s.b(obj);
        bVar = bVar3;
        fVar3 = fVar4;
        z12 = z13;
        view2 = view3;
        runnable3 = runnable6;
        runnable4 = runnable5;
        bVar.e(view2, fVar3);
        bVar.f(view2, fVar3, runnable3, runnable4, z12);
        return g0.f27756a;
    }

    public Object r(View view, zc.f fVar) {
        ab.b bVar = (ab.b) this.f224c.remove(kotlin.coroutines.jvm.internal.b.c(view.getId()));
        if (bVar != null) {
            bVar.b();
        }
        return g0.f27756a;
    }

    @Override // ab.c
    public void a(pa.e adPhase, pb.f eventType) {
        t.f(adPhase, "adPhase");
        t.f(eventType, "eventType");
        ud.k.d(this.f222a, this.f223b.h(), null, new b(adPhase, eventType, null), 2, null);
    }

    @Override // ab.c
    public void a() {
        ud.k.d(this.f222a, this.f223b.h(), null, new n(null), 2, null);
    }
}

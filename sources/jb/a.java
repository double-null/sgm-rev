package jb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import pb.b0;
import pb.j1;
import pb.r0;
import ud.k0;
import ud.o0;
import wb.d0;
import wb.e0;
import wc.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements la.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final id.a f20749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f20750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pa.h f20751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wc.k f20752d;

    /* JADX INFO: renamed from: jb.a$a, reason: collision with other inner class name */
    static final class C0339a extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20753h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f20755j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0339a(Object obj, zc.f fVar) {
            super(2, fVar);
            this.f20755j = obj;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((C0339a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new C0339a(this.f20755j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f20753h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            xb.a aVarW = a.this.w();
            if (aVarW != null) {
                aVarW.J(this.f20755j);
            }
            return g0.f27756a;
        }
    }

    public static abstract class b implements qb.c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final la.g.a f20756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f20757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final pa.h f20758c;

        /* JADX INFO: renamed from: jb.a$b$a, reason: collision with other inner class name */
        static final class C0340a extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f20759h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ b0 f20761j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0340a(b0 b0Var, zc.f fVar) {
                super(2, fVar);
                this.f20761j = b0Var;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((C0340a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return b.this.new C0340a(this.f20761j, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f20759h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                b.this.f20756a.a(this.f20761j);
                return g0.f27756a;
            }
        }

        /* JADX INFO: renamed from: jb.a$b$b, reason: collision with other inner class name */
        static final class C0341b extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f20762h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Object f20764j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0341b(Object obj, zc.f fVar) {
                super(2, fVar);
                this.f20764j = obj;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((C0341b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return b.this.new C0341b(this.f20764j, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f20762h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                b.this.f20756a.onSuccess(this.f20764j);
                return g0.f27756a;
            }
        }

        public b(la.g.a resultCallback, o0 coroutineScope, pa.h coroutineDispatchers) {
            kotlin.jvm.internal.t.f(resultCallback, "resultCallback");
            kotlin.jvm.internal.t.f(coroutineScope, "coroutineScope");
            kotlin.jvm.internal.t.f(coroutineDispatchers, "coroutineDispatchers");
            this.f20756a = resultCallback;
            this.f20757b = coroutineScope;
            this.f20758c = coroutineDispatchers;
        }

        @Override // qb.c.d
        public void a(b0 error) {
            kotlin.jvm.internal.t.f(error, "error");
            ud.k.d(this.f20757b, this.f20758c.h(), null, new C0340a(error, null), 2, null);
        }

        public abstract b0 c();

        @Override // qb.c.d
        public void onSuccess(Object obj) {
            if (obj != null) {
                ud.k.d(this.f20757b, this.f20758c.h(), null, new C0341b(obj, null), 2, null);
            } else {
                a(c());
            }
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20765a;

        static {
            int[] iArr = new int[r0.b.values().length];
            try {
                iArr[r0.b.PRELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r0.b.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20765a = iArr;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ la.g.a f20767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ b0 f20768j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(la.g.a aVar, b0 b0Var, zc.f fVar) {
            super(2, fVar);
            this.f20767i = aVar;
            this.f20768j = b0Var;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((d) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new d(this.f20767i, this.f20768j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f20766h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            this.f20767i.a(this.f20768j);
            return g0.f27756a;
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20769h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ la.g.a f20770i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f20771j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(la.g.a aVar, Object obj, zc.f fVar) {
            super(2, fVar);
            this.f20770i = aVar;
            this.f20771j = obj;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((e) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new e(this.f20770i, this.f20771j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f20769h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            this.f20770i.onSuccess(this.f20771j);
            return g0.f27756a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20772h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r0 f20774j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f20775k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ la.g.a f20776l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(r0 r0Var, Object obj, la.g.a aVar, zc.f fVar) {
            super(2, fVar);
            this.f20774j = r0Var;
            this.f20775k = obj;
            this.f20776l = aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new f(this.f20774j, this.f20775k, this.f20776l, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objZ;
            Object objF = ad.d.f();
            int i10 = this.f20772h;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                    objZ = ((wc.r) obj).p();
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return g0.f27756a;
            }
            wc.s.b(obj);
            a aVar = a.this;
            r0 r0Var = this.f20774j;
            Object obj2 = this.f20775k;
            this.f20772h = 1;
            objZ = aVar.z(r0Var, obj2, this);
            if (objZ == objF) {
                return objF;
            }
            Bitmap bitmap = (Bitmap) (wc.r.k(objZ) ? null : objZ);
            if (bitmap != null) {
                a aVar2 = a.this;
                la.g.a aVar3 = this.f20776l;
                this.f20772h = 2;
                if (aVar2.n(aVar3, bitmap, this) == objF) {
                    return objF;
                }
            } else {
                a aVar4 = a.this;
                la.g.a aVar5 = this.f20776l;
                b0.a aVar6 = b0.f23943b;
                Throwable thG = wc.r.g(objZ);
                if (thG == null) {
                    thG = a.this.h();
                }
                b0 b0VarA = aVar6.a(thG);
                this.f20772h = 3;
                if (aVar4.o(aVar5, b0VarA, this) == objF) {
                    return objF;
                }
            }
            return g0.f27756a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20777h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20779j;

        g(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20777h = obj;
            this.f20779j |= Integer.MIN_VALUE;
            Object objZ = a.this.z(null, null, this);
            return objZ == ad.d.f() ? objZ : wc.r.b(objZ);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r0 f20781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f20782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f20783k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(r0 r0Var, a aVar, Object obj, zc.f fVar) {
            super(2, fVar);
            this.f20781i = r0Var;
            this.f20782j = aVar;
            this.f20783k = obj;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((h) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new h(this.f20781i, this.f20782j, this.f20783k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objP;
            Object objF = ad.d.f();
            int i10 = this.f20780h;
            if (i10 == 0) {
                wc.s.b(obj);
                BitmapFactory.Options optionsA = wb.j.a();
                optionsA.inJustDecodeBounds = false;
                r0 r0Var = this.f20781i;
                if (r0Var instanceof j1) {
                    Object obj2 = this.f20783k;
                    this.f20780h = 1;
                    objP = this.f20782j.r((j1) r0Var, obj2, optionsA, this);
                    if (objP == objF) {
                        return objF;
                    }
                } else {
                    if (!(r0Var instanceof pb.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f20780h = 2;
                    objP = this.f20782j.p((pb.m) r0Var, optionsA, this);
                    if (objP == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                objP = ((wc.r) obj).p();
            }
            return wc.r.b(objP);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20784h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20786j;

        i(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20784h = obj;
            this.f20786j |= Integer.MIN_VALUE;
            Object objT = a.this.t(null, this);
            return objT == ad.d.f() ? objT : wc.r.b(objT);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20787h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ j1 f20789j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(j1 j1Var, zc.f fVar) {
            super(2, fVar);
            this.f20789j = j1Var;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((j) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new j(this.f20789j, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objU;
            Object objF = ad.d.f();
            int i10 = this.f20787h;
            if (i10 == 0) {
                wc.s.b(obj);
                xb.a aVarW = a.this.w();
                if (aVarW == null) {
                    wc.r.a aVar = wc.r.f27774b;
                    objU = wc.r.c(wc.s.a(new IllegalStateException("`MediaFileCacheManager` not found, check initialization")));
                } else {
                    List<String> listB = this.f20789j.b();
                    this.f20787h = 1;
                    objU = aVarW.u(listB, this);
                    if (objU == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                objU = ((wc.r) obj).p();
            }
            return wc.r.b(objU);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20790h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20792j;

        k(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20790h = obj;
            this.f20792j |= Integer.MIN_VALUE;
            Object objP = a.this.p(null, null, this);
            return objP == ad.d.f() ? objP : wc.r.b(objP);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20793h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pb.m f20795j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f20796k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(pb.m mVar, BitmapFactory.Options options, zc.f fVar) {
            super(2, fVar);
            this.f20795j = mVar;
            this.f20796k = options;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((l) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new l(this.f20795j, this.f20796k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            ad.d.f();
            if (this.f20793h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            Bitmap bitmapG = a.this.g(this.f20795j.b(), this.f20796k);
            if (bitmapG != null) {
                objC = wc.r.c(bitmapG);
            } else {
                wc.r.a aVar = wc.r.f27774b;
                objC = wc.r.c(wc.s.a(new Exception("Can't decode image from base64")));
            }
            return wc.r.b(objC);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20797h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20799j;

        m(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20797h = obj;
            this.f20799j |= Integer.MIN_VALUE;
            Object objR = a.this.r(null, null, null, this);
            return objR == ad.d.f() ? objR : wc.r.b(objR);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f20800h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f20801i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20802j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ j1 f20804l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Object f20805m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f20806n;

        /* JADX INFO: renamed from: jb.a$n$a, reason: collision with other inner class name */
        static final class C0342a extends kotlin.coroutines.jvm.internal.l implements id.p {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f20807h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ File f20808i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ BitmapFactory.Options f20809j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0342a(File file, BitmapFactory.Options options, zc.f fVar) {
                super(2, fVar);
                this.f20808i = file;
                this.f20809j = options;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, zc.f fVar) {
                return ((C0342a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zc.f create(Object obj, zc.f fVar) {
                return new C0342a(this.f20808i, this.f20809j, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f20807h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                File file = this.f20808i;
                if (file != null) {
                    return wb.k.f(file, this.f20809j);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(j1 j1Var, Object obj, BitmapFactory.Options options, zc.f fVar) {
            super(2, fVar);
            this.f20804l = j1Var;
            this.f20805m = obj;
            this.f20806n = options;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((n) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new n(this.f20804l, this.f20805m, this.f20806n, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x007f  */
        /* JADX WARN: Code duplicated, block: B:30:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objT;
            Object obj2;
            File file;
            Throwable thG;
            Object objC;
            Object objF = ad.d.f();
            int i10 = this.f20802j;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                    objT = ((wc.r) obj).p();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = (File) this.f20801i;
                    obj2 = this.f20800h;
                    wc.s.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                if (file != null || bitmap == null) {
                    thG = wc.r.g(obj2);
                    if (thG == null) {
                        thG = a.this.h();
                    }
                    objC = wc.r.c(wc.s.a(thG));
                } else {
                    xb.a aVarW = a.this.w();
                    if (aVarW != null) {
                        aVarW.B(file, this.f20805m);
                    }
                    objC = wc.r.c(bitmap);
                }
                return wc.r.b(objC);
            }
            wc.s.b(obj);
            a aVar = a.this;
            j1 j1Var = this.f20804l;
            this.f20802j = 1;
            objT = aVar.t(j1Var, this);
            if (objT == objF) {
                return objF;
            }
            obj2 = objT;
            File file2 = (File) (wc.r.k(obj2) ? null : obj2);
            k0 k0VarD = a.this.f20751c.d();
            C0342a c0342a = new C0342a(file2, this.f20806n, null);
            this.f20800h = obj2;
            this.f20801i = file2;
            this.f20802j = 2;
            Object objG = ud.i.g(k0VarD, c0342a, this);
            if (objG == objF) {
                return objF;
            }
            file = file2;
            obj = objG;
            Bitmap bitmap2 = (Bitmap) obj;
            if (file != null) {
                thG = wc.r.g(obj2);
                if (thG == null) {
                    thG = a.this.h();
                }
                objC = wc.r.c(wc.s.a(thG));
            } else {
                thG = wc.r.g(obj2);
                if (thG == null) {
                    thG = a.this.h();
                }
                objC = wc.r.c(wc.s.a(thG));
            }
            return wc.r.b(objC);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20810h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20812j;

        o(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20810h = obj;
            this.f20812j |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, null, this);
            return objA == ad.d.f() ? objA : wc.r.b(objA);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20813h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ j1 f20815j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f20816k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(j1 j1Var, Object obj, zc.f fVar) {
            super(2, fVar);
            this.f20815j = j1Var;
            this.f20816k = obj;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((p) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new p(this.f20815j, this.f20816k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objT;
            Object objC;
            Object objF = ad.d.f();
            int i10 = this.f20813h;
            if (i10 == 0) {
                wc.s.b(obj);
                a aVar = a.this;
                j1 j1Var = this.f20815j;
                this.f20813h = 1;
                objT = aVar.t(j1Var, this);
                if (objT == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                objT = ((wc.r) obj).p();
            }
            File file = (File) (wc.r.k(objT) ? null : objT);
            if (file != null) {
                xb.a aVarW = a.this.w();
                if (aVarW != null) {
                    aVarW.B(file, this.f20816k);
                }
                objC = wc.r.c(ac.b.k(file));
            } else {
                Throwable thG = wc.r.g(objT);
                if (thG == null) {
                    thG = a.this.h();
                }
                objC = wc.r.c(wc.s.a(thG));
            }
            return wc.r.b(objC);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20817h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r0 f20819j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ la.g.a f20820k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(r0 r0Var, la.g.a aVar, zc.f fVar) {
            super(2, fVar);
            this.f20819j = r0Var;
            this.f20820k = aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((q) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new q(this.f20819j, this.f20820k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f20817h;
            if (i10 == 0) {
                wc.s.b(obj);
                a aVar = a.this;
                r0 r0Var = this.f20819j;
                la.g.a aVar2 = this.f20820k;
                this.f20817h = 1;
                if (aVar.q(r0Var, aVar2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20821h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r0 f20822i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f20823j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ la.g.a f20824k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(r0 r0Var, a aVar, la.g.a aVar2, zc.f fVar) {
            super(2, fVar);
            this.f20822i = r0Var;
            this.f20823j = aVar;
            this.f20824k = aVar2;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((r) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new r(this.f20822i, this.f20823j, this.f20824k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = ad.d.f();
            int i10 = this.f20821h;
            if (i10 == 0) {
                wc.s.b(obj);
                r0 r0Var = this.f20822i;
                if (r0Var instanceof j1) {
                    this.f20823j.u((String) kotlin.collections.b0.O(((j1) r0Var).b()), new qb.c.h(), this.f20824k, new b0("Uri is null"));
                } else if (r0Var instanceof pb.m) {
                    String strG = d0.g(((pb.m) r0Var).b(), 0, 2, null);
                    if (strG != null) {
                        a aVar = this.f20823j;
                        la.g.a aVar2 = this.f20824k;
                        this.f20821h = 1;
                        if (aVar.n(aVar2, strG, this) == objF) {
                            return objF;
                        }
                    } else {
                        a aVar3 = this.f20823j;
                        la.g.a aVar4 = this.f20824k;
                        b0 b0Var = new b0("Can't decode string from base64");
                        this.f20821h = 2;
                        if (aVar3.o(aVar4, b0Var, this) == objF) {
                            return objF;
                        }
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
            }
            return g0.f27756a;
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20825h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ r0 f20827j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f20828k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ la.g.a f20829l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(r0 r0Var, Object obj, la.g.a aVar, zc.f fVar) {
            super(2, fVar);
            this.f20827j = r0Var;
            this.f20828k = obj;
            this.f20829l = aVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((s) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new s(this.f20827j, this.f20828k, this.f20829l, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF;
            Object objF2 = ad.d.f();
            int i10 = this.f20825h;
            if (i10 != 0) {
                if (i10 == 1) {
                    wc.s.b(obj);
                    objF = ((wc.r) obj).p();
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wc.s.b(obj);
                }
                return g0.f27756a;
            }
            wc.s.b(obj);
            a aVar = a.this;
            r0 r0Var = this.f20827j;
            Object obj2 = this.f20828k;
            this.f20825h = 1;
            objF = aVar.f(r0Var, obj2, this);
            if (objF == objF2) {
                return objF2;
            }
            Uri uri = (Uri) (wc.r.k(objF) ? null : objF);
            if (uri != null) {
                a aVar2 = a.this;
                la.g.a aVar3 = this.f20829l;
                this.f20825h = 2;
                if (aVar2.n(aVar3, uri, this) == objF2) {
                    return objF2;
                }
            } else {
                a aVar4 = a.this;
                la.g.a aVar5 = this.f20829l;
                b0.a aVar6 = b0.f23943b;
                Throwable thG = wc.r.g(objF);
                if (thG == null) {
                    thG = a.this.h();
                }
                b0 b0VarA = aVar6.a(thG);
                this.f20825h = 3;
                if (aVar4.o(aVar5, b0VarA, this) == objF2) {
                    return objF2;
                }
            }
            return g0.f27756a;
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20830h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20832j;

        t(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20830h = obj;
            this.f20832j |= Integer.MIN_VALUE;
            Object objF = a.this.f(null, null, this);
            return objF == ad.d.f() ? objF : wc.r.b(objF);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20833h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ r0 f20834i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f20835j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f20836k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(r0 r0Var, a aVar, Object obj, zc.f fVar) {
            super(2, fVar);
            this.f20834i = r0Var;
            this.f20835j = aVar;
            this.f20836k = obj;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((u) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return new u(this.f20834i, this.f20835j, this.f20836k, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            Object objF = ad.d.f();
            int i10 = this.f20833h;
            if (i10 == 0) {
                wc.s.b(obj);
                r0 r0Var = this.f20834i;
                if (r0Var instanceof j1) {
                    Object obj2 = this.f20836k;
                    this.f20833h = 1;
                    objC = this.f20835j.s((j1) r0Var, obj2, this);
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    wc.r.a aVar = wc.r.f27774b;
                    objC = wc.r.c(wc.s.a(new Exception("Unsupported media source type: " + this.f20834i)));
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.s.b(obj);
                objC = ((wc.r) obj).p();
            }
            return wc.r.b(objC);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20837h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20839j;

        v(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20837h = obj;
            this.f20839j |= Integer.MIN_VALUE;
            Object objK = a.this.k(null, null, this);
            return objK == ad.d.f() ? objK : wc.r.b(objK);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.l implements id.p {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f20840h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f20841i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ List f20843k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Object f20844l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(List list, Object obj, zc.f fVar) {
            super(2, fVar);
            this.f20843k = list;
            this.f20844l = obj;
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f fVar) {
            return ((w) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f create(Object obj, zc.f fVar) {
            return a.this.new w(this.f20843k, this.f20844l, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            xb.a aVar;
            Object objP;
            Object objC;
            Object objF = ad.d.f();
            int i10 = this.f20841i;
            if (i10 == 0) {
                wc.s.b(obj);
                xb.a aVarW = a.this.w();
                if (aVarW == null) {
                    wc.r.a aVar2 = wc.r.f27774b;
                    return wc.r.b(wc.r.c(wc.s.a(new Exception("`MediaFileCacheManager` not found, check initialization"))));
                }
                List<String> list = this.f20843k;
                this.f20840h = aVarW;
                this.f20841i = 1;
                Object objU = aVarW.u(list, this);
                if (objU == objF) {
                    return objF;
                }
                aVar = aVarW;
                objP = objU;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (xb.a) this.f20840h;
                wc.s.b(obj);
                objP = ((wc.r) obj).p();
            }
            File file = (File) (wc.r.k(objP) ? null : objP);
            Uri uriL = file != null ? ac.b.l(file) : null;
            if (uriL != null) {
                aVar.B(file, this.f20844l);
                objC = wc.r.c(uriL);
            } else {
                Throwable thG = wc.r.g(objP);
                if (thG == null) {
                    thG = a.this.h();
                }
                objC = wc.r.c(wc.s.a(thG));
            }
            return wc.r.b(objC);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20845h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f20847j;

        x(zc.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f20845h = obj;
            this.f20847j |= Integer.MIN_VALUE;
            Object objS = a.this.s(null, null, this);
            return objS == ad.d.f() ? objS : wc.r.b(objS);
        }
    }

    static final class y extends kotlin.jvm.internal.u implements id.a {
        y() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final xb.a invoke() {
            return (xb.a) a.this.f20749a.invoke();
        }
    }

    public static final class z extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f20849d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(la.g.a aVar, b0 b0Var, o0 o0Var, pa.h hVar) {
            super(aVar, o0Var, hVar);
            this.f20849d = b0Var;
        }

        @Override // jb.a.b
        public b0 c() {
            return this.f20849d;
        }
    }

    public a(id.a mediaFileCacheManagerProvider, o0 coroutineScope, pa.h coroutineDispatchers) {
        kotlin.jvm.internal.t.f(mediaFileCacheManagerProvider, "mediaFileCacheManagerProvider");
        kotlin.jvm.internal.t.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.t.f(coroutineDispatchers, "coroutineDispatchers");
        this.f20749a = mediaFileCacheManagerProvider;
        this.f20750b = coroutineScope;
        this.f20751c = coroutineDispatchers;
        this.f20752d = wc.m.a(new y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Exception h() {
        return new Exception("Unknown error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(la.g.a aVar, Object obj, zc.f fVar) {
        Object objG = ud.i.g(this.f20751c.h(), new e(aVar, obj, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(la.g.a aVar, b0 b0Var, zc.f fVar) {
        Object objG = ud.i.g(this.f20751c.h(), new d(aVar, b0Var, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xb.a w() {
        return (xb.a) this.f20752d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la.g
    public Object a(j1 j1Var, Object obj, zc.f fVar) throws Throwable {
        o oVar;
        if (fVar instanceof o) {
            oVar = (o) fVar;
            int i10 = oVar.f20812j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f20812j = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(fVar);
            }
        } else {
            oVar = new o(fVar);
        }
        Object objG = oVar.f20810h;
        Object objF = ad.d.f();
        int i11 = oVar.f20812j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarF = this.f20751c.f();
            p pVar = new p(j1Var, obj, null);
            oVar.f20812j = 1;
            objG = ud.i.g(k0VarF, pVar, oVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    @Override // la.g
    public void b(r0 mediaSource, Object mediaSourceHolder, la.g.a resultCallback) {
        kotlin.jvm.internal.t.f(mediaSource, "mediaSource");
        kotlin.jvm.internal.t.f(mediaSourceHolder, "mediaSourceHolder");
        kotlin.jvm.internal.t.f(resultCallback, "resultCallback");
        ud.k.d(this.f20750b, null, null, new s(mediaSource, mediaSourceHolder, resultCallback, null), 3, null);
    }

    @Override // la.g
    public void c(r0 mediaSource, Object mediaSourceHolder, la.g.a resultCallback) {
        kotlin.jvm.internal.t.f(mediaSource, "mediaSource");
        kotlin.jvm.internal.t.f(mediaSourceHolder, "mediaSourceHolder");
        kotlin.jvm.internal.t.f(resultCallback, "resultCallback");
        ud.k.d(this.f20750b, null, null, new q(mediaSource, resultCallback, null), 3, null);
    }

    @Override // la.g
    public void d(r0 mediaSource, Object mediaSourceHolder, la.g.a resultCallback) {
        kotlin.jvm.internal.t.f(mediaSource, "mediaSource");
        kotlin.jvm.internal.t.f(mediaSourceHolder, "mediaSourceHolder");
        kotlin.jvm.internal.t.f(resultCallback, "resultCallback");
        ud.k.d(this.f20750b, null, null, new f(mediaSource, mediaSourceHolder, resultCallback, null), 3, null);
    }

    @Override // la.g
    public void e(Object mediaSourceHolder) {
        kotlin.jvm.internal.t.f(mediaSourceHolder, "mediaSourceHolder");
        ud.k.d(this.f20750b, null, null, new C0339a(mediaSourceHolder, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // la.g
    public Object f(r0 r0Var, Object obj, zc.f fVar) throws Throwable {
        t tVar;
        if (fVar instanceof t) {
            tVar = (t) fVar;
            int i10 = tVar.f20832j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f20832j = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(fVar);
            }
        } else {
            tVar = new t(fVar);
        }
        Object objG = tVar.f20830h;
        Object objF = ad.d.f();
        int i11 = tVar.f20832j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarF = this.f20751c.f();
            u uVar = new u(r0Var, this, obj, null);
            tVar.f20832j = 1;
            objG = ud.i.g(k0VarF, uVar, tVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    public final Bitmap g(String base64, BitmapFactory.Options options) {
        kotlin.jvm.internal.t.f(base64, "base64");
        kotlin.jvm.internal.t.f(options, "options");
        byte[] bArrG = e0.g(base64, 0, 1, null);
        if (bArrG != null) {
            return wb.j.b(bArrG, options);
        }
        return null;
    }

    public final Object j(String url) {
        kotlin.jvm.internal.t.f(url, "url");
        try {
            wc.r.a aVar = wc.r.f27774b;
            Uri uriO = d0.o(url);
            if (uriO != null) {
                return wc.r.c(uriO);
            }
            throw new Exception("Can't parse video stream url - " + url);
        } catch (Throwable th) {
            wc.r.a aVar2 = wc.r.f27774b;
            return wc.r.c(wc.s.a(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(List list, Object obj, zc.f fVar) throws Throwable {
        v vVar;
        if (fVar instanceof v) {
            vVar = (v) fVar;
            int i10 = vVar.f20839j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f20839j = i10 - Integer.MIN_VALUE;
            } else {
                vVar = new v(fVar);
            }
        } else {
            vVar = new v(fVar);
        }
        Object objG = vVar.f20837h;
        Object objF = ad.d.f();
        int i11 = vVar.f20839j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarF = this.f20751c.f();
            w wVar = new w(list, obj, null);
            vVar.f20839j = 1;
            objG = ud.i.g(k0VarF, wVar, vVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(pb.m mVar, BitmapFactory.Options options, zc.f fVar) throws Throwable {
        k kVar;
        if (fVar instanceof k) {
            kVar = (k) fVar;
            int i10 = kVar.f20792j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f20792j = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(fVar);
            }
        } else {
            kVar = new k(fVar);
        }
        Object objG = kVar.f20790h;
        Object objF = ad.d.f();
        int i11 = kVar.f20792j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarD = this.f20751c.d();
            l lVar = new l(mVar, options, null);
            kVar.f20792j = 1;
            objG = ud.i.g(k0VarD, lVar, kVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    public final Object q(r0 r0Var, la.g.a aVar, zc.f fVar) {
        Object objG = ud.i.g(this.f20751c.f(), new r(r0Var, this, aVar, null), fVar);
        return objG == ad.d.f() ? objG : g0.f27756a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(j1 j1Var, Object obj, BitmapFactory.Options options, zc.f fVar) throws Throwable {
        m mVar;
        if (fVar instanceof m) {
            mVar = (m) fVar;
            int i10 = mVar.f20799j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f20799j = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(fVar);
            }
        } else {
            mVar = new m(fVar);
        }
        Object objG = mVar.f20797h;
        Object objF = ad.d.f();
        int i11 = mVar.f20799j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarF = this.f20751c.f();
            n nVar = new n(j1Var, obj, options, null);
            mVar.f20799j = 1;
            objG = ud.i.g(k0VarF, nVar, mVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(j1 j1Var, Object obj, zc.f fVar) throws Throwable {
        x xVar;
        if (fVar instanceof x) {
            xVar = (x) fVar;
            int i10 = xVar.f20847j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.f20847j = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(fVar);
            }
        } else {
            xVar = new x(fVar);
        }
        Object obj2 = xVar.f20845h;
        Object objF = ad.d.f();
        int i11 = xVar.f20847j;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj2);
            return ((wc.r) obj2).p();
        }
        wc.s.b(obj2);
        List listB = j1Var.b();
        int i12 = c.f20765a[j1Var.a().ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                return j((String) kotlin.collections.b0.O(listB));
            }
            throw new NoWhenBranchMatchedException();
        }
        xVar.f20847j = 1;
        Object objK = k(listB, obj, xVar);
        return objK == objF ? objF : objK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(j1 j1Var, zc.f fVar) throws Throwable {
        i iVar;
        if (fVar instanceof i) {
            iVar = (i) fVar;
            int i10 = iVar.f20786j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f20786j = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(fVar);
            }
        } else {
            iVar = new i(fVar);
        }
        Object objG = iVar.f20784h;
        Object objF = ad.d.f();
        int i11 = iVar.f20786j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarF = this.f20751c.f();
            j jVar = new j(j1Var, null);
            iVar.f20786j = 1;
            objG = ud.i.g(k0VarF, jVar, iVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }

    public final void u(String url, qb.c.f processor, la.g.a resultCallback, b0 error) {
        kotlin.jvm.internal.t.f(url, "url");
        kotlin.jvm.internal.t.f(processor, "processor");
        kotlin.jvm.internal.t.f(resultCallback, "resultCallback");
        kotlin.jvm.internal.t.f(error, "error");
        new qb.c.a(url, qb.c.e.Get).e(processor).d(new z(resultCallback, error, this.f20750b, this.f20751c)).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(r0 r0Var, Object obj, zc.f fVar) throws Throwable {
        g gVar;
        if (fVar instanceof g) {
            gVar = (g) fVar;
            int i10 = gVar.f20779j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f20779j = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(fVar);
            }
        } else {
            gVar = new g(fVar);
        }
        Object objG = gVar.f20777h;
        Object objF = ad.d.f();
        int i11 = gVar.f20779j;
        if (i11 == 0) {
            wc.s.b(objG);
            k0 k0VarF = this.f20751c.f();
            h hVar = new h(r0Var, this, obj, null);
            gVar.f20779j = 1;
            objG = ud.i.g(k0VarF, hVar, gVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(objG);
        }
        return ((wc.r) objG).p();
    }
}

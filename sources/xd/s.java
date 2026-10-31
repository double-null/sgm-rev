package xd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wc.g0;
import zd.e0;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
final class s<T> extends yd.a<u> implements n<T>, c, yd.j<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28555e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28556d;

    /* JADX INFO: compiled from: StateFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f28557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f28558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f28559j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f28560k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f28561l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f28562m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ s<T> f28563n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f28564o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<T> sVar, zc.f<? super a> fVar) {
            super(fVar);
            this.f28563n = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28562m = obj;
            this.f28564o |= Integer.MIN_VALUE;
            return this.f28563n.a(null, this);
        }
    }

    public s(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean m(Object obj, Object obj2) {
        int i10;
        u[] uVarArrI;
        synchronized (this) {
            Object obj3 = f28555e.get(this);
            if (obj != null && !kotlin.jvm.internal.t.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.t.a(obj3, obj2)) {
                return true;
            }
            f28555e.set(this, obj2);
            int i11 = this.f28556d;
            if ((i11 & 1) != 0) {
                this.f28556d = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f28556d = i12;
            u[] uVarArrI2 = i();
            g0 g0Var = g0.f27756a;
            while (true) {
                u[] uVarArr = uVarArrI2;
                if (uVarArr != null) {
                    for (u uVar : uVarArr) {
                        if (uVar != null) {
                            uVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f28556d;
                    if (i10 == i12) {
                        this.f28556d = i12 + 1;
                        return true;
                    }
                    uVarArrI = i();
                    g0 g0Var2 = g0.f27756a;
                }
                uVarArrI2 = uVarArrI;
                i12 = i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00b0, B:38:0x00b5, B:48:0x00d6, B:50:0x00dc, B:40:0x00bb, B:44:0x00c2, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [yd.c] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, xd.u] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, xd.d] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00da -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ec -> B:34:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:38:0x00b5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xd.c
    public java.lang.Object a(xd.d<? super T> r11, zc.f<?> r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.s.a(xd.d, zc.f):java.lang.Object");
    }

    @Override // xd.d
    public Object b(T t10, zc.f<? super g0> fVar) {
        setValue(t10);
        return g0.f27756a;
    }

    @Override // yd.j
    public c<T> c(zc.j jVar, int i10, wd.a aVar) {
        return t.d(this, jVar, i10, aVar);
    }

    @Override // xd.n
    public boolean e(T t10, T t11) {
        if (t10 == null) {
            t10 = (T) yd.l.f28895a;
        }
        if (t11 == null) {
            t11 = (T) yd.l.f28895a;
        }
        return m(t10, t11);
    }

    @Override // xd.n
    public T getValue() {
        e0 e0Var = yd.l.f28895a;
        T t10 = (T) f28555e.get(this);
        if (t10 == e0Var) {
            return null;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public u f() {
        return new u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yd.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public u[] g(int i10) {
        return new u[i10];
    }

    @Override // xd.n
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) yd.l.f28895a;
        }
        m(null, t10);
    }
}

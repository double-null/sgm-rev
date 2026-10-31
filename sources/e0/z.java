package e0;

import com.explorestack.protobuf.openrtb.LossReason;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class z implements v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f13831j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f13832k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f13833l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f13834m = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zc.j f13835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f13836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xd.c<wc.g0> f13837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f13838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f13839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final de.a f13841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wc.k f13842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wc.k<h0> f13843i;

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    public static final class a {

        /* JADX INFO: renamed from: e0.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", l = {182}, m = "getExclusiveFileLockWithRetryIfDeadlock")
        static final class C0192a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f13844h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            long f13845i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            /* synthetic */ Object f13846j;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f13848l;

            C0192a(zc.f<? super C0192a> fVar) {
                super(fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13846j = obj;
                this.f13848l |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(3:33|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            r15 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            r2 = r15.getMessage();
            r7 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            if (r2 != null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        
            r7 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            if (r7 != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        
            r0.f13844h = r14;
            r0.f13845i = r5;
            r0.f13848l = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        
            if (ud.y0.a(r5, r0) == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            throw r15;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:29:0x0080). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(java.io.FileOutputStream r14, zc.f<? super java.nio.channels.FileLock> r15) throws java.lang.Throwable {
            /*
                r13 = this;
                boolean r0 = r15 instanceof e0.z.a.C0192a
                if (r0 == 0) goto L13
                r0 = r15
                e0.z$a$a r0 = (e0.z.a.C0192a) r0
                int r1 = r0.f13848l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13848l = r1
                goto L18
            L13:
                e0.z$a$a r0 = new e0.z$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f13846j
                java.lang.Object r1 = ad.b.f()
                int r2 = r0.f13848l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 != r4) goto L30
                long r5 = r0.f13845i
                java.lang.Object r14 = r0.f13844h
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                wc.s.b(r15)
                goto L80
            L30:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L38:
                wc.s.b(r15)
                long r5 = e0.z.i()
            L3f:
                long r7 = e0.z.k()
                int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r15 > 0) goto L84
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch: java.io.IOException -> L5d
                r8 = 0
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                java.nio.channels.FileLock r15 = r7.lock(r8, r10, r12)     // Catch: java.io.IOException -> L5d
                kotlin.jvm.internal.t.e(r15, r2)     // Catch: java.io.IOException -> L5d
                return r15
            L5d:
                r15 = move-exception
                java.lang.String r2 = r15.getMessage()
                r7 = 0
                if (r2 == 0) goto L71
                java.lang.String r8 = e0.z.h()
                r9 = 0
                boolean r2 = rd.r.U(r2, r8, r7, r3, r9)
                if (r2 != r4) goto L71
                r7 = r4
            L71:
                if (r7 == 0) goto L83
                r0.f13844h = r14
                r0.f13845i = r5
                r0.f13848l = r4
                java.lang.Object r15 = ud.y0.a(r5, r0)
                if (r15 != r1) goto L80
                return r1
            L80:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L3f
            L83:
                throw r15
            L84:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r8 = 0
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                kotlin.jvm.internal.t.e(r14, r2)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.z.a.b(java.io.FileOutputStream, zc.f):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super Integer>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13849h;

        public b(zc.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return z.this.new b(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super Integer> fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f13849h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            return kotlin.coroutines.jvm.internal.b.c(z.this.r().b());
        }
    }

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", l = {}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.l implements id.p<ud.o0, zc.f<? super Integer>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f13851h;

        public c(zc.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<wc.g0> create(Object obj, zc.f<?> fVar) {
            return z.this.new c(fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ud.o0 o0Var, zc.f<? super Integer> fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(wc.g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f13851h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wc.s.b(obj);
            return kotlin.coroutines.jvm.internal.b.c(z.this.r().c());
        }
    }

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    static final class d extends kotlin.jvm.internal.u implements id.a<h0> {

        /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
        static final class a extends kotlin.jvm.internal.u implements id.a<File> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ z f13854d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar) {
                super(0);
                this.f13854d = zVar;
            }

            @Override // id.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final File invoke() throws IOException {
                z zVar = this.f13854d;
                File fileP = zVar.p(zVar.f13839e);
                this.f13854d.n(fileP);
                return fileP;
            }
        }

        d() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            h0.a aVar = h0.f13578b;
            aVar.d();
            return aVar.a(new a(z.this));
        }
    }

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 47, 48}, m = "lock")
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13855h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13856i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f13857j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f13858k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13860m;

        e(zc.f<? super e> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13858k = obj;
            this.f13860m |= Integer.MIN_VALUE;
            return z.this.d(null, this);
        }
    }

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    static final class f extends kotlin.jvm.internal.u implements id.a<File> {
        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            z zVar = z.this;
            File fileP = zVar.p(zVar.f13838d);
            z.this.n(fileP);
            return fileP;
        }
    }

    /* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
    static final class g<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13863i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f13864j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f13865k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f13866l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13868n;

        g(zc.f<? super g> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13866l = obj;
            this.f13868n |= Integer.MIN_VALUE;
            return z.this.e(null, this);
        }
    }

    public z(zc.j context, File file) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(file, "file");
        this.f13835a = context;
        this.f13836b = file;
        this.f13837c = c0.f13554c.e(file);
        this.f13838d = ".lock";
        this.f13839e = ".version";
        this.f13840f = "fcntl failed: EAGAIN";
        this.f13841g = de.g.b(false, 1, null);
        this.f13842h = wc.m.a(new f());
        this.f13843i = wc.m.a(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(File file) throws IOException {
        o(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    private final void o(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File p(String str) {
        return new File(this.f13836b.getAbsolutePath() + str);
    }

    private final File q() {
        return (File) this.f13842h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h0 r() {
        return this.f13843i.getValue();
    }

    @Override // e0.v
    public Object a(zc.f<? super Integer> fVar) {
        return this.f13843i.isInitialized() ? kotlin.coroutines.jvm.internal.b.c(r().b()) : ud.i.g(this.f13835a, new b(null), fVar);
    }

    @Override // e0.v
    public Object b(zc.f<? super Integer> fVar) {
        return this.f13843i.isInitialized() ? kotlin.coroutines.jvm.internal.b.c(r().c()) : ud.i.g(this.f13835a, new c(null), fVar);
    }

    @Override // e0.v
    public xd.c<wc.g0> c() {
        return this.f13837c;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb A[Catch: all -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00d9, blocks: (B:42:0x00bb, B:53:0x00d5, B:56:0x00dc), top: B:64:0x0024, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5 A[Catch: all -> 0x00d9, TRY_ENTER, TryCatch #4 {all -> 0x00d9, blocks: (B:42:0x00bb, B:53:0x00d5, B:56:0x00dc), top: B:64:0x0024, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [de.a] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // e0.v
    public <T> Object d(id.l<? super zc.f<? super T>, ? extends Object> lVar, zc.f<? super T> fVar) throws Throwable {
        e eVar;
        de.a aVar;
        z zVar;
        FileOutputStream fileOutputStream;
        Throwable th;
        id.l<? super zc.f<? super T>, ? extends Object> lVar2;
        Closeable closeable;
        de.a aVar2;
        ?? r10;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r11;
        de.a aVar3;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.f13860m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f13860m = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar);
            }
        } else {
            eVar = new e(fVar);
        }
        ?? r12 = eVar.f13858k;
        ?? F = ad.d.f();
        int i11 = eVar.f13860m;
        try {
            try {
                try {
                    if (i11 == 0) {
                        wc.s.b(r12);
                        aVar = this.f13841g;
                        eVar.f13855h = this;
                        eVar.f13856i = lVar;
                        eVar.f13857j = aVar;
                        eVar.f13860m = 1;
                        if (aVar.d(null, eVar) == F) {
                            return F;
                        }
                        zVar = this;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                fileLock = (FileLock) eVar.f13857j;
                                closeable2 = (Closeable) eVar.f13856i;
                                aVar3 = (de.a) eVar.f13855h;
                                try {
                                    wc.s.b(r12);
                                    r11 = r12;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    try {
                                        fd.b.a(closeable2, null);
                                        aVar3.c(null);
                                        return r11;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r12 = aVar3;
                                        r12.c(null);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            }
                            closeable = (Closeable) eVar.f13857j;
                            aVar2 = (de.a) eVar.f13856i;
                            lVar2 = (id.l) eVar.f13855h;
                            try {
                                wc.s.b(r12);
                                r10 = r12;
                                fileLock2 = (FileLock) r10;
                                try {
                                    eVar.f13855h = aVar2;
                                    eVar.f13856i = closeable;
                                    eVar.f13857j = fileLock2;
                                    eVar.f13860m = 3;
                                    objInvoke = lVar2.invoke(eVar);
                                    if (objInvoke == F) {
                                        return F;
                                    }
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    aVar3 = aVar2;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    fd.b.a(closeable2, null);
                                    aVar3.c(null);
                                    return r11;
                                } catch (Throwable th4) {
                                    fileLock = fileLock2;
                                    th = th4;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        de.a aVar4 = (de.a) eVar.f13857j;
                        id.l<? super zc.f<? super T>, ? extends Object> lVar3 = (id.l) eVar.f13856i;
                        zVar = (z) eVar.f13855h;
                        wc.s.b(r12);
                        aVar = aVar4;
                        lVar = lVar3;
                    }
                    a aVar5 = f13831j;
                    eVar.f13855h = lVar;
                    eVar.f13856i = aVar;
                    eVar.f13857j = fileOutputStream;
                    eVar.f13860m = 2;
                    Object objB = aVar5.b(fileOutputStream, eVar);
                    if (objB == F) {
                        return F;
                    }
                    lVar2 = lVar;
                    closeable = fileOutputStream;
                    aVar2 = aVar;
                    r10 = objB;
                    fileLock2 = (FileLock) r10;
                    eVar.f13855h = aVar2;
                    eVar.f13856i = closeable;
                    eVar.f13857j = fileLock2;
                    eVar.f13860m = 3;
                    objInvoke = lVar2.invoke(eVar);
                    if (objInvoke == F) {
                        return F;
                    }
                    closeable2 = closeable;
                    fileLock = fileLock2;
                    r11 = objInvoke;
                    aVar3 = aVar2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    fd.b.a(closeable2, null);
                    aVar3.c(null);
                    return r11;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream(zVar.q());
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            r12 = eVar;
            try {
                throw th8;
            } catch (Throwable th9) {
                fd.b.a(F, th8);
                throw th9;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb A[Catch: all -> 0x0102, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0102, blocks: (B:64:0x00eb, B:72:0x00fe, B:75:0x0105), top: B:86:0x0029, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe A[Catch: all -> 0x0102, TRY_ENTER, TryCatch #0 {all -> 0x0102, blocks: (B:64:0x00eb, B:72:0x00fe, B:75:0x0105), top: B:86:0x0029, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [id.p] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [e0.z$g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [de.a] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // e0.v
    public <T> Object e(id.p<? super Boolean, ? super zc.f<? super T>, ? extends Object> pVar, zc.f<? super T> fVar) throws Throwable {
        ?? gVar;
        FileLock fileLock;
        FileLock fileLockTryLock;
        de.a aVar;
        boolean z10;
        Closeable closeable;
        de.a aVar2;
        boolean z11;
        ?? r10 = pVar;
        if (fVar instanceof g) {
            g gVar2 = (g) fVar;
            int i10 = gVar2.f13868n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar2.f13868n = i10 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new g(fVar);
            }
        } else {
            gVar = new g(fVar);
        }
        Object objInvoke = gVar.f13866l;
        Object objF = ad.d.f();
        ?? r11 = gVar.f13868n;
        try {
            try {
                if (r11 != 0) {
                    if (r11 == 1) {
                        z11 = gVar.f13865k;
                        aVar2 = (de.a) gVar.f13862h;
                        wc.s.b(objInvoke);
                        if (z11) {
                            aVar2.c(null);
                        }
                        return objInvoke;
                    }
                    if (r11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = gVar.f13865k;
                    fileLock = (FileLock) gVar.f13864j;
                    closeable = (Closeable) gVar.f13863i;
                    aVar = (de.a) gVar.f13862h;
                    try {
                        wc.s.b(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        fd.b.a(closeable, null);
                        if (z10) {
                            aVar.c(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                wc.s.b(objInvoke);
                de.a aVar3 = this.f13841g;
                boolean zA = aVar3.a(null);
                try {
                    if (!zA) {
                        Boolean boolA = kotlin.coroutines.jvm.internal.b.a(false);
                        gVar.f13862h = aVar3;
                        gVar.f13865k = zA;
                        gVar.f13868n = 1;
                        objInvoke = r10.invoke(boolA, gVar);
                        if (objInvoke == objF) {
                            return objF;
                        }
                        aVar2 = aVar3;
                        z11 = zA;
                        if (z11) {
                            aVar2.c(null);
                        }
                        return objInvoke;
                    }
                    FileInputStream fileInputStream = new FileInputStream(q());
                    try {
                        try {
                            fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                        } catch (IOException e10) {
                            String message = e10.getMessage();
                            if (!(message != null && rd.c0.O(message, this.f13840f, false, 2, null))) {
                                String message2 = e10.getMessage();
                                if (!(message2 != null && rd.c0.O(message2, f13832k, false, 2, null))) {
                                    throw e10;
                                }
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(fileLockTryLock != null);
                            gVar.f13862h = aVar3;
                            gVar.f13863i = fileInputStream;
                            gVar.f13864j = fileLockTryLock;
                            gVar.f13865k = zA;
                            gVar.f13868n = 2;
                            objInvoke = r10.invoke(boolA2, gVar);
                            if (objInvoke == objF) {
                                return objF;
                            }
                            aVar = aVar3;
                            z10 = zA;
                            closeable = fileInputStream;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            fd.b.a(closeable, null);
                            if (z10) {
                                aVar.c(null);
                            }
                            return objInvoke;
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileLock = null;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gVar = aVar3;
                    r10 = zA;
                    if (r10 != 0) {
                        gVar.c(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    fd.b.a(r11, th5);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}

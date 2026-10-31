package e0;

import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r<T> implements m0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f13802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0<T> f13803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v f13804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final id.a<wc.g0> f13805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f13806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final de.a f13807f;

    /* JADX INFO: compiled from: FileStorage.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
    static final class a<R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13808h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13809i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13810j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f13811k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ r<T> f13812l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13813m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r<T> rVar, zc.f<? super a> fVar) {
            super(fVar);
            this.f13812l = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13811k = obj;
            this.f13813m |= Integer.MIN_VALUE;
            return this.f13812l.a(null, this);
        }
    }

    /* JADX INFO: compiled from: FileStorage.kt */
    /* JADX INFO: loaded from: classes.dex */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 118}, m = "writeScope")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13815i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f13816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f13817k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f13818l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ r<T> f13819m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f13820n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r<T> rVar, zc.f<? super b> fVar) {
            super(fVar);
            this.f13819m = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13818l = obj;
            this.f13820n |= Integer.MIN_VALUE;
            return this.f13819m.e(null, this);
        }
    }

    private final void f() {
        if (!(!this.f13806e.get())) {
            throw new IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:34:0x0080, B:41:0x008f, B:40:0x008c, B:37:0x0087), top: B:49:0x0022, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [e0.r] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e0.r$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [e0.r] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [e0.r] */
    /* JADX WARN: Type inference failed for: r9v0, types: [id.q, id.q<? super e0.e0<T>, ? super java.lang.Boolean, ? super zc.f<? super R>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // e0.m0
    public <R> Object a(id.q<? super e0<T>, ? super Boolean, ? super zc.f<? super R>, ? extends Object> qVar, zc.f<? super R> fVar) throws Throwable {
        ?? aVar;
        f fVar2;
        Throwable th;
        ?? r10;
        ?? r11;
        if (fVar instanceof a) {
            a aVar2 = (a) fVar;
            int i10 = aVar2.f13813m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f13813m = i10 - Integer.MIN_VALUE;
                aVar = aVar2;
            } else {
                aVar = new a(this, fVar);
            }
        } else {
            aVar = new a(this, fVar);
        }
        Object obj = aVar.f13811k;
        Object objF = ad.d.f();
        int i11 = aVar.f13813m;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (id.q<? super e0<T>, ? super Boolean, ? super zc.f<? super R>, ? extends Object>) aVar.f13810j;
                fVar2 = (f) aVar.f13809i;
                aVar = (r) aVar.f13808h;
                try {
                    wc.s.b(obj);
                    r10 = aVar;
                    r11 = qVar;
                    try {
                        fVar2.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r11 != 0) {
                        de.a.C0181a.b(r10.f13807f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        fVar2.close();
                    } catch (Throwable th4) {
                        wc.f.a(th, th4);
                    }
                    throw th;
                }
            }
            wc.s.b(obj);
            f();
            boolean zA = de.a.C0181a.a(this.f13807f, null, 1, null);
            try {
                p pVar = new p(this.f13802a, this.f13803b);
                try {
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(zA);
                    aVar.f13808h = this;
                    aVar.f13809i = pVar;
                    aVar.f13810j = zA;
                    aVar.f13813m = 1;
                    Object objInvoke = qVar.invoke(pVar, boolA, aVar);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    r10 = this;
                    fVar2 = pVar;
                    obj = objInvoke;
                    r11 = zA;
                    fVar2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r11 != 0) {
                        de.a.C0181a.b(r10.f13807f, null, 1, null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    aVar = this;
                    fVar2 = pVar;
                    th = th5;
                    qVar = zA;
                    fVar2.close();
                    throw th;
                }
            } catch (Throwable th6) {
                aVar = this;
                th = th6;
                qVar = zA;
                if (qVar != 0) {
                    de.a.C0181a.b(aVar.f13807f, null, 1, null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // e0.f
    public void close() {
        this.f13806e.set(true);
        this.f13805d.invoke();
    }

    @Override // e0.m0
    public v d() {
        return this.f13804c;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[Catch: IOException -> 0x0106, all -> 0x0114, TRY_ENTER, TryCatch #2 {all -> 0x0114, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:42:0x00f0, B:45:0x00f8, B:56:0x010a, B:58:0x0110, B:59:0x0113, B:52:0x0105, B:51:0x0102, B:24:0x007a, B:25:0x0096), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8 A[Catch: IOException -> 0x0106, all -> 0x0114, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0114, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:42:0x00f0, B:45:0x00f8, B:56:0x010a, B:58:0x0110, B:59:0x0113, B:52:0x0105, B:51:0x0102, B:24:0x007a, B:25:0x0096), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [de.a, int] */
    @Override // e0.m0
    public Object e(id.p<? super r0<T>, ? super zc.f<? super wc.g0>, ? extends Object> pVar, zc.f<? super wc.g0> fVar) throws Throwable {
        b bVar;
        File file;
        r<T> rVar;
        de.a aVar;
        s sVar;
        Throwable th;
        f fVar2;
        File file2;
        r<T> rVar2;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f13820n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f13820n = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, fVar);
            }
        } else {
            bVar = new b(this, fVar);
        }
        Object obj = bVar.f13818l;
        Object objF = ad.d.f();
        ?? r10 = bVar.f13820n;
        try {
            try {
                try {
                    try {
                        if (r10 == 0) {
                            wc.s.b(obj);
                            f();
                            g(this.f13802a);
                            de.a aVar2 = this.f13807f;
                            bVar.f13814h = this;
                            bVar.f13815i = pVar;
                            bVar.f13816j = aVar2;
                            bVar.f13820n = 1;
                            if (aVar2.d(null, bVar) == objF) {
                                return objF;
                            }
                            rVar = this;
                            aVar = aVar2;
                        } else {
                            if (r10 != 1) {
                                if (r10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                fVar2 = (f) bVar.f13817k;
                                File file3 = (File) bVar.f13816j;
                                aVar = (de.a) bVar.f13815i;
                                rVar2 = (r) bVar.f13814h;
                                try {
                                    wc.s.b(obj);
                                    file2 = file3;
                                    wc.g0 g0Var = wc.g0.f27756a;
                                    try {
                                        fVar2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists() && !o.a(file2, rVar2.f13802a)) {
                                        throw new IOException("Unable to rename " + file2 + " to " + rVar2.f13802a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                    wc.g0 g0Var2 = wc.g0.f27756a;
                                    aVar.c(null);
                                    return wc.g0.f27756a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        fVar2.close();
                                    } catch (Throwable th4) {
                                        wc.f.a(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            de.a aVar3 = (de.a) bVar.f13816j;
                            id.p<? super r0<T>, ? super zc.f<? super wc.g0>, ? extends Object> pVar2 = (id.p) bVar.f13815i;
                            rVar = (r) bVar.f13814h;
                            wc.s.b(obj);
                            aVar = aVar3;
                            pVar = pVar2;
                        }
                        bVar.f13814h = rVar;
                        bVar.f13815i = aVar;
                        bVar.f13816j = file;
                        bVar.f13817k = sVar;
                        bVar.f13820n = 2;
                        if (pVar.invoke(sVar, bVar) == objF) {
                            return objF;
                        }
                        file2 = file;
                        rVar2 = rVar;
                        fVar2 = sVar;
                        wc.g0 g0Var3 = wc.g0.f27756a;
                        fVar2.close();
                        th = null;
                        if (th == null) {
                            throw th;
                        }
                        if (file2.exists()) {
                            throw new IOException("Unable to rename " + file2 + " to " + rVar2.f13802a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                        }
                        wc.g0 g0Var4 = wc.g0.f27756a;
                        aVar.c(null);
                        return wc.g0.f27756a;
                    } catch (Throwable th5) {
                        th = th5;
                        fVar2 = sVar;
                        fVar2.close();
                        throw th;
                    }
                    sVar = new s(file, rVar.f13803b);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(rVar.f13802a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                r10.c(null);
                throw th6;
            }
        } catch (IOException e11) {
            e = e11;
            file = objF;
        }
    }

    public r(File file, g0<T> serializer, v coordinator, id.a<wc.g0> aVar) {
        kotlin.jvm.internal.t.f(file, "file");
        kotlin.jvm.internal.t.f(serializer, "serializer");
        kotlin.jvm.internal.t.f(coordinator, "coordinator");
        kotlin.jvm.internal.t.f(aVar, oqHAiWkeGzWld.bBYb);
        this.f13802a = file;
        this.f13803b = serializer;
        this.f13804c = coordinator;
        this.f13805d = aVar;
        this.f13806e = new AtomicBoolean(false);
        this.f13807f = de.g.b(false, 1, null);
    }
}

package e0;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
public class p<T> implements e0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f13780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0<T> f13781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f13782c;

    /* JADX INFO: compiled from: FileStorage.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13783h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13784i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13785j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ p<T> f13786k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13787l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, zc.f<? super a> fVar) {
            super(fVar);
            this.f13786k = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13785j = obj;
            this.f13787l |= Integer.MIN_VALUE;
            return p.i(this.f13786k, this);
        }
    }

    public p(File file, g0<T> serializer) {
        kotlin.jvm.internal.t.f(file, "file");
        kotlin.jvm.internal.t.f(serializer, "serializer");
        this.f13780a = file;
        this.f13781b = serializer;
        this.f13782c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [e0.p] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v20 */
    static /* synthetic */ <T> Object i(p<T> pVar, zc.f<? super T> fVar) throws Throwable {
        a aVar;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        Throwable th2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f13787l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f13787l = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(pVar, fVar);
            }
        } else {
            aVar = new a(pVar, fVar);
        }
        Object obj = aVar.f13785j;
        Object objF = ad.d.f();
        ?? r10 = aVar.f13787l;
        try {
            if (r10 != 0) {
                if (r10 == 1) {
                    closeable2 = (Closeable) aVar.f13784i;
                    r10 = (p) aVar.f13783h;
                    try {
                        wc.s.b(obj);
                        fd.b.a(closeable2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            fd.b.a(closeable2, th2);
                            throw th4;
                        }
                    }
                }
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) aVar.f13783h;
                try {
                    wc.s.b(obj);
                    fd.b.a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        fd.b.a(closeable, th);
                        throw th6;
                    }
                }
            }
            wc.s.b(obj);
            pVar.f();
            try {
                FileInputStream fileInputStream = new FileInputStream(((p) pVar).f13780a);
                try {
                    g0<T> g0Var = ((p) pVar).f13781b;
                    aVar.f13783h = pVar;
                    aVar.f13784i = fileInputStream;
                    aVar.f13787l = 1;
                    Object from = g0Var.readFrom(fileInputStream, aVar);
                    if (from == objF) {
                        return objF;
                    }
                    closeable2 = fileInputStream;
                    obj = from;
                    fd.b.a(closeable2, null);
                    return obj;
                } catch (Throwable th7) {
                    r10 = pVar;
                    closeable2 = fileInputStream;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (!((p) pVar).f13780a.exists()) {
                    return ((p) pVar).f13781b.getDefaultValue();
                }
                FileInputStream fileInputStream2 = new FileInputStream(((p) pVar).f13780a);
                try {
                    g0<T> g0Var2 = ((p) pVar).f13781b;
                    aVar.f13783h = fileInputStream2;
                    aVar.f13784i = null;
                    aVar.f13787l = 2;
                    Object from2 = g0Var2.readFrom(fileInputStream2, aVar);
                    if (from2 == objF) {
                        return objF;
                    }
                    obj = from2;
                    closeable = fileInputStream2;
                    fd.b.a(closeable, null);
                    return obj;
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream2;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            pVar = (p<T>) r10;
        }
    }

    @Override // e0.e0
    public Object c(zc.f<? super T> fVar) {
        return i(this, fVar);
    }

    @Override // e0.f
    public void close() {
        this.f13782c.set(true);
    }

    protected final void f() {
        if (!(!this.f13782c.get())) {
            throw new IllegalStateException("This scope has already been closed.".toString());
        }
    }

    protected final File g() {
        return this.f13780a;
    }

    protected final g0<T> h() {
        return this.f13781b;
    }
}

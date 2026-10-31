package e0;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: FileStorage.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s<T> extends p<T> implements r0<T> {

    /* JADX INFO: compiled from: FileStorage.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {201}, m = "writeData")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f13821h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f13822i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f13823j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ s<T> f13824k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f13825l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<T> sVar, zc.f<? super a> fVar) {
            super(fVar);
            this.f13824k = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13823j = obj;
            this.f13825l |= Integer.MIN_VALUE;
            return this.f13824k.b(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(File file, g0<T> serializer) {
        super(file, serializer);
        kotlin.jvm.internal.t.f(file, "file");
        kotlin.jvm.internal.t.f(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // e0.r0
    public Object b(T t10, zc.f<? super wc.g0> fVar) throws Throwable {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f13825l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f13825l = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, fVar);
            }
        } else {
            aVar = new a(this, fVar);
        }
        Object obj = aVar.f13823j;
        Object objF = ad.d.f();
        int i11 = aVar.f13825l;
        if (i11 == 0) {
            wc.s.b(obj);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                g0<T> g0VarH = h();
                p0 p0Var = new p0(fileOutputStream2);
                aVar.f13821h = fileOutputStream2;
                aVar.f13822i = fileOutputStream2;
                aVar.f13825l = 1;
                if (g0VarH.writeTo(t10, p0Var, aVar) == objF) {
                    return objF;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f13822i;
            closeable = (Closeable) aVar.f13821h;
            try {
                wc.s.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    fd.b.a(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        wc.g0 g0Var = wc.g0.f27756a;
        fd.b.a(closeable, null);
        return wc.g0.f27756a;
    }
}

package me;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a0 {
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: RequestBody.kt */
    public static final class a {

        /* JADX INFO: renamed from: me.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestBody.kt */
        public static final class C0366a extends a0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f22283a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ File f22284b;

            C0366a(w wVar, File file) {
                this.f22283a = wVar;
                this.f22284b = file;
            }

            @Override // me.a0
            public long contentLength() {
                return this.f22284b.length();
            }

            @Override // me.a0
            public w contentType() {
                return this.f22283a;
            }

            @Override // me.a0
            public void writeTo(af.f sink) throws IOException {
                kotlin.jvm.internal.t.f(sink, "sink");
                af.c0 c0VarJ = af.q.j(this.f22284b);
                try {
                    sink.V(c0VarJ);
                    fd.b.a(c0VarJ, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fd.b.a(c0VarJ, th);
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: RequestBody.kt */
        public static final class b extends a0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f22285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ af.h f22286b;

            b(w wVar, af.h hVar) {
                this.f22285a = wVar;
                this.f22286b = hVar;
            }

            @Override // me.a0
            public long contentLength() {
                return this.f22286b.F();
            }

            @Override // me.a0
            public w contentType() {
                return this.f22285a;
            }

            @Override // me.a0
            public void writeTo(af.f sink) throws IOException {
                kotlin.jvm.internal.t.f(sink, "sink");
                sink.D(this.f22286b);
            }
        }

        /* JADX INFO: compiled from: RequestBody.kt */
        public static final class c extends a0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f22287a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f22288b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f22289c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f22290d;

            c(w wVar, int i10, byte[] bArr, int i11) {
                this.f22287a = wVar;
                this.f22288b = i10;
                this.f22289c = bArr;
                this.f22290d = i11;
            }

            @Override // me.a0
            public long contentLength() {
                return this.f22288b;
            }

            @Override // me.a0
            public w contentType() {
                return this.f22287a;
            }

            @Override // me.a0
            public void writeTo(af.f sink) throws IOException {
                kotlin.jvm.internal.t.f(sink, "sink");
                sink.write(this.f22289c, this.f22290d, this.f22288b);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ a0 n(a aVar, w wVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.i(wVar, bArr, i10, i11);
        }

        public static /* synthetic */ a0 o(a aVar, byte[] bArr, w wVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                wVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.m(bArr, wVar, i10, i11);
        }

        public final a0 a(af.h hVar, w wVar) {
            kotlin.jvm.internal.t.f(hVar, "<this>");
            return new b(wVar, hVar);
        }

        public final a0 b(File file, w wVar) {
            kotlin.jvm.internal.t.f(file, "<this>");
            return new C0366a(wVar, file);
        }

        public final a0 c(String str, w wVar) {
            kotlin.jvm.internal.t.f(str, "<this>");
            Charset charset = rd.d.f24999b;
            if (wVar != null) {
                Charset charsetD = w.d(wVar, null, 1, null);
                if (charsetD == null) {
                    wVar = w.f22559e.b(wVar + "; charset=utf-8");
                } else {
                    charset = charsetD;
                }
            }
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.t.e(bytes, "this as java.lang.String).getBytes(charset)");
            return m(bytes, wVar, 0, bytes.length);
        }

        public final a0 d(w wVar, af.h content) {
            kotlin.jvm.internal.t.f(content, "content");
            return a(content, wVar);
        }

        public final a0 e(w wVar, File file) {
            kotlin.jvm.internal.t.f(file, "file");
            return b(file, wVar);
        }

        public final a0 f(w wVar, String content) {
            kotlin.jvm.internal.t.f(content, "content");
            return c(content, wVar);
        }

        public final a0 g(w wVar, byte[] content) {
            kotlin.jvm.internal.t.f(content, "content");
            return n(this, wVar, content, 0, 0, 12, null);
        }

        public final a0 h(w wVar, byte[] content, int i10) {
            kotlin.jvm.internal.t.f(content, "content");
            return n(this, wVar, content, i10, 0, 8, null);
        }

        public final a0 i(w wVar, byte[] content, int i10, int i11) {
            kotlin.jvm.internal.t.f(content, "content");
            return m(content, wVar, i10, i11);
        }

        public final a0 j(byte[] bArr) {
            kotlin.jvm.internal.t.f(bArr, "<this>");
            return o(this, bArr, null, 0, 0, 7, null);
        }

        public final a0 k(byte[] bArr, w wVar) {
            kotlin.jvm.internal.t.f(bArr, "<this>");
            return o(this, bArr, wVar, 0, 0, 6, null);
        }

        public final a0 l(byte[] bArr, w wVar, int i10) {
            kotlin.jvm.internal.t.f(bArr, "<this>");
            return o(this, bArr, wVar, i10, 0, 4, null);
        }

        public final a0 m(byte[] bArr, w wVar, int i10, int i11) {
            kotlin.jvm.internal.t.f(bArr, "<this>");
            ne.d.l(bArr.length, i10, i11);
            return new c(wVar, i11, bArr, i10);
        }
    }

    public static final a0 create(af.h hVar, w wVar) {
        return Companion.a(hVar, wVar);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract w contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(af.f fVar) throws IOException;

    public static final a0 create(File file, w wVar) {
        return Companion.b(file, wVar);
    }

    public static final a0 create(String str, w wVar) {
        return Companion.c(str, wVar);
    }

    public static final a0 create(w wVar, af.h hVar) {
        return Companion.d(wVar, hVar);
    }

    public static final a0 create(w wVar, File file) {
        return Companion.e(wVar, file);
    }

    public static final a0 create(w wVar, String str) {
        return Companion.f(wVar, str);
    }

    public static final a0 create(w wVar, byte[] bArr) {
        return Companion.g(wVar, bArr);
    }

    public static final a0 create(w wVar, byte[] bArr, int i10) {
        return Companion.h(wVar, bArr, i10);
    }

    public static final a0 create(w wVar, byte[] bArr, int i10, int i11) {
        return Companion.i(wVar, bArr, i10, i11);
    }

    public static final a0 create(byte[] bArr) {
        return Companion.j(bArr);
    }

    public static final a0 create(byte[] bArr, w wVar) {
        return Companion.k(bArr, wVar);
    }

    public static final a0 create(byte[] bArr, w wVar, int i10) {
        return Companion.l(bArr, wVar, i10);
    }

    public static final a0 create(byte[] bArr, w wVar, int i10, int i11) {
        return Companion.m(bArr, wVar, i10, i11);
    }
}

package me;

import com.google.android.gms.common.util.cS.EFLCCdIRcb;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import wc.g0;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c0 implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final af.g f22355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Charset f22356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Reader f22358d;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            g0 g0Var;
            this.f22357c = true;
            Reader reader = this.f22358d;
            if (reader == null) {
                g0Var = null;
            } else {
                reader.close();
                g0Var = g0.f27756a;
            }
            if (g0Var == null) {
                this.f22355a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i10, int i11) throws IOException {
            kotlin.jvm.internal.t.f(cbuf, "cbuf");
            if (this.f22357c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f22358d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f22355a.inputStream(), ne.d.J(this.f22355a, this.f22356b));
                this.f22358d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i10, i11);
        }

        public a(af.g source, Charset charset) {
            kotlin.jvm.internal.t.f(source, "source");
            kotlin.jvm.internal.t.f(charset, EFLCCdIRcb.QzOHqdUMKnKLqgS);
            this.f22355a = source;
            this.f22356b = charset;
        }
    }

    /* JADX INFO: compiled from: ResponseBody.kt */
    public static final class b {

        /* JADX INFO: compiled from: ResponseBody.kt */
        public static final class a extends c0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f22359a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f22360b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ af.g f22361c;

            a(w wVar, long j10, af.g gVar) {
                this.f22359a = wVar;
                this.f22360b = j10;
                this.f22361c = gVar;
            }

            @Override // me.c0
            public long contentLength() {
                return this.f22360b;
            }

            @Override // me.c0
            public w contentType() {
                return this.f22359a;
            }

            @Override // me.c0
            public af.g source() {
                return this.f22361c;
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ c0 i(b bVar, byte[] bArr, w wVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                wVar = null;
            }
            return bVar.h(bArr, wVar);
        }

        public final c0 a(af.g gVar, w wVar, long j10) {
            kotlin.jvm.internal.t.f(gVar, "<this>");
            return new a(wVar, j10, gVar);
        }

        public final c0 b(af.h hVar, w wVar) {
            kotlin.jvm.internal.t.f(hVar, "<this>");
            return a(new af.e().D(hVar), wVar, hVar.F());
        }

        public final c0 c(String str, w wVar) {
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
            af.e eVarE0 = new af.e().e0(str, charset);
            return a(eVarE0, wVar, eVarE0.size());
        }

        public final c0 d(w wVar, long j10, af.g content) {
            kotlin.jvm.internal.t.f(content, "content");
            return a(content, wVar, j10);
        }

        public final c0 e(w wVar, af.h content) {
            kotlin.jvm.internal.t.f(content, "content");
            return b(content, wVar);
        }

        public final c0 f(w wVar, String content) {
            kotlin.jvm.internal.t.f(content, "content");
            return c(content, wVar);
        }

        public final c0 g(w wVar, byte[] content) {
            kotlin.jvm.internal.t.f(content, "content");
            return h(content, wVar);
        }

        public final c0 h(byte[] bArr, w wVar) {
            kotlin.jvm.internal.t.f(bArr, "<this>");
            return a(new af.e().write(bArr), wVar, bArr.length);
        }
    }

    private final Charset charset() {
        w wVarContentType = contentType();
        Charset charsetC = wVarContentType == null ? null : wVarContentType.c(rd.d.f24999b);
        return charsetC == null ? rd.d.f24999b : charsetC;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(id.l<? super af.g, ? extends T> lVar, id.l<? super T, Integer> lVar2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(kotlin.jvm.internal.t.n("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        af.g gVarSource = source();
        try {
            T tInvoke = lVar.invoke(gVarSource);
            kotlin.jvm.internal.r.b(1);
            fd.b.a(gVarSource, null);
            kotlin.jvm.internal.r.a(1);
            int iIntValue = lVar2.invoke(tInvoke).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.r.b(1);
                fd.b.a(gVarSource, th);
                kotlin.jvm.internal.r.a(1);
                throw th2;
            }
        }
    }

    public static final c0 create(af.g gVar, w wVar, long j10) {
        return Companion.a(gVar, wVar, j10);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final af.h byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(kotlin.jvm.internal.t.n("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        af.g gVarSource = source();
        try {
            af.h byteString = gVarSource.readByteString();
            fd.b.a(gVarSource, null);
            int iF = byteString.F();
            if (jContentLength == -1 || jContentLength == iF) {
                return byteString;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iF + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(gVarSource, th);
                throw th2;
            }
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(kotlin.jvm.internal.t.n("Cannot buffer entire body for content length: ", Long.valueOf(jContentLength)));
        }
        af.g gVarSource = source();
        try {
            byte[] byteArray = gVarSource.readByteArray();
            fd.b.a(gVarSource, null);
            int length = byteArray.length;
            if (jContentLength == -1 || jContentLength == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(gVarSource, th);
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ne.d.m(source());
    }

    public abstract long contentLength();

    public abstract w contentType();

    public abstract af.g source();

    public final String string() throws IOException {
        af.g gVarSource = source();
        try {
            String string = gVarSource.readString(ne.d.J(gVarSource, charset()));
            fd.b.a(gVarSource, null);
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fd.b.a(gVarSource, th);
                throw th2;
            }
        }
    }

    public static final c0 create(af.h hVar, w wVar) {
        return Companion.b(hVar, wVar);
    }

    public static final c0 create(String str, w wVar) {
        return Companion.c(str, wVar);
    }

    public static final c0 create(w wVar, long j10, af.g gVar) {
        return Companion.d(wVar, j10, gVar);
    }

    public static final c0 create(w wVar, af.h hVar) {
        return Companion.e(wVar, hVar);
    }

    public static final c0 create(w wVar, String str) {
        return Companion.f(wVar, str);
    }

    public static final c0 create(w wVar, byte[] bArr) {
        return Companion.g(wVar, bArr);
    }

    public static final c0 create(byte[] bArr, w wVar) {
        return Companion.h(bArr, wVar);
    }
}

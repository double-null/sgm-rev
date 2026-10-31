package io.bidmachine.analytics.internal.w;

import android.util.Base64;
import id.p;
import io.bidmachine.analytics.BidMachineAnalytics;
import io.bidmachine.analytics.internal.E.d;
import io.bidmachine.analytics.internal.E.e;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ud.i;
import ud.k0;
import ud.o0;
import wc.g0;
import wc.r;
import wc.s;
import zc.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0312a f17456e = new C0312a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.w.c f17457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f17458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f17459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.p003b.a f17460d;

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.w.a$a, reason: collision with other inner class name */
    public static final class C0312a {
        public /* synthetic */ C0312a(k kVar) {
            this();
        }

        private C0312a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f17461a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f17463c;

        b(f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f17461a = obj;
            this.f17463c |= Integer.MIN_VALUE;
            Object objA = a.this.a(this);
            return objA == ad.d.f() ? objA : r.b(objA);
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f17464a;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.w.a$c$a, reason: collision with other inner class name */
        static final class C0313a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f17466a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f17467b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0313a(a aVar, f fVar) {
                super(2, fVar);
                this.f17467b = aVar;
            }

            @Override // id.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o0 o0Var, f fVar) {
                return ((C0313a) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final f create(Object obj, f fVar) {
                return new C0313a(this.f17467b, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ad.d.f();
                if (this.f17466a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                a aVar = this.f17467b;
                return aVar.a(aVar.f17460d, this.f17467b.b());
            }
        }

        c(f fVar) {
            super(2, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final f create(Object obj, f fVar) {
            return a.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            Object objF = ad.d.f();
            int i10 = this.f17464a;
            try {
                try {
                    if (i10 == 0) {
                        s.b(obj);
                        if (a.this.f17460d == null) {
                            r.a aVar = r.f27774b;
                            return r.b(r.c(a.this.a()));
                        }
                        k0 k0VarB = a.this.f17459c.b();
                        C0313a c0313a = new C0313a(a.this, null);
                        this.f17464a = 1;
                        obj = i.g(k0VarB, c0313a, this);
                        if (obj == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    byte[] bArr = (byte[]) obj;
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f17458b, bArr);
                    r.a aVar3 = r.f27774b;
                    objC = r.c(a.this.a());
                } catch (Throwable unused) {
                    r.a aVar4 = r.f27774b;
                    return r.b(r.c(a.this.a()));
                }
            } catch (Throwable th) {
                r.a aVar5 = r.f27774b;
                objC = r.c(s.a(th));
            }
            return r.b(objC);
        }
    }

    public a(io.bidmachine.analytics.internal.w.c cVar, String str, d dVar, io.bidmachine.analytics.internal.p003b.a aVar) {
        this.f17457a = cVar;
        this.f17458b = str;
        this.f17459c = dVar;
        this.f17460d = aVar;
    }

    public abstract a a();

    public abstract byte[] b();

    private final int b(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(f fVar) throws Throwable {
        b bVar;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.f17463c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f17463c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object objG = bVar.f17461a;
        Object objF = ad.d.f();
        int i11 = bVar.f17463c;
        if (i11 == 0) {
            s.b(objG);
            k0 k0VarC = this.f17459c.c();
            c cVar = new c(null);
            bVar.f17463c = 1;
            objG = i.g(k0VarC, cVar, bVar);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(objG);
        }
        return ((r) objG).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a(io.bidmachine.analytics.internal.p003b.a aVar, byte[] bArr) {
        if (bArr != null) {
            return io.bidmachine.analytics.internal.p003b.b.a(bArr, aVar);
        }
        return null;
    }

    public /* synthetic */ a(io.bidmachine.analytics.internal.w.c cVar, String str, d dVar, io.bidmachine.analytics.internal.p003b.a aVar, int i10, k kVar) {
        this(cVar, str, dVar, (i10 & 8) != 0 ? BidMachineAnalytics.INSTANCE.getEncryptionManager$bidmachine_android_sdk_j_3_6_1() : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[Catch: all -> 0x00bf, TryCatch #3 {all -> 0x00bf, blocks: (B:4:0x0011, B:6:0x0027, B:8:0x003b, B:12:0x0042, B:15:0x0051, B:20:0x005e, B:22:0x0067, B:23:0x006e, B:24:0x006f, B:34:0x0087, B:43:0x00a0, B:44:0x00ba, B:36:0x008b, B:38:0x0093, B:40:0x0099), top: B:58:0x0011 }] */
    public final void a(String str, byte[] bArr) throws Throwable {
        String headerField;
        URLConnection uRLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            t.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                this.f17457a.a(httpURLConnection);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setConnectTimeout(40000);
                httpURLConnection.setReadTimeout(40000);
                io.bidmachine.analytics.internal.p003b.a aVar = this.f17460d;
                if (aVar != null) {
                    httpURLConnection.setRequestProperty("bm-data", Base64.encodeToString(aVar.a().b(), 2));
                }
                if (bArr != null) {
                    if (!(bArr.length == 0)) {
                        httpURLConnection.setDoOutput(true);
                        try {
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            try {
                                bufferedOutputStream2.write(bArr);
                                e.a((Flushable) bufferedOutputStream2);
                                e.a((Closeable) bufferedOutputStream2);
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    r.b(e.a((Flushable) bufferedOutputStream));
                                }
                                if (bufferedOutputStream != null) {
                                    r.b(e.a((Closeable) bufferedOutputStream));
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                int iB = b(httpURLConnection);
                if (iB != 200 && iB != 204) {
                    if (iB == 305 || iB == 307 || iB == 308) {
                        headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null && headerField.length() > 0) {
                            a(headerField, bArr);
                            a(httpURLConnection);
                            return;
                        }
                    } else {
                        switch (iB) {
                            case MRAID_ERROR_VALUE:
                            case INVALID_IFA_STATUS_VALUE:
                            case 303:
                                headerField = httpURLConnection.getHeaderField("Location");
                                if (headerField != null) {
                                    a(headerField, bArr);
                                    a(httpURLConnection);
                                    return;
                                }
                                break;
                        }
                    }
                    throw new IllegalStateException(("Invalid response code: " + iB).toString());
                }
                a(httpURLConnection);
            } catch (Throwable th3) {
                th = th3;
                uRLConnection = httpURLConnection;
                a(uRLConnection);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final Object a(URLConnection uRLConnection) {
        try {
            r.a aVar = r.f27774b;
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).disconnect();
            }
            return r.c(g0.f27756a);
        } catch (Throwable th) {
            r.a aVar2 = r.f27774b;
            return r.c(s.a(th));
        }
    }
}

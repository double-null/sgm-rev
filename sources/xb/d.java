package xb;

import com.adjust.sdk.Constants;
import com.facebook.share.internal.ShareInternalUtility;
import fd.h;
import fd.j;
import id.p;
import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import k9.dW.xjwcmjDeOXR;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import ud.i;
import ud.o0;
import ud.p0;
import ud.t2;
import wb.w;
import wc.g0;
import wc.k;
import wc.m;
import wc.s;

/* JADX INFO: compiled from: MediaFileMetadataManager.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f28403f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f28404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bc.c f28405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f28406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, xb.c> f28407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f28408e;

    /* JADX INFO: compiled from: MediaFileMetadataManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: MediaFileMetadataManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileMetadataManager$deleteMediaFileMetadata$2", f = "MediaFileMetadataManager.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28409h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ File f28410i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, zc.f<? super b> fVar) {
            super(2, fVar);
            this.f28410i = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return new b(this.f28410i, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f28409h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ac.b.f(this.f28410i);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: MediaFileMetadataManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileMetadataManager$getMediaFileMetadata$2", f = "MediaFileMetadataManager.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<o0, zc.f<? super xb.c>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28411h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f28412i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f28413j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ d f28414k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, d dVar, zc.f<? super c> fVar) {
            super(2, fVar);
            this.f28413j = file;
            this.f28414k = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            c cVar = new c(this.f28413j, this.f28414k, fVar);
            cVar.f28412i = obj;
            return cVar;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super xb.c> fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            xb.c cVar;
            ad.d.f();
            if (this.f28411h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (!this.f28413j.exists()) {
                return null;
            }
            Object obj3 = this.f28414k.f28406c;
            d dVar = this.f28414k;
            File file = this.f28413j;
            synchronized (obj3) {
                try {
                    xb.c cVar2 = (xb.c) dVar.f28407d.get(file.getName());
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    xb.c cVarK = dVar.k(file);
                    if (cVarK != null) {
                        Map map = dVar.f28407d;
                        String name = file.getName();
                        t.e(name, xjwcmjDeOXR.Ovu);
                        map.put(name, cVarK);
                        return cVarK;
                    }
                    try {
                        long length = file.length();
                        sd.a.C0418a c0418a = sd.a.f25407b;
                        sd.d dVar2 = sd.d.MILLISECONDS;
                        obj2 = obj3;
                        try {
                            cVar = new xb.c(file, "", length, 0L, sd.c.s(0, dVar2), sd.c.s(0, dVar2), new Date(file.lastModified()), new Date(file.lastModified()), null);
                        } catch (Throwable unused) {
                            cVar = null;
                        }
                    } catch (Throwable unused2) {
                        obj2 = obj3;
                    }
                    if (cVar != null) {
                        try {
                            dVar.n(cVar);
                        } catch (Throwable th) {
                            th = th;
                        }
                    } else {
                        cVar = null;
                    }
                    return cVar;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = obj3;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: xb.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MediaFileMetadataManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileMetadataManager$saveMediaFileMetadata$2", f = "MediaFileMetadataManager.kt", l = {}, m = "invokeSuspend")
    static final class C0475d extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28415h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ Object f28416i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ xb.c f28418k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0475d(xb.c cVar, zc.f<? super C0475d> fVar) {
            super(2, fVar);
            this.f28418k = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            C0475d c0475d = d.this.new C0475d(this.f28418k, fVar);
            c0475d.f28416i = obj;
            return c0475d;
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((C0475d) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ad.d.f();
            if (this.f28415h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            d dVar = d.this;
            xb.c cVar = this.f28418k;
            try {
                File fileL = dVar.l(cVar.e());
                String string = dVar.o(cVar).toString(2);
                t.e(string, "mediaFileMetadata.toJSONObject().toString(2)");
                h.h(fileL, string, null, 2, null);
                g0 g0Var = g0.f27756a;
            } catch (Throwable unused) {
            }
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: MediaFileMetadataManager.kt */
    static final class e extends u implements id.a<o0> {
        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 invoke() {
            return p0.a(t2.b(null, 1, null).z(d.this.f28404a.e()));
        }
    }

    /* JADX INFO: compiled from: MediaFileMetadataManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.bidmachine.util.cache.MediaFileMetadataManager$trackUsage$2", f = "MediaFileMetadataManager.kt", l = {37}, m = "invokeSuspend")
    static final class f extends l implements p<o0, zc.f<? super g0>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f28420h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f28422j;

        /* JADX INFO: compiled from: MediaFileMetadataManager.kt */
        static final class a extends u implements id.a<String> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f28423d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(File file) {
                super(0);
                this.f28423d = file;
            }

            @Override // id.a
            public final String invoke() {
                return "Track usage for " + this.f28423d.getName();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file, zc.f<? super f> fVar) {
            super(2, fVar);
            this.f28422j = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zc.f<g0> create(Object obj, zc.f<?> fVar) {
            return d.this.new f(this.f28422j, fVar);
        }

        @Override // id.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, zc.f<? super g0> fVar) {
            return ((f) create(o0Var, fVar)).invokeSuspend(g0.f27756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objH;
            Object objF = ad.d.f();
            int i10 = this.f28420h;
            if (i10 == 0) {
                s.b(obj);
                d.this.f28405b.b("MediaFileMetadataManager", new a(this.f28422j));
                d dVar = d.this;
                File file = this.f28422j;
                this.f28420h = 1;
                objH = dVar.h(file, this);
                if (objH == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                objH = obj;
            }
            xb.c cVar = (xb.c) objH;
            if (cVar == null) {
                return null;
            }
            d.this.n(cVar.a((205 & 1) != 0 ? cVar.f28395a : null, (205 & 2) != 0 ? cVar.f28396b : null, (205 & 4) != 0 ? cVar.f28397c : 0L, (205 & 8) != 0 ? cVar.f28398d : cVar.j() + 1, (205 & 16) != 0 ? cVar.f28399e : 0L, (205 & 32) != 0 ? cVar.f28400f : 0L, (205 & 64) != 0 ? cVar.f28401g : new Date(), (205 & 128) != 0 ? cVar.f28402h : null));
            return g0.f27756a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final o0 i() {
        return (o0) this.f28408e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xb.c k(File file) {
        try {
            File fileL = l(file);
            if (fileL.exists() && fileL.length() != 0) {
                return p(new JSONObject(h.f(fileL, null, 1, null)));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject o(xb.c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareInternalUtility.STAGING_PARAM, cVar.e().getPath());
        jSONObject.put("mime", cVar.g());
        jSONObject.put("size", cVar.i());
        jSONObject.put("frequency", cVar.j());
        jSONObject.put("pingTime", sd.a.p(cVar.h()));
        jSONObject.put("downloadTime", sd.a.p(cVar.d()));
        jSONObject.put("lastUsed", cVar.f().getTime());
        jSONObject.put("createdAt", cVar.c().getTime());
        return jSONObject;
    }

    private final xb.c p(JSONObject jSONObject) {
        try {
            File file = new File(jSONObject.getString(ShareInternalUtility.STAGING_PARAM));
            String string = jSONObject.getString("mime");
            t.e(string, "getString(KEY_MIME_TYPE)");
            long j10 = jSONObject.getLong("size");
            long j11 = jSONObject.getLong("frequency");
            sd.a.C0418a c0418a = sd.a.f25407b;
            long j12 = jSONObject.getLong("pingTime");
            sd.d dVar = sd.d.MILLISECONDS;
            return new xb.c(file, string, j10, j11, sd.c.t(j12, dVar), sd.c.t(jSONObject.getLong("downloadTime"), dVar), new Date(jSONObject.getLong("lastUsed")), new Date(jSONObject.getLong("createdAt")), null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void g(File mediaFile) {
        t.f(mediaFile, "mediaFile");
        synchronized (this.f28406c) {
            this.f28407d.remove(mediaFile.getName());
        }
        ud.k.d(i(), null, null, new b(mediaFile, null), 3, null);
    }

    public final Object h(File file, zc.f<? super xb.c> fVar) {
        return i.g(this.f28404a.e(), new c(file, this, null), fVar);
    }

    public final boolean j(File file) {
        t.f(file, "<this>");
        return t.a(j.n(file), Constants.REFERRER_API_META);
    }

    public final File l(File file) {
        t.f(file, "<this>");
        if (j(file)) {
            return file;
        }
        return new File(file.getParentFile(), j.o(file) + ".meta");
    }

    public final void m() {
        synchronized (this.f28406c) {
            this.f28407d.clear();
            g0 g0Var = g0.f27756a;
        }
    }

    public final void n(xb.c mediaFileMetadata) {
        t.f(mediaFileMetadata, "mediaFileMetadata");
        synchronized (this.f28406c) {
            Map<String, xb.c> map = this.f28407d;
            String name = mediaFileMetadata.e().getName();
            t.e(name, "mediaFileMetadata.file.name");
            map.put(name, mediaFileMetadata);
            g0 g0Var = g0.f27756a;
        }
        ud.k.d(i(), null, null, new C0475d(mediaFileMetadata, null), 3, null);
    }

    public final Object q(File file, zc.f<? super g0> fVar) {
        return i.g(this.f28404a.e(), new f(file, null), fVar);
    }

    public d(w dispatchers, bc.c logger) {
        t.f(dispatchers, "dispatchers");
        t.f(logger, "logger");
        this.f28404a = dispatchers;
        this.f28405b = logger;
        this.f28406c = new Object();
        this.f28407d = new LinkedHashMap();
        this.f28408e = m.a(new e());
    }

    public /* synthetic */ d(w wVar, bc.c cVar, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? w.f27717g.a() : wVar, (i10 & 2) != 0 ? bc.b.f4446a.a() : cVar);
    }
}

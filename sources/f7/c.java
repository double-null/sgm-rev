package f7;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.bidmachine.iab.mraid.b0;
import io.bidmachine.iab.mraid.s0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.t0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import pb.f1;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f14636c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f14637d = "ScriptInjector";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f14638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f14639b;

    public interface a {
    }

    private static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: f7.c$c, reason: collision with other inner class name */
    static final class C0222c extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0222c f14640d = new C0222c();

        C0222c() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "WEB_MESSAGE_LISTENER not supported, skipping";
        }
    }

    static final class d extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f14641d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.f14641d = str;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "unregistered message listener: " + this.f14641d;
        }
    }

    static final class e extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f14642d = new e();

        e() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "can't evaluate js: WebView is destroyed";
        }
    }

    static final class f extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f f14643d = new f();

        f() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "can't evaluate js: js is empty";
        }
    }

    static final class g extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f14644d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.f14644d = str;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "evaluating js (" + this.f14644d.length() + " chars)";
        }
    }

    static final class h extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f14645d = new h();

        h() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "evaluate js complete";
        }
    }

    static final class i extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f14646d = new i();

        i() {
            super(0);
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "loading url via javascript:";
        }
    }

    static final class j extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f14647d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(List list) {
            super(0);
            this.f14647d = list;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "installed " + this.f14647d.size() + " document-start scripts";
        }
    }

    static final class k extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1 f14648d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(f1 f1Var) {
            super(0);
            this.f14648d = f1Var;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DOCUMENT_START_SCRIPT not supported, skipping: " + this.f14648d.f();
        }
    }

    static final class l extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1 f14649d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(f1 f1Var) {
            super(0);
            this.f14649d = f1Var;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "injected document-start script: " + this.f14649d.f();
        }
    }

    static final class n extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f14651d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str) {
            super(0);
            this.f14651d = str;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "WEB_MESSAGE_LISTENER not supported, skipping: " + this.f14651d;
        }
    }

    static final class o extends u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f14652d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(0);
            this.f14652d = str;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "registered message listener: " + this.f14652d;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(s0 webView) {
        this(webView, null, 2, 0 == true ? 1 : 0);
        t.f(webView, "webView");
    }

    private final Set c(String str, boolean z10) {
        if (str == null || !z10) {
            return z10 ? t0.d("https://localhost") : t0.d("*");
        }
        return t0.d(str);
    }

    private final void d(WebView webView, final String str, Set set) {
        if (!d1.g.a("WEB_MESSAGE_LISTENER")) {
            b0.i(f14637d, new n(str));
            return;
        }
        try {
            d1.f.b(webView, str, set, new d1.f.a() { // from class: f7.a
                @Override // d1.f.a
                public final void onPostMessage(WebView webView2, d1.d dVar, Uri uri, boolean z10, d1.a aVar) {
                    c.e(this.f14634a, str, webView2, dVar, uri, z10, aVar);
                }
            });
            this.f14639b.add(str);
            b0.c(f14637d, new o(str));
        } catch (Throwable th) {
            b0.f(f14637d, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(c this$0, String handlerName, WebView webView, d1.d message, Uri uri, boolean z10, d1.a aVar) {
        t.f(this$0, "this$0");
        t.f(handlerName, "$handlerName");
        t.f(webView, "<anonymous parameter 0>");
        t.f(message, "message");
        t.f(uri, "<anonymous parameter 2>");
        t.f(aVar, "<anonymous parameter 4>");
        this$0.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String str) {
        b0.c(f14637d, h.f14645d);
    }

    public final void g() {
        if (!d1.g.a("WEB_MESSAGE_LISTENER")) {
            b0.i(f14637d, C0222c.f14640d);
            return;
        }
        for (String str : this.f14639b) {
            try {
                d1.f.l(this.f14638a, str);
                b0.c(f14637d, new d(str));
            } catch (Throwable th) {
                b0.f(f14637d, th);
            }
        }
        this.f14639b.clear();
    }

    public final void h(String str) {
        if (this.f14638a.h()) {
            b0.c(f14637d, e.f14642d);
            return;
        }
        if (str == null || str.length() == 0) {
            b0.c(f14637d, f.f14643d);
            return;
        }
        try {
            b0.c(f14637d, new g(str));
            this.f14638a.evaluateJavascript(str, new ValueCallback() { // from class: f7.b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    c.f((String) obj);
                }
            });
        } catch (Throwable th) {
            Object obj = f14637d;
            b0.f(obj, th);
            b0.c(obj, i.f14646d);
            this.f14638a.loadUrl("javascript:" + str);
        }
    }

    public final void i(String str, f1 script) {
        t.f(script, "script");
        if (!d1.g.a("DOCUMENT_START_SCRIPT")) {
            b0.i(f14637d, new k(script));
            return;
        }
        Set setC = c(str, script.c());
        d1.f.a(this.f14638a, f7.d.a(script), setC);
        b0.c(f14637d, new l(script));
        String strD = script.d();
        if (strD != null) {
            d(this.f14638a, strD, setC);
        }
    }

    public final boolean j(String str, List<f1> scriptConfigs) {
        t.f(scriptConfigs, "scriptConfigs");
        try {
            List listC = f7.d.c(scriptConfigs, f1.b.DocumentStart, f1.b.DocumentEnd);
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                i(str, (f1) it.next());
            }
            b0.c(f14637d, new j(listC));
            return true;
        } catch (Throwable th) {
            b0.f(f14637d, th);
            return false;
        }
    }

    public final String k(String data, List<f1> scriptConfigs) {
        t.f(data, "data");
        t.f(scriptConfigs, "scriptConfigs");
        return kotlin.collections.b0.V(f7.d.c(scriptConfigs, f1.b.InlineTag), "", null, null, 0, null, new a0() { // from class: f7.c.m
            @Override // kotlin.jvm.internal.a0, pd.j
            public Object get(Object obj) {
                return ((f1) obj).g();
            }
        }, 30, null) + data;
    }

    public c(s0 webView, a aVar) {
        t.f(webView, "webView");
        this.f14638a = webView;
        this.f14639b = new LinkedHashSet();
    }

    public /* synthetic */ c(s0 s0Var, a aVar, int i10, kotlin.jvm.internal.k kVar) {
        this(s0Var, (i10 & 2) != 0 ? null : aVar);
    }
}

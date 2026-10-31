package io.bidmachine.iab.mraid;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends qb.a {

    static final class a extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ConsoleMessage f17803e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConsoleMessage consoleMessage) {
            super(0);
            this.f17802d = str;
            this.f17803e = consoleMessage;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String str;
            String str2 = this.f17802d;
            if (str2 == null || str2.length() == 0) {
                str = "";
            } else {
                str = " at " + this.f17802d;
            }
            return this.f17803e.message() + str + ':' + this.f17803e.lineNumber();
        }
    }

    static final class b extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ConsoleMessage f17804d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ConsoleMessage consoleMessage) {
            super(0);
            this.f17804d = consoleMessage;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strMessage = this.f17804d.message();
            kotlin.jvm.internal.t.e(strMessage, "consoleMessage.message()");
            return rd.c0.K(strMessage, "AppodealAlert:", "", false, 4, null);
        }
    }

    static final class c extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17805d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.f17805d = str;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(this.f17805d);
        }
    }

    static final class d extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17806d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.f17806d = str;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(this.f17806d);
        }
    }

    static final class e extends kotlin.jvm.internal.u implements id.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f17807d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f17807d = str;
        }

        @Override // id.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(this.f17807d);
        }
    }

    private final boolean a(JsResult jsResult) {
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || consoleMessage.message() == null) {
            return false;
        }
        b0 b0Var = b0.f17610a;
        if (b0Var.a()) {
            String strMessage = consoleMessage.message();
            kotlin.jvm.internal.t.e(strMessage, "consoleMessage.message()");
            if (!rd.f0.U(strMessage, "Uncaught ReferenceError", false, 2, null)) {
                b0.c("JS console", new a(consoleMessage.sourceId(), consoleMessage));
            }
        }
        if (!b0Var.b()) {
            return true;
        }
        String strMessage2 = consoleMessage.message();
        kotlin.jvm.internal.t.e(strMessage2, "consoleMessage.message()");
        if (!rd.f0.U(strMessage2, "AppodealAlert", false, 2, null)) {
            return true;
        }
        b0.e("Appodeal", new b(consoleMessage));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult result) {
        kotlin.jvm.internal.t.f(result, "result");
        b0.c("JS alert", new c(str2));
        return a(result);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult result) {
        kotlin.jvm.internal.t.f(result, "result");
        b0.c("JS confirm", new d(str2));
        return a(result);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult result) {
        kotlin.jvm.internal.t.f(result, "result");
        b0.c("JS prompt", new e(str2));
        return a(result);
    }
}

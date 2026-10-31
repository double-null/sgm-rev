package pb;

import android.content.Context;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f24119r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final l0 f24120s = l0.Center;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f24121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f24122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f24123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f24124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Float f24125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Float f24126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0 f24127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f24128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Float f24129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Integer f24130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Integer f24131k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w0 f24132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Float f24133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f24134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Float f24135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final l0 f24136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Integer f24137q;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public j(k kVar, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, g0 g0Var, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, w0 w0Var, Float f13, Integer num5, Float f14, l0 textHorizontalGravity) {
        kotlin.jvm.internal.t.f(textHorizontalGravity, "textHorizontalGravity");
        this.f24121a = kVar;
        Integer num6 = num;
        this.f24122b = num6;
        this.f24123c = bool;
        this.f24124d = bool2;
        this.f24125e = f10;
        this.f24126f = f11;
        this.f24127g = g0Var;
        this.f24128h = bool3;
        this.f24129i = f12;
        this.f24130j = num2;
        this.f24131k = num4;
        this.f24132l = w0Var;
        this.f24133m = f13;
        this.f24134n = num5;
        this.f24135o = f14;
        this.f24136p = textHorizontalGravity;
        this.f24137q = num3 != null ? num3 : num6;
    }

    public static /* synthetic */ int d(j jVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return jVar.c(i10);
    }

    public static /* synthetic */ int h(j jVar, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return jVar.g(context, i10);
    }

    public final k a() {
        return this.f24121a;
    }

    public final Integer b() {
        return this.f24122b;
    }

    public final int c(int i10) {
        Integer num = this.f24122b;
        return num != null ? num.intValue() : i10;
    }

    public final o e(Context context) {
        Integer numP;
        kotlin.jvm.internal.t.f(context, "context");
        if (!kotlin.jvm.internal.t.a(this.f24128h, Boolean.TRUE) || this.f24130j == null || (numP = p(context)) == null || numP.intValue() <= 0) {
            return null;
        }
        return new o(numP.intValue(), this.f24130j.intValue());
    }

    public final Boolean f() {
        return this.f24124d;
    }

    public final int g(Context context, int i10) {
        kotlin.jvm.internal.t.f(context, "context");
        Float f10 = this.f24133m;
        return f10 != null ? wb.e0.k(context, f10.floatValue()) : i10;
    }

    public final Integer i() {
        return this.f24137q;
    }

    public final Float j() {
        return this.f24126f;
    }

    public final g0 k() {
        return this.f24127g;
    }

    public final Float l() {
        return this.f24125e;
    }

    public final w0 m() {
        return this.f24132l;
    }

    public final Integer n() {
        return this.f24131k;
    }

    public final Integer o() {
        return this.f24130j;
    }

    public final Integer p(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        Float f10 = this.f24129i;
        if (f10 != null) {
            return Integer.valueOf(wb.e0.k(context, f10.floatValue()));
        }
        return null;
    }

    public final l0 q() {
        return this.f24136p;
    }

    public final Integer r(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        Float f10 = this.f24135o;
        if (f10 != null) {
            return Integer.valueOf(wb.e0.k(context, f10.floatValue()));
        }
        return null;
    }

    public final Integer s() {
        return this.f24134n;
    }

    public final Boolean t() {
        return this.f24123c;
    }

    public /* synthetic */ j(k kVar, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, g0 g0Var, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, w0 w0Var, Float f13, Integer num5, Float f14, l0 l0Var, int i10, kotlin.jvm.internal.k kVar2) {
        this((i10 & 1) != 0 ? null : kVar, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : f11, (i10 & 64) != 0 ? null : g0Var, (i10 & 128) != 0 ? null : bool3, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : f12, (i10 & 512) != 0 ? null : num2, (i10 & 1024) != 0 ? null : num3, (i10 & 2048) != 0 ? null : num4, (i10 & 4096) != 0 ? null : w0Var, (i10 & 8192) != 0 ? null : f13, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num5, (i10 & 32768) != 0 ? null : f14, (i10 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0 ? f24120s : l0Var);
    }
}

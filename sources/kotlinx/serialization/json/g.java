package kotlinx.serialization.json;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;

/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f21592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f21595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f21596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f21597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f21598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f21599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f21600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f21601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f21602p;

    public g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, a classDiscriminatorMode) {
        kotlin.jvm.internal.t.f(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.t.f(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.t.f(classDiscriminatorMode, "classDiscriminatorMode");
        this.f21587a = z10;
        this.f21588b = z11;
        this.f21589c = z12;
        this.f21590d = z13;
        this.f21591e = z14;
        this.f21592f = z15;
        this.f21593g = prettyPrintIndent;
        this.f21594h = z16;
        this.f21595i = z17;
        this.f21596j = classDiscriminator;
        this.f21597k = z18;
        this.f21598l = z19;
        this.f21599m = z20;
        this.f21600n = z21;
        this.f21601o = z22;
        this.f21602p = classDiscriminatorMode;
    }

    public final boolean a() {
        return this.f21601o;
    }

    public final boolean b() {
        return this.f21597k;
    }

    public final boolean c() {
        return this.f21590d;
    }

    public final boolean d() {
        return this.f21600n;
    }

    public final String e() {
        return this.f21596j;
    }

    public final a f() {
        return this.f21602p;
    }

    public final boolean g() {
        return this.f21594h;
    }

    public final boolean h() {
        return this.f21599m;
    }

    public final boolean i() {
        return this.f21587a;
    }

    public final boolean j() {
        return this.f21592f;
    }

    public final boolean k() {
        return this.f21588b;
    }

    public final z l() {
        return null;
    }

    public final boolean m() {
        return this.f21591e;
    }

    public final String n() {
        return this.f21593g;
    }

    public final boolean o() {
        return this.f21598l;
    }

    public final boolean p() {
        return this.f21595i;
    }

    public final boolean q() {
        return this.f21589c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f21587a + ", ignoreUnknownKeys=" + this.f21588b + ", isLenient=" + this.f21589c + ", allowStructuredMapKeys=" + this.f21590d + RHIpdOnfgiYkEj.NEdOE + this.f21591e + ", explicitNulls=" + this.f21592f + ", prettyPrintIndent='" + this.f21593g + "', coerceInputValues=" + this.f21594h + ", useArrayPolymorphism=" + this.f21595i + ", classDiscriminator='" + this.f21596j + "', allowSpecialFloatingPointValues=" + this.f21597k + ", useAlternativeNames=" + this.f21598l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f21599m + ", allowTrailingComma=" + this.f21600n + ", allowComments=" + this.f21601o + ", classDiscriminatorMode=" + this.f21602p + ')';
    }

    public /* synthetic */ g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, z zVar, boolean z20, boolean z21, boolean z22, a aVar, int i10, kotlin.jvm.internal.k kVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : zVar, (i10 & 8192) != 0 ? false : z20, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != 0 ? a.POLYMORPHIC : aVar);
    }
}

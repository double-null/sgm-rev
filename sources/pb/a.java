package pb;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f23878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b1 f23879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f23882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f23883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f23884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f23885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ob.g f23886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f23887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s f23888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f23889l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f23890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f23891n;

    public a(b adElementType, String name, b1 b1Var, String str, String str2, String str3, a0 elementLayoutParams, j appearanceParams, Map<String, String> customParams, Map<f, h> animationParams, ob.g gVar, List<q0> list, s sVar, List<f1> list2) {
        kotlin.jvm.internal.t.f(adElementType, "adElementType");
        kotlin.jvm.internal.t.f(name, "name");
        kotlin.jvm.internal.t.f(elementLayoutParams, "elementLayoutParams");
        kotlin.jvm.internal.t.f(appearanceParams, "appearanceParams");
        kotlin.jvm.internal.t.f(customParams, "customParams");
        kotlin.jvm.internal.t.f(animationParams, "animationParams");
        this.f23878a = adElementType;
        this.f23879b = b1Var;
        this.f23880c = str;
        this.f23881d = str2;
        this.f23882e = elementLayoutParams;
        this.f23883f = appearanceParams;
        this.f23884g = customParams;
        this.f23885h = animationParams;
        this.f23886i = gVar;
        this.f23887j = list;
        this.f23888k = sVar;
        this.f23889l = list2;
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.t.e(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f23890m = lowerCase;
        this.f23891n = str3 != null ? str3 : str;
    }

    public final b a() {
        return this.f23878a;
    }

    public final Map<f, h> b() {
        return this.f23885h;
    }

    public final j c() {
        return this.f23883f;
    }

    public final s d() {
        return this.f23888k;
    }

    public final String e(String key) {
        kotlin.jvm.internal.t.f(key, "key");
        return (String) this.f23884g.get(key);
    }

    public final Map<String, String> f() {
        return this.f23884g;
    }

    public final a0 g() {
        return this.f23882e;
    }

    public final ob.g h() {
        return this.f23886i;
    }

    public final List<q0> i() {
        return this.f23887j;
    }

    public final String j() {
        return this.f23890m;
    }

    public final String k() {
        return this.f23881d;
    }

    public final b1 l() {
        return this.f23879b;
    }

    public final List<f1> m() {
        return this.f23889l;
    }

    public final String n() {
        return this.f23880c;
    }

    public final String o() {
        return this.f23891n;
    }

    public /* synthetic */ a(b bVar, String str, b1 b1Var, String str2, String str3, String str4, a0 a0Var, j jVar, Map map, Map map2, ob.g gVar, List list, s sVar, List list2, int i10, kotlin.jvm.internal.k kVar) {
        this(bVar, str, (i10 & 4) != 0 ? null : b1Var, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, a0Var, jVar, (i10 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? new HashMap() : map, (i10 & 512) != 0 ? new EnumMap(f.class) : map2, (i10 & 1024) != 0 ? null : gVar, (i10 & 2048) != 0 ? null : list, (i10 & 4096) != 0 ? null : sVar, (i10 & 8192) != 0 ? null : list2);
    }
}

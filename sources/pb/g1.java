package pb;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1 f24087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24088b;

    public g1(h1 targetSideType, String targetName) {
        kotlin.jvm.internal.t.f(targetSideType, "targetSideType");
        kotlin.jvm.internal.t.f(targetName, "targetName");
        this.f24087a = targetSideType;
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.t.e(ENGLISH, "ENGLISH");
        String lowerCase = targetName.toLowerCase(ENGLISH);
        kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f24088b = lowerCase;
    }

    public final String a() {
        return this.f24088b;
    }

    public final h1 b() {
        return this.f24087a;
    }
}

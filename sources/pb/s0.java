package pb;

import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24216a;

    public s0(String name) {
        kotlin.jvm.internal.t.f(name, "name");
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.t.e(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f24216a = lowerCase;
    }

    public final String a() {
        return this.f24216a;
    }
}

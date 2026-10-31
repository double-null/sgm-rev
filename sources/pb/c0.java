package pb;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f23964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23966c;

    public c0(f0 eventType, String source, List<d0> eventTaskParamsList) {
        kotlin.jvm.internal.t.f(eventType, "eventType");
        kotlin.jvm.internal.t.f(source, "source");
        kotlin.jvm.internal.t.f(eventTaskParamsList, "eventTaskParamsList");
        this.f23964a = eventType;
        this.f23965b = eventTaskParamsList;
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.t.e(ENGLISH, "ENGLISH");
        String lowerCase = source.toLowerCase(ENGLISH);
        kotlin.jvm.internal.t.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.f23966c = lowerCase;
    }

    public final List<d0> a() {
        return this.f23965b;
    }

    public final f0 b() {
        return this.f23964a;
    }

    public final String c() {
        return this.f23966c;
    }
}

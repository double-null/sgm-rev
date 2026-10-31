package b4;

import java.util.Locale;

/* JADX INFO: compiled from: SessionGenerator.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y0 f4000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f4001b;

    public p0(y0 timeProvider, a1 uuidGenerator) {
        kotlin.jvm.internal.t.f(timeProvider, "timeProvider");
        kotlin.jvm.internal.t.f(uuidGenerator, "uuidGenerator");
        this.f4000a = timeProvider;
        this.f4001b = uuidGenerator;
    }

    private final String b() {
        String string = this.f4001b.next().toString();
        kotlin.jvm.internal.t.e(string, "toString(...)");
        String lowerCase = rd.c0.K(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.t.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final j0 a(j0 j0Var) {
        String strA;
        String strB = b();
        return new j0(strB, (j0Var == null || (strA = j0Var.a()) == null) ? strB : strA, j0Var != null ? j0Var.c() + 1 : 0, this.f4000a.a().b());
    }
}

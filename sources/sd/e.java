package sd;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
class e {
    public static final double a(double d10, d sourceUnit, d targetUnit) {
        t.f(sourceUnit, "sourceUnit");
        t.f(targetUnit, "targetUnit");
        long jConvert = targetUnit.c().convert(1L, sourceUnit.c());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.c().convert(1L, targetUnit.c());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        t.f(sourceUnit, "sourceUnit");
        t.f(targetUnit, "targetUnit");
        return targetUnit.c().convert(j10, sourceUnit.c());
    }

    public static final long c(long j10, d sourceUnit, d targetUnit) {
        t.f(sourceUnit, "sourceUnit");
        t.f(targetUnit, "targetUnit");
        return targetUnit.c().convert(j10, sourceUnit.c());
    }
}

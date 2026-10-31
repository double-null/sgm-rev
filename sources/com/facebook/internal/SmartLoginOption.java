package com.facebook.internal;

import java.util.EnumSet;

/* JADX INFO: compiled from: SmartLoginOption.kt */
/* JADX INFO: loaded from: classes.dex */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<SmartLoginOption> ALL;
    public static final Companion Companion = new Companion(null);
    private final long value;

    /* JADX INFO: compiled from: SmartLoginOption.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final EnumSet<SmartLoginOption> parseOptions(long j10) {
            EnumSet<SmartLoginOption> result = EnumSet.noneOf(SmartLoginOption.class);
            for (SmartLoginOption smartLoginOption : SmartLoginOption.ALL) {
                if ((smartLoginOption.getValue() & j10) != 0) {
                    result.add(smartLoginOption);
                }
            }
            kotlin.jvm.internal.t.e(result, "result");
            return result;
        }
    }

    static {
        EnumSet<SmartLoginOption> enumSetAllOf = EnumSet.allOf(SmartLoginOption.class);
        kotlin.jvm.internal.t.e(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        ALL = enumSetAllOf;
    }

    SmartLoginOption(long j10) {
        this.value = j10;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j10) {
        return Companion.parseOptions(j10);
    }

    public final long getValue() {
        return this.value;
    }
}

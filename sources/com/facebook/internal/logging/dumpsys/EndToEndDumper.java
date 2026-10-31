package com.facebook.internal.logging.dumpsys;

import java.io.PrintWriter;

/* JADX INFO: compiled from: EndToEndDumper.kt */
/* JADX INFO: loaded from: classes.dex */
public interface EndToEndDumper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: EndToEndDumper.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static EndToEndDumper instance;

        private Companion() {
        }

        public final EndToEndDumper getInstance() {
            return instance;
        }

        public final void setInstance(EndToEndDumper endToEndDumper) {
            instance = endToEndDumper;
        }
    }

    boolean maybeDump(String str, PrintWriter printWriter, String[] strArr);
}

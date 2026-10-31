package io.bidmachine.analytics;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ReaderConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f16774e;

    public interface Rule {

        public static final class GeneralRule implements Rule {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f16775a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f16776b;

            public GeneralRule(String str, String str2) {
                this.f16775a = str;
                this.f16776b = str2;
            }

            public final String getPath() {
                return this.f16776b;
            }

            public final String getTag() {
                return this.f16775a;
            }
        }

        public static final class PurRule implements Rule {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f16777a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f16778b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f16779c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final boolean f16780d;

            public PurRule(String str, String str2, String str3, boolean z10) {
                this.f16777a = str;
                this.f16778b = str2;
                this.f16779c = str3;
                this.f16780d = z10;
            }

            public final String getPath() {
                return this.f16778b;
            }

            public final String getQuery() {
                return this.f16779c;
            }

            public final boolean getShouldReport() {
                return this.f16780d;
            }

            public final String getTag() {
                return this.f16777a;
            }
        }
    }

    public ReaderConfig(String str, String str2, long j10, boolean z10, List<? extends Rule> list) {
        this.f16770a = str;
        this.f16771b = str2;
        this.f16772c = j10;
        this.f16773d = z10;
        this.f16774e = list;
    }

    public final long getInterval() {
        return this.f16772c;
    }

    public final String getName() {
        return this.f16770a;
    }

    public final List<Rule> getRules() {
        return this.f16774e;
    }

    public final boolean getUniqueOnly() {
        return this.f16773d;
    }

    public final String getUrl() {
        return this.f16771b;
    }
}

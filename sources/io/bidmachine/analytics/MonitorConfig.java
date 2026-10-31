package io.bidmachine.analytics;

import kotlin.jvm.internal.k;
import sd.a;
import sd.c;
import sd.d;

/* JADX INFO: loaded from: classes4.dex */
public final class MonitorConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f16764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Filter f16766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConfigExtension f16767g;

    public interface ConfigExtension {
    }

    public static final class ImpConfigExtension implements ConfigExtension {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f16768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f16769b;

        public /* synthetic */ ImpConfigExtension(String str, long j10, k kVar) {
            this(str, j10);
        }

        public final String getIaaQuery() {
            return this.f16768a;
        }

        /* JADX INFO: renamed from: getRecordsTtl-UwyO8pc, reason: not valid java name */
        public final long m385getRecordsTtlUwyO8pc() {
            return this.f16769b;
        }

        private ImpConfigExtension(String str, long j10) {
            this.f16768a = str;
            this.f16769b = j10;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ImpConfigExtension(String str, long j10, int i10, k kVar) {
            k kVar2 = null;
            str = (i10 & 1) != 0 ? null : str;
            if ((i10 & 2) != 0) {
                a.C0418a c0418a = a.f25407b;
                j10 = c.s(90, d.DAYS);
            }
            this(str, j10, kVar2);
        }
    }

    public MonitorConfig(String str, String str2, int i10, long j10, boolean z10, Filter filter, ConfigExtension configExtension) {
        this.f16761a = str;
        this.f16762b = str2;
        this.f16763c = i10;
        this.f16764d = j10;
        this.f16765e = z10;
        this.f16766f = filter;
        this.f16767g = configExtension;
    }

    public final int getBatchSize() {
        return this.f16763c;
    }

    public final ConfigExtension getConfigExtension() {
        return this.f16767g;
    }

    public final Filter getFilter() {
        return this.f16766f;
    }

    public final long getInterval() {
        return this.f16764d;
    }

    public final String getName() {
        return this.f16761a;
    }

    public final String getUrl() {
        return this.f16762b;
    }

    public final boolean isReportEnabled() {
        return this.f16765e;
    }

    public /* synthetic */ MonitorConfig(String str, String str2, int i10, long j10, boolean z10, Filter filter, ConfigExtension configExtension, int i11, k kVar) {
        this(str, str2, i10, j10, z10, filter, (i11 & 64) != 0 ? null : configExtension);
    }
}

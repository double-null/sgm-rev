package io.bidmachine.analytics;

import com.explorestack.protobuf.Struct;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AnalyticsConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f16733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Struct f16735e;

    public AnalyticsConfig(String str, List<MonitorConfig> list, List<ReaderConfig> list2, String str2, Struct struct) {
        this.f16731a = str;
        this.f16732b = list;
        this.f16733c = list2;
        this.f16734d = str2;
        this.f16735e = struct;
    }

    public final String getBpk() {
        return this.f16734d;
    }

    public final Struct getExtras() {
        return this.f16735e;
    }

    public final List<MonitorConfig> getMonitorConfigList() {
        return this.f16732b;
    }

    public final List<ReaderConfig> getReaderConfigList() {
        return this.f16733c;
    }

    public final String getSessionId() {
        return this.f16731a;
    }
}

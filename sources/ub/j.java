package ub;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: TrackEventInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f26703c;

    public j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f26701a = jCurrentTimeMillis;
        this.f26702b = jCurrentTimeMillis;
    }

    public Map<String, Object> a() {
        return this.f26703c;
    }

    public long b() {
        return this.f26702b;
    }

    public long c() {
        return this.f26701a;
    }

    public void d(long j10) {
        this.f26702b = Math.max(j10, this.f26701a);
    }

    public j e(String str, Object obj) {
        if (this.f26703c == null) {
            this.f26703c = new HashMap();
        }
        this.f26703c.put(str, obj);
        return this;
    }
}

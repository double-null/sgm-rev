package io.bidmachine.analytics.internal.g;

import java.util.Map;
import java.util.UUID;
import kotlin.collections.o0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f16891g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f16895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f16896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f16897f;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    public d(String str, String str2, String str3, long j10, Map map, h hVar) {
        this.f16892a = str;
        this.f16893b = str2;
        this.f16894c = str3;
        this.f16895d = j10;
        this.f16896e = map;
        this.f16897f = hVar;
    }

    public final d a(String str, String str2, String str3, long j10, Map map, h hVar) {
        return new d(str, str2, str3, j10, map, hVar);
    }

    public final h b() {
        return this.f16897f;
    }

    public final String c() {
        return this.f16892a;
    }

    public final String d() {
        return this.f16893b;
    }

    public final String e() {
        return this.f16894c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.a(this.f16892a, dVar.f16892a) && t.a(this.f16893b, dVar.f16893b) && t.a(this.f16894c, dVar.f16894c) && this.f16895d == dVar.f16895d && t.a(this.f16896e, dVar.f16896e) && t.a(this.f16897f, dVar.f16897f);
    }

    public final long f() {
        return this.f16895d;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f16892a.hashCode() * 31) + this.f16893b.hashCode()) * 31) + this.f16894c.hashCode()) * 31) + Long.hashCode(this.f16895d)) * 31) + this.f16896e.hashCode()) * 31;
        h hVar = this.f16897f;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "MonitorRecord(id=" + this.f16892a + ", name=" + this.f16893b + ", sessionId=" + this.f16894c + ", timestamp=" + this.f16895d + ", data=" + this.f16896e + ", error=" + this.f16897f + ')';
    }

    public static /* synthetic */ d a(d dVar, String str, String str2, String str3, long j10, Map map, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.f16892a;
        }
        if ((i10 & 2) != 0) {
            str2 = dVar.f16893b;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = dVar.f16894c;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            j10 = dVar.f16895d;
        }
        long j11 = j10;
        if ((i10 & 16) != 0) {
            map = dVar.f16896e;
        }
        Map map2 = map;
        if ((i10 & 32) != 0) {
            hVar = dVar.f16897f;
        }
        return dVar.a(str, str4, str5, j11, map2, hVar);
    }

    public final Map a() {
        return this.f16896e;
    }

    public /* synthetic */ d(String str, String str2, String str3, long j10, Map map, h hVar, int i10, k kVar) {
        this((i10 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, j10, (i10 & 16) != 0 ? o0.h() : map, (i10 & 32) != 0 ? null : hVar);
    }
}

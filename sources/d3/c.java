package d3;

import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: EventMetadata.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f13261c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        t.f(sessionId, "sessionId");
    }

    public final Map<String, String> a() {
        return this.f13261c;
    }

    public final String b() {
        return this.f13259a;
    }

    public final long c() {
        return this.f13260b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.a(this.f13259a, cVar.f13259a) && this.f13260b == cVar.f13260b && t.a(this.f13261c, cVar.f13261c);
    }

    public int hashCode() {
        return (((this.f13259a.hashCode() * 31) + Long.hashCode(this.f13260b)) * 31) + this.f13261c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f13259a + ", timestamp=" + this.f13260b + ", additionalCustomKeys=" + this.f13261c + ')';
    }

    public c(String sessionId, long j10, Map<String, String> additionalCustomKeys) {
        t.f(sessionId, "sessionId");
        t.f(additionalCustomKeys, "additionalCustomKeys");
        this.f13259a = sessionId;
        this.f13260b = j10;
        this.f13261c = additionalCustomKeys;
    }

    public /* synthetic */ c(String str, long j10, Map map, int i10, kotlin.jvm.internal.k kVar) {
        this(str, j10, (i10 & 4) != 0 ? o0.h() : map);
    }
}

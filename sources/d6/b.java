package d6;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f13337c;

    public b(String str, long j10, List<String> list) {
        this.f13335a = str;
        this.f13336b = j10;
        this.f13337c = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13335a.equals(bVar.f13335a) && this.f13336b == bVar.f13336b) {
            return this.f13337c.equals(bVar.f13337c);
        }
        return false;
    }

    public final int hashCode() {
        int iIntValue = Integer.valueOf(this.f13335a).intValue() * 31;
        long j10 = this.f13336b;
        return ((iIntValue + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f13337c.hashCode();
    }

    public final String toString() {
        return "AccessTokenVerificationResult{expiresInMillis=" + this.f13336b + ", channelId=" + this.f13335a + ", permissions=" + this.f13337c + '}';
    }
}

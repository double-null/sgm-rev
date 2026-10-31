package d6;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f13346b;

    public e(d dVar, List<String> list) {
        this.f13345a = dVar;
        this.f13346b = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13345a.equals(eVar.f13345a)) {
            return this.f13346b.equals(eVar.f13346b);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13345a.hashCode() * 31) + this.f13346b.hashCode();
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=" + ((Object) "#####") + ", permissions=" + this.f13346b + '}';
    }
}

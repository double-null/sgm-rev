package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: GetTopicsResponse.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f3027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f3028b;

    public d(List<f> topics, List<a> encryptedTopics) {
        t.f(topics, "topics");
        t.f(encryptedTopics, "encryptedTopics");
        this.f3027a = topics;
        this.f3028b = encryptedTopics;
    }

    public final List<f> a() {
        return this.f3027a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3027a.size() == dVar.f3027a.size() && this.f3028b.size() == dVar.f3028b.size()) {
            return t.a(new HashSet(this.f3027a), new HashSet(dVar.f3027a)) && t.a(new HashSet(this.f3028b), new HashSet(dVar.f3028b));
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f3027a, this.f3028b);
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f3027a + ", EncryptedTopics=" + this.f3028b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(List<f> topics) {
        this(topics, kotlin.collections.t.k());
        t.f(topics, "topics");
    }
}

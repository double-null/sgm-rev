package c4;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SessionSubscriber.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface d {

    /* JADX INFO: compiled from: SessionSubscriber.kt */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ bd.a f4734e = bd.b.a(b());
    }

    /* JADX INFO: compiled from: SessionSubscriber.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4735a;

        public b(String sessionId) {
            t.f(sessionId, "sessionId");
            this.f4735a = sessionId;
        }

        public final String a() {
            return this.f4735a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && t.a(this.f4735a, ((b) obj).f4735a);
        }

        public int hashCode() {
            return this.f4735a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f4735a + ')';
        }
    }

    boolean a();

    a b();

    void c(b bVar);
}

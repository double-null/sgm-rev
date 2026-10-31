package rd;

import java.util.List;

/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface l {

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class a {
        public static b a(l lVar) {
            return new b(lVar);
        }
    }

    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f25060a;

        public b(l match) {
            kotlin.jvm.internal.t.f(match, "match");
            this.f25060a = match;
        }

        public final l a() {
            return this.f25060a;
        }
    }

    b a();

    List<String> b();
}

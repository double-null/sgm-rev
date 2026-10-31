package c8;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: compiled from: PlayerId.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b2 f4806d = new b2("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f4809c;

    /* JADX INFO: compiled from: PlayerId.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f4810a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            x7.a.g(this.f4810a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f4810a = logSessionId;
        }
    }

    public b2(String str) {
        this.f4807a = str;
        this.f4808b = x7.l0.f28136a >= 31 ? new a() : null;
        this.f4809c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) x7.a.e(this.f4808b)).f4810a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) x7.a.e(this.f4808b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return Objects.equals(this.f4807a, b2Var.f4807a) && Objects.equals(this.f4808b, b2Var.f4808b) && Objects.equals(this.f4809c, b2Var.f4809c);
    }

    public int hashCode() {
        return Objects.hash(this.f4807a, this.f4808b, this.f4809c);
    }
}

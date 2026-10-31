package re;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.t;
import me.d0;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<d0> f25160a = new LinkedHashSet();

    public final synchronized void a(d0 route) {
        t.f(route, "route");
        this.f25160a.remove(route);
    }

    public final synchronized void b(d0 failedRoute) {
        t.f(failedRoute, "failedRoute");
        this.f25160a.add(failedRoute);
    }

    public final synchronized boolean c(d0 route) {
        t.f(route, "route");
        return this.f25160a.contains(route);
    }
}

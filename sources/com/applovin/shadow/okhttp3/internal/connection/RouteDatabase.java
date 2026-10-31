package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Route;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        t.f(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route failedRoute) {
        t.f(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        t.f(route, "route");
        return this.failedRoutes.contains(route);
    }
}

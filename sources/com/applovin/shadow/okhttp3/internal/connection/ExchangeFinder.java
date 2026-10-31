package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.Address;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Route;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.ExchangeCodec;
import com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain;
import com.applovin.shadow.okhttp3.internal.http2.ConnectionShutdownException;
import com.applovin.shadow.okhttp3.internal.http2.ErrorCode;
import com.applovin.shadow.okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        t.f(connectionPool, "connectionPool");
        t.f(address, "address");
        t.f(call, "call");
        t.f(eventListener, "eventListener");
        this.connectionPool = connectionPool;
        this.address = address;
        this.call = call;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0136  */
    /* JADX WARN: Code duplicated, block: B:60:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final RealConnection findConnection(int i10, int i11, int i12, int i13, boolean z10) throws IOException {
        List<Route> routes;
        RealConnection realConnection;
        Socket socketReleaseConnectionNoEvents$okhttp;
        if (this.call.isCanceled()) {
            throw new IOException("Canceled");
        }
        RealConnection connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                socketReleaseConnectionNoEvents$okhttp = (connection.getNoNewExchanges() || !sameHostAndPort(connection.route().address().url())) ? this.call.releaseConnectionNoEvents$okhttp() : null;
                g0 g0Var = g0.f27756a;
            }
            if (this.call.getConnection() != null) {
                if (socketReleaseConnectionNoEvents$okhttp == null) {
                    return connection;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            if (socketReleaseConnectionNoEvents$okhttp != null) {
                Util.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
            }
            this.eventListener.connectionReleased(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            RealConnection connection2 = this.call.getConnection();
            t.c(connection2);
            this.eventListener.connectionAcquired(this.call, connection2);
            return connection2;
        }
        Route next = this.nextRouteToTry;
        try {
            if (next == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null) {
                    t.c(selection);
                    if (selection.hasNext()) {
                        RouteSelector.Selection selection2 = this.routeSelection;
                        t.c(selection2);
                        next = selection2.next();
                    }
                    realConnection = new RealConnection(this.connectionPool, next);
                    this.call.setConnectionToCancel(realConnection);
                    realConnection.connect(i10, i11, i12, i13, z10, this.call, this.eventListener);
                    this.call.setConnectionToCancel(null);
                    this.call.getClient().getRouteDatabase().connected(realConnection.route());
                    if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                        RealConnection connection3 = this.call.getConnection();
                        t.c(connection3);
                        this.nextRouteToTry = next;
                        Util.closeQuietly(realConnection.socket());
                        this.eventListener.connectionAcquired(this.call, connection3);
                        return connection3;
                    }
                    synchronized (realConnection) {
                        this.connectionPool.put(realConnection);
                        this.call.acquireConnectionNoEvents(realConnection);
                        g0 g0Var2 = g0.f27756a;
                    }
                    this.eventListener.connectionAcquired(this.call, realConnection);
                    return realConnection;
                }
                RouteSelector routeSelector = this.routeSelector;
                if (routeSelector == null) {
                    routeSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                    this.routeSelector = routeSelector;
                }
                RouteSelector.Selection next2 = routeSelector.next();
                this.routeSelection = next2;
                routes = next2.getRoutes();
                if (this.call.isCanceled()) {
                    throw new IOException("Canceled");
                }
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                    RealConnection connection4 = this.call.getConnection();
                    t.c(connection4);
                    this.eventListener.connectionAcquired(this.call, connection4);
                    return connection4;
                }
                next = next2.next();
                realConnection = new RealConnection(this.connectionPool, next);
                this.call.setConnectionToCancel(realConnection);
                realConnection.connect(i10, i11, i12, i13, z10, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(realConnection.route());
                if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                    RealConnection connection5 = this.call.getConnection();
                    t.c(connection5);
                    this.nextRouteToTry = next;
                    Util.closeQuietly(realConnection.socket());
                    this.eventListener.connectionAcquired(this.call, connection5);
                    return connection5;
                }
                synchronized (realConnection) {
                    this.connectionPool.put(realConnection);
                    this.call.acquireConnectionNoEvents(realConnection);
                    g0 g0Var3 = g0.f27756a;
                    this.eventListener.connectionAcquired(this.call, realConnection);
                    return realConnection;
                }
            }
            t.c(next);
            this.nextRouteToTry = null;
            realConnection.connect(i10, i11, i12, i13, z10, this.call, this.eventListener);
            this.call.setConnectionToCancel(null);
            this.call.getClient().getRouteDatabase().connected(realConnection.route());
            if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                RealConnection connection6 = this.call.getConnection();
                t.c(connection6);
                this.nextRouteToTry = next;
                Util.closeQuietly(realConnection.socket());
                this.eventListener.connectionAcquired(this.call, connection6);
                return connection6;
            }
            synchronized (realConnection) {
                this.connectionPool.put(realConnection);
                this.call.acquireConnectionNoEvents(realConnection);
                g0 g0Var4 = g0.f27756a;
                this.eventListener.connectionAcquired(this.call, realConnection);
                return realConnection;
            }
        } catch (Throwable th) {
            this.call.setConnectionToCancel(null);
            throw th;
        }
        routes = null;
        realConnection = new RealConnection(this.connectionPool, next);
        this.call.setConnectionToCancel(realConnection);
    }

    private final RealConnection findHealthyConnection(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            RealConnection realConnectionFindConnection = findConnection(i10, i11, i12, i13, z10);
            if (realConnectionFindConnection.isHealthy(z11)) {
                return realConnectionFindConnection;
            }
            realConnectionFindConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                if (selection != null ? selection.hasNext() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (!(routeSelector != null ? routeSelector.hasNext() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return connection.route();
            }
            return null;
        }
    }

    public final ExchangeCodec find(OkHttpClient client, RealInterceptorChain chain) {
        t.f(client, "client");
        t.f(chain, "chain");
        try {
            return findHealthyConnection(chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis$okhttp(), chain.getWriteTimeoutMillis$okhttp(), client.pingIntervalMillis(), client.retryOnConnectionFailure(), !t.a(chain.getRequest$okhttp().method(), "GET")).newCodec$okhttp(client, chain);
        } catch (RouteException e10) {
            trackFailure(e10.getLastConnectException());
            throw e10;
        } catch (IOException e11) {
            trackFailure(e11);
            throw new RouteException(e11);
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        boolean z10 = false;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route routeRetryRoute = retryRoute();
        if (routeRetryRoute != null) {
            this.nextRouteToTry = routeRetryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            z10 = true;
        }
        if (z10 || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    public final boolean sameHostAndPort(HttpUrl url) {
        t.f(url, "url");
        HttpUrl httpUrlUrl = this.address.url();
        return url.port() == httpUrlUrl.port() && t.a(url.host(), httpUrlUrl.host());
    }

    public final void trackFailure(IOException e10) {
        t.f(e10, "e");
        this.nextRouteToTry = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}

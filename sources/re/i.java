package re;

import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.s;
import kotlin.collections.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.d0;
import me.r;
import me.u;

/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f25161i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final me.a f25162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f25163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final me.e f25164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f25165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<? extends Proxy> f25166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<? extends InetSocketAddress> f25168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<d0> f25169h;

    /* JADX INFO: compiled from: RouteSelector.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            t.f(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                t.e(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            t.e(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* JADX INFO: compiled from: RouteSelector.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d0> f25170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25171b;

        public b(List<d0> routes) {
            t.f(routes, "routes");
            this.f25170a = routes;
        }

        public final List<d0> a() {
            return this.f25170a;
        }

        public final boolean b() {
            return this.f25171b < this.f25170a.size();
        }

        public final d0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<d0> list = this.f25170a;
            int i10 = this.f25171b;
            this.f25171b = i10 + 1;
            return list.get(i10);
        }
    }

    public i(me.a address, h routeDatabase, me.e call, r eventListener) {
        t.f(address, "address");
        t.f(routeDatabase, "routeDatabase");
        t.f(call, "call");
        t.f(eventListener, "eventListener");
        this.f25162a = address;
        this.f25163b = routeDatabase;
        this.f25164c = call;
        this.f25165d = eventListener;
        this.f25166e = kotlin.collections.t.k();
        this.f25168g = kotlin.collections.t.k();
        this.f25169h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f25167f < this.f25166e.size();
    }

    private final void e(Proxy proxy) throws IOException {
        String strH;
        int iL;
        ArrayList arrayList = new ArrayList();
        this.f25168g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f25162a.l().h();
            iL = this.f25162a.l().l();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(t.n("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
            }
            a aVar = f25161i;
            t.e(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strH = aVar.a(inetSocketAddress);
            iL = inetSocketAddress.getPort();
        }
        boolean z10 = false;
        if (1 <= iL && iL < 65536) {
            z10 = true;
        }
        if (!z10) {
            throw new SocketException("No route to " + strH + ':' + iL + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iL));
            return;
        }
        this.f25165d.n(this.f25164c, strH);
        List<InetAddress> listLookup = this.f25162a.c().lookup(strH);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.f25162a.c() + " returned no addresses for " + strH);
        }
        this.f25165d.m(this.f25164c, strH, listLookup);
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iL));
        }
    }

    private final void f(u uVar, Proxy proxy) {
        this.f25165d.p(this.f25164c, uVar);
        List<Proxy> listG = g(proxy, uVar, this);
        this.f25166e = listG;
        this.f25167f = 0;
        this.f25165d.o(this.f25164c, uVar, listG);
    }

    private static final List<Proxy> g(Proxy proxy, u uVar, i iVar) {
        if (proxy != null) {
            return s.e(proxy);
        }
        URI uriQ = uVar.q();
        if (uriQ.getHost() == null) {
            return ne.d.w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = iVar.f25162a.i().select(uriQ);
        if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
            return ne.d.w(Proxy.NO_PROXY);
        }
        t.e(proxiesOrNull, "proxiesOrNull");
        return ne.d.T(proxiesOrNull);
    }

    public final boolean a() {
        return b() || (this.f25169h.isEmpty() ^ true);
    }

    public final b c() throws IOException {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator<? extends InetSocketAddress> it = this.f25168g.iterator();
            while (it.hasNext()) {
                d0 d0Var = new d0(this.f25162a, proxyD, it.next());
                if (this.f25163b.c(d0Var)) {
                    this.f25169h.add(d0Var);
                } else {
                    arrayList.add(d0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            y.z(arrayList, this.f25169h);
            this.f25169h.clear();
        }
        return new b(arrayList);
    }

    private final Proxy d() throws IOException {
        if (b()) {
            List<? extends Proxy> list = this.f25166e;
            int i10 = this.f25167f;
            this.f25167f = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f25162a.l().h() + vgmm.BhPQDpLYxoisyaW + this.f25166e);
    }
}

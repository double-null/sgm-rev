package oe;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.b0;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import me.b;
import me.d0;
import me.h;
import me.o;
import me.q;
import me.u;
import me.z;
import rd.c0;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f23395d;

    /* JADX INFO: renamed from: oe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JavaNetAuthenticator.kt */
    public /* synthetic */ class C0386a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(q defaultDns) {
        t.f(defaultDns, "defaultDns");
        this.f23395d = defaultDns;
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0386a.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return (InetAddress) b0.O(qVar.lookup(uVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        t.e(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // me.b
    public z a(d0 d0Var, me.b0 response) throws IOException {
        me.a aVarA;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        t.f(response, "response");
        List<h> listF = response.f();
        z zVarG = response.G();
        u uVarJ = zVarG.j();
        boolean z10 = response.h() == 407;
        Proxy proxy = d0Var == null ? null : d0Var.b();
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : listF) {
            if (c0.B("Basic", hVar.c(), true)) {
                q qVarC = (d0Var == null || (aVarA = d0Var.a()) == null) ? null : aVarA.c();
                if (qVarC == null) {
                    qVarC = this.f23395d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    t.e(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, uVarJ, qVarC), inetSocketAddress.getPort(), uVarJ.p(), hVar.b(), hVar.c(), uVarJ.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = uVarJ.h();
                    t.e(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxy, uVarJ, qVarC), uVarJ.l(), uVarJ.p(), hVar.b(), hVar.c(), uVarJ.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    t.e(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    t.e(password, "auth.password");
                    return zVarG.i().e(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(q qVar, int i10, k kVar) {
        this((i10 & 1) != 0 ? q.f22523b : qVar);
    }
}

package e1;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: compiled from: JavaScriptReplyProxyImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class k extends d1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsReplyProxyBoundaryInterface f13875a;

    public k(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f13875a = jsReplyProxyBoundaryInterface;
    }

    public static k b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) cf.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (k) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: e1.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.c(jsReplyProxyBoundaryInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) throws Exception {
        return new k(jsReplyProxyBoundaryInterface);
    }
}

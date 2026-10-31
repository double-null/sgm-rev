package e1;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: compiled from: ScriptHandlerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class n implements d1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScriptHandlerBoundaryInterface f13879a;

    private n(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f13879a = scriptHandlerBoundaryInterface;
    }

    public static n a(InvocationHandler invocationHandler) {
        return new n((ScriptHandlerBoundaryInterface) cf.a.a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}

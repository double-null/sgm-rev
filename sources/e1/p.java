package e1;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: compiled from: WebMessageAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class p implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f13883a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static d1.e[] a(InvocationHandler[] invocationHandlerArr) {
        d1.e[] eVarArr = new d1.e[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            eVarArr[i10] = new r(invocationHandlerArr[i10]);
        }
        return eVarArr;
    }

    public static d1.d b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        d1.e[] eVarArrA = a(webMessageBoundaryInterface.getPorts());
        if (!s.C.c()) {
            return new d1.d(webMessageBoundaryInterface.getData(), eVarArrA);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) cf.a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new d1.d(webMessagePayloadBoundaryInterface.getAsString(), eVarArrA);
        }
        if (type != 1) {
            return null;
        }
        return new d1.d(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), eVarArrA);
    }
}

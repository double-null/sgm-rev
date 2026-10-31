package io.bidmachine;

import com.explorestack.protobuf.openrtb.Response;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: NetworkRequestManager.java */
/* JADX INFO: loaded from: classes4.dex */
class u4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile u4 f20449c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20450a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<String, io.bidmachine.core.b<?, Response, oc.a>> f20451b = new HashMap();

    u4() {
    }

    public static u4 b() {
        u4 u4Var = f20449c;
        if (u4Var == null) {
            synchronized (u4.class) {
                u4Var = f20449c;
                if (u4Var == null) {
                    u4Var = new u4();
                    f20449c = u4Var;
                }
            }
        }
        return u4Var;
    }

    public void a(String str, io.bidmachine.core.b<?, Response, oc.a> bVar) {
        synchronized (this.f20450a) {
            this.f20451b.put(str, bVar);
        }
    }

    public io.bidmachine.core.b<?, Response, oc.a> c(String str) {
        io.bidmachine.core.b<?, Response, oc.a> bVarRemove;
        synchronized (this.f20450a) {
            bVarRemove = this.f20451b.remove(str);
        }
        return bVarRemove;
    }
}

package com.vungle.ads.internal.model;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: AppNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class AppNode {
    public static final Companion Companion = new Companion(null);
    private final String appId;
    private final String bundle;
    private final String ver;

    /* JADX INFO: compiled from: AppNode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<AppNode> serializer() {
            return AppNode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppNode(int i10, String str, String str2, String str3, q2 q2Var) {
        if (7 != (i10 & 7)) {
            b2.a(i10, 7, AppNode$$serializer.INSTANCE.getDescriptor());
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ AppNode copy$default(AppNode appNode, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appNode.bundle;
        }
        if ((i10 & 2) != 0) {
            str2 = appNode.ver;
        }
        if ((i10 & 4) != 0) {
            str3 = appNode.appId;
        }
        return appNode.copy(str, str2, str3);
    }

    public static final void write$Self(AppNode self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        output.A(serialDesc, 0, self.bundle);
        output.A(serialDesc, 1, self.ver);
        output.A(serialDesc, 2, self.appId);
    }

    public final String component1() {
        return this.bundle;
    }

    public final String component2() {
        return this.ver;
    }

    public final String component3() {
        return this.appId;
    }

    public final AppNode copy(String bundle, String ver, String appId) {
        t.f(bundle, "bundle");
        t.f(ver, "ver");
        t.f(appId, "appId");
        return new AppNode(bundle, ver, appId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppNode)) {
            return false;
        }
        AppNode appNode = (AppNode) obj;
        return t.a(this.bundle, appNode.bundle) && t.a(this.ver, appNode.ver) && t.a(this.appId, appNode.appId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return (((this.bundle.hashCode() * 31) + this.ver.hashCode()) * 31) + this.appId.hashCode();
    }

    public String toString() {
        return "AppNode(bundle=" + this.bundle + ", ver=" + this.ver + ", appId=" + this.appId + ')';
    }

    public AppNode(String bundle, String ver, String appId) {
        t.f(bundle, "bundle");
        t.f(ver, "ver");
        t.f(appId, "appId");
        this.bundle = bundle;
        this.ver = ver;
        this.appId = appId;
    }

    public static /* synthetic */ void getAppId$annotations() {
    }
}

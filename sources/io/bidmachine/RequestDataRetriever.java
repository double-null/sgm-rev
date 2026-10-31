package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.App;

/* JADX INFO: compiled from: RequestDataRetriever.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RequestDataRetriever {
    public static final RequestDataRetriever INSTANCE = new RequestDataRetriever();

    private RequestDataRetriever() {
    }

    public static final Context collectContext(android.content.Context context, b2 bidMachineImpl, w5 userRestrictionParams, TargetingParams targetingParams, ConnectionType connectionType, AdsType adsType) {
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(bidMachineImpl, "bidMachineImpl");
        kotlin.jvm.internal.t.f(userRestrictionParams, "userRestrictionParams");
        kotlin.jvm.internal.t.f(targetingParams, "targetingParams");
        Context.Builder builderNewBuilder = Context.newBuilder();
        kotlin.jvm.internal.t.e(builderNewBuilder, "newBuilder()");
        Context.App.Builder builderNewBuilder2 = Context.App.newBuilder();
        kotlin.jvm.internal.t.e(builderNewBuilder2, "newBuilder()");
        Publisher publisherO = bidMachineImpl.o();
        if (publisherO != null) {
            publisherO.build(builderNewBuilder2);
        }
        bidMachineImpl.h().build(context, builderNewBuilder2);
        targetingParams.build(builderNewBuilder2);
        App.Builder builderNewBuilder3 = App.newBuilder();
        kotlin.jvm.internal.t.e(builderNewBuilder3, "newBuilder()");
        targetingParams.fillAppExtension(builderNewBuilder3);
        bidMachineImpl.l().fill(builderNewBuilder3);
        long jL = bidMachineImpl.L(context);
        if (jL > 0) {
            builderNewBuilder3.setFirstLaunchTime(oc.h.p(jL));
        }
        long jQ = bidMachineImpl.q(context);
        if (jQ > 0) {
            builderNewBuilder3.setSdkInstallTime(oc.h.p(jQ));
        }
        builderNewBuilder2.addExtProto(Any.pack(builderNewBuilder3.build()));
        builderNewBuilder.setApp(builderNewBuilder2);
        BlockedParams blockedParams = targetingParams.getBlockedParams();
        if (blockedParams != null) {
            Context.Restrictions.Builder builderNewBuilder4 = Context.Restrictions.newBuilder();
            blockedParams.build(builderNewBuilder4);
            builderNewBuilder.setRestrictions(builderNewBuilder4);
        }
        Context.User.Builder builderNewBuilder5 = Context.User.newBuilder();
        kotlin.jvm.internal.t.e(builderNewBuilder5, "newBuilder()");
        userRestrictionParams.e(builderNewBuilder5);
        if (userRestrictionParams.g()) {
            targetingParams.build(builderNewBuilder5);
        }
        bidMachineImpl.s().h(context, builderNewBuilder5, adsType);
        builderNewBuilder.setUser(builderNewBuilder5);
        Context.Regs.Builder builderNewBuilder6 = Context.Regs.newBuilder();
        kotlin.jvm.internal.t.e(builderNewBuilder6, "newBuilder()");
        userRestrictionParams.d(builderNewBuilder6);
        builderNewBuilder.setRegs(builderNewBuilder6);
        bidMachineImpl.i().d(context, builderNewBuilder, targetingParams, bidMachineImpl.u(), userRestrictionParams, connectionType);
        Context contextBuild = builderNewBuilder.build();
        kotlin.jvm.internal.t.e(contextBuild, "contextBuilder.build()");
        return contextBuild;
    }
}

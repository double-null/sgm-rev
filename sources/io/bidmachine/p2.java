package io.bidmachine;

import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.Device;

/* JADX INFO: compiled from: DeviceConnectionParams.java */
/* JADX INFO: loaded from: classes4.dex */
final class p2 {
    p2() {
    }

    private Context.Device.Connection c(android.content.Context context, ConnectionType connectionType) {
        Context.Device.Connection.Builder builderNewBuilder = Context.Device.Connection.newBuilder();
        builderNewBuilder.setType(connectionType);
        builderNewBuilder.setVpn(oc.d.p(context));
        builderNewBuilder.setProxy(oc.d.i(context));
        return builderNewBuilder.build();
    }

    void a(android.content.Context context, Context.Device.Builder builder, ConnectionType connectionType) {
        builder.setConnection(c(context, connectionType));
    }

    void b(android.content.Context context, Device.Builder builder, ConnectionType connectionType) {
        builder.setConnection(c(context, connectionType));
    }
}

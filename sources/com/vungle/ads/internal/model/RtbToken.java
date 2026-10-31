package com.vungle.ads.internal.model;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class RtbToken {
    public static final Companion Companion = new Companion(null);
    private final DeviceNode device;
    private final CommonRequestBody.RequestExt ext;
    private final int ordinalView;
    private final RtbRequest request;
    private final CommonRequestBody.User user;

    /* JADX INFO: compiled from: RtbToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<RtbToken> serializer() {
            return RtbToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RtbToken(int i10, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i11, q2 q2Var) {
        if (17 != (i10 & 17)) {
            b2.a(i10, 17, RtbToken$$serializer.INSTANCE.getDescriptor());
        }
        this.device = deviceNode;
        if ((i10 & 2) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i10 & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i10 & 8) == 0) {
            this.request = null;
        } else {
            this.request = rtbRequest;
        }
        this.ordinalView = i11;
    }

    public static /* synthetic */ RtbToken copy$default(RtbToken rtbToken, DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deviceNode = rtbToken.device;
        }
        if ((i11 & 2) != 0) {
            user = rtbToken.user;
        }
        CommonRequestBody.User user2 = user;
        if ((i11 & 4) != 0) {
            requestExt = rtbToken.ext;
        }
        CommonRequestBody.RequestExt requestExt2 = requestExt;
        if ((i11 & 8) != 0) {
            rtbRequest = rtbToken.request;
        }
        RtbRequest rtbRequest2 = rtbRequest;
        if ((i11 & 16) != 0) {
            i10 = rtbToken.ordinalView;
        }
        return rtbToken.copy(deviceNode, user2, requestExt2, rtbRequest2, i10);
    }

    public static final void write$Self(RtbToken self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
        output.E(serialDesc, 0, DeviceNode$$serializer.INSTANCE, self.device);
        if (output.w(serialDesc, 1) || self.user != null) {
            output.o(serialDesc, 1, CommonRequestBody$User$$serializer.INSTANCE, self.user);
        }
        if (output.w(serialDesc, 2) || self.ext != null) {
            output.o(serialDesc, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, self.ext);
        }
        if (output.w(serialDesc, 3) || self.request != null) {
            output.o(serialDesc, 3, RtbRequest$$serializer.INSTANCE, self.request);
        }
        output.h(serialDesc, 4, self.ordinalView);
    }

    public final DeviceNode component1() {
        return this.device;
    }

    public final CommonRequestBody.User component2() {
        return this.user;
    }

    public final CommonRequestBody.RequestExt component3() {
        return this.ext;
    }

    public final RtbRequest component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    public final RtbToken copy(DeviceNode device, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10) {
        t.f(device, "device");
        return new RtbToken(device, user, requestExt, rtbRequest, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtbToken)) {
            return false;
        }
        RtbToken rtbToken = (RtbToken) obj;
        return t.a(this.device, rtbToken.device) && t.a(this.user, rtbToken.user) && t.a(this.ext, rtbToken.ext) && t.a(this.request, rtbToken.request) && this.ordinalView == rtbToken.ordinalView;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final CommonRequestBody.RequestExt getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final RtbRequest getRequest() {
        return this.request;
    }

    public final CommonRequestBody.User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        CommonRequestBody.User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        CommonRequestBody.RequestExt requestExt = this.ext;
        int iHashCode3 = (iHashCode2 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RtbRequest rtbRequest = this.request;
        return ((iHashCode3 + (rtbRequest != null ? rtbRequest.hashCode() : 0)) * 31) + Integer.hashCode(this.ordinalView);
    }

    public String toString() {
        return "RtbToken(device=" + this.device + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ", ordinalView=" + this.ordinalView + ')';
    }

    public RtbToken(DeviceNode device, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10) {
        t.f(device, "device");
        this.device = device;
        this.user = user;
        this.ext = requestExt;
        this.request = rtbRequest;
        this.ordinalView = i10;
    }

    public /* synthetic */ RtbToken(DeviceNode deviceNode, CommonRequestBody.User user, CommonRequestBody.RequestExt requestExt, RtbRequest rtbRequest, int i10, int i11, k kVar) {
        this(deviceNode, (i11 & 2) != 0 ? null : user, (i11 & 4) != 0 ? null : requestExt, (i11 & 8) != 0 ? null : rtbRequest, i10);
    }

    public static /* synthetic */ void getOrdinalView$annotations() {
    }
}

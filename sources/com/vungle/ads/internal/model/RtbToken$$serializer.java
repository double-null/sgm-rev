package com.vungle.ads.internal.model;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.q2;
import je.u0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RtbToken$$serializer implements l0<RtbToken> {
    public static final RtbToken$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        RtbToken$$serializer rtbToken$$serializer = new RtbToken$$serializer();
        INSTANCE = rtbToken$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.RtbToken", rtbToken$$serializer, 5);
        g2Var.p(DeviceRequestsHelper.DEVICE_INFO_DEVICE, false);
        g2Var.p("user", true);
        g2Var.p("ext", true);
        g2Var.p("request", true);
        g2Var.p("ordinal_view", false);
        descriptor = g2Var;
    }

    private RtbToken$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{DeviceNode$$serializer.INSTANCE, a.t(CommonRequestBody$User$$serializer.INSTANCE), a.t(CommonRequestBody$RequestExt$$serializer.INSTANCE), a.t(RtbRequest$$serializer.INSTANCE), u0.f21014a};
    }

    @Override // fe.c
    public RtbToken deserialize(e decoder) {
        Object objD;
        int i10;
        Object objD2;
        Object objD3;
        int iX;
        Object objF;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            objF = cVarB.F(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objD2 = cVarB.D(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, null);
            Object objD4 = cVarB.D(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objD3 = cVarB.D(descriptor2, 3, RtbRequest$$serializer.INSTANCE, null);
            iX = cVarB.x(descriptor2, 4);
            objD = objD4;
            i10 = 31;
        } else {
            boolean z10 = true;
            int iX2 = 0;
            Object objF2 = null;
            Object objD5 = null;
            objD = null;
            Object objD6 = null;
            int i11 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objF2 = cVarB.F(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objF2);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD5 = cVarB.D(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, objD5);
                    i11 |= 2;
                } else if (iF == 2) {
                    objD = cVarB.D(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, objD);
                    i11 |= 4;
                } else if (iF == 3) {
                    objD6 = cVarB.D(descriptor2, 3, RtbRequest$$serializer.INSTANCE, objD6);
                    i11 |= 8;
                } else {
                    if (iF != 4) {
                        throw new UnknownFieldException(iF);
                    }
                    iX2 = cVarB.x(descriptor2, 4);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objD2 = objD5;
            objD3 = objD6;
            iX = iX2;
            objF = objF2;
        }
        cVarB.c(descriptor2);
        return new RtbToken(i10, (DeviceNode) objF, (CommonRequestBody.User) objD2, (CommonRequestBody.RequestExt) objD, (RtbRequest) objD3, iX, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, RtbToken value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        RtbToken.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

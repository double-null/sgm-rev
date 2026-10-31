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
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonRequestBody$$serializer implements l0<CommonRequestBody> {
    public static final CommonRequestBody$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$$serializer commonRequestBody$$serializer = new CommonRequestBody$$serializer();
        INSTANCE = commonRequestBody$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody", commonRequestBody$$serializer, 5);
        g2Var.p(DeviceRequestsHelper.DEVICE_INFO_DEVICE, false);
        g2Var.p("app", true);
        g2Var.p("user", true);
        g2Var.p("ext", true);
        g2Var.p("request", true);
        descriptor = g2Var;
    }

    private CommonRequestBody$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{DeviceNode$$serializer.INSTANCE, a.t(AppNode$$serializer.INSTANCE), a.t(CommonRequestBody$User$$serializer.INSTANCE), a.t(CommonRequestBody$RequestExt$$serializer.INSTANCE), a.t(CommonRequestBody$RequestParam$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public CommonRequestBody deserialize(e decoder) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        int i10;
        Object objF;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objF2 = null;
        if (cVarB.q()) {
            objF = cVarB.F(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objD = cVarB.D(descriptor2, 1, AppNode$$serializer.INSTANCE, null);
            objD2 = cVarB.D(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, null);
            objD3 = cVarB.D(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objD4 = cVarB.D(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objD5 = null;
            Object objD6 = null;
            Object objD7 = null;
            Object objD8 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objF2 = cVarB.F(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objF2);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD5 = cVarB.D(descriptor2, 1, AppNode$$serializer.INSTANCE, objD5);
                    i11 |= 2;
                } else if (iF == 2) {
                    objD6 = cVarB.D(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, objD6);
                    i11 |= 4;
                } else if (iF == 3) {
                    objD7 = cVarB.D(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, objD7);
                    i11 |= 8;
                } else {
                    if (iF != 4) {
                        throw new UnknownFieldException(iF);
                    }
                    objD8 = cVarB.D(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, objD8);
                    i11 |= 16;
                }
            }
            objD = objD5;
            objD2 = objD6;
            objD3 = objD7;
            objD4 = objD8;
            Object obj = objF2;
            i10 = i11;
            objF = obj;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody(i10, (DeviceNode) objF, (AppNode) objD, (CommonRequestBody.User) objD2, (CommonRequestBody.RequestExt) objD3, (CommonRequestBody.RequestParam) objD4, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, CommonRequestBody value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        CommonRequestBody.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

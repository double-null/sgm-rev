package com.vungle.ads.internal.model;

import fe.d;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.u0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonRequestBody$AdSizeParam$$serializer implements l0<CommonRequestBody.AdSizeParam> {
    public static final CommonRequestBody$AdSizeParam$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$AdSizeParam$$serializer commonRequestBody$AdSizeParam$$serializer = new CommonRequestBody$AdSizeParam$$serializer();
        INSTANCE = commonRequestBody$AdSizeParam$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", commonRequestBody$AdSizeParam$$serializer, 2);
        g2Var.p("w", false);
        g2Var.p("h", false);
        descriptor = g2Var;
    }

    private CommonRequestBody$AdSizeParam$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        u0 u0Var = u0.f21014a;
        return new d[]{u0Var, u0Var};
    }

    @Override // fe.c
    public CommonRequestBody.AdSizeParam deserialize(e decoder) {
        int iX;
        int iX2;
        int i10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            iX = cVarB.x(descriptor2, 0);
            iX2 = cVarB.x(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            iX = 0;
            int iX3 = 0;
            int i11 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    iX = cVarB.x(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    iX3 = cVarB.x(descriptor2, 1);
                    i11 |= 2;
                }
            }
            iX2 = iX3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.AdSizeParam(i10, iX, iX2, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, CommonRequestBody.AdSizeParam value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        CommonRequestBody.AdSizeParam.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

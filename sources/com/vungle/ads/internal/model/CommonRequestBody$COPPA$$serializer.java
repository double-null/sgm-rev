package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.i;
import je.l0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonRequestBody$COPPA$$serializer implements l0<CommonRequestBody.COPPA> {
    public static final CommonRequestBody$COPPA$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$COPPA$$serializer commonRequestBody$COPPA$$serializer = new CommonRequestBody$COPPA$$serializer();
        INSTANCE = commonRequestBody$COPPA$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.COPPA", commonRequestBody$COPPA$$serializer, 1);
        g2Var.p(Cookie.COPPA_STATUS_KEY, false);
        descriptor = g2Var;
    }

    private CommonRequestBody$COPPA$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(i.f20933a)};
    }

    @Override // fe.c
    public CommonRequestBody.COPPA deserialize(e decoder) {
        Object objD;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, i.f20933a, null);
        } else {
            int i11 = 0;
            objD = null;
            while (i10 != 0) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    i10 = 0;
                } else {
                    if (iF != 0) {
                        throw new UnknownFieldException(iF);
                    }
                    objD = cVarB.D(descriptor2, 0, i.f20933a, objD);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.COPPA(i10, (Boolean) objD, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, CommonRequestBody.COPPA value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        CommonRequestBody.COPPA.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
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
public final class CommonRequestBody$User$$serializer implements l0<CommonRequestBody.User> {
    public static final CommonRequestBody$User$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$User$$serializer commonRequestBody$User$$serializer = new CommonRequestBody$User$$serializer();
        INSTANCE = commonRequestBody$User$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.User", commonRequestBody$User$$serializer, 5);
        g2Var.p("gdpr", true);
        g2Var.p("ccpa", true);
        g2Var.p("coppa", true);
        g2Var.p("fpd", true);
        g2Var.p("iab", true);
        descriptor = g2Var;
    }

    private CommonRequestBody$User$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(CommonRequestBody$GDPR$$serializer.INSTANCE), a.t(CommonRequestBody$CCPA$$serializer.INSTANCE), a.t(CommonRequestBody$COPPA$$serializer.INSTANCE), a.t(FirstPartyData$$serializer.INSTANCE), a.t(CommonRequestBody$IAB$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public CommonRequestBody.User deserialize(e decoder) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        int i10;
        Object objD5;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD6 = null;
        if (cVarB.q()) {
            objD5 = cVarB.D(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, null);
            objD = cVarB.D(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, null);
            objD2 = cVarB.D(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, null);
            objD3 = cVarB.D(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, null);
            objD4 = cVarB.D(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objD7 = null;
            Object objD8 = null;
            Object objD9 = null;
            Object objD10 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD6 = cVarB.D(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, objD6);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD7 = cVarB.D(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, objD7);
                    i11 |= 2;
                } else if (iF == 2) {
                    objD8 = cVarB.D(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, objD8);
                    i11 |= 4;
                } else if (iF == 3) {
                    objD9 = cVarB.D(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, objD9);
                    i11 |= 8;
                } else {
                    if (iF != 4) {
                        throw new UnknownFieldException(iF);
                    }
                    objD10 = cVarB.D(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, objD10);
                    i11 |= 16;
                }
            }
            objD = objD7;
            objD2 = objD8;
            objD3 = objD9;
            objD4 = objD10;
            Object obj = objD6;
            i10 = i11;
            objD5 = obj;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.User(i10, (CommonRequestBody.GDPR) objD5, (CommonRequestBody.CCPA) objD, (CommonRequestBody.COPPA) objD2, (FirstPartyData) objD3, (CommonRequestBody.IAB) objD4, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, CommonRequestBody.User value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        CommonRequestBody.User.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

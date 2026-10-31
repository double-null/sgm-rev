package com.vungle.ads.internal.model;

import com.facebook.internal.AnalyticsEvents;
import fe.d;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonRequestBody$CCPA$$serializer implements l0<CommonRequestBody.CCPA> {
    public static final CommonRequestBody$CCPA$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$CCPA$$serializer commonRequestBody$CCPA$$serializer = new CommonRequestBody$CCPA$$serializer();
        INSTANCE = commonRequestBody$CCPA$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.CCPA", commonRequestBody$CCPA$$serializer, 1);
        g2Var.p(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, false);
        descriptor = g2Var;
    }

    private CommonRequestBody$CCPA$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{v2.f21024a};
    }

    @Override // fe.c
    public CommonRequestBody.CCPA deserialize(e decoder) {
        String strL;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        if (cVarB.q()) {
            strL = cVarB.l(descriptor2, 0);
        } else {
            int i11 = 0;
            strL = null;
            while (i10 != 0) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    i10 = 0;
                } else {
                    if (iF != 0) {
                        throw new UnknownFieldException(iF);
                    }
                    strL = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.CCPA(i10, strL, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, CommonRequestBody.CCPA value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        CommonRequestBody.CCPA.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

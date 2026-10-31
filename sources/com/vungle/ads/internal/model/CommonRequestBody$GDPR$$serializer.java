package com.vungle.ads.internal.model;

import fe.d;
import he.f;
import ie.c;
import ie.e;
import je.f1;
import je.g2;
import je.l0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonRequestBody$GDPR$$serializer implements l0<CommonRequestBody.GDPR> {
    public static final CommonRequestBody$GDPR$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$GDPR$$serializer commonRequestBody$GDPR$$serializer = new CommonRequestBody$GDPR$$serializer();
        INSTANCE = commonRequestBody$GDPR$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.GDPR", commonRequestBody$GDPR$$serializer, 4);
        g2Var.p("consent_status", false);
        g2Var.p("consent_source", false);
        g2Var.p("consent_timestamp", false);
        g2Var.p("consent_message_version", false);
        descriptor = g2Var;
    }

    private CommonRequestBody$GDPR$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{v2Var, v2Var, f1.f20900a, v2Var};
    }

    @Override // fe.c
    public CommonRequestBody.GDPR deserialize(e decoder) {
        String str;
        String strL;
        int i10;
        String str2;
        long j10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            long jY = cVarB.y(descriptor2, 2);
            str = strL2;
            strL = cVarB.l(descriptor2, 3);
            i10 = 15;
            str2 = strL3;
            j10 = jY;
        } else {
            String strL4 = null;
            String strL5 = null;
            boolean z10 = true;
            long jY2 = 0;
            String strL6 = null;
            int i11 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    strL4 = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (iF == 1) {
                    strL5 = cVarB.l(descriptor2, 1);
                    i11 |= 2;
                } else if (iF == 2) {
                    jY2 = cVarB.y(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iF != 3) {
                        throw new UnknownFieldException(iF);
                    }
                    strL6 = cVarB.l(descriptor2, 3);
                    i11 |= 8;
                }
            }
            str = strL4;
            strL = strL6;
            i10 = i11;
            str2 = strL5;
            j10 = jY2;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.GDPR(i10, str, str2, j10, strL, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, CommonRequestBody.GDPR value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        CommonRequestBody.GDPR.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

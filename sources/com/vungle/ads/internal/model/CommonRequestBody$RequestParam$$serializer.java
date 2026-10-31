package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import java.util.List;
import je.f1;
import je.g2;
import je.l0;
import je.q2;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonRequestBody$RequestParam$$serializer implements l0<CommonRequestBody.RequestParam> {
    public static final CommonRequestBody$RequestParam$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$RequestParam$$serializer commonRequestBody$RequestParam$$serializer = new CommonRequestBody$RequestParam$$serializer();
        INSTANCE = commonRequestBody$RequestParam$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", commonRequestBody$RequestParam$$serializer, 7);
        g2Var.p("placements", true);
        g2Var.p("ad_size", true);
        g2Var.p("ad_start_time", true);
        g2Var.p("app_id", true);
        g2Var.p("placement_reference_id", true);
        g2Var.p("user", true);
        g2Var.p("csb", true);
        descriptor = g2Var;
    }

    private CommonRequestBody$RequestParam$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(new je.f(v2Var)), a.t(CommonRequestBody$AdSizeParam$$serializer.INSTANCE), a.t(f1.f20900a), a.t(v2Var), a.t(v2Var), a.t(v2Var), a.t(CommonRequestBody$CSBParam$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public CommonRequestBody.RequestParam deserialize(e decoder) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        Object objD6;
        int i10;
        Object objD7;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 6;
        Object objD8 = null;
        if (cVarB.q()) {
            v2 v2Var = v2.f21024a;
            objD7 = cVarB.D(descriptor2, 0, new je.f(v2Var), null);
            objD2 = cVarB.D(descriptor2, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, null);
            objD3 = cVarB.D(descriptor2, 2, f1.f20900a, null);
            objD4 = cVarB.D(descriptor2, 3, v2Var, null);
            objD5 = cVarB.D(descriptor2, 4, v2Var, null);
            objD6 = cVarB.D(descriptor2, 5, v2Var, null);
            objD = cVarB.D(descriptor2, 6, CommonRequestBody$CSBParam$$serializer.INSTANCE, null);
            i10 = 127;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object objD9 = null;
            Object objD10 = null;
            Object objD11 = null;
            Object objD12 = null;
            Object objD13 = null;
            Object objD14 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z10 = false;
                        i11 = 6;
                        break;
                    case 0:
                        objD8 = cVarB.D(descriptor2, 0, new je.f(v2.f21024a), objD8);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        objD10 = cVarB.D(descriptor2, 1, CommonRequestBody$AdSizeParam$$serializer.INSTANCE, objD10);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        objD11 = cVarB.D(descriptor2, 2, f1.f20900a, objD11);
                        i12 |= 4;
                        break;
                    case 3:
                        objD12 = cVarB.D(descriptor2, 3, v2.f21024a, objD12);
                        i12 |= 8;
                        break;
                    case 4:
                        objD13 = cVarB.D(descriptor2, 4, v2.f21024a, objD13);
                        i12 |= 16;
                        break;
                    case 5:
                        objD14 = cVarB.D(descriptor2, 5, v2.f21024a, objD14);
                        i12 |= 32;
                        break;
                    case 6:
                        objD9 = cVarB.D(descriptor2, i11, CommonRequestBody$CSBParam$$serializer.INSTANCE, objD9);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            objD = objD9;
            objD2 = objD10;
            objD3 = objD11;
            objD4 = objD12;
            objD5 = objD13;
            objD6 = objD14;
            Object obj = objD8;
            i10 = i12;
            objD7 = obj;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.RequestParam(i10, (List) objD7, (CommonRequestBody.AdSizeParam) objD2, (Long) objD3, (String) objD4, (String) objD5, (String) objD6, (CommonRequestBody.CSBParam) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, CommonRequestBody.RequestParam value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        CommonRequestBody.RequestParam.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

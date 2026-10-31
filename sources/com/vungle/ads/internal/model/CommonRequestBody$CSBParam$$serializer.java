package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.b0;
import je.g2;
import je.i;
import je.l0;
import je.q2;
import je.u0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonRequestBody$CSBParam$$serializer implements l0<CommonRequestBody.CSBParam> {
    public static final CommonRequestBody$CSBParam$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CommonRequestBody$CSBParam$$serializer commonRequestBody$CSBParam$$serializer = new CommonRequestBody$CSBParam$$serializer();
        INSTANCE = commonRequestBody$CSBParam$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", commonRequestBody$CSBParam$$serializer, 7);
        g2Var.p("bidfloor", false);
        g2Var.p("phase", false);
        g2Var.p("is_vx_winner", false);
        g2Var.p("parent_auction_id", false);
        g2Var.p("creative_id", false);
        g2Var.p("ad_unit_id", false);
        g2Var.p("ext", true);
        descriptor = g2Var;
    }

    private CommonRequestBody$CSBParam$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{b0.f20867a, u0.f21014a, i.f20933a, v2Var, v2Var, v2Var, a.t(v2Var)};
    }

    @Override // fe.c
    public CommonRequestBody.CSBParam deserialize(e decoder) {
        int i10;
        String str;
        Object objD;
        int i11;
        boolean z10;
        String str2;
        String str3;
        double d10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            double dN = cVarB.n(descriptor2, 0);
            int iX = cVarB.x(descriptor2, 1);
            boolean zP = cVarB.p(descriptor2, 2);
            String strL = cVarB.l(descriptor2, 3);
            String strL2 = cVarB.l(descriptor2, 4);
            String strL3 = cVarB.l(descriptor2, 5);
            objD = cVarB.D(descriptor2, 6, v2.f21024a, null);
            i11 = iX;
            str = strL3;
            str2 = strL;
            str3 = strL2;
            z10 = zP;
            d10 = dN;
            i10 = 127;
        } else {
            boolean z11 = true;
            int iX2 = 0;
            String strL4 = null;
            String strL5 = null;
            Object objD2 = null;
            double dN2 = 0.0d;
            i10 = 0;
            String strL6 = null;
            boolean zP2 = false;
            while (z11) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        dN2 = cVarB.n(descriptor2, 0);
                        i10 |= 1;
                        continue;
                    case 1:
                        iX2 = cVarB.x(descriptor2, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        zP2 = cVarB.p(descriptor2, 2);
                        i10 |= 4;
                        break;
                    case 3:
                        strL6 = cVarB.l(descriptor2, 3);
                        i10 |= 8;
                        break;
                    case 4:
                        strL4 = cVarB.l(descriptor2, 4);
                        i10 |= 16;
                        break;
                    case 5:
                        strL5 = cVarB.l(descriptor2, 5);
                        i10 |= 32;
                        break;
                    case 6:
                        objD2 = cVarB.D(descriptor2, 6, v2.f21024a, objD2);
                        i10 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            str = strL5;
            objD = objD2;
            i11 = iX2;
            z10 = zP2;
            double d11 = dN2;
            str2 = strL6;
            str3 = strL4;
            d10 = d11;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.CSBParam(i10, d10, i11, z10, str2, str3, str, (String) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f fVar, CommonRequestBody.CSBParam value) {
        t.f(fVar, XDucgbzInpQa.RMEbiGRPTRAs);
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = fVar.b(descriptor2);
        CommonRequestBody.CSBParam.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

package com.vungle.ads.internal.network;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import fe.d;
import he.f;
import ie.c;
import ie.e;
import java.util.Map;
import je.g2;
import je.l0;
import je.q2;
import je.u0;
import je.v2;
import je.z0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FailedTpat$$serializer implements l0<FailedTpat> {
    public static final FailedTpat$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        FailedTpat$$serializer failedTpat$$serializer = new FailedTpat$$serializer();
        INSTANCE = failedTpat$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.network.FailedTpat", failedTpat$$serializer, 6);
        g2Var.p("method", true);
        g2Var.p("headers", true);
        g2Var.p(SDKConstants.PARAM_A2U_BODY, true);
        g2Var.p("retryAttempt", true);
        g2Var.p("retryCount", false);
        g2Var.p("tpatKey", true);
        descriptor = g2Var;
    }

    private FailedTpat$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        u0 u0Var = u0.f21014a;
        return new d[]{HttpMethod$$serializer.INSTANCE, ge.a.t(new z0(v2Var, v2Var)), ge.a.t(v2Var), u0Var, u0Var, ge.a.t(v2Var)};
    }

    @Override // fe.c
    public FailedTpat deserialize(e decoder) {
        int i10;
        Object objD;
        Object objD2;
        Object objD3;
        int i11;
        int i12;
        Object objF;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i13 = 5;
        if (cVarB.q()) {
            objF = cVarB.F(descriptor2, 0, HttpMethod$$serializer.INSTANCE, null);
            v2 v2Var = v2.f21024a;
            objD = cVarB.D(descriptor2, 1, new z0(v2Var, v2Var), null);
            objD2 = cVarB.D(descriptor2, 2, v2Var, null);
            int iX = cVarB.x(descriptor2, 3);
            int iX2 = cVarB.x(descriptor2, 4);
            objD3 = cVarB.D(descriptor2, 5, v2Var, null);
            i12 = iX;
            i11 = iX2;
            i10 = 63;
        } else {
            boolean z10 = true;
            int iX3 = 0;
            int i14 = 0;
            Object objF2 = null;
            Object objD4 = null;
            Object objD5 = null;
            Object objD6 = null;
            int iX4 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        objF2 = cVarB.F(descriptor2, 0, HttpMethod$$serializer.INSTANCE, objF2);
                        i14 |= 1;
                        i13 = 5;
                        continue;
                    case 1:
                        v2 v2Var2 = v2.f21024a;
                        objD4 = cVarB.D(descriptor2, 1, new z0(v2Var2, v2Var2), objD4);
                        i14 |= 2;
                        i13 = 5;
                        break;
                    case 2:
                        objD5 = cVarB.D(descriptor2, 2, v2.f21024a, objD5);
                        i14 |= 4;
                        break;
                    case 3:
                        iX3 = cVarB.x(descriptor2, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        iX4 = cVarB.x(descriptor2, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        objD6 = cVarB.D(descriptor2, i13, v2.f21024a, objD6);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            i10 = i14;
            objD = objD4;
            objD2 = objD5;
            objD3 = objD6;
            i11 = iX4;
            i12 = iX3;
            objF = objF2;
        }
        cVarB.c(descriptor2);
        return new FailedTpat(i10, (HttpMethod) objF, (Map) objD, (String) objD2, i12, i11, (String) objD3, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, FailedTpat value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        FailedTpat.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

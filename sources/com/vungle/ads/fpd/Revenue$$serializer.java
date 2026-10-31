package com.vungle.ads.fpd;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.i;
import je.k0;
import je.l0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: Revenue.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Revenue$$serializer implements l0<Revenue> {
    public static final Revenue$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        Revenue$$serializer revenue$$serializer = new Revenue$$serializer();
        INSTANCE = revenue$$serializer;
        g2 g2Var = new g2("com.vungle.ads.fpd.Revenue", revenue$$serializer, 4);
        g2Var.p("iaa_revenue_usd", true);
        g2Var.p("iap_revenue_usd", true);
        g2Var.p("total_revenue_usd", true);
        g2Var.p("is_user_a_purchaser", true);
        descriptor = g2Var;
    }

    private Revenue$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        k0 k0Var = k0.f20952a;
        return new d[]{a.t(k0Var), a.t(k0Var), a.t(k0Var), a.t(i.f20933a)};
    }

    @Override // fe.c
    public Revenue deserialize(e decoder) {
        Object objD;
        int i10;
        Object objD2;
        Object objD3;
        Object objD4;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD5 = null;
        if (cVarB.q()) {
            k0 k0Var = k0.f20952a;
            objD2 = cVarB.D(descriptor2, 0, k0Var, null);
            Object objD6 = cVarB.D(descriptor2, 1, k0Var, null);
            objD3 = cVarB.D(descriptor2, 2, k0Var, null);
            objD4 = cVarB.D(descriptor2, 3, i.f20933a, null);
            objD = objD6;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            objD = null;
            Object objD7 = null;
            Object objD8 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD5 = cVarB.D(descriptor2, 0, k0.f20952a, objD5);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD = cVarB.D(descriptor2, 1, k0.f20952a, objD);
                    i11 |= 2;
                } else if (iF == 2) {
                    objD7 = cVarB.D(descriptor2, 2, k0.f20952a, objD7);
                    i11 |= 4;
                } else {
                    if (iF != 3) {
                        throw new UnknownFieldException(iF);
                    }
                    objD8 = cVarB.D(descriptor2, 3, i.f20933a, objD8);
                    i11 |= 8;
                }
            }
            i10 = i11;
            objD2 = objD5;
            objD3 = objD7;
            objD4 = objD8;
        }
        cVarB.c(descriptor2);
        return new Revenue(i10, (Float) objD2, (Float) objD, (Float) objD3, (Boolean) objD4, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, Revenue value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        Revenue.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

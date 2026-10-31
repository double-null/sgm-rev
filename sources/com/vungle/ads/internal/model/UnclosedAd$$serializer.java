package com.vungle.ads.internal.model;

import fe.d;
import g7.EinF.ZHgPsTG;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.q2;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: UnclosedAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UnclosedAd$$serializer implements l0<UnclosedAd> {
    public static final UnclosedAd$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    private UnclosedAd$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{v2Var, v2Var};
    }

    @Override // fe.c
    public UnclosedAd deserialize(e decoder) {
        String strL;
        String strL2;
        int i10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            strL = cVarB.l(descriptor2, 0);
            strL2 = cVarB.l(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            strL = null;
            String strL3 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    strL = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    strL3 = cVarB.l(descriptor2, 1);
                    i11 |= 2;
                }
            }
            strL2 = strL3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new UnclosedAd(i10, strL, strL2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, UnclosedAd value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        UnclosedAd.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }

    static {
        UnclosedAd$$serializer unclosedAd$$serializer = new UnclosedAd$$serializer();
        INSTANCE = unclosedAd$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.UnclosedAd", unclosedAd$$serializer, 2);
        g2Var.p("107", false);
        g2Var.p(ZHgPsTG.UUxR, true);
        descriptor = g2Var;
    }
}

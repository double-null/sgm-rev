package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.q2;
import je.u0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$AdSizeInfo$$serializer implements l0<AdPayload.AdSizeInfo> {
    public static final AdPayload$AdSizeInfo$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$AdSizeInfo$$serializer adPayload$AdSizeInfo$$serializer = new AdPayload$AdSizeInfo$$serializer();
        INSTANCE = adPayload$AdSizeInfo$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", adPayload$AdSizeInfo$$serializer, 2);
        g2Var.p("w", true);
        g2Var.p("h", true);
        descriptor = g2Var;
    }

    private AdPayload$AdSizeInfo$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        u0 u0Var = u0.f21014a;
        return new d[]{a.t(u0Var), a.t(u0Var)};
    }

    @Override // fe.c
    public AdPayload.AdSizeInfo deserialize(e decoder) {
        Object objD;
        int i10;
        Object objD2;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            u0 u0Var = u0.f21014a;
            objD2 = cVarB.D(descriptor2, 0, u0Var, null);
            objD = cVarB.D(descriptor2, 1, u0Var, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            objD = null;
            Object objD3 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD3 = cVarB.D(descriptor2, 0, u0.f21014a, objD3);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    objD = cVarB.D(descriptor2, 1, u0.f21014a, objD);
                    i11 |= 2;
                }
            }
            i10 = i11;
            objD2 = objD3;
        }
        cVarB.c(descriptor2);
        return new AdPayload.AdSizeInfo(i10, (Integer) objD2, (Integer) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.AdSizeInfo value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.AdSizeInfo.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

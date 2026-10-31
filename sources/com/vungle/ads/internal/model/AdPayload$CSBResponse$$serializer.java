package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import java.util.List;
import je.b0;
import je.g2;
import je.l0;
import je.q2;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$CSBResponse$$serializer implements l0<AdPayload.CSBResponse> {
    public static final AdPayload$CSBResponse$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$CSBResponse$$serializer adPayload$CSBResponse$$serializer = new AdPayload$CSBResponse$$serializer();
        INSTANCE = adPayload$CSBResponse$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.CSBResponse", adPayload$CSBResponse$$serializer, 3);
        g2Var.p("price", true);
        g2Var.p("nurls", true);
        g2Var.p("lurls", true);
        descriptor = g2Var;
    }

    private AdPayload$CSBResponse$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(b0.f20867a), a.t(new je.f(v2Var)), a.t(new je.f(v2Var))};
    }

    @Override // fe.c
    public AdPayload.CSBResponse deserialize(e decoder) {
        Object objD;
        Object objD2;
        int i10;
        Object objD3;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD4 = null;
        if (cVarB.q()) {
            objD3 = cVarB.D(descriptor2, 0, b0.f20867a, null);
            v2 v2Var = v2.f21024a;
            objD = cVarB.D(descriptor2, 1, new je.f(v2Var), null);
            objD2 = cVarB.D(descriptor2, 2, new je.f(v2Var), null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objD5 = null;
            Object objD6 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD4 = cVarB.D(descriptor2, 0, b0.f20867a, objD4);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD5 = cVarB.D(descriptor2, 1, new je.f(v2.f21024a), objD5);
                    i11 |= 2;
                } else {
                    if (iF != 2) {
                        throw new UnknownFieldException(iF);
                    }
                    objD6 = cVarB.D(descriptor2, 2, new je.f(v2.f21024a), objD6);
                    i11 |= 4;
                }
            }
            objD = objD5;
            objD2 = objD6;
            Object obj = objD4;
            i10 = i11;
            objD3 = obj;
        }
        cVarB.c(descriptor2);
        return new AdPayload.CSBResponse(i10, (Double) objD3, (List) objD, (List) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.CSBResponse value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.CSBResponse.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

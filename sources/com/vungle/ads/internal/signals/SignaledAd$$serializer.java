package com.vungle.ads.internal.signals;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.f1;
import je.g2;
import je.l0;
import je.u0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: SignaledAd.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SignaledAd$$serializer implements l0<SignaledAd> {
    public static final SignaledAd$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        SignaledAd$$serializer signaledAd$$serializer = new SignaledAd$$serializer();
        INSTANCE = signaledAd$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.signals.SignaledAd", signaledAd$$serializer, 5);
        g2Var.p("500", true);
        g2Var.p("109", false);
        g2Var.p("107", true);
        g2Var.p("110", true);
        g2Var.p("108", true);
        descriptor = g2Var;
    }

    private SignaledAd$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        f1 f1Var = f1.f20900a;
        return new d[]{a.t(v2Var), f1Var, a.t(v2Var), f1Var, u0.f21014a};
    }

    @Override // fe.c
    public SignaledAd deserialize(e decoder) {
        long jY;
        int i10;
        Object obj;
        long j10;
        int iX;
        Object objD;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 3;
        if (cVarB.q()) {
            v2 v2Var = v2.f21024a;
            Object objD2 = cVarB.D(descriptor2, 0, v2Var, null);
            long jY2 = cVarB.y(descriptor2, 1);
            objD = cVarB.D(descriptor2, 2, v2Var, null);
            long jY3 = cVarB.y(descriptor2, 3);
            i10 = 31;
            iX = cVarB.x(descriptor2, 4);
            obj = objD2;
            j10 = jY2;
            jY = jY3;
        } else {
            jY = 0;
            boolean z10 = true;
            int iX2 = 0;
            Object objD3 = null;
            Object objD4 = null;
            long jY4 = 0;
            int i12 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD3 = cVarB.D(descriptor2, 0, v2.f21024a, objD3);
                    i12 |= 1;
                } else if (iF == 1) {
                    jY4 = cVarB.y(descriptor2, 1);
                    i12 |= 2;
                } else if (iF == 2) {
                    objD4 = cVarB.D(descriptor2, 2, v2.f21024a, objD4);
                    i12 |= 4;
                } else if (iF == i11) {
                    jY = cVarB.y(descriptor2, i11);
                    i12 |= 8;
                } else {
                    if (iF != 4) {
                        throw new UnknownFieldException(iF);
                    }
                    iX2 = cVarB.x(descriptor2, 4);
                    i12 |= 16;
                }
                i11 = 3;
            }
            i10 = i12;
            obj = objD3;
            j10 = jY4;
            iX = iX2;
            objD = objD4;
        }
        cVarB.c(descriptor2);
        return new SignaledAd(i10, (String) obj, j10, (String) objD, jY, iX, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, SignaledAd value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        SignaledAd.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

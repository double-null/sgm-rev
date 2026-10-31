package com.vungle.ads.internal.signals;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import fe.d;
import he.f;
import ie.c;
import ie.e;
import java.util.List;
import je.f1;
import je.g2;
import je.l0;
import je.u0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SessionData$$serializer implements l0<SessionData> {
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        g2Var.p("103", false);
        g2Var.p("101", true);
        g2Var.p("100", true);
        g2Var.p("106", true);
        g2Var.p("102", true);
        g2Var.p("104", true);
        g2Var.p("105", true);
        g2Var.p("112", true);
        g2Var.p("113", true);
        g2Var.p("114", true);
        g2Var.p("115", true);
        g2Var.p("116", true);
        descriptor = g2Var;
    }

    private SessionData$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        u0 u0Var = u0.f21014a;
        f1 f1Var = f1.f20900a;
        return new d[]{u0Var, v2.f21024a, f1Var, new je.f(SignaledAd$$serializer.INSTANCE), f1Var, u0Var, new je.f(UnclosedAd$$serializer.INSTANCE), u0Var, u0Var, u0Var, u0Var, u0Var};
    }

    @Override // fe.c
    public SessionData deserialize(e decoder) {
        int iX;
        Object objF;
        int i10;
        int iX2;
        int iX3;
        String strL;
        long j10;
        int i11;
        int i12;
        Object objF2;
        int i13;
        int i14;
        long j11;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i15 = 0;
        if (cVarB.q()) {
            int iX4 = cVarB.x(descriptor2, 0);
            strL = cVarB.l(descriptor2, 1);
            long jY = cVarB.y(descriptor2, 2);
            objF = cVarB.F(descriptor2, 3, new je.f(SignaledAd$$serializer.INSTANCE), null);
            long jY2 = cVarB.y(descriptor2, 4);
            int iX5 = cVarB.x(descriptor2, 5);
            objF2 = cVarB.F(descriptor2, 6, new je.f(UnclosedAd$$serializer.INSTANCE), null);
            int iX6 = cVarB.x(descriptor2, 7);
            int iX7 = cVarB.x(descriptor2, 8);
            int iX8 = cVarB.x(descriptor2, 9);
            iX2 = cVarB.x(descriptor2, 10);
            i11 = iX8;
            i13 = iX6;
            i14 = iX7;
            iX = iX5;
            iX3 = cVarB.x(descriptor2, 11);
            i12 = iX4;
            i10 = 4095;
            j10 = jY;
            j11 = jY2;
        } else {
            int i16 = 11;
            boolean z10 = true;
            int iX9 = 0;
            int iX10 = 0;
            iX = 0;
            int iX11 = 0;
            Object objF3 = null;
            Object objF4 = null;
            String strL2 = null;
            long jY3 = 0;
            long jY4 = 0;
            int iX12 = 0;
            int iX13 = 0;
            int iX14 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z10 = false;
                        i16 = 11;
                        break;
                    case 0:
                        i15 |= 1;
                        iX9 = cVarB.x(descriptor2, 0);
                        i16 = 11;
                        break;
                    case 1:
                        strL2 = cVarB.l(descriptor2, 1);
                        i15 |= 2;
                        i16 = 11;
                        break;
                    case 2:
                        jY4 = cVarB.y(descriptor2, 2);
                        i15 |= 4;
                        i16 = 11;
                        break;
                    case 3:
                        objF4 = cVarB.F(descriptor2, 3, new je.f(SignaledAd$$serializer.INSTANCE), objF4);
                        i15 |= 8;
                        i16 = 11;
                        break;
                    case 4:
                        jY3 = cVarB.y(descriptor2, 4);
                        i15 |= 16;
                        i16 = 11;
                        break;
                    case 5:
                        iX = cVarB.x(descriptor2, 5);
                        i15 |= 32;
                        i16 = 11;
                        break;
                    case 6:
                        objF3 = cVarB.F(descriptor2, 6, new je.f(UnclosedAd$$serializer.INSTANCE), objF3);
                        i15 |= 64;
                        i16 = 11;
                        break;
                    case 7:
                        iX14 = cVarB.x(descriptor2, 7);
                        i15 |= 128;
                        break;
                    case 8:
                        iX10 = cVarB.x(descriptor2, 8);
                        i15 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        break;
                    case 9:
                        iX13 = cVarB.x(descriptor2, 9);
                        i15 |= 512;
                        break;
                    case 10:
                        iX12 = cVarB.x(descriptor2, 10);
                        i15 |= 1024;
                        break;
                    case 11:
                        iX11 = cVarB.x(descriptor2, i16);
                        i15 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            objF = objF4;
            i10 = i15;
            iX2 = iX12;
            iX3 = iX11;
            strL = strL2;
            j10 = jY4;
            i11 = iX13;
            Object obj = objF3;
            i12 = iX9;
            objF2 = obj;
            long j12 = jY3;
            i13 = iX14;
            i14 = iX10;
            j11 = j12;
        }
        cVarB.c(descriptor2);
        return new SessionData(i10, i12, strL, j10, (List) objF, j11, iX, (List) objF2, i13, i14, i11, iX2, iX3, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, SessionData value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        SessionData.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

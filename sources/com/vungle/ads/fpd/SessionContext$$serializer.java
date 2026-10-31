package com.vungle.ads.fpd;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.k0;
import je.l0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: SessionContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SessionContext$$serializer implements l0<SessionContext> {
    public static final SessionContext$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        SessionContext$$serializer sessionContext$$serializer = new SessionContext$$serializer();
        INSTANCE = sessionContext$$serializer;
        g2 g2Var = new g2("com.vungle.ads.fpd.SessionContext", sessionContext$$serializer, 1);
        g2Var.p("level_percentile", true);
        descriptor = g2Var;
    }

    private SessionContext$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(k0.f20952a)};
    }

    @Override // fe.c
    public SessionContext deserialize(e decoder) {
        Object objD;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, k0.f20952a, null);
        } else {
            int i11 = 0;
            objD = null;
            while (i10 != 0) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    i10 = 0;
                } else {
                    if (iF != 0) {
                        throw new UnknownFieldException(iF);
                    }
                    objD = cVarB.D(descriptor2, 0, k0.f20952a, objD);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new SessionContext(i10, (Float) objD, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, SessionContext value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        SessionContext.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

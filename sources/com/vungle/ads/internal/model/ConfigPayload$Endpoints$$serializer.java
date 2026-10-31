package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.q2;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfigPayload$Endpoints$$serializer implements l0<ConfigPayload.Endpoints> {
    public static final ConfigPayload$Endpoints$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        ConfigPayload$Endpoints$$serializer configPayload$Endpoints$$serializer = new ConfigPayload$Endpoints$$serializer();
        INSTANCE = configPayload$Endpoints$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.Endpoints", configPayload$Endpoints$$serializer, 5);
        g2Var.p("ads", true);
        g2Var.p("ri", true);
        g2Var.p("error_logs", true);
        g2Var.p("metrics", true);
        g2Var.p("csb", true);
        descriptor = g2Var;
    }

    private ConfigPayload$Endpoints$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(v2Var), a.t(v2Var), a.t(v2Var), a.t(v2Var), a.t(v2Var)};
    }

    @Override // fe.c
    public ConfigPayload.Endpoints deserialize(e decoder) {
        Object objD;
        int i10;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD6 = null;
        if (cVarB.q()) {
            v2 v2Var = v2.f21024a;
            objD2 = cVarB.D(descriptor2, 0, v2Var, null);
            objD3 = cVarB.D(descriptor2, 1, v2Var, null);
            Object objD7 = cVarB.D(descriptor2, 2, v2Var, null);
            objD4 = cVarB.D(descriptor2, 3, v2Var, null);
            objD5 = cVarB.D(descriptor2, 4, v2Var, null);
            objD = objD7;
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objD8 = null;
            objD = null;
            Object objD9 = null;
            Object objD10 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD6 = cVarB.D(descriptor2, 0, v2.f21024a, objD6);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD8 = cVarB.D(descriptor2, 1, v2.f21024a, objD8);
                    i11 |= 2;
                } else if (iF == 2) {
                    objD = cVarB.D(descriptor2, 2, v2.f21024a, objD);
                    i11 |= 4;
                } else if (iF == 3) {
                    objD9 = cVarB.D(descriptor2, 3, v2.f21024a, objD9);
                    i11 |= 8;
                } else {
                    if (iF != 4) {
                        throw new UnknownFieldException(iF);
                    }
                    objD10 = cVarB.D(descriptor2, 4, v2.f21024a, objD10);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objD2 = objD6;
            objD3 = objD8;
            objD4 = objD9;
            objD5 = objD10;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.Endpoints(i10, (String) objD2, (String) objD3, (String) objD, (String) objD4, (String) objD5, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, ConfigPayload.Endpoints value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        ConfigPayload.Endpoints.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

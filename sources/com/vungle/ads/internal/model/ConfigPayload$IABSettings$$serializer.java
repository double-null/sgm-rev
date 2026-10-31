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

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfigPayload$IABSettings$$serializer implements l0<ConfigPayload.IABSettings> {
    public static final ConfigPayload$IABSettings$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        ConfigPayload$IABSettings$$serializer configPayload$IABSettings$$serializer = new ConfigPayload$IABSettings$$serializer();
        INSTANCE = configPayload$IABSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.IABSettings", configPayload$IABSettings$$serializer, 1);
        g2Var.p("tcf_status", true);
        descriptor = g2Var;
    }

    private ConfigPayload$IABSettings$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(u0.f21014a)};
    }

    @Override // fe.c
    public ConfigPayload.IABSettings deserialize(e decoder) {
        Object objD;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, u0.f21014a, null);
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
                    objD = cVarB.D(descriptor2, 0, u0.f21014a, objD);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.IABSettings(i10, (Integer) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, ConfigPayload.IABSettings value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        ConfigPayload.IABSettings.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

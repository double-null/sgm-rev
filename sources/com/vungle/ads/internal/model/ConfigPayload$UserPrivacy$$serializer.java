package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.q2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfigPayload$UserPrivacy$$serializer implements l0<ConfigPayload.UserPrivacy> {
    public static final ConfigPayload$UserPrivacy$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        ConfigPayload$UserPrivacy$$serializer configPayload$UserPrivacy$$serializer = new ConfigPayload$UserPrivacy$$serializer();
        INSTANCE = configPayload$UserPrivacy$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.UserPrivacy", configPayload$UserPrivacy$$serializer, 2);
        g2Var.p("gdpr", true);
        g2Var.p("iab", true);
        descriptor = g2Var;
    }

    private ConfigPayload$UserPrivacy$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(ConfigPayload$GDPRSettings$$serializer.INSTANCE), a.t(ConfigPayload$IABSettings$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public ConfigPayload.UserPrivacy deserialize(e decoder) {
        Object objD;
        Object objD2;
        int i10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, null);
            objD2 = cVarB.D(descriptor2, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, null);
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
                    objD = cVarB.D(descriptor2, 0, ConfigPayload$GDPRSettings$$serializer.INSTANCE, objD);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    objD3 = cVarB.D(descriptor2, 1, ConfigPayload$IABSettings$$serializer.INSTANCE, objD3);
                    i11 |= 2;
                }
            }
            objD2 = objD3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.UserPrivacy(i10, (ConfigPayload.GDPRSettings) objD, (ConfigPayload.IABSettings) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, ConfigPayload.UserPrivacy value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        ConfigPayload.UserPrivacy.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

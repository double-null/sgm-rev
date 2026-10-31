package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.i;
import je.l0;
import je.q2;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfigPayload$GDPRSettings$$serializer implements l0<ConfigPayload.GDPRSettings> {
    public static final ConfigPayload$GDPRSettings$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        ConfigPayload$GDPRSettings$$serializer configPayload$GDPRSettings$$serializer = new ConfigPayload$GDPRSettings$$serializer();
        INSTANCE = configPayload$GDPRSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", configPayload$GDPRSettings$$serializer, 6);
        g2Var.p("is_country_data_protected", true);
        g2Var.p("consent_title", true);
        g2Var.p("consent_message", true);
        g2Var.p("consent_message_version", true);
        g2Var.p("button_accept", true);
        g2Var.p("button_deny", true);
        descriptor = g2Var;
    }

    private ConfigPayload$GDPRSettings$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(i.f20933a), a.t(v2Var), a.t(v2Var), a.t(v2Var), a.t(v2Var), a.t(v2Var)};
    }

    @Override // fe.c
    public ConfigPayload.GDPRSettings deserialize(e decoder) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        int i10;
        Object objD6;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 5;
        Object objD7 = null;
        if (cVarB.q()) {
            objD6 = cVarB.D(descriptor2, 0, i.f20933a, null);
            v2 v2Var = v2.f21024a;
            objD = cVarB.D(descriptor2, 1, v2Var, null);
            objD2 = cVarB.D(descriptor2, 2, v2Var, null);
            objD3 = cVarB.D(descriptor2, 3, v2Var, null);
            objD4 = cVarB.D(descriptor2, 4, v2Var, null);
            objD5 = cVarB.D(descriptor2, 5, v2Var, null);
            i10 = 63;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object objD8 = null;
            Object objD9 = null;
            Object objD10 = null;
            Object objD11 = null;
            Object objD12 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        objD7 = cVarB.D(descriptor2, 0, i.f20933a, objD7);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        objD8 = cVarB.D(descriptor2, 1, v2.f21024a, objD8);
                        i12 |= 2;
                        break;
                    case 2:
                        objD9 = cVarB.D(descriptor2, 2, v2.f21024a, objD9);
                        i12 |= 4;
                        break;
                    case 3:
                        objD10 = cVarB.D(descriptor2, 3, v2.f21024a, objD10);
                        i12 |= 8;
                        break;
                    case 4:
                        objD11 = cVarB.D(descriptor2, 4, v2.f21024a, objD11);
                        i12 |= 16;
                        break;
                    case 5:
                        objD12 = cVarB.D(descriptor2, i11, v2.f21024a, objD12);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            objD = objD8;
            objD2 = objD9;
            objD3 = objD10;
            objD4 = objD11;
            objD5 = objD12;
            Object obj = objD7;
            i10 = i12;
            objD6 = obj;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.GDPRSettings(i10, (Boolean) objD6, (String) objD, (String) objD2, (String) objD3, (String) objD4, (String) objD5, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, ConfigPayload.GDPRSettings value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        ConfigPayload.GDPRSettings.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

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
import je.u0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfigPayload$LogMetricsSettings$$serializer implements l0<ConfigPayload.LogMetricsSettings> {
    public static final ConfigPayload$LogMetricsSettings$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        ConfigPayload$LogMetricsSettings$$serializer configPayload$LogMetricsSettings$$serializer = new ConfigPayload$LogMetricsSettings$$serializer();
        INSTANCE = configPayload$LogMetricsSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", configPayload$LogMetricsSettings$$serializer, 2);
        g2Var.p("error_log_level", true);
        g2Var.p("metrics_is_enabled", true);
        descriptor = g2Var;
    }

    private ConfigPayload$LogMetricsSettings$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(u0.f21014a), a.t(i.f20933a)};
    }

    @Override // fe.c
    public ConfigPayload.LogMetricsSettings deserialize(e decoder) {
        Object objD;
        Object objD2;
        int i10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, u0.f21014a, null);
            objD2 = cVarB.D(descriptor2, 1, i.f20933a, null);
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
                    objD = cVarB.D(descriptor2, 0, u0.f21014a, objD);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    objD3 = cVarB.D(descriptor2, 1, i.f20933a, objD3);
                    i11 |= 2;
                }
            }
            objD2 = objD3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.LogMetricsSettings(i10, (Integer) objD, (Boolean) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, ConfigPayload.LogMetricsSettings value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        ConfigPayload.LogMetricsSettings.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

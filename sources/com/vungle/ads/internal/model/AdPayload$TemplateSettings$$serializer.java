package com.vungle.ads.internal.model;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import java.util.Map;
import je.g2;
import je.l0;
import je.q2;
import je.v2;
import je.z0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$TemplateSettings$$serializer implements l0<AdPayload.TemplateSettings> {
    public static final AdPayload$TemplateSettings$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$TemplateSettings$$serializer adPayload$TemplateSettings$$serializer = new AdPayload$TemplateSettings$$serializer();
        INSTANCE = adPayload$TemplateSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.TemplateSettings", adPayload$TemplateSettings$$serializer, 2);
        g2Var.p("normal_replacements", true);
        g2Var.p("cacheable_replacements", true);
        descriptor = g2Var;
    }

    private AdPayload$TemplateSettings$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(new z0(v2Var, v2Var)), a.t(new z0(v2Var, AdPayload$CacheableReplacement$$serializer.INSTANCE))};
    }

    @Override // fe.c
    public AdPayload.TemplateSettings deserialize(e decoder) {
        Object objD;
        Object objD2;
        int i10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            v2 v2Var = v2.f21024a;
            objD = cVarB.D(descriptor2, 0, new z0(v2Var, v2Var), null);
            objD2 = cVarB.D(descriptor2, 1, new z0(v2Var, AdPayload$CacheableReplacement$$serializer.INSTANCE), null);
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
                    v2 v2Var2 = v2.f21024a;
                    objD = cVarB.D(descriptor2, 0, new z0(v2Var2, v2Var2), objD);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    objD3 = cVarB.D(descriptor2, 1, new z0(v2.f21024a, AdPayload$CacheableReplacement$$serializer.INSTANCE), objD3);
                    i11 |= 2;
                }
            }
            objD2 = objD3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AdPayload.TemplateSettings(i10, (Map) objD, (Map) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.TemplateSettings value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.TemplateSettings.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

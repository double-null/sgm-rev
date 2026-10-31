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

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$ViewAbilityInfo$$serializer implements l0<AdPayload.ViewAbilityInfo> {
    public static final AdPayload$ViewAbilityInfo$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$ViewAbilityInfo$$serializer adPayload$ViewAbilityInfo$$serializer = new AdPayload$ViewAbilityInfo$$serializer();
        INSTANCE = adPayload$ViewAbilityInfo$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", adPayload$ViewAbilityInfo$$serializer, 2);
        g2Var.p("is_enabled", true);
        g2Var.p("extra_vast", true);
        descriptor = g2Var;
    }

    private AdPayload$ViewAbilityInfo$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(i.f20933a), a.t(v2.f21024a)};
    }

    @Override // fe.c
    public AdPayload.ViewAbilityInfo deserialize(e decoder) {
        Object objD;
        Object objD2;
        int i10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, i.f20933a, null);
            objD2 = cVarB.D(descriptor2, 1, v2.f21024a, null);
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
                    objD = cVarB.D(descriptor2, 0, i.f20933a, objD);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    objD3 = cVarB.D(descriptor2, 1, v2.f21024a, objD3);
                    i11 |= 2;
                }
            }
            objD2 = objD3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AdPayload.ViewAbilityInfo(i10, (Boolean) objD, (String) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.ViewAbilityInfo value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.ViewAbilityInfo.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

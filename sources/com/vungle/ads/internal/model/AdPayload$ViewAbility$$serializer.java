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

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$ViewAbility$$serializer implements l0<AdPayload.ViewAbility> {
    public static final AdPayload$ViewAbility$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$ViewAbility$$serializer adPayload$ViewAbility$$serializer = new AdPayload$ViewAbility$$serializer();
        INSTANCE = adPayload$ViewAbility$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.ViewAbility", adPayload$ViewAbility$$serializer, 1);
        g2Var.p("om", true);
        descriptor = g2Var;
    }

    private AdPayload$ViewAbility$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(AdPayload$ViewAbilityInfo$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public AdPayload.ViewAbility deserialize(e decoder) {
        Object objD;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i10 = 1;
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE, null);
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
                    objD = cVarB.D(descriptor2, 0, AdPayload$ViewAbilityInfo$$serializer.INSTANCE, objD);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AdPayload.ViewAbility(i10, (AdPayload.ViewAbilityInfo) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.ViewAbility value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.ViewAbility.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

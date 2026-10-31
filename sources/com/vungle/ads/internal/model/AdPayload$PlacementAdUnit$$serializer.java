package com.vungle.ads.internal.model;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
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

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$PlacementAdUnit$$serializer implements l0<AdPayload.PlacementAdUnit> {
    public static final AdPayload$PlacementAdUnit$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    private AdPayload$PlacementAdUnit$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[]{a.t(v2.f21024a), a.t(AdPayload$AdUnit$$serializer.INSTANCE), a.t(AdPayload$CSBResponse$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public AdPayload.PlacementAdUnit deserialize(e decoder) {
        Object objD;
        Object objD2;
        int i10;
        Object objD3;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD4 = null;
        if (cVarB.q()) {
            objD3 = cVarB.D(descriptor2, 0, v2.f21024a, null);
            objD = cVarB.D(descriptor2, 1, AdPayload$AdUnit$$serializer.INSTANCE, null);
            objD2 = cVarB.D(descriptor2, 2, AdPayload$CSBResponse$$serializer.INSTANCE, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objD5 = null;
            Object objD6 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD4 = cVarB.D(descriptor2, 0, v2.f21024a, objD4);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD5 = cVarB.D(descriptor2, 1, AdPayload$AdUnit$$serializer.INSTANCE, objD5);
                    i11 |= 2;
                } else {
                    if (iF != 2) {
                        throw new UnknownFieldException(iF);
                    }
                    objD6 = cVarB.D(descriptor2, 2, AdPayload$CSBResponse$$serializer.INSTANCE, objD6);
                    i11 |= 4;
                }
            }
            objD = objD5;
            objD2 = objD6;
            Object obj = objD4;
            i10 = i11;
            objD3 = obj;
        }
        cVarB.c(descriptor2);
        return new AdPayload.PlacementAdUnit(i10, (String) objD3, (AdPayload.AdUnit) objD, (AdPayload.CSBResponse) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.PlacementAdUnit value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.PlacementAdUnit.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }

    static {
        AdPayload$PlacementAdUnit$$serializer adPayload$PlacementAdUnit$$serializer = new AdPayload$PlacementAdUnit$$serializer();
        INSTANCE = adPayload$PlacementAdUnit$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", adPayload$PlacementAdUnit$$serializer, 3);
        g2Var.p("placement_reference_id", true);
        g2Var.p(edUJlCZxhVnO.KImbclSsaHxZ, true);
        g2Var.p("csb", true);
        descriptor = g2Var;
    }
}

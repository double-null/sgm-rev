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
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$WebViewSettings$$serializer implements l0<AdPayload.WebViewSettings> {
    public static final AdPayload$WebViewSettings$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$WebViewSettings$$serializer adPayload$WebViewSettings$$serializer = new AdPayload$WebViewSettings$$serializer();
        INSTANCE = adPayload$WebViewSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.WebViewSettings", adPayload$WebViewSettings$$serializer, 2);
        g2Var.p("allow_file_access_from_file_urls", true);
        g2Var.p("allow_universal_access_from_file_urls", true);
        descriptor = g2Var;
    }

    private AdPayload$WebViewSettings$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        i iVar = i.f20933a;
        return new d[]{a.t(iVar), a.t(iVar)};
    }

    @Override // fe.c
    public AdPayload.WebViewSettings deserialize(e decoder) {
        Object objD;
        int i10;
        Object objD2;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            i iVar = i.f20933a;
            objD2 = cVarB.D(descriptor2, 0, iVar, null);
            objD = cVarB.D(descriptor2, 1, iVar, null);
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
                    objD3 = cVarB.D(descriptor2, 0, i.f20933a, objD3);
                    i11 |= 1;
                } else {
                    if (iF != 1) {
                        throw new UnknownFieldException(iF);
                    }
                    objD = cVarB.D(descriptor2, 1, i.f20933a, objD);
                    i11 |= 2;
                }
            }
            i10 = i11;
            objD2 = objD3;
        }
        cVarB.c(descriptor2);
        return new AdPayload.WebViewSettings(i10, (Boolean) objD2, (Boolean) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.WebViewSettings value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.WebViewSettings.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

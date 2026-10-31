package com.vungle.ads.internal.model;

import com.facebook.share.internal.ShareConstants;
import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.q2;
import je.u0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$CacheableReplacement$$serializer implements l0<AdPayload.CacheableReplacement> {
    public static final AdPayload$CacheableReplacement$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$CacheableReplacement$$serializer adPayload$CacheableReplacement$$serializer = new AdPayload$CacheableReplacement$$serializer();
        INSTANCE = adPayload$CacheableReplacement$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", adPayload$CacheableReplacement$$serializer, 3);
        g2Var.p("url", true);
        g2Var.p(ShareConstants.MEDIA_EXTENSION, true);
        g2Var.p("download_percent", true);
        descriptor = g2Var;
    }

    private AdPayload$CacheableReplacement$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(v2Var), a.t(v2Var), a.t(u0.f21014a)};
    }

    @Override // fe.c
    public AdPayload.CacheableReplacement deserialize(e decoder) {
        int i10;
        Object objD;
        Object objD2;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD3 = null;
        if (cVarB.q()) {
            v2 v2Var = v2.f21024a;
            Object objD4 = cVarB.D(descriptor2, 0, v2Var, null);
            objD = cVarB.D(descriptor2, 1, v2Var, null);
            objD2 = cVarB.D(descriptor2, 2, u0.f21014a, null);
            objD3 = objD4;
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
                    objD3 = cVarB.D(descriptor2, 0, v2.f21024a, objD3);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD5 = cVarB.D(descriptor2, 1, v2.f21024a, objD5);
                    i11 |= 2;
                } else {
                    if (iF != 2) {
                        throw new UnknownFieldException(iF);
                    }
                    objD6 = cVarB.D(descriptor2, 2, u0.f21014a, objD6);
                    i11 |= 4;
                }
            }
            i10 = i11;
            objD = objD5;
            objD2 = objD6;
        }
        cVarB.c(descriptor2);
        return new AdPayload.CacheableReplacement(i10, (String) objD3, (String) objD, (Integer) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload.CacheableReplacement value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.CacheableReplacement.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

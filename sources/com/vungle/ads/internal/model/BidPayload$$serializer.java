package com.vungle.ads.internal.model;

import com.facebook.internal.ServerProtocol;
import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import java.util.List;
import je.g2;
import je.l0;
import je.u0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: BidPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BidPayload$$serializer implements l0<BidPayload> {
    public static final BidPayload$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        BidPayload$$serializer bidPayload$$serializer = new BidPayload$$serializer();
        INSTANCE = bidPayload$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.BidPayload", bidPayload$$serializer, 4);
        g2Var.p(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, true);
        g2Var.p("adunit", true);
        g2Var.p("impression", true);
        g2Var.p("ad", true);
        descriptor = g2Var;
    }

    private BidPayload$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(u0.f21014a), a.t(v2Var), a.t(new je.f(v2Var)), a.t(AdPayload$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public BidPayload deserialize(e decoder) {
        Object objD;
        Object objD2;
        Object objD3;
        int i10;
        Object objD4;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD5 = null;
        if (cVarB.q()) {
            objD4 = cVarB.D(descriptor2, 0, u0.f21014a, null);
            v2 v2Var = v2.f21024a;
            objD = cVarB.D(descriptor2, 1, v2Var, null);
            objD2 = cVarB.D(descriptor2, 2, new je.f(v2Var), null);
            objD3 = cVarB.D(descriptor2, 3, AdPayload$$serializer.INSTANCE, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objD6 = null;
            Object objD7 = null;
            Object objD8 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD5 = cVarB.D(descriptor2, 0, u0.f21014a, objD5);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD6 = cVarB.D(descriptor2, 1, v2.f21024a, objD6);
                    i11 |= 2;
                } else if (iF == 2) {
                    objD7 = cVarB.D(descriptor2, 2, new je.f(v2.f21024a), objD7);
                    i11 |= 4;
                } else {
                    if (iF != 3) {
                        throw new UnknownFieldException(iF);
                    }
                    objD8 = cVarB.D(descriptor2, 3, AdPayload$$serializer.INSTANCE, objD8);
                    i11 |= 8;
                }
            }
            objD = objD6;
            objD2 = objD7;
            objD3 = objD8;
            Object obj = objD5;
            i10 = i11;
            objD4 = obj;
        }
        cVarB.c(descriptor2);
        return new BidPayload(i10, (Integer) objD4, (String) objD, (List) objD2, (AdPayload) objD3, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, BidPayload value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        BidPayload.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

package com.vungle.ads.internal.model;

import com.facebook.internal.NativeProtocol;
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

/* JADX INFO: compiled from: OmSdkData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class OmSdkData$$serializer implements l0<OmSdkData> {
    public static final OmSdkData$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        OmSdkData$$serializer omSdkData$$serializer = new OmSdkData$$serializer();
        INSTANCE = omSdkData$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.OmSdkData", omSdkData$$serializer, 3);
        g2Var.p(NativeProtocol.WEB_DIALOG_PARAMS, true);
        g2Var.p("vendorKey", true);
        g2Var.p("vendorURL", true);
        descriptor = g2Var;
    }

    private OmSdkData$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(v2Var), a.t(v2Var), a.t(v2Var)};
    }

    @Override // fe.c
    public OmSdkData deserialize(e decoder) {
        Object objD;
        int i10;
        Object objD2;
        Object objD3;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objD4 = null;
        if (cVarB.q()) {
            v2 v2Var = v2.f21024a;
            objD2 = cVarB.D(descriptor2, 0, v2Var, null);
            Object objD5 = cVarB.D(descriptor2, 1, v2Var, null);
            objD3 = cVarB.D(descriptor2, 2, v2Var, null);
            objD = objD5;
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            objD = null;
            Object objD6 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    objD4 = cVarB.D(descriptor2, 0, v2.f21024a, objD4);
                    i11 |= 1;
                } else if (iF == 1) {
                    objD = cVarB.D(descriptor2, 1, v2.f21024a, objD);
                    i11 |= 2;
                } else {
                    if (iF != 2) {
                        throw new UnknownFieldException(iF);
                    }
                    objD6 = cVarB.D(descriptor2, 2, v2.f21024a, objD6);
                    i11 |= 4;
                }
            }
            i10 = i11;
            objD2 = objD4;
            objD3 = objD6;
        }
        cVarB.c(descriptor2);
        return new OmSdkData(i10, (String) objD2, (String) objD, (String) objD3, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, OmSdkData value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        OmSdkData.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

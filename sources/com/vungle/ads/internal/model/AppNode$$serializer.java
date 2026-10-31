package com.vungle.ads.internal.model;

import c2.YDwL.tFQWuE;
import fe.d;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: AppNode.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AppNode$$serializer implements l0<AppNode> {
    public static final AppNode$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    private AppNode$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{v2Var, v2Var, v2Var};
    }

    @Override // fe.c
    public AppNode deserialize(e decoder) {
        String str;
        String strL;
        String str2;
        int i10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            str = strL2;
            strL = cVarB.l(descriptor2, 2);
            str2 = strL3;
            i10 = 7;
        } else {
            String strL4 = null;
            String strL5 = null;
            String strL6 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z10 = false;
                } else if (iF == 0) {
                    strL4 = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (iF == 1) {
                    strL6 = cVarB.l(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iF != 2) {
                        throw new UnknownFieldException(iF);
                    }
                    strL5 = cVarB.l(descriptor2, 2);
                    i11 |= 4;
                }
            }
            str = strL4;
            strL = strL5;
            str2 = strL6;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AppNode(i10, str, str2, strL, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AppNode value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AppNode.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }

    static {
        AppNode$$serializer appNode$$serializer = new AppNode$$serializer();
        INSTANCE = appNode$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AppNode", appNode$$serializer, 3);
        g2Var.p(tFQWuE.OIhJzDKcMQRvr, false);
        g2Var.p("ver", false);
        g2Var.p("id", false);
        descriptor = g2Var;
    }
}

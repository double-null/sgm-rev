package com.vungle.ads.internal.model;

import com.facebook.appevents.cloudbridge.Gjw.yhXxbqGRMeI;
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

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Placement$$serializer implements l0<Placement> {
    public static final Placement$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    private Placement$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{v2Var, i.f20933a, a.t(v2Var)};
    }

    @Override // fe.c
    public Placement deserialize(e decoder) {
        boolean z10;
        int i10;
        String str;
        Object objD;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            String strL = cVarB.l(descriptor2, 0);
            boolean zP = cVarB.p(descriptor2, 1);
            objD = cVarB.D(descriptor2, 2, v2.f21024a, null);
            str = strL;
            z10 = zP;
            i10 = 7;
        } else {
            boolean z11 = true;
            boolean zP2 = false;
            String strL2 = null;
            Object objD2 = null;
            int i11 = 0;
            while (z11) {
                int iF = cVarB.f(descriptor2);
                if (iF == -1) {
                    z11 = false;
                } else if (iF == 0) {
                    strL2 = cVarB.l(descriptor2, 0);
                    i11 |= 1;
                } else if (iF == 1) {
                    zP2 = cVarB.p(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iF != 2) {
                        throw new UnknownFieldException(iF);
                    }
                    objD2 = cVarB.D(descriptor2, 2, v2.f21024a, objD2);
                    i11 |= 4;
                }
            }
            z10 = zP2;
            i10 = i11;
            str = strL2;
            objD = objD2;
        }
        cVarB.c(descriptor2);
        return new Placement(i10, str, z10, (String) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, Placement value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        Placement.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }

    static {
        Placement$$serializer placement$$serializer = new Placement$$serializer();
        INSTANCE = placement$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.Placement", placement$$serializer, 3);
        g2Var.p("placement_ref_id", false);
        g2Var.p(yhXxbqGRMeI.KgvofRgDgk, true);
        g2Var.p("type", true);
        descriptor = g2Var;
    }
}

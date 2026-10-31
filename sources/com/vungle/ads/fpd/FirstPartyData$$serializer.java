package com.vungle.ads.fpd;

import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import java.util.Map;
import je.g2;
import je.l0;
import je.v2;
import je.z0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: FirstPartyData.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FirstPartyData$$serializer implements l0<FirstPartyData> {
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        g2 g2Var = new g2("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        g2Var.p("model_version", true);
        g2Var.p("session_context", true);
        g2Var.p("demographic", true);
        g2Var.p("location", true);
        g2Var.p("revenue", true);
        g2Var.p("custom_data", true);
        descriptor = g2Var;
    }

    private FirstPartyData$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        return new d[]{v2Var, a.t(SessionContext$$serializer.INSTANCE), a.t(Demographic$$serializer.INSTANCE), a.t(Location$$serializer.INSTANCE), a.t(Revenue$$serializer.INSTANCE), a.t(new z0(v2Var, v2Var))};
    }

    @Override // fe.c
    public FirstPartyData deserialize(e decoder) {
        Object objD;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        int i10;
        String str;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        boolean z10 = true;
        String strL = null;
        if (cVarB.q()) {
            String strL2 = cVarB.l(descriptor2, 0);
            objD = cVarB.D(descriptor2, 1, SessionContext$$serializer.INSTANCE, null);
            objD2 = cVarB.D(descriptor2, 2, Demographic$$serializer.INSTANCE, null);
            objD3 = cVarB.D(descriptor2, 3, Location$$serializer.INSTANCE, null);
            objD4 = cVarB.D(descriptor2, 4, Revenue$$serializer.INSTANCE, null);
            v2 v2Var = v2.f21024a;
            objD5 = cVarB.D(descriptor2, 5, new z0(v2Var, v2Var), null);
            str = strL2;
            i10 = 63;
        } else {
            boolean z11 = true;
            int i11 = 0;
            Object objD6 = null;
            Object objD7 = null;
            Object objD8 = null;
            Object objD9 = null;
            Object objD10 = null;
            while (z11) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z11 = false;
                        z10 = z10;
                        break;
                    case 0:
                        strL = cVarB.l(descriptor2, 0);
                        i11 |= 1;
                        z10 = z10;
                        break;
                    case 1:
                        objD6 = cVarB.D(descriptor2, 1, SessionContext$$serializer.INSTANCE, objD6);
                        i11 |= 2;
                        z10 = true;
                        break;
                    case 2:
                        objD7 = cVarB.D(descriptor2, 2, Demographic$$serializer.INSTANCE, objD7);
                        i11 |= 4;
                        z10 = true;
                        break;
                    case 3:
                        objD8 = cVarB.D(descriptor2, 3, Location$$serializer.INSTANCE, objD8);
                        i11 |= 8;
                        z10 = true;
                        break;
                    case 4:
                        objD9 = cVarB.D(descriptor2, 4, Revenue$$serializer.INSTANCE, objD9);
                        i11 |= 16;
                        z10 = true;
                        break;
                    case 5:
                        v2 v2Var2 = v2.f21024a;
                        objD10 = cVarB.D(descriptor2, 5, new z0(v2Var2, v2Var2), objD10);
                        i11 |= 32;
                        z10 = true;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            objD = objD6;
            objD2 = objD7;
            objD3 = objD8;
            objD4 = objD9;
            objD5 = objD10;
            i10 = i11;
            str = strL;
        }
        cVarB.c(descriptor2);
        return new FirstPartyData(i10, str, (SessionContext) objD, (Demographic) objD2, (Location) objD3, (Revenue) objD4, (Map) objD5, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, FirstPartyData value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        FirstPartyData.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

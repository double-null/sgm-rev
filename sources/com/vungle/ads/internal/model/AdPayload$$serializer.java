package com.vungle.ads.internal.model;

import fe.b;
import fe.d;
import ge.a;
import he.f;
import ie.e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import je.f1;
import je.g2;
import je.i;
import je.l0;
import je.v2;
import je.z0;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;
import pd.c;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdPayload$$serializer implements l0<AdPayload> {
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 7);
        g2Var.p("ads", true);
        g2Var.p("config", true);
        g2Var.p("expiryWindowStart", true);
        g2Var.p("mraidFiles", true);
        g2Var.p("incentivizedTextSettings", true);
        g2Var.p("assetsFullyDownloaded", true);
        g2Var.p("indexFilePath", true);
        descriptor = g2Var;
    }

    private AdPayload$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        c cVarB = i0.b(ConcurrentHashMap.class);
        v2 v2Var = v2.f21024a;
        return new d[]{a.t(new je.f(AdPayload$PlacementAdUnit$$serializer.INSTANCE)), a.t(ConfigPayload$$serializer.INSTANCE), a.t(f1.f20900a), new b(cVarB, null, new d[]{v2Var, v2Var}), new z0(v2Var, v2Var), i.f20933a, a.t(v2Var)};
    }

    @Override // fe.c
    public AdPayload deserialize(e decoder) {
        Object objD;
        Object objF;
        Object objD2;
        boolean z10;
        int i10;
        Object objD3;
        Object objD4;
        Object objF2;
        char c10;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        ie.c cVarB = decoder.b(descriptor2);
        int i11 = 6;
        int i12 = 5;
        int i13 = 4;
        if (cVarB.q()) {
            objD = cVarB.D(descriptor2, 0, new je.f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            objD3 = cVarB.D(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            objD4 = cVarB.D(descriptor2, 2, f1.f20900a, null);
            c cVarB2 = i0.b(ConcurrentHashMap.class);
            v2 v2Var = v2.f21024a;
            Object objF3 = cVarB.F(descriptor2, 3, new b(cVarB2, null, new d[]{v2Var, v2Var}), null);
            objF2 = cVarB.F(descriptor2, 4, new z0(v2Var, v2Var), null);
            boolean zP = cVarB.p(descriptor2, 5);
            objD2 = cVarB.D(descriptor2, 6, v2Var, null);
            z10 = zP;
            objF = objF3;
            i10 = 127;
        } else {
            boolean z11 = true;
            boolean zP2 = false;
            int i14 = 0;
            objD = null;
            Object objD5 = null;
            objF = null;
            Object objF4 = null;
            Object objD6 = null;
            Object objD7 = null;
            while (z11) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                        break;
                    case 0:
                        objD = cVarB.D(descriptor2, 0, new je.f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), objD);
                        i14 |= 1;
                        i11 = 6;
                        i12 = 5;
                        i13 = 4;
                        break;
                    case 1:
                        objD6 = cVarB.D(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, objD6);
                        i14 |= 2;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 2:
                        c10 = 3;
                        objD7 = cVarB.D(descriptor2, 2, f1.f20900a, objD7);
                        i14 |= 4;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 3:
                        c cVarB3 = i0.b(ConcurrentHashMap.class);
                        v2 v2Var2 = v2.f21024a;
                        c10 = 3;
                        objF = cVarB.F(descriptor2, 3, new b(cVarB3, null, new d[]{v2Var2, v2Var2}), objF);
                        i14 |= 8;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 4:
                        v2 v2Var3 = v2.f21024a;
                        objF4 = cVarB.F(descriptor2, i13, new z0(v2Var3, v2Var3), objF4);
                        i14 |= 16;
                        i11 = 6;
                        break;
                    case 5:
                        zP2 = cVarB.p(descriptor2, i12);
                        i14 |= 32;
                        break;
                    case 6:
                        objD5 = cVarB.D(descriptor2, i11, v2.f21024a, objD5);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            objD2 = objD5;
            z10 = zP2;
            i10 = i14;
            objD3 = objD6;
            objD4 = objD7;
            objF2 = objF4;
        }
        cVarB.c(descriptor2);
        return new AdPayload(i10, (List) objD, (ConfigPayload) objD3, (Long) objD4, (ConcurrentHashMap) objF, (Map) objF2, z10, (String) objD2, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, AdPayload value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        AdPayload.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

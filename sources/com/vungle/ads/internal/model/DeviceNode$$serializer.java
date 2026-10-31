package com.vungle.ads.internal.model;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceNode$$serializer implements l0<DeviceNode> {
    public static final DeviceNode$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        DeviceNode$$serializer deviceNode$$serializer = new DeviceNode$$serializer();
        INSTANCE = deviceNode$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.DeviceNode", deviceNode$$serializer, 11);
        g2Var.p("make", false);
        g2Var.p(DeviceRequestsHelper.DEVICE_INFO_MODEL, false);
        g2Var.p("osv", false);
        g2Var.p("carrier", true);
        g2Var.p("os", false);
        g2Var.p("w", false);
        g2Var.p("h", false);
        g2Var.p("ua", true);
        g2Var.p("ifa", true);
        g2Var.p("lmt", true);
        g2Var.p("ext", true);
        descriptor = g2Var;
    }

    private DeviceNode$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        v2 v2Var = v2.f21024a;
        u0 u0Var = u0.f21014a;
        return new d[]{v2Var, v2Var, v2Var, a.t(v2Var), v2Var, u0Var, u0Var, a.t(v2Var), a.t(v2Var), a.t(u0Var), a.t(DeviceNode$VungleExt$$serializer.INSTANCE)};
    }

    @Override // fe.c
    public DeviceNode deserialize(e decoder) {
        Object objD;
        String strL;
        Object objD2;
        Object objD3;
        Object objD4;
        Object objD5;
        int i10;
        String str;
        String str2;
        int i11;
        int i12;
        String str3;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i13 = 10;
        int i14 = 9;
        if (cVarB.q()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            String strL4 = cVarB.l(descriptor2, 2);
            v2 v2Var = v2.f21024a;
            objD5 = cVarB.D(descriptor2, 3, v2Var, null);
            String strL5 = cVarB.l(descriptor2, 4);
            int iX = cVarB.x(descriptor2, 5);
            int iX2 = cVarB.x(descriptor2, 6);
            objD4 = cVarB.D(descriptor2, 7, v2Var, null);
            Object objD6 = cVarB.D(descriptor2, 8, v2Var, null);
            objD2 = cVarB.D(descriptor2, 9, u0.f21014a, null);
            objD3 = cVarB.D(descriptor2, 10, DeviceNode$VungleExt$$serializer.INSTANCE, null);
            i11 = iX2;
            i12 = iX;
            str3 = strL5;
            strL = strL3;
            str = strL2;
            str2 = strL4;
            objD = objD6;
            i10 = 2047;
        } else {
            boolean z10 = true;
            int iX3 = 0;
            int i15 = 0;
            Object objD7 = null;
            Object objD8 = null;
            objD = null;
            Object objD9 = null;
            String strL6 = null;
            strL = null;
            String strL7 = null;
            String strL8 = null;
            Object objD10 = null;
            int iX4 = 0;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z10 = false;
                        i13 = 10;
                        break;
                    case 0:
                        strL6 = cVarB.l(descriptor2, 0);
                        i15 |= 1;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 1:
                        strL = cVarB.l(descriptor2, 1);
                        i15 |= 2;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 2:
                        strL7 = cVarB.l(descriptor2, 2);
                        i15 |= 4;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 3:
                        objD10 = cVarB.D(descriptor2, 3, v2.f21024a, objD10);
                        i15 |= 8;
                        i13 = 10;
                        i14 = 9;
                        break;
                    case 4:
                        strL8 = cVarB.l(descriptor2, 4);
                        i15 |= 16;
                        i13 = 10;
                        break;
                    case 5:
                        iX4 = cVarB.x(descriptor2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        iX3 = cVarB.x(descriptor2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        objD9 = cVarB.D(descriptor2, 7, v2.f21024a, objD9);
                        i15 |= 128;
                        break;
                    case 8:
                        objD = cVarB.D(descriptor2, 8, v2.f21024a, objD);
                        i15 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        break;
                    case 9:
                        objD7 = cVarB.D(descriptor2, i14, u0.f21014a, objD7);
                        i15 |= 512;
                        break;
                    case 10:
                        objD8 = cVarB.D(descriptor2, i13, DeviceNode$VungleExt$$serializer.INSTANCE, objD8);
                        i15 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            objD2 = objD7;
            objD3 = objD8;
            objD4 = objD9;
            objD5 = objD10;
            i10 = i15;
            str = strL6;
            str2 = strL7;
            i11 = iX3;
            i12 = iX4;
            str3 = strL8;
        }
        cVarB.c(descriptor2);
        return new DeviceNode(i10, str, strL, str2, (String) objD5, str3, i12, i11, (String) objD4, (String) objD, (Integer) objD2, (DeviceNode.VungleExt) objD3, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, DeviceNode value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        DeviceNode.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

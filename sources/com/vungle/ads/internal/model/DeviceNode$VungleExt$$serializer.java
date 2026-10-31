package com.vungle.ads.internal.model;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import je.f1;
import je.g2;
import je.i;
import je.k0;
import je.l0;
import je.q2;
import je.u0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: DeviceNode.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceNode$VungleExt$$serializer implements l0<DeviceNode.VungleExt> {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 23);
        g2Var.p("is_google_play_services_available", true);
        g2Var.p("app_set_id", true);
        g2Var.p("app_set_id_scope", true);
        g2Var.p("battery_level", true);
        g2Var.p("battery_state", true);
        g2Var.p("battery_saver_enabled", true);
        g2Var.p("connection_type", true);
        g2Var.p("connection_type_detail", true);
        g2Var.p("locale", true);
        g2Var.p("language", true);
        g2Var.p("time_zone", true);
        g2Var.p("volume_level", true);
        g2Var.p("sound_enabled", true);
        g2Var.p("is_tv", true);
        g2Var.p("sd_card_available", true);
        g2Var.p("is_sideload_enabled", true);
        g2Var.p("gaid", true);
        g2Var.p("amazon_advertising_id", true);
        g2Var.p("sit", true);
        g2Var.p("oit", true);
        g2Var.p("ort", true);
        g2Var.p("obt", true);
        g2Var.p("gp_version", true);
        descriptor = g2Var;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        i iVar = i.f20933a;
        v2 v2Var = v2.f21024a;
        u0 u0Var = u0.f21014a;
        k0 k0Var = k0.f20952a;
        f1 f1Var = f1.f20900a;
        return new d[]{iVar, a.t(v2Var), a.t(u0Var), k0Var, a.t(v2Var), u0Var, a.t(v2Var), a.t(v2Var), a.t(v2Var), a.t(v2Var), a.t(v2Var), k0Var, u0Var, iVar, u0Var, iVar, a.t(v2Var), a.t(v2Var), a.t(f1Var), a.t(f1Var), a.t(f1Var), a.t(f1Var), a.t(v2Var)};
    }

    @Override // fe.c
    public DeviceNode.VungleExt deserialize(e decoder) {
        Object objD;
        int iX;
        int iX2;
        float fJ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i10;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        int i11;
        Object objD2;
        int i12;
        int i13;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i14 = 0;
        if (cVarB.q()) {
            boolean zP = cVarB.p(descriptor2, 0);
            v2 v2Var = v2.f21024a;
            Object objD3 = cVarB.D(descriptor2, 1, v2Var, null);
            Object objD4 = cVarB.D(descriptor2, 2, u0.f21014a, null);
            float fJ2 = cVarB.j(descriptor2, 3);
            Object objD5 = cVarB.D(descriptor2, 4, v2Var, null);
            int iX3 = cVarB.x(descriptor2, 5);
            Object objD6 = cVarB.D(descriptor2, 6, v2Var, null);
            Object objD7 = cVarB.D(descriptor2, 7, v2Var, null);
            Object objD8 = cVarB.D(descriptor2, 8, v2Var, null);
            Object objD9 = cVarB.D(descriptor2, 9, v2Var, null);
            Object objD10 = cVarB.D(descriptor2, 10, v2Var, null);
            float fJ3 = cVarB.j(descriptor2, 11);
            int iX4 = cVarB.x(descriptor2, 12);
            boolean zP2 = cVarB.p(descriptor2, 13);
            int iX5 = cVarB.x(descriptor2, 14);
            boolean zP3 = cVarB.p(descriptor2, 15);
            obj5 = objD3;
            Object objD11 = cVarB.D(descriptor2, 16, v2Var, null);
            Object objD12 = cVarB.D(descriptor2, 17, v2Var, null);
            f1 f1Var = f1.f20900a;
            f10 = fJ2;
            Object objD13 = cVarB.D(descriptor2, 18, f1Var, null);
            Object objD14 = cVarB.D(descriptor2, 19, f1Var, null);
            Object objD15 = cVarB.D(descriptor2, 20, f1Var, null);
            Object objD16 = cVarB.D(descriptor2, 21, f1Var, null);
            objD2 = cVarB.D(descriptor2, 22, v2Var, null);
            obj3 = objD5;
            obj4 = objD4;
            iX = iX4;
            iX2 = iX3;
            obj2 = objD7;
            obj = objD6;
            fJ = fJ3;
            obj10 = objD13;
            z10 = zP3;
            z11 = zP;
            obj8 = objD15;
            obj9 = objD16;
            obj13 = objD8;
            obj11 = objD10;
            z12 = zP2;
            obj6 = objD11;
            obj7 = objD14;
            obj12 = objD9;
            objD = objD12;
            i11 = iX5;
            i10 = 8388607;
        } else {
            Object objD17 = null;
            boolean z13 = true;
            Object objD18 = null;
            Object objD19 = null;
            Object objD20 = null;
            Object objD21 = null;
            Object objD22 = null;
            Object objD23 = null;
            Object objD24 = null;
            objD = null;
            Object objD25 = null;
            Object objD26 = null;
            Object objD27 = null;
            Object objD28 = null;
            Object objD29 = null;
            boolean zP4 = false;
            iX = 0;
            boolean zP5 = false;
            boolean zP6 = false;
            int iX6 = 0;
            iX2 = 0;
            float fJ4 = 0.0f;
            fJ = 0.0f;
            Object objD30 = null;
            while (z13) {
                Object obj14 = objD22;
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z13 = false;
                        objD22 = obj14;
                        objD18 = objD18;
                        objD28 = objD28;
                        objD20 = objD20;
                        break;
                    case 0:
                        zP5 = cVarB.p(descriptor2, 0);
                        i14 |= 1;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        objD28 = objD28;
                        objD20 = objD20;
                        break;
                    case 1:
                        i14 |= 2;
                        objD29 = objD29;
                        objD22 = obj14;
                        objD19 = objD19;
                        objD20 = objD20;
                        objD28 = cVarB.D(descriptor2, 1, v2.f21024a, objD28);
                        objD18 = objD18;
                        break;
                    case 2:
                        objD29 = cVarB.D(descriptor2, 2, u0.f21014a, objD29);
                        i14 |= 4;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        objD20 = objD20;
                        break;
                    case 3:
                        fJ4 = cVarB.j(descriptor2, 3);
                        i14 |= 8;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        objD20 = objD20;
                        break;
                    case 4:
                        i14 |= 16;
                        objD22 = cVarB.D(descriptor2, 4, v2.f21024a, obj14);
                        objD19 = objD19;
                        objD20 = objD20;
                        objD18 = objD18;
                        break;
                    case 5:
                        iX2 = cVarB.x(descriptor2, 5);
                        i14 |= 32;
                        objD18 = objD18;
                        objD20 = objD20;
                        objD22 = obj14;
                        break;
                    case 6:
                        objD19 = cVarB.D(descriptor2, 6, v2.f21024a, objD19);
                        i14 |= 64;
                        objD18 = objD18;
                        objD20 = objD20;
                        objD22 = obj14;
                        break;
                    case 7:
                        objD18 = objD18;
                        objD19 = objD19;
                        objD20 = cVarB.D(descriptor2, 7, v2.f21024a, objD20);
                        i14 |= 128;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 8:
                        objD18 = objD18;
                        objD19 = objD19;
                        objD27 = cVarB.D(descriptor2, 8, v2.f21024a, objD27);
                        i14 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 9:
                        objD18 = objD18;
                        objD19 = objD19;
                        objD26 = cVarB.D(descriptor2, 9, v2.f21024a, objD26);
                        i14 |= 512;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 10:
                        objD18 = objD18;
                        objD19 = objD19;
                        objD25 = cVarB.D(descriptor2, 10, v2.f21024a, objD25);
                        i14 |= 1024;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 11:
                        objD18 = objD18;
                        objD19 = objD19;
                        fJ = cVarB.j(descriptor2, 11);
                        i14 |= 2048;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 12:
                        objD18 = objD18;
                        objD19 = objD19;
                        iX = cVarB.x(descriptor2, 12);
                        i14 |= 4096;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 13:
                        objD18 = objD18;
                        objD19 = objD19;
                        zP6 = cVarB.p(descriptor2, 13);
                        i14 |= 8192;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 14:
                        objD18 = objD18;
                        objD19 = objD19;
                        iX6 = cVarB.x(descriptor2, 14);
                        i14 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 15:
                        objD18 = objD18;
                        objD19 = objD19;
                        zP4 = cVarB.p(descriptor2, 15);
                        i14 |= 32768;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 16:
                        objD21 = cVarB.D(descriptor2, 16, v2.f21024a, objD21);
                        i12 = NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                        i14 |= i12;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 17:
                        objD = cVarB.D(descriptor2, 17, v2.f21024a, objD);
                        i12 = 131072;
                        i14 |= i12;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 18:
                        objD24 = cVarB.D(descriptor2, 18, f1.f20900a, objD24);
                        i12 = 262144;
                        i14 |= i12;
                        objD18 = objD18;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 19:
                        objD17 = cVarB.D(descriptor2, 19, f1.f20900a, objD17);
                        i13 = 524288;
                        i14 |= i13;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 20:
                        objD30 = cVarB.D(descriptor2, 20, f1.f20900a, objD30);
                        i13 = 1048576;
                        i14 |= i13;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 21:
                        objD23 = cVarB.D(descriptor2, 21, f1.f20900a, objD23);
                        i13 = 2097152;
                        i14 |= i13;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    case 22:
                        objD18 = cVarB.D(descriptor2, 22, v2.f21024a, objD18);
                        i13 = 4194304;
                        i14 |= i13;
                        objD22 = obj14;
                        objD19 = objD19;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            Object obj15 = objD18;
            obj = objD19;
            obj2 = objD20;
            obj3 = objD22;
            Object obj16 = objD28;
            obj4 = objD29;
            obj5 = obj16;
            obj6 = objD21;
            obj7 = objD17;
            i10 = i14;
            obj8 = objD30;
            obj9 = objD23;
            obj10 = objD24;
            obj11 = objD25;
            obj12 = objD26;
            obj13 = objD27;
            z10 = zP4;
            f10 = fJ4;
            z11 = zP5;
            z12 = zP6;
            i11 = iX6;
            objD2 = obj15;
        }
        cVarB.c(descriptor2);
        return new DeviceNode.VungleExt(i10, z11, (String) obj5, (Integer) obj4, f10, (String) obj3, iX2, (String) obj, (String) obj2, (String) obj13, (String) obj12, (String) obj11, fJ, iX, z12, i11, z10, (String) obj6, (String) objD, (Long) obj10, (Long) obj7, (Long) obj8, (Long) obj9, (String) objD2, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, DeviceNode.VungleExt value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        DeviceNode.VungleExt.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

package com.vungle.ads.internal.model;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fe.d;
import ge.a;
import he.f;
import ie.c;
import ie.e;
import java.util.List;
import je.f1;
import je.g2;
import je.i;
import je.l0;
import je.q2;
import je.u0;
import je.v2;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ConfigPayload$$serializer implements l0<ConfigPayload> {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 18);
        g2Var.p("reuse_assets", true);
        g2Var.p("config", true);
        g2Var.p("endpoints", true);
        g2Var.p("log_metrics", true);
        g2Var.p("placements", true);
        g2Var.p("user", true);
        g2Var.p(Cookie.CONFIG_EXTENSION, true);
        g2Var.p(Cookie.COPPA_DISABLE_AD_ID, true);
        g2Var.p("ri_enabled", true);
        g2Var.p("session_timeout", true);
        g2Var.p("wait_for_connectivity_for_tpat", true);
        g2Var.p("sdk_session_timeout", true);
        g2Var.p("signals_disabled", true);
        g2Var.p("fpd_enabled", true);
        g2Var.p("rta_debugging", true);
        g2Var.p("config_last_validated_ts", true);
        g2Var.p("auto_redirect", true);
        g2Var.p("enable_ot", true);
        descriptor = g2Var;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        i iVar = i.f20933a;
        u0 u0Var = u0.f21014a;
        return new d[]{a.t(ConfigPayload$CleverCache$$serializer.INSTANCE), a.t(ConfigPayload$ConfigSettings$$serializer.INSTANCE), a.t(ConfigPayload$Endpoints$$serializer.INSTANCE), a.t(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), a.t(new je.f(Placement$$serializer.INSTANCE)), a.t(ConfigPayload$UserPrivacy$$serializer.INSTANCE), a.t(v2.f21024a), a.t(iVar), a.t(iVar), a.t(u0Var), a.t(iVar), a.t(u0Var), a.t(iVar), a.t(iVar), a.t(iVar), a.t(f1.f20900a), a.t(ConfigPayload$AutoRedirect$$serializer.INSTANCE), a.t(iVar)};
    }

    @Override // fe.c
    public ConfigPayload deserialize(e decoder) {
        Object objD;
        Object obj;
        Object objD2;
        int i10;
        Object objD3;
        Object obj2;
        Object objD4;
        Object objD5;
        Object objD6;
        Object objD7;
        Object obj3;
        Object objD8;
        Object objD9;
        Object objD10;
        Object objD11;
        Object obj4;
        Object objD12;
        Object objD13;
        Object objD14;
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.q()) {
            Object objD15 = cVarB.D(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            objD3 = cVarB.D(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objD2 = cVarB.D(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            objD14 = cVarB.D(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            objD6 = cVarB.D(descriptor2, 4, new je.f(Placement$$serializer.INSTANCE), null);
            objD7 = cVarB.D(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            objD5 = cVarB.D(descriptor2, 6, v2.f21024a, null);
            i iVar = i.f20933a;
            objD4 = cVarB.D(descriptor2, 7, iVar, null);
            Object objD16 = cVarB.D(descriptor2, 8, iVar, null);
            u0 u0Var = u0.f21014a;
            objD13 = cVarB.D(descriptor2, 9, u0Var, null);
            objD12 = cVarB.D(descriptor2, 10, iVar, null);
            Object objD17 = cVarB.D(descriptor2, 11, u0Var, null);
            objD11 = cVarB.D(descriptor2, 12, iVar, null);
            obj4 = objD17;
            objD10 = cVarB.D(descriptor2, 13, iVar, null);
            objD9 = cVarB.D(descriptor2, 14, iVar, null);
            obj2 = objD16;
            objD8 = cVarB.D(descriptor2, 15, f1.f20900a, null);
            Object objD18 = cVarB.D(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            objD = cVarB.D(descriptor2, 17, iVar, null);
            i10 = 262143;
            obj3 = objD18;
            obj = objD15;
        } else {
            boolean z10 = true;
            Object objD19 = null;
            Object objD20 = null;
            Object objD21 = null;
            Object objD22 = null;
            Object objD23 = null;
            Object objD24 = null;
            Object objD25 = null;
            Object objD26 = null;
            Object objD27 = null;
            Object objD28 = null;
            Object objD29 = null;
            Object objD30 = null;
            Object objD31 = null;
            Object objD32 = null;
            Object objD33 = null;
            Object objD34 = null;
            Object objD35 = null;
            int i11 = 0;
            Object objD36 = null;
            while (z10) {
                int iF = cVarB.f(descriptor2);
                switch (iF) {
                    case -1:
                        z10 = false;
                        objD36 = objD36;
                        objD22 = objD22;
                        objD20 = objD20;
                        objD35 = objD35;
                        objD19 = objD19;
                        break;
                    case 0:
                        i11 |= 1;
                        objD36 = objD36;
                        objD22 = objD22;
                        objD19 = objD19;
                        objD20 = objD20;
                        objD35 = cVarB.D(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objD35);
                        break;
                    case 1:
                        i11 |= 2;
                        objD22 = objD22;
                        objD19 = objD19;
                        objD36 = cVarB.D(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objD36);
                        break;
                    case 2:
                        objD21 = cVarB.D(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objD21);
                        i11 |= 4;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 3:
                        objD20 = cVarB.D(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objD20);
                        i11 |= 8;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 4:
                        objD28 = cVarB.D(descriptor2, 4, new je.f(Placement$$serializer.INSTANCE), objD28);
                        i11 |= 16;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 5:
                        objD29 = cVarB.D(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objD29);
                        i11 |= 32;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 6:
                        objD27 = cVarB.D(descriptor2, 6, v2.f21024a, objD27);
                        i11 |= 64;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 7:
                        objD26 = cVarB.D(descriptor2, 7, i.f20933a, objD26);
                        i11 |= 128;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 8:
                        objD25 = cVarB.D(descriptor2, 8, i.f20933a, objD25);
                        i11 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 9:
                        objD19 = cVarB.D(descriptor2, 9, u0.f21014a, objD19);
                        i11 |= 512;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 10:
                        objD24 = cVarB.D(descriptor2, 10, i.f20933a, objD24);
                        i11 |= 1024;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 11:
                        objD23 = cVarB.D(descriptor2, 11, u0.f21014a, objD23);
                        i11 |= 2048;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 12:
                        objD36 = objD36;
                        objD30 = cVarB.D(descriptor2, 12, i.f20933a, objD30);
                        i11 |= 4096;
                        objD22 = objD22;
                        objD31 = objD31;
                        objD36 = objD36;
                        break;
                    case 13:
                        objD36 = objD36;
                        objD31 = cVarB.D(descriptor2, 13, i.f20933a, objD31);
                        i11 |= 8192;
                        objD22 = objD22;
                        objD32 = objD32;
                        objD36 = objD36;
                        break;
                    case 14:
                        objD36 = objD36;
                        objD32 = cVarB.D(descriptor2, 14, i.f20933a, objD32);
                        i11 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        objD22 = objD22;
                        objD33 = objD33;
                        objD36 = objD36;
                        break;
                    case 15:
                        objD36 = objD36;
                        objD33 = cVarB.D(descriptor2, 15, f1.f20900a, objD33);
                        i11 |= 32768;
                        objD22 = objD22;
                        objD34 = objD34;
                        objD36 = objD36;
                        break;
                    case 16:
                        objD34 = cVarB.D(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objD34);
                        i11 |= NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                        objD22 = objD22;
                        objD36 = objD36;
                        break;
                    case 17:
                        objD22 = cVarB.D(descriptor2, 17, i.f20933a, objD22);
                        i11 |= 131072;
                        objD36 = objD36;
                        break;
                    default:
                        throw new UnknownFieldException(iF);
                }
            }
            Object obj5 = objD19;
            objD = objD22;
            Object obj6 = objD35;
            Object obj7 = objD20;
            obj = obj6;
            objD2 = objD21;
            i10 = i11;
            objD3 = objD36;
            obj2 = objD25;
            objD4 = objD26;
            objD5 = objD27;
            objD6 = objD28;
            objD7 = objD29;
            obj3 = objD34;
            objD8 = objD33;
            objD9 = objD32;
            objD10 = objD31;
            objD11 = objD30;
            obj4 = objD23;
            objD12 = objD24;
            objD13 = obj5;
            objD14 = obj7;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload(i10, (ConfigPayload.CleverCache) obj, (ConfigPayload.ConfigSettings) objD3, (ConfigPayload.Endpoints) objD2, (ConfigPayload.LogMetricsSettings) objD14, (List) objD6, (ConfigPayload.UserPrivacy) objD7, (String) objD5, (Boolean) objD4, (Boolean) obj2, (Integer) objD13, (Boolean) objD12, (Integer) obj4, (Boolean) objD11, (Boolean) objD10, (Boolean) objD9, (Long) objD8, (ConfigPayload.AutoRedirect) obj3, (Boolean) objD, (q2) null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, ConfigPayload value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        ConfigPayload.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}

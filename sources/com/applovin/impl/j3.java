package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class j3 extends a3 {
    protected j3(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.l lVar) {
        super(c3Var, jSONObject, jSONObject2, hVar, lVar);
    }

    public float m0() {
        return b("viewability_min_alpha", ((Float) this.f7104a.a(z4.A1)).floatValue() / 100.0f);
    }

    public int n0() {
        return a("viewability_min_pixels", -1);
    }

    public int o0() {
        z4 z4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            z4Var = z4.f9351t1;
        } else if (format == MaxAdFormat.MREC) {
            z4Var = z4.f9369v1;
        } else if (format == MaxAdFormat.LEADER) {
            z4Var = z4.f9387x1;
        } else {
            z4Var = format == MaxAdFormat.NATIVE ? z4.f9403z1 : null;
        }
        if (z4Var != null) {
            return a("viewability_min_height", ((Integer) this.f7104a.a(z4Var)).intValue());
        }
        return 0;
    }

    public float p0() {
        return b("viewability_min_percentage_dp", -1.0f);
    }

    public float q0() {
        return b("viewability_min_percentage_pixels", -1.0f);
    }

    public long r0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f7104a.a(z4.B1)).longValue());
    }

    public int s0() {
        z4 z4Var;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            z4Var = z4.f9342s1;
        } else if (format == MaxAdFormat.MREC) {
            z4Var = z4.f9360u1;
        } else if (format == MaxAdFormat.LEADER) {
            z4Var = z4.f9378w1;
        } else {
            z4Var = format == MaxAdFormat.NATIVE ? z4.f9395y1 : null;
        }
        if (z4Var != null) {
            return a("viewability_min_width", ((Integer) this.f7104a.a(z4Var)).intValue());
        }
        return 0;
    }

    public boolean t0() {
        return n0() >= 0 || p0() >= 0.0f || q0() >= 0.0f;
    }
}

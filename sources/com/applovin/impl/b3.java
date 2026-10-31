package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b3 extends g2 {
    public b3(com.applovin.impl.sdk.l lVar) {
        super(lVar, f2.b.MEDIATED_AD);
    }

    public void a(f2 f2Var, a3 a3Var) {
        a(f2Var, a3Var, new HashMap());
    }

    public void a(f2 f2Var, a3 a3Var, Map map) {
        a(f2Var, a3Var.getFormat(), a3Var.getAdUnitId(), a3Var, null, map);
    }

    public void a(f2 f2Var, a3 a3Var, MaxError maxError) {
        a(f2Var, a3Var, maxError, new HashMap());
    }

    public void a(f2 f2Var, a3 a3Var, MaxError maxError, Map map) {
        a(f2Var, a3Var.getFormat(), a3Var.getAdUnitId(), a3Var, maxError, map);
    }

    public void a(f2 f2Var, MaxAdFormat maxAdFormat, String str, MaxError maxError) {
        a(f2Var, maxAdFormat, str, null, maxError, new HashMap());
    }

    private void a(f2 f2Var, MaxAdFormat maxAdFormat, String str, a3 a3Var, MaxError maxError, Map map) {
        if (a3Var != null) {
            map.putAll(h2.a(a3Var));
        } else {
            CollectionUtils.putStringIfValid("ad_unit_id", str, map);
            CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), map);
        }
        if (maxError != null) {
            map.putAll(h2.a(maxError));
        }
        d(f2Var, map);
    }
}

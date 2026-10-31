package io.bidmachine.analytics.internal.C;

import io.bidmachine.analytics.internal.g.h;
import java.util.Map;
import kotlin.collections.o0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final c a(io.bidmachine.analytics.internal.g.d dVar) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        byte[] bytes2 = dVar.a().isEmpty() ? new byte[0] : io.bidmachine.analytics.internal.E.e.a(dVar.a()).toString().getBytes(rd.d.f24999b);
        String strC = dVar.c();
        String strD = dVar.d();
        String strE = dVar.e();
        long jF = dVar.f();
        h hVarB = dVar.b();
        if (hVarB == null || (jSONObjectA = g.a(hVarB)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(rd.d.f24999b)) == null) {
            bytes = new byte[0];
        }
        return new c(strC, strD, strE, jF, bytes2, bytes);
    }

    public static final io.bidmachine.analytics.internal.g.d a(c cVar) {
        Map mapA;
        if (cVar.a().length == 0) {
            mapA = o0.h();
        } else {
            mapA = io.bidmachine.analytics.internal.E.e.a(new JSONObject(new String(cVar.a(), rd.d.f24999b)));
        }
        return new io.bidmachine.analytics.internal.g.d(cVar.c(), cVar.d(), cVar.e(), cVar.f(), mapA, cVar.b().length == 0 ? null : g.a(new JSONObject(new String(cVar.b(), rd.d.f24999b))));
    }
}

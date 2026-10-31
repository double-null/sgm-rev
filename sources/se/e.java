package se;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import me.b0;
import me.m;
import me.n;
import me.t;
import me.u;
import rd.c0;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final af.h f25429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final af.h f25430b;

    static {
        af.h.a aVar = af.h.f361d;
        f25429a = aVar.d("\"\\");
        f25430b = aVar.d("\t ,=");
    }

    public static final List<me.h> a(t tVar, String headerName) {
        kotlin.jvm.internal.t.f(tVar, "<this>");
        kotlin.jvm.internal.t.f(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (c0.B(headerName, tVar.c(i10), true)) {
                try {
                    c(new af.e().writeUtf8(tVar.e(i10)), arrayList);
                } catch (EOFException e10) {
                    we.h.f27895a.g().k("Unable to parse challenge", 5, e10);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final boolean b(b0 b0Var) {
        kotlin.jvm.internal.t.f(b0Var, "<this>");
        if (kotlin.jvm.internal.t.a(b0Var.G().h(), "HEAD")) {
            return false;
        }
        int iH = b0Var.h();
        return (((iH >= 100 && iH < 200) || iH == 204 || iH == 304) && ne.d.v(b0Var) == -1 && !c0.B("chunked", b0.p(b0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0079 A[EDGE_INSN: B:59:0x0079->B:28:0x0079 BREAK  A[LOOP:2: B:22:0x0066->B:49:0x00b9], SYNTHETIC] */
    private static final void c(af.e eVar, List<me.h> list) throws EOFException {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(eVar);
                    strE2 = e(eVar);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(eVar);
                String strE3 = e(eVar);
                if (strE3 == null) {
                    if (eVar.exhausted()) {
                        list.add(new me.h(strE2, o0.h()));
                        return;
                    }
                    return;
                }
                int iL = ne.d.L(eVar, (byte) 61);
                boolean zG2 = g(eVar);
                if (zG || !(zG2 || eVar.exhausted())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iL2 = iL + ne.d.L(eVar, (byte) 61);
                    while (true) {
                        if (strE3 == null) {
                            strE3 = e(eVar);
                            if (g(eVar)) {
                                break;
                            }
                            iL2 = ne.d.L(eVar, (byte) 61);
                            if (iL2 == 0) {
                                break;
                            }
                            if (iL2 <= 1 || g(eVar)) {
                                return;
                            }
                            if (h(eVar, (byte) 34)) {
                                strE = d(eVar);
                            } else {
                                strE = e(eVar);
                            }
                            if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                                return;
                            }
                            if (g(eVar) && !eVar.exhausted()) {
                                return;
                            } else {
                                strE3 = null;
                            }
                        } else {
                            if (iL2 == 0) {
                                break;
                                break;
                            }
                            if (iL2 <= 1) {
                                return;
                            }
                            if (h(eVar, (byte) 34)) {
                                strE = d(eVar);
                            } else {
                                strE = e(eVar);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(eVar)) {
                            }
                            strE3 = null;
                        }
                    }
                    list.add(new me.h(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, kotlin.jvm.internal.t.n(strE3, c0.G("=", iL)));
                    kotlin.jvm.internal.t.e(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new me.h(strE2, mapSingletonMap));
                }
            }
        }
    }

    private static final String d(af.e eVar) throws EOFException {
        if (!(eVar.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        af.e eVar2 = new af.e();
        while (true) {
            long jU = eVar.u(f25429a);
            if (jU == -1) {
                return null;
            }
            if (eVar.t(jU) == 34) {
                eVar2.y(eVar, jU);
                eVar.readByte();
                return eVar2.readUtf8();
            }
            if (eVar.size() == jU + 1) {
                return null;
            }
            eVar2.y(eVar, jU);
            eVar.readByte();
            eVar2.y(eVar, 1L);
        }
    }

    private static final String e(af.e eVar) {
        long jU = eVar.u(f25430b);
        if (jU == -1) {
            jU = eVar.size();
        }
        if (jU != 0) {
            return eVar.readUtf8(jU);
        }
        return null;
    }

    public static final void f(n nVar, u url, t headers) {
        kotlin.jvm.internal.t.f(nVar, "<this>");
        kotlin.jvm.internal.t.f(url, "url");
        kotlin.jvm.internal.t.f(headers, "headers");
        if (nVar == n.f22512b) {
            return;
        }
        List<m> listE = m.f22497j.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        nVar.a(url, listE);
    }

    private static final boolean g(af.e eVar) throws EOFException {
        boolean z10 = false;
        while (!eVar.exhausted()) {
            byte bT = eVar.t(0L);
            boolean z11 = true;
            if (bT != 44) {
                if (bT != 32 && bT != 9) {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                eVar.readByte();
            } else {
                eVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(af.e eVar, byte b10) {
        return !eVar.exhausted() && eVar.t(0L) == b10;
    }
}

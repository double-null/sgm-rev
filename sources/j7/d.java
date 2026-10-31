package j7;

import android.text.TextUtils;
import android.util.Pair;
import h7.g;
import h7.j;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.net.ssl.SSLException;
import l7.h;
import l7.i;
import l7.k;
import l7.m;
import l7.n;
import l7.s;
import l7.t;
import l7.w;
import l7.x;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f20665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f20666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Stack f20667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20668e;

    public d(g gVar, c<n> cVar) {
        this(gVar, cVar, 5);
    }

    private Pair a(k kVar) {
        m mVar;
        List<n> listZ0;
        List<i> listZ1 = kVar.z0();
        if (listZ1 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (i iVar : listZ1) {
            if (iVar != null) {
                h hVarT0 = iVar.t0();
                if ((hVarT0 instanceof m) && (listZ0 = (mVar = (m) hVarT0).z0()) != null && !listZ0.isEmpty()) {
                    Iterator<n> it = listZ0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair(mVar, it.next()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Pair pairB = this.f20665b.b(arrayList);
        return pairB != null ? pairB : new Pair(null, null);
    }

    private e b(l7.a aVar, t tVar, f fVar) {
        e eVar = new e();
        for (int i10 = 0; i10 < tVar.t0().size(); i10++) {
            l7.c cVar = tVar.t0().get(i10);
            if (cVar != null && cVar.t0() != null) {
                l7.a aVarT0 = cVar.t0();
                if (aVarT0 instanceof k) {
                    e eVarI = i((k) aVarT0);
                    if (eVarI.i()) {
                        return eVarI;
                    }
                    f(eVarI.a());
                    if (aVar == null) {
                        eVar.b(eVarI.h());
                    } else if (eVarI.f()) {
                        j jVarH = eVarI.h();
                        if (jVarH == null) {
                            jVarH = j.f15706n;
                        }
                        eVar.d(aVar, jVarH);
                    }
                } else if ((aVarT0 instanceof x) && fVar.c()) {
                    e eVarC = c((x) aVarT0);
                    if (eVarC.i()) {
                        return eVarC;
                    }
                    f(eVarC.a());
                    if (aVar == null) {
                        eVar.b(j.f15700h);
                    } else if (eVarC.f()) {
                        j jVarH2 = eVarC.h();
                        if (jVarH2 == null) {
                            jVarH2 = j.f15706n;
                        }
                        eVar.d(aVar, jVarH2);
                    } else {
                        eVar.d(aVar, j.f15700h);
                    }
                    if (i10 == 0 && !fVar.b()) {
                        return eVar;
                    }
                }
                j(aVarT0);
            }
        }
        if (eVar.h() == null && aVar != null) {
            eVar.d(aVar, j.f15700h);
        }
        return eVar;
    }

    private ArrayList d() {
        ArrayList arrayList = new ArrayList();
        if (this.f20667d.empty()) {
            return arrayList;
        }
        for (l7.a aVar : this.f20667d) {
            if (aVar != null && aVar.A0() != null) {
                arrayList.addAll(aVar.A0());
            }
        }
        return arrayList;
    }

    private ArrayList e(l7.a aVar) {
        ArrayList arrayList = new ArrayList();
        List<i> listZ0 = aVar.z0();
        if (listZ0 == null) {
            return arrayList;
        }
        for (i iVar : listZ0) {
            if (iVar != null) {
                h hVarT0 = iVar.t0();
                if (hVarT0 instanceof l7.f) {
                    arrayList.addAll(((l7.f) hVarT0).t0());
                }
            }
        }
        return arrayList;
    }

    private void g(List list, l7.f fVar) {
        List<String> listV0;
        for (l7.g gVar : fVar.t0()) {
            if (!gVar.B0() && (listV0 = gVar.v0()) != null) {
                list.addAll(listV0);
            }
        }
    }

    private void h(Map map, Map map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            h7.a aVar = (h7.a) entry.getKey();
            List arrayList = (List) map.get(aVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(aVar, arrayList);
            }
            arrayList.addAll((Collection) entry.getValue());
        }
    }

    private e i(k kVar) {
        this.f20667d.push(kVar);
        e eVar = new e();
        Pair pairA = a(kVar);
        if (pairA == null) {
            eVar.d(kVar, j.f15695c);
        } else if (pairA.first == null && pairA.second == null) {
            eVar.d(kVar, j.f15703k);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<String> arrayList3 = new ArrayList<>();
            EnumMap enumMap = new EnumMap(h7.a.class);
            ArrayList arrayList4 = new ArrayList();
            l7.e eVar2 = null;
            if (!this.f20667d.empty()) {
                for (l7.a aVar : this.f20667d) {
                    if (aVar != null) {
                        if (aVar.C0() != null) {
                            arrayList.addAll(aVar.C0());
                        }
                        List<i> listZ0 = aVar.z0();
                        if (listZ0 != null) {
                            for (i iVar : listZ0) {
                                if (iVar != null) {
                                    h hVarT0 = iVar.t0();
                                    if (hVarT0 instanceof m) {
                                        m mVar = (m) hVarT0;
                                        w wVarB0 = mVar.B0();
                                        if (wVarB0 != null && wVarB0.u0() != null) {
                                            arrayList2.addAll(wVarB0.u0());
                                        }
                                        h(enumMap, mVar.A0());
                                    } else if (hVarT0 instanceof l7.f) {
                                        g(arrayList3, (l7.f) hVarT0);
                                    }
                                }
                            }
                        }
                        List<l7.j> listB0 = aVar.B0();
                        if (listB0 != null) {
                            for (l7.j jVar : listB0) {
                                if (jVar instanceof l7.e) {
                                    if (eVar2 == null) {
                                        eVar2 = (l7.e) jVar;
                                    }
                                } else if (jVar instanceof l7.d) {
                                    arrayList4.add((l7.d) jVar);
                                }
                            }
                        }
                    }
                }
            }
            b bVar = new b((m) pairA.first, (n) pairA.second);
            bVar.g(arrayList);
            bVar.f(d());
            bVar.b(arrayList2);
            bVar.v(arrayList3);
            bVar.c(enumMap);
            bVar.e(e(kVar));
            bVar.d(eVar2);
            bVar.t(arrayList4);
            eVar.c(bVar);
        }
        return eVar;
    }

    private boolean k() {
        return this.f20668e >= this.f20666c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    e c(x xVar) {
        e eVar = new e();
        if (k()) {
            h7.e.b("VastProcessor", "VAST wrapping exceeded max limit of %d", Integer.valueOf(this.f20666c));
            eVar.d(xVar, j.f15699g);
            return eVar;
        }
        this.f20668e++;
        this.f20667d.push(xVar);
        if (TextUtils.isEmpty(xVar.F0())) {
            h7.e.b("VastProcessor", "VASTAdTagURI is null or empty", new Object[0]);
            eVar.d(xVar, j.f15698f);
            return eVar;
        }
        f fVar = new f(xVar);
        InputStream inputStream = null;
        try {
            try {
                try {
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(xVar.F0()).openConnection();
                        int responseCode = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                        if (responseCode != 200) {
                            if (responseCode != 204) {
                                eVar.d(xVar, j.f15698f);
                                return eVar;
                            }
                            h7.e.b("VastProcessor", "Wrapper response code: 204", new Object[0]);
                            eVar.d(xVar, j.f15700h);
                            return eVar;
                        }
                        InputStream inputStream2 = uRLConnectionOpenConnection.getInputStream();
                        t tVarA = s.a(inputStream2);
                        if (tVarA == null) {
                            h7.e.b("VastProcessor", "Invalid Vast", new Object[0]);
                            eVar.d(xVar, j.f15695c);
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception e10) {
                                    h7.e.c("VastProcessor", e10);
                                }
                            }
                            return eVar;
                        }
                        if (!tVarA.u0()) {
                            h7.e.b("VastProcessor", "Vast has no ad", new Object[0]);
                            eVar.d(xVar, j.f15700h);
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception e11) {
                                    h7.e.c("VastProcessor", e11);
                                }
                            }
                            return eVar;
                        }
                        if (tVarA.t0().size() > 1 && !fVar.a()) {
                            eVar.d(xVar, j.f15697e);
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception e12) {
                                    h7.e.c("VastProcessor", e12);
                                }
                            }
                            return eVar;
                        }
                        e eVarB = b(xVar, tVarA, fVar);
                        eVarB.e(false);
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Exception e13) {
                                h7.e.c("VastProcessor", e13);
                            }
                        }
                        return eVarB;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Exception e14) {
                                h7.e.c("VastProcessor", e14);
                            }
                        }
                        throw th;
                    }
                } catch (UnknownHostException e15) {
                    e = e15;
                    h7.e.c("VastProcessor", e);
                    eVar.d(xVar, j.f15698f);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e16) {
                            h7.e.c("VastProcessor", e16);
                        }
                    }
                    return eVar;
                } catch (Exception e17) {
                    h7.e.c("VastProcessor", e17);
                    eVar.d(xVar, j.f15694b);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e18) {
                            h7.e.c("VastProcessor", e18);
                        }
                    }
                    return eVar;
                }
            } catch (SocketTimeoutException e19) {
                e = e19;
                h7.e.c("VastProcessor", e);
                eVar.d(xVar, j.f15698f);
                if (0 != 0) {
                    inputStream.close();
                }
                return eVar;
            } catch (IOException e20) {
                h7.e.c("VastProcessor", e20);
                eVar.d(xVar, j.f15698f);
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e21) {
                        h7.e.c("VastProcessor", e21);
                    }
                }
                return eVar;
            }
        } catch (MalformedURLException e22) {
            h7.e.c("VastProcessor", e22);
            eVar.d(xVar, j.f15698f);
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Exception e23) {
                    h7.e.c("VastProcessor", e23);
                }
            }
            return eVar;
        } catch (SSLException e24) {
            e = e24;
            h7.e.c("VastProcessor", e);
            eVar.d(xVar, j.f15698f);
            if (0 != 0) {
                inputStream.close();
            }
            return eVar;
        } catch (ConnectTimeoutException e25) {
            e = e25;
            h7.e.c("VastProcessor", e);
            eVar.d(xVar, j.f15698f);
            if (0 != 0) {
                inputStream.close();
            }
            return eVar;
        }
    }

    void f(List list) {
        this.f20664a.A(list, null);
    }

    void j(l7.a aVar) {
        if (this.f20667d.empty()) {
            return;
        }
        int iSearch = this.f20667d.search(aVar);
        for (int i10 = 0; i10 < iSearch; i10++) {
            this.f20667d.pop();
        }
    }

    public e l(String str) {
        h7.e.a("VastProcessor", "process", new Object[0]);
        e eVar = new e();
        try {
            t tVarB = s.b(str);
            if (tVarB != null && tVarB.u0()) {
                return b(null, tVarB, new f());
            }
            eVar.b(j.f15695c);
            return eVar;
        } catch (Exception unused) {
            eVar.b(j.f15694b);
            return eVar;
        }
    }

    d(g gVar, c cVar, int i10) {
        this.f20668e = 0;
        this.f20664a = gVar;
        this.f20665b = cVar;
        this.f20666c = i10;
        this.f20667d = new Stack();
    }
}

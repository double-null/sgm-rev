package h8;

import android.net.Uri;
import android.text.TextUtils;
import c8.b2;
import ca.k0;
import com.google.common.collect.u;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;
import s9.r;
import u7.n;
import u7.q;
import u7.v;
import u7.w;
import v8.p;
import x7.g0;

/* JADX INFO: compiled from: DefaultHlsExtractorFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f15719g = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r.a f15721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f15724f;

    public c() {
        this(0, true);
    }

    private static void f(int i10, List<Integer> list) {
        if (com.google.common.primitives.f.i(f15719g, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    private p h(int i10, q qVar, List<q> list, g0 g0Var) {
        if (i10 == 0) {
            return new ca.b();
        }
        if (i10 == 1) {
            return new ca.e();
        }
        if (i10 == 2) {
            return new ca.h();
        }
        if (i10 == 7) {
            return new o9.f(0, 0L);
        }
        if (i10 == 8) {
            return i(this.f15721c, this.f15722d, g0Var, qVar, list, this.f15723e);
        }
        if (i10 == 11) {
            return j(this.f15720b, this.f15724f, qVar, list, g0Var, this.f15721c, this.f15722d);
        }
        if (i10 != 13) {
            return null;
        }
        return new j(qVar.f26241d, g0Var, this.f15721c, this.f15722d);
    }

    private static p9.h i(r.a aVar, boolean z10, g0 g0Var, q qVar, List<q> list, int i10) {
        int i11 = m(qVar) ? 4 : 0;
        if (!z10) {
            aVar = r.a.f25343a;
            i11 |= 32;
        }
        r.a aVar2 = aVar;
        int iJ = i11 | p9.h.j(i10);
        if (list == null) {
            list = u.H();
        }
        return new p9.h(aVar2, iJ, g0Var, null, list, null);
    }

    private static k0 j(int i10, boolean z10, q qVar, List<q> list, g0 g0Var, r.a aVar, boolean z11) {
        int i11;
        int i12 = i10 | 16;
        if (list != null) {
            i12 |= 32;
        } else {
            list = z10 ? Collections.singletonList(new q.b().u0("application/cea-608").N()) : Collections.emptyList();
        }
        String str = qVar.f26248k;
        if (!TextUtils.isEmpty(str)) {
            if (!w.b(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!w.b(str, "video/avc")) {
                i12 |= 4;
            }
        }
        if (z11) {
            i11 = 0;
        } else {
            aVar = r.a.f25343a;
            i11 = 1;
        }
        return new k0(2, i11, aVar, g0Var, new ca.j(i12, list), 112800);
    }

    private static boolean m(q qVar) {
        v vVar = qVar.f26249l;
        if (vVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            v.a aVarD = vVar.d(i10);
            if (aVarD instanceof h) {
                return !((h) aVarD).f15729c.isEmpty();
            }
        }
        return false;
    }

    private static boolean o(p pVar, v8.q qVar) throws IOException {
        try {
            return pVar.e(qVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            qVar.d();
        }
    }

    @Override // h8.e
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a e(Uri uri, q qVar, List<q> list, g0 g0Var, Map<String, List<String>> map, v8.q qVar2, b2 b2Var) throws IOException {
        int iA = n.a(qVar.f26252o);
        int iB = n.b(map);
        int iC = n.c(uri);
        int[] iArr = f15719g;
        ArrayList arrayList = new ArrayList(iArr.length);
        f(iA, arrayList);
        f(iB, arrayList);
        f(iC, arrayList);
        for (int i10 : iArr) {
            f(i10, arrayList);
        }
        qVar2.d();
        p pVar = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            p pVar2 = (p) x7.a.e(h(iIntValue, qVar, list, g0Var));
            if (o(pVar2, qVar2)) {
                return new a(pVar2, qVar, g0Var, this.f15721c, this.f15722d);
            }
            if (pVar == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                pVar = pVar2;
            }
        }
        return new a((p) x7.a.e(pVar), qVar, g0Var, this.f15721c, this.f15722d);
    }

    @Override // h8.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c c(boolean z10) {
        this.f15722d = z10;
        return this;
    }

    @Override // h8.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b(int i10) {
        this.f15723e = i10;
        return this;
    }

    @Override // h8.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c a(r.a aVar) {
        this.f15721c = aVar;
        return this;
    }

    public c(int i10, boolean z10) {
        this.f15720b = i10;
        this.f15724f = z10;
        this.f15721c = new s9.h();
    }

    @Override // h8.e
    public q d(q qVar) {
        String str;
        if (!this.f15722d || !this.f15721c.a(qVar)) {
            return qVar;
        }
        q.b bVarW = qVar.b().u0(oqHAiWkeGzWld.afYJehVxvFzHu).W(this.f15721c.b(qVar));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qVar.f26252o);
        if (qVar.f26248k != null) {
            str = " " + qVar.f26248k;
        } else {
            str = "";
        }
        sb2.append(str);
        return bVarW.S(sb2.toString()).y0(Long.MAX_VALUE).N();
    }
}

package ba;

import android.text.TextUtils;
import io.bidmachine.media3.common.ParserException;
import java.util.ArrayList;
import s9.r;
import x7.a0;
import x7.l;

/* JADX INFO: compiled from: WebvttParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f4225a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f4226b = new b();

    private static int d(a0 a0Var) {
        int i10 = -1;
        int iF = 0;
        while (i10 == -1) {
            iF = a0Var.f();
            String strS = a0Var.s();
            if (strS == null) {
                i10 = 0;
            } else if ("STYLE".equals(strS)) {
                i10 = 2;
            } else {
                i10 = strS.startsWith("NOTE") ? 1 : 3;
            }
        }
        a0Var.W(iF);
        return i10;
    }

    private static void e(a0 a0Var) {
        while (!TextUtils.isEmpty(a0Var.s())) {
        }
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<s9.e> lVar) {
        d dVarO;
        this.f4225a.U(bArr, i11 + i10);
        this.f4225a.W(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f4225a);
            while (!TextUtils.isEmpty(this.f4225a.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iD = d(this.f4225a);
                if (iD == 0) {
                    s9.i.c(new j(arrayList2), bVar, lVar);
                    return;
                }
                if (iD == 1) {
                    e(this.f4225a);
                } else if (iD == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f4225a.s();
                    arrayList.addAll(this.f4226b.d(this.f4225a));
                } else if (iD == 3 && (dVarO = e.o(this.f4225a, arrayList)) != null) {
                    arrayList2.add(dVarO);
                }
            }
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // s9.r
    public int c() {
        return 1;
    }
}

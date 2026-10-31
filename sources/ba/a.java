package ba;

import java.util.ArrayList;
import java.util.Collections;
import s9.r;
import x7.a0;
import x7.l;
import x7.l0;

/* JADX INFO: compiled from: Mp4WebvttParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f4176a = new a0();

    private static w7.a d(a0 a0Var, int i10) {
        CharSequence charSequenceR = null;
        w7.a.b bVarP = null;
        while (i10 > 0) {
            x7.a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iQ = a0Var.q();
            int iQ2 = a0Var.q();
            int i11 = iQ - 8;
            String strI = l0.I(a0Var.e(), a0Var.f(), i11);
            a0Var.X(i11);
            i10 = (i10 - 8) - i11;
            if (iQ2 == 1937011815) {
                bVarP = e.p(strI);
            } else if (iQ2 == 1885436268) {
                charSequenceR = e.r(null, strI.trim(), Collections.emptyList());
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // s9.r
    public void b(byte[] bArr, int i10, int i11, r.b bVar, l<s9.e> lVar) {
        this.f4176a.U(bArr, i11 + i10);
        this.f4176a.W(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f4176a.a() > 0) {
            x7.a.b(this.f4176a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iQ = this.f4176a.q();
            if (this.f4176a.q() == 1987343459) {
                arrayList.add(d(this.f4176a, iQ - 8));
            } else {
                this.f4176a.X(iQ - 8);
            }
        }
        lVar.accept(new s9.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // s9.r
    public int c() {
        return 2;
    }
}

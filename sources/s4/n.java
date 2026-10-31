package s4;

/* JADX INFO: compiled from: X12Encoder.java */
/* JADX INFO: loaded from: classes4.dex */
final class n extends c {
    n() {
    }

    @Override // s4.c, s4.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (hVar.i()) {
            char c10 = hVar.c();
            hVar.f25215f++;
            c(c10, sb2);
            if (sb2.length() % 3 == 0) {
                c.g(hVar, sb2);
                if (j.n(hVar.d(), hVar.f25215f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb2);
    }

    @Override // s4.c
    int c(char c10, StringBuilder sb2) {
        if (c10 == '\r') {
            sb2.append((char) 0);
        } else if (c10 == ' ') {
            sb2.append((char) 3);
        } else if (c10 == '*') {
            sb2.append((char) 1);
        } else if (c10 == '>') {
            sb2.append((char) 2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
        } else if (c10 < 'A' || c10 > 'Z') {
            j.e(c10);
        } else {
            sb2.append((char) ((c10 - 'A') + 14));
        }
        return 1;
    }

    @Override // s4.c
    public int e() {
        return 3;
    }

    @Override // s4.c
    void f(h hVar, StringBuilder sb2) {
        hVar.p();
        int iA = hVar.g().a() - hVar.a();
        hVar.f25215f -= sb2.length();
        if (hVar.f() > 1 || iA > 1 || hVar.f() != iA) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}

package s4;

/* JADX INFO: compiled from: EdifactEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
final class f implements g {
    f() {
    }

    private static void b(char c10, StringBuilder sb2) {
        if (c10 >= ' ' && c10 <= '?') {
            sb2.append(c10);
        } else if (c10 < '@' || c10 > '^') {
            j.e(c10);
        } else {
            sb2.append((char) (c10 - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i10) {
        int length = charSequence.length() - i10;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(i10) << 18) + ((length >= 2 ? charSequence.charAt(i10 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i10 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i10 + 3) : (char) 0);
        char c10 = (char) ((iCharAt >> 16) & 255);
        char c11 = (char) ((iCharAt >> 8) & 255);
        char c12 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c10);
        if (length >= 2) {
            sb2.append(c11);
        }
        if (length >= 3) {
            sb2.append(c12);
        }
        return sb2.toString();
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                hVar.o(0);
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                hVar.p();
                int iA = hVar.g().a() - hVar.a();
                int iF = hVar.f();
                if (iF > iA) {
                    hVar.q(hVar.a() + 1);
                    iA = hVar.g().a() - hVar.a();
                }
                if (iF <= iA && iA <= 2) {
                    hVar.o(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String strC = c(charSequence, 0);
            if (!(!hVar.i()) || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                hVar.q(hVar.a() + i10);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.q(hVar.a() + strC.length());
                    z10 = false;
                }
            }
            if (z10) {
                hVar.k();
                hVar.f25215f -= i10;
            } else {
                hVar.s(strC);
            }
            hVar.o(0);
        } catch (Throwable th) {
            hVar.o(0);
            throw th;
        }
    }

    @Override // s4.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (hVar.i()) {
            b(hVar.c(), sb2);
            hVar.f25215f++;
            if (sb2.length() >= 4) {
                hVar.s(c(sb2, 0));
                sb2.delete(0, 4);
                if (j.n(hVar.d(), hVar.f25215f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        e(hVar, sb2);
    }

    public int d() {
        return 4;
    }
}

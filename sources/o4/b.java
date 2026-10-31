package o4;

import com.facebook.internal.logging.dumpsys.Tj.ljglrLUdGZhMhQ;

/* JADX INFO: compiled from: BinaryShiftToken.java */
/* JADX INFO: loaded from: classes4.dex */
final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f23019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f23020d;

    b(g gVar, int i10, int i11) {
        super(gVar);
        this.f23019c = (short) i10;
        this.f23020d = (short) i11;
    }

    @Override // o4.g
    public void c(p4.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f23020d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                aVar.d(31, 5);
                short s11 = this.f23020d;
                if (s11 > 62) {
                    aVar.d(s11 - 31, 16);
                } else if (i10 == 0) {
                    aVar.d(Math.min((int) s11, 31), 5);
                } else {
                    aVar.d(s11 - 31, 5);
                }
            }
            aVar.d(bArr[this.f23019c + i10], 8);
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(ljglrLUdGZhMhQ.zKjGiZq);
        sb2.append((int) this.f23019c);
        sb2.append("::");
        sb2.append((this.f23019c + this.f23020d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}

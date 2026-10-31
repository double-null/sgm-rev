package p9;

import io.bidmachine.media3.common.ParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import v8.i0;
import x7.a0;

/* JADX INFO: compiled from: SefReader.java */
/* JADX INFO: loaded from: classes4.dex */
final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.common.base.t f23659d = com.google.common.base.t.f(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.common.base.t f23660e = com.google.common.base.t.f('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f23661a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23662b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23663c;

    /* JADX INFO: compiled from: SefReader.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f23665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23666c;

        public a(int i10, long j10, int i11) {
            this.f23664a = i10;
            this.f23665b = j10;
            this.f23666c = i11;
        }
    }

    private void a(v8.q qVar, i0 i0Var) throws IOException {
        a0 a0Var = new a0(8);
        qVar.readFully(a0Var.e(), 0, 8);
        this.f23663c = a0Var.u() + 8;
        if (a0Var.q() != 1397048916) {
            i0Var.f27344a = 0L;
        } else {
            i0Var.f27344a = qVar.getPosition() - ((long) (this.f23663c - 12));
            this.f23662b = 2;
        }
    }

    private static int b(String str) throws ParserException {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.b("Invalid SEF name", null);
        }
    }

    private void d(v8.q qVar, i0 i0Var) throws IOException {
        long length = qVar.getLength();
        int i10 = (this.f23663c - 12) - 8;
        a0 a0Var = new a0(i10);
        qVar.readFully(a0Var.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            a0Var.X(2);
            short sW = a0Var.w();
            if (sW == 2192 || sW == 2816 || sW == 2817 || sW == 2819 || sW == 2820) {
                this.f23661a.add(new a(sW, (length - ((long) this.f23663c)) - ((long) a0Var.u()), a0Var.u()));
            } else {
                a0Var.X(8);
            }
        }
        if (this.f23661a.isEmpty()) {
            i0Var.f27344a = 0L;
        } else {
            this.f23662b = 3;
            i0Var.f27344a = this.f23661a.get(0).f23665b;
        }
    }

    private void e(v8.q qVar, List<u7.v.a> list) throws IOException {
        long position = qVar.getPosition();
        int length = (int) ((qVar.getLength() - qVar.getPosition()) - ((long) this.f23663c));
        a0 a0Var = new a0(length);
        qVar.readFully(a0Var.e(), 0, length);
        for (int i10 = 0; i10 < this.f23661a.size(); i10++) {
            a aVar = this.f23661a.get(i10);
            a0Var.W((int) (aVar.f23665b - position));
            a0Var.X(4);
            int iU = a0Var.u();
            int iB = b(a0Var.E(iU));
            int i11 = aVar.f23666c - (iU + 8);
            if (iB == 2192) {
                list.add(f(a0Var, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static k9.c f(a0 a0Var, int i10) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listJ = f23660e.j(a0Var.E(i10));
        for (int i11 = 0; i11 < listJ.size(); i11++) {
            List<String> listJ2 = f23659d.j(listJ.get(i11));
            if (listJ2.size() != 3) {
                throw ParserException.b(null, null);
            }
            try {
                arrayList.add(new k9.c.a(Long.parseLong(listJ2.get(0)), Long.parseLong(listJ2.get(1)), 1 << (Integer.parseInt(listJ2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw ParserException.b(null, e10);
            }
        }
        return new k9.c(arrayList);
    }

    public int c(v8.q qVar, i0 i0Var, List<u7.v.a> list) throws IOException {
        int i10 = this.f23662b;
        long j10 = 0;
        if (i10 == 0) {
            long length = qVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i0Var.f27344a = j10;
            this.f23662b = 1;
        } else if (i10 == 1) {
            a(qVar, i0Var);
        } else if (i10 == 2) {
            d(qVar, i0Var);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(qVar, list);
            i0Var.f27344a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f23661a.clear();
        this.f23662b = 0;
    }
}

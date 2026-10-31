package y7;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import x7.z;

/* JADX INFO: compiled from: ObuParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: compiled from: ObuParser.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28774a;

        private b(e eVar, d dVar) throws c {
            int i10 = dVar.f28775a;
            x7.a.a(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f28776b.remaining())];
            dVar.f28776b.asReadOnlyBuffer().get(bArr);
            z zVar = new z(bArr);
            g.f(eVar.f28777a);
            if (zVar.g()) {
                this.f28774a = false;
                return;
            }
            int iH = zVar.h(2);
            boolean zG = zVar.g();
            g.f(eVar.f28778b);
            if (!zG) {
                this.f28774a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : zVar.g();
            zVar.q();
            g.f(!eVar.f28780d);
            if (zVar.g()) {
                g.f(!eVar.f28781e);
                zVar.q();
            }
            g.f(eVar.f28779c);
            if (iH != 3) {
                zVar.q();
            }
            zVar.r(eVar.f28782f);
            if (iH != 2 && iH != 0 && !zG2) {
                zVar.r(3);
            }
            this.f28774a = ((iH == 3 || iH == 0) ? 255 : zVar.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f28774a;
        }
    }

    /* JADX INFO: compiled from: ObuParser.java */
    private static class c extends Exception {
        private c() {
        }
    }

    /* JADX INFO: compiled from: ObuParser.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f28776b;

        private d(int i10, ByteBuffer byteBuffer) {
            this.f28775a = i10;
            this.f28776b = byteBuffer;
        }
    }

    /* JADX INFO: compiled from: ObuParser.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f28777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f28778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f28779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f28780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f28781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f28782f;

        private e(d dVar) throws c {
            x7.a.a(dVar.f28775a == 1);
            byte[] bArr = new byte[dVar.f28776b.remaining()];
            dVar.f28776b.asReadOnlyBuffer().get(bArr);
            z zVar = new z(bArr);
            zVar.r(4);
            boolean zG = zVar.g();
            this.f28777a = zG;
            g.f(zG);
            if (zVar.g()) {
                b(zVar);
                boolean zG2 = zVar.g();
                this.f28778b = zG2;
                if (zG2) {
                    zVar.r(47);
                }
            } else {
                this.f28778b = false;
            }
            boolean zG3 = zVar.g();
            int iH = zVar.h(5);
            for (int i10 = 0; i10 <= iH; i10++) {
                zVar.r(12);
                if (zVar.h(5) > 7) {
                    zVar.q();
                }
                g.f(this.f28778b);
                if (zG3 && zVar.g()) {
                    zVar.r(4);
                }
            }
            int iH2 = zVar.h(4);
            int iH3 = zVar.h(4);
            zVar.r(iH2 + 1);
            zVar.r(iH3 + 1);
            boolean zG4 = zVar.g();
            this.f28779c = zG4;
            g.f(zG4);
            zVar.r(3);
            zVar.r(4);
            boolean zG5 = zVar.g();
            if (zG5) {
                zVar.r(2);
            }
            if (zVar.g()) {
                this.f28780d = true;
            } else {
                this.f28780d = zVar.g();
            }
            if (!this.f28780d || zVar.g()) {
                this.f28781e = true;
            } else {
                this.f28781e = zVar.g();
            }
            if (zG5) {
                this.f28782f = zVar.h(3) + 1;
            } else {
                this.f28782f = 0;
            }
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(z zVar) {
            zVar.r(64);
            if (zVar.g()) {
                g.d(zVar);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & 127) << (i11 * 7);
            if ((b10 & 128) == 0) {
                break;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(z zVar) {
        int i10 = 0;
        while (!zVar.g()) {
            i10++;
        }
        if (i10 < 32) {
            zVar.r(i10);
        }
    }

    public static List<d> e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b10 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i10, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c();
        }
    }
}

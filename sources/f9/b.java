package f9;

import e9.c;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import u7.v;
import x7.z;

/* JADX INFO: compiled from: AppInfoTableDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {
    private static v c(z zVar) {
        zVar.r(12);
        int iD = (zVar.d() + zVar.h(12)) - 4;
        zVar.r(44);
        zVar.s(zVar.h(12));
        zVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (zVar.d() >= iD) {
                break;
            }
            zVar.r(48);
            int iH = zVar.h(8);
            zVar.r(4);
            int iD2 = zVar.d() + zVar.h(12);
            String strL2 = null;
            while (zVar.d() < iD2) {
                int iH2 = zVar.h(8);
                int iH3 = zVar.h(8);
                int iD3 = zVar.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = zVar.h(16);
                    zVar.r(8);
                    if (iH4 == 3) {
                        while (zVar.d() < iD3) {
                            strL = zVar.l(zVar.h(8), StandardCharsets.US_ASCII);
                            int iH5 = zVar.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                zVar.s(zVar.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = zVar.l(iH3, StandardCharsets.US_ASCII);
                }
                zVar.p(iD3 * 8);
            }
            zVar.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v(arrayList);
    }

    @Override // e9.c
    protected v b(e9.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new z(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}

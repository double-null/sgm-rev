package io.bidmachine.media3.exoplayer.video;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: Av1SampleDependencyParser.java */
/* JADX INFO: loaded from: classes4.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y7.g.e f19836a;

    a() {
    }

    private boolean a(y7.g.d dVar, boolean z10) {
        y7.g.e eVar;
        int i10 = dVar.f28775a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 == 3 && !z10) {
            return false;
        }
        if ((i10 != 6 && i10 != 3) || (eVar = this.f19836a) == null) {
            return false;
        }
        y7.g.b bVarB = y7.g.b.b(eVar, dVar);
        return (bVarB == null || bVarB.a()) ? false : true;
    }

    private void e(List<y7.g.d> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f28775a == 1) {
                this.f19836a = y7.g.e.a(list.get(i10));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(y7.g.e(byteBuffer));
    }

    public void c() {
        this.f19836a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List<y7.g.d> listE = y7.g.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a(listE.get(size), z10)) {
            if (listE.get(size).f28775a == 6 || listE.get(size).f28775a == 3) {
                i10++;
            }
            size--;
        }
        if (i10 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? listE.get(size).f28776b.limit() : byteBuffer.position();
    }
}

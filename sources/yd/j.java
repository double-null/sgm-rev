package yd;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface j<T> extends xd.c<T> {

    /* JADX INFO: compiled from: ChannelFlow.kt */
    public static final class a {
        public static /* synthetic */ xd.c a(j jVar, zc.j jVar2, int i10, wd.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                jVar2 = zc.k.f29181a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = wd.a.SUSPEND;
            }
            return jVar.c(jVar2, i10, aVar);
        }
    }

    xd.c<T> c(zc.j jVar, int i10, wd.a aVar);
}

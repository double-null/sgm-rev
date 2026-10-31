package n8;

import io.bidmachine.media3.exoplayer.source.g0;
import java.util.List;

/* JADX INFO: compiled from: DefaultCompositeSequenceableLoaderFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements e {
    @Override // n8.e
    public g0 a(List<? extends g0> list, List<List<Integer>> list2) {
        return new d(list, list2);
    }

    @Override // n8.e
    public g0 empty() {
        return new d(com.google.common.collect.u.H(), com.google.common.collect.u.H());
    }
}

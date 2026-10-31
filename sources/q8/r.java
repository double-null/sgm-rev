package q8;

import java.util.List;
import u7.e0;

/* JADX INFO: compiled from: FixedTrackSelection.java */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f24599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f24600j;

    public r(e0 e0Var, int i10, int i11) {
        this(e0Var, i10, i11, 0, null);
    }

    @Override // q8.q
    public int b() {
        return 0;
    }

    @Override // q8.q
    public Object i() {
        return this.f24600j;
    }

    @Override // q8.q
    public int t() {
        return this.f24599i;
    }

    public r(e0 e0Var, int i10, int i11, int i12, Object obj) {
        super(e0Var, new int[]{i10}, i11);
        this.f24599i = i12;
        this.f24600j = obj;
    }

    @Override // q8.q
    public void l(long j10, long j11, long j12, List<? extends o8.m> list, o8.n[] nVarArr) {
    }
}

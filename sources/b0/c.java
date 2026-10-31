package b0;

import java.util.ArrayList;
import kotlin.collections.t;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f3855a = new ArrayList<>();

    public final void a() {
        for (int iM = t.m(this.f3855a); -1 < iM; iM--) {
            this.f3855a.get(iM).a();
        }
    }
}

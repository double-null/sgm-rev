package qe;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f24773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f24774d;

    public a(String name, boolean z10) {
        t.f(name, "name");
        this.f24771a = name;
        this.f24772b = z10;
        this.f24774d = -1L;
    }

    public final boolean a() {
        return this.f24772b;
    }

    public final String b() {
        return this.f24771a;
    }

    public final long c() {
        return this.f24774d;
    }

    public final d d() {
        return this.f24773c;
    }

    public final void e(d queue) {
        t.f(queue, "queue");
        d dVar = this.f24773c;
        if (dVar == queue) {
            return;
        }
        if (!(dVar == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f24773c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f24774d = j10;
    }

    public String toString() {
        return this.f24771a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, k kVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}

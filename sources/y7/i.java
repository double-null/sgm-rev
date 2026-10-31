package y7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import x7.a0;
import x7.l0;

/* JADX INFO: compiled from: ReorderingSeiMessageQueue.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f28787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a0> f28788b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f28789c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f28790d = new PriorityQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28791e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f28792f;

    /* JADX INFO: compiled from: ReorderingSeiMessageQueue.java */
    private static final class a implements Comparable<a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f28794b = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a0> f28793a = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f28794b, aVar.f28794b);
        }

        public void b(long j10, a0 a0Var) {
            x7.a.a(j10 != -9223372036854775807L);
            x7.a.g(this.f28793a.isEmpty());
            this.f28794b = j10;
            this.f28793a.add(a0Var);
        }
    }

    /* JADX INFO: compiled from: ReorderingSeiMessageQueue.java */
    public interface b {
        void a(long j10, a0 a0Var);
    }

    public i(b bVar) {
        this.f28787a = bVar;
    }

    private a0 c(a0 a0Var) {
        a0 a0Var2 = this.f28788b.isEmpty() ? new a0() : this.f28788b.pop();
        a0Var2.S(a0Var.a());
        System.arraycopy(a0Var.e(), a0Var.f(), a0Var2.e(), 0, a0Var2.a());
        return a0Var2;
    }

    private void e(int i10) {
        while (this.f28790d.size() > i10) {
            a aVar = (a) l0.i(this.f28790d.poll());
            for (int i11 = 0; i11 < aVar.f28793a.size(); i11++) {
                this.f28787a.a(aVar.f28794b, aVar.f28793a.get(i11));
                this.f28788b.push(aVar.f28793a.get(i11));
            }
            aVar.f28793a.clear();
            a aVar2 = this.f28792f;
            if (aVar2 != null && aVar2.f28794b == aVar.f28794b) {
                this.f28792f = null;
            }
            this.f28789c.push(aVar);
        }
    }

    public void a(long j10, a0 a0Var) {
        int i10 = this.f28791e;
        if (i10 == 0 || (i10 != -1 && this.f28790d.size() >= this.f28791e && j10 < ((a) l0.i(this.f28790d.peek())).f28794b)) {
            this.f28787a.a(j10, a0Var);
            return;
        }
        a0 a0VarC = c(a0Var);
        a aVar = this.f28792f;
        if (aVar != null && j10 == aVar.f28794b) {
            aVar.f28793a.add(a0VarC);
            return;
        }
        a aVar2 = this.f28789c.isEmpty() ? new a() : this.f28789c.pop();
        aVar2.b(j10, a0VarC);
        this.f28790d.add(aVar2);
        this.f28792f = aVar2;
        int i11 = this.f28791e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f28790d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.f28791e;
    }

    public void g(int i10) {
        x7.a.g(i10 >= 0);
        this.f28791e = i10;
        e(i10);
    }
}

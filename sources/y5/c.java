package y5;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f28667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f28668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f28669c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f28670d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f28667a = linkedBlockingQueue;
        this.f28668b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b bVarPoll = this.f28669c.poll();
        this.f28670d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.b(this.f28668b);
        }
    }

    @Override // y5.b.a
    public void a(b bVar) {
        this.f28670d = null;
        b();
    }

    public void c(b bVar) {
        bVar.c(this);
        this.f28669c.add(bVar);
        if (this.f28670d == null) {
            b();
        }
    }
}

package k5;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f21228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f21229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f21230c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f21231d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21228a = linkedBlockingQueue;
        this.f21229b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        b bVarPoll = this.f21230c.poll();
        this.f21231d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.b(this.f21229b);
        }
    }

    @Override // k5.b.a
    public void a(b bVar) {
        this.f21231d = null;
        b();
    }

    public void c(b bVar) {
        bVar.c(this);
        this.f21230c.add(bVar);
        if (this.f21231d == null) {
            b();
        }
    }
}

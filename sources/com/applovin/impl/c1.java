package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f6217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f6218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f6219c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f6220d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f6222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f6223c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f6221a;
            String str2 = ((c) obj).f6221a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            return str2 == null;
        }

        public int hashCode() {
            String str = this.f6221a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f6221a + "', countdownStepMillis=" + this.f6223c + '}';
        }

        private c(String str, long j10, b bVar) {
            this.f6221a = str;
            this.f6223c = j10;
            this.f6222b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.f6222b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f6223c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f6221a;
        }
    }

    public c1(Handler handler, com.applovin.impl.sdk.l lVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f6218b = handler;
        this.f6217a = lVar.Q();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.f6219c);
        if (com.applovin.impl.sdk.p.a()) {
            this.f6217a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.f6220d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f6217a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    public void c() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6217a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f6220d.incrementAndGet();
        this.f6218b.removeCallbacksAndMessages(null);
    }

    public void a() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f6217a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f6219c.clear();
    }

    public void a(String str, long j10, b bVar) {
        if (j10 > 0) {
            if (this.f6218b != null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f6217a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.f6219c.add(new c(str, j10, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.f6220d.get() == i10) {
                try {
                    bVarA.a();
                    a(cVar, i10);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f6217a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f6217a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f6217a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    private void a(final c cVar, final int i10) {
        this.f6218b.postDelayed(new Runnable() { // from class: com.applovin.impl.b9
            @Override // java.lang.Runnable
            public final void run() {
                this.f6192a.b(cVar, i10);
            }
        }, cVar.b());
    }
}

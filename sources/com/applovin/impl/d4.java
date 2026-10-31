package com.applovin.impl;

import android.os.Process;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PriorityBlockingQueue f6318a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f6319b;

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BlockingQueue f6320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.l f6321b;

        private void a() {
            b((c) this.f6320a.take());
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0123 */
        /* JADX WARN: Code duplicated, block: B:100:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x00ec A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #8 {all -> 0x018d, blocks: (B:57:0x00d4, B:59:0x00ec, B:83:0x0129), top: B:105:0x00d4 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0158  */
        /* JADX WARN: Code duplicated, block: B:96:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(final com.applovin.impl.d4.c r20) {
            /*
                Method dump skipped, instruction units count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d4.b.b(com.applovin.impl.d4$c):void");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private b(BlockingQueue blockingQueue, int i10, com.applovin.impl.sdk.l lVar) {
            super("AppLovinSdk:network");
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (lVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f6320a = blockingQueue;
            this.f6321b = lVar;
            setPriority(((Integer) lVar.a(z4.S)).intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, d dVar) {
            cVar.f6328f.accept(dVar);
        }

        private HttpURLConnection a(c cVar) throws ProtocolException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f6323a).openConnection();
            httpURLConnection.setRequestMethod(cVar.f6324b);
            httpURLConnection.setConnectTimeout(cVar.f6327e);
            httpURLConnection.setReadTimeout(cVar.f6327e);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!cVar.f6325c.isEmpty()) {
                for (Map.Entry entry : cVar.f6325c.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }
    }

    public static class c implements Comparable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final AtomicInteger f6322i = new AtomicInteger();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f6323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f6325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f6326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f6327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final w.b f6328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Executor f6329g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f6330h;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f6331a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f6332b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Map f6333c = new HashMap();

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private byte[] f6334d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f6335e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private w.b f6336f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private Executor f6337g;

            public a a(String str) {
                this.f6331a = str;
                return this;
            }

            public a b(String str) {
                this.f6332b = str;
                return this;
            }

            public a a(Map map) {
                if (map == null) {
                    map = new HashMap();
                }
                this.f6333c = map;
                return this;
            }

            public a a(String str, String str2) {
                this.f6333c.put(str, str2);
                return this;
            }

            public a a(byte[] bArr) {
                this.f6334d = bArr;
                return this;
            }

            public a a(int i10) {
                this.f6335e = i10;
                return this;
            }

            public a a(w.b bVar) {
                this.f6336f = bVar;
                return this;
            }

            public a a(Executor executor) {
                this.f6337g = executor;
                return this;
            }

            public c a() {
                return new c(this);
            }
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.f6330h - cVar.f6330h;
        }

        private c(a aVar) {
            this.f6323a = aVar.f6331a;
            this.f6324b = aVar.f6332b;
            this.f6325c = aVar.f6333c != null ? aVar.f6333c : Collections.emptyMap();
            this.f6326d = aVar.f6334d;
            this.f6327e = aVar.f6335e;
            this.f6328f = aVar.f6336f;
            this.f6329g = aVar.f6337g;
            this.f6330h = f6322i.incrementAndGet();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f6339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f6340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f6341d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Throwable f6342e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f6343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f6344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f6345c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f6346d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Throwable f6347e;

            public a a(int i10) {
                this.f6343a = i10;
                return this;
            }

            public a b(byte[] bArr) {
                this.f6345c = bArr;
                return this;
            }

            public a a(byte[] bArr) {
                this.f6344b = bArr;
                return this;
            }

            public a a(Throwable th) {
                this.f6347e = th;
                return this;
            }

            public a a(long j10) {
                this.f6346d = j10;
                return this;
            }

            public d a() {
                return new d(this);
            }
        }

        public static a a() {
            return new a();
        }

        public int b() {
            return this.f6338a;
        }

        public int c() throws Throwable {
            Throwable th = this.f6342e;
            if (th == null) {
                return this.f6338a;
            }
            throw th;
        }

        public byte[] d() throws Throwable {
            Throwable th = this.f6342e;
            if (th == null) {
                return this.f6339b;
            }
            throw th;
        }

        public long e() {
            return this.f6341d;
        }

        public byte[] f() {
            return this.f6340c;
        }

        private d(a aVar) {
            this.f6338a = aVar.f6343a;
            this.f6339b = aVar.f6344b;
            this.f6340c = aVar.f6345c;
            this.f6341d = aVar.f6346d;
            this.f6342e = aVar.f6347e;
        }
    }

    public d4(com.applovin.impl.sdk.l lVar) {
        this.f6319b = lVar;
    }

    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f6319b.a(z4.R)).intValue(); i10++) {
            new b(this.f6318a, i10, this.f6319b).start();
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.f6318a.add(cVar);
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }
}

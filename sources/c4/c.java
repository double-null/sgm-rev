package c4;

import android.util.Log;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.g0;

/* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f4718a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<d.a, a> f4719b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f4720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f4721b;

        public a(CountDownLatch latch, d dVar) {
            t.f(latch, "latch");
            this.f4720a = latch;
            this.f4721b = dVar;
        }

        public final CountDownLatch a() {
            return this.f4720a;
        }

        public final d b() {
            return this.f4721b;
        }

        public final void c(d dVar) {
            this.f4721b = dVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.a(this.f4720a, aVar.f4720a) && t.a(this.f4721b, aVar.f4721b);
        }

        public int hashCode() {
            int iHashCode = this.f4720a.hashCode() * 31;
            d dVar = this.f4721b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return CwEo.qHeYUJrBSI + this.f4720a + ", subscriber=" + this.f4721b + ')';
        }

        public /* synthetic */ a(CountDownLatch countDownLatch, d dVar, int i10, k kVar) {
            this(countDownLatch, (i10 & 2) != 0 ? null : dVar);
        }
    }

    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {76}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f4722h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f4723i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f4724j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f4725k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f4726l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f4727m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f4729o;

        b(zc.f<? super b> fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4727m = obj;
            this.f4729o |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d.a subscriberName) {
        t.f(subscriberName, "subscriberName");
        Map<d.a, a> dependencies = f4719b;
        if (dependencies.containsKey(subscriberName)) {
            Log.d("FirebaseSessions", "Dependency " + subscriberName + " already added.");
            return;
        }
        t.e(dependencies, "dependencies");
        dependencies.put(subscriberName, new a(new CountDownLatch(1), null, 2, 0 == true ? 1 : 0));
        Log.d("FirebaseSessions", "Dependency to " + subscriberName + " added.");
    }

    private final a c(d.a aVar) {
        Map<d.a, a> dependencies = f4719b;
        t.e(dependencies, "dependencies");
        a aVar2 = dependencies.get(aVar);
        if (aVar2 != null) {
            t.e(aVar2, "getOrElse(...)");
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 e(a aVar) throws InterruptedException {
        aVar.a().await();
        return g0.f27756a;
    }

    public static final void g(d subscriber) {
        t.f(subscriber, "subscriber");
        d.a aVarB = subscriber.b();
        a aVarC = f4718a.c(aVarB);
        if (aVarC.b() != null) {
            Log.d("FirebaseSessions", "Subscriber " + aVarB + " already registered.");
            return;
        }
        aVarC.c(subscriber);
        Log.d("FirebaseSessions", "Subscriber " + aVarB + " registered.");
        aVarC.a().countDown();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object d(zc.f<? super java.util.Map<c4.d.a, ? extends c4.d>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof c4.c.b
            if (r0 == 0) goto L13
            r0 = r9
            c4.c$b r0 = (c4.c.b) r0
            int r1 = r0.f4729o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4729o = r1
            goto L18
        L13:
            c4.c$b r0 = new c4.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f4727m
            java.lang.Object r1 = ad.b.f()
            int r2 = r0.f4729o
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r2 = r0.f4726l
            java.lang.Object r4 = r0.f4725k
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f4724j
            c4.d$a r5 = (c4.d.a) r5
            java.lang.Object r6 = r0.f4723i
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.f4722h
            java.util.Map r7 = (java.util.Map) r7
            wc.s.b(r9)
            goto L9a
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L43:
            wc.s.b(r9)
            java.util.Map<c4.d$a, c4.c$a> r9 = c4.c.f4719b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.t.e(r9, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r9.size()
            int r4 = kotlin.collections.l0.e(r4)
            r2.<init>(r4)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r6 = r9
            r4 = r2
        L64:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto La5
            java.lang.Object r9 = r6.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r2 = r9.getKey()
            java.lang.Object r5 = r9.getKey()
            c4.d$a r5 = (c4.d.a) r5
            java.lang.Object r9 = r9.getValue()
            c4.c$a r9 = (c4.c.a) r9
            c4.b r7 = new c4.b
            r7.<init>()
            r0.f4722h = r4
            r0.f4723i = r6
            r0.f4724j = r5
            r0.f4725k = r4
            r0.f4726l = r2
            r0.f4729o = r3
            r9 = 0
            java.lang.Object r9 = ud.y1.c(r9, r7, r0, r3, r9)
            if (r9 != r1) goto L99
            return r1
        L99:
            r7 = r4
        L9a:
            c4.c r9 = c4.c.f4718a
            c4.d r9 = r9.f(r5)
            r4.put(r2, r9)
            r4 = r7
            goto L64
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.c.d(zc.f):java.lang.Object");
    }

    public final d f(d.a subscriberName) {
        t.f(subscriberName, "subscriberName");
        d dVarB = c(subscriberName).b();
        if (dVarB != null) {
            return dVarB;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}

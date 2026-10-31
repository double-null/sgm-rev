package io.bidmachine;

/* JADX INFO: compiled from: CommonBackgroundTaskManager.java */
/* JADX INFO: loaded from: classes4.dex */
class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile sc.c f20374a;

    o2() {
    }

    public static sc.c a() {
        sc.c aVar = f20374a;
        if (aVar == null) {
            synchronized (o2.class) {
                aVar = f20374a;
                if (aVar == null) {
                    aVar = new sc.a();
                    f20374a = aVar;
                }
            }
        }
        return aVar;
    }
}

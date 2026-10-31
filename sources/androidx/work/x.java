package androidx.work;

import android.content.Context;

/* JADX INFO: compiled from: WorkerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3852a = l.f("WorkerFactory");

    /* JADX INFO: compiled from: WorkerFactory.java */
    class a extends x {
        a() {
        }

        @Override // androidx.work.x
        public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static x c() {
        return new a();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorkerA = a(context, str, workerParameters);
        if (listenableWorkerA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                l.c().b(f3852a, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerA = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    l.c().b(f3852a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerA == null || !listenableWorkerA.isUsed()) {
            return listenableWorkerA;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}

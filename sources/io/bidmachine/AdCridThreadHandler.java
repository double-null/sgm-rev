package io.bidmachine;

/* JADX INFO: compiled from: AdCridThreadHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdCridThreadHandler {
    private final String name;
    private final Runnable runnable;
    private final oc.p tag;
    private Thread thread;

    public AdCridThreadHandler(String crid) {
        kotlin.jvm.internal.t.f(crid, "crid");
        this.tag = new oc.p("AdCridThreadManager");
        String str = "io.bidmachine.crid." + crid;
        this.name = str;
        Runnable runnable = new Runnable() { // from class: io.bidmachine.a
            @Override // java.lang.Runnable
            public final void run() {
                AdCridThreadHandler.runnable$lambda$0(this.f16491a);
            }
        };
        this.runnable = runnable;
        Thread thread = new Thread(runnable, str);
        thread.start();
        this.thread = thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$0(AdCridThreadHandler this$0) {
        kotlin.jvm.internal.t.f(this$0, "this$0");
        Thread threadCurrentThread = Thread.currentThread();
        try {
            io.bidmachine.core.a.a(this$0.tag, this$0.name + " started");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException unused) {
            threadCurrentThread.interrupt();
        }
    }

    public final void destroy() {
        Thread thread = this.thread;
        if (thread != null) {
            thread.interrupt();
        }
        this.thread = null;
        io.bidmachine.core.a.a(this.tag, this.name + " stopped");
    }
}

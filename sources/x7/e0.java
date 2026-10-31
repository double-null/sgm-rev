package x7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
final class e0 implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<b> f28106b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f28107a;

    /* JADX INFO: compiled from: SystemHandlerWrapper.java */
    private static final class b implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f28108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e0 f28109b;

        private b() {
        }

        private void b() {
            this.f28108a = null;
            this.f28109b = null;
            e0.o(this);
        }

        @Override // x7.n.a
        public void a() {
            ((Message) x7.a.e(this.f28108a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) x7.a.e(this.f28108a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, e0 e0Var) {
            this.f28108a = message;
            this.f28109b = e0Var;
            return this;
        }
    }

    public e0(Handler handler) {
        this.f28107a = handler;
    }

    private static b n() {
        b bVar;
        List<b> list = f28106b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(b bVar) {
        List<b> list = f28106b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // x7.n
    public n.a a(int i10) {
        return n().d(this.f28107a.obtainMessage(i10), this);
    }

    @Override // x7.n
    public boolean b(n.a aVar) {
        return ((b) aVar).c(this.f28107a);
    }

    @Override // x7.n
    public boolean c(int i10) {
        x7.a.a(i10 != 0);
        return this.f28107a.hasMessages(i10);
    }

    @Override // x7.n
    public n.a d(int i10, int i11, int i12, Object obj) {
        return n().d(this.f28107a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // x7.n
    public n.a e(int i10, Object obj) {
        return n().d(this.f28107a.obtainMessage(i10, obj), this);
    }

    @Override // x7.n
    public void f(Object obj) {
        this.f28107a.removeCallbacksAndMessages(obj);
    }

    @Override // x7.n
    public Looper g() {
        return this.f28107a.getLooper();
    }

    @Override // x7.n
    public n.a h(int i10, int i11, int i12) {
        return n().d(this.f28107a.obtainMessage(i10, i11, i12), this);
    }

    @Override // x7.n
    public boolean i(Runnable runnable) {
        return this.f28107a.post(runnable);
    }

    @Override // x7.n
    public boolean j(int i10) {
        return this.f28107a.sendEmptyMessage(i10);
    }

    @Override // x7.n
    public boolean k(int i10, long j10) {
        return this.f28107a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // x7.n
    public void l(int i10) {
        x7.a.a(i10 != 0);
        this.f28107a.removeMessages(i10);
    }
}

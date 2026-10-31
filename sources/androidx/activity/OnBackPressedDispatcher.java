package androidx.activity;

import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f506b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements h, androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.activity.a f509c;

        LifecycleOnBackPressedCancellable(f fVar, b bVar) {
            this.f507a = fVar;
            this.f508b = bVar;
            fVar.a(this);
        }

        @Override // androidx.lifecycle.h
        public void b(j jVar, f.a aVar) {
            if (aVar == f.a.ON_START) {
                this.f509c = OnBackPressedDispatcher.this.b(this.f508b);
                return;
            }
            if (aVar != f.a.ON_STOP) {
                if (aVar == f.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f509c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f507a.c(this);
            this.f508b.e(this);
            androidx.activity.a aVar = this.f509c;
            if (aVar != null) {
                aVar.cancel();
                this.f509c = null;
            }
        }
    }

    private class a implements androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f511a;

        a(b bVar) {
            this.f511a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f506b.remove(this.f511a);
            this.f511a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f505a = runnable;
    }

    public void a(j jVar, b bVar) {
        f lifecycle = jVar.getLifecycle();
        if (lifecycle.b() == f.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f506b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> itDescendingIterator = this.f506b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f505a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

package f;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: ActivityResultContract.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResultContract.java */
    public static final class C0220a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f14531a;

        public C0220a(T t10) {
            this.f14531a = t10;
        }

        public T a() {
            return this.f14531a;
        }
    }

    public abstract Intent createIntent(Context context, I i10);

    public C0220a<O> getSynchronousResult(Context context, I i10) {
        return null;
    }

    public abstract O parseResult(int i10, Intent intent);
}

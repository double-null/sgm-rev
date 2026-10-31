package androidx.activity.result;

import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultLauncher<I> {
    public abstract f.a<I, ?> a();

    public void b(I i10) {
        c(i10, null);
    }

    public abstract void c(I i10, ActivityOptionsCompat activityOptionsCompat);

    public abstract void d();
}

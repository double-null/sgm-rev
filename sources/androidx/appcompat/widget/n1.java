package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: VectorEnabledTintResources.java */
/* JADX INFO: loaded from: classes.dex */
public class n1 extends Resources {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f1376b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f1377a;

    public n1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1377a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1376b;
    }

    public static boolean b() {
        a();
        return false;
    }

    final Drawable c(int i10) {
        return super.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Context context = this.f1377a.get();
        return context != null ? x0.g().s(context, this, i10) : super.getDrawable(i10);
    }
}

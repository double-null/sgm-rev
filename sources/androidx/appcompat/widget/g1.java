package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TintResources.java */
/* JADX INFO: loaded from: classes.dex */
class g1 extends y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f1270b;

    public g1(Context context, Resources resources) {
        super(resources);
        this.f1270b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.y0, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i10);
        Context context = this.f1270b.get();
        if (drawable != null && context != null) {
            x0.g().w(context, i10, drawable);
        }
        return drawable;
    }
}

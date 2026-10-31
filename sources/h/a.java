package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.x0;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: AppCompatResources.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f15553a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<Object>> f15554b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f15555c = new Object();

    public static ColorStateList a(Context context, int i10) {
        return context.getColorStateList(i10);
    }

    public static Drawable b(Context context, int i10) {
        return x0.g().i(context, i10);
    }
}

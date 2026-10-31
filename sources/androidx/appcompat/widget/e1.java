package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: TintContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class e1 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1253c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<e1>> f1254d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f1255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1256b;

    private e1(Context context) {
        super(context);
        if (!n1.b()) {
            this.f1255a = new g1(this, context.getResources());
            this.f1256b = null;
            return;
        }
        n1 n1Var = new n1(this, context.getResources());
        this.f1255a = n1Var;
        Resources.Theme themeNewTheme = n1Var.newTheme();
        this.f1256b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof e1) || (context.getResources() instanceof g1) || (context.getResources() instanceof n1) || !n1.b()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1253c) {
            ArrayList<WeakReference<e1>> arrayList = f1254d;
            if (arrayList == null) {
                f1254d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<e1> weakReference = f1254d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1254d.remove(size);
                    }
                }
                for (int size2 = f1254d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<e1> weakReference2 = f1254d.get(size2);
                    e1 e1Var = weakReference2 != null ? weakReference2.get() : null;
                    if (e1Var != null && e1Var.getBaseContext() == context) {
                        return e1Var;
                    }
                }
            }
            e1 e1Var2 = new e1(context);
            f1254d.add(new WeakReference<>(e1Var2));
            return e1Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1255a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1255a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1256b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1256b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}

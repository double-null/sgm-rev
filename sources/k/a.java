package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* JADX INFO: compiled from: ActionBarPolicy.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21047a;

    private a(Context context) {
        this.f21047a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f21047a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f21047a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f21047a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f21047a.getResources().getDimensionPixelSize(g.d.f15013b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f21047a.obtainStyledAttributes(null, g.j.f15111a, g.a.f14980c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(g.j.f15156j, 0);
        Resources resources = this.f21047a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(g.d.f15012a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f21047a.getResources().getBoolean(g.b.f15004a);
    }

    public boolean h() {
        return true;
    }
}

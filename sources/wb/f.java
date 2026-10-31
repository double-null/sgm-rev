package wb;

import android.content.Context;
import android.os.Build;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;

/* JADX INFO: compiled from: DeviceUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f27694a = new f();

    private f() {
    }

    public static final String a() {
        String ID = Build.ID;
        kotlin.jvm.internal.t.e(ID, "ID");
        return ID;
    }

    public static final String b() {
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.t.e(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    public static final String c() {
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.t.e(MODEL, "MODEL");
        return MODEL;
    }

    public static final String d() {
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.t.e(RELEASE, "RELEASE");
        return RELEASE;
    }

    public static final String e(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return g.c(context);
    }

    public static final String f(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return g.d(context);
    }

    public static final String g(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return g.e(context);
    }

    public static final float i(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return g.g(context);
    }

    public static final Boolean j(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return g.h(context);
    }

    public static final boolean k(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return g.a(context).smallestScreenWidthDp >= 600;
    }

    public static final String h(Context context) {
        kotlin.jvm.internal.t.f(context, UyXgnuLGEkgnZE.lrLfATeBPjv);
        return g.f(context);
    }
}

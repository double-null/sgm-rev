package g7;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15510a;

    public w(Context context) {
        this.f15510a = context.getApplicationContext();
    }

    public boolean a() {
        return this.f15510a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}

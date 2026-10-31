package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TaskStackBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f1799a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1800b;

    /* JADX INFO: compiled from: TaskStackBuilder.java */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private l1(Context context) {
        this.f1800b = context;
    }

    public static l1 e(Context context) {
        return new l1(context);
    }

    public l1 a(Intent intent) {
        this.f1799a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l1 c(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = i.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f1800b.getPackageManager());
            }
            d(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public l1 d(ComponentName componentName) {
        int size = this.f1799a.size();
        try {
            Intent intentB = i.b(this.f1800b, componentName);
            while (intentB != null) {
                this.f1799a.add(size, intentB);
                intentB = i.b(this.f1800b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public PendingIntent f(int i10, int i11) {
        return g(i10, i11, null);
    }

    public PendingIntent g(int i10, int i11, Bundle bundle) {
        if (this.f1799a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f1799a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f1800b, i10, intentArr, i11, bundle);
    }

    public void h() {
        i(null);
    }

    public void i(Bundle bundle) {
        if (this.f1799a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1799a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.i(this.f1800b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1800b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1799a.iterator();
    }
}

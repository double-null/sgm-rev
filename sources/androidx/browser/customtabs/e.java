package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: CustomTabsServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements ServiceConnection {
    private Context mApplicationContext;

    /* JADX INFO: compiled from: CustomTabsServiceConnection.java */
    class a extends c {
        a(c.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, c cVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(c.b.a.M(iBinder), componentName, this.mApplicationContext));
    }

    void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}

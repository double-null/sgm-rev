package com.prime31;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityProxyObjectHelper {
    protected static final String TAG = "Prime31";
    public static final String metaDataValue = "UnityPlayerActivityProxy";
    private Activity _context;
    private List<Class<?>> _proxyClasses = new ArrayList();

    public ActivityProxyObjectHelper(Activity activity) {
        this._context = activity;
    }

    protected void invokeZeroParameterMethod(String str) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod(str, new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    protected void onActivityResult(int i10, int i11, Intent intent) {
        for (Class<?> cls : this._proxyClasses) {
            try {
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod("onActivityResult", cls2, cls2, Intent.class).invoke(null, Integer.valueOf(i10), Integer.valueOf(i11), intent);
            } catch (Exception unused) {
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        try {
            Bundle bundle2 = this._context.getPackageManager().getApplicationInfo(this._context.getPackageName(), 128).metaData;
            for (String str : bundle2.keySet()) {
                try {
                    Object obj = bundle2.get(str);
                    if ((obj instanceof String) && ((String) obj).equalsIgnoreCase(metaDataValue)) {
                        try {
                            Class<?> cls = Class.forName(str);
                            this._proxyClasses.add(cls);
                            Log.i(TAG, "found Activity proxy class: " + cls);
                        } catch (ClassNotFoundException unused) {
                            Log.e(TAG, "no proxy class found for " + str);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.i(TAG, "Failed to load meta-data, NameNotFound: " + e10.getMessage());
        } catch (NullPointerException e11) {
            Log.e(TAG, "Failed to load meta-data, NullPointer: " + e11.getMessage());
        }
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onCreate", Bundle.class).invoke(null, bundle);
            } catch (Exception unused3) {
            }
        }
    }

    public void onKeyDown(int i10, KeyEvent keyEvent) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onKeyDown", Integer.TYPE, KeyEvent.class).invoke(null, Integer.valueOf(i10), keyEvent);
            } catch (Exception unused) {
            }
        }
    }

    public void onKeyUp(int i10, KeyEvent keyEvent) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onKeyDown", Integer.TYPE, KeyEvent.class).invoke(null, Integer.valueOf(i10), keyEvent);
            } catch (Exception unused) {
            }
        }
    }

    protected void onNewIntent(Intent intent) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onNewIntent", Intent.class).invoke(null, intent);
            } catch (Exception unused) {
            }
        }
    }

    protected void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onRequestPermissionsResult", Integer.TYPE, String[].class, int[].class).invoke(null, Integer.valueOf(i10), strArr, iArr);
            } catch (Exception unused) {
            }
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onRestoreInstanceState", Bundle.class).invoke(null, bundle);
            } catch (Exception unused) {
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onSaveInstanceState", Bundle.class).invoke(null, bundle);
            } catch (Exception unused) {
            }
        }
    }

    public void onTrimMemory(int i10) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onTrimMemory", Integer.TYPE).invoke(null, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod("onWindowFocusChanged", Boolean.TYPE).invoke(null, Boolean.valueOf(z10));
            } catch (Exception unused) {
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Iterator<Class<?>> it = this._proxyClasses.iterator();
        while (it.hasNext()) {
            try {
                it.next().getMethod(GEmOVMyH.mvvW, Configuration.class).invoke(null, configuration);
            } catch (Exception unused) {
            }
        }
    }
}

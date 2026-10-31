package com.prime31;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.player.UnityPlayer;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FacebookPluginBase {
    protected static final String MANAGER_NAME = "FacebookManager";
    protected static final String TAG = "Prime31";
    public static Activity _activity;
    public static Context _applicationContext;
    private static FacebookPlugin _instance;
    private static Field _unityPlayerActivityField;
    private static Class<?> _unityPlayerClass;
    protected LinearLayout _layout;
    private Method _unitySendMessageMethod;

    public FacebookPluginBase() {
        try {
            Activity activity = UnityPlayer.currentActivity;
            _unityPlayerClass = UnityPlayer.class;
            _unityPlayerActivityField = UnityPlayer.class.getField("currentActivity");
            this._unitySendMessageMethod = _unityPlayerClass.getMethod("UnitySendMessage", String.class, String.class, String.class);
            _applicationContext = getActivity().getApplicationContext();
        } catch (ClassNotFoundException e10) {
            Log.i(TAG, "could not find UnityPlayer class: " + e10.getMessage());
        } catch (NoSuchFieldException e11) {
            Log.i(TAG, "could not find currentActivity field: " + e11.getMessage());
        } catch (Exception e12) {
            Log.i(TAG, "unkown exception occurred locating getActivity(): " + e12.getMessage());
        }
    }

    protected static Activity getActivity() {
        Field field = _unityPlayerActivityField;
        if (field != null) {
            try {
                Activity activity = (Activity) field.get(_unityPlayerClass);
                if (activity == null) {
                    Log.e(TAG, "Something has gone terribly wrong. The Unity Activity does not exist. This could be due to a low memory situation");
                }
                return activity;
            } catch (Exception e10) {
                Log.i(TAG, "error getting currentActivity: " + e10.getMessage());
            }
        }
        return _activity;
    }

    public static int[] idArrayForResource(String str, String str2) {
        Context activity = _applicationContext;
        if (activity == null) {
            activity = getActivity();
        }
        if (activity == null) {
            Log.e(TAG, "applicationContext and UnityPlayer.currentActivity are null. Cannot find resource ID dynamically.");
            return new int[0];
        }
        try {
            int iIdForResource = idForResource(str, str2);
            if (iIdForResource != 0) {
                return activity.getResources().getIntArray(iIdForResource);
            }
            Log.e(TAG, "Could not find an id for the resource [" + str + "] with type [" + str2 + "]");
            return new int[0];
        } catch (Exception e10) {
            Log.e(TAG, "Exception trying to get intArray: " + e10);
            return new int[0];
        }
    }

    public static int idForResource(String str, String str2) {
        Context activity = _applicationContext;
        if (activity == null) {
            activity = getActivity();
        }
        if (activity == null) {
            Log.e(TAG, "applicationContext and UnityPlayer.currentActivity are null. Cannot find resource ID dynamically.");
            return 0;
        }
        try {
            return activity.getResources().getIdentifier(str, str2, activity.getPackageName());
        } catch (Exception e10) {
            Log.e(TAG, "Exception trying to getIdentifier: " + e10);
            return 0;
        }
    }

    public static FacebookPlugin instance() {
        if (_instance == null) {
            _instance = new FacebookPlugin();
        }
        return _instance;
    }

    protected void UnitySendMessage(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Method method = this._unitySendMessageMethod;
        if (method == null) {
            Toast.makeText(getActivity(), "UnitySendMessage:\n" + str + "\n" + str2, 1).show();
            Log.i(TAG, "UnitySendMessage: FacebookManager, " + str + ", " + str2);
            return;
        }
        try {
            method.invoke(null, MANAGER_NAME, str, str2);
        } catch (IllegalAccessException e10) {
            Log.i(TAG, "could not find UnitySendMessage method: " + e10.getMessage());
        } catch (IllegalArgumentException e11) {
            Log.i(TAG, "could not find UnitySendMessage method: " + e11.getMessage());
        } catch (InvocationTargetException e12) {
            Log.i(TAG, "could not find UnitySendMessage method: " + e12.getMessage());
        }
    }

    protected Bundle bundleFromJSON(String str) {
        if (str != null && str.length() != 0) {
            Bundle bundle = new Bundle();
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        bundle.putString(next, jSONObject.getString(next));
                    } catch (JSONException e10) {
                        Log.i(TAG, "failed to extract value for key: " + next + ", error: " + e10.getMessage());
                    }
                }
                return bundle;
            } catch (JSONException e11) {
                Log.i(TAG, "failed to parse Bundoe from json: " + e11.getMessage());
            }
        }
        return null;
    }

    protected HashMap<String, Object> fromJSON(String str) {
        if (str != null && str.length() != 0) {
            HashMap<String, Object> map = new HashMap<>();
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObject.getString(next));
                    } catch (JSONException e10) {
                        Log.i(TAG, "failed to extract value for key: " + next + ", error: " + e10.getMessage());
                    }
                }
                return map;
            } catch (JSONException e11) {
                Log.i(TAG, "failed to parse userInfoJSON: " + e11.getMessage());
            }
        }
        return null;
    }

    protected void runSafelyOnUiThread(Runnable runnable) {
        runSafelyOnUiThread(runnable, null);
    }

    protected String bundleToJSON(Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            Log.i(vgmm.zeEl, "Error creating JSON" + e10.getMessage());
            return JsonUtils.EMPTY_JSON;
        }
    }

    protected void runSafelyOnUiThread(final Runnable runnable, final String str) {
        getActivity().runOnUiThread(new Runnable() { // from class: com.prime31.FacebookPluginBase.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e10) {
                    String str2 = str;
                    if (str2 != null) {
                        FacebookPluginBase.this.UnitySendMessage(str2, e10.getMessage());
                    }
                    Log.e(FacebookPluginBase.TAG, "Exception running command on UI thread: " + e10.getMessage());
                }
            }
        });
    }
}

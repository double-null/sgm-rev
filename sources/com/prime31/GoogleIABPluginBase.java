package com.prime31;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.player.UnityPlayer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class GoogleIABPluginBase {
    protected static final String MANAGER_NAME = "GoogleIABManager";
    protected static final String TAG = "Prime31";
    private static GoogleIABPlugin _instance;
    public Activity _activity;
    protected LinearLayout _layout;
    private Field _unityPlayerActivityField;
    private Class<?> _unityPlayerClass;
    private Method _unitySendMessageMethod;

    public GoogleIABPluginBase() {
        try {
            Activity activity = UnityPlayer.currentActivity;
            this._unityPlayerClass = UnityPlayer.class;
            this._unityPlayerActivityField = UnityPlayer.class.getField("currentActivity");
            this._unitySendMessageMethod = this._unityPlayerClass.getMethod("UnitySendMessage", String.class, String.class, String.class);
        } catch (ClassNotFoundException e10) {
            Log.i(TAG, "could not find UnityPlayer class: " + e10.getMessage());
        } catch (NoSuchFieldException e11) {
            Log.i(TAG, "could not find currentActivity field: " + e11.getMessage());
        } catch (Exception e12) {
            Log.i(TAG, "unkown exception occurred locating getActivity(): " + e12.getMessage());
        }
    }

    public static Bundle bundleFromJson(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
            Double dValueOf = Double.valueOf(jSONObject.optDouble(next));
            String strOptString = jSONObject.optString(next);
            int i10 = 0;
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() <= 0) {
                bundle.putStringArray(next, new String[0]);
            } else if (jSONArrayOptJSONArray != null && !Double.isNaN(jSONArrayOptJSONArray.optDouble(0))) {
                double[] dArr = new double[jSONArrayOptJSONArray.length()];
                while (i10 < jSONArrayOptJSONArray.length()) {
                    dArr[i10] = jSONArrayOptJSONArray.optDouble(i10);
                    i10++;
                }
                bundle.putDoubleArray(next, dArr);
            } else if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.optString(0) != null) {
                String[] strArr = new String[jSONArrayOptJSONArray.length()];
                while (i10 < jSONArrayOptJSONArray.length()) {
                    strArr[i10] = jSONArrayOptJSONArray.optString(i10);
                    i10++;
                }
                bundle.putStringArray(next, strArr);
            } else if (!dValueOf.isNaN()) {
                bundle.putDouble(next, dValueOf.doubleValue());
            } else if (strOptString != null) {
                bundle.putString(next, strOptString);
            } else {
                System.err.println("unable to transform json to bundle " + next);
            }
        }
        return bundle;
    }

    public static GoogleIABPlugin instance() {
        if (_instance == null) {
            _instance = new GoogleIABPlugin();
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
            Log.i(TAG, "UnitySendMessage: GoogleIABManager, " + str + ", " + str2);
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

    protected Activity getActivity() {
        Field field = this._unityPlayerActivityField;
        if (field != null) {
            try {
                Activity activity = (Activity) field.get(this._unityPlayerClass);
                if (activity == null) {
                    Log.e(TAG, "Something has gone terribly wrong. The Unity Activity does not exist. This could be due to a low memory situation");
                }
                return activity;
            } catch (Exception e10) {
                Log.i(TAG, "error getting currentActivity: " + e10.getMessage());
            }
        }
        return this._activity;
    }

    protected String jsonFromBundle(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, JSONObject.wrap(bundle.get(str)));
                return jSONObject.toString();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return JsonUtils.EMPTY_JSON;
    }

    protected void persist(String str, String str2) {
        IABConstants.logEntering(getClass().getSimpleName(), "persist", new Object[]{str, str2});
        try {
            getActivity().getSharedPreferences("P31Preferences", 0).edit().putString(str, str2).commit();
        } catch (Exception e10) {
            Log.i(TAG, "error in persist: " + e10.getMessage());
        }
    }

    protected void runSafelyOnUiThread(Runnable runnable) {
        runSafelyOnUiThread(runnable, null);
    }

    protected String unpersist(String str, boolean z10) {
        IABConstants.logEntering(getClass().getSimpleName(), "unpersist", new Object[]{str, Boolean.TRUE});
        String string = "";
        try {
            SharedPreferences sharedPreferences = getActivity().getSharedPreferences("P31Preferences", 0);
            string = sharedPreferences.getString(str, null);
            if (z10) {
                sharedPreferences.edit().remove(str).commit();
            }
            return string;
        } catch (Exception e10) {
            Log.i(TAG, "error in unpersist: " + e10.getMessage());
            return string;
        }
    }

    protected void runSafelyOnUiThread(final Runnable runnable, final String str) {
        getActivity().runOnUiThread(new Runnable() { // from class: com.prime31.GoogleIABPluginBase.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Exception e10) {
                    String str2 = str;
                    if (str2 != null) {
                        GoogleIABPluginBase.this.UnitySendMessage(str2, e10.getMessage());
                    }
                    Log.e(GoogleIABPluginBase.TAG, "Exception running command on UI thread: " + e10.getMessage());
                }
            }
        });
    }
}

package com.facebook.unity;

import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class UnityMessage {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String methodName;
    private Map<String, Serializable> params = new HashMap();

    public UnityMessage(String str) {
        this.methodName = str;
    }

    public static UnityMessage createWithCallbackFromParams(String str, UnityParams unityParams) {
        UnityMessage unityMessage = new UnityMessage(str);
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        return unityMessage;
    }

    public UnityMessage put(String str, Serializable serializable) {
        this.params.put(str, serializable);
        return this;
    }

    public UnityMessage putCancelled() {
        put(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, Boolean.TRUE);
        return this;
    }

    public UnityMessage putID(String str) {
        put("id", str);
        return this;
    }

    public void send() {
        String string = new UnityParams(this.params).toString();
        Log.v(FB.TAG, "sending to Unity " + this.methodName + "(" + string + ")");
        try {
            UnityReflection.SendMessage("UnityFacebookSDKPlugin", this.methodName, string);
        } catch (UnsatisfiedLinkError unused) {
            Log.v(FB.TAG, "message not send, Unity not initialized");
        }
    }

    public void sendError(String str) {
        put("error", str);
        send();
    }
}

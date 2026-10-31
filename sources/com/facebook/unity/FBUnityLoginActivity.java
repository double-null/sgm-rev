package com.facebook.unity;

import android.os.Bundle;
import com.facebook.CallbackManager;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes3.dex */
public class FBUnityLoginActivity extends BaseActivity {
    public static final String LOGIN_PARAMS = "login_params";
    public static final String LOGIN_TYPE = "login_type";

    /* JADX INFO: renamed from: com.facebook.unity.FBUnityLoginActivity$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType;

        static {
            int[] iArr = new int[LoginType.values().length];
            $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType = iArr;
            try {
                iArr[LoginType.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.TV_READ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$unity$FBUnityLoginActivity$LoginType[LoginType.TV_PUBLISH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum LoginType {
        READ,
        PUBLISH,
        TV_READ,
        TV_PUBLISH
    }

    public CallbackManager getCallbackManager() {
        return this.mCallbackManager;
    }

    @Override // com.facebook.unity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        VMRunner.invoke("xIdTCRNKeDevao6p", new Object[]{this, bundle});
    }
}

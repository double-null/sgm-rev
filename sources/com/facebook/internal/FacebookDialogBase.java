package com.facebook.internal;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResultRegistry;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FacebookDialogBase.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class FacebookDialogBase<CONTENT, RESULT> implements FacebookDialog<CONTENT, RESULT> {
    private static final String TAG = "FacebookDialog";
    private final Activity activity;
    private CallbackManager callbackManager;
    private final FragmentWrapper fragmentWrapper;
    private List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> modeHandlers;
    private int requestCodeField;
    public static final Companion Companion = new Companion(null);
    public static final Object BASE_AUTOMATIC_MODE = new Object();

    /* JADX INFO: compiled from: FacebookDialogBase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: FacebookDialogBase.kt */
    public abstract class ModeHandler {
        private Object mode = FacebookDialogBase.BASE_AUTOMATIC_MODE;

        public ModeHandler() {
        }

        public abstract boolean canShow(CONTENT content, boolean z10);

        public abstract AppCall createAppCall(CONTENT content);

        public Object getMode() {
            return this.mode;
        }

        public void setMode(Object obj) {
            kotlin.jvm.internal.t.f(obj, "<set-?>");
            this.mode = obj;
        }
    }

    protected FacebookDialogBase(Activity activity, int i10) {
        kotlin.jvm.internal.t.f(activity, "activity");
        this.activity = activity;
        this.fragmentWrapper = null;
        this.requestCodeField = i10;
        this.callbackManager = null;
    }

    private final List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> cachedModeHandlers() {
        if (this.modeHandlers == null) {
            this.modeHandlers = getOrderedModeHandlers();
        }
        List<? extends FacebookDialogBase<CONTENT, RESULT>.ModeHandler> list = this.modeHandlers;
        kotlin.jvm.internal.t.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCall createAppCallForMode(CONTENT content, Object obj) {
        AppCall appCallCreateAppCall;
        boolean z10 = obj == BASE_AUTOMATIC_MODE;
        Iterator<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> it = cachedModeHandlers().iterator();
        while (true) {
            if (!it.hasNext()) {
                appCallCreateAppCall = null;
                break;
            }
            FacebookDialogBase<CONTENT, RESULT>.ModeHandler next = it.next();
            if (z10 || Utility.areObjectsEqual(next.getMode(), obj)) {
                if (next.canShow(content, true)) {
                    try {
                        appCallCreateAppCall = next.createAppCall(content);
                        break;
                    } catch (FacebookException e10) {
                        AppCall appCallCreateBaseAppCall = createBaseAppCall();
                        DialogPresenter.setupAppCallForValidationError(appCallCreateBaseAppCall, e10);
                        appCallCreateAppCall = appCallCreateBaseAppCall;
                    }
                }
            }
        }
        if (appCallCreateAppCall != null) {
            return appCallCreateAppCall;
        }
        AppCall appCallCreateBaseAppCall2 = createBaseAppCall();
        DialogPresenter.setupAppCallForCannotShowError(appCallCreateBaseAppCall2);
        return appCallCreateBaseAppCall2;
    }

    private final void memorizeCallbackManager(CallbackManager callbackManager) {
        CallbackManager callbackManager2 = this.callbackManager;
        if (callbackManager2 == null) {
            this.callbackManager = callbackManager;
        } else if (callbackManager2 != callbackManager) {
            Log.w(TAG, "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    @Override // com.facebook.FacebookDialog
    public boolean canShow(CONTENT content) {
        return canShowImpl(content, BASE_AUTOMATIC_MODE);
    }

    protected boolean canShowImpl(CONTENT content, Object mode) {
        kotlin.jvm.internal.t.f(mode, "mode");
        boolean z10 = mode == BASE_AUTOMATIC_MODE;
        for (FacebookDialogBase<CONTENT, RESULT>.ModeHandler modeHandler : cachedModeHandlers()) {
            if (z10 || Utility.areObjectsEqual(modeHandler.getMode(), mode)) {
                if (modeHandler.canShow(content, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final f.a<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(final CallbackManager callbackManager, final Object mode) {
        kotlin.jvm.internal.t.f(mode, "mode");
        return new f.a<CONTENT, CallbackManager.ActivityResultParameters>(this) { // from class: com.facebook.internal.FacebookDialogBase.createActivityResultContractForShowingDialog.1
            final /* synthetic */ FacebookDialogBase<CONTENT, RESULT> this$0;

            {
                this.this$0 = this;
            }

            @Override // f.a
            public Intent createIntent(Context context, CONTENT content) {
                kotlin.jvm.internal.t.f(context, "context");
                AppCall appCallCreateAppCallForMode = this.this$0.createAppCallForMode(content, mode);
                Intent requestIntent = appCallCreateAppCallForMode != null ? appCallCreateAppCallForMode.getRequestIntent() : null;
                if (requestIntent != null) {
                    appCallCreateAppCallForMode.setPending();
                    return requestIntent;
                }
                throw new FacebookException("Content " + content + " is not supported");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // f.a
            public CallbackManager.ActivityResultParameters parseResult(int i10, Intent intent) {
                CallbackManager callbackManager2 = callbackManager;
                if (callbackManager2 != null) {
                    callbackManager2.onActivityResult(this.this$0.getRequestCode(), i10, intent);
                }
                return new CallbackManager.ActivityResultParameters(this.this$0.getRequestCode(), i10, intent);
            }
        };
    }

    protected abstract AppCall createBaseAppCall();

    protected final Activity getActivityContext() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper != null) {
            return fragmentWrapper.getActivity();
        }
        return null;
    }

    public final CallbackManager getCallbackManager$facebook_common_release() {
        return this.callbackManager;
    }

    protected abstract List<FacebookDialogBase<CONTENT, RESULT>.ModeHandler> getOrderedModeHandlers();

    public final int getRequestCode() {
        return this.requestCodeField;
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> callback) {
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(callback, "callback");
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        memorizeCallbackManager(callbackManager);
        registerCallbackImpl((CallbackManagerImpl) callbackManager, callback);
    }

    protected abstract void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<RESULT> facebookCallback);

    public final void setCallbackManager(CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setCallbackManager$facebook_common_release(CallbackManager callbackManager) {
        this.callbackManager = callbackManager;
    }

    public final void setRequestCode(int i10) {
        if (!FacebookSdk.isFacebookRequestCode(i10)) {
            this.requestCodeField = i10;
            return;
        }
        throw new IllegalArgumentException(("Request code " + i10 + " cannot be within the range reserved by the Facebook SDK.").toString());
    }

    @Override // com.facebook.FacebookDialog
    public void show(CONTENT content) {
        showImpl(content, BASE_AUTOMATIC_MODE);
    }

    protected void showImpl(CONTENT content, Object mode) {
        kotlin.jvm.internal.t.f(mode, "mode");
        AppCall appCallCreateAppCallForMode = createAppCallForMode(content, mode);
        if (appCallCreateAppCallForMode == null) {
            Log.e(TAG, "No code path should ever result in a null appCall");
            if (!(!FacebookSdk.isDebugEnabled())) {
                throw new IllegalStateException("No code path should ever result in a null appCall".toString());
            }
            return;
        }
        if (getActivityContext() instanceof androidx.activity.result.c) {
            ComponentCallbacks2 activityContext = getActivityContext();
            kotlin.jvm.internal.t.d(activityContext, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.c) activityContext).getActivityResultRegistry();
            kotlin.jvm.internal.t.e(activityResultRegistry, "registryOwner.activityResultRegistry");
            DialogPresenter.present(appCallCreateAppCallForMode, activityResultRegistry, this.callbackManager);
            appCallCreateAppCallForMode.setPending();
            return;
        }
        FragmentWrapper fragmentWrapper = this.fragmentWrapper;
        if (fragmentWrapper != null) {
            DialogPresenter.present(appCallCreateAppCallForMode, fragmentWrapper);
            return;
        }
        Activity activity = this.activity;
        if (activity != null) {
            DialogPresenter.present(appCallCreateAppCallForMode, activity);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void startActivityForResult(Intent intent, int i10) {
        String str;
        kotlin.jvm.internal.t.f(intent, "intent");
        Activity activityContext = getActivityContext();
        if (activityContext instanceof androidx.activity.result.c) {
            ActivityResultRegistry activityResultRegistry = ((androidx.activity.result.c) activityContext).getActivityResultRegistry();
            kotlin.jvm.internal.t.e(activityResultRegistry, "activity as ActivityResu…r).activityResultRegistry");
            DialogPresenter.startActivityForResultWithAndroidX(activityResultRegistry, this.callbackManager, intent, i10);
        } else {
            if (activityContext == 0) {
                FragmentWrapper fragmentWrapper = this.fragmentWrapper;
                if (fragmentWrapper != null) {
                    fragmentWrapper.startActivityForResult(intent, i10);
                } else {
                    str = "Failed to find Activity or Fragment to startActivityForResult ";
                }
                if (str != null) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    String name = getClass().getName();
                    kotlin.jvm.internal.t.e(name, "this.javaClass.name");
                    companion.log(loggingBehavior, 6, name, str);
                }
            }
            activityContext.startActivityForResult(intent, i10);
        }
        str = null;
        if (str != null) {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.DEVELOPER_ERRORS;
            String name2 = getClass().getName();
            kotlin.jvm.internal.t.e(name2, "this.javaClass.name");
            companion2.log(loggingBehavior2, 6, name2, str);
        }
    }

    @Override // com.facebook.FacebookDialog
    public f.a<CONTENT, CallbackManager.ActivityResultParameters> createActivityResultContractForShowingDialog(CallbackManager callbackManager) {
        return createActivityResultContractForShowingDialog(callbackManager, BASE_AUTOMATIC_MODE);
    }

    @Override // com.facebook.FacebookDialog
    public void registerCallback(CallbackManager callbackManager, FacebookCallback<RESULT> callback, int i10) {
        kotlin.jvm.internal.t.f(callbackManager, "callbackManager");
        kotlin.jvm.internal.t.f(callback, "callback");
        memorizeCallbackManager(callbackManager);
        setRequestCode(i10);
        registerCallback(callbackManager, callback);
    }

    protected FacebookDialogBase(FragmentWrapper fragmentWrapper, int i10) {
        kotlin.jvm.internal.t.f(fragmentWrapper, "fragmentWrapper");
        this.fragmentWrapper = fragmentWrapper;
        this.activity = null;
        this.requestCodeField = i10;
        if (fragmentWrapper.getActivity() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity".toString());
        }
    }

    protected FacebookDialogBase(int i10) {
        this.requestCodeField = i10;
        this.activity = null;
        this.fragmentWrapper = null;
    }
}

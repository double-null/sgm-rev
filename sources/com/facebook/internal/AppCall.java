package com.facebook.internal;

import android.content.Intent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.UUID;

/* JADX INFO: compiled from: AppCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppCall {
    public static final Companion Companion = new Companion(null);
    private static AppCall currentPendingCall;
    private final UUID callId;
    private int requestCode;
    private Intent requestIntent;

    /* JADX INFO: compiled from: AppCall.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean setCurrentPendingCall(AppCall appCall) {
            AppCall currentPendingCall;
            currentPendingCall = getCurrentPendingCall();
            AppCall.access$setCurrentPendingCall$cp(appCall);
            return currentPendingCall != null;
        }

        public final synchronized AppCall finishPendingCall(UUID callId, int i10) {
            kotlin.jvm.internal.t.f(callId, "callId");
            AppCall currentPendingCall = getCurrentPendingCall();
            if (currentPendingCall != null && kotlin.jvm.internal.t.a(currentPendingCall.getCallId(), callId) && currentPendingCall.getRequestCode() == i10) {
                setCurrentPendingCall(null);
                return currentPendingCall;
            }
            return null;
        }

        public final AppCall getCurrentPendingCall() {
            return AppCall.access$getCurrentPendingCall$cp();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppCall(int i10) {
        this(i10, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ AppCall access$getCurrentPendingCall$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
            return null;
        }
        try {
            return currentPendingCall;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppCall.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCurrentPendingCall$cp(AppCall appCall) {
        if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
            return;
        }
        try {
            currentPendingCall = appCall;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppCall.class);
        }
    }

    public static final synchronized AppCall finishPendingCall(UUID uuid, int i10) {
        if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
            return null;
        }
        try {
            return Companion.finishPendingCall(uuid, i10);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppCall.class);
            return null;
        }
    }

    public final UUID getCallId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.callId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int getRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.requestCode;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final Intent getRequestIntent() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.requestIntent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean setPending() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return Companion.setCurrentPendingCall(this);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public final void setRequestCode(int i10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.requestCode = i10;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setRequestIntent(Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.requestIntent = intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public AppCall(int i10, UUID callId) {
        kotlin.jvm.internal.t.f(callId, "callId");
        this.requestCode = i10;
        this.callId = callId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppCall(int i10, UUID uuid, int i11, kotlin.jvm.internal.k kVar) {
        if ((i11 & 2) != 0) {
            uuid = UUID.randomUUID();
            kotlin.jvm.internal.t.e(uuid, "randomUUID()");
        }
        this(i10, uuid);
    }
}

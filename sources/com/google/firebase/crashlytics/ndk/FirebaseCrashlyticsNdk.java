package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import e3.i0;
import z2.f;
import z2.g;

/* JADX INFO: loaded from: classes4.dex */
class FirebaseCrashlyticsNdk implements CrashlyticsNativeComponent {
    private static FirebaseCrashlyticsNdk instance;
    private final CrashpadController controller;
    private String currentSessionId;
    private boolean installHandlerDuringPrepareSession;
    private SignalHandlerInstaller signalHandlerInstaller;

    /* JADX INFO: Access modifiers changed from: private */
    interface SignalHandlerInstaller {
        void installHandler();
    }

    FirebaseCrashlyticsNdk(CrashpadController crashpadController, boolean z10) {
        this.controller = crashpadController;
        this.installHandlerDuringPrepareSession = z10;
    }

    static FirebaseCrashlyticsNdk create(Context context, boolean z10) {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = new FirebaseCrashlyticsNdk(new CrashpadController(context, new JniNativeApi(context), new FileStore(context)), z10);
        instance = firebaseCrashlyticsNdk;
        return firebaseCrashlyticsNdk;
    }

    public static FirebaseCrashlyticsNdk getInstance() {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = instance;
        if (firebaseCrashlyticsNdk != null) {
            return firebaseCrashlyticsNdk;
        }
        throw new NullPointerException("FirebaseCrashlyticsNdk component is not present.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareNativeSession$0(String str, String str2, long j10, i0 i0Var) {
        f.f().b("Initializing native session: " + str);
        if (this.controller.initialize(str, str2, j10, i0Var)) {
            return;
        }
        f.f().k("Failed to initialize Crashlytics NDK for session " + str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public g getSessionFileProvider(String str) {
        return new SessionFilesProvider(this.controller.getFilesForSession(str));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        String str = this.currentSessionId;
        return str != null && hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(String str) {
        return this.controller.hasCrashDataForSession(str);
    }

    public synchronized void installSignalHandler() {
        SignalHandlerInstaller signalHandlerInstaller = this.signalHandlerInstaller;
        if (signalHandlerInstaller != null) {
            signalHandlerInstaller.installHandler();
            return;
        }
        if (this.installHandlerDuringPrepareSession) {
            f.f().k("Native signal handler already installed; skipping re-install.");
        } else {
            f.f().b("Deferring signal handler installation until the FirebaseCrashlyticsNdk session has been prepared");
            this.installHandlerDuringPrepareSession = true;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public synchronized void prepareNativeSession(final String str, final String str2, final long j10, final i0 i0Var) {
        this.currentSessionId = str;
        SignalHandlerInstaller signalHandlerInstaller = new SignalHandlerInstaller() { // from class: com.google.firebase.crashlytics.ndk.d
            @Override // com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller
            public final void installHandler() {
                this.f12236a.lambda$prepareNativeSession$0(str, str2, j10, i0Var);
            }
        };
        this.signalHandlerInstaller = signalHandlerInstaller;
        if (this.installHandlerDuringPrepareSession) {
            signalHandlerInstaller.installHandler();
        }
    }
}

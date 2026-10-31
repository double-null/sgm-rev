package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;

/* JADX INFO: compiled from: InstrumentManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentManager {
    public static final InstrumentManager INSTANCE = new InstrumentManager();

    private InstrumentManager() {
    }

    public static final void start() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, new FeatureManager.Callback() { // from class: v1.b
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    InstrumentManager.start$lambda$0(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new FeatureManager.Callback() { // from class: v1.c
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    InstrumentManager.start$lambda$1(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.AnrReport, new FeatureManager.Callback() { // from class: v1.d
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    InstrumentManager.start$lambda$2(z10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(boolean z10) {
        if (z10) {
            CrashHandler.Companion.enable();
            if (FeatureManager.isEnabled(FeatureManager.Feature.CrashShield)) {
                ExceptionAnalyzer.enable();
                CrashShieldHandler.enable();
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.ThreadCheck)) {
                ThreadCheckHandler.enable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(boolean z10) {
        if (z10) {
            ErrorReportHandler.enable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$2(boolean z10) {
        if (z10) {
            ANRHandler.enable();
        }
    }
}

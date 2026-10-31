package com.facebook.appevents;

import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.pa.PACustomAudienceClient;
import com.facebook.appevents.gps.topics.GpsTopicsManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.integrity.BannedParamManager;
import com.facebook.appevents.integrity.BlocklistEventsManager;
import com.facebook.appevents.integrity.MACARuleMatchingManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.integrity.StdParamsEnforcementManager;
import com.facebook.appevents.integrity.VVPManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

/* JADX INFO: compiled from: AppEventsManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsManager {
    public static final AppEventsManager INSTANCE = new AppEventsManager();

    private AppEventsManager() {
    }

    public static final void start() {
        if (CrashShieldHandler.isObjectCrashing(AppEventsManager.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager.getAppSettingsAsync(new AnonymousClass1());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventsManager.class);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.AppEventsManager$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppEventsManager.kt */
    public static final class AnonymousClass1 implements FetchedAppSettingsManager.FetchedAppSettingsCallback {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(boolean z10) {
            if (z10) {
                MetadataIndexer.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$1(boolean z10) {
            if (z10) {
                RestrictiveDataManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$10(boolean z10) {
            if (z10) {
                RedactedEventsManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$11(boolean z10) {
            if (z10) {
                SensitiveParamsManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$12(boolean z10) {
            if (z10) {
                AppEventsCAPIManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$13(boolean z10) {
            if (z10) {
                GpsAraTriggersManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$14(boolean z10) {
            if (z10) {
                PACustomAudienceClient.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$15(boolean z10) {
            if (z10) {
                GpsTopicsManager.enableTopicsObservation();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$16(boolean z10) {
            if (z10) {
                VVPManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$2(boolean z10) {
            if (z10) {
                ModelManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$3(boolean z10) {
            if (z10) {
                EventDeactivationManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$4(boolean z10) {
            if (z10) {
                BannedParamManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$5(boolean z10) {
            if (z10) {
                InAppPurchaseManager.enableAutoLogging();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$6(boolean z10) {
            if (z10) {
                StdParamsEnforcementManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$7(boolean z10) {
            if (z10) {
                ProtectedModeManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$8(boolean z10) {
            if (z10) {
                MACARuleMatchingManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$9(boolean z10) {
            if (z10) {
                BlocklistEventsManager.enable();
            }
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
        public void onSuccess(FetchedAppSettings fetchedAppSettings) {
            FeatureManager.checkFeature(FeatureManager.Feature.AAM, new FeatureManager.Callback() { // from class: com.facebook.appevents.l
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$0(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.RestrictiveDataFiltering, new FeatureManager.Callback() { // from class: com.facebook.appevents.a0
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$1(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.PrivacyProtection, new FeatureManager.Callback() { // from class: com.facebook.appevents.b0
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$2(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.EventDeactivation, new FeatureManager.Callback() { // from class: com.facebook.appevents.m
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$3(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.BannedParamFiltering, new FeatureManager.Callback() { // from class: com.facebook.appevents.n
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$4(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.IapLogging, new FeatureManager.Callback() { // from class: com.facebook.appevents.o
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$5(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.StdParamEnforcement, new FeatureManager.Callback() { // from class: com.facebook.appevents.p
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$6(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.ProtectedMode, new FeatureManager.Callback() { // from class: com.facebook.appevents.q
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$7(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.MACARuleMatching, new FeatureManager.Callback() { // from class: com.facebook.appevents.r
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$8(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.BlocklistEvents, new FeatureManager.Callback() { // from class: com.facebook.appevents.s
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$9(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.FilterRedactedEvents, new FeatureManager.Callback() { // from class: com.facebook.appevents.t
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$10(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.FilterSensitiveParams, new FeatureManager.Callback() { // from class: com.facebook.appevents.u
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$11(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.CloudBridge, new FeatureManager.Callback() { // from class: com.facebook.appevents.v
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$12(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.GPSARATriggers, new FeatureManager.Callback() { // from class: com.facebook.appevents.w
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$13(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.GPSPACAProcessing, new FeatureManager.Callback() { // from class: com.facebook.appevents.x
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$14(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.GPSTopicsObservation, new FeatureManager.Callback() { // from class: com.facebook.appevents.y
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$15(z10);
                }
            });
            FeatureManager.checkFeature(FeatureManager.Feature.VVP, new FeatureManager.Callback() { // from class: com.facebook.appevents.z
                @Override // com.facebook.internal.FeatureManager.Callback
                public final void onCompleted(boolean z10) {
                    AppEventsManager.AnonymousClass1.onSuccess$lambda$16(z10);
                }
            });
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.FetchedAppSettingsCallback
        public void onError() {
        }
    }
}

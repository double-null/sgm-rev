package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxSegmentCollection f8225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f8226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f8227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f8228h;

    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f8229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f8231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f8232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MaxSegmentCollection f8233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f8234f = Collections.emptyList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f8235g = Collections.emptyList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f8236h = true;

        public BuilderImpl(String str, String str2) {
            this.f8229a = str;
            this.f8230b = str2;
            p.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f8235g;
        }

        public String getAxonEventKey() {
            return this.f8230b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getMediationProvider() {
            return this.f8231c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getPluginVersion() {
            return this.f8232d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f8229a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public MaxSegmentCollection getSegmentCollection() {
            return this.f8233e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f8234f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f8236h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            p.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        p.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f8235g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            p.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f8236h = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(String str) {
            p.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f8231c = str;
                return this;
            }
            p.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(String str) {
            p.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f8232d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f8229a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            p.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.f8233e = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            p.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || str.length() != 36) {
                    p.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f8234f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f8229a + ", axonEventKey=" + this.f8230b + ", mediationProvider=" + this.f8231c + ", pluginVersion=" + this.f8232d + ", testDeviceAdvertisingIdentifiers=" + this.f8234f + ", adUnitIdentifiers=" + this.f8235g + ", isExceptionHandlerEnabled=" + this.f8236h + ", segmentCollection=" + this.f8233e + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f8227g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getAxonEventKey() {
        return this.f8222b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getMediationProvider() {
        return this.f8223c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getPluginVersion() {
        return this.f8224d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getSdkKey() {
        return this.f8221a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public MaxSegmentCollection getSegmentCollection() {
        return this.f8225e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f8226f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f8228h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f8221a + ", axonEventKey=" + this.f8222b + ", mediationProvider=" + this.f8223c + ", pluginVersion=" + this.f8224d + ", testDeviceAdvertisingIds=" + this.f8226f + ", adUnitIdentifiers=" + this.f8227g + ", isExceptionHandlerEnabled=" + this.f8228h + ", segmentCollection=" + this.f8225e + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f8221a = builderImpl.f8229a;
        this.f8222b = builderImpl.f8230b;
        this.f8223c = builderImpl.f8231c;
        this.f8224d = builderImpl.f8232d;
        this.f8225e = builderImpl.f8233e;
        this.f8226f = builderImpl.f8234f;
        this.f8227g = builderImpl.f8235g;
        this.f8228h = builderImpl.f8236h;
    }
}

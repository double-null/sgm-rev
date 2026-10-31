package com.vungle.ads.internal.util;

import com.vungle.ads.internal.AdInternal;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class LogEntry {
    private Long adLoadType;
    private Boolean adPoddingEnabled;
    private String adSource;
    private AdInternal.AdState adState;
    private String adapterAdFormat;
    private Boolean adoEnabled;
    private String creativeId;
    private String eventId;
    private String experiments;
    private String mediationName;
    private Boolean partialDownloadEnabled;
    private String placementRefId;
    private String vmVersion;

    private final int hashCode(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.a(LogEntry.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.d(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        LogEntry logEntry = (LogEntry) obj;
        return t.a(this.placementRefId, logEntry.placementRefId) && t.a(this.creativeId, logEntry.creativeId) && t.a(this.eventId, logEntry.eventId) && t.a(this.adSource, logEntry.adSource) && t.a(this.mediationName, logEntry.mediationName) && t.a(this.vmVersion, logEntry.vmVersion) && t.a(this.partialDownloadEnabled, logEntry.partialDownloadEnabled) && t.a(this.adoEnabled, logEntry.adoEnabled) && this.adState == logEntry.adState && t.a(this.adPoddingEnabled, logEntry.adPoddingEnabled) && t.a(this.experiments, logEntry.experiments) && t.a(this.adLoadType, logEntry.adLoadType) && t.a(this.adapterAdFormat, logEntry.adapterAdFormat);
    }

    public final Long getAdLoadType$vungle_ads_release() {
        return this.adLoadType;
    }

    public final Boolean getAdPoddingEnabled$vungle_ads_release() {
        return this.adPoddingEnabled;
    }

    public final String getAdSource$vungle_ads_release() {
        return this.adSource;
    }

    public final AdInternal.AdState getAdState$vungle_ads_release() {
        return this.adState;
    }

    public final String getAdapterAdFormat$vungle_ads_release() {
        return this.adapterAdFormat;
    }

    public final Boolean getAdoEnabled$vungle_ads_release() {
        return this.adoEnabled;
    }

    public final String getCreativeId$vungle_ads_release() {
        return this.creativeId;
    }

    public final String getEventId$vungle_ads_release() {
        return this.eventId;
    }

    public final String getExperiments$vungle_ads_release() {
        return this.experiments;
    }

    public final String getMediationName$vungle_ads_release() {
        return this.mediationName;
    }

    public final Boolean getPartialDownloadEnabled$vungle_ads_release() {
        return this.partialDownloadEnabled;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    public final String getVmVersion$vungle_ads_release() {
        return this.vmVersion;
    }

    public final void setAdLoadType$vungle_ads_release(Long l10) {
        this.adLoadType = l10;
    }

    public final void setAdPoddingEnabled$vungle_ads_release(Boolean bool) {
        this.adPoddingEnabled = bool;
    }

    public final void setAdSource$vungle_ads_release(String str) {
        this.adSource = str;
    }

    public final void setAdState$vungle_ads_release(AdInternal.AdState adState) {
        this.adState = adState;
    }

    public final void setAdapterAdFormat$vungle_ads_release(String str) {
        this.adapterAdFormat = str;
    }

    public final void setAdoEnabled$vungle_ads_release(Boolean bool) {
        this.adoEnabled = bool;
    }

    public final void setCreativeId$vungle_ads_release(String str) {
        this.creativeId = str;
    }

    public final void setEventId$vungle_ads_release(String str) {
        this.eventId = str;
    }

    public final void setExperiments$vungle_ads_release(String str) {
        this.experiments = str;
    }

    public final void setMediationName$vungle_ads_release(String str) {
        this.mediationName = str;
    }

    public final void setPartialDownloadEnabled$vungle_ads_release(Boolean bool) {
        this.partialDownloadEnabled = bool;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        this.placementRefId = str;
    }

    public final void setVmVersion$vungle_ads_release(String str) {
        this.vmVersion = str;
    }

    public String toString() {
        return "LogEntry(placementRefId=" + this.placementRefId + ", creativeId=" + this.creativeId + ", eventId=" + this.eventId + ", adSource=" + this.adSource + ", mediationName=" + this.mediationName + ", vmVersion=" + this.vmVersion + ", partialDownloadEnabled=" + this.partialDownloadEnabled + ", adoEnabled=" + this.adoEnabled + ", adState=" + this.adState + " adPoddingEnabled=" + this.adPoddingEnabled + ", experiments=" + this.experiments + ", adLoadType=" + this.adLoadType + ", adapterAdFormat=" + this.adapterAdFormat + ')';
    }

    public int hashCode() {
        int iHashCode = ((((((((((hashCode(this.placementRefId) * 31) + hashCode(this.creativeId)) * 31) + hashCode(this.eventId)) * 31) + hashCode(this.adSource)) * 31) + hashCode(this.mediationName)) * 31) + hashCode(this.vmVersion)) * 31;
        Boolean bool = this.partialDownloadEnabled;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.adoEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        AdInternal.AdState adState = this.adState;
        int iHashCode4 = (iHashCode3 + (adState != null ? adState.hashCode() : 0)) * 31;
        Boolean bool3 = this.adPoddingEnabled;
        int iHashCode5 = (((iHashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31) + hashCode(this.experiments)) * 31;
        Long l10 = this.adLoadType;
        return ((iHashCode5 + (l10 != null ? l10.hashCode() : 0)) * 31) + hashCode(this.adapterAdFormat);
    }
}

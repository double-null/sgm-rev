package com.applovin.impl;

import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface g4 {
    h4 getAdEventTracker();

    String getOpenMeasurementContentUrl();

    String getOpenMeasurementCustomReferenceData();

    List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources();

    boolean isOpenMeasurementEnabled();
}

package com.vungle.ads.internal.locale;

import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SystemLocaleInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SystemLocaleInfo implements LocaleInfo {
    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getLanguage() {
        String language = Locale.getDefault().getLanguage();
        t.e(language, "getDefault().language");
        return language;
    }

    @Override // com.vungle.ads.internal.locale.LocaleInfo
    public String getTimeZoneId() {
        String id2 = TimeZone.getDefault().getID();
        t.e(id2, "getDefault().id");
        return id2;
    }
}

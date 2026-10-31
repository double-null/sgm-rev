package com.iab.omid.library.applovin.adsession;

import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.iab.omid.library.applovin.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public static Partner createPartner(String str, String str2) {
        g.a(str, "Name is null or empty");
        g.a(str2, sRGQSqxgxlS.OwGEjJyyVDO);
        return new Partner(str, str2);
    }
}

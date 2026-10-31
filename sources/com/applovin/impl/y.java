package com.applovin.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static y f9083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f9084f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f9085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9088d;

    private y(Context context) throws Throwable {
        Bundle bundle;
        int iIntValue;
        String str = null;
        str = null;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                bundle = applicationInfo.metaData;
                try {
                    String str2 = applicationInfo.processName;
                    this.f9085a = bundle;
                    this.f9088d = str2;
                } catch (PackageManager.NameNotFoundException e10) {
                    e = e10;
                    com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to get meta data.", e);
                    this.f9085a = bundle;
                    this.f9088d = null;
                }
            } catch (Throwable th) {
                th = th;
                this.f9085a = bundle;
                this.f9088d = str;
                throw th;
            }
        } catch (PackageManager.NameNotFoundException e11) {
            e = e11;
            bundle = null;
        } catch (Throwable th2) {
            th = th2;
            bundle = null;
            this.f9085a = bundle;
            this.f9088d = str;
            throw th;
        }
        str = null;
        boolean z10 = false;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            int eventType = xmlResourceParserOpenXmlResourceParser.getEventType();
            iIntValue = 0;
            boolean zBooleanValue = false;
            do {
                if (2 == eventType) {
                    try {
                        if (xmlResourceParserOpenXmlResourceParser.getName().equals("application")) {
                            for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                                String attributeName = xmlResourceParserOpenXmlResourceParser.getAttributeName(i10);
                                String attributeValue = xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10);
                                if (attributeName.equals("networkSecurityConfig")) {
                                    iIntValue = Integer.valueOf(attributeValue.substring(1)).intValue();
                                } else if (attributeName.equals("usesCleartextTraffic")) {
                                    zBooleanValue = Boolean.valueOf(attributeValue).booleanValue();
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = zBooleanValue;
                        try {
                            com.applovin.impl.sdk.p.c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                            return;
                        } finally {
                            this.f9086b = iIntValue;
                            this.f9087c = z10;
                        }
                    }
                }
                eventType = xmlResourceParserOpenXmlResourceParser.next();
            } while (eventType != 1);
            this.f9086b = iIntValue;
            this.f9087c = zBooleanValue;
        } catch (Throwable th4) {
            th = th4;
            iIntValue = 0;
        }
    }

    public static y a(Context context) {
        y yVar;
        synchronized (f9084f) {
            if (f9083e == null) {
                f9083e = new y(context);
            }
            yVar = f9083e;
        }
        return yVar;
    }

    public boolean a(String str) {
        Bundle bundle = this.f9085a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    public boolean a(String str, boolean z10) {
        Bundle bundle = this.f9085a;
        return bundle != null ? bundle.getBoolean(str, z10) : z10;
    }

    public String a() {
        return this.f9088d;
    }
}

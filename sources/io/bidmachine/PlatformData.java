package io.bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.XmlResourceParser;

/* JADX INFO: loaded from: classes4.dex */
public final class PlatformData {
    private static volatile PlatformData instance;
    private final Context context;
    final String kotlinVersion = getKotlinVersion();
    private Integer minSdkVersion;

    private PlatformData(Context context) {
        this.context = context.getApplicationContext();
    }

    public static PlatformData get(Context context) {
        PlatformData platformData = instance;
        if (platformData == null) {
            synchronized (PlatformData.class) {
                platformData = instance;
                if (platformData == null) {
                    platformData = new PlatformData(context);
                    instance = platformData;
                }
            }
        }
        return platformData;
    }

    private String getKotlinVersion() {
        try {
            return wc.i.f27761f.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private Integer getMinSdkVersionFromApplicationInfo(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo;
            if (applicationInfo != null) {
                return Integer.valueOf(applicationInfo.minSdkVersion);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private Integer getMinSdkVersionFromManifest(Context context) {
        Integer numValueOf = null;
        try {
            XmlResourceParser xmlResourceParserOpenXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
            try {
                for (int eventType = xmlResourceParserOpenXmlResourceParser.getEventType(); eventType != 1; eventType = xmlResourceParserOpenXmlResourceParser.next()) {
                    if (eventType == 2 && "uses-sdk".equals(xmlResourceParserOpenXmlResourceParser.getName())) {
                        for (int i10 = 0; i10 < xmlResourceParserOpenXmlResourceParser.getAttributeCount(); i10++) {
                            if ("minSdkVersion".equals(xmlResourceParserOpenXmlResourceParser.getAttributeName(i10))) {
                                numValueOf = Integer.valueOf(Integer.parseInt(xmlResourceParserOpenXmlResourceParser.getAttributeValue(i10)));
                                break;
                            }
                        }
                    }
                }
                xmlResourceParserOpenXmlResourceParser.close();
            } catch (Throwable th) {
                if (xmlResourceParserOpenXmlResourceParser != null) {
                    try {
                        xmlResourceParserOpenXmlResourceParser.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        return numValueOf;
    }

    Integer getMinSdkVersion() {
        Integer num = this.minSdkVersion;
        if (num != null) {
            return num;
        }
        Integer minSdkVersionFromApplicationInfo = getMinSdkVersionFromApplicationInfo(this.context);
        this.minSdkVersion = minSdkVersionFromApplicationInfo;
        if (minSdkVersionFromApplicationInfo == null) {
            this.minSdkVersion = getMinSdkVersionFromManifest(this.context);
        }
        return this.minSdkVersion;
    }
}

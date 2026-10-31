package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference f7114a = new AtomicReference();

    public static String a() {
        return "iabtechlab-Applovin";
    }

    public static URL b() {
        try {
            return new URL("https://compliance.iabtechnologylab.com/compliance-js/omid-validation-verification-script-v1-APPLOVIN-01102024.js");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c() {
        return "iabtechlab.com-omid";
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String a(com.applovin.impl.sdk.l lVar, Map map) {
        String str = (String) f7114a.get();
        if (StringUtils.isValidString(str)) {
            return str;
        }
        URL urlB = b();
        if (urlB == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStream inputStreamA = lVar.I().a(urlB.toString(), (List) null, false, map);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamA));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                        sb2.append("\n");
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
                bufferedReader.close();
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
            } catch (Throwable th4) {
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            lVar.Q().a("OpenMeasurementTestParameters", th5);
            lVar.E().a("OpenMeasurementTestParameters", "getTestValidationJavaScriptContent", th5);
        }
        String string = sb2.toString();
        f7114a.set(string);
        return string;
    }
}

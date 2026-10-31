package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ze.tmM.zKUlck;

/* JADX INFO: loaded from: classes2.dex */
public class DexLoadErrorReporter {
    private static final String LOGGING_URL = "https://www.facebook.com/adnw_logging/";
    public static final double SAMPLING = 0.1d;
    private static final AtomicBoolean sAlreadyReported = new AtomicBoolean();

    public static void reportDexLoadingIssue(final Context context, final String str, double d10) {
        AtomicBoolean atomicBoolean = sAlreadyReported;
        if (atomicBoolean.get() || Math.random() >= d10) {
            return;
        }
        atomicBoolean.set(true);
        new Thread() { // from class: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.1
            /* JADX WARN: Code duplicated, block: B:61:0x016b A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:73:0x0176 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DataOutputStream dataOutputStream;
                InputStream inputStream;
                HttpURLConnection httpURLConnection;
                super.run();
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(DexLoadErrorReporter.LOGGING_URL).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection2.setRequestProperty("Accept", "application/json");
                        httpURLConnection2.setRequestProperty(zKUlck.tdgsAyXCpDGopj, Constants.ENCODING);
                        httpURLConnection2.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.connect();
                        String string = UUID.randomUUID().toString();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("attempt", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        DexLoadErrorReporter.addEnvFields(context, jSONObject, string);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("subtype", "generic");
                        jSONObject2.put("subtype_code", "1320");
                        jSONObject2.put("caught_exception", AppEventsConstants.EVENT_PARAM_VALUE_YES);
                        jSONObject2.put("stacktrace", str);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("id", UUID.randomUUID().toString());
                        jSONObject3.put("type", "debug");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("");
                        httpURLConnection = httpURLConnection2;
                        try {
                            sb2.append(System.currentTimeMillis() / 1000);
                            jSONObject3.put("session_time", sb2.toString());
                            jSONObject3.put("time", "" + (System.currentTimeMillis() / 1000));
                            jSONObject3.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, string);
                            jSONObject3.put("data", jSONObject2);
                            jSONObject3.put("attempt", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                            DexLoadErrorReporter.addEnvFields(context, jSONObject2, string);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("data", jSONObject);
                            jSONObject4.put("events", jSONArray);
                            String string2 = jSONObject4.toString();
                            DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                            try {
                                dataOutputStream2.writeBytes("payload=" + URLEncoder.encode(string2, Constants.ENCODING));
                                dataOutputStream2.flush();
                                byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                while (true) {
                                    try {
                                        int i10 = inputStream2.read(bArr);
                                        if (i10 == -1) {
                                            break;
                                        } else {
                                            byteArrayOutputStream.write(bArr, 0, i10);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        inputStream = inputStream2;
                                        dataOutputStream = dataOutputStream2;
                                        try {
                                            Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                                        } finally {
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.close();
                                                } catch (Exception e10) {
                                                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e10);
                                                }
                                            }
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e11) {
                                                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e11);
                                                }
                                            }
                                            if (httpURLConnection != null) {
                                                httpURLConnection.disconnect();
                                            }
                                        }
                                    }
                                }
                                byteArrayOutputStream.flush();
                                try {
                                    dataOutputStream2.close();
                                } catch (Exception e12) {
                                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e12);
                                }
                                try {
                                    inputStream2.close();
                                } catch (Exception e13) {
                                    Log.e(AudienceNetworkAds.TAG, "Can't close connection.", e13);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream = dataOutputStream2;
                                inputStream = null;
                                Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream = null;
                            inputStream = null;
                            Log.e(AudienceNetworkAds.TAG, "Can't send error.", th);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream = null;
                    inputStream = null;
                    httpURLConnection = null;
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addEnvFields(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put(vgmm.TfmUvRwn, context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }
}

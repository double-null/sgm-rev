package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeim implements zzfok {
    protected final Context zza;
    protected final String zzb;
    private final String zzc;

    public zzeim(Context context, String str, zzcbl zzcblVar, int i10, String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzeil zza(zzeik zzeikVar) throws zzeed {
        return zzc(zzeikVar.zza, zzeikVar.zzb, zzeikVar.zzc, zzeikVar.zzd, zzeikVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    protected final zzeil zzc(String str, int i10, Map map, byte[] bArr, String str2, long j10) throws MalformedURLException, zzeed {
        HttpURLConnection httpURLConnection;
        URL url;
        try {
            zzeil zzeilVar = new zzeil();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdi)).booleanValue() && com.google.android.gms.ads.internal.client.zzay.zze()) {
                zzeilVar.zza = 410;
            } else {
                String str3 = this.zzb;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 13);
                sb2.append("SDK version: ");
                sb2.append(str3);
                String string = sb2.toString();
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
                sb3.append("AdRequestServiceImpl: Sending request: ");
                sb3.append(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb3.toString());
                URL url2 = new URL(str);
                HashMap map2 = new HashMap();
                int i12 = 0;
                while (true) {
                    int i13 = zzfzr.zzb;
                    httpURLConnection = (HttpURLConnection) url2.openConnection();
                    String str4 = this.zzc;
                    if (str4 != null) {
                        httpURLConnection.setRequestMethod(str4);
                    }
                    try {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zza, str3, false, httpURLConnection, false, i10);
                            for (Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty("Content-Type", str2);
                            }
                            Closeable closeable = null;
                            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                            try {
                                zzlVar.zza(httpURLConnection, bArr);
                            } catch (Throwable th) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Network request logging failed.", th);
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "HttpRequestFunction.logAdRequest");
                            }
                            int length = bArr.length;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        bufferedOutputStream.write(bArr);
                                        IOUtils.closeQuietly(bufferedOutputStream);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        closeable = bufferedOutputStream;
                                        IOUtils.closeQuietly(closeable);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                String key = entry2.getKey();
                                List<String> value = entry2.getValue();
                                if (map2.containsKey(key)) {
                                    ((List) map2.get(key)).addAll(value);
                                } else {
                                    map2.put(key, new ArrayList(value));
                                }
                            }
                            zzlVar.zzc(httpURLConnection, responseCode);
                            zzeilVar.zza = responseCode;
                            zzeilVar.zzb = map2;
                            zzeilVar.zzc = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        StringBuilder sb4 = new StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int i14 = inputStreamReader.read(cArr);
                                            if (i14 == -1) {
                                                break;
                                            }
                                            sb4.append(cArr, 0, i14);
                                        }
                                        String string2 = sb4.toString();
                                        IOUtils.closeQuietly(inputStreamReader);
                                        zzlVar.zze(string2);
                                        zzeilVar.zzc = string2;
                                        if (TextUtils.isEmpty(string2)) {
                                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgA)).booleanValue()) {
                                                throw new zzeed(3);
                                            }
                                        }
                                        zzeilVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j10;
                                        break;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        closeable = inputStreamReader;
                                        IOUtils.closeQuietly(closeable);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                    sb5.append("Received error HTTP response code: ");
                                    sb5.append(responseCode);
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb5.toString());
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(responseCode).length() + 35);
                                    sb6.append("Received error HTTP response code: ");
                                    sb6.append(responseCode);
                                    throw new zzeed(1, sb6.toString());
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("No location header to follow redirect.");
                                    throw new zzeed(1, "No location header to follow redirect");
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziW)).booleanValue()) {
                                    try {
                                        url = new URI(headerField).toURL();
                                    } catch (URISyntaxException e10) {
                                        throw new zzeed(1, e10.getMessage(), e10);
                                    }
                                } else {
                                    url = new URL(headerField);
                                }
                                int i15 = i12 + 1;
                                if (i15 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgj)).intValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Too many redirects.");
                                    throw new zzeed(1, "Too many redirects");
                                }
                                httpURLConnection.disconnect();
                                i12 = i15;
                                url2 = url;
                            }
                        } catch (Throwable th6) {
                            httpURLConnection.disconnect();
                            throw th6;
                        }
                    } catch (zzeed e11) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjC)).booleanValue()) {
                            throw e11;
                        }
                        zzeilVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j10;
                    }
                }
                httpURLConnection.disconnect();
            }
            return zzeilVar;
        } catch (IOException e12) {
            String strValueOf = String.valueOf(e12.getMessage());
            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            throw new zzeed(1, strConcat, e12);
        }
    }
}

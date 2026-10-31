package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzln implements Runnable {
    final /* synthetic */ zzlo zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzll zzd;
    private final String zze;
    private final Map zzf;

    public zzln(zzlo zzloVar, String str, URL url, byte[] bArr, Map map, zzll zzllVar) {
        Objects.requireNonNull(zzloVar);
        this.zza = zzloVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzllVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzllVar;
        this.zze = str;
        this.zzf = map;
    }

    private final void zzb(final int i10, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzu.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(i10, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:81:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzln] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        ?? r10;
        ?? r11;
        OutputStream outputStream3;
        OutputStream outputStream4;
        ?? r12;
        OutputStream outputStream5;
        ?? r13;
        OutputStream outputStream6;
        InputStream inputStream;
        zzlo zzloVar = this.zza;
        zzloVar.zzaY();
        int i10 = 0;
        try {
            URL url = this.zzb;
            int i11 = com.google.android.gms.internal.measurement.zzch.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzic zzicVar = zzloVar.zzu;
            zzicVar.zzc();
            httpURLConnection.setConnectTimeout(60000);
            zzicVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            ?? r14 = 1;
            httpURLConnection.setDoInput(true);
            try {
                try {
                    Map map = this.zzf;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    byte[] bArr = this.zzc;
                    if (bArr != null) {
                        try {
                            zzicVar.zzaV();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            zzgs zzgsVarZzk = this.zza.zzu.zzaW().zzk();
                            int length = byteArray.length;
                            zzgsVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            httpURLConnection.connect();
                            OutputStream outputStream7 = httpURLConnection.getOutputStream();
                            try {
                                outputStream7.write(byteArray);
                                outputStream7.close();
                                r14 = outputStream7;
                            } catch (IOException e10) {
                                e = e10;
                                r11 = 0;
                                outputStream4 = outputStream7;
                                if (outputStream4 != null) {
                                    try {
                                        outputStream4.close();
                                    } catch (IOException e11) {
                                        this.zza.zzu.zzaW().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i10, e, null, r11);
                            } catch (Throwable th) {
                                th = th;
                                r10 = 0;
                                outputStream3 = outputStream7;
                                if (outputStream3 != null) {
                                    try {
                                        outputStream3.close();
                                    } catch (IOException e12) {
                                        this.zza.zzu.zzaW().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e12);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                zzb(i10, null, null, r10);
                                throw th;
                            }
                        } catch (IOException e13) {
                            this.zza.zzu.zzaW().zzb().zzb("Failed to gzip post request content", e13);
                            throw e13;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i12 = inputStream.read(bArr2);
                                        if (i12 <= 0) {
                                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            zzb(responseCode, null, byteArray2, headerFields);
                                            return;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, i12);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            outputStream6 = null;
                            r13 = 0;
                            IOException iOException = e;
                            i10 = responseCode;
                            e = iOException;
                            outputStream4 = outputStream6;
                            r11 = r13;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i10, e, null, r11);
                        } catch (Throwable th4) {
                            th = th4;
                            outputStream5 = null;
                            r12 = 0;
                            Throwable th5 = th;
                            i10 = responseCode;
                            th = th5;
                            outputStream3 = outputStream5;
                            r10 = r12;
                            if (outputStream3 != null) {
                                outputStream3.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            zzb(i10, null, null, r10);
                            throw th;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        r13 = r14;
                        outputStream6 = null;
                        IOException iOException2 = e;
                        i10 = responseCode;
                        e = iOException2;
                        outputStream4 = outputStream6;
                        r11 = r13;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i10, e, null, r11);
                    } catch (Throwable th6) {
                        th = th6;
                        r12 = r14;
                        outputStream5 = null;
                        Throwable th7 = th;
                        i10 = responseCode;
                        th = th7;
                        outputStream3 = outputStream5;
                        r10 = r12;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(i10, null, null, r10);
                        throw th;
                    }
                } catch (IOException e16) {
                    e = e16;
                    outputStream2 = null;
                    r11 = outputStream2;
                    outputStream4 = outputStream2;
                    if (outputStream4 != null) {
                        outputStream4.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(i10, e, null, r11);
                }
            } catch (Throwable th8) {
                th = th8;
                outputStream = null;
                r10 = outputStream;
                outputStream3 = outputStream;
                if (outputStream3 != null) {
                    outputStream3.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(i10, null, null, r10);
                throw th;
            }
        } catch (IOException e17) {
            e = e17;
            httpURLConnection = null;
            outputStream2 = null;
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            outputStream = null;
        }
    }

    final /* synthetic */ void zza(int i10, Exception exc, byte[] bArr, Map map) {
        this.zzd.zza(this.zze, i10, exc, bArr, map);
    }
}

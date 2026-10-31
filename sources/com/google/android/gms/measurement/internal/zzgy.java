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

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgy implements Runnable {
    final /* synthetic */ zzgz zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzgw zzd;
    private final String zze;
    private final Map zzf;

    public zzgy(zzgz zzgzVar, String str, URL url, byte[] bArr, Map map, zzgw zzgwVar) {
        Objects.requireNonNull(zzgzVar);
        this.zza = zzgzVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgwVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzgwVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:76:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f2: MOVE (r8 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:243), block:B:42:0x00f1 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f6: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:247), block:B:44:0x00f5 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        zzgx zzgxVar;
        zzhz zzhzVarZzaX;
        Map map3;
        Map map4;
        InputStream inputStream;
        zzgz zzgzVar = this.zza;
        zzgzVar.zzaY();
        OutputStream outputStream = null;
        try {
            URL url = this.zzb;
            int i11 = com.google.android.gms.internal.measurement.zzch.zzb;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzic zzicVar = zzgzVar.zzu;
            zzicVar.zzc();
            httpURLConnection.setConnectTimeout(60000);
            zzicVar.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.zzf;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.zzc;
                if (bArr != null) {
                    byte[] bArrZzv = zzgzVar.zzg.zzp().zzv(bArr);
                    zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
                    int length = bArrZzv.length;
                    zzgsVarZzk.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrZzv);
                        outputStream2.close();
                    } catch (IOException e10) {
                        iOException = e10;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e11) {
                                this.zza.zzu.zzaW().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e11);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzgz zzgzVar2 = this.zza;
                        String str = this.zze;
                        zzgw zzgwVar = this.zzd;
                        zzhzVarZzaX = zzgzVar2.zzu.zzaX();
                        zzgxVar = new zzgx(str, zzgwVar, responseCode, iOException, null, map2, null);
                        zzhzVarZzaX.zzj(zzgxVar);
                    } catch (Throwable th) {
                        th = th;
                        map = null;
                        outputStream = outputStream2;
                        i10 = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e12) {
                                this.zza.zzu.zzaW().zzb().zzc("Error closing HTTP compressed POST connection output stream. appId", zzgu.zzl(this.zze), e12);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaX().zzj(new zzgx(this.zze, this.zzd, i10, null, null, map, null));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i12 = inputStream.read(bArr2);
                                    if (i12 <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, i12);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                zzgz zzgzVar3 = this.zza;
                                String str2 = this.zze;
                                zzgw zzgwVar2 = this.zzd;
                                zzhzVarZzaX = zzgzVar3.zzu.zzaX();
                                zzgxVar = new zzgx(str2, zzgwVar2, responseCode, null, byteArray, headerFields, null);
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
                    } catch (IOException e13) {
                        e = e13;
                        map2 = map4;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzgz zzgzVar4 = this.zza;
                        String str3 = this.zze;
                        zzgw zzgwVar3 = this.zzd;
                        zzhzVarZzaX = zzgzVar4.zzu.zzaX();
                        zzgxVar = new zzgx(str3, zzgwVar3, responseCode, iOException, null, map2, null);
                    } catch (Throwable th4) {
                        th = th4;
                        i10 = responseCode;
                        map = map3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzu.zzaX().zzj(new zzgx(this.zze, this.zzd, i10, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e14) {
                    e = e14;
                    map2 = null;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzgz zzgzVar5 = this.zza;
                    String str4 = this.zze;
                    zzgw zzgwVar4 = this.zzd;
                    zzhzVarZzaX = zzgzVar5.zzu.zzaX();
                    zzgxVar = new zzgx(str4, zzgwVar4, responseCode, iOException, null, map2, null);
                } catch (Throwable th5) {
                    th = th5;
                    i10 = responseCode;
                    map = null;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzu.zzaX().zzj(new zzgx(this.zze, this.zzd, i10, null, null, map, null));
                    throw th;
                }
            } catch (IOException e15) {
                iOException = e15;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th6) {
                th = th6;
                i10 = 0;
            }
            zzhzVarZzaX.zzj(zzgxVar);
        } catch (IOException e16) {
            iOException = e16;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th7) {
            th = th7;
            i10 = 0;
            httpURLConnection = null;
            map = null;
        }
    }
}

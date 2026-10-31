package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgek implements zzgee {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgek(ExecutorService executorService, String str, long j10) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j10;
    }

    private final ListenableFuture zze(final String str, final boolean z10, final byte[] bArr, final String str2) {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0027c() { // from class: com.google.android.gms.internal.ads.zzgeh
            @Override // androidx.concurrent.futures.c.InterfaceC0027c
            public final /* synthetic */ Object attachCompleter(androidx.concurrent.futures.c.a aVar) {
                return this.zza.zzc(str, z10, str2, bArr, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzd(String str, androidx.concurrent.futures.c.a aVar, boolean z10, String str2, byte[] bArr) {
        Throwable th;
        SocketTimeoutException e10;
        final HttpURLConnection httpURLConnection;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
                try {
                    Objects.requireNonNull(httpURLConnection);
                    aVar.a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgei
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            httpURLConnection.disconnect();
                        }
                    }, this.zza);
                    httpURLConnection.setRequestProperty("User-Agent", this.zzb);
                    int i10 = (int) this.zzc;
                    httpURLConnection.setConnectTimeout(i10);
                    httpURLConnection.setReadTimeout(i10);
                    if (z10) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        if (str2 != null) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            if (inputStream == null) {
                                byteArray = new byte[0];
                                byteArrayOutputStream.close();
                            } else {
                                byte[] bArr2 = new byte[4096];
                                while (true) {
                                    int i11 = inputStream.read(bArr2);
                                    if (i11 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, i11);
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                inputStream.close();
                            }
                            aVar.c(new zzgej(responseCode, byteArray));
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (SocketTimeoutException e11) {
                    e10 = e11;
                    httpURLConnection2 = httpURLConnection;
                    String message = e10.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 9);
                    sb2.append("Timeout: ");
                    sb2.append(message);
                    aVar.f(new TimeoutException(sb2.toString()));
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th8) {
                    th = th8;
                    httpURLConnection2 = httpURLConnection;
                    aVar.f(th);
                    httpURLConnection = httpURLConnection2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            } catch (Throwable th9) {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th9;
            }
        } catch (SocketTimeoutException e12) {
            e10 = e12;
        } catch (Throwable th10) {
            th = th10;
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final ListenableFuture zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final ListenableFuture zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, "application/x-protobuf");
    }

    final /* synthetic */ Object zzc(final String str, final boolean z10, final String str2, final byte[] bArr, final androidx.concurrent.futures.c.a aVar) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgeg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(str, aVar, z10, str2, bArr);
            }
        });
        return "";
    }
}

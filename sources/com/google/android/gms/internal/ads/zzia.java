package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzia extends zzhh implements zzii {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzih zze;
    private final zzih zzf;
    private zzht zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzia(String str, int i10, int i11, boolean z10, boolean z11, zzih zzihVar, zzgtk zzgtkVar, boolean z12, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zza = z10;
        this.zze = zzihVar;
        this.zzf = new zzih();
    }

    private final URL zzl(URL url, String str, zzht zzhtVar) throws zzie {
        if (str == null) {
            throw new zzie("Null location redirect", zzhtVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzie("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhtVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 40 + protocol.length() + 1);
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new zzie(sb2.toString(), zzhtVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new zzie(e10, zzhtVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzeg.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzie {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            if (j10 != -1) {
                long j11 = j10 - this.zzm;
                if (j11 != 0) {
                    i11 = (int) Math.min(i11, j11);
                    InputStream inputStream = this.zzi;
                    String str = zzfl.zza;
                    i12 = inputStream.read(bArr, i10, i11);
                    if (i12 == -1) {
                        this.zzm += (long) i12;
                        zzh(i12);
                        return i12;
                    }
                }
            } else {
                InputStream inputStream2 = this.zzi;
                String str2 = zzfl.zza;
                i12 = inputStream2.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.zzm += (long) i12;
                    zzh(i12);
                    return i12;
                }
            }
            return -1;
        } catch (IOException e10) {
            zzht zzhtVar = this.zzg;
            String str3 = zzfl.zza;
            throw zzie.zza(e10, zzhtVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(zzht zzhtVar) throws zzie {
        int i10;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j10;
        this.zzg = zzhtVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzf(zzhtVar);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            URL url = new URL(zzhtVar.zza.toString());
            long j11 = zzhtVar.zze;
            long j12 = zzhtVar.zzf;
            boolean zZza = zzhtVar.zza(1);
            try {
                if (this.zza) {
                    URL urlZzl = url;
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        if (i11 > 20) {
                            i10 = 1;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 20);
                            sb2.append("Too many redirects: ");
                            sb2.append(i12);
                            throw new zzie(new NoRouteToHostException(sb2.toString()), zzhtVar, 2001, 1);
                        }
                        long j13 = j12;
                        long j14 = j11;
                        URL url2 = urlZzl;
                        HttpURLConnection httpURLConnectionZzk2 = zzk(urlZzl, 1, null, j11, j12, zZza, false, zzhtVar.zzd);
                        int responseCode = httpURLConnectionZzk2.getResponseCode();
                        String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionZzk = httpURLConnectionZzk2;
                            break;
                        }
                        i10 = 1;
                        try {
                            httpURLConnectionZzk2.disconnect();
                            urlZzl = zzl(url2, headerField, zzhtVar);
                            i11 = i12;
                            j12 = j13;
                            j11 = j14;
                        } catch (IOException e10) {
                            e = e10;
                        }
                        e = e10;
                        zzm();
                        throw zzie.zza(e, zzhtVar, i10);
                    }
                }
                httpURLConnectionZzk = zzk(url, 1, null, j11, j12, zZza, true, zzhtVar.zzd);
                this.zzh = httpURLConnectionZzk;
                this.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i13 = this.zzk;
                if (i13 < 200 || i13 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (this.zzk == 416) {
                        if (zzhtVar.zze == zzij.zza(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            this.zzj = true;
                            zzg(zzhtVar);
                            long j15 = zzhtVar.zzf;
                            if (j15 != -1) {
                                return j15;
                            }
                            return 0L;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgzm.zza(errorStream) : zzfl.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzfl.zzb;
                    }
                    byte[] bArr = bArrZza;
                    zzm();
                    throw new zzig(this.zzk, responseMessage, this.zzk == 416 ? new zzhq(2008) : null, headerFields, zzhtVar, bArr);
                }
                httpURLConnectionZzk.getContentType();
                if (this.zzk == 200) {
                    j10 = zzhtVar.zze;
                    if (j10 == 0) {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    this.zzl = zzhtVar.zzf;
                } else {
                    long j16 = zzhtVar.zzf;
                    if (j16 != -1) {
                        this.zzl = j16;
                    } else {
                        long jZzb = zzij.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                        this.zzl = jZzb != -1 ? jZzb - j10 : -1L;
                    }
                }
                try {
                    this.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.zzi = new GZIPInputStream(this.zzi);
                    }
                    this.zzj = true;
                    zzg(zzhtVar);
                    if (j10 != 0) {
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (j10 > 0) {
                                int iMin = (int) Math.min(j10, 4096L);
                                InputStream inputStream = this.zzi;
                                String str = zzfl.zza;
                                int i14 = inputStream.read(bArr2, 0, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzie(new InterruptedIOException(), zzhtVar, 2000, 1);
                                }
                                if (i14 == -1) {
                                    throw new zzie(zzhtVar, 2008, 1);
                                }
                                j10 -= (long) i14;
                                zzh(i14);
                            }
                        } catch (IOException e11) {
                            zzm();
                            if (e11 instanceof zzie) {
                                throw ((zzie) e11);
                            }
                            throw new zzie(e11, zzhtVar, 2000, 1);
                        }
                    }
                    return this.zzl;
                } catch (IOException e12) {
                    zzm();
                    throw new zzie(e12, zzhtVar, 2000, 1);
                }
            } catch (IOException e13) {
                e = e13;
                i10 = 1;
            }
        } catch (IOException e14) {
            e = e14;
            i10 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzht zzhtVar = this.zzg;
        if (zzhtVar != null) {
            return zzhtVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws zzie {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    zzht zzhtVar = this.zzg;
                    String str = zzfl.zza;
                    throw new zzie(e10, zzhtVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzii
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgwp.zza() : new zzhz(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    private final HttpURLConnection zzk(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        StringBuilder sb2;
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 == 0) {
            if (j11 == -1) {
                string = null;
            } else {
                j10 = 0;
                sb2 = new StringBuilder();
                sb2.append(WKirgUEJJ.JZxJqVsvXx);
                sb2.append(j10);
                sb2.append("-");
                if (j11 != -1) {
                    sb2.append((j10 + j11) - 1);
                }
                string = sb2.toString();
            }
        } else {
            sb2 = new StringBuilder();
            sb2.append(WKirgUEJJ.JZxJqVsvXx);
            sb2.append(j10);
            sb2.append("-");
            if (j11 != -1) {
                sb2.append((j10 + j11) - 1);
            }
            string = sb2.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        if (true != z10) {
            str = "identity";
        } else {
            str = "gzip";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        int i11 = zzht.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }
}

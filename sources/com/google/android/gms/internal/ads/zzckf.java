package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzckf extends zzhh implements zzii {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzih zze;
    private zzht zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    zzckf(String str, zzin zzinVar, int i10, int i11, long j10, long j11) {
        super(true);
        zzdg.zza(str);
        this.zzd = str;
        this.zze = new zzih();
        this.zzb = i10;
        this.zzc = i11;
        this.zzh = new ArrayDeque();
        this.zzq = j10;
        this.zzr = j11;
        if (zzinVar != null) {
            zze(zzinVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzie {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzl;
            long j11 = this.zzm;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.zzn + j11;
            long j13 = i11;
            long j14 = this.zzr;
            long j15 = j12 + j13 + j14;
            long j16 = this.zzp;
            long j17 = j16 + 1;
            if (j15 > j17) {
                long j18 = this.zzo;
                if (j16 < j18) {
                    long jMin = Math.min(j18, Math.max(((this.zzq + j17) - j14) - 1, (-1) + j17 + j13));
                    zzk(j17, jMin, 2);
                    this.zzp = jMin;
                    j16 = jMin;
                }
            }
            int i12 = this.zzi.read(bArr, i10, (int) Math.min(j13, ((j16 + 1) - this.zzn) - this.zzm));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i12;
            zzh(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzie(e10, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(zzht zzhtVar) throws zzie {
        this.zzf = zzhtVar;
        this.zzm = 0L;
        long j10 = zzhtVar.zze;
        long j11 = zzhtVar.zzf;
        long jMin = j11 == -1 ? this.zzq : Math.min(this.zzq, j11);
        this.zzn = j10;
        HttpURLConnection httpURLConnectionZzk = zzk(j10, (jMin + j10) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = zzhtVar.zzf;
                    if (j14 != -1) {
                        this.zzl = j14;
                        this.zzo = Math.max(j12, (this.zzn + j14) - 1);
                    } else {
                        this.zzl = j13 - this.zzn;
                        this.zzo = j13 - 1;
                    }
                    this.zzp = j12;
                    this.zzj = true;
                    zzg(zzhtVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb2.append("Unexpected Content-Range [");
                    sb2.append(headerField);
                    sb2.append("]");
                    String string = sb2.toString();
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
                }
            }
        }
        throw new zzckd(headerField, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws zzie {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzie(e10, this.zzf, 2000, 3);
                }
            }
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        } catch (Throwable th) {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzii
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final HttpURLConnection zzk(long j10, long j11, int i10) throws zzie {
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 7 + String.valueOf(j11).length());
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            sb2.append(j11);
            httpURLConnection.setRequestProperty("Range", sb2.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcke(this.zzk, headerFields, this.zzf, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    zzl();
                    throw new zzie(e10, this.zzf, 2000, i10);
                }
            } catch (IOException e11) {
                zzl();
                String strValueOf = String.valueOf(string2);
                throw new zzie("Unable to connect to ".concat(strValueOf), e11, this.zzf, 2000, i10);
            }
        } catch (IOException e12) {
            String strValueOf2 = String.valueOf(string);
            throw new zzie("Unable to connect to ".concat(strValueOf2), e12, this.zzf, 2000, i10);
        }
    }
}

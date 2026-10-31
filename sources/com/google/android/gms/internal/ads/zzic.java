package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzic extends zzhh {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzic() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzib {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzc;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzfl.zza;
            int i12 = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (i12 > 0) {
                this.zzc -= (long) i12;
                zzh(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new zzib(e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(zzht zzhtVar) throws zzib {
        Uri uri = zzhtVar.zza;
        this.zzb = uri;
        zzf(zzhtVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j10 = zzhtVar.zze;
                randomAccessFile.seek(j10);
                long length = zzhtVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j10;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzib(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhtVar);
                return this.zzc;
            } catch (IOException e10) {
                throw new zzib(e10, 2000);
            }
        } catch (FileNotFoundException e11) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzib(e11, ((e11.getCause() instanceof ErrnoException) && ((ErrnoException) e11.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzib(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e11, 1004);
        } catch (SecurityException e12) {
            throw new zzib(e12, 2006);
        } catch (RuntimeException e13) {
            throw new zzib(e13, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final Uri zzc() {
        return this.zzb;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.google.android.gms.internal.ads.zzhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd() throws com.google.android.gms.internal.ads.zzib {
        /*
            r5 = this;
            r0 = 0
            r5.zzb = r0
            r1 = 0
            java.io.RandomAccessFile r2 = r5.zza     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        Lb:
            r5.zza = r0
            boolean r0 = r5.zzd
            if (r0 == 0) goto L16
            r5.zzd = r1
            r5.zzi()
        L16:
            return
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzib r3 = new com.google.android.gms.internal.ads.zzib     // Catch: java.lang.Throwable -> L17
            r4 = 2000(0x7d0, float:2.803E-42)
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L17
            throw r3     // Catch: java.lang.Throwable -> L17
        L22:
            r5.zza = r0
            boolean r0 = r5.zzd
            if (r0 != 0) goto L29
            goto L2e
        L29:
            r5.zzd = r1
            r5.zzi()
        L2e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzic.zzd():void");
    }
}

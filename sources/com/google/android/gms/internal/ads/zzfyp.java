package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfyp {
    private final zzbeb zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfyp(zzbeb zzbebVar, File file, File file2, File file3) {
        this.zza = zzbebVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzbeb zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    public final byte[] zzd() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzA;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzida zzidaVar = zzida.zza;
                    ArrayList arrayList = new ArrayList();
                    int iMin = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i10 = 0;
                        while (i10 < iMin) {
                            int i11 = fileInputStream.read(bArr, i10, iMin - i10);
                            if (i11 == -1) {
                                break;
                            }
                            i10 += i11;
                        }
                        zzida zzidaVarZzt = i10 == 0 ? null : zzida.zzt(bArr, 0, i10);
                        if (zzidaVarZzt == null) {
                            break;
                        }
                        arrayList.add(zzidaVarZzt);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrZzA = zzida.zzy(arrayList).zzA();
                    IOUtils.closeQuietly(fileInputStream);
                } catch (IOException unused) {
                    IOUtils.closeQuietly(fileInputStream);
                    bArrZzA = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    IOUtils.closeQuietly(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzA;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean zze(long j10) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }
}

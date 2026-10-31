package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgha {
    private MessageDigest zza;
    private final zzgqh zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzgha(zzgqh zzgqhVar) {
        this.zzb = zzgqhVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    final synchronized void zzb(SecureRandom secureRandom) {
        zzgqf zzgqfVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgqfVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th) {
                    zzgqfVarZza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e10) {
                zzgqfVarZza.zzb(e10);
            }
            zzgqfVarZza.zzc();
        } catch (Throwable th2) {
            zzgqfVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    final byte[] zzd(byte[] bArr, String str, boolean z10) {
        int length = bArr.length;
        int i10 = true != z10 ? 255 : 239;
        zzgtj.zza(length <= i10);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i10 + 1).put((byte) length);
        if (length < i10) {
            int i11 = i10 - length;
            byte[] bArr2 = new byte[i11];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i11);
            System.arraycopy(bArr2, 0, bArr, length, i11);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z10) {
            bArrArray = ByteBuffer.allocate(UserVerificationMethods.USER_VERIFY_HANDPRINT).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        zzghd[] zzghdVarArr = new zzghq().zzcK;
        int length2 = zzghdVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzghdVarArr[i12].zza(bArrArray, bArr3);
        }
        if (!zzgua.zzc(str)) {
            new zzghc(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzaze zzf(byte[] bArr, String str) {
        zzaze zzazeVarZza = zzazf.zza();
        byte[] bArrZze = zze(bArr);
        zzida zzidaVar = zzida.zza;
        zzazeVarZza.zzb(zzida.zzt(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            int length = bArr.length;
            if (i10 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i11 = i10 * 255;
            int i12 = i11 + 255;
            if (length > i12) {
                length = i12;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i11, length));
            i10++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzazeVarZza.zza(zzida.zzt(zzd((byte[]) it.next(), str, false), 0, UserVerificationMethods.USER_VERIFY_HANDPRINT));
        }
        return zzazeVarZza;
    }

    public final String zzg(int i10, String str) {
        zzaxm zzaxmVarZzj = zzaym.zzj();
        zzaxmVarZzj.zzl(i10);
        return Base64.encodeToString(zzd(((zzaym) zzaxmVarZzj.zzbu()).zzaN(), str, true), 11);
    }
}

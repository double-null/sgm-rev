package com.google.android.gms.internal.ads;

import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaka {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzakj zzc = new zzakj();
    private zzakb zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzafz zzafzVar, int i10) throws IOException {
        byte[] bArr = this.zza;
        zzafzVar.zzc(bArr, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }

    public final void zza(zzakb zzakbVar) {
        this.zzd = zzakbVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zza();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8 A[LOOP:0: B:3:0x0005->B:36:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d A[LOOP:2: B:60:0x0135->B:63:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0170  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x013f A[SYNTHETIC] */
    public final boolean zzc(zzafz zzafzVar) throws IOException {
        int i10;
        zzakh zzakhVar;
        long j10;
        long j11;
        int i11;
        byte[] bArr;
        String str;
        int i12;
        long j12;
        int i13;
        long jZzd;
        double dLongBitsToDouble;
        int iZzd;
        int iZze;
        this.zzd.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.zzb;
            zzajz zzajzVar = (zzajz) arrayDeque.peek();
            if (zzajzVar != null && zzafzVar.zzn() >= zzajzVar.zzb()) {
                ((zzakc) this.zzd).zza.zzi(((zzajz) arrayDeque.pop()).zza());
                return true;
            }
            int i14 = this.zze;
            if (i14 != 0) {
                if (i14 == 1) {
                }
                zzakb zzakbVar = this.zzd;
                i10 = this.zzf;
                zzakhVar = ((zzakc) zzakbVar).zza;
                switch (i10) {
                    case MRAID_JS_WRITE_FAILED_VALUE:
                    case PRIVACY_URL_ERROR_VALUE:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case AD_RESPONSE_EMPTY_VALUE:
                    case 231:
                    case 238:
                    case 240:
                    case 241:
                    case 247:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21938:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        j10 = this.zzg;
                        if (j10 <= 8) {
                            zzakhVar.zzj(i10, zzd(zzafzVar, (int) j10));
                            this.zze = 0;
                            return true;
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 22);
                        sb2.append("Invalid integer size: ");
                        sb2.append(j10);
                        throw zzat.zzb(sb2.toString(), null);
                    case STORE_REGION_CODE_ERROR_VALUE:
                    case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                    case 21358:
                    case 2274716:
                        j11 = this.zzg;
                        if (j11 <= 2147483647L) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 21);
                            sb3.append("String element size: ");
                            sb3.append(j11);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        i11 = (int) j11;
                        if (i11 == 0) {
                            str = "";
                        } else {
                            bArr = new byte[i11];
                            zzafzVar.zzc(bArr, 0, i11);
                            while (i11 > 0) {
                                i12 = i11 - 1;
                                if (bArr[i12] == 0) {
                                    i11 = i12;
                                } else {
                                    str = new String(bArr, 0, i11);
                                }
                            }
                            str = new String(bArr, 0, i11);
                        }
                        zzakhVar.zzl(i10, str);
                        this.zze = 0;
                        return true;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE:
                    case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        long jZzn = zzafzVar.zzn();
                        arrayDeque.push(new zzajz(i10, this.zzg + jZzn, null));
                        ((zzakc) this.zzd).zza.zzh(this.zzf, jZzn, this.zzg);
                        this.zze = 0;
                        return true;
                    case 161:
                    case 163:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        zzakhVar.zzm(i10, (int) this.zzg, zzafzVar);
                        this.zze = 0;
                        return true;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        j12 = this.zzg;
                        if (j12 == 4 && j12 != 8) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(j12).length() + 20);
                            sb4.append("Invalid float size: ");
                            sb4.append(j12);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        i13 = (int) j12;
                        jZzd = zzd(zzafzVar, i13);
                        if (i13 == 4) {
                            dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                        } else {
                            dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                        }
                        zzakhVar.zzk(i10, dLongBitsToDouble);
                        this.zze = 0;
                        return true;
                    default:
                        zzafzVar.zzf((int) this.zzg);
                        this.zze = 0;
                        break;
                }
            } else {
                long jZzb = this.zzc.zzb(zzafzVar, true, false, 4);
                if (jZzb == -2) {
                    zzafzVar.zzl();
                    while (true) {
                        byte[] bArr2 = this.zza;
                        zzafzVar.zzi(bArr2, 0, 4);
                        iZzd = zzakj.zzd(bArr2[0]);
                        if (iZzd != -1 && iZzd <= 4) {
                            iZze = (int) zzakj.zze(bArr2, iZzd, false);
                            zzakh zzakhVar2 = ((zzakc) this.zzd).zza;
                            if (iZze != 357149030 && iZze != 524531317 && iZze != 475249515) {
                                if (iZze == 374648427) {
                                    iZze = 374648427;
                                }
                            }
                        }
                        zzafzVar.zzf(1);
                    }
                    zzafzVar.zzf(iZzd);
                    jZzb = iZze;
                }
                if (jZzb == -1) {
                    return false;
                }
                this.zzf = (int) jZzb;
                this.zze = 1;
            }
            this.zzg = this.zzc.zzb(zzafzVar, false, true, 8);
            this.zze = 2;
            zzakb zzakbVar2 = this.zzd;
            i10 = this.zzf;
            zzakhVar = ((zzakc) zzakbVar2).zza;
            switch (i10) {
                case MRAID_JS_WRITE_FAILED_VALUE:
                case PRIVACY_URL_ERROR_VALUE:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case AD_RESPONSE_EMPTY_VALUE:
                case 231:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    j10 = this.zzg;
                    if (j10 <= 8) {
                        zzakhVar.zzj(i10, zzd(zzafzVar, (int) j10));
                        this.zze = 0;
                        return true;
                    }
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 22);
                    sb5.append("Invalid integer size: ");
                    sb5.append(j10);
                    throw zzat.zzb(sb5.toString(), null);
                case STORE_REGION_CODE_ERROR_VALUE:
                case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                case 21358:
                case 2274716:
                    j11 = this.zzg;
                    if (j11 <= 2147483647L) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(j11).length() + 21);
                        sb6.append("String element size: ");
                        sb6.append(j11);
                        throw zzat.zzb(sb6.toString(), null);
                    }
                    i11 = (int) j11;
                    if (i11 == 0) {
                        str = "";
                    } else {
                        bArr = new byte[i11];
                        zzafzVar.zzc(bArr, 0, i11);
                        while (i11 > 0) {
                            i12 = i11 - 1;
                            if (bArr[i12] == 0) {
                                i11 = i12;
                            } else {
                                str = new String(bArr, 0, i11);
                            }
                        }
                        str = new String(bArr, 0, i11);
                    }
                    zzakhVar.zzl(i10, str);
                    this.zze = 0;
                    return true;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE:
                case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    long jZzn2 = zzafzVar.zzn();
                    arrayDeque.push(new zzajz(i10, this.zzg + jZzn2, null));
                    ((zzakc) this.zzd).zza.zzh(this.zzf, jZzn2, this.zzg);
                    this.zze = 0;
                    return true;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    zzakhVar.zzm(i10, (int) this.zzg, zzafzVar);
                    this.zze = 0;
                    return true;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    j12 = this.zzg;
                    if (j12 == 4) {
                        break;
                    }
                    i13 = (int) j12;
                    jZzd = zzd(zzafzVar, i13);
                    if (i13 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) jZzd);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(jZzd);
                    }
                    zzakhVar.zzk(i10, dLongBitsToDouble);
                    this.zze = 0;
                    return true;
                default:
                    zzafzVar.zzf((int) this.zzg);
                    this.zze = 0;
                    break;
            }
        }
    }
}

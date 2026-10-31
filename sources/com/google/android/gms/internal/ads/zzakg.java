package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakg {
    public byte[] zzN;
    public zzahl zzT;
    public boolean zzV;
    public zzahk zzX;
    public zzv zzY;
    public int zzZ;
    public boolean zza;
    private int zzaa;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzahj zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzU = false;
    public boolean zzW = true;
    private String zzab = "eng";

    protected zzakg() {
    }

    private static Pair zzf(zzet zzetVar) throws zzat {
        try {
            zzetVar.zzk(16);
            long jZzA = zzetVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzA != 826496599) {
                zzeg.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzg = zzetVar.zzg() + 20;
            byte[] bArrZzi = zzetVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i10 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i10] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i10;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i10;
        int i11;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i12 = 0;
            int i13 = 1;
            while (true) {
                int i14 = bArr[i13];
                i13++;
                i10 = i14 & 255;
                if (i10 != 255) {
                    break;
                }
                i12 += 255;
            }
            int i15 = i12 + i10;
            int i16 = 0;
            while (true) {
                int i17 = bArr[i13];
                i13++;
                i11 = i17 & 255;
                if (i11 != 255) {
                    break;
                }
                i16 += 255;
            }
            int i18 = i16 + i11;
            if (bArr[i13] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            int i19 = i13 + i15;
            if (bArr[i19] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i20 = i19 + i18;
            if (bArr[i20] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i20, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzet zzetVar) throws zzat {
        try {
            int iZzu = zzetVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzetVar.zzh(24);
                if (zzetVar.zzD() == zzakh.zzf.getMostSignificantBits() && zzetVar.zzD() == zzakh.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    final /* synthetic */ void zzb() {
        this.zzX.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzaa;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zzaa = i10;
    }

    final /* synthetic */ void zze(String str) {
        this.zzab = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0199  */
    /* JADX WARN: Code duplicated, block: B:176:0x043c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0454  */
    /* JADX WARN: Code duplicated, block: B:182:0x0460  */
    /* JADX WARN: Code duplicated, block: B:183:0x0463  */
    /* JADX WARN: Code duplicated, block: B:186:0x0472  */
    /* JADX WARN: Code duplicated, block: B:187:0x0481  */
    /* JADX WARN: Code duplicated, block: B:189:0x0487  */
    /* JADX WARN: Code duplicated, block: B:191:0x048b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0490  */
    /* JADX WARN: Code duplicated, block: B:196:0x0498  */
    /* JADX WARN: Code duplicated, block: B:198:0x049d  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:204:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:208:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:209:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:214:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:218:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:220:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:221:0x04db  */
    /* JADX WARN: Code duplicated, block: B:224:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:244:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:247:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:252:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:271:0x0637  */
    /* JADX WARN: Code duplicated, block: B:273:0x0656  */
    /* JADX WARN: Code duplicated, block: B:275:0x065c  */
    /* JADX WARN: Code duplicated, block: B:290:0x0689  */
    /* JADX WARN: Code duplicated, block: B:295:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:296:0x06a4  */
    public final void zza(int i10) throws zzat {
        byte b10;
        List listZzj;
        int i11;
        int i12;
        int i13;
        int i14;
        List listZzk;
        int i15;
        int iZzB;
        int i16;
        List list;
        String str;
        int i17;
        int i18;
        String str2;
        List listZzg;
        int i19;
        String str3;
        String str4;
        int i20;
        zzt zztVar;
        int iIntValue;
        int i21;
        float f10;
        int i22;
        byte[] bArr;
        String str5;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        String str6;
        String str7;
        zzfu zzfuVarZza;
        String str8 = this.zzc;
        switch (str8) {
            case "V_MPEG4/ISO/AP":
                b10 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b10 = 4;
                break;
            case "A_MS/ACM":
                b10 = 23;
                break;
            case "A_TRUEHD":
                b10 = 18;
                break;
            case "A_VORBIS":
                b10 = 11;
                break;
            case "A_MPEG/L2":
                b10 = 14;
                break;
            case "A_MPEG/L3":
                b10 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b10 = 9;
                break;
            case "S_DVBSUB":
                b10 = 33;
                break;
            case "V_MPEG4/ISO/ASP":
                b10 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b10 = 7;
                break;
            case "S_VOBSUB":
                b10 = 31;
                break;
            case "A_DTS/LOSSLESS":
                b10 = 21;
                break;
            case "A_AAC":
                b10 = 13;
                break;
            case "A_AC3":
                b10 = 16;
                break;
            case "A_DTS":
                b10 = 19;
                break;
            case "V_AV1":
                b10 = 2;
                break;
            case "V_VP8":
                b10 = 0;
                break;
            case "V_VP9":
                b10 = 1;
                break;
            case "S_HDMV/PGS":
                b10 = 32;
                break;
            case "V_THEORA":
                b10 = 10;
                break;
            case "A_DTS/EXPRESS":
                b10 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b10 = 26;
                break;
            case "A_PCM/INT/BIG":
                b10 = 25;
                break;
            case "A_PCM/INT/LIT":
                b10 = 24;
                break;
            case "S_TEXT/ASS":
                b10 = 28;
                break;
            case "S_TEXT/SSA":
                b10 = 29;
                break;
            case "V_MPEGH/ISO/HEVC":
                b10 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b10 = 30;
                break;
            case "S_TEXT/UTF8":
                b10 = 27;
                break;
            case "V_MPEG2":
                b10 = 3;
                break;
            case "A_EAC3":
                b10 = 17;
                break;
            case "A_FLAC":
                b10 = 22;
                break;
            case "A_OPUS":
                b10 = 12;
                break;
            default:
                b10 = -1;
                break;
        }
        String str9 = "audio/raw";
        switch (b10) {
            case 0:
                str9 = "video/x-vnd.on2.vp8";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null || (zzfuVarZza = zzfu.zza(new zzet(this.zzN))) == null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str4 = zzfuVarZza.zza;
                    str3 = "video/dolby-vision";
                }
                boolean z10 = this.zzW;
                int i28 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i29 = (z10 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue || (i25 = this.zzq) == iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = (this.zzn * i21) / (this.zzm * i25);
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue && this.zzA == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue && (i15 = this.zzo) == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else if (this.zzM == -1.0f) {
                        bArr = null;
                        i22 = 0;
                    } else {
                        bArr = new byte[25];
                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                        i22 = 0;
                        byteBufferOrder.put((byte) 0);
                        byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                        byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                        byteBufferOrder.putShort((short) this.zzB);
                        byteBufferOrder.putShort((short) this.zzC);
                    }
                    zzh zzhVar = new zzh();
                    zzhVar.zza(i11);
                    zzhVar.zzb(i13);
                    zzhVar.zzc(i12);
                    zzhVar.zzd(bArr);
                    zzhVar.zze(i15);
                    zzhVar.zzf(i14);
                    zzi zziVarZzg = zzhVar.zzg();
                    str5 = this.zzb;
                    if (str5 != null && zzakh.zzg.containsKey(str5)) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0 || Float.compare(this.zzt, 0.0f) != 0 || Float.compare(this.zzu, 0.0f) != 0) {
                        i23 = iIntValue;
                    } else if (Float.compare(this.zzv, 0.0f) == 0) {
                        i23 = i22;
                    } else if (Float.compare(this.zzv, 90.0f) == 0) {
                        i23 = 90;
                    } else if (Float.compare(this.zzv, -180.0f) == 0 || Float.compare(this.zzv, 180.0f) == 0) {
                        i23 = 180;
                    } else if (Float.compare(this.zzv, -90.0f) == 0) {
                        i23 = 270;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg);
                } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null && !zzakh.zzg.containsKey(str6)) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i28);
                zztVar.zze(this.zzab);
                zztVar.zzf(i29);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                listZzj = bArr2 == null ? null : zzgwm.zzj(bArr2);
                str9 = "video/x-vnd.on2.vp9";
                listZzk = listZzj;
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z11 = this.zzW;
                int i210 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i211 = (z11 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar2 = new zzh();
                    zzhVar2.zza(i11);
                    zzhVar2.zzb(i13);
                    zzhVar2.zzc(i12);
                    zzhVar2.zzd(bArr);
                    zzhVar2.zze(i15);
                    zzhVar2.zzf(i14);
                    zzi zziVarZzg2 = zzhVar2.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg2);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i210);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                str9 = "video/av01";
                if (bArr3 != null) {
                    zzafc zzafcVarZza = zzafc.zza(bArr3);
                    List list2 = zzafcVarZza.zza;
                    i11 = zzafcVarZza.zzc;
                    i12 = zzafcVarZza.zze;
                    i13 = zzafcVarZza.zzd;
                    i14 = zzafcVarZza.zzb;
                    listZzk = list2;
                    i15 = i14;
                    iZzB = -1;
                    i16 = -1;
                    str2 = null;
                    if (this.zzN != null) {
                        str3 = str9;
                        str4 = str2;
                    } else {
                        str3 = str9;
                        str4 = str2;
                    }
                    boolean z12 = this.zzW;
                    int i212 = i16;
                    if (true != this.zzV) {
                        i20 = 0;
                    } else {
                        i20 = 2;
                    }
                    int i213 = (z12 ? 1 : 0) | i20;
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                        zztVar.zzG(this.zzO);
                        zztVar.zzH(this.zzQ);
                        zztVar.zzI(iZzB);
                    } else if (zzas.zzb(str3)) {
                        if (this.zzr == 0) {
                            i26 = this.zzp;
                            iIntValue = -1;
                            if (i26 == -1) {
                                i26 = this.zzm;
                            }
                            this.zzp = i26;
                            i27 = this.zzq;
                            if (i27 == -1) {
                                i27 = this.zzn;
                            }
                            this.zzq = i27;
                        } else {
                            iIntValue = -1;
                        }
                        i21 = this.zzp;
                        if (i21 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (i11 == iIntValue) {
                            if (i12 != iIntValue) {
                                i11 = iIntValue;
                            } else if (i13 == iIntValue) {
                                i11 = this.zzy;
                                i12 = this.zzz;
                                i13 = this.zzA;
                            } else {
                                i11 = this.zzy;
                                i12 = this.zzz;
                                i13 = this.zzA;
                            }
                        }
                        if (i15 == iIntValue) {
                            i15 = 8;
                        }
                        if (i14 == iIntValue) {
                            i24 = this.zzo;
                            if (i24 == iIntValue) {
                                i14 = 8;
                            } else {
                                i14 = i24;
                            }
                        }
                        if (this.zzD != -1.0f) {
                            i22 = 0;
                            bArr = null;
                        } else {
                            i22 = 0;
                            bArr = null;
                        }
                        zzh zzhVar3 = new zzh();
                        zzhVar3.zza(i11);
                        zzhVar3.zzb(i13);
                        zzhVar3.zzc(i12);
                        zzhVar3.zzd(bArr);
                        zzhVar3.zze(i15);
                        zzhVar3.zzf(i14);
                        zzi zziVarZzg3 = zzhVar3.zzg();
                        str5 = this.zzb;
                        if (str5 != null) {
                            iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i23 = iIntValue;
                        } else {
                            i23 = iIntValue;
                        }
                        zztVar.zzv(this.zzm);
                        zztVar.zzw(this.zzn);
                        zztVar.zzB(f10);
                        zztVar.zzA(i23);
                        zztVar.zzC(this.zzw);
                        zztVar.zzD(this.zzx);
                        zztVar.zzE(zziVarZzg3);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    str6 = this.zzb;
                    if (str6 != null) {
                        zztVar.zzc(this.zzb);
                    }
                    zztVar.zzb(i10);
                    if (true != this.zza) {
                        str7 = "video/x-matroska";
                    } else {
                        str7 = "video/webm";
                    }
                    zztVar.zzn(str7);
                    zztVar.zzo(str3);
                    zztVar.zzp(i212);
                    zztVar.zze(this.zzab);
                    zztVar.zzf(i213);
                    zztVar.zzr(listZzk);
                    zztVar.zzk(str4);
                    zztVar.zzs(this.zzl);
                    this.zzY = zztVar.zzO();
                    return;
                }
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z13 = this.zzW;
                int i214 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i215 = (z13 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar4 = new zzh();
                    zzhVar4.zza(i11);
                    zzhVar4.zzb(i13);
                    zzhVar4.zzc(i12);
                    zzhVar4.zzd(bArr);
                    zzhVar4.zze(i15);
                    zzhVar4.zzf(i14);
                    zzi zziVarZzg4 = zzhVar4.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg4);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i214);
                zztVar.zze(this.zzab);
                zztVar.zzf(i215);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 3:
                str9 = "video/mpeg2";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z14 = this.zzW;
                int i216 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i217 = (z14 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar5 = new zzh();
                    zzhVar5.zza(i11);
                    zzhVar5.zzb(i13);
                    zzhVar5.zzc(i12);
                    zzhVar5.zzd(bArr);
                    zzhVar5.zze(i15);
                    zzhVar5.zzf(i14);
                    zzi zziVarZzg5 = zzhVar5.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg5);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i216);
                zztVar.zze(this.zzab);
                zztVar.zzf(i217);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                listZzj = bArr4 == null ? null : Collections.singletonList(bArr4);
                str9 = "video/mp4v-es";
                listZzk = listZzj;
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z15 = this.zzW;
                int i218 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i219 = (z15 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar6 = new zzh();
                    zzhVar6.zza(i11);
                    zzhVar6.zzb(i13);
                    zzhVar6.zzc(i12);
                    zzhVar6.zzd(bArr);
                    zzhVar6.zze(i15);
                    zzhVar6.zzf(i14);
                    zzi zziVarZzg6 = zzhVar6.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg6);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i218);
                zztVar.zze(this.zzab);
                zztVar.zzf(i219);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 7:
                zzafd zzafdVarZza = zzafd.zza(new zzet(zzi(this.zzc)));
                list = zzafdVarZza.zza;
                this.zzZ = zzafdVarZza.zzb;
                str = zzafdVarZza.zzl;
                i11 = zzafdVarZza.zzg;
                i12 = zzafdVarZza.zzi;
                i13 = zzafdVarZza.zzh;
                i17 = zzafdVarZza.zze;
                i18 = zzafdVarZza.zzf;
                str9 = "video/avc";
                listZzk = list;
                str2 = str;
                i15 = i17;
                i16 = -1;
                i14 = i18;
                iZzB = -1;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z16 = this.zzW;
                int i2110 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2111 = (z16 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar7 = new zzh();
                    zzhVar7.zza(i11);
                    zzhVar7.zzb(i13);
                    zzhVar7.zzc(i12);
                    zzhVar7.zzd(bArr);
                    zzhVar7.zze(i15);
                    zzhVar7.zzf(i14);
                    zzi zziVarZzg7 = zzhVar7.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg7);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2110);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 8:
                zzags zzagsVarZza = zzags.zza(new zzet(zzi(this.zzc)));
                list = zzagsVarZza.zza;
                this.zzZ = zzagsVarZza.zzb;
                str = zzagsVarZza.zzn;
                i11 = zzagsVarZza.zzh;
                i12 = zzagsVarZza.zzj;
                i13 = zzagsVarZza.zzi;
                i17 = zzagsVarZza.zzf;
                i18 = zzagsVarZza.zzg;
                str9 = "video/hevc";
                listZzk = list;
                str2 = str;
                i15 = i17;
                i16 = -1;
                i14 = i18;
                iZzB = -1;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z17 = this.zzW;
                int i2112 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2113 = (z17 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar8 = new zzh();
                    zzhVar8.zza(i11);
                    zzhVar8.zzb(i13);
                    zzhVar8.zzc(i12);
                    zzhVar8.zzd(bArr);
                    zzhVar8.zze(i15);
                    zzhVar8.zzf(i14);
                    zzi zziVarZzg8 = zzhVar8.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg8);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2112);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 9:
                Pair pairZzf = zzf(new zzet(zzi(this.zzc)));
                str9 = (String) pairZzf.first;
                listZzj = (List) pairZzf.second;
                listZzk = listZzj;
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z18 = this.zzW;
                int i2114 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2115 = (z18 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar9 = new zzh();
                    zzhVar9.zza(i11);
                    zzhVar9.zzb(i13);
                    zzhVar9.zzc(i12);
                    zzhVar9.zzd(bArr);
                    zzhVar9.zze(i15);
                    zzhVar9.zzf(i14);
                    zzi zziVarZzg9 = zzhVar9.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg9);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2114);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 10:
                str9 = "video/x-unknown";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z19 = this.zzW;
                int i2116 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2117 = (z19 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar10 = new zzh();
                    zzhVar10.zza(i11);
                    zzhVar10.zzb(i13);
                    zzhVar10.zzc(i12);
                    zzhVar10.zzd(bArr);
                    zzhVar10.zze(i15);
                    zzhVar10.zzf(i14);
                    zzi zziVarZzg10 = zzhVar10.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg10);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2116);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 11:
                listZzg = zzg(zzi(str8));
                i19 = 8192;
                str9 = "audio/vorbis";
                listZzk = listZzg;
                i16 = i19;
                iZzB = -1;
                i15 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z110 = this.zzW;
                int i2118 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2119 = (z110 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar11 = new zzh();
                    zzhVar11.zza(i11);
                    zzhVar11.zzb(i13);
                    zzhVar11.zzc(i12);
                    zzhVar11.zzd(bArr);
                    zzhVar11.zze(i15);
                    zzhVar11.zzf(i14);
                    zzi zziVarZzg11 = zzhVar11.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg11);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2118);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2119);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 12:
                listZzg = new ArrayList(3);
                listZzg.add(zzi(this.zzc));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                listZzg.add(byteBufferAllocate.order(byteOrder).putLong(this.zzR).array());
                listZzg.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzS).array());
                i19 = 5760;
                str9 = "audio/opus";
                listZzk = listZzg;
                i16 = i19;
                iZzB = -1;
                i15 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z111 = this.zzW;
                int i21110 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21111 = (z111 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar12 = new zzh();
                    zzhVar12.zza(i11);
                    zzhVar12.zzb(i13);
                    zzhVar12.zzc(i12);
                    zzhVar12.zzd(bArr);
                    zzhVar12.zze(i15);
                    zzhVar12.zzf(i14);
                    zzi zziVarZzg12 = zzhVar12.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg12);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21110);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 13:
                List listSingletonList = Collections.singletonList(zzi(str8));
                zzaev zzaevVarZza = zzaew.zza(this.zzk);
                this.zzQ = zzaevVarZza.zza;
                this.zzO = zzaevVarZza.zzb;
                str9 = "audio/mp4a-latm";
                listZzk = listSingletonList;
                str2 = zzaevVarZza.zzc;
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z112 = this.zzW;
                int i21112 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21113 = (z112 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar13 = new zzh();
                    zzhVar13.zza(i11);
                    zzhVar13.zzb(i13);
                    zzhVar13.zzc(i12);
                    zzhVar13.zzd(bArr);
                    zzhVar13.zze(i15);
                    zzhVar13.zzf(i14);
                    zzi zziVarZzg13 = zzhVar13.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg13);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21112);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 14:
                str9 = "audio/mpeg-L2";
                i16 = 4096;
                iZzB = -1;
                i15 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z113 = this.zzW;
                int i21114 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21115 = (z113 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar14 = new zzh();
                    zzhVar14.zza(i11);
                    zzhVar14.zzb(i13);
                    zzhVar14.zzc(i12);
                    zzhVar14.zzd(bArr);
                    zzhVar14.zze(i15);
                    zzhVar14.zzf(i14);
                    zzi zziVarZzg14 = zzhVar14.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg14);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21114);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 15:
                str9 = "audio/mpeg";
                i16 = 4096;
                iZzB = -1;
                i15 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z114 = this.zzW;
                int i21116 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21117 = (z114 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar15 = new zzh();
                    zzhVar15.zza(i11);
                    zzhVar15.zzb(i13);
                    zzhVar15.zzc(i12);
                    zzhVar15.zzd(bArr);
                    zzhVar15.zze(i15);
                    zzhVar15.zzf(i14);
                    zzi zziVarZzg15 = zzhVar15.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg15);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21116);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 16:
                str9 = "audio/ac3";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z115 = this.zzW;
                int i21118 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21119 = (z115 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar16 = new zzh();
                    zzhVar16.zza(i11);
                    zzhVar16.zzb(i13);
                    zzhVar16.zzc(i12);
                    zzhVar16.zzd(bArr);
                    zzhVar16.zze(i15);
                    zzhVar16.zzf(i14);
                    zzi zziVarZzg16 = zzhVar16.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg16);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21118);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21119);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 17:
                str9 = "audio/eac3";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z116 = this.zzW;
                int i211110 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i211111 = (z116 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar17 = new zzh();
                    zzhVar17.zza(i11);
                    zzhVar17.zzb(i13);
                    zzhVar17.zzc(i12);
                    zzhVar17.zzd(bArr);
                    zzhVar17.zze(i15);
                    zzhVar17.zzf(i14);
                    zzi zziVarZzg17 = zzhVar17.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg17);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i211110);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 18:
                this.zzT = new zzahl();
                str9 = "audio/true-hd";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z117 = this.zzW;
                int i211112 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i211113 = (z117 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar18 = new zzh();
                    zzhVar18.zza(i11);
                    zzhVar18.zzb(i13);
                    zzhVar18.zzc(i12);
                    zzhVar18.zzd(bArr);
                    zzhVar18.zze(i15);
                    zzhVar18.zzf(i14);
                    zzi zziVarZzg18 = zzhVar18.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg18);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i211112);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 19:
            case 20:
                this.zzU = true;
                str9 = "audio/vnd.dts";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z118 = this.zzW;
                int i211114 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i211115 = (z118 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar19 = new zzh();
                    zzhVar19.zza(i11);
                    zzhVar19.zzb(i13);
                    zzhVar19.zzc(i12);
                    zzhVar19.zzd(bArr);
                    zzhVar19.zze(i15);
                    zzhVar19.zzf(i14);
                    zzi zziVarZzg19 = zzhVar19.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg19);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i211114);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 21:
                str9 = "audio/vnd.dts.hd";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z119 = this.zzW;
                int i211116 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i211117 = (z119 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar110 = new zzh();
                    zzhVar110.zza(i11);
                    zzhVar110.zzb(i13);
                    zzhVar110.zzc(i12);
                    zzhVar110.zzd(bArr);
                    zzhVar110.zze(i15);
                    zzhVar110.zzf(i14);
                    zzi zziVarZzg110 = zzhVar110.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg110);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i211116);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 22:
                listZzj = Collections.singletonList(zzi(str8));
                str9 = "audio/flac";
                listZzk = listZzj;
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1110 = this.zzW;
                int i211118 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i211119 = (z1110 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar111 = new zzh();
                    zzhVar111.zza(i11);
                    zzhVar111.zzb(i13);
                    zzhVar111.zzc(i12);
                    zzhVar111.zzd(bArr);
                    zzhVar111.zze(i15);
                    zzhVar111.zzf(i14);
                    zzi zziVarZzg111 = zzhVar111.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg111);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i211118);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211119);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 23:
                if (zzh(new zzet(zzi(this.zzc)))) {
                    iZzB = zzfl.zzB(this.zzP, ByteOrder.LITTLE_ENDIAN);
                    if (iZzB == 0) {
                        int i30 = this.zzP;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i30).length() + 64);
                        sb2.append(oqHAiWkeGzWld.kiplIW);
                        sb2.append(i30);
                        sb2.append(". Setting mimeType to audio/x-unknown");
                        zzeg.zzc("MatroskaExtractor", sb2.toString());
                    }
                    i15 = -1;
                    i16 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    str2 = null;
                    listZzk = null;
                    if (this.zzN != null) {
                        str3 = str9;
                        str4 = str2;
                    } else {
                        str3 = str9;
                        str4 = str2;
                    }
                    boolean z1111 = this.zzW;
                    int i2111110 = i16;
                    if (true != this.zzV) {
                        i20 = 0;
                    } else {
                        i20 = 2;
                    }
                    int i2111111 = (z1111 ? 1 : 0) | i20;
                    zztVar = new zzt();
                    if (zzas.zza(str3)) {
                        zztVar.zzG(this.zzO);
                        zztVar.zzH(this.zzQ);
                        zztVar.zzI(iZzB);
                    } else if (zzas.zzb(str3)) {
                        if (this.zzr == 0) {
                            i26 = this.zzp;
                            iIntValue = -1;
                            if (i26 == -1) {
                                i26 = this.zzm;
                            }
                            this.zzp = i26;
                            i27 = this.zzq;
                            if (i27 == -1) {
                                i27 = this.zzn;
                            }
                            this.zzq = i27;
                        } else {
                            iIntValue = -1;
                        }
                        i21 = this.zzp;
                        if (i21 != iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (i11 == iIntValue) {
                            if (i12 != iIntValue) {
                                i11 = iIntValue;
                            } else if (i13 == iIntValue) {
                                i11 = this.zzy;
                                i12 = this.zzz;
                                i13 = this.zzA;
                            } else {
                                i11 = this.zzy;
                                i12 = this.zzz;
                                i13 = this.zzA;
                            }
                        }
                        if (i15 == iIntValue) {
                            i15 = 8;
                        }
                        if (i14 == iIntValue) {
                            i24 = this.zzo;
                            if (i24 == iIntValue) {
                                i14 = 8;
                            } else {
                                i14 = i24;
                            }
                        }
                        if (this.zzD != -1.0f) {
                            i22 = 0;
                            bArr = null;
                        } else {
                            i22 = 0;
                            bArr = null;
                        }
                        zzh zzhVar112 = new zzh();
                        zzhVar112.zza(i11);
                        zzhVar112.zzb(i13);
                        zzhVar112.zzc(i12);
                        zzhVar112.zzd(bArr);
                        zzhVar112.zze(i15);
                        zzhVar112.zzf(i14);
                        zzi zziVarZzg112 = zzhVar112.zzg();
                        str5 = this.zzb;
                        if (str5 != null) {
                            iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                        }
                        if (this.zzs == 0) {
                            i23 = iIntValue;
                        } else {
                            i23 = iIntValue;
                        }
                        zztVar.zzv(this.zzm);
                        zztVar.zzw(this.zzn);
                        zztVar.zzB(f10);
                        zztVar.zzA(i23);
                        zztVar.zzC(this.zzw);
                        zztVar.zzD(this.zzx);
                        zztVar.zzE(zziVarZzg112);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    str6 = this.zzb;
                    if (str6 != null) {
                        zztVar.zzc(this.zzb);
                    }
                    zztVar.zzb(i10);
                    if (true != this.zza) {
                        str7 = "video/x-matroska";
                    } else {
                        str7 = "video/webm";
                    }
                    zztVar.zzn(str7);
                    zztVar.zzo(str3);
                    zztVar.zzp(i2111110);
                    zztVar.zze(this.zzab);
                    zztVar.zzf(i2111111);
                    zztVar.zzr(listZzk);
                    zztVar.zzk(str4);
                    zztVar.zzs(this.zzl);
                    this.zzY = zztVar.zzO();
                    return;
                }
                zzeg.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                str9 = "audio/x-unknown";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1112 = this.zzW;
                int i2111112 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2111113 = (z1112 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar113 = new zzh();
                    zzhVar113.zza(i11);
                    zzhVar113.zzb(i13);
                    zzhVar113.zzc(i12);
                    zzhVar113.zzd(bArr);
                    zzhVar113.zze(i15);
                    zzhVar113.zzf(i14);
                    zzi zziVarZzg113 = zzhVar113.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg113);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2111112);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2111113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 24:
                iZzB = zzfl.zzB(this.zzP, ByteOrder.LITTLE_ENDIAN);
                if (iZzB == 0) {
                    int i31 = this.zzP;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i31).length() + 78);
                    sb3.append("Unsupported little endian PCM bit depth: ");
                    sb3.append(i31);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzeg.zzc("MatroskaExtractor", sb3.toString());
                    str9 = "audio/x-unknown";
                    iZzB = -1;
                }
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1113 = this.zzW;
                int i2111114 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2111115 = (z1113 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar114 = new zzh();
                    zzhVar114.zza(i11);
                    zzhVar114.zzb(i13);
                    zzhVar114.zzc(i12);
                    zzhVar114.zzd(bArr);
                    zzhVar114.zze(i15);
                    zzhVar114.zzf(i14);
                    zzi zziVarZzg114 = zzhVar114.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg114);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2111114);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2111115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 25:
                iZzB = zzfl.zzB(this.zzP, ByteOrder.BIG_ENDIAN);
                if (iZzB == 0) {
                    int i32 = this.zzP;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i32).length() + 75);
                    sb4.append("Unsupported big endian PCM bit depth: ");
                    sb4.append(i32);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzeg.zzc("MatroskaExtractor", sb4.toString());
                    str9 = "audio/x-unknown";
                    iZzB = -1;
                }
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1114 = this.zzW;
                int i2111116 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2111117 = (z1114 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar115 = new zzh();
                    zzhVar115.zza(i11);
                    zzhVar115.zzb(i13);
                    zzhVar115.zzc(i12);
                    zzhVar115.zzd(bArr);
                    zzhVar115.zze(i15);
                    zzhVar115.zzf(i14);
                    zzi zziVarZzg115 = zzhVar115.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg115);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2111116);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2111117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 26:
                iZzB = zzfl.zzC(this.zzP);
                if (iZzB == 0) {
                    int i33 = this.zzP;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i33).length() + 79);
                    sb5.append("Unsupported floating point PCM bit depth: ");
                    sb5.append(i33);
                    sb5.append(". Setting mimeType to audio/x-unknown");
                    zzeg.zzc("MatroskaExtractor", sb5.toString());
                    str9 = "audio/x-unknown";
                    iZzB = -1;
                }
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1115 = this.zzW;
                int i2111118 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i2111119 = (z1115 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar116 = new zzh();
                    zzhVar116.zza(i11);
                    zzhVar116.zzb(i13);
                    zzhVar116.zzc(i12);
                    zzhVar116.zzd(bArr);
                    zzhVar116.zze(i15);
                    zzhVar116.zzf(i14);
                    zzi zziVarZzg116 = zzhVar116.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg116);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i2111118);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2111119);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 27:
                str9 = "application/x-subrip";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1116 = this.zzW;
                int i21111110 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21111111 = (z1116 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar117 = new zzh();
                    zzhVar117.zza(i11);
                    zzhVar117.zzb(i13);
                    zzhVar117.zzc(i12);
                    zzhVar117.zzd(bArr);
                    zzhVar117.zze(i15);
                    zzhVar117.zzf(i14);
                    zzi zziVarZzg117 = zzhVar117.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg117);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21111110);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21111111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 28:
            case 29:
                int i34 = zzakh.zza;
                listZzk = zzgwm.zzk(zzakh.zzc, zzi(this.zzc));
                str9 = "text/x-ssa";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1117 = this.zzW;
                int i21111112 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21111113 = (z1117 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar118 = new zzh();
                    zzhVar118.zza(i11);
                    zzhVar118.zzb(i13);
                    zzhVar118.zzc(i12);
                    zzhVar118.zzd(bArr);
                    zzhVar118.zze(i15);
                    zzhVar118.zzf(i14);
                    zzi zziVarZzg118 = zzhVar118.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg118);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21111112);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21111113);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 30:
                str9 = "text/vtt";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1118 = this.zzW;
                int i21111114 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21111115 = (z1118 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar119 = new zzh();
                    zzhVar119.zza(i11);
                    zzhVar119.zzb(i13);
                    zzhVar119.zzc(i12);
                    zzhVar119.zzd(bArr);
                    zzhVar119.zze(i15);
                    zzhVar119.zzf(i14);
                    zzi zziVarZzg119 = zzhVar119.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg119);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21111114);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21111115);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 31:
                listZzk = zzgwm.zzj(zzi(str8));
                str9 = "application/vobsub";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z1119 = this.zzW;
                int i21111116 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21111117 = (z1119 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1110 = new zzh();
                    zzhVar1110.zza(i11);
                    zzhVar1110.zzb(i13);
                    zzhVar1110.zzc(i12);
                    zzhVar1110.zzd(bArr);
                    zzhVar1110.zze(i15);
                    zzhVar1110.zzf(i14);
                    zzi zziVarZzg1110 = zzhVar1110.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg1110);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21111116);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21111117);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 32:
                str9 = "application/pgs";
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                listZzk = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z11110 = this.zzW;
                int i21111118 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i21111119 = (z11110 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1111 = new zzh();
                    zzhVar1111.zza(i11);
                    zzhVar1111.zzb(i13);
                    zzhVar1111.zzc(i12);
                    zzhVar1111.zzd(bArr);
                    zzhVar1111.zze(i15);
                    zzhVar1111.zzf(i14);
                    zzi zziVarZzg1111 = zzhVar1111.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg1111);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i21111118);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21111119);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 33:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str8), 0, bArr5, 0, 4);
                listZzj = zzgwm.zzj(bArr5);
                str9 = "application/dvbsubs";
                listZzk = listZzj;
                iZzB = -1;
                i15 = -1;
                i16 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                str2 = null;
                if (this.zzN != null) {
                    str3 = str9;
                    str4 = str2;
                } else {
                    str3 = str9;
                    str4 = str2;
                }
                boolean z11111 = this.zzW;
                int i211111110 = i16;
                if (true != this.zzV) {
                    i20 = 0;
                } else {
                    i20 = 2;
                }
                int i211111111 = (z11111 ? 1 : 0) | i20;
                zztVar = new zzt();
                if (zzas.zza(str3)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str3)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        iIntValue = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        iIntValue = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != iIntValue) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i11 == iIntValue) {
                        if (i12 != iIntValue) {
                            i11 = iIntValue;
                        } else if (i13 == iIntValue) {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        } else {
                            i11 = this.zzy;
                            i12 = this.zzz;
                            i13 = this.zzA;
                        }
                    }
                    if (i15 == iIntValue) {
                        i15 = 8;
                    }
                    if (i14 == iIntValue) {
                        i24 = this.zzo;
                        if (i24 == iIntValue) {
                            i14 = 8;
                        } else {
                            i14 = i24;
                        }
                    }
                    if (this.zzD != -1.0f) {
                        i22 = 0;
                        bArr = null;
                    } else {
                        i22 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1112 = new zzh();
                    zzhVar1112.zza(i11);
                    zzhVar1112.zzb(i13);
                    zzhVar1112.zzc(i12);
                    zzhVar1112.zzd(bArr);
                    zzhVar1112.zze(i15);
                    zzhVar1112.zzf(i14);
                    zzi zziVarZzg1112 = zzhVar1112.zzg();
                    str5 = this.zzb;
                    if (str5 != null) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    }
                    if (this.zzs == 0) {
                        i23 = iIntValue;
                    } else {
                        i23 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i23);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg1112);
                } else if (!"application/x-subrip".equals(str3)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str6 = this.zzb;
                if (str6 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str7 = "video/x-matroska";
                } else {
                    str7 = "video/webm";
                }
                zztVar.zzn(str7);
                zztVar.zzo(str3);
                zztVar.zzp(i211111110);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211111111);
                zztVar.zzr(listZzk);
                zztVar.zzk(str4);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }
}

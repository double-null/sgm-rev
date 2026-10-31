package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakh implements zzafy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzakg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzagb zzap;
    private final zzaka zzaq;
    private final zzakj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzanj zzl;
    private final zzet zzm;
    private final zzet zzn;
    private final zzet zzo;
    private final zzet zzp;
    private final zzet zzq;
    private final zzet zzr;
    private final zzet zzs;
    private final zzet zzt;
    private final zzet zzu;
    private final zzet zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzakd.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfl.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzakh() {
        this(new zzaka(), 2, zzanj.zza);
    }

    private static int[] zzA(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                zzagb zzagbVar = this.zzap;
                zzagbVar.getClass();
                zzagbVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzakg) sparseArray.valueAt(i10)).zzU) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void zzq(int i10) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzr(int i10) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a Cues");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    private final void zzs(zzakg zzakgVar, long j10, int i10, int i11, int i12) {
        byte b10;
        byte[] bArrZzx;
        int i13;
        int iZze;
        zzahl zzahlVar = zzakgVar.zzT;
        if (zzahlVar != null) {
            zzahlVar.zzc(zzakgVar.zzX, j10, i10, i11, i12, zzakgVar.zzj);
        } else {
            String str = zzakgVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    zzeg.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.zzW;
                    if (j11 == -9223372036854775807L) {
                        zzeg.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzet zzetVar = this.zzs;
                        byte[] bArrZzi = zzetVar.zzi();
                        switch (str) {
                            case "S_TEXT/ASS":
                                b10 = 1;
                                break;
                            case "S_TEXT/SSA":
                                b10 = 2;
                                break;
                            case "S_TEXT/WEBVTT":
                                b10 = 3;
                                break;
                            case "S_TEXT/UTF8":
                                b10 = 0;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            bArrZzx = zzx(j11, "%02d:%02d:%02d,%03d", 1000L);
                            i13 = 19;
                        } else if (b10 == 1 || b10 == 2) {
                            bArrZzx = zzx(j11, "%01d:%02d:%02d:%02d", 10000L);
                            i13 = 21;
                        } else {
                            if (b10 != 3) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzx = zzx(j11, "%02d:%02d:%02d.%03d", 1000L);
                            i13 = 25;
                        }
                        System.arraycopy(bArrZzx, 0, bArrZzi, i13, bArrZzx.length);
                        for (int iZzg = zzetVar.zzg(); iZzg < zzetVar.zze(); iZzg++) {
                            if (zzetVar.zzi()[iZzg] == 0) {
                                zzetVar.zzf(iZzg);
                                zzakgVar.zzX.zzc(zzetVar, zzetVar.zze());
                                iZze = i11 + zzetVar.zze();
                            }
                        }
                        zzakgVar.zzX.zzc(zzetVar, zzetVar.zze());
                        iZze = i11 + zzetVar.zze();
                    }
                }
                iZze = i11;
            } else {
                iZze = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.zzY > 1) {
                    this.zzv.zza(0);
                } else {
                    zzet zzetVar2 = this.zzv;
                    int iZze2 = zzetVar2.zze();
                    zzakgVar.zzX.zzd(zzetVar2, iZze2, 2);
                    iZze += iZze2;
                }
            }
            zzakgVar.zzX.zze(j10, i10, iZze, i12, zzakgVar.zzj);
        }
        this.zzT = true;
    }

    private final void zzt(zzafz zzafzVar, int i10) throws IOException {
        zzet zzetVar = this.zzo;
        if (zzetVar.zze() >= i10) {
            return;
        }
        if (zzetVar.zzj() < i10) {
            int iZzj = zzetVar.zzj();
            zzetVar.zzc(Math.max(iZzj + iZzj, i10));
        }
        zzafzVar.zzc(zzetVar.zzi(), zzetVar.zze(), i10 - zzetVar.zze());
        zzetVar.zzf(i10);
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzafz zzafzVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        zzet zzetVar = this.zzs;
        if (zzetVar.zzj() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzetVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzetVar.zzi(), 0, length);
        }
        zzafzVar.zzc(zzetVar.zzi(), length, i10);
        zzetVar.zzh(0);
        zzetVar.zzf(i11);
    }

    private static byte[] zzx(long j10, String str, long j11) {
        zzgtj.zza(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = zzfl.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzafz zzafzVar, zzahk zzahkVar, int i10) throws IOException {
        zzet zzetVar = this.zzr;
        int iZzd = zzetVar.zzd();
        if (iZzd <= 0) {
            return zzahkVar.zza(zzafzVar, i10, false);
        }
        int iMin = Math.min(i10, iZzd);
        zzahkVar.zzc(zzetVar, iMin);
        return iMin;
    }

    private final long zzz(long j10) throws zzat {
        long j11 = this.zzz;
        if (j11 != -9223372036854775807L) {
            return zzfl.zzv(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws IOException {
        return new zzaki().zza(zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        if (this.zzk) {
            zzagbVar = new zzanm(zzagbVar, this.zzl);
        }
        this.zzap = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws IOException {
        int i10 = 0;
        this.zzT = false;
        while (!this.zzT) {
            boolean zZzc = this.zzaq.zzc(zzafzVar);
            if (zZzc) {
                long jZzn = zzafzVar.zzn();
                if (this.zzP) {
                    this.zzR = jZzn;
                    zzagyVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j10 = this.zzR;
                    if (j10 != -1) {
                        zzagyVar.zza = j10;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            }
            if (!zZzc) {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzakg zzakgVar = (zzakg) sparseArray.valueAt(i10);
                    zzakgVar.zzb();
                    zzahl zzahlVar = zzakgVar.zzT;
                    if (zzahlVar != null) {
                        zzahlVar.zzd(zzakgVar.zzX, zzakgVar.zzj);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzS = -9223372036854775807L;
        int i10 = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                return;
            }
            zzahl zzahlVar = ((zzakg) sparseArray.valueAt(i10)).zzT;
            if (zzahlVar != null) {
                zzahlVar.zza();
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    protected final void zzh(int i10, long j10, long j11) throws zzat {
        zzagb zzagbVar = this.zzap;
        zzagbVar.getClass();
        if (i10 == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i10 == 174) {
            zzakg zzakgVar = new zzakg();
            this.zzE = zzakgVar;
            zzakgVar.zza = this.zzC;
            return;
        }
        if (i10 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i10 == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i10 == 20533) {
            zzq(i10);
            this.zzE.zzh = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzy;
            if (j12 != -1 && j12 != j10) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j10;
            this.zzx = j11;
            return;
        }
        if (i10 == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i10 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzagbVar.zzw(new zzaha(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    protected final void zzk(int i10, double d10) throws zzat {
        if (i10 == 181) {
            zzq(i10);
            this.zzE.zzQ = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzA = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzq(i10);
                this.zzE.zzD = (float) d10;
                break;
            case 21970:
                zzq(i10);
                this.zzE.zzE = (float) d10;
                break;
            case 21971:
                zzq(i10);
                this.zzE.zzF = (float) d10;
                break;
            case 21972:
                zzq(i10);
                this.zzE.zzG = (float) d10;
                break;
            case 21973:
                zzq(i10);
                this.zzE.zzH = (float) d10;
                break;
            case 21974:
                zzq(i10);
                this.zzE.zzI = (float) d10;
                break;
            case 21975:
                zzq(i10);
                this.zzE.zzJ = (float) d10;
                break;
            case 21976:
                zzq(i10);
                this.zzE.zzK = (float) d10;
                break;
            case 21977:
                zzq(i10);
                this.zzE.zzL = (float) d10;
                break;
            case 21978:
                zzq(i10);
                this.zzE.zzM = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzq(i10);
                        this.zzE.zzt = (float) d10;
                        break;
                    case 30324:
                        zzq(i10);
                        this.zzE.zzu = (float) d10;
                        break;
                    case 30325:
                        zzq(i10);
                        this.zzE.zzv = (float) d10;
                        break;
                }
                break;
        }
    }

    protected final void zzl(int i10, String str) throws zzat {
        if (i10 == 134) {
            zzq(i10);
            this.zzE.zzc = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                zzq(i10);
                this.zzE.zzb = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                zzq(i10);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append("DocType ");
        sb2.append(str);
        sb2.append(" not supported");
        throw zzat.zzb(sb2.toString(), null);
    }

    protected final void zzm(int i10, int i11, zzafz zzafzVar) throws IOException {
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i10;
        Throwable th = null;
        int i19 = 1;
        int i20 = 0;
        if (i18 != 161 && i18 != 163) {
            if (i18 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzakg zzakgVar = (zzakg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzakgVar.zzc)) {
                    zzafzVar.zzf(i11);
                    return;
                }
                zzet zzetVar = this.zzv;
                zzetVar.zza(i11);
                zzafzVar.zzc(zzetVar.zzi(), 0, i11);
                return;
            }
            if (i18 == 16877) {
                zzq(i10);
                zzakg zzakgVar2 = this.zzE;
                if (zzakgVar2.zzc() != 1685485123 && zzakgVar2.zzc() != 1685480259) {
                    zzafzVar.zzf(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzakgVar2.zzN = bArr;
                zzafzVar.zzc(bArr, 0, i11);
                return;
            }
            if (i18 == 16981) {
                zzq(i10);
                byte[] bArr2 = new byte[i11];
                this.zzE.zzi = bArr2;
                zzafzVar.zzc(bArr2, 0, i11);
                return;
            }
            if (i18 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzafzVar.zzc(bArr3, 0, i11);
                zzq(i10);
                this.zzE.zzj = new zzahj(1, bArr3, 0, 0);
                return;
            }
            if (i18 == 21419) {
                zzet zzetVar2 = this.zzq;
                Arrays.fill(zzetVar2.zzi(), (byte) 0);
                zzafzVar.zzc(zzetVar2.zzi(), 4 - i11, i11);
                zzetVar2.zzh(0);
                this.zzG = (int) zzetVar2.zzz();
                return;
            }
            if (i18 == 25506) {
                zzq(i10);
                byte[] bArr4 = new byte[i11];
                this.zzE.zzk = bArr4;
                zzafzVar.zzc(bArr4, 0, i11);
                return;
            }
            if (i18 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i18);
                throw zzat.zzb(sb2.toString(), null);
            }
            zzq(i10);
            byte[] bArr5 = new byte[i11];
            this.zzE.zzw = bArr5;
            zzafzVar.zzc(bArr5, 0, i11);
            return;
        }
        int i21 = 8;
        if (this.zzU == 0) {
            zzakj zzakjVar = this.zzh;
            this.zzaa = (int) zzakjVar.zzb(zzafzVar, false, true, 8);
            this.zzab = zzakjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzakg zzakgVar3 = (zzakg) this.zzi.get(this.zzaa);
        if (zzakgVar3 == null) {
            zzafzVar.zzf(i11 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzakgVar3.zzb();
        if (this.zzU == 1) {
            zzt(zzafzVar, 3);
            zzet zzetVar3 = this.zzo;
            int i22 = (zzetVar3.zzi()[2] & 6) >> 1;
            if (i22 == 0) {
                this.zzY = 1;
                int[] iArrZzA = zzA(this.zzZ, 1);
                this.zzZ = iArrZzA;
                iArrZzA[0] = (i11 - this.zzab) - 3;
            } else {
                zzt(zzafzVar, 4);
                int i23 = (zzetVar3.zzi()[3] & 255) + 1;
                this.zzY = i23;
                int[] iArrZzA2 = zzA(this.zzZ, i23);
                this.zzZ = iArrZzA2;
                if (i22 == 2) {
                    int i24 = (i11 - this.zzab) - 4;
                    int i25 = this.zzY;
                    Arrays.fill(iArrZzA2, 0, i25, i24 / i25);
                } else if (i22 == 1) {
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 4;
                    while (true) {
                        i13 = this.zzY - 1;
                        if (i26 >= i13) {
                            break;
                        }
                        this.zzZ[i26] = 0;
                        do {
                            i28++;
                            zzt(zzafzVar, i28);
                            i14 = zzetVar3.zzi()[i28 - 1] & 255;
                            int[] iArr = this.zzZ;
                            i15 = iArr[i26] + i14;
                            iArr[i26] = i15;
                        } while (i14 == 255);
                        i27 += i15;
                        i26++;
                    }
                    this.zzZ[i13] = ((i11 - this.zzab) - i28) - i27;
                } else {
                    if (i22 != 3) {
                        throw zzat.zzb("Unexpected lacing value: 2", null);
                    }
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 4;
                    while (true) {
                        int i32 = this.zzY - 1;
                        if (i29 >= i32) {
                            this.zzZ[i32] = ((i11 - this.zzab) - i31) - i30;
                            break;
                        }
                        this.zzZ[i29] = i20;
                        i31++;
                        zzt(zzafzVar, i31);
                        int i33 = i31 - 1;
                        if (zzetVar3.zzi()[i33] == 0) {
                            throw zzat.zzb("No valid varint length mask found", th);
                        }
                        int i34 = i20;
                        while (true) {
                            if (i34 >= i21) {
                                j10 = 0;
                                break;
                            }
                            int i35 = i19 << (7 - i34);
                            if ((zzetVar3.zzi()[i33] & i35) != 0) {
                                int i36 = i31 + i34;
                                zzt(zzafzVar, i36);
                                j10 = (~i35) & zzetVar3.zzi()[i33] & 255;
                                int i37 = i33 + 1;
                                while (i37 < i36) {
                                    j10 = (j10 << 8) | ((long) (zzetVar3.zzi()[i37] & 255));
                                    i37++;
                                    i36 = i36;
                                }
                                int i38 = i36;
                                if (i29 > 0) {
                                    j10 -= (1 << ((i34 * 7) + 6)) - 1;
                                }
                                i31 = i38;
                                break;
                            }
                            i34++;
                            i19 = 1;
                            i21 = 8;
                        }
                        if (j10 < -2147483648L || j10 > 2147483647L) {
                            throw zzat.zzb("EBML lacing sample size out of range.", null);
                        }
                        int[] iArr2 = this.zzZ;
                        int i39 = (int) j10;
                        if (i29 != 0) {
                            i39 += iArr2[i29 - 1];
                        }
                        iArr2[i29] = i39;
                        i30 += i39;
                        i29++;
                        th = null;
                        i19 = 1;
                        i20 = 0;
                        i21 = 8;
                    }
                }
            }
            this.zzV = this.zzS + zzz((zzetVar3.zzi()[0] << 8) | (zzetVar3.zzi()[1] & 255));
            if (zzakgVar3.zze != 1) {
                if (i18 == 163) {
                    i16 = 2;
                    if ((zzetVar3.zzi()[2] & 128) == 128) {
                        i18 = 163;
                    } else {
                        i18 = 163;
                    }
                } else {
                    i16 = 2;
                }
                i17 = 0;
                this.zzac = i17;
                this.zzU = i16;
                this.zzX = 0;
                i12 = 163;
            } else {
                i16 = 2;
            }
            i17 = 1;
            this.zzac = i17;
            this.zzU = i16;
            this.zzX = 0;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i18 == i12) {
            while (true) {
                int i40 = this.zzX;
                if (i40 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                zzs(zzakgVar3, ((long) ((this.zzX * zzakgVar3.zzf) / 1000)) + this.zzV, this.zzac, zzu(zzafzVar, zzakgVar3, this.zzZ[i40], false), 0);
                this.zzX++;
            }
        } else {
            while (true) {
                int i41 = this.zzX;
                if (i41 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i41] = zzu(zzafzVar, zzakgVar3, iArr3[i41], true);
                this.zzX++;
            }
        }
    }

    zzakh(zzaka zzakaVar, int i10, zzanj zzanjVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzakaVar;
        zzakaVar.zza(new zzakc(this, null));
        this.zzl = zzanjVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i10 & 1) ^ 1);
        this.zzk = (i10 & 2) == 0;
        this.zzh = new zzakj();
        this.zzi = new SparseArray();
        this.zzo = new zzet(4);
        this.zzp = new zzet(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzet(4);
        this.zzm = new zzet(zzgp.zza);
        this.zzn = new zzet(4);
        this.zzr = new zzet();
        this.zzs = new zzet();
        this.zzt = new zzet(8);
        this.zzu = new zzet();
        this.zzv = new zzet();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    private final int zzu(zzafz zzafzVar, zzakg zzakgVar, int i10, boolean z10) throws IOException {
        int i11;
        String str = zzakgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzafzVar, zzb, i10);
            int i12 = this.zzah;
            zzv();
            return i12;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzafzVar, zzd, i10);
            int i13 = this.zzah;
            zzv();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzafzVar, zze, i10);
            int i14 = this.zzah;
            zzv();
            return i14;
        }
        if (zzakgVar.zzU) {
            zzakgVar.zzY.getClass();
            int i15 = zzafx.zza;
            zzet zzetVar = new zzet(i10);
            if (zzafzVar.zzh(zzetVar.zzi(), 0, i10, true)) {
                zzafzVar.zzl();
                if (zzafx.zza(zzetVar.zzr()) == 1 && zzetVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzetVar.zzm(bArr, 0, 10);
                    zzetVar.zzh(0);
                    int iZzc = zzafx.zzc(bArr);
                    if (zzetVar.zzd() >= iZzc + 4) {
                        zzetVar.zzk(iZzc);
                        if (zzafx.zza(zzetVar.zzB()) == 2) {
                            zzt zztVarZza = zzakgVar.zzY.zza();
                            zztVarZza.zzo(UyXgnuLGEkgnZE.rvWAiikeYkzf);
                            zzakgVar.zzY = zztVarZza.zzO();
                        }
                    }
                }
            }
            zzakgVar.zzX.zzA(zzakgVar.zzY);
            zzakgVar.zzU = false;
            zzB();
        }
        zzahk zzahkVar = zzakgVar.zzX;
        if (!this.zzaj) {
            if (zzakgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzet zzetVar2 = this.zzo;
                    zzafzVar.zzc(zzetVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzetVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzetVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b10 = this.zzan;
                if ((b10 & 1) == 1) {
                    int i16 = b10 & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzet zzetVar3 = this.zzt;
                        zzafzVar.zzc(zzetVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzet zzetVar4 = this.zzo;
                        zzetVar4.zzi()[0] = (byte) ((i16 != 2 ? 0 : 128) | 8);
                        zzetVar4.zzh(0);
                        zzahkVar.zzd(zzetVar4, 1, 1);
                        this.zzah++;
                        zzetVar3.zzh(0);
                        zzahkVar.zzd(zzetVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i16 == 2) {
                        if (!this.zzal) {
                            zzet zzetVar5 = this.zzo;
                            zzafzVar.zzc(zzetVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzetVar5.zzh(0);
                            this.zzam = zzetVar5.zzs();
                            this.zzal = true;
                        }
                        int i17 = this.zzam * 4;
                        zzet zzetVar6 = this.zzo;
                        zzetVar6.zza(i17);
                        zzafzVar.zzc(zzetVar6.zzi(), 0, i17);
                        this.zzag += i17;
                        int i18 = (this.zzam >> 1) + 1;
                        int i19 = (i18 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i19) {
                            this.zzw = ByteBuffer.allocate(i19);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i18);
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            i11 = this.zzam;
                            if (i20 >= i11) {
                                break;
                            }
                            int iZzH = zzetVar6.zzH();
                            int i22 = iZzH - i21;
                            if (i20 % 2 == 0) {
                                this.zzw.putShort((short) i22);
                            } else {
                                this.zzw.putInt(i22);
                            }
                            i20++;
                            i21 = iZzH;
                        }
                        int i23 = (i10 - this.zzag) - i21;
                        if ((i11 & 1) == 1) {
                            this.zzw.putInt(i23);
                        } else {
                            this.zzw.putShort((short) i23);
                            this.zzw.putInt(0);
                        }
                        zzet zzetVar7 = this.zzu;
                        zzetVar7.zzb(this.zzw.array(), i19);
                        zzahkVar.zzd(zzetVar7, i19, 1);
                        this.zzah += i19;
                    }
                }
            } else {
                byte[] bArr2 = zzakgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzakgVar.zzc) ? zzakgVar.zzg > 0 : z10) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i10) - this.zzag;
                zzet zzetVar8 = this.zzo;
                zzetVar8.zza(4);
                zzetVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzetVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzetVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzetVar8.zzi()[3] = (byte) (iZze & 255);
                zzahkVar.zzd(zzetVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzet zzetVar9 = this.zzr;
        int iZze2 = i10 + zzetVar9.zze();
        String str2 = zzakgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzakgVar.zzT != null) {
                zzgtj.zzi(zzetVar9.zze() == 0);
                zzakgVar.zzT.zzb(zzafzVar);
            }
            while (true) {
                int i24 = this.zzag;
                if (i24 >= iZze2) {
                    break;
                }
                int iZzy = zzy(zzafzVar, zzahkVar, iZze2 - i24);
                this.zzag += iZzy;
                this.zzah += iZzy;
            }
        } else {
            zzet zzetVar10 = this.zzn;
            byte[] bArrZzi = zzetVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i25 = zzakgVar.zzZ;
            int i26 = 4 - i25;
            while (this.zzag < iZze2) {
                int i27 = this.zzai;
                if (i27 == 0) {
                    int iMin = Math.min(i25, zzetVar9.zzd());
                    zzafzVar.zzc(bArrZzi, i26 + iMin, i25 - iMin);
                    if (iMin > 0) {
                        zzetVar9.zzm(bArrZzi, i26, iMin);
                    }
                    this.zzag += i25;
                    zzetVar10.zzh(0);
                    this.zzai = zzetVar10.zzH();
                    zzet zzetVar11 = this.zzm;
                    zzetVar11.zzh(0);
                    zzahkVar.zzc(zzetVar11, 4);
                    this.zzah += 4;
                } else {
                    int iZzy2 = zzy(zzafzVar, zzahkVar, i27);
                    this.zzag += iZzy2;
                    this.zzah += iZzy2;
                    this.zzai -= iZzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzakgVar.zzc)) {
            zzet zzetVar12 = this.zzp;
            zzetVar12.zzh(0);
            zzahkVar.zzc(zzetVar12, 4);
            this.zzah += 4;
        }
        int i28 = this.zzah;
        zzv();
        return i28;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    protected final void zzi(int i10) throws zzat {
        int i11;
        int i12;
        SparseArray sparseArray;
        List list;
        SparseArray sparseArray2;
        zzakg zzakgVar;
        long jZza;
        long jZzb;
        long jZzb2;
        long jZza2;
        zzakg zzakgVar2;
        zzap zzapVar;
        zzaiz zzaizVar;
        zzap zzapVarZzg;
        this.zzap.getClass();
        byte b10 = 8;
        int i13 = 2;
        if (i10 == 160) {
            if (this.zzU == 2) {
                zzakg zzakgVar3 = (zzakg) this.zzi.get(this.zzaa);
                zzakgVar3.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzakgVar3.zzc)) {
                    zzet zzetVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzetVar.zzb(bArrArray, bArrArray.length);
                }
                int i14 = 0;
                for (int i15 = 0; i15 < this.zzY; i15++) {
                    i14 += this.zzZ[i15];
                }
                int i16 = 0;
                while (i16 < this.zzY) {
                    long j10 = this.zzV + ((long) ((zzakgVar3.zzf * i16) / 1000));
                    int i17 = this.zzac;
                    if (i16 == 0) {
                        if (!this.zzae) {
                            i17 |= 1;
                        }
                        i11 = 0;
                    } else {
                        i11 = i16;
                    }
                    int i18 = this.zzZ[i11];
                    int i19 = i14 - i18;
                    zzs(zzakgVar3, j10, i17, i18, i19);
                    i16 = i11 + 1;
                    i14 = i19;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        int i20 = -1;
        if (i10 == 174) {
            zzakg zzakgVar4 = this.zzE;
            zzakgVar4.getClass();
            String str = zzakgVar4.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    b10 = str.equals("V_MPEG4/ISO/AP") ? (byte) 6 : (byte) -1;
                    break;
                case -2095575984:
                    b10 = str.equals("V_MPEG4/ISO/SP") ? (byte) 4 : (byte) -1;
                    break;
                case -1985379776:
                    b10 = str.equals("A_MS/ACM") ? (byte) 23 : (byte) -1;
                    break;
                case -1784763192:
                    b10 = str.equals("A_TRUEHD") ? (byte) 18 : (byte) -1;
                    break;
                case -1730367663:
                    b10 = str.equals("A_VORBIS") ? (byte) 12 : (byte) -1;
                    break;
                case -1482641358:
                    b10 = str.equals("A_MPEG/L2") ? (byte) 14 : (byte) -1;
                    break;
                case -1482641357:
                    b10 = str.equals("A_MPEG/L3") ? (byte) 15 : (byte) -1;
                    break;
                case -1373388978:
                    b10 = str.equals("V_MS/VFW/FOURCC") ? (byte) 9 : (byte) -1;
                    break;
                case -933872740:
                    b10 = str.equals("S_DVBSUB") ? (byte) 33 : (byte) -1;
                    break;
                case -538363189:
                    b10 = str.equals("V_MPEG4/ISO/ASP") ? (byte) 5 : (byte) -1;
                    break;
                case -538363109:
                    b10 = str.equals("V_MPEG4/ISO/AVC") ? (byte) 7 : (byte) -1;
                    break;
                case -425012669:
                    b10 = str.equals(ykDFMuXDQMaR.yeGc) ? (byte) 31 : (byte) -1;
                    break;
                case -356037306:
                    b10 = str.equals("A_DTS/LOSSLESS") ? (byte) 21 : (byte) -1;
                    break;
                case 62923557:
                    b10 = str.equals("A_AAC") ? (byte) 13 : (byte) -1;
                    break;
                case 62923603:
                    b10 = str.equals("A_AC3") ? (byte) 16 : (byte) -1;
                    break;
                case 62927045:
                    b10 = str.equals("A_DTS") ? (byte) 19 : (byte) -1;
                    break;
                case 82318131:
                    b10 = str.equals("V_AV1") ? (byte) 2 : (byte) -1;
                    break;
                case 82338133:
                    b10 = str.equals("V_VP8") ? (byte) 0 : (byte) -1;
                    break;
                case 82338134:
                    b10 = str.equals("V_VP9") ? (byte) 1 : (byte) -1;
                    break;
                case 99146302:
                    b10 = str.equals("S_HDMV/PGS") ? (byte) 32 : (byte) -1;
                    break;
                case 444813526:
                    b10 = str.equals("V_THEORA") ? (byte) 10 : (byte) -1;
                    break;
                case 542569478:
                    b10 = str.equals("A_DTS/EXPRESS") ? (byte) 20 : (byte) -1;
                    break;
                case 635596514:
                    b10 = str.equals("A_PCM/FLOAT/IEEE") ? (byte) 26 : (byte) -1;
                    break;
                case 725948237:
                    b10 = str.equals("A_PCM/INT/BIG") ? (byte) 25 : (byte) -1;
                    break;
                case 725957860:
                    b10 = str.equals("A_PCM/INT/LIT") ? (byte) 24 : (byte) -1;
                    break;
                case 738597099:
                    b10 = str.equals("S_TEXT/ASS") ? (byte) 28 : (byte) -1;
                    break;
                case 738614379:
                    b10 = str.equals("S_TEXT/SSA") ? (byte) 29 : (byte) -1;
                    break;
                case 855502857:
                    if (!str.equals("V_MPEGH/ISO/HEVC")) {
                        b10 = -1;
                    }
                    break;
                case 1045209816:
                    b10 = str.equals("S_TEXT/WEBVTT") ? (byte) 30 : (byte) -1;
                    break;
                case 1422270023:
                    b10 = str.equals("S_TEXT/UTF8") ? (byte) 27 : (byte) -1;
                    break;
                case 1809237540:
                    b10 = str.equals("V_MPEG2") ? (byte) 3 : (byte) -1;
                    break;
                case 1950749482:
                    b10 = str.equals("A_EAC3") ? (byte) 17 : (byte) -1;
                    break;
                case 1950789798:
                    b10 = str.equals("A_FLAC") ? (byte) 22 : (byte) -1;
                    break;
                case 1951062397:
                    b10 = str.equals("A_OPUS") ? (byte) 11 : (byte) -1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                    zzakgVar4.zza(zzakgVar4.zzd);
                    zzakgVar4.zzX = this.zzap.zzu(zzakgVar4.zzd, zzakgVar4.zze);
                    this.zzi.put(zzakgVar4.zzd, zzakgVar4);
                    break;
            }
            this.zzE = null;
            return;
        }
        long j11 = -9223372036854775807L;
        if (i10 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzK == -9223372036854775807L || (i12 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray3 = this.zzI;
            List arrayList = (List) sparseArray3.get(i12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray3.put(this.zzL, arrayList);
            }
            arrayList.add(new zzake(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i10 == 19899) {
            int i21 = this.zzG;
            if (i21 != -1) {
                long j12 = this.zzH;
                if (j12 != -1) {
                    if (i21 == 475249515) {
                        this.zzQ = j12;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            zzq(i10);
            zzakg zzakgVar5 = this.zzE;
            if (zzakgVar5.zzh) {
                if (zzakgVar5.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzakgVar5.zzl = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            zzq(i10);
            zzakg zzakgVar6 = this.zzE;
            if (zzakgVar6.zzh && zzakgVar6.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.zzz == -9223372036854775807L) {
                this.zzz = 1000000L;
            }
            long j13 = this.zzA;
            if (j13 != -9223372036854775807L) {
                this.zzB = zzz(j13);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            SparseArray sparseArray4 = this.zzi;
            if (sparseArray4.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z10 = !this.zzj || this.zzQ == -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            for (int i26 = 0; i26 < sparseArray4.size(); i26++) {
                zzakg zzakgVar7 = (zzakg) sparseArray4.valueAt(i26);
                int i27 = zzakgVar7.zze;
                if (i27 == 2) {
                    if (zzakgVar7.zzW) {
                        i22 = zzakgVar7.zzd;
                    }
                    if (i23 == -1) {
                        i23 = zzakgVar7.zzd;
                    }
                } else if (i27 == 1) {
                    if (zzakgVar7.zzW) {
                        i24 = zzakgVar7.zzd;
                    }
                    if (i25 == -1) {
                        i25 = zzakgVar7.zzd;
                    }
                }
                if (z10) {
                    zzakgVar7.zzb();
                    if (!zzakgVar7.zzU) {
                        zzahk zzahkVar = zzakgVar7.zzX;
                        zzv zzvVar = zzakgVar7.zzY;
                        zzvVar.getClass();
                        zzahkVar.zzA(zzvVar);
                    }
                }
            }
            if (i22 != -1) {
                this.zzO = i22;
            } else if (i23 != -1) {
                this.zzO = i23;
            } else if (i24 != -1) {
                this.zzO = i24;
            } else if (i25 != -1) {
                this.zzO = i25;
            } else {
                this.zzO = sparseArray4.size() > 0 ? ((zzakg) sparseArray4.valueAt(0)).zzd : -1;
            }
            if (z10) {
                zzB();
                return;
            }
            return;
        }
        if (i10 != 475249515 || this.zzF) {
            return;
        }
        int i28 = 0;
        while (true) {
            sparseArray = this.zzI;
            if (i28 < sparseArray.size()) {
                if (!((List) sparseArray.valueAt(i28)).isEmpty()) {
                    if (this.zzB != j11) {
                        for (int i29 = 0; i29 < sparseArray.size(); i29++) {
                            Collections.sort((List) sparseArray.valueAt(i29));
                        }
                        this.zzap.zzw(new zzakf(sparseArray, this.zzB, this.zzO, this.zzy, this.zzx));
                        break;
                    }
                    break;
                }
                i28++;
                j11 = -9223372036854775807L;
            }
            this.zzap.zzw(new zzaha(this.zzB, 0L));
            break;
        }
        this.zzF = true;
        this.zzJ = false;
        int i30 = 0;
        while (true) {
            SparseArray sparseArray5 = this.zzi;
            if (i30 >= sparseArray5.size()) {
                zzB();
                return;
            }
            zzakg zzakgVar8 = (zzakg) sparseArray5.valueAt(i30);
            long j14 = this.zzB;
            long j15 = this.zzy;
            long j16 = this.zzx;
            if (zzakgVar8.zze != i13 || (list = (List) sparseArray.get(zzakgVar8.zzd)) == null || list.isEmpty()) {
                sparseArray2 = sparseArray;
                zzakgVar2 = zzakgVar8;
            } else {
                if (list.isEmpty()) {
                    sparseArray2 = sparseArray;
                    zzakgVar = zzakgVar8;
                } else {
                    int iMin = Math.min(list.size(), 20);
                    double d10 = 0.0d;
                    int i31 = i20;
                    int i32 = 0;
                    while (i32 < iMin) {
                        zzake zzakeVar = (zzake) list.get(i32);
                        if (zzakeVar.zza() > 10000000) {
                            break;
                        }
                        int i33 = i32 + 1;
                        SparseArray sparseArray6 = sparseArray;
                        if (i32 < list.size() - 1) {
                            zzake zzakeVar2 = (zzake) list.get(i33);
                            jZzb = zzakeVar2.zzb() + zzakeVar2.zzc();
                            jZzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                            jZza2 = zzakeVar2.zza() - zzakeVar.zza();
                        } else {
                            jZzb = j15 + j16;
                            jZzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                            jZza2 = j14 - zzakeVar.zza();
                        }
                        long j17 = jZzb - jZzb2;
                        zzakg zzakgVar9 = zzakgVar8;
                        long j18 = j15;
                        long j19 = jZza2;
                        if (j19 > 0) {
                            double d11 = j17 / j19;
                            if (d11 > d10) {
                                d10 = d11;
                                i31 = i32;
                            }
                        }
                        zzakgVar8 = zzakgVar9;
                        i32 = i33;
                        sparseArray = sparseArray6;
                        j15 = j18;
                        i20 = -1;
                    }
                    sparseArray2 = sparseArray;
                    zzakgVar = zzakgVar8;
                    if (i31 != i20) {
                        jZza = ((zzake) list.get(i31)).zza();
                    }
                    zzakgVar2 = zzakgVar;
                    if (jZza != -9223372036854775807L) {
                        zzv zzvVar2 = zzakgVar2.zzY;
                        zzvVar2.getClass();
                        zzapVar = zzvVar2.zzl;
                        zzaizVar = new zzaiz(jZza);
                        if (zzapVar == null) {
                            zzapVarZzg = new zzap(-9223372036854775807L, zzaizVar);
                        } else {
                            zzapVarZzg = zzapVar.zzg(zzaizVar);
                        }
                        zzt zztVarZza = zzakgVar2.zzY.zza();
                        zztVarZza.zzl(zzapVarZzg);
                        zzakgVar2.zzY = zztVarZza.zzO();
                    }
                }
                jZza = -9223372036854775807L;
                zzakgVar2 = zzakgVar;
                if (jZza != -9223372036854775807L) {
                    zzv zzvVar3 = zzakgVar2.zzY;
                    zzvVar3.getClass();
                    zzapVar = zzvVar3.zzl;
                    zzaizVar = new zzaiz(jZza);
                    if (zzapVar == null) {
                        zzapVarZzg = new zzap(-9223372036854775807L, zzaizVar);
                    } else {
                        zzapVarZzg = zzapVar.zzg(zzaizVar);
                    }
                    zzt zztVarZza2 = zzakgVar2.zzY.zza();
                    zztVarZza2.zzl(zzapVarZzg);
                    zzakgVar2.zzY = zztVarZza2.zzO();
                }
            }
            if (!zzakgVar2.zzU) {
                zzakgVar2.zzb();
                zzahk zzahkVar2 = zzakgVar2.zzX;
                zzv zzvVar4 = zzakgVar2.zzY;
                zzvVar4.getClass();
                zzahkVar2.zzA(zzvVar4);
            }
            i30++;
            sparseArray = sparseArray2;
            i13 = 2;
            i20 = -1;
        }
    }

    protected final void zzj(int i10, long j10) throws zzat {
        boolean z10;
        if (i10 == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzN == -1) {
                this.zzN = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzM == -1) {
                this.zzM = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw zzat.zzb(sb3.toString(), null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i11 = (int) j10;
                if (i11 == 1) {
                    zzq(i10);
                    this.zzE.zze = 2;
                    return;
                }
                if (i11 == 2) {
                    zzq(i10);
                    this.zzE.zze = 1;
                    return;
                } else if (i11 == 17) {
                    zzq(i10);
                    this.zzE.zze = 3;
                    return;
                } else if (i11 != 33) {
                    zzq(i10);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i10);
                    this.zzE.zze = 5;
                    return;
                }
            case PRIVACY_URL_ERROR_VALUE:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzW = z10;
                return;
            case 155:
                this.zzW = zzz(j10);
                return;
            case 159:
                zzq(i10);
                this.zzE.zzO = (int) j10;
                return;
            case 176:
                zzq(i10);
                this.zzE.zzm = (int) j10;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzK = zzz(j10);
                return;
            case 186:
                zzq(i10);
                this.zzE.zzn = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i10);
                this.zzE.zzd = (int) j10;
                return;
            case 231:
                this.zzS = zzz(j10);
                return;
            case 238:
                this.zzad = (int) j10;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzL = (int) j10;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i10);
                this.zzE.zzd((int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw zzat.zzb(sb4.toString(), null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw zzat.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append(UICvx.tqQ);
                sb7.append(j10);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw zzat.zzb(sb8.toString(), null);
            case 21420:
                this.zzH = j10 + this.zzy;
                return;
            case 21432:
                int i12 = (int) j10;
                zzq(i10);
                if (i12 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i12 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i10);
                this.zzE.zzp = (int) j10;
                return;
            case 21682:
                zzq(i10);
                this.zzE.zzr = (int) j10;
                return;
            case 21690:
                zzq(i10);
                this.zzE.zzq = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzV = z10;
                return;
            case 21938:
                zzq(i10);
                this.zzE.zzo = (int) j10;
                return;
            case 21998:
                zzq(i10);
                this.zzE.zzg = (int) j10;
                return;
            case 22186:
                zzq(i10);
                this.zzE.zzR = j10;
                return;
            case 22203:
                zzq(i10);
                this.zzE.zzS = j10;
                return;
            case 25188:
                zzq(i10);
                this.zzE.zzP = (int) j10;
                return;
            case 30114:
                this.zzaf = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                zzq(i10);
                if (i13 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i13 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i13 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i10);
                this.zzE.zzf = (int) j10;
                return;
            case 2807729:
                this.zzz = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        zzq(i10);
                        if (i14 == 1) {
                            this.zzE.zzA = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.zzE.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzq(i10);
                        int iZzc = zzi.zzc((int) j10);
                        if (iZzc != -1) {
                            this.zzE.zzz = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i10);
                        int iZzb = zzi.zzb((int) j10);
                        if (iZzb != -1) {
                            this.zzE.zzy = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i10);
                        this.zzE.zzB = (int) j10;
                        return;
                    case 21949:
                        zzq(i10);
                        this.zzE.zzC = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public zzakh(zzanj zzanjVar, int i10) {
        this(new zzaka(), 0, zzanjVar);
    }
}

package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaor {
    private boolean zzd;
    private boolean zze;
    private int[] zzf;
    private int zzg;
    private int zzh;
    private Rect zzi;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;
    private final int[] zza = new int[4];
    private int zzj = -1;
    private int zzk = -1;

    private static int zzg(int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            i10 = 0;
        }
        return iArr[i10];
    }

    private static int zzh(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    private final void zzi(zzes zzesVar, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int i12 = !z10 ? 1 : 0;
        int iWidth = rect.width();
        int i13 = i12 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i14 = 0;
            do {
                int i15 = 1;
                int iZzj = 0;
                while (true) {
                    if (iZzj >= i15 || i15 > 64) {
                        i10 = iZzj & 3;
                        if (iZzj >= 4) {
                            i11 = iZzj >> 2;
                            break;
                        } else {
                            i11 = iWidth;
                            break;
                        }
                    }
                    if (zzesVar.zzc() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    } else {
                        iZzj = (iZzj << 4) | zzesVar.zzj(4);
                        i15 <<= 2;
                    }
                }
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i16 = i13 + iMin;
                    Arrays.fill(iArr, i13, i16, this.zza[i10]);
                    i14 += iMin;
                    i13 = i16;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            zzesVar.zzm();
        }
    }

    public final void zza(String str) {
        int i10;
        String strTrim = str.trim();
        String str2 = zzfl.zza;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] strArrSplit = str3.substring(9).split(",", -1);
                this.zzf = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int[] iArr = this.zzf;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                    } catch (RuntimeException e10) {
                        zzeg.zzd("VobsubParser", "Parsing color failed", e10);
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str3.startsWith("size: ")) {
                String[] strArrSplit2 = str3.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    StringBuilder sb2 = new StringBuilder(str3.length() + 36);
                    sb2.append("Ignoring malformed IDX size line: '");
                    sb2.append(str3);
                    sb2.append("'");
                    zzeg.zzc("VobsubParser", sb2.toString());
                } else {
                    try {
                        this.zzg = Integer.parseInt(strArrSplit2[0]);
                        this.zzh = Integer.parseInt(strArrSplit2[1]);
                        this.zzd = true;
                    } catch (RuntimeException e11) {
                        zzeg.zzd("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    public final zzcx zzb(zzet zzetVar) {
        Rect rect;
        if (this.zzf == null || !this.zzd || !this.zze || (rect = this.zzi) == null || this.zzj == -1 || this.zzk == -1 || rect.width() < 2 || this.zzi.height() < 2) {
            return null;
        }
        Rect rect2 = this.zzi;
        int[] iArr = new int[rect2.width() * rect2.height()];
        zzes zzesVar = new zzes();
        zzetVar.zzh(this.zzj);
        zzesVar.zza(zzetVar);
        zzi(zzesVar, true, rect2, iArr);
        zzetVar.zzh(this.zzk);
        zzesVar.zza(zzetVar);
        zzi(zzesVar, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(rect2.left / this.zzg);
        zzcwVar.zzj(0);
        zzcwVar.zzf(rect2.top / this.zzh, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(rect2.width() / this.zzg);
        zzcwVar.zzn(rect2.height() / this.zzh);
        return zzcwVar.zzr();
    }

    public final void zzc() {
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
        this.zze = false;
        this.zzi = null;
        this.zzj = -1;
        this.zzk = -1;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0069. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:24:0x0056 for B:30:0x0069 already processed. Defaulting to fallback option. */
    final /* synthetic */ void zzd(zzet zzetVar) {
        boolean z10;
        if (this.zzf == null) {
            zzeg.zzc("VobsubParser", "Skipping SPU (no palette)");
            return;
        }
        if (!this.zzd) {
            zzeg.zzc("VobsubParser", "Skipping SPU (no plane)");
            return;
        }
        int iZzg = zzetVar.zzg() - 2;
        zzetVar.zzh(zzetVar.zzt() + iZzg);
        do {
            int i10 = 4;
            if (zzetVar.zzd() < 4) {
                z10 = false;
            } else {
                int iZzg2 = zzetVar.zzg();
                int iZzt = zzetVar.zzt() * 10000;
                int iZzt2 = zzetVar.zzt() + iZzg;
                boolean z11 = iZzt2 != iZzg2 && iZzt2 < zzetVar.zze();
                int iZze = z11 ? iZzt2 : zzetVar.zze();
                while (true) {
                    boolean z12 = true;
                    while (true) {
                        if (zzetVar.zzg() >= iZze && z12) {
                            long j10 = iZzt;
                            int iZzs = zzetVar.zzs();
                            if (iZzs != 255) {
                                switch (iZzs) {
                                    case 0:
                                        break;
                                    case 1:
                                        this.zzb = j10;
                                        z12 = true;
                                        i10 = 4;
                                        break;
                                    case 2:
                                        this.zzc = j10;
                                        z12 = true;
                                        i10 = 4;
                                        break;
                                    case 3:
                                        if (zzetVar.zzd() >= 2) {
                                            int iZzs2 = zzetVar.zzs();
                                            int iZzs3 = zzetVar.zzs();
                                            int[] iArr = this.zza;
                                            iArr[3] = zzg(this.zzf, iZzs2 >> 4);
                                            iArr[2] = zzg(this.zzf, iZzs2 & 15);
                                            iArr[1] = zzg(this.zzf, iZzs3 >> 4);
                                            iArr[0] = zzg(this.zzf, iZzs3 & 15);
                                            this.zze = true;
                                            z12 = true;
                                            i10 = 4;
                                        } else {
                                            zzeg.zzc("VobsubParser", "Incomplete color command");
                                            i10 = 4;
                                            z12 = false;
                                        }
                                        break;
                                    case 4:
                                        if (zzetVar.zzd() < 2) {
                                            zzeg.zzc("VobsubParser", "Incomplete alpha command");
                                        } else if (this.zze) {
                                            int iZzs4 = zzetVar.zzs();
                                            int iZzs5 = zzetVar.zzs();
                                            int[] iArr2 = this.zza;
                                            iArr2[3] = zzh(iArr2[3], iZzs4 >> 4);
                                            iArr2[2] = zzh(iArr2[2], iZzs4 & 15);
                                            iArr2[1] = zzh(iArr2[1], iZzs5 >> 4);
                                            iArr2[0] = zzh(iArr2[0], iZzs5 & 15);
                                            z12 = true;
                                            i10 = 4;
                                        } else {
                                            zzeg.zzc("VobsubParser", "Ignoring alpha command before color command");
                                        }
                                        i10 = 4;
                                        z12 = false;
                                        break;
                                    case 5:
                                        if (zzetVar.zzd() >= 6) {
                                            int iZzs6 = zzetVar.zzs();
                                            int iZzs7 = zzetVar.zzs();
                                            int i11 = iZzs7 >> 4;
                                            int iZzs8 = ((iZzs7 & 15) << 8) | zzetVar.zzs();
                                            int iZzs9 = zzetVar.zzs();
                                            int iZzs10 = zzetVar.zzs();
                                            this.zzi = new Rect((iZzs6 << i10) | i11, (iZzs9 << i10) | (iZzs10 >> 4), iZzs8 + 1, (((iZzs10 & 15) << 8) | zzetVar.zzs()) + 1);
                                            z12 = true;
                                            i10 = 4;
                                        } else {
                                            zzeg.zzc("VobsubParser", "Incomplete area command");
                                            z12 = false;
                                        }
                                        break;
                                    case 6:
                                        if (zzetVar.zzd() >= i10) {
                                            this.zzj = zzetVar.zzt();
                                            this.zzk = zzetVar.zzt();
                                        } else {
                                            zzeg.zzc("VobsubParser", "Incomplete offsets command");
                                            z12 = false;
                                        }
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzs).length() + 22);
                                        sb2.append("Unrecognized command: ");
                                        sb2.append(iZzs);
                                        zzeg.zzc("VobsubParser", sb2.toString());
                                        z12 = false;
                                        break;
                                }
                                if (zzetVar.zzg() >= iZze) {
                                }
                            } else {
                                z12 = false;
                            }
                        }
                    }
                }
                if (z11) {
                    zzetVar.zzh(iZzt2);
                }
                z10 = z11;
            }
        } while (z10);
    }

    final /* synthetic */ long zze() {
        return this.zzb;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }
}

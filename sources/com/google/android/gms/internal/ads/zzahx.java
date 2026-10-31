package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzahx implements zzahq {
    public final zzgwm zza;
    private final int zzb;

    private zzahx(int i10, zzgwm zzgwmVar) {
        this.zzb = i10;
        this.zza = zzgwmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzahx zzb(int i10, zzet zzetVar) {
        String str;
        zzahq zzahyVar;
        String str2;
        zzgwj zzgwjVar = new zzgwj();
        int iZze = zzetVar.zze();
        int iZzc = -2;
        while (zzetVar.zzd() > 8) {
            int iZzC = zzetVar.zzC();
            int iZzg = zzetVar.zzg() + zzetVar.zzC();
            zzetVar.zzf(iZzg);
            if (iZzC != 1414744396) {
                zzahy zzahyVar2 = null;
                switch (iZzC) {
                    case 1718776947:
                        if (iZzc != 2) {
                            if (iZzc == 1) {
                                int iZzu = zzetVar.zzu();
                                if (iZzu == 1) {
                                    str = "audio/raw";
                                } else if (iZzu == 85) {
                                    str = "audio/mpeg";
                                } else if (iZzu == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iZzu != 8192) {
                                    str = iZzu != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iZzu2 = zzetVar.zzu();
                                    int iZzC2 = zzetVar.zzC();
                                    zzetVar.zzk(6);
                                    int iZzB = zzfl.zzB(zzetVar.zzu(), ByteOrder.LITTLE_ENDIAN);
                                    int iZzu3 = zzetVar.zzd() > 0 ? zzetVar.zzu() : 0;
                                    zzt zztVar = new zzt();
                                    zztVar.zzo(str);
                                    zztVar.zzG(iZzu2);
                                    zztVar.zzH(iZzC2);
                                    if (str.equals("audio/raw") && iZzB != 0) {
                                        zztVar.zzI(iZzB);
                                    }
                                    if (str.equals("audio/mp4a-latm") && iZzu3 > 0) {
                                        byte[] bArr = new byte[iZzu3];
                                        zzetVar.zzm(bArr, 0, iZzu3);
                                        zztVar.zzr(zzgwm.zzj(bArr));
                                    }
                                    zzahyVar = new zzahy(zztVar.zzO());
                                } else {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzu).length() + 43);
                                    sb2.append("Ignoring track with unsupported format tag ");
                                    sb2.append(iZzu);
                                    zzeg.zzc("StreamFormatChunk", sb2.toString());
                                }
                            } else {
                                zzeg.zzc("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfl.zzS(iZzc)));
                            }
                            break;
                        } else {
                            zzetVar.zzk(4);
                            int iZzC3 = zzetVar.zzC();
                            int iZzC4 = zzetVar.zzC();
                            zzetVar.zzk(4);
                            int iZzC5 = zzetVar.zzC();
                            switch (iZzC5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzC5).length() + 44);
                                sb3.append("Ignoring track with unsupported compression ");
                                sb3.append(iZzC5);
                                zzeg.zzc("StreamFormatChunk", sb3.toString());
                            } else {
                                zzt zztVar2 = new zzt();
                                zztVar2.zzv(iZzC3);
                                zztVar2.zzw(iZzC4);
                                zztVar2.zzo(str2);
                                zzahyVar2 = new zzahy(zztVar2.zzO());
                            }
                        }
                        zzahyVar = zzahyVar2;
                        break;
                    case 1751742049:
                        zzahyVar = zzahu.zzb(zzetVar);
                        break;
                    case 1752331379:
                        zzahyVar = zzahv.zzb(zzetVar);
                        break;
                    case 1852994675:
                        zzahyVar = zzahz.zzb(zzetVar);
                        break;
                    default:
                        zzahyVar = zzahyVar2;
                        break;
                }
            } else {
                zzahyVar = zzb(zzetVar.zzC(), zzetVar);
            }
            if (zzahyVar != null) {
                if (zzahyVar.zza() == 1752331379) {
                    iZzc = ((zzahv) zzahyVar).zzc();
                }
                zzgwjVar.zzf(zzahyVar);
            }
            zzetVar.zzh(iZzg);
            zzetVar.zzf(iZze);
        }
        return new zzahx(i10, zzgwjVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzahq
    public final int zza() {
        return this.zzb;
    }

    public final zzahq zzc(Class cls) {
        zzgwm zzgwmVar = this.zza;
        int size = zzgwmVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzahq zzahqVar = (zzahq) zzgwmVar.get(i10);
            i10++;
            if (zzahqVar.getClass() == cls) {
                return zzahqVar;
            }
        }
        return null;
    }
}

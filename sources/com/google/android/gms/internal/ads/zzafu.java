package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzafu implements zzage {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzaft zzc = new zzaft(zzafr.zza);
    private static final zzaft zzd = new zzaft(zzafq.zza);
    private zzgwm zze;
    private final zzanj zzf = new zzane();

    private final void zzc(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new zzapi());
                break;
            case 1:
                list.add(new zzapl());
                break;
            case 2:
                list.add(new zzapo(0));
                break;
            case 3:
                list.add(new zzahp(0));
                break;
            case 4:
                zzafy zzafyVarZza = zzc.zza(0);
                if (zzafyVarZza == null) {
                    list.add(new zzaig(0));
                } else {
                    list.add(zzafyVarZza);
                }
                break;
            case 5:
                list.add(new zzaij());
                break;
            case 6:
                list.add(new zzakh(this.zzf, 0));
                break;
            case 7:
                list.add(new zzakp(0));
                break;
            case 8:
                zzanj zzanjVar = this.zzf;
                list.add(new zzalr(zzanjVar, 704, null, null, zzgwm.zzi(), null));
                list.add(new zzamc(zzanjVar, 160));
                break;
            case 9:
                list.add(new zzams());
                break;
            case 10:
                list.add(new zzaqs());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgwm.zzi();
                }
                list.add(new zzard(1, 0, this.zzf, new zzfi(0L), new zzapq(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzarq());
                break;
            case 14:
                list.add(new zzaiq(0));
                break;
            case 15:
                zzafy zzafyVarZza2 = zzd.zza(new Object[0]);
                if (zzafyVarZza2 != null) {
                    list.add(zzafyVarZza2);
                }
                break;
            case 16:
                list.add(new zzaht(0, this.zzf));
                break;
            case 17:
                list.add(new zzanc());
                break;
            case 18:
                list.add(new zzarv());
                break;
            case 19:
                list.add(new zzaib());
                break;
            case 20:
                list.add(new zzaip(0));
                break;
            case 21:
                list.add(new zzaia());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final synchronized zzafy[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:141:0x0203  */
    @Override // com.google.android.gms.internal.ads.zzage
    public final synchronized zzafy[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i10;
        int i11;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        if (str != null) {
            switch (zzas.zzh(str)) {
                case "audio/ac3":
                case "audio/eac3":
                case "audio/eac3-joc":
                    i10 = 0;
                    break;
                case "audio/ac4":
                    i10 = 1;
                    break;
                case "audio/amr":
                case "audio/3gpp":
                case "audio/amr-wb":
                    i10 = 3;
                    break;
                case "audio/flac":
                    i10 = 4;
                    break;
                case "video/x-flv":
                    i10 = 5;
                    break;
                case "audio/midi":
                    i10 = 15;
                    break;
                case "video/x-matroska":
                case "audio/x-matroska":
                case "video/webm":
                case "audio/webm":
                case "application/webm":
                    i10 = 6;
                    break;
                case "audio/mpeg":
                    i10 = 7;
                    break;
                case "video/mp4":
                case "audio/mp4":
                case "application/mp4":
                    i10 = 8;
                    break;
                case "audio/ogg":
                    i10 = 9;
                    break;
                case "video/mp2p":
                    i10 = 10;
                    break;
                case "video/mp2t":
                    i10 = 11;
                    break;
                case "audio/wav":
                    i10 = 12;
                    break;
                case "text/vtt":
                    i10 = 13;
                    break;
                case "image/jpeg":
                    i10 = 14;
                    break;
                case "video/x-msvideo":
                    i10 = 16;
                    break;
                case "image/png":
                    i10 = 17;
                    break;
                case "image/webp":
                    i10 = 18;
                    break;
                case "image/bmp":
                    i10 = 19;
                    break;
                case "image/heif":
                case "image/heic":
                    i10 = 20;
                    break;
                case "image/avif":
                    i10 = 21;
                    break;
                default:
                    i10 = -1;
                    break;
            }
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            zzc(i10, arrayList);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            i11 = -1;
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            i11 = 0;
        } else if (lastPathSegment.endsWith(".ac4")) {
            i11 = 1;
        } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            i11 = 2;
        } else if (lastPathSegment.endsWith(".amr")) {
            i11 = 3;
        } else if (lastPathSegment.endsWith(".flac")) {
            i11 = 4;
        } else if (lastPathSegment.endsWith(".flv")) {
            i11 = 5;
        } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            i11 = 15;
        } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            i11 = 6;
        } else if (lastPathSegment.endsWith(".mp3")) {
            i11 = 7;
        } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            i11 = 8;
        } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            i11 = 9;
        } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            i11 = 10;
        } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            i11 = 11;
        } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            i11 = 12;
        } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            i11 = 13;
        } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            i11 = 14;
        } else if (lastPathSegment.endsWith(".avi")) {
            i11 = 16;
        } else if (lastPathSegment.endsWith(".png")) {
            i11 = 17;
        } else if (lastPathSegment.endsWith(".webp")) {
            i11 = 18;
        } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            i11 = 19;
        } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            i11 = 20;
        } else if (lastPathSegment.endsWith(".avif")) {
            i11 = 21;
        } else {
            i11 = -1;
        }
        if (i11 != -1 && i11 != i10) {
            zzc(i11, arrayList);
        }
        int[] iArr = zzb;
        for (int i12 = 0; i12 < 21; i12++) {
            int i13 = iArr[i12];
            if (i13 != i10 && i13 != i11) {
                zzc(i13, arrayList);
            }
        }
        return (zzafy[]) arrayList.toArray(new zzafy[0]);
    }
}

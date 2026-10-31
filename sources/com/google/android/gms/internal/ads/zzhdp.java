package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.AnalyticsEvents;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhdp implements zzhed {
    private static final Charset zza = Charset.forName(Constants.ENCODING);
    private final InputStream zzb;

    private zzhdp(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzhdp zza(String str) {
        return new zzhdp(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzibg zzibgVar) throws IOException {
        if (!(zzibgVar instanceof zzibk)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzibgVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhlm.zzc(zzibgVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146  */
    @Override // com.google.android.gms.internal.ads.zzhed
    public final zzhsz zzb() throws IOException {
        byte b10;
        int i10;
        byte b11;
        zzhtm zzhtmVar;
        byte b12;
        zzhsp zzhspVar;
        String str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS;
        String str2 = "keyData";
        try {
            try {
                InputStream inputStream = this.zzb;
                int i11 = zzheo.zza;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i12 = inputStream.read(bArr);
                    InputStream inputStream2 = inputStream;
                    if (i12 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i12);
                    inputStream = inputStream2;
                }
                zzibi zzibiVarZze = zzhlm.zzb(new String(byteArrayOutputStream.toByteArray(), zza)).zze();
                if (!zzibiVarZze.zzc(SDKConstants.PARAM_KEY)) {
                    throw new zzibj("invalid keyset: no key");
                }
                zzibg zzibgVarZzh = zzibiVarZze.zzh(SDKConstants.PARAM_KEY);
                if (!(zzibgVarZzh instanceof zzibf)) {
                    throw new zzibj("invalid keyset: key must be an array");
                }
                zzibf zzibfVarZzf = zzibgVarZzh.zzf();
                if (zzibfVarZzf.zzb() == 0) {
                    throw new zzibj("invalid keyset: key is empty");
                }
                zzhsw zzhswVarZzh = zzhsz.zzh();
                if (zzibiVarZze.zzc("primaryKeyId")) {
                    zzhswVarZzh.zza(zzc(zzibiVarZze.zzh("primaryKeyId")));
                }
                int i13 = 0;
                while (i13 < zzibfVarZzf.zzb()) {
                    zzibi zzibiVarZze2 = zzibfVarZzf.zzc(i13).zze();
                    if (!zzibiVarZze2.zzc(str2) || !zzibiVarZze2.zzc(str) || !zzibiVarZze2.zzc("keyId") || !zzibiVarZze2.zzc("outputPrefixType")) {
                        throw new zzibj("invalid key");
                    }
                    zzibg zzibgVarZzh2 = zzibiVarZze2.zzh(str2);
                    if (!(zzibgVarZzh2 instanceof zzibi)) {
                        throw new zzibj("invalid key: keyData must be an object");
                    }
                    zzhsx zzhsxVarZze = zzhsy.zze();
                    String strZzd = zzibiVarZze2.zzh(str).zzd();
                    String str3 = str;
                    int iHashCode = strZzd.hashCode();
                    String str4 = str2;
                    zzibf zzibfVar = zzibfVarZzf;
                    if (iHashCode != -891611359) {
                        if (iHashCode != 478389753) {
                            if (iHashCode == 1053567612 && strZzd.equals("DISABLED")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                        } else if (strZzd.equals("DESTROYED")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (strZzd.equals("ENABLED")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        i10 = 3;
                    } else if (b10 == 1) {
                        i10 = 4;
                    } else {
                        if (b10 != 2) {
                            throw new zzibj("unknown status: ".concat(strZzd));
                        }
                        i10 = 5;
                    }
                    zzhsxVarZze.zze(i10);
                    zzhsxVarZze.zzc(zzc(zzibiVarZze2.zzh("keyId")));
                    String strZzd2 = zzibiVarZze2.zzh("outputPrefixType").zzd();
                    switch (strZzd2) {
                        case "LEGACY":
                            b11 = 2;
                            break;
                        case "RAW":
                            b11 = 1;
                            break;
                        case "TINK":
                            b11 = 0;
                            break;
                        case "CRUNCHY":
                            b11 = 3;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    if (b11 == 0) {
                        zzhtmVar = zzhtm.TINK;
                    } else if (b11 == 1) {
                        zzhtmVar = zzhtm.RAW;
                    } else if (b11 == 2) {
                        zzhtmVar = zzhtm.LEGACY;
                    } else {
                        if (b11 != 3) {
                            throw new zzibj("unknown output prefix type: ".concat(strZzd2));
                        }
                        zzhtmVar = zzhtm.CRUNCHY;
                    }
                    zzhsxVarZze.zzd(zzhtmVar);
                    zzibi zzibiVarZze3 = zzibgVarZzh2.zze();
                    if (!zzibiVarZze3.zzc("typeUrl") || !zzibiVarZze3.zzc("value") || !zzibiVarZze3.zzc("keyMaterialType")) {
                        throw new zzibj("invalid keyData");
                    }
                    byte[] bArrZza = zzhzk.zza(zzibiVarZze3.zzh("value").zzd(), 2);
                    zzhso zzhsoVarZzd = zzhsq.zzd();
                    zzhsoVarZzd.zza(zzibiVarZze3.zzh("typeUrl").zzd());
                    zzida zzidaVar = zzida.zza;
                    zzhsoVarZzd.zzb(zzida.zzt(bArrZza, 0, bArrZza.length));
                    String strZzd3 = zzibiVarZze3.zzh("keyMaterialType").zzd();
                    switch (strZzd3) {
                        case "REMOTE":
                            b12 = 3;
                            break;
                        case "SYMMETRIC":
                            b12 = 0;
                            break;
                        case "ASYMMETRIC_PRIVATE":
                            b12 = 1;
                            break;
                        case "ASYMMETRIC_PUBLIC":
                            b12 = 2;
                            break;
                        default:
                            b12 = -1;
                            break;
                    }
                    if (b12 == 0) {
                        zzhspVar = zzhsp.SYMMETRIC;
                    } else if (b12 == 1) {
                        zzhspVar = zzhsp.ASYMMETRIC_PRIVATE;
                    } else if (b12 == 2) {
                        zzhspVar = zzhsp.ASYMMETRIC_PUBLIC;
                    } else {
                        if (b12 != 3) {
                            throw new zzibj("unknown key material type: ".concat(strZzd3));
                        }
                        zzhspVar = zzhsp.REMOTE;
                    }
                    zzhsoVarZzd.zzc(zzhspVar);
                    zzhsxVarZze.zza((zzhsq) zzhsoVarZzd.zzbu());
                    zzhswVarZzh.zzb((zzhsy) zzhsxVarZze.zzbu());
                    i13++;
                    str = str3;
                    str2 = str4;
                    zzibfVarZzf = zzibfVar;
                }
                zzhsz zzhszVar = (zzhsz) zzhswVarZzh.zzbu();
                this.zzb.close();
                return zzhszVar;
            } catch (Throwable th) {
                this.zzb.close();
                throw th;
            }
        } catch (zzibj | IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}

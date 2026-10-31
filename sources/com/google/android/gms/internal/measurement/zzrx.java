package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrx extends zzsy {
    private final Context zza;
    private final zzsx zzb;
    private final Object zzc = new Object();
    private String zzd;

    /* synthetic */ zzrx(zzrw zzrwVar, byte[] bArr) {
        this.zzb = new zzsd(zzrwVar.zzc());
        this.zza = zzrwVar.zzb();
    }

    public static zzrw zza(Context context) {
        return new zzrw(context, null);
    }

    private final boolean zzh(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.zza.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    private static final void zzi() throws zzsg {
        throw new zzsg("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    protected final zzsx zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "android";
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final InputStream zzd(Uri uri) throws IOException {
        if (!zzh(uri)) {
            return zzsl.zzb(zzsc.zza(zzf(uri)));
        }
        zzi();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final boolean zze(Uri uri) throws IOException {
        if (!zzh(uri)) {
            return zzsc.zza(zzf(uri)).exists();
        }
        zzi();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    protected final Uri zzf(Uri uri) throws IOException {
        if (zzh(uri)) {
            throw new zzsi("Operation across authorities is not allowed.");
        }
        File fileZzg = zzg(uri);
        zzsb zzsbVar = new zzsb(null);
        zzsbVar.zza(fileZzg);
        return zzsbVar.zzb();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    @Override // com.google.android.gms.internal.measurement.zzsx
    public final File zzg(Uri uri) throws IOException {
        byte b10;
        File filesDir;
        String str;
        Account account;
        if (zzh(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.zza;
        if (!uri.getScheme().equals("android")) {
            throw new zzsi("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        switch ((String) arrayList.get(0)) {
            case "external":
                b10 = 5;
                break;
            case "cache":
                b10 = 3;
                break;
            case "files":
                b10 = 2;
                break;
            case "managed":
                b10 = 4;
                break;
            case "directboot-cache":
                b10 = 1;
                break;
            case "directboot-files":
                b10 = 0;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
        } else if (b10 == 1) {
            filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
        } else if (b10 == 2) {
            filesDir = zzry.zza(context);
        } else if (b10 == 3) {
            filesDir = context.getCacheDir();
        } else if (b10 == 4) {
            File file = new File(zzry.zza(context), "managed");
            if (arrayList.size() >= 3) {
                try {
                    String str2 = (String) arrayList.get(2);
                    Account account2 = zzrv.zza;
                    if ("shared".equals(str2)) {
                        account = zzrv.zza;
                    } else {
                        int iIndexOf = str2.indexOf(58);
                        zzsq.zza(iIndexOf >= 0, "Malformed account", new Object[0]);
                        account = new Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                    }
                    if (!zzrv.zza.equals(account)) {
                        throw new zzsi("AccountManager cannot be null");
                    }
                } catch (IllegalArgumentException e10) {
                    throw new zzsi(e10);
                }
            }
            filesDir = file;
        } else {
            if (b10 != 5) {
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            }
            filesDir = context.getExternalFilesDir(null);
        }
        File file2 = new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        if (!zzky.zzc(context)) {
            synchronized (this.zzc) {
                if (this.zzd == null) {
                    this.zzd = zzry.zza(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                }
                str = this.zzd;
            }
            if (!file2.getAbsolutePath().startsWith(str)) {
                throw new zzsg("Cannot access credential-protected data from direct boot");
            }
        }
        return file2;
    }
}

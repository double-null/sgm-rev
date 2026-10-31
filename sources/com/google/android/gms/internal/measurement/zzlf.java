package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.h;
import com.google.common.base.m;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlf {
    private static volatile m zza;

    private zzlf() {
    }

    public static m zza(Context context) {
        m mVarB;
        m mVarB2 = zza;
        if (mVarB2 == null) {
            synchronized (zzlf.class) {
                mVarB2 = zza;
                if (mVarB2 == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i10 = zzlg.zza;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        Context contextCreateDeviceProtectedStorageContext = (!zzky.zza() || context.isDeviceProtectedStorage()) ? context : context.createDeviceProtectedStorageContext();
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c10 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                mVarB = file.exists() ? m.f(file) : m.b();
                            } catch (RuntimeException e10) {
                                Log.e("HermeticFileOverrides", "no data dir", e10);
                                mVarB = m.b();
                            }
                            if (mVarB.e()) {
                                File file2 = (File) mVarB.c();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        h hVar = new h();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb2 = new StringBuilder(line.length() + 9);
                                                sb2.append("Invalid: ");
                                                sb2.append(line);
                                                Log.e("HermeticFileOverrides", sb2.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c10]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                h hVar2 = (h) hVar.get(str3);
                                                if (hVar2 == null) {
                                                    hVar2 = new h();
                                                    hVar.put(str3, hVar2);
                                                }
                                                hVar2.put(strDecode, strDecode2);
                                                c10 = 0;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb3 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb3.append("Parsed ");
                                        sb3.append(string);
                                        sb3.append(" for Android package ");
                                        sb3.append(packageName);
                                        Log.w("HermeticFileOverrides", sb3.toString());
                                        zzle zzleVar = new zzle(hVar);
                                        bufferedReader.close();
                                        mVarB2 = m.f(zzleVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e11) {
                                    throw new RuntimeException(e11);
                                }
                            } else {
                                mVarB2 = m.b();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        mVarB2 = m.b();
                    }
                    zza = mVarB2;
                }
            }
        }
        return mVarB2;
    }
}

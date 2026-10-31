package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ze.tmM.zKUlck;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbqd implements zzbpq {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdzl zzb;
    private final zzbya zzd;
    private final zzekg zze;
    private final zzctj zzf;
    private final zzdbs zzg;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzhcg zzi = zzcfr.zzh;

    public zzbqd(com.google.android.gms.ads.internal.zzb zzbVar, zzbya zzbyaVar, zzekg zzekgVar, zzdzl zzdzlVar, zzctj zzctjVar, zzdbs zzdbsVar) {
        this.zza = zzbVar;
        this.zzd = zzbyaVar;
        this.zze = zzekgVar;
        this.zzb = zzdzlVar;
        this.zzf = zzctjVar;
        this.zzg = zzdbsVar;
    }

    public static boolean zzb(Map map) {
        return AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzd(Context context, zzbap zzbapVar, Uri uri, View view, Activity activity, zzflc zzflcVar) {
        if (zzbapVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznw)).booleanValue() || zzflcVar == null) {
                if (zzbapVar.zze(uri)) {
                    uri = zzbapVar.zzd(uri, context, view, activity);
                }
            } else if (zzbapVar.zze(uri)) {
                uri = zzflcVar.zza(uri, context, view, activity);
            }
        } catch (zzbaq unused) {
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:133:0x0367  */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean zZzb;
        HashMap map2;
        boolean z10;
        zzdbs zzdbsVar;
        zzcku zzckuVar = (zzcku) zzaVar;
        zzfkf zzfkfVarZzC = zzckuVar.zzC();
        zzfki zzfkiVarZzaC = zzckuVar.zzaC();
        boolean zZza = false;
        if (zzfkfVarZzC == null || zzfkiVarZzaC == null) {
            str3 = "";
            zZzb = false;
        } else {
            String str4 = zzfkiVarZzaC.zzb;
            zZzb = zzfkfVarZzC.zzb();
            str3 = str4;
        }
        boolean z11 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmf)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) ? false : true;
        boolean z12 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzok)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzckuVar.zzW()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzcmk) zzaVar).zzaI(zzb(map), zzc(map), z11);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z13 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzns)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), AppEventsConstants.EVENT_PARAM_VALUE_YES);
            if (str != null) {
                ((zzcmk) zzaVar).zzaJ(zzb(map), zzc(map), str, z11, z13);
                return;
            } else {
                ((zzcmk) zzaVar).zzaK(zzb(map), zzc(map), (String) map.get("html"), (String) map.get("baseurl"), z11);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzckuVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfG)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfA)).booleanValue()) {
                    String strD = androidx.browser.customtabs.c.d(context, null);
                    if (strD != null && !context.getPackageName().equals(strD)) {
                        zZza = true;
                    }
                } else {
                    zZza = zzbjr.zza(context);
                }
                if (zZza) {
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri uriZze = zze(zzd(zzckuVar.getContext(), zzckuVar.zzS(), Uri.parse(str), zzckuVar.zzE(), zzckuVar.zzj(), zzckuVar.zzT()));
                    if (zZzb && this.zze != null && zzi(zzaVar, zzckuVar.getContext(), uriZze.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbqa(this);
                    zzcmk zzcmkVar = (zzcmk) zzaVar;
                    String string = uriZze.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzh;
                    Bundle bundle = new Bundle();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfF)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e10) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", e10);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e11) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e11);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    zzcmkVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, string, null, null, null, null, null, null, ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z11, z12, str3);
                    return;
                }
                zzg(4);
            }
            map.put("use_first_package", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            map.put("use_running_process", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            zzk(zzaVar, map, zZzb, str3, z11, z12);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase((String) map.get("system_browser"))) {
            zzk(zzaVar, map, zZzb, str3, z11, z12);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjy)).booleanValue()) {
                zzl(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (zZzb && this.zze != null && zzi(zzaVar, zzckuVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzckuVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcmk) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z11, z12, str3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str6 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e12) {
                String strValueOf = String.valueOf(str6);
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e12);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZze2 = zze(zzd(zzckuVar.getContext(), zzckuVar.zzS(), data, zzckuVar.zzE(), zzckuVar.zzj(), zzckuVar.zzT()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriZze2);
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjz)).booleanValue()) {
                    intent.setDataAndType(uriZze2, intent.getType());
                } else {
                    intent.setData(uriZze2);
                }
            }
        }
        boolean z14 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjU)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzop)).booleanValue() && (zzdbsVar = this.zzg) != null) {
            zzdbsVar.zzl();
        }
        HashMap map3 = new HashMap();
        if (z14) {
            map2 = map3;
            this.zzh = new zzbqb(this, z11, zzaVar, map3, map);
            z10 = false;
        } else {
            map2 = map3;
            z10 = z11;
        }
        if (intent != null) {
            if (!zZzb || this.zze == null || !zzi(zzaVar, zzckuVar.getContext(), intent.getData().toString(), str3)) {
                ((zzcmk) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z10, z12, str3);
                return;
            } else {
                if (z14) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbsm) zzaVar).zze("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        boolean z15 = z12;
        String string2 = !TextUtils.isEmpty(str) ? zze(zzd(zzckuVar.getContext(), zzckuVar.zzS(), Uri.parse(str), zzckuVar.zzE(), zzckuVar.zzj(), zzckuVar.zzT())).toString() : str;
        if (!zZzb || this.zze == null || !zzi(zzaVar, zzckuVar.getContext(), string2, str3)) {
            ((zzcmk) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), string2, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzh), z10, z15, str3);
        } else if (z14) {
            map2.put((String) map.get(r5), Boolean.TRUE);
            ((zzbsm) zzaVar).zze("openIntentAsync", map2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjO)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjJ)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjI)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqd.zzi(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzekg zzekgVar = this.zze;
        zzekgVar.zzd(str);
        zzdzl zzdzlVar = this.zzb;
        if (zzdzlVar != null) {
            zzekr.zzk(context, zzdzlVar, zzekgVar, str, "dialog_not_shown", zzgwp.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x015c A[PHI: r22
      0x015c: PHI (r22v2 java.util.ArrayList) = (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v3 java.util.ArrayList) binds: [B:32:0x0112, B:33:0x0114, B:35:0x011a, B:65:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z10, String str, boolean z11, boolean z12) {
        ?? r10;
        ArrayList arrayList;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzb;
        Intent intentZzd;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z13 = true;
        zzl(true);
        zzcku zzckuVar = (zzcku) zzaVar;
        Context context = zzckuVar.getContext();
        zzbap zzbapVarZzS = zzckuVar.zzS();
        View viewZzE = zzckuVar.zzE();
        zzflc zzflcVarZzT = zzckuVar.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Object objBuild = null;
        if (TextUtils.isEmpty(str2)) {
            r10 = objBuild;
        } else {
            Uri uriZze = zze(zzd(context, zzbapVarZzS, Uri.parse(str2), viewZzE, null, zzflcVarZzT));
            boolean z14 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z15 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfw)).booleanValue()) {
                    z13 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriZze.getScheme())) {
                objBuild = uriZze.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZze.getScheme())) {
                objBuild = uriZze.buildUpon().scheme("http").build();
            }
            ?? r11 = objBuild;
            ArrayList arrayList2 = new ArrayList();
            Intent intentZza = zzbqc.zza(uriZze, context, zzbapVarZzS, viewZzE, zzflcVarZzT);
            Intent intentZza2 = zzbqc.zza(r11, context, zzbapVarZzS, viewZzE, zzflcVarZzT);
            if (z13) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intentZza2);
            }
            ArrayList arrayList3 = arrayList2;
            ResolveInfo resolveInfoZzc = zzbqc.zzc(intentZza, arrayList2, context, zzbapVarZzS, viewZzE, zzflcVarZzT);
            if (resolveInfoZzc != null) {
                objBuild = zzbqc.zzd(intentZza, resolveInfoZzc, context, zzbapVarZzS, viewZzE, zzflcVarZzT);
            } else if (intentZza2 == null || (resolveInfoZzb = zzbqc.zzb(intentZza2, context, zzbapVarZzS, viewZzE, zzflcVarZzT)) == null) {
                r10 = intentZzd;
                if (!arrayList3.isEmpty()) {
                    if (z15 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        arrayList = arrayList3;
                        if (z14) {
                            objBuild = zzbqc.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzbapVarZzS, viewZzE, zzflcVarZzT);
                        }
                    } else {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                ArrayList arrayList4 = arrayList3;
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList4.get(i10);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (!it.hasNext()) {
                                        arrayList3 = arrayList4;
                                        i10 = i11;
                                    } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        objBuild = zzbqc.zzd(intentZza, resolveInfo, context, zzbapVarZzS, viewZzE, zzflcVarZzT);
                                    }
                                }
                            } else {
                                arrayList = arrayList3;
                                if (z14) {
                                    objBuild = zzbqc.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzbapVarZzS, viewZzE, zzflcVarZzT);
                                }
                            }
                        }
                    }
                }
                r10 = intentZza;
            } else {
                intentZzd = zzbqc.zzd(intentZza, resolveInfoZzb, context, zzbapVarZzS, viewZzE, zzflcVarZzT);
                if (zzbqc.zzb(intentZzd, context, zzbapVarZzS, viewZzE, zzflcVarZzT) == null) {
                    r10 = intentZzd;
                    if (!arrayList3.isEmpty()) {
                        if (z15) {
                            arrayList = arrayList3;
                            if (z14) {
                                objBuild = zzbqc.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzbapVarZzS, viewZzE, zzflcVarZzT);
                            }
                        } else {
                            arrayList = arrayList3;
                            if (z14) {
                                objBuild = zzbqc.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzbapVarZzS, viewZzE, zzflcVarZzT);
                            }
                        }
                    }
                    r10 = intentZza;
                }
            }
            r10 = objBuild;
        }
        if (!z10 || this.zze == null || r10 == 0) {
            zzaVar2 = zzaVar;
        } else {
            zzaVar2 = zzaVar;
            if (zzi(zzaVar2, zzckuVar.getContext(), r10.getData().toString(), str)) {
                return;
            }
        }
        try {
            ((zzcmk) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(r10, this.zzh), z11, z12, str);
        } catch (ActivityNotFoundException e10) {
            String message = e10.getMessage();
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
        }
    }

    private final void zzl(boolean z10) {
        zzbya zzbyaVar = this.zzd;
        if (zzbyaVar != null) {
            zzbyaVar.zzb(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzctj zzctjVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcku zzckuVar = (zzcku) zzaVar;
        if (zzckuVar.zzC() != null) {
            map2 = zzckuVar.zzC().zzaw;
        }
        String strZza = zzceb.zza(str, zzckuVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzhbw.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlw)).booleanValue() && (zzctjVar = this.zzf) != null && zzctj.zzc(strZza)) ? zzctjVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhbw.zza(strZza), new zzbpz(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i10) {
        zzdzl zzdzlVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfz)).booleanValue() || (zzdzlVar = this.zzb) == null) {
            return;
        }
        zzdzk zzdzkVarZza = zzdzlVar.zza();
        zzdzkVarZza.zzc("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = zKUlck.mxwMveWINrid;
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdzkVarZza.zzc("cct_open_status", str);
        zzdzkVarZza.zzd();
    }
}

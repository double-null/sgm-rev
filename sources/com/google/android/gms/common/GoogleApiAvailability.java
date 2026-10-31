package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.d;
import androidx.core.app.k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zas;
import com.google.android.gms.common.internal.zad;
import com.google.android.gms.common.internal.zak;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zan;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private static volatile Boolean zab;
    private String zad;
    private zad zae;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zac = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static GoogleApiAvailability getInstance() {
        return zac;
    }

    public Task<Void> checkApiAvailability(GoogleApi<?> googleApi, GoogleApi<?>... googleApiArr) {
        return checkApiAvailability(TaskExecutors.MAIN_THREAD, googleApi, googleApiArr);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(Context context) {
        return super.getClientVersion(context);
    }

    public Dialog getErrorDialog(Activity activity, int i10, int i11) {
        return getErrorDialog(activity, i10, i11, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public Intent getErrorResolutionIntent(Context context, int i10, String str) {
        return super.getErrorResolutionIntent(context, i10, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public PendingIntent getErrorResolutionPendingIntent(Context context, int i10, int i11) {
        return super.getErrorResolutionPendingIntent(context, i10, i11);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final String getErrorString(int i10) {
        return super.getErrorString(i10);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i10) {
        return super.isUserResolvableError(i10);
    }

    public Task<Void> makeGooglePlayServicesAvailable(Activity activity) {
        int i10 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i10);
        if (iIsGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zabw zabwVarZaa = zabw.zaa(activity);
        zabwVarZaa.zaf(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zabwVarZaa.zab();
    }

    public void setDefaultNotificationChannelId(Context context, String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zad = str;
        }
    }

    public boolean showErrorDialogFragment(Activity activity, int i10, int i11) {
        return showErrorDialogFragment(activity, i10, i11, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(Context context, int i10) {
        zac(context, new ConnectionResult(i10, getErrorResolutionPendingIntent(context, i10, 0, "n")), null);
    }

    final Dialog zaa(Context context, int i10, zao zaoVar, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(zak.zac(context, i10));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strZae = zak.zae(context, i10);
        DialogInterface.OnClickListener onClickListener2 = zaoVar;
        if (strZae != null) {
            if (zaoVar == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strZae, onClickListener2);
        }
        String strZaa = zak.zaa(context, i10);
        if (strZaa != null) {
            builder2.setTitle(strZaa);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder2.create();
    }

    public final boolean zab(Activity activity, LifecycleFragment lifecycleFragment, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i10, zao.zad(lifecycleFragment, getErrorResolutionIntent(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    final void zac(Context context, ConnectionResult connectionResult, String str) {
        int i10;
        String str2;
        int errorCode = connectionResult.getErrorCode();
        Object obj = zaa;
        synchronized (obj) {
            if (zab == null) {
                zab = Boolean.valueOf(ClientLibraryUtils.isPackageSide());
            }
        }
        if (zab.booleanValue()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(errorCode).length() + 54);
            sb2.append("Suppressing show error notification for package side: ");
            sb2.append(errorCode);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", Integer.valueOf(connectionResult.getErrorCode()), connectionResult.getClientMethodKey(), null), new IllegalArgumentException());
        if (errorCode == 18) {
            zai(context);
            return;
        }
        PendingIntent resolution = connectionResult.getResolution();
        if (resolution == null) {
            if (errorCode == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strZab = zak.zab(context, errorCode);
        String strZad = zak.zad(context, errorCode);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        k.e eVarQ = new k.e(context).m(true).e(true).i(strZab).q(new k.c().h(strZad));
        boolean zIsWearable = DeviceProperties.isWearable(context);
        int i11 = android.R.drawable.stat_sys_warning;
        if (zIsWearable) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            eVarQ.o(i11).n(2);
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                eVarQ.a(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), resolution);
            } else {
                eVarQ.g(resolution);
            }
        } else {
            eVarQ.o(android.R.drawable.stat_sys_warning).r(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).s(System.currentTimeMillis()).g(resolution).h(strZad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (obj) {
                str2 = this.zad;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarQ.f(str2);
        }
        Notification notificationB = eVarQ.b();
        if (errorCode == 1 || errorCode == 2 || errorCode == 3 || errorCode == 21) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationB);
        zae(context, connectionResult, false);
    }

    public final boolean zad(Context context, ConnectionResult connectionResult, int i10) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zac(context, new ConnectionResult(connectionResult.getErrorCode(), zan.zaa(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i10, true), zan.zaa | 134217728), connectionResult.getErrorMessage(), connectionResult.getClientMethodKey()), null);
        return true;
    }

    public final void zae(Context context, ConnectionResult connectionResult, boolean z10) {
        Integer clientMethodKey = connectionResult.getClientMethodKey();
        com.google.android.gms.common.internal.zab zabVar = new com.google.android.gms.common.internal.zab(clientMethodKey == null ? -1 : clientMethodKey.intValue(), context.getPackageName(), System.currentTimeMillis(), connectionResult.getErrorCode(), z10);
        if (this.zae == null) {
            this.zae = new zas(context);
        }
        this.zae.zaa(zabVar);
    }

    public final Dialog zaf(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zak.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zah(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final zabr zag(Context context, zabq zabqVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabr zabrVar = new zabr(zabqVar);
        androidx.core.content.a.g(context, zabrVar, intentFilter, 2);
        zabrVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabrVar;
        }
        zabqVar.zaa();
        zabrVar.zab();
        return null;
    }

    final void zah(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof e) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void zai(Context context) {
        new zac(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean zaj(int i10) {
        if (i10 == 9) {
            return true;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i10) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public Task<Void> checkApiAvailability(HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        return checkApiAvailability(TaskExecutors.MAIN_THREAD, hasApiKey, hasApiKeyArr);
    }

    public Dialog getErrorDialog(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i10, zao.zab(activity, getErrorResolutionIntent(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(Context context, int i10) {
        return super.isGooglePlayServicesAvailable(context, i10);
    }

    public boolean showErrorDialogFragment(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i10, i11, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zah(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Task<Void> checkApiAvailability(Executor executor, HasApiKey<?> hasApiKey, HasApiKey<?>... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey<?> hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zab().zah(arrayList).onSuccessTask(executor, zab.zaa);
    }

    public void showErrorNotification(Context context, ConnectionResult connectionResult) {
        zac(context, new ConnectionResult(connectionResult.getErrorCode(), getErrorResolutionPendingIntent(context, connectionResult), connectionResult.getErrorMessage(), connectionResult.getClientMethodKey()), null);
    }

    public Dialog getErrorDialog(Fragment fragment, int i10, int i11) {
        return getErrorDialog(fragment, i10, i11, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(Activity activity, int i10, ActivityResultLauncher<d> activityResultLauncher, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i10, null, onCancelListener, new zaa(this, activity, i10, activityResultLauncher));
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public Dialog getErrorDialog(Fragment fragment, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i10, zao.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i10, "d"), i11), onCancelListener, null);
    }
}

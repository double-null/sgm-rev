package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzam {
    private static final Uri zza = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority("com.google.android.gms.chimera").build();

    static Intent zza(Context context, zzo zzoVar) throws zzak {
        Bundle bundleCall;
        String strZza = zzoVar.zza();
        if (strZza == null) {
            return new Intent().setComponent(zzoVar.zzc());
        }
        Intent intent = null;
        if (zzoVar.zzd()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strZza);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(zza);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb2 = new StringBuilder(strZza.length() + 72);
                                sb2.append("Dynamic lookup for intent failed for action ");
                                sb2.append(strZza);
                                sb2.append(" but has possible resolution");
                                Log.w("ServiceBindIntentUtils", sb2.toString());
                                throw new zzak(new ConnectionResult(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strZza));
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException | IllegalArgumentException e10) {
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(strZza).setPackage(zzoVar.zzb()) : intent;
    }
}

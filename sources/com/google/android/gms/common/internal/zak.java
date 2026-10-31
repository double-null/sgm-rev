package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.h;
import androidx.core.os.e;
import com.google.android.gms.base.R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zak {
    private static final h zaa = new h();
    private static Locale zab;

    public static String zaa(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
            case 21:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return zah(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return zah(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return zah(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return zah(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case 19:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return zah(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return zah(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String zab(Context context, int i10) {
        String strZah = i10 == 6 ? zah(context, "common_google_play_services_resolution_required_title") : zaa(context, i10);
        return strZah == null ? context.getResources().getString(R.string.common_google_play_services_try_again_title) : strZah;
    }

    public static String zac(Context context, int i10) {
        Resources resources = context.getResources();
        String strZaf = zaf(context);
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strZaf);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, strZaf);
            }
            if (i10 == 4) {
                return resources.getString(R.string.common_google_play_services_signin_required_text, strZaf);
            }
            if (i10 == 5) {
                return zag(context, "common_google_play_services_invalid_account_text", strZaf);
            }
            if (i10 == 7) {
                return zag(context, "common_google_play_services_network_error_text", strZaf);
            }
            if (i10 == 9) {
                return resources.getString(R.string.common_google_play_services_unsupported_text, strZaf);
            }
            if (i10 == 20) {
                return zag(context, "common_google_play_services_restricted_profile_text", strZaf);
            }
            if (i10 != 21) {
                switch (i10) {
                    case 16:
                        return zag(context, "common_google_play_services_api_unavailable_text", strZaf);
                    case 17:
                        return zag(context, "common_google_play_services_sign_in_failed_text", strZaf);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, strZaf);
                    default:
                        return resources.getString(R.string.common_google_play_services_try_again_text, strZaf);
                }
            }
        }
        return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, strZaf) : resources.getString(R.string.common_google_play_services_update_text, strZaf);
    }

    public static String zad(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? zag(context, "common_google_play_services_resolution_required_text", zaf(context)) : zac(context, i10);
    }

    public static String zae(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i10 != 2) {
            return i10 != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button);
        }
        return resources.getString(R.string.common_google_play_services_update_button);
    }

    public static String zaf(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    private static String zag(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strZah = zah(context, str);
        if (strZah == null) {
            strZah = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strZah, str2);
    }

    private static String zah(Context context, String str) {
        h hVar = zaa;
        synchronized (hVar) {
            Locale localeB = e.a(context.getResources().getConfiguration()).b(0);
            if (!localeB.equals(zab)) {
                hVar.clear();
                zab = localeB;
            }
            String str2 = (String) hVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                StringBuilder sb2 = new StringBuilder(str.length() + 18);
                sb2.append("Missing resource: ");
                sb2.append(str);
                Log.w("GoogleApiAvailability", sb2.toString());
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                hVar.put(str, string);
                return string;
            }
            StringBuilder sb3 = new StringBuilder(str.length() + 20);
            sb3.append("Got empty resource: ");
            sb3.append(str);
            Log.w("GoogleApiAvailability", sb3.toString());
            return null;
        }
    }
}

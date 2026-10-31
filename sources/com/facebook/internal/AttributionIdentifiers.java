package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: AttributionIdentifiers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AttributionIdentifiers {
    private static final String ANDROID_ID_COLUMN_NAME = "androidid";
    private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
    private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
    private static final int CONNECTION_RESULT_SUCCESS = 0;
    private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 3600000;
    private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
    public static volatile AttributionIdentifiers cachedIdentifiers;
    private String androidAdvertiserIdValue;
    private String androidInstallerPackage;
    private String attributionId;
    private long fetchTime;
    private boolean isTrackingLimited;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = AttributionIdentifiers.class.getCanonicalName();

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    private static final class GoogleAdInfo implements IInterface {
        public static final Companion Companion = new Companion(null);
        private static final int FIRST_TRANSACTION_CODE = 1;
        private static final int SECOND_TRANSACTION_CODE = 2;
        private final IBinder binder;

        /* JADX INFO: compiled from: AttributionIdentifiers.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public GoogleAdInfo(IBinder binder) {
            kotlin.jvm.internal.t.f(binder, "binder");
            this.binder = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.binder;
        }

        public final String getAdvertiserId() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            kotlin.jvm.internal.t.e(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            kotlin.jvm.internal.t.e(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean isTrackingLimited() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            kotlin.jvm.internal.t.e(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            kotlin.jvm.internal.t.e(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public static final AttributionIdentifiers getAttributionIdentifiers(Context context) {
        return Companion.getAttributionIdentifiers(context);
    }

    public static final boolean isTrackingLimited(Context context) {
        return Companion.isTrackingLimited(context);
    }

    public final String getAndroidAdvertiserId() {
        if (FacebookSdk.isInitialized() && FacebookSdk.getAdvertiserIDCollectionEnabled()) {
            return this.androidAdvertiserIdValue;
        }
        return null;
    }

    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    public final String getAttributionId() {
        return this.attributionId;
    }

    public final boolean isTrackingLimited() {
        return this.isTrackingLimited;
    }

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers attributionIdentifiers) {
            attributionIdentifiers.fetchTime = System.currentTimeMillis();
            AttributionIdentifiers.cachedIdentifiers = attributionIdentifiers;
            return attributionIdentifiers;
        }

        private final AttributionIdentifiers getAndroidId(Context context) {
            AttributionIdentifiers androidIdViaReflection = getAndroidIdViaReflection(context);
            if (androidIdViaReflection != null) {
                return androidIdViaReflection;
            }
            AttributionIdentifiers androidIdViaService = getAndroidIdViaService(context);
            return androidIdViaService == null ? new AttributionIdentifiers() : androidIdViaService;
        }

        private final AttributionIdentifiers getAndroidIdViaReflection(Context context) {
            Object objInvokeMethodQuietly;
            try {
                if (!isGooglePlayServicesAvailable(context)) {
                    return null;
                }
                Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                if (methodQuietly == null || (objInvokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context)) == null) {
                    return null;
                }
                Method methodQuietly2 = Utility.getMethodQuietly(objInvokeMethodQuietly.getClass(), "getId", (Class<?>[]) new Class[0]);
                Method methodQuietly3 = Utility.getMethodQuietly(objInvokeMethodQuietly.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                if (methodQuietly2 != null && methodQuietly3 != null) {
                    AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                    attributionIdentifiers.androidAdvertiserIdValue = (String) Utility.invokeMethodQuietly(objInvokeMethodQuietly, methodQuietly2, new Object[0]);
                    Boolean bool = (Boolean) Utility.invokeMethodQuietly(objInvokeMethodQuietly, methodQuietly3, new Object[0]);
                    attributionIdentifiers.isTrackingLimited = bool != null ? bool.booleanValue() : false;
                    return attributionIdentifiers;
                }
                return null;
            } catch (Exception e10) {
                Utility.logd("android_id", e10);
                return null;
            }
        }

        private final AttributionIdentifiers getAndroidIdViaService(Context context) {
            if (!isGooglePlayServicesAvailable(context)) {
                return null;
            }
            GoogleAdServiceConnection googleAdServiceConnection = new GoogleAdServiceConnection();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, googleAdServiceConnection, 1)) {
                        GoogleAdInfo googleAdInfo = new GoogleAdInfo(googleAdServiceConnection.getBinder());
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        attributionIdentifiers.androidAdvertiserIdValue = googleAdInfo.getAdvertiserId();
                        attributionIdentifiers.isTrackingLimited = googleAdInfo.isTrackingLimited();
                        return attributionIdentifiers;
                    }
                } catch (Exception e10) {
                    Utility.logd("android_id", e10);
                } finally {
                    context.unbindService(googleAdServiceConnection);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String getInstallerPackageName(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        private final boolean isGooglePlayServicesAvailable(Context context) {
            Method methodQuietly = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
            if (methodQuietly == null) {
                return false;
            }
            Object objInvokeMethodQuietly = Utility.invokeMethodQuietly(null, methodQuietly, context);
            return (objInvokeMethodQuietly instanceof Integer) && kotlin.jvm.internal.t.a(objInvokeMethodQuietly, 0);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0063 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0065 A[Catch: all -> 0x00f0, Exception -> 0x00f2, TryCatch #5 {Exception -> 0x00f2, all -> 0x00f0, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005b, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0065, B:19:0x0072, B:48:0x00e8, B:49:0x00ef), top: B:65:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x0072 A[Catch: all -> 0x00f0, Exception -> 0x00f2, TryCatch #5 {Exception -> 0x00f2, all -> 0x00f0, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x004e, B:14:0x005b, B:21:0x007a, B:23:0x0080, B:25:0x0085, B:27:0x008a, B:17:0x0065, B:19:0x0072, B:48:0x00e8, B:49:0x00ef), top: B:65:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0116  */
        public final AttributionIdentifiers getAttributionIdentifiers(Context context) {
            Cursor cursor;
            Uri uri;
            String str;
            Uri uri2;
            kotlin.jvm.internal.t.f(context, "context");
            AttributionIdentifiers androidId = getAndroidId(context);
            Cursor cursor2 = null;
            try {
                if (kotlin.jvm.internal.t.a(Looper.myLooper(), Looper.getMainLooper())) {
                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                }
                AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.cachedIdentifiers;
                if (attributionIdentifiers != null && System.currentTimeMillis() - attributionIdentifiers.fetchTime < AttributionIdentifiers.IDENTIFIER_REFRESH_INTERVAL_MILLIS) {
                    return attributionIdentifiers;
                }
                String[] strArr = {AttributionIdentifiers.ATTRIBUTION_ID_COLUMN_NAME, AttributionIdentifiers.ANDROID_ID_COLUMN_NAME, AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME};
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER, 0);
                ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider(AttributionIdentifiers.ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI, 0);
                if (providerInfoResolveContentProvider != null) {
                    String str2 = providerInfoResolveContentProvider.packageName;
                    kotlin.jvm.internal.t.e(str2, "contentProviderInfo.packageName");
                    if (FacebookSignatureValidator.validateSignature(context, str2)) {
                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            str = providerInfoResolveContentProvider2.packageName;
                            kotlin.jvm.internal.t.e(str, "wakizashiProviderInfo.packageName");
                            if (FacebookSignatureValidator.validateSignature(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            }
                        }
                        uri = null;
                    }
                    uri = uri2;
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        kotlin.jvm.internal.t.e(str, "wakizashiProviderInfo.packageName");
                        if (FacebookSignatureValidator.validateSignature(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                            uri = uri2;
                        }
                    }
                    uri = null;
                }
                String installerPackageName = getInstallerPackageName(context);
                if (installerPackageName != null) {
                    androidId.androidInstallerPackage = installerPackageName;
                }
                if (uri == null) {
                    return cacheAndReturnIdentifiers(androidId);
                }
                Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex(AttributionIdentifiers.ATTRIBUTION_ID_COLUMN_NAME);
                            int columnIndex2 = cursorQuery.getColumnIndex(AttributionIdentifiers.ANDROID_ID_COLUMN_NAME);
                            int columnIndex3 = cursorQuery.getColumnIndex(AttributionIdentifiers.LIMIT_TRACKING_COLUMN_NAME);
                            androidId.attributionId = cursorQuery.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && androidId.getAndroidAdvertiserId() == null) {
                                androidId.androidAdvertiserIdValue = cursorQuery.getString(columnIndex2);
                                androidId.isTrackingLimited = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                            }
                            cursorQuery.close();
                            return cacheAndReturnIdentifiers(androidId);
                        }
                    } catch (Exception e10) {
                        cursor = cursorQuery;
                        e = e10;
                        try {
                            Utility.logd(AttributionIdentifiers.TAG, "Caught unexpected exception in getAttributionId(): " + e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cursor2 = cursorQuery;
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                }
                AttributionIdentifiers attributionIdentifiersCacheAndReturnIdentifiers = cacheAndReturnIdentifiers(androidId);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return attributionIdentifiersCacheAndReturnIdentifiers;
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public final boolean isTrackingLimited(Context context) {
            kotlin.jvm.internal.t.f(context, "context");
            AttributionIdentifiers attributionIdentifiers = getAttributionIdentifiers(context);
            return attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited();
        }

        public static /* synthetic */ void getATTRIBUTION_ID_CONTENT_PROVIDER$facebook_core_release$annotations() {
        }

        public static /* synthetic */ void getCachedIdentifiers$facebook_core_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: AttributionIdentifiers.kt */
    private static final class GoogleAdServiceConnection implements ServiceConnection {
        private final AtomicBoolean consumed = new AtomicBoolean(false);
        private final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        public final IBinder getBinder() throws InterruptedException {
            if (!this.consumed.compareAndSet(false, true)) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder iBinderTake = this.queue.take();
            kotlin.jvm.internal.t.e(iBinderTake, "queue.take()");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.queue.put(iBinder);
                } catch (InterruptedException e10) {
                    Utility.logd(AttributionIdentifiers.TAG, "Service connection interrupted", e10);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

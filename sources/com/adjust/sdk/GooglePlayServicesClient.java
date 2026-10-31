package com.adjust.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import c2.YDwL.tFQWuE;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class GooglePlayServicesClient {

    /* JADX INFO: loaded from: classes.dex */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class b implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IBinder f5672a;

        public b(IBinder iBinder) {
            this.f5672a = iBinder;
        }

        public final String M() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f5672a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final Boolean N() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f5672a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return Boolean.valueOf(!(parcelObtain2.readInt() != 0));
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f5672a;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j10) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a(j10);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, aVar, 1)) {
                    try {
                        b bVar = new b(aVar.a());
                        GooglePlayServicesInfo googlePlayServicesInfo = new GooglePlayServicesInfo(bVar.M(), bVar.N());
                        context.unbindService(aVar);
                        return googlePlayServicesInfo;
                    } catch (Exception e10) {
                        throw e10;
                    }
                }
                throw new IOException(tFQWuE.bpg);
            } catch (Throwable th) {
                context.unbindService(aVar);
                throw th;
            }
        }
        throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5670b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedBlockingQueue f5671c = new LinkedBlockingQueue(1);

        public a(long j10) {
            this.f5669a = j10;
        }

        public final IBinder a() {
            if (this.f5670b) {
                throw new IllegalStateException();
            }
            this.f5670b = true;
            return (IBinder) this.f5671c.poll(this.f5669a, TimeUnit.MILLISECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f5671c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}

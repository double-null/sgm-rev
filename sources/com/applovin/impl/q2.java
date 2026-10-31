package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f7941b;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f7942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u4 f7943b;

        public a(com.applovin.impl.sdk.p pVar, u4 u4Var) {
            this.f7942a = pVar;
            this.f7943b = u4Var;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7942a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f7942a, this.f7943b, iNextInt, new Runnable() { // from class: com.applovin.impl.xd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9077a.a();
                }
            });
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                parcelObtain.writeLong(iNextInt);
                parcelObtain.writeString(com.applovin.impl.sdk.l.p().getPackageName());
                parcelObtain.writeStrongBinder(bVar);
                if (iBinder.transact(1, parcelObtain, null, 1)) {
                } else {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7942a.a("LicenseVerificationManager", "Failed to check license", e10);
                }
                a();
                this.f7943b.a((Object) e10);
            } finally {
                parcelObtain.recycle();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.p.a()) {
                this.f7942a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f7943b.a((Object) illegalStateException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.l.p().unbindService(this);
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7942a.d("LicenseVerificationManager", "Failed to unbind license service", e10);
                }
            }
        }
    }

    private static final class b extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f7944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u4 f7945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f7947d;

        public b(com.applovin.impl.sdk.p pVar, u4 u4Var, int i10, Runnable runnable) {
            this.f7944a = pVar;
            this.f7945b = u4Var;
            this.f7946c = i10;
            this.f7947d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i12 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7944a.a("LicenseVerificationManager", "Verified with code " + i12);
                }
                this.f7945b.b(r2.a().b(string).a(string2).b(i12).a(this.f7946c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.f7947d.run();
                return true;
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f7944a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th);
                    }
                    this.f7945b.a((Object) new Exception(th));
                    return false;
                } finally {
                    this.f7947d.run();
                }
            }
        }
    }

    public q2(com.applovin.impl.sdk.l lVar) {
        this.f7940a = lVar;
        this.f7941b = lVar.Q();
    }

    public u4 a(long j10) {
        u4 u4Var = new u4("verify_license");
        if (j10 > 0) {
            l6.a(j10, u4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f7940a);
        }
        try {
            if (!com.applovin.impl.sdk.l.p().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f7941b, u4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7941b.k("LicenseVerificationManager", exc.getMessage());
                }
                u4Var.a((Object) exc);
            }
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f7941b.a("LicenseVerificationManager", "Failed to verify license", e10);
            }
            u4Var.a((Object) e10);
        }
        return u4Var;
    }
}

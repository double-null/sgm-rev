package d;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: ResultReceiver.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f13137a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f13138b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d.a f13139c;

    /* JADX INFO: compiled from: ResultReceiver.java */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: d.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ResultReceiver.java */
    class BinderC0171b extends d.a.AbstractBinderC0169a {
        BinderC0171b() {
        }

        @Override // d.a
        public void m(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f13138b;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* JADX INFO: compiled from: ResultReceiver.java */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f13142b;

        c(int i10, Bundle bundle) {
            this.f13141a = i10;
            this.f13142b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f13141a, this.f13142b);
        }
    }

    b(Parcel parcel) {
        this.f13139c = d.a.AbstractBinderC0169a.M(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f13139c == null) {
                this.f13139c = new BinderC0171b();
            }
            parcel.writeStrongBinder(this.f13139c.asBinder());
        }
    }

    protected void a(int i10, Bundle bundle) {
    }
}

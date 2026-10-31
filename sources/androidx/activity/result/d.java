package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: IntentSenderRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f544d;

    /* JADX INFO: compiled from: IntentSenderRequest.java */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    d(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f541a = intentSender;
        this.f542b = intent;
        this.f543c = i10;
        this.f544d = i11;
    }

    public Intent a() {
        return this.f542b;
    }

    public int b() {
        return this.f543c;
    }

    public int c() {
        return this.f544d;
    }

    public IntentSender d() {
        return this.f541a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f541a, i10);
        parcel.writeParcelable(this.f542b, i10);
        parcel.writeInt(this.f543c);
        parcel.writeInt(this.f544d);
    }

    /* JADX INFO: compiled from: IntentSenderRequest.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IntentSender f545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f548d;

        public b(IntentSender intentSender) {
            this.f545a = intentSender;
        }

        public d a() {
            return new d(this.f545a, this.f546b, this.f547c, this.f548d);
        }

        public b b(Intent intent) {
            this.f546b = intent;
            return this;
        }

        public b c(int i10, int i11) {
            this.f548d = i10;
            this.f547c = i11;
            return this;
        }

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    d(Parcel parcel) {
        this.f541a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f542b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f543c = parcel.readInt();
        this.f544d = parcel.readInt();
    }
}

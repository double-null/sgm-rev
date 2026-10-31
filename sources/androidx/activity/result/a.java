package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: ActivityResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0012a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f540b;

    /* JADX INFO: renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResult.java */
    class C0012a implements Parcelable.Creator<a> {
        C0012a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, Intent intent) {
        this.f539a = i10;
        this.f540b = intent;
    }

    public static String c(int i10) {
        if (i10 != -1) {
            return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    public Intent a() {
        return this.f540b;
    }

    public int b() {
        return this.f539a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f539a) + ", data=" + this.f540b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f539a);
        parcel.writeInt(this.f540b == null ? 0 : 1);
        Intent intent = this.f540b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    a(Parcel parcel) {
        this.f539a = parcel.readInt();
        this.f540b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}

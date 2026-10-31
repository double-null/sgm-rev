package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentManagerState.java */
/* JADX INFO: loaded from: classes.dex */
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<s> f2702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<String> f2703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f2704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f2706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<String> f2707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<Bundle> f2708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<n.l> f2709h;

    /* JADX INFO: compiled from: FragmentManagerState.java */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    public p() {
        this.f2706e = null;
        this.f2707f = new ArrayList<>();
        this.f2708g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f2702a);
        parcel.writeStringList(this.f2703b);
        parcel.writeTypedArray(this.f2704c, i10);
        parcel.writeInt(this.f2705d);
        parcel.writeString(this.f2706e);
        parcel.writeStringList(this.f2707f);
        parcel.writeTypedList(this.f2708g);
        parcel.writeTypedList(this.f2709h);
    }

    public p(Parcel parcel) {
        this.f2706e = null;
        this.f2707f = new ArrayList<>();
        this.f2708g = new ArrayList<>();
        this.f2702a = parcel.createTypedArrayList(s.CREATOR);
        this.f2703b = parcel.createStringArrayList();
        this.f2704c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2705d = parcel.readInt();
        this.f2706e = parcel.readString();
        this.f2707f = parcel.createStringArrayList();
        this.f2708g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2709h = parcel.createTypedArrayList(n.l.CREATOR);
    }
}

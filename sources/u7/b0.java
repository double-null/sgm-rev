package u7;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: StreamKey.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements Comparable<b0>, Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f25978d = x7.l0.C0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f25979e = x7.l0.C0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f25980f = x7.l0.C0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25983c;

    /* JADX INFO: compiled from: StreamKey.java */
    class a implements Parcelable.Creator<b0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 createFromParcel(Parcel parcel) {
            return new b0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0[] newArray(int i10) {
            return new b0[i10];
        }
    }

    public b0(int i10, int i11, int i12) {
        this.f25981a = i10;
        this.f25982b = i11;
        this.f25983c = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b0 b0Var) {
        int i10 = this.f25981a - b0Var.f25981a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f25982b - b0Var.f25982b;
        return i11 == 0 ? this.f25983c - b0Var.f25983c : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f25981a == b0Var.f25981a && this.f25982b == b0Var.f25982b && this.f25983c == b0Var.f25983c;
    }

    public int hashCode() {
        return (((this.f25981a * 31) + this.f25982b) * 31) + this.f25983c;
    }

    public String toString() {
        return this.f25981a + "." + this.f25982b + "." + this.f25983c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25981a);
        parcel.writeInt(this.f25982b);
        parcel.writeInt(this.f25983c);
    }

    b0(Parcel parcel) {
        this.f25981a = parcel.readInt();
        this.f25982b = parcel.readInt();
        this.f25983c = parcel.readInt();
    }
}

package c6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0095a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4756c;

    /* JADX INFO: renamed from: c6.a$a, reason: collision with other inner class name */
    static class C0095a implements Parcelable.Creator<a> {
        C0095a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0095a c0095a) {
        this(parcel);
    }

    public String a() {
        return this.f4754a;
    }

    public long b() {
        return this.f4755b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4755b == aVar.f4755b && this.f4756c == aVar.f4756c) {
            return this.f4754a.equals(aVar.f4754a);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f4754a.hashCode() * 31;
        long j10 = this.f4755b;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f4756c;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "LineAccessToken{accessToken='#####', expiresInMillis=" + this.f4755b + ", issuedClientTimeMillis=" + this.f4756c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4754a);
        parcel.writeLong(this.f4755b);
        parcel.writeLong(this.f4756c);
    }

    public a(String str, long j10, long j11) {
        this.f4754a = str;
        this.f4755b = j10;
        this.f4756c = j11;
    }

    private a(Parcel parcel) {
        this.f4754a = parcel.readString();
        this.f4755b = parcel.readLong();
        this.f4756c = parcel.readLong();
    }
}

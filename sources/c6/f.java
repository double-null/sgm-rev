package c6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f4775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4776d;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (!this.f4773a.equals(fVar.f4773a) || !this.f4774b.equals(fVar.f4774b)) {
                return false;
            }
            Uri uri = this.f4775c;
            if (uri == null ? fVar.f4775c != null : !uri.equals(fVar.f4775c)) {
                return false;
            }
            String str = this.f4776d;
            String str2 = fVar.f4776d;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.f4773a.hashCode() * 31) + this.f4774b.hashCode()) * 31;
        Uri uri = this.f4775c;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f4776d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LineProfile{displayName='" + this.f4774b + "', userId='" + this.f4773a + "', pictureUrl='" + this.f4775c + "', statusMessage='" + this.f4776d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4773a);
        parcel.writeString(this.f4774b);
        parcel.writeParcelable(this.f4775c, i10);
        parcel.writeString(this.f4776d);
    }

    public f(String str, String str2, Uri uri, String str3) {
        this.f4773a = str;
        this.f4774b = str2;
        this.f4775c = uri;
        this.f4776d = str3;
    }

    private f(Parcel parcel) {
        this.f4773a = parcel.readString();
        this.f4774b = parcel.readString();
        this.f4775c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f4776d = parcel.readString();
    }
}

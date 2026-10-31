package i6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0245a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f15992f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f15993g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f15995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f15996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15998e;

    /* JADX INFO: renamed from: i6.a$a, reason: collision with other inner class name */
    static class C0245a implements Parcelable.Creator<a> {
        C0245a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0245a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f16000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Uri f16001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f16003e;

        public b(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("channelId is empty.");
            }
            this.f15999a = str;
            this.f16000b = Uri.parse("https://access.line.me/v2");
            this.f16001c = Uri.parse("https://access.line.me/dialog/oauth/weblogin");
        }

        public a f() {
            return new a(this, (C0245a) null);
        }
    }

    /* synthetic */ a(Parcel parcel, C0245a c0245a) {
        this(parcel);
    }

    public String a() {
        return this.f15994a;
    }

    public Uri b() {
        return this.f15995b;
    }

    public Uri c() {
        return this.f15996c;
    }

    public boolean d() {
        return this.f15998e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f15997d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15997d == aVar.f15997d && this.f15998e == aVar.f15998e && this.f15994a.equals(aVar.f15994a) && this.f15995b.equals(aVar.f15995b)) {
            return this.f15996c.equals(aVar.f15996c);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f15994a.hashCode() * 31) + this.f15995b.hashCode()) * 31) + this.f15996c.hashCode()) * 31) + (this.f15997d ? 1 : 0)) * 31) + (this.f15998e ? 1 : 0);
    }

    public String toString() {
        return "LineAuthenticationConfig{channelId=" + this.f15994a + ", endPointBaseUrl=" + this.f15995b + ", webLoginPageUrl=" + this.f15996c + ", isLineAppAuthenticationDisabled=" + this.f15997d + ", isEncryptorPreparationDisabled=" + this.f15998e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15994a);
        parcel.writeParcelable(this.f15995b, i10);
        parcel.writeParcelable(this.f15996c, i10);
        parcel.writeInt((this.f15997d ? f15992f : 0) | 0 | (this.f15998e ? f15993g : 0));
    }

    /* synthetic */ a(b bVar, C0245a c0245a) {
        this(bVar);
    }

    private a(b bVar) {
        this.f15994a = bVar.f15999a;
        this.f15995b = bVar.f16000b;
        this.f15996c = bVar.f16001c;
        this.f15997d = bVar.f16002d;
        this.f15998e = bVar.f16003e;
    }

    private a(Parcel parcel) {
        this.f15994a = parcel.readString();
        this.f15995b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f15996c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int i10 = parcel.readInt();
        this.f15997d = (f15992f & i10) > 0;
        this.f15998e = (i10 & f15993g) > 0;
    }
}

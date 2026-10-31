package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f4757c = new b(-1, "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4759b;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static String b(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public int a() {
        return this.f4758a;
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
            b bVar = (b) obj;
            if (this.f4758a != bVar.f4758a) {
                return false;
            }
            String str = this.f4759b;
            String str2 = bVar.f4759b;
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
        int i10 = this.f4758a * 31;
        String str = this.f4759b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LineApiError{httpResponseCode=" + this.f4758a + ", message='" + this.f4759b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4758a);
        parcel.writeString(this.f4759b);
    }

    public b(Exception exc) {
        this(-1, b(exc));
    }

    public b(String str) {
        this(-1, str);
    }

    public b(int i10, Exception exc) {
        this(i10, b(exc));
    }

    public b(int i10, String str) {
        this.f4758a = i10;
        this.f4759b = str;
    }

    private b(Parcel parcel) {
        this.f4758a = parcel.readInt();
        this.f4759b = parcel.readString();
    }
}

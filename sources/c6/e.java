package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c6.a f4771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f4772b;

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    public c6.a a() {
        return this.f4771a;
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
        e eVar = (e) obj;
        if (this.f4771a.equals(eVar.f4771a)) {
            return this.f4772b.equals(eVar.f4772b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f4771a.hashCode() * 31) + this.f4772b.hashCode();
    }

    public String toString() {
        return "LineCredential{accessToken=" + ((Object) "#####") + ", permission=" + this.f4772b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f4771a, i10);
        parcel.writeStringList(this.f4772b);
    }

    public e(c6.a aVar, List<String> list) {
        this.f4771a = aVar;
        this.f4772b = list;
    }

    private e(Parcel parcel) {
        this.f4771a = (c6.a) parcel.readParcelable(c6.a.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.f4772b = Collections.unmodifiableList(arrayList);
    }
}

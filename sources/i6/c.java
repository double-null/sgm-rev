package i6;

import android.os.Parcel;
import android.os.Parcelable;
import c6.d;
import c6.e;
import c6.f;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f16005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f16006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f16007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.b f16008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f16004e = new c(d.CANCEL, c6.b.f4757c);
    public static final Parcelable.Creator<c> CREATOR = new a();

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public c6.b a() {
        return this.f16008d;
    }

    public e b() {
        return this.f16007c;
    }

    public d c() {
        return this.f16005a;
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
        c cVar = (c) obj;
        if (this.f16005a != cVar.f16005a) {
            return false;
        }
        f fVar = this.f16006b;
        if (fVar == null ? cVar.f16006b != null : !fVar.equals(cVar.f16006b)) {
            return false;
        }
        e eVar = this.f16007c;
        if (eVar == null ? cVar.f16007c == null : eVar.equals(cVar.f16007c)) {
            return this.f16008d.equals(cVar.f16008d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f16005a.hashCode() * 31;
        f fVar = this.f16006b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        e eVar = this.f16007c;
        return ((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f16008d.hashCode();
    }

    public String toString() {
        return "LineLoginResult{errorData=" + this.f16008d + ", responseCode=" + this.f16005a + ", lineProfile=" + this.f16006b + ", lineCredential=" + this.f16007c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f16005a);
        parcel.writeParcelable(this.f16006b, i10);
        parcel.writeParcelable(this.f16007c, i10);
        parcel.writeParcelable(this.f16008d, i10);
    }

    public c(f fVar, e eVar) {
        this(d.SUCCESS, fVar, eVar, c6.b.f4757c);
    }

    public c(d dVar, c6.b bVar) {
        this(dVar, null, null, bVar);
    }

    c(d dVar, f fVar, e eVar, c6.b bVar) {
        this.f16005a = dVar;
        this.f16006b = fVar;
        this.f16007c = eVar;
        this.f16008d = bVar;
    }

    private c(Parcel parcel) {
        this.f16005a = (d) parcel.readSerializable();
        this.f16006b = (f) parcel.readParcelable(f.class.getClassLoader());
        this.f16007c = (e) parcel.readParcelable(c6.a.class.getClassLoader());
        this.f16008d = (c6.b) parcel.readParcelable(c6.b.class.getClassLoader());
    }
}

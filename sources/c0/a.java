package c0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: AbsSavedState.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable f4516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4515b = new C0092a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: c0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbsSavedState.java */
    static class C0092a extends a {
        C0092a() {
            super((C0092a) null);
        }
    }

    /* JADX INFO: compiled from: AbsSavedState.java */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f4515b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(C0092a c0092a) {
        this();
    }

    public final Parcelable a() {
        return this.f4516a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f4516a, i10);
    }

    private a() {
        this.f4516a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4516a = parcelable == f4515b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f4516a = parcelable == null ? f4515b : parcelable;
    }
}

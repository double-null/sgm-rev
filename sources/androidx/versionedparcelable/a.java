package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: VersionedParcelParcel.java */
/* JADX INFO: loaded from: classes.dex */
class a extends VersionedParcel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f3586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f3587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3593k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f3587e.writeInt(-1);
        } else {
            this.f3587e.writeInt(bArr.length);
            this.f3587e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3587e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f3587e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f3587e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f3587e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f3591i;
        if (i10 >= 0) {
            int i11 = this.f3586d.get(i10);
            int iDataPosition = this.f3587e.dataPosition();
            this.f3587e.setDataPosition(i11);
            this.f3587e.writeInt(iDataPosition - i11);
            this.f3587e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f3587e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f3592j;
        if (i10 == this.f3588f) {
            i10 = this.f3589g;
        }
        return new a(parcel, iDataPosition, i10, this.f3590h + "  ", this.f3583a, this.f3584b, this.f3585c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f3587e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i10 = this.f3587e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f3587e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3587e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f3592j < this.f3589g) {
            int i11 = this.f3593k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f3587e.setDataPosition(this.f3592j);
            int i12 = this.f3587e.readInt();
            this.f3593k = this.f3587e.readInt();
            this.f3592j += i12;
        }
        return this.f3593k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f3587e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f3587e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f3587e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f3591i = i10;
        this.f3586d.put(i10, this.f3587e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f3587e.writeInt(z10 ? 1 : 0);
    }

    private a(Parcel parcel, int i10, int i11, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3586d = new SparseIntArray();
        this.f3591i = -1;
        this.f3593k = -1;
        this.f3587e = parcel;
        this.f3588f = i10;
        this.f3589g = i11;
        this.f3592j = i10;
        this.f3590h = str;
    }
}

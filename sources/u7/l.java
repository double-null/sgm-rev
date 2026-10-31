package u7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: DrmInitData.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f26193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26196d;

    /* JADX INFO: compiled from: DrmInitData.java */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* JADX INFO: compiled from: DrmInitData.java */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f26197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f26198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f26200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f26201e;

        /* JADX INFO: compiled from: DrmInitData.java */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f26198b);
        }

        public b b(byte[] bArr) {
            return new b(this.f26198b, this.f26199c, this.f26200d, bArr);
        }

        public boolean c() {
            return this.f26201e != null;
        }

        public boolean d(UUID uuid) {
            return f.f26059a.equals(this.f26198b) || uuid.equals(this.f26198b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f26199c, bVar.f26199c) && Objects.equals(this.f26200d, bVar.f26200d) && Objects.equals(this.f26198b, bVar.f26198b) && Arrays.equals(this.f26201e, bVar.f26201e);
        }

        public int hashCode() {
            if (this.f26197a == 0) {
                int iHashCode = this.f26198b.hashCode() * 31;
                String str = this.f26199c;
                this.f26197a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26200d.hashCode()) * 31) + Arrays.hashCode(this.f26201e);
            }
            return this.f26197a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f26198b.getMostSignificantBits());
            parcel.writeLong(this.f26198b.getLeastSignificantBits());
            parcel.writeString(this.f26199c);
            parcel.writeString(this.f26200d);
            parcel.writeByteArray(this.f26201e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f26198b = (UUID) x7.a.e(uuid);
            this.f26199c = str;
            this.f26200d = w.u((String) x7.a.e(str2));
            this.f26201e = bArr;
        }

        b(Parcel parcel) {
            this.f26198b = new UUID(parcel.readLong(), parcel.readLong());
            this.f26199c = parcel.readString();
            this.f26200d = (String) x7.l0.i(parcel.readString());
            this.f26201e = parcel.createByteArray();
        }
    }

    public l(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f26198b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static l d(l lVar, l lVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (lVar != null) {
            str = lVar.f26195c;
            for (b bVar : lVar.f26193a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (lVar2 != null) {
            if (str == null) {
                str = lVar2.f26195c;
            }
            int size = arrayList.size();
            for (b bVar2 : lVar2.f26193a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f26198b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new l(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = f.f26059a;
        if (uuid.equals(bVar.f26198b)) {
            return uuid.equals(bVar2.f26198b) ? 0 : 1;
        }
        return bVar.f26198b.compareTo(bVar2.f26198b);
    }

    public l c(String str) {
        return Objects.equals(this.f26195c, str) ? this : new l(str, false, this.f26193a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f26193a[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f26195c, lVar.f26195c) && Arrays.equals(this.f26193a, lVar.f26193a);
    }

    public l f(l lVar) {
        String str;
        String str2 = this.f26195c;
        x7.a.g(str2 == null || (str = lVar.f26195c) == null || TextUtils.equals(str2, str));
        String str3 = this.f26195c;
        if (str3 == null) {
            str3 = lVar.f26195c;
        }
        return new l(str3, (b[]) x7.l0.X0(this.f26193a, lVar.f26193a));
    }

    public int hashCode() {
        if (this.f26194b == 0) {
            String str = this.f26195c;
            this.f26194b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f26193a);
        }
        return this.f26194b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f26195c);
        parcel.writeTypedArray(this.f26193a, 0);
    }

    public l(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public l(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public l(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private l(String str, boolean z10, b... bVarArr) {
        this.f26195c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f26193a = bVarArr;
        this.f26196d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    l(Parcel parcel) {
        this.f26195c = parcel.readString();
        b[] bVarArr = (b[]) x7.l0.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f26193a = bVarArr;
        this.f26196d = bVarArr.length;
    }
}

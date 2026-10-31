package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: BackStackState.java */
/* JADX INFO: loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f2528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<String> f2529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f2530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f2531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f2533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f2534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f2535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f2536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f2537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f2538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList<String> f2539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f2540m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f2541n;

    /* JADX INFO: compiled from: BackStackState.java */
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

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2744c.size();
        this.f2528a = new int[size * 5];
        if (!aVar.f2750i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2529b = new ArrayList<>(size);
        this.f2530c = new int[size];
        this.f2531d = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            v.a aVar2 = aVar.f2744c.get(i10);
            int i12 = i11 + 1;
            this.f2528a[i11] = aVar2.f2761a;
            ArrayList<String> arrayList = this.f2529b;
            Fragment fragment = aVar2.f2762b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f2528a;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f2763c;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f2764d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f2765e;
            iArr[i15] = aVar2.f2766f;
            this.f2530c[i10] = aVar2.f2767g.ordinal();
            this.f2531d[i10] = aVar2.f2768h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f2532e = aVar.f2749h;
        this.f2533f = aVar.f2752k;
        this.f2534g = aVar.f2525v;
        this.f2535h = aVar.f2753l;
        this.f2536i = aVar.f2754m;
        this.f2537j = aVar.f2755n;
        this.f2538k = aVar.f2756o;
        this.f2539l = aVar.f2757p;
        this.f2540m = aVar.f2758q;
        this.f2541n = aVar.f2759r;
    }

    public androidx.fragment.app.a a(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f2528a.length) {
            v.a aVar2 = new v.a();
            int i12 = i10 + 1;
            aVar2.f2761a = this.f2528a[i10];
            if (n.D0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2528a[i12]);
            }
            String str = this.f2529b.get(i11);
            if (str != null) {
                aVar2.f2762b = nVar.f0(str);
            } else {
                aVar2.f2762b = null;
            }
            aVar2.f2767g = androidx.lifecycle.f.b.values()[this.f2530c[i11]];
            aVar2.f2768h = androidx.lifecycle.f.b.values()[this.f2531d[i11]];
            int[] iArr = this.f2528a;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f2763c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f2764d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f2765e = i18;
            int i19 = iArr[i17];
            aVar2.f2766f = i19;
            aVar.f2745d = i14;
            aVar.f2746e = i16;
            aVar.f2747f = i18;
            aVar.f2748g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f2749h = this.f2532e;
        aVar.f2752k = this.f2533f;
        aVar.f2525v = this.f2534g;
        aVar.f2750i = true;
        aVar.f2753l = this.f2535h;
        aVar.f2754m = this.f2536i;
        aVar.f2755n = this.f2537j;
        aVar.f2756o = this.f2538k;
        aVar.f2757p = this.f2539l;
        aVar.f2758q = this.f2540m;
        aVar.f2759r = this.f2541n;
        aVar.n(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2528a);
        parcel.writeStringList(this.f2529b);
        parcel.writeIntArray(this.f2530c);
        parcel.writeIntArray(this.f2531d);
        parcel.writeInt(this.f2532e);
        parcel.writeString(this.f2533f);
        parcel.writeInt(this.f2534g);
        parcel.writeInt(this.f2535h);
        TextUtils.writeToParcel(this.f2536i, parcel, 0);
        parcel.writeInt(this.f2537j);
        TextUtils.writeToParcel(this.f2538k, parcel, 0);
        parcel.writeStringList(this.f2539l);
        parcel.writeStringList(this.f2540m);
        parcel.writeInt(this.f2541n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f2528a = parcel.createIntArray();
        this.f2529b = parcel.createStringArrayList();
        this.f2530c = parcel.createIntArray();
        this.f2531d = parcel.createIntArray();
        this.f2532e = parcel.readInt();
        this.f2533f = parcel.readString();
        this.f2534g = parcel.readInt();
        this.f2535h = parcel.readInt();
        this.f2536i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2537j = parcel.readInt();
        this.f2538k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2539l = parcel.createStringArrayList();
        this.f2540m = parcel.createStringArrayList();
        this.f2541n = parcel.readInt() != 0;
    }
}

package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: FragmentState.java */
/* JADX INFO: loaded from: classes.dex */
final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f2719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f2720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f2721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f2723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f2724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f2725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f2726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Bundle f2727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f2728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f2729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Bundle f2730m;

    /* JADX INFO: compiled from: FragmentState.java */
    class a implements Parcelable.Creator<s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i10) {
            return new s[i10];
        }
    }

    s(Fragment fragment) {
        this.f2718a = fragment.getClass().getName();
        this.f2719b = fragment.mWho;
        this.f2720c = fragment.mFromLayout;
        this.f2721d = fragment.mFragmentId;
        this.f2722e = fragment.mContainerId;
        this.f2723f = fragment.mTag;
        this.f2724g = fragment.mRetainInstance;
        this.f2725h = fragment.mRemoving;
        this.f2726i = fragment.mDetached;
        this.f2727j = fragment.mArguments;
        this.f2728k = fragment.mHidden;
        this.f2729l = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2718a);
        sb2.append(" (");
        sb2.append(this.f2719b);
        sb2.append(")}:");
        if (this.f2720c) {
            sb2.append(" fromLayout");
        }
        if (this.f2722e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2722e));
        }
        String str = this.f2723f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2723f);
        }
        if (this.f2724g) {
            sb2.append(" retainInstance");
        }
        if (this.f2725h) {
            sb2.append(" removing");
        }
        if (this.f2726i) {
            sb2.append(" detached");
        }
        if (this.f2728k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2718a);
        parcel.writeString(this.f2719b);
        parcel.writeInt(this.f2720c ? 1 : 0);
        parcel.writeInt(this.f2721d);
        parcel.writeInt(this.f2722e);
        parcel.writeString(this.f2723f);
        parcel.writeInt(this.f2724g ? 1 : 0);
        parcel.writeInt(this.f2725h ? 1 : 0);
        parcel.writeInt(this.f2726i ? 1 : 0);
        parcel.writeBundle(this.f2727j);
        parcel.writeInt(this.f2728k ? 1 : 0);
        parcel.writeBundle(this.f2730m);
        parcel.writeInt(this.f2729l);
    }

    s(Parcel parcel) {
        this.f2718a = parcel.readString();
        this.f2719b = parcel.readString();
        this.f2720c = parcel.readInt() != 0;
        this.f2721d = parcel.readInt();
        this.f2722e = parcel.readInt();
        this.f2723f = parcel.readString();
        this.f2724g = parcel.readInt() != 0;
        this.f2725h = parcel.readInt() != 0;
        this.f2726i = parcel.readInt() != 0;
        this.f2727j = parcel.readBundle();
        this.f2728k = parcel.readInt() != 0;
        this.f2730m = parcel.readBundle();
        this.f2729l = parcel.readInt();
    }
}

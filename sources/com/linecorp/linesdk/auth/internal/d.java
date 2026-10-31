package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d6.f;

/* JADX INFO: loaded from: classes4.dex */
final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    f f12694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f12695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f12696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f12697d;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f12698a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f12699b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12700c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f12701d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ int[] f12702e = {1, 2, 3, 4};

        public static int[] b() {
            return (int[]) f12702e.clone();
        }
    }

    /* synthetic */ d(Parcel parcel, byte b10) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        f fVar = this.f12694a;
        parcel.writeString(fVar == null ? null : fVar.f13347a);
        f fVar2 = this.f12694a;
        parcel.writeString(fVar2 != null ? fVar2.f13348b : null);
        parcel.writeString(this.f12695b);
        parcel.writeByte((byte) (this.f12697d - 1));
        parcel.writeString(this.f12696c);
    }

    d() {
        this.f12697d = b.f12698a;
    }

    private d(Parcel parcel) {
        this.f12697d = b.f12698a;
        String string = parcel.readString();
        String string2 = parcel.readString();
        this.f12694a = (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) ? null : new f(string, string2);
        this.f12695b = parcel.readString();
        this.f12697d = b.b()[parcel.readByte()];
        this.f12696c = parcel.readString();
    }
}

package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List<CustomAction> f467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Bundle f469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f470l;

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f459a = i10;
        this.f460b = j10;
        this.f461c = j11;
        this.f462d = f10;
        this.f463e = j12;
        this.f464f = i11;
        this.f465g = charSequence;
        this.f466h = j13;
        this.f467i = new ArrayList(list);
        this.f468j = j14;
        this.f469k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        List<Object> listD = g.d(obj);
        if (listD != null) {
            arrayList = new ArrayList(listD.size());
            Iterator<Object> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle bundleA = h.a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(g.i(obj), g.h(obj), g.c(obj), g.g(obj), g.a(obj), 0, g.e(obj), g.f(obj), arrayList, g.b(obj), bundleA);
        playbackStateCompat.f470l = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f459a + ", position=" + this.f460b + ", buffered position=" + this.f461c + ", speed=" + this.f462d + ", updated=" + this.f466h + ", actions=" + this.f463e + ", error code=" + this.f464f + ", error message=" + this.f465g + ", custom actions=" + this.f467i + ", active item id=" + this.f468j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f459a);
        parcel.writeLong(this.f460b);
        parcel.writeFloat(this.f462d);
        parcel.writeLong(this.f466h);
        parcel.writeLong(this.f461c);
        parcel.writeLong(this.f463e);
        TextUtils.writeToParcel(this.f465g, parcel, i10);
        parcel.writeTypedList(this.f467i);
        parcel.writeLong(this.f468j);
        parcel.writeBundle(this.f469k);
        parcel.writeInt(this.f464f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f475e;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f471a = str;
            this.f472b = charSequence;
            this.f473c = i10;
            this.f474d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(g.a.a(obj), g.a.d(obj), g.a.c(obj), g.a.b(obj));
            customAction.f475e = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f472b) + ", mIcon=" + this.f473c + ", mExtras=" + this.f474d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f471a);
            TextUtils.writeToParcel(this.f472b, parcel, i10);
            parcel.writeInt(this.f473c);
            parcel.writeBundle(this.f474d);
        }

        CustomAction(Parcel parcel) {
            this.f471a = parcel.readString();
            this.f472b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f473c = parcel.readInt();
            this.f474d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f459a = parcel.readInt();
        this.f460b = parcel.readLong();
        this.f462d = parcel.readFloat();
        this.f466h = parcel.readLong();
        this.f461c = parcel.readLong();
        this.f463e = parcel.readLong();
        this.f465g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f467i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f468j = parcel.readLong();
        this.f469k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f464f = parcel.readInt();
    }
}

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object f425i;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f433h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f426a, this.f427b, this.f428c, this.f429d, this.f430e, this.f431f, this.f432g, this.f433h);
        }

        public b b(CharSequence charSequence) {
            this.f429d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f432g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f430e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f431f = uri;
            return this;
        }

        public b f(String str) {
            this.f426a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f433h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f428c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f427b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f417a = str;
        this.f418b = charSequence;
        this.f419c = charSequence2;
        this.f420d = charSequence3;
        this.f421e = bitmap;
        this.f422f = uri;
        this.f423g = bundle;
        this.f424h = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle bundleC = android.support.v4.media.a.c(obj);
        if (bundleC != null) {
            MediaSessionCompat.a(bundleC);
            uri = (Uri) bundleC.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleC;
        } else if (!bundleC.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleC.size() != 2) {
            bundleC.remove("android.support.v4.media.description.MEDIA_URI");
            bundleC.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleC;
        }
        bVar.c(bundle);
        if (uri != null) {
            bVar.g(uri);
        } else {
            bVar.g(android.support.v4.media.b.a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = bVar.a();
        mediaDescriptionCompatA.f425i = obj;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        Object obj = this.f425i;
        if (obj != null) {
            return obj;
        }
        Object objB = android.support.v4.media.a.C0008a.b();
        android.support.v4.media.a.C0008a.g(objB, this.f417a);
        android.support.v4.media.a.C0008a.i(objB, this.f418b);
        android.support.v4.media.a.C0008a.h(objB, this.f419c);
        android.support.v4.media.a.C0008a.c(objB, this.f420d);
        android.support.v4.media.a.C0008a.e(objB, this.f421e);
        android.support.v4.media.a.C0008a.f(objB, this.f422f);
        android.support.v4.media.a.C0008a.d(objB, this.f423g);
        android.support.v4.media.b.a.a(objB, this.f424h);
        Object objA = android.support.v4.media.a.C0008a.a(objB);
        this.f425i = objA;
        return objA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f418b) + ", " + ((Object) this.f419c) + ", " + ((Object) this.f420d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(b(), parcel, i10);
    }
}

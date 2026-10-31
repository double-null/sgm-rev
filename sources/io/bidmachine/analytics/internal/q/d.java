package io.bidmachine.analytics.internal.q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.k;
import wc.m;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends IInterface {

    public static final class a implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0304d f17314c = new C0304d(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final k f17315d = m.a(c.f17342a);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final b f17316e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final b f17317f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final b f17318g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final b f17319h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final b f17320i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final b f17321j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final b f17322k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final b f17323l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final b f17324m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final b f17325n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final b f17326o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final b f17327p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final b f17328q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final b f17329r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final b f17330s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IBinder f17331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final id.a f17332b;

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.d$a$a, reason: collision with other inner class name */
        static final class C0303a extends u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0303a f17333a = new C0303a();

            C0303a() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Parcel invoke() {
                return Parcel.obtain();
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f17334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f17335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f17336c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f17337d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final int f17338e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final int f17339f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final int f17340g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final int f17341h;

            public b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                this.f17334a = i10;
                this.f17335b = i11;
                this.f17336c = i12;
                this.f17337d = i13;
                this.f17338e = i14;
                this.f17339f = i15;
                this.f17340g = i16;
                this.f17341h = i17;
            }

            public final b a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                return new b(i10, i11, i12, i13, i14, i15, i16, i17);
            }

            public final int b() {
                return this.f17341h;
            }

            public final int c() {
                return this.f17339f;
            }

            public final int d() {
                return this.f17335b;
            }

            public final int e() {
                return this.f17336c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f17334a == bVar.f17334a && this.f17335b == bVar.f17335b && this.f17336c == bVar.f17336c && this.f17337d == bVar.f17337d && this.f17338e == bVar.f17338e && this.f17339f == bVar.f17339f && this.f17340g == bVar.f17340g && this.f17341h == bVar.f17341h;
            }

            public final int f() {
                return this.f17340g;
            }

            public final int g() {
                return this.f17338e;
            }

            public final int h() {
                return this.f17334a;
            }

            public int hashCode() {
                return (((((((((((((Integer.hashCode(this.f17334a) * 31) + Integer.hashCode(this.f17335b)) * 31) + Integer.hashCode(this.f17336c)) * 31) + Integer.hashCode(this.f17337d)) * 31) + Integer.hashCode(this.f17338e)) * 31) + Integer.hashCode(this.f17339f)) * 31) + Integer.hashCode(this.f17340g)) * 31) + Integer.hashCode(this.f17341h);
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ b a(b bVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
                return bVar.a((i18 & 1) != 0 ? bVar.f17334a : i10, (i18 & 2) != 0 ? bVar.f17335b : i11, (i18 & 4) != 0 ? bVar.f17336c : i12, (i18 & 8) != 0 ? bVar.f17337d : i13, (i18 & 16) != 0 ? bVar.f17338e : i14, (i18 & 32) != 0 ? bVar.f17339f : i15, (i18 & 64) != 0 ? bVar.f17340g : i16, (i18 & 128) != 0 ? bVar.f17341h : i17);
            }

            public final int a() {
                return this.f17337d;
            }
        }

        static final class c extends u implements id.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f17342a = new c();

            c() {
                super(0);
            }

            @Override // id.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return io.bidmachine.analytics.internal.E.e.a("Y29tLmFuZHJvaWQudmVuZGluZy5iaWxsaW5nLklJbkFwcEJpbGxpbmdTZXJ2aWNl");
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.d$a$d, reason: collision with other inner class name */
        public static final class C0304d {
            public /* synthetic */ C0304d(kotlin.jvm.internal.k kVar) {
                this();
            }

            public final b a() {
                return a.f17317f;
            }

            public final b b() {
                return a.f17318g;
            }

            public final b c() {
                return a.f17319h;
            }

            public final b d() {
                return a.f17320i;
            }

            public final b e() {
                return a.f17321j;
            }

            public final b f() {
                return a.f17322k;
            }

            public final b g() {
                return a.f17323l;
            }

            public final b h() {
                return a.f17324m;
            }

            public final b i() {
                return a.f17325n;
            }

            public final b j() {
                return a.f17326o;
            }

            public final b k() {
                return a.f17327p;
            }

            public final b l() {
                return a.f17328q;
            }

            public final b m() {
                return a.f17329r;
            }

            public final b n() {
                return a.f17330s;
            }

            public final b o() {
                return a.f17316e;
            }

            public final String p() {
                return (String) a.f17315d.getValue();
            }

            private C0304d() {
            }

            public final b a(io.bidmachine.analytics.internal.p002a.e eVar) {
                io.bidmachine.analytics.internal.q.c.r rVar = io.bidmachine.analytics.internal.q.c.f17259j;
                if (eVar.compareTo(rVar.r()) <= 0) {
                    return a();
                }
                if (eVar.compareTo(rVar.s()) <= 0) {
                    return b();
                }
                if (eVar.compareTo(rVar.t()) <= 0) {
                    return c();
                }
                if (eVar.compareTo(rVar.u()) <= 0) {
                    return d();
                }
                if (eVar.compareTo(rVar.v()) <= 0) {
                    return e();
                }
                if (eVar.compareTo(rVar.w()) <= 0) {
                    return f();
                }
                if (eVar.compareTo(rVar.x()) <= 0) {
                    return g();
                }
                if (eVar.compareTo(rVar.y()) <= 0) {
                    return h();
                }
                if (eVar.compareTo(rVar.z()) <= 0) {
                    return i();
                }
                if (eVar.compareTo(rVar.A()) <= 0) {
                    return j();
                }
                if (eVar.compareTo(rVar.B()) <= 0) {
                    return k();
                }
                if (eVar.compareTo(rVar.C()) <= 0) {
                    return l();
                }
                if (eVar.compareTo(rVar.D()) <= 0) {
                    return m();
                }
                return eVar.compareTo(rVar.E()) <= 0 ? n() : o();
            }
        }

        static {
            b bVar = new b(1, 27, 11, 26, 9, 6, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, 20);
            f17316e = bVar;
            b bVarA = b.a(bVar, 0, 17, 0, 9, 0, 0, 0, 17, 117, null);
            f17317f = bVarA;
            f17318g = bVarA;
            b bVarA2 = b.a(bVarA, 0, 19, 0, 19, 0, 0, 0, 0, 245, null);
            f17319h = bVarA2;
            f17320i = bVarA2;
            b bVarA3 = b.a(bVarA2, 0, 20, 0, 0, 0, 0, 0, 20, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null);
            f17321j = bVarA3;
            f17322k = bVarA3;
            b bVarA4 = b.a(bVarA3, 0, 21, 0, 0, 0, 0, 0, 0, 253, null);
            f17323l = bVarA4;
            b bVarA5 = b.a(bVarA4, 0, 22, 0, 0, 0, 0, 0, 0, 253, null);
            f17324m = bVarA5;
            f17325n = bVarA5;
            f17326o = bVarA5;
            b bVarA6 = b.a(bVarA5, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            f17327p = bVarA6;
            b bVarA7 = b.a(bVarA6, 0, 23, 0, 0, 0, 0, 0, 0, 253, null);
            f17328q = bVarA7;
            b bVarA8 = b.a(bVarA7, 0, 25, 0, 24, 0, 0, 0, 0, 245, null);
            f17329r = bVarA8;
            f17330s = b.a(bVarA8, 0, 27, 0, 26, 0, 0, 0, 0, 245, null);
        }

        public a(IBinder iBinder, id.a aVar) {
            this.f17331a = iBinder;
            this.f17332b = aVar;
        }

        private final Parcel q() {
            Parcel parcel = (Parcel) this.f17332b.invoke();
            parcel.writeInterfaceToken(f17314c.p());
            return parcel;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f17331a;
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public int a(b bVar, String str, String str2) {
            Parcel parcelQ = q();
            parcelQ.writeInt(bVar.d());
            parcelQ.writeString(str);
            parcelQ.writeString(str2);
            Parcel parcelA = a(bVar.h(), parcelQ);
            int i10 = parcelA.readInt();
            parcelA.recycle();
            return i10;
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public Bundle b(b bVar, String str, String str2, Bundle bundle) {
            Parcel parcelQ = q();
            parcelQ.writeInt(bVar.a());
            parcelQ.writeString(str);
            parcelQ.writeString(str2);
            parcelQ.writeString(null);
            a(parcelQ, bundle);
            Parcel parcelA = a(bVar.e(), parcelQ);
            Bundle bundle2 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle2;
        }

        public /* synthetic */ a(IBinder iBinder, id.a aVar, int i10, kotlin.jvm.internal.k kVar) {
            this(iBinder, (i10 & 2) != 0 ? C0303a.f17333a : aVar);
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public Bundle a(b bVar, String str, String str2, Bundle bundle) {
            Parcel parcelQ = q();
            parcelQ.writeInt(bVar.c());
            parcelQ.writeString(str);
            parcelQ.writeString(str2);
            parcelQ.writeString(null);
            a(parcelQ, bundle);
            Parcel parcelA = a(bVar.g(), parcelQ);
            Bundle bundle2 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle2;
        }

        @Override // io.bidmachine.analytics.internal.q.d
        public Bundle a(b bVar, String str, String str2, Bundle bundle, Bundle bundle2) {
            Parcel parcelQ = q();
            parcelQ.writeInt(bVar.b());
            parcelQ.writeString(str);
            parcelQ.writeString(str2);
            a(parcelQ, bundle);
            a(parcelQ, bundle2);
            Parcel parcelA = a(bVar.f(), parcelQ);
            Bundle bundle3 = (Bundle) a(parcelA, Bundle.CREATOR);
            parcelA.recycle();
            return bundle3;
        }

        private final void a(Parcel parcel, Parcelable parcelable) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }

        public final Parcel a(int i10, Parcel parcel) {
            Parcel parcel2 = (Parcel) this.f17332b.invoke();
            try {
                try {
                    this.f17331a.transact(i10, parcel, parcel2, 0);
                    parcel2.readException();
                    parcel.recycle();
                    return parcel2;
                } catch (RuntimeException e10) {
                    parcel2.recycle();
                    throw e10;
                }
            } catch (Throwable th) {
                parcel.recycle();
                throw th;
            }
        }

        private final Parcelable a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() == 0) {
                return null;
            }
            Object objCreateFromParcel = creator.createFromParcel(parcel);
            t.d(objCreateFromParcel, "null cannot be cast to non-null type android.os.Parcelable");
            return (Parcelable) objCreateFromParcel;
        }
    }

    int a(a.b bVar, String str, String str2);

    Bundle a(a.b bVar, String str, String str2, Bundle bundle);

    Bundle a(a.b bVar, String str, String str2, Bundle bundle, Bundle bundle2);

    Bundle b(a.b bVar, String str, String str2, Bundle bundle);
}

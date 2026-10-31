package io.bidmachine.media3.exoplayer.hls.playlist;

import android.net.Uri;
import com.facebook.appevents.AppEventsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import u7.b0;
import u7.l;
import u7.q;

/* JADX INFO: compiled from: HlsMultivariantPlaylist.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends i8.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f18980n = new d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f18981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f18982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f18983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f18984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f18985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f18986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f18987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<q> f18988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f18989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<l> f18990m;

    /* JADX INFO: compiled from: HlsMultivariantPlaylist.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f18992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18994d;

        public a(Uri uri, q qVar, String str, String str2) {
            this.f18991a = uri;
            this.f18992b = qVar;
            this.f18993c = str;
            this.f18994d = str2;
        }
    }

    /* JADX INFO: compiled from: HlsMultivariantPlaylist.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f18996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f18998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f18999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f19000f;

        public b(Uri uri, q qVar, String str, String str2, String str3, String str4) {
            this.f18995a = uri;
            this.f18996b = qVar;
            this.f18997c = str;
            this.f18998d = str2;
            this.f18999e = str3;
            this.f19000f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new q.b().f0(AppEventsConstants.EVENT_PARAM_VALUE_NO).U("application/x-mpegURL").N(), null, null, null, null);
        }

        public b a(q qVar) {
            return new b(this.f18995a, qVar, this.f18997c, this.f18998d, this.f18999e, this.f19000f);
        }
    }

    public d(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, q qVar, List<q> list7, boolean z10, Map<String, String> map, List<l> list8) {
        super(str, list, z10);
        this.f18981d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f18982e = Collections.unmodifiableList(list2);
        this.f18983f = Collections.unmodifiableList(list3);
        this.f18984g = Collections.unmodifiableList(list4);
        this.f18985h = Collections.unmodifiableList(list5);
        this.f18986i = Collections.unmodifiableList(list6);
        this.f18987j = qVar;
        this.f18988k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f18989l = Collections.unmodifiableMap(map);
        this.f18990m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f18991a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<b0> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                b0 b0Var = list2.get(i12);
                if (b0Var.f25982b == i10 && b0Var.f25983c == i11) {
                    arrayList.add(t10);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static d e(String str) {
        return new d("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f18995a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // m8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d a(List<b0> list) {
        return new d(this.f16102a, this.f16103b, d(this.f18982e, 0, list), Collections.emptyList(), d(this.f18984g, 1, list), d(this.f18985h, 2, list), Collections.emptyList(), this.f18987j, this.f18988k, this.f16104c, this.f18989l, this.f18990m);
    }
}

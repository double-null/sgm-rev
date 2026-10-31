package io.bidmachine;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BidMachineEventTracker.java */
/* JADX INFO: loaded from: classes4.dex */
class s1 implements ub.b {
    s1() {
    }

    private static List<String> k(ub.k kVar, TrackEventType trackEventType) {
        List<String> listV = b2.e().v(trackEventType);
        ArrayList arrayList = listV != null ? new ArrayList(listV) : null;
        List<String> trackingUrls = kVar.getTrackingUrls(trackEventType);
        if (trackingUrls == null) {
            return arrayList;
        }
        if (arrayList == null) {
            return new ArrayList(trackingUrls);
        }
        arrayList.addAll(trackingUrls);
        return arrayList;
    }

    private static void l(String str, io.bidmachine.core.b.InterfaceC0315b<String, oc.a> interfaceC0315b) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new ApiRequest.Builder().url(str).setMethod(io.bidmachine.core.b.e.Get).setDataBinder(new ApiRequest.ApiTrackerDataBinder()).setCallback(interfaceC0315b).request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(int i10, oc.a aVar) {
        return String.format("Dispatching error event to server - (%s-%s) - %s", Integer.valueOf(i10), Integer.valueOf(aVar.e()), aVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n(TrackEventType trackEventType) {
        return String.format("Dispatching event to server - %s", trackEventType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(oc.a aVar) {
        return String.format("Dispatching tracking fail to server - %s", aVar);
    }

    private static String p(String str, String str2, Object obj) {
        return str.replace("${" + str2 + "}", String.valueOf(obj)).replace("%24%7B" + str2 + "%7D", String.valueOf(obj));
    }

    private static String q(String str, Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    str = p(str, key, value);
                }
            }
        }
        return str;
    }

    static String r(String str, ub.j jVar, int i10, int i11, ub.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strP = p(p(p(str, Constants.URL_MACROS_BM_EVENT_CODE, Integer.valueOf(i10)), Constants.URL_MACROS_BM_ACTION_CODE, Integer.valueOf(i10)), Constants.URL_MACROS_BM_ERROR_REASON, Integer.valueOf(i11));
        if (aVar != null) {
            String strD = aVar.d();
            if (strD != null) {
                strP = p(strP, Constants.URL_MACROS_AUCTION_SEAT_ID, strD);
            }
            Double dE = aVar.e();
            if (dE != null) {
                strP = p(strP, Constants.URL_MACROS_AUCTION_PRICE, dE);
            }
        }
        return jVar != null ? q(p(p(strP, Constants.URL_MACROS_BM_ACTION_START, Long.valueOf(jVar.c())), Constants.URL_MACROS_BM_ACTION_FINISH, Long.valueOf(jVar.b())), jVar.a()) : strP;
    }

    private static void s(List<String> list, List<String> list2, ub.j jVar, final int i10, final oc.a aVar) {
        if (list != null && aVar.j()) {
            io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.q1
                @Override // qc.b
                public final Object get() {
                    return s1.m(i10, aVar);
                }
            });
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                l(r(it.next(), jVar, i10, aVar.e(), null), new b(list2, jVar));
            }
        }
    }

    private static void t(List<String> list, List<String> list2, ub.j jVar, final TrackEventType trackEventType, ub.a aVar) {
        if (list == null) {
            return;
        }
        io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.p1
            @Override // qc.b
            public final Object get() {
                return s1.n(trackEventType);
            }
        });
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            l(r(it.next(), jVar, trackEventType.getActionValue(), -1, aVar), new a(list2, jVar, trackEventType));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(List<String> list, ub.j jVar, int i10, final oc.a aVar) {
        if (list != null && aVar.j()) {
            io.bidmachine.core.a.d(new qc.b() { // from class: io.bidmachine.r1
                @Override // qc.b
                public final Object get() {
                    return s1.o(aVar);
                }
            });
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                l(r(it.next(), jVar, i10, aVar.e(), null), null);
            }
        }
    }

    @Override // ub.b
    public void d(ub.k kVar, TrackEventType trackEventType, ub.j jVar, AdsType adsType, oc.a aVar, ub.a aVar2) {
        if (aVar != null) {
            s(k(kVar, TrackEventType.Error), k(kVar, TrackEventType.TrackingError), jVar, trackEventType.getActionValue(), aVar);
        } else {
            t(k(kVar, trackEventType), k(kVar, TrackEventType.TrackingError), jVar, trackEventType, aVar2);
        }
    }

    /* JADX INFO: compiled from: BidMachineEventTracker.java */
    class a implements io.bidmachine.core.b.InterfaceC0315b<String, oc.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f20411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ub.j f20412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TrackEventType f20413c;

        a(List list, ub.j jVar, TrackEventType trackEventType) {
            this.f20411a = list;
            this.f20412b = jVar;
            this.f20413c = trackEventType;
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(oc.a aVar) {
            if (aVar == null) {
                aVar = oc.a.i("Failed to track URL");
            }
            s1.u(this.f20411a, this.f20412b, this.f20413c.getActionValue(), aVar);
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
        }
    }

    /* JADX INFO: compiled from: BidMachineEventTracker.java */
    class b implements io.bidmachine.core.b.InterfaceC0315b<String, oc.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f20414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ub.j f20415b;

        b(List list, ub.j jVar) {
            this.f20414a = list;
            this.f20415b = jVar;
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(oc.a aVar) {
            if (aVar == null) {
                aVar = oc.a.i("Failed to track URL");
            }
            s1.u(this.f20414a, this.f20415b, TrackEventType.Error.getActionValue(), aVar);
        }

        @Override // io.bidmachine.core.b.InterfaceC0315b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
        }
    }
}

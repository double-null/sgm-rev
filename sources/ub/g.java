package ub;

import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: SessionTrackerImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f26699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<Object, Map<TrackEventType, j>> f26700b = new ConcurrentHashMap();

    public g(b bVar) {
        this.f26699a = bVar;
    }

    @Override // ub.f
    public void b(k kVar, TrackEventType trackEventType, AdsType adsType, oc.a aVar, a aVar2) {
        j jVar;
        Map<TrackEventType, j> map = this.f26700b.get(kVar.getTrackingKey());
        if (map == null || !map.containsKey(trackEventType)) {
            jVar = null;
        } else {
            jVar = map.get(trackEventType);
            if (jVar != null) {
                jVar.d(System.currentTimeMillis());
            }
            map.remove(trackEventType);
            if (map.isEmpty()) {
                e(kVar);
            }
        }
        d(kVar, trackEventType, jVar, adsType, aVar, aVar2);
    }

    @Override // ub.f
    public void c(k kVar, TrackEventType trackEventType) {
        Map<TrackEventType, j> map = this.f26700b.get(kVar.getTrackingKey());
        if (map != null) {
            map.remove(trackEventType);
        }
    }

    @Override // ub.b
    public void d(k kVar, TrackEventType trackEventType, j jVar, AdsType adsType, oc.a aVar, a aVar2) {
        this.f26699a.d(kVar, trackEventType, jVar, adsType, aVar, aVar2);
    }

    @Override // ub.f
    public void e(k kVar) {
        this.f26700b.remove(kVar.getTrackingKey());
    }

    @Override // ub.f
    public void f(k kVar, TrackEventType trackEventType, j jVar) {
        Object trackingKey = kVar.getTrackingKey();
        Map<TrackEventType, j> enumMap = this.f26700b.get(trackingKey);
        if (enumMap == null) {
            enumMap = new EnumMap<>(TrackEventType.class);
            this.f26700b.put(trackingKey, enumMap);
        }
        if (enumMap.containsKey(trackEventType)) {
            return;
        }
        if (jVar == null) {
            jVar = new j();
        }
        enumMap.put(trackEventType, jVar);
    }
}

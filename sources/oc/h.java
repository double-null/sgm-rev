package oc;

import android.location.Location;
import android.text.TextUtils;
import android.util.Base64;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.EventType;
import com.explorestack.protobuf.adcom.LocationType;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.BannerAdSize;
import io.bidmachine.MediaAssetType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.sdk.AdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProtoUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: compiled from: ProtoUtils.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23366a;

        static {
            int[] iArr = new int[Value.KindCase.values().length];
            f23366a = iArr;
            try {
                iArr[Value.KindCase.NUMBER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23366a[Value.KindCase.STRING_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23366a[Value.KindCase.BOOL_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23366a[Value.KindCase.STRUCT_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23366a[Value.KindCase.LIST_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a(Map<TrackEventType, List<String>> map, TrackEventType trackEventType, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<String> arrayList = map.get(trackEventType);
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            map.put(trackEventType, arrayList);
        }
        arrayList.add(str);
    }

    public static AdFormat.Builder b(io.bidmachine.AdFormat adFormat) {
        AdFormat.Builder builderNewBuilder = AdFormat.newBuilder();
        if (adFormat instanceof io.bidmachine.AdFormat.Banner) {
            BannerAdSize bannerAdSize = ((io.bidmachine.AdFormat.Banner) adFormat).getBannerAdSize();
            builderNewBuilder.setBanner(AdFormat.Banner.newBuilder().setWidth(bannerAdSize.getWidth()).setHeight(bannerAdSize.getHeight()).setIsAdaptive(bannerAdSize.isAdaptive()));
        } else {
            boolean z10 = true;
            if (adFormat instanceof io.bidmachine.AdFormat.Interstitial) {
                AdContentType adContentType = ((io.bidmachine.AdFormat.Interstitial) adFormat).getAdContentType();
                boolean z11 = adContentType == AdContentType.All;
                AdFormat.Interstitial.Builder hasBanner = AdFormat.Interstitial.newBuilder().setHasBanner(z11 || adContentType == AdContentType.Static);
                if (!z11 && adContentType != AdContentType.Video) {
                    z10 = false;
                }
                builderNewBuilder.setInterstitial(hasBanner.setHasVideo(z10));
            } else if (adFormat instanceof io.bidmachine.AdFormat.Rewarded) {
                AdContentType adContentType2 = ((io.bidmachine.AdFormat.Rewarded) adFormat).getAdContentType();
                boolean z12 = adContentType2 == AdContentType.All;
                AdFormat.Rewarded.Builder hasBanner2 = AdFormat.Rewarded.newBuilder().setHasBanner(z12 || adContentType2 == AdContentType.Static);
                if (!z12 && adContentType2 != AdContentType.Video) {
                    z10 = false;
                }
                builderNewBuilder.setRewarded(hasBanner2.setHasVideo(z10));
            } else if (adFormat instanceof io.bidmachine.AdFormat.Native) {
                List<MediaAssetType> mediaAssetTypes = ((io.bidmachine.AdFormat.Native) adFormat).getMediaAssetTypes();
                boolean zIsAll = MediaAssetType.isAll(mediaAssetTypes);
                AdFormat.Native.Builder hasIcon = AdFormat.Native.newBuilder().setHasVideo(zIsAll || mediaAssetTypes.contains(MediaAssetType.Video)).setHasIcon(zIsAll || mediaAssetTypes.contains(MediaAssetType.Icon));
                if (!zIsAll && !mediaAssetTypes.contains(MediaAssetType.Image)) {
                    z10 = false;
                }
                builderNewBuilder.setNative(hasIcon.setHasImage(z10));
            }
        }
        return builderNewBuilder;
    }

    public static Context.Geo.Builder c(android.content.Context context, Location location, Location location2, boolean z10) {
        Context.Geo.Builder builderNewBuilder = Context.Geo.newBuilder();
        e(builderNewBuilder, io.bidmachine.core.h.s(context, location, location2), z10);
        return builderNewBuilder;
    }

    public static String d(MessageLite messageLite) {
        if (messageLite == null) {
            return null;
        }
        try {
            return Base64.encodeToString(messageLite.toByteArray(), 2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void e(Context.Geo.Builder builder, Location location, boolean z10) {
        if (z10) {
            builder.setUtcoffset(io.bidmachine.core.h.z());
        }
        if (location != null) {
            builder.setType(h(location));
            builder.setLat((float) location.getLatitude());
            builder.setLon((float) location.getLongitude());
            builder.setAccur((int) location.getAccuracy());
            builder.setLastfix(location.getTime());
        }
    }

    public static void f(Struct.Builder builder, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String key = entry.getKey();
                if (value.getClass() == String.class) {
                    builder.putFields(key, Value.newBuilder().setStringValue((String) value).build());
                } else if (value.getClass() == Boolean.class) {
                    builder.putFields(key, Value.newBuilder().setBoolValue(((Boolean) value).booleanValue()).build());
                } else if (value instanceof Number) {
                    builder.putFields(key, Value.newBuilder().setNumberValue(((Number) value).doubleValue()).build());
                }
            }
        }
    }

    public static AdExtension g(Ad ad2) {
        int extProtoCount = ad2.getExtProtoCount();
        if (extProtoCount <= 0) {
            return null;
        }
        for (int i10 = 0; i10 < extProtoCount; i10++) {
            try {
                Any extProto = ad2.getExtProto(i10);
                if (extProto.is(AdExtension.class)) {
                    return (AdExtension) extProto.unpack(AdExtension.class);
                }
                continue;
            } catch (Throwable th) {
                io.bidmachine.core.a.o(th);
            }
        }
        return null;
    }

    public static LocationType h(Location location) {
        if (location != null) {
            if ("gps".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_GPS;
            }
            if ("network".equals(location.getProvider()) || "passive".equals(location.getProvider())) {
                return LocationType.LOCATION_TYPE_IP;
            }
        }
        return LocationType.LOCATION_TYPE_INVALID;
    }

    public static boolean i(Placement placement, BannerAdSize bannerAdSize) {
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display.getInstl()) {
            return false;
        }
        return bannerAdSize.isSuitable(display.getW(), display.getH());
    }

    public static boolean j(ListValue listValue) {
        return listValue == null || listValue.getValuesCount() <= 0;
    }

    public static boolean k(Struct struct) {
        return struct == null || struct.getFieldsCount() <= 0;
    }

    public static boolean l(Placement placement) {
        if (n(placement)) {
            return false;
        }
        Placement.DisplayPlacement display = placement.getDisplay();
        if (display == Placement.DisplayPlacement.getDefaultInstance() || !display.getInstl()) {
            return o(placement);
        }
        return true;
    }

    public static boolean m(Placement placement) {
        return placement.getDisplay().getNativefmt().getAssetCount() > 0;
    }

    public static boolean n(Placement placement) {
        return placement.getReward();
    }

    public static boolean o(Placement placement) {
        return placement.getVideo() != Placement.VideoPlacement.getDefaultInstance();
    }

    public static Timestamp p(long j10) {
        return Timestamp.newBuilder().setSeconds(j10 / 1000).setNanos(((int) (j10 % 1000)) * 1000000).build();
    }

    public static void q(Map<TrackEventType, List<String>> map, List<Ad.Event> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Ad.Event event : list) {
            TrackEventType trackEventTypeFromNumber = event.getType() == EventType.EVENT_TYPE_IMPRESSION ? TrackEventType.Show : TrackEventType.fromNumber(event.getTypeValue());
            if (trackEventTypeFromNumber != null) {
                a(map, trackEventTypeFromNumber, event.getUrl());
            }
        }
    }

    public static Timestamp r(long j10) {
        return Timestamp.newBuilder().setSeconds(j10).setNanos(0).build();
    }

    public static List<Object> s(ListValue listValue) {
        if (j(listValue)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Value> it = listValue.getValuesList().iterator();
        while (it.hasNext()) {
            Object objU = u(it.next());
            if (objU != null) {
                arrayList.add(objU);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> t(Struct struct) {
        Object objU;
        if (k(struct)) {
            return null;
        }
        HashMap map = new HashMap();
        for (Map.Entry<String, Value> entry : struct.getFieldsMap().entrySet()) {
            String key = entry.getKey();
            Value value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (objU = u(value)) != null) {
                map.put(key, objU);
            }
        }
        return map;
    }

    public static Object u(Value value) {
        if (value == null) {
            return null;
        }
        int i10 = a.f23366a[value.getKindCase().ordinal()];
        if (i10 == 1) {
            return Double.valueOf(value.getNumberValue());
        }
        if (i10 == 2) {
            return value.getStringValue();
        }
        if (i10 == 3) {
            return Boolean.valueOf(value.getBoolValue());
        }
        if (i10 == 4) {
            return t(value.getStructValue());
        }
        if (i10 != 5) {
            return null;
        }
        return s(value.getListValue());
    }
}

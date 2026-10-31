package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ViewUtility;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import wc.m;
import wc.o;

/* JADX INFO: compiled from: ClickCoordinateTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ClickCoordinateTracker {
    private static final String TAG = "ClickCoordinateTracker";
    private final AdPayload advertisement;
    private final Context context;
    private final ClickCoordinate currentClick;
    public static final Companion Companion = new Companion(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    /* JADX INFO: compiled from: ClickCoordinateTracker.kt */
    public static final class ClickCoordinate {
        private Coordinate downCoordinate;
        private Coordinate upCoordinate;

        public ClickCoordinate(Coordinate downCoordinate, Coordinate upCoordinate) {
            t.f(downCoordinate, "downCoordinate");
            t.f(upCoordinate, "upCoordinate");
            this.downCoordinate = downCoordinate;
            this.upCoordinate = upCoordinate;
        }

        public static /* synthetic */ ClickCoordinate copy$default(ClickCoordinate clickCoordinate, Coordinate coordinate, Coordinate coordinate2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                coordinate = clickCoordinate.downCoordinate;
            }
            if ((i10 & 2) != 0) {
                coordinate2 = clickCoordinate.upCoordinate;
            }
            return clickCoordinate.copy(coordinate, coordinate2);
        }

        public final Coordinate component1() {
            return this.downCoordinate;
        }

        public final Coordinate component2() {
            return this.upCoordinate;
        }

        public final ClickCoordinate copy(Coordinate downCoordinate, Coordinate upCoordinate) {
            t.f(downCoordinate, "downCoordinate");
            t.f(upCoordinate, "upCoordinate");
            return new ClickCoordinate(downCoordinate, upCoordinate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickCoordinate)) {
                return false;
            }
            ClickCoordinate clickCoordinate = (ClickCoordinate) obj;
            return t.a(this.downCoordinate, clickCoordinate.downCoordinate) && t.a(this.upCoordinate, clickCoordinate.upCoordinate);
        }

        public final Coordinate getDownCoordinate() {
            return this.downCoordinate;
        }

        public final Coordinate getUpCoordinate() {
            return this.upCoordinate;
        }

        public int hashCode() {
            return (this.downCoordinate.hashCode() * 31) + this.upCoordinate.hashCode();
        }

        public final boolean ready() {
            return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
        }

        public final void setDownCoordinate(Coordinate coordinate) {
            t.f(coordinate, "<set-?>");
            this.downCoordinate = coordinate;
        }

        public final void setUpCoordinate(Coordinate coordinate) {
            t.f(coordinate, "<set-?>");
            this.upCoordinate = coordinate;
        }

        public String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
        }
    }

    /* JADX INFO: compiled from: ClickCoordinateTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ClickCoordinateTracker.kt */
    public static final class Coordinate {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f13036x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final int f13037y;

        public Coordinate(int i10, int i11) {
            this.f13036x = i10;
            this.f13037y = i11;
        }

        public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = coordinate.f13036x;
            }
            if ((i12 & 2) != 0) {
                i11 = coordinate.f13037y;
            }
            return coordinate.copy(i10, i11);
        }

        public final int component1() {
            return this.f13036x;
        }

        public final int component2() {
            return this.f13037y;
        }

        public final Coordinate copy(int i10, int i11) {
            return new Coordinate(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coordinate)) {
                return false;
            }
            Coordinate coordinate = (Coordinate) obj;
            return this.f13036x == coordinate.f13036x && this.f13037y == coordinate.f13037y;
        }

        public final int getX() {
            return this.f13036x;
        }

        public final int getY() {
            return this.f13037y;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f13036x) * 31) + Integer.hashCode(this.f13037y);
        }

        public String toString() {
            return "Coordinate(x=" + this.f13036x + ", y=" + this.f13037y + ')';
        }
    }

    /* JADX INFO: compiled from: ClickCoordinateTracker.kt */
    public static final class DeviceScreenInfo {
        private final Context context;
        private final DisplayMetrics dm;

        public DeviceScreenInfo(Context context) {
            t.f(context, "context");
            this.context = context;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.dm = displayMetrics;
            Object systemService = context.getSystemService("window");
            t.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public static /* synthetic */ DeviceScreenInfo copy$default(DeviceScreenInfo deviceScreenInfo, Context context, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = deviceScreenInfo.context;
            }
            return deviceScreenInfo.copy(context);
        }

        public final Context component1() {
            return this.context;
        }

        public final DeviceScreenInfo copy(Context context) {
            t.f(context, "context");
            return new DeviceScreenInfo(context);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceScreenInfo) && t.a(this.context, ((DeviceScreenInfo) obj).context);
        }

        public final Context getContext() {
            return this.context;
        }

        public final int getDeviceHeight() {
            return this.dm.heightPixels;
        }

        public final int getDeviceWidth() {
            return this.dm.widthPixels;
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        public String toString() {
            return "DeviceScreenInfo(context=" + this.context + ')';
        }
    }

    public ClickCoordinateTracker(Context context, AdPayload advertisement) {
        t.f(context, "context");
        t.f(advertisement, "advertisement");
        this.context = context;
        this.advertisement = advertisement;
        this.currentClick = new ClickCoordinate(new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE), new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    private final int getDeviceHeight() {
        return new DeviceScreenInfo(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new DeviceScreenInfo(this.context).getDeviceWidth();
    }

    private final int getRequestedHeight() {
        int iAdHeight = this.advertisement.adHeight();
        return iAdHeight == 0 ? getDeviceHeight() : ViewUtility.INSTANCE.dpToPixels(this.context, iAdHeight);
    }

    private final int getRequestedWidth() {
        int iAdWidth = this.advertisement.adWidth();
        return iAdWidth == 0 ? getDeviceWidth() : ViewUtility.INSTANCE.dpToPixels(this.context, iAdWidth);
    }

    private final void sendClickCoordinates() {
        List<String> tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, Constants.TPAT_CLICK_COORDINATES, null, null, 6, null);
        if (tpatUrls$default == null || tpatUrls$default.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        wc.k kVarB = m.b(o.SYNCHRONIZED, new ClickCoordinateTracker$sendClickCoordinates$$inlined$inject$1(this.context));
        for (String str : tpatUrls$default) {
            String MACRO_REQ_WIDTH2 = MACRO_REQ_WIDTH;
            t.e(MACRO_REQ_WIDTH2, "MACRO_REQ_WIDTH");
            String strF = new rd.o(MACRO_REQ_WIDTH2).f(str, String.valueOf(requestedWidth));
            String MACRO_REQ_HEIGHT2 = MACRO_REQ_HEIGHT;
            t.e(MACRO_REQ_HEIGHT2, "MACRO_REQ_HEIGHT");
            String strF2 = new rd.o(MACRO_REQ_HEIGHT2).f(strF, String.valueOf(requestedHeight));
            String MACRO_WIDTH2 = MACRO_WIDTH;
            t.e(MACRO_WIDTH2, "MACRO_WIDTH");
            String strF3 = new rd.o(MACRO_WIDTH2).f(strF2, String.valueOf(requestedWidth2));
            String MACRO_HEIGHT2 = MACRO_HEIGHT;
            t.e(MACRO_HEIGHT2, "MACRO_HEIGHT");
            String strF4 = new rd.o(MACRO_HEIGHT2).f(strF3, String.valueOf(requestedHeight2));
            String MACRO_DOWN_X2 = MACRO_DOWN_X;
            t.e(MACRO_DOWN_X2, "MACRO_DOWN_X");
            String strF5 = new rd.o(MACRO_DOWN_X2).f(strF4, String.valueOf(this.currentClick.getDownCoordinate().getX()));
            String MACRO_DOWN_Y2 = MACRO_DOWN_Y;
            t.e(MACRO_DOWN_Y2, "MACRO_DOWN_Y");
            String strF6 = new rd.o(MACRO_DOWN_Y2).f(strF5, String.valueOf(this.currentClick.getDownCoordinate().getY()));
            String MACRO_UP_X2 = MACRO_UP_X;
            t.e(MACRO_UP_X2, "MACRO_UP_X");
            String strF7 = new rd.o(MACRO_UP_X2).f(strF6, String.valueOf(this.currentClick.getUpCoordinate().getX()));
            String MACRO_UP_Y2 = MACRO_UP_Y;
            t.e(MACRO_UP_Y2, "MACRO_UP_Y");
            TpatSender.sendTpat$default(m234sendClickCoordinates$lambda0(kVarB), new TpatRequest.Builder(new rd.o(MACRO_UP_Y2).f(strF7, String.valueOf(this.currentClick.getUpCoordinate().getY()))).tpatKey(Constants.COORDINATE).build(), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final TpatSender m234sendClickCoordinates$lambda0(wc.k<TpatSender> kVar) {
        return kVar.getValue();
    }

    public final ClickCoordinate getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent event) {
        t.f(event, "event");
        if (this.advertisement.isClickCoordinatesTrackingEnabled()) {
            int action = event.getAction();
            if (action == 0) {
                this.currentClick.setDownCoordinate(new Coordinate((int) event.getX(), (int) event.getY()));
            } else {
                if (action != 1) {
                    return;
                }
                this.currentClick.setUpCoordinate(new Coordinate((int) event.getX(), (int) event.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                }
            }
        }
    }

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }
}

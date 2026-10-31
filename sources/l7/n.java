package l7;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class n extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f21837c = {"delivery", "type", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "codec", "id", "bitrate", "minBitrate", "maxBitrate", "scalable", "maintainAspectRatio", "apiFramework"};

    n(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // l7.u
    public String[] k0() {
        return f21837c;
    }

    @Override // l7.u
    public boolean o0() {
        return true;
    }

    public int t0() {
        return K(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
    }

    public String u0() {
        return C("type");
    }

    public int v0() {
        return K(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
    }

    public boolean w0() {
        return (TextUtils.isEmpty(C("type")) || TextUtils.isEmpty(C(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) || TextUtils.isEmpty(C(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) || TextUtils.isEmpty(l0())) ? false : true;
    }
}

package l7;

import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class p extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f21850c = {"creativeType"};

    p(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // l7.u
    public String[] k0() {
        return f21850c;
    }

    @Override // l7.u
    public boolean o0() {
        return true;
    }

    public boolean t0() {
        String strC = C("creativeType");
        if (TextUtils.isEmpty(strC)) {
            return false;
        }
        return strC.matches("image/.*(?i)(gif|jpeg|jpg|bmp|png)");
    }
}

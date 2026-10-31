package l7;

import com.facebook.internal.ServerProtocol;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class b extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f21794c = {ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION};

    b(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    @Override // l7.u
    public String[] k0() {
        return f21794c;
    }

    @Override // l7.u
    public boolean o0() {
        return true;
    }
}

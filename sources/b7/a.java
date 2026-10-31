package b7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeAssetPosition;
import io.bidmachine.LabelData;
import io.bidmachine.PositionData;
import kotlin.jvm.internal.t;
import rd.d;
import wb.e0;

/* JADX INFO: compiled from: LabelDataMapper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f4116a;

    public a(b positionDataMapper) {
        t.f(positionDataMapper, "positionDataMapper");
        this.f4116a = positionDataMapper;
    }

    public final LabelData a(Ad.Display.Native.Asset.LabelAsset data) {
        t.f(data, "data");
        try {
            b bVar = this.f4116a;
            NativeAssetPosition pos = data.getPos();
            t.e(pos, "data.pos");
            PositionData positionDataA = bVar.a(pos);
            if (positionDataA == null) {
                return null;
            }
            String content = data.getContent();
            t.e(content, "data.content");
            byte[] bytes = content.getBytes(d.f24999b);
            t.e(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bArrH = e0.h(bytes, 0, 1, null);
            if (bArrH == null) {
                return null;
            }
            Bitmap image = BitmapFactory.decodeByteArray(bArrH, 0, bArrH.length);
            float w10 = data.getW();
            float h10 = data.getH();
            t.e(image, "image");
            return new LabelData(w10, h10, image, positionDataA);
        } catch (Throwable unused) {
            return null;
        }
    }
}

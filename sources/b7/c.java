package b7;

import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import kotlin.jvm.internal.t;
import pb.a1;
import qb.e;

/* JADX INFO: compiled from: PrivacySheetDataMapper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f4117a;

    public c(a labelDataMapper) {
        t.f(labelDataMapper, "labelDataMapper");
        this.f4117a = labelDataMapper;
    }

    public final PrivacySheetData a(Ad.Display.Native.Asset data) {
        t.f(data, "data");
        try {
            String value = data.getData().getValue();
            t.e(value, "data.data.value");
            a1 a1VarC = e.c(value);
            if (a1VarC == null) {
                return null;
            }
            a aVar = this.f4117a;
            Ad.Display.Native.Asset.LabelAsset label = data.getLabel();
            t.e(label, "data.label");
            LabelData labelDataA = aVar.a(label);
            if (labelDataA == null) {
                return null;
            }
            return new PrivacySheetData(labelDataA, a1VarC);
        } catch (Throwable unused) {
            return null;
        }
    }
}

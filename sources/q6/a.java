package q6;

import io.bidmachine.protobuf.Waterfall;

/* JADX INFO: compiled from: GAMUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static String a(Waterfall.Configuration.AdUnit adUnit) {
        return "adUnitId - " + adUnit.getAdUnitId() + ", price - " + adUnit.getPrice();
    }

    public static String b(Waterfall.Result.AdUnit adUnit) {
        return "adUnitId - " + adUnit.getAdUnitId() + ", price - " + adUnit.getPrice() + ", status - " + adUnit.getStatus();
    }

    public static String c(Waterfall.Result.EstimatedPrice estimatedPrice) {
        if (estimatedPrice == null) {
            return "estimated price - null";
        }
        return "estimated price - " + estimatedPrice.getValue().getValue() + " " + estimatedPrice.getCurrency().getValue() + ", precision - " + estimatedPrice.getPrecision().getValue();
    }
}

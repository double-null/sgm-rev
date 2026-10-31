package pb;

import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class e1 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d1.values().length];
            try {
                iArr[d1.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d1.ToFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d1.AspectFill.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d1.AspectFit.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImageView.ScaleType a(d1 d1Var) {
        int i10 = d1Var == null ? -1 : a.$EnumSwitchMapping$0[d1Var.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i10 == 4) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        throw new NoWhenBranchMatchedException();
    }
}

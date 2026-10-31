package sb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import id.l;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import od.k;
import pb.l1;
import rd.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f25392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f25393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l1.b f25395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f25396e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l1.b.values().length];
            try {
                iArr[l1.b.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.b.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l1.b.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l1.b.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l1.b.BOTTOM_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l1.b.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: sb.b$b, reason: collision with other inner class name */
    static final class C0416b extends u implements l {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0416b f25397d = new C0416b();

        C0416b() {
            super(1);
        }

        public final String b(int i10) {
            return "";
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        t.f(context, "context");
        Paint paint = new Paint();
        paint.setColor(-16777216);
        this.f25393b = paint;
        this.f25394c = -16777216;
        this.f25395d = l1.b.TOP_LEFT;
        this.f25396e = C0416b.f25397d;
        setClickable(false);
        setFocusable(false);
    }

    private final int a(char c10, int i10, int i11, int i12) {
        if (c10 < 0 || c10 >= 256) {
            return -16777216;
        }
        return Color.rgb(i10 + (c10 % 9), i11 + ((c10 / 9) % 9), i12 + ((c10 / 81) % 9));
    }

    private final Bitmap b() {
        Bitmap bitmap = this.f25392a;
        if (bitmap != null) {
            return bitmap;
        }
        int measuredWidth = getMeasuredWidth() - 8;
        if (measuredWidth < 0) {
            this.f25392a = null;
            return null;
        }
        String string = (String) this.f25396e.invoke(Integer.valueOf(measuredWidth));
        if (string.length() > measuredWidth) {
            string = h0.h1(h0.j1(h0.h1(string).toString(), measuredWidth)).toString();
        }
        String str = "bmc:" + string + ":cmb";
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(str.length(), 1, Bitmap.Config.ARGB_8888);
        t.e(bitmapCreateBitmap, "createBitmap(watermark.l… Bitmap.Config.ARGB_8888)");
        int iRed = Color.red(this.f25394c);
        int iGreen = Color.green(this.f25394c);
        int iBlue = Color.blue(this.f25394c);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            bitmapCreateBitmap.setPixel(i10, 0, a(str.charAt(i10), iRed, iGreen, iBlue));
        }
        this.f25392a = bitmapCreateBitmap;
        return bitmapCreateBitmap;
    }

    public final void c() {
        this.f25392a = null;
    }

    public final void d() {
        c();
        invalidate();
    }

    public final int getBaseColor() {
        return this.f25394c;
    }

    public final l1.b getLocation() {
        return this.f25395d;
    }

    public final l<Integer, String> getPayloadProvider() {
        return this.f25396e;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        t.f(canvas, "canvas");
        super.onDraw(canvas);
        Bitmap bitmapB = b();
        if (bitmapB == null) {
            return;
        }
        canvas.save();
        int i10 = a.$EnumSwitchMapping$0[this.f25395d.ordinal()];
        if (i10 == 2) {
            canvas.translate((canvas.getWidth() - bitmapB.getWidth()) / 2, 0.0f);
        } else if (i10 == 3) {
            canvas.translate(canvas.getWidth() - bitmapB.getWidth(), 0.0f);
        } else if (i10 == 4) {
            canvas.translate(0.0f, getMeasuredHeight() - 1);
        } else if (i10 == 5) {
            canvas.translate((canvas.getWidth() - bitmapB.getWidth()) / 2, getMeasuredHeight() - 1);
        } else if (i10 == 6) {
            canvas.translate(canvas.getWidth() - bitmapB.getWidth(), getMeasuredHeight() - 1);
        }
        canvas.drawBitmap(bitmapB, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            d();
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        t.f(changedView, "changedView");
        if (i10 != 0) {
            c();
        }
    }

    public final void setBaseColor(int i10) {
        int iRgb = Color.rgb(k.j(Color.red(i10), 0, 245), k.j(Color.green(i10), 0, 245), k.j(Color.blue(i10), 0, 245));
        if (this.f25394c != iRgb) {
            d();
        }
        this.f25393b.setColor(iRgb);
        this.f25394c = iRgb;
    }

    public final void setLocation(l1.b value) {
        t.f(value, "value");
        this.f25395d = value;
        invalidate();
    }

    public final void setPayloadProvider(l<? super Integer, String> value) {
        t.f(value, "value");
        if (!t.a(this.f25396e, value)) {
            d();
        }
        this.f25396e = value;
    }
}

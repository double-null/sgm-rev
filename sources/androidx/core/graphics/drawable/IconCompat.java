package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f1837k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f1839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f1845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1847j;

    /* JADX INFO: loaded from: classes2.dex */
    static class a {
        static IconCompat a(Object obj) {
            w.h.c(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.i(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.f(e(obj));
            }
            if (iD == 6) {
                return IconCompat.c(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f1839b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f1838a) {
                case -1:
                    return (Icon) iconCompat.f1839b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1839b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.l(), iconCompat.f1842e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f1839b, iconCompat.f1842e, iconCompat.f1843f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f1839b);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.b((Bitmap) iconCompat.f1839b, false)) : b.b((Bitmap) iconCompat.f1839b);
                    break;
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.n());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.n());
                        }
                        InputStream inputStreamO = iconCompat.o(context);
                        if (inputStreamO == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.n());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(inputStreamO), false));
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamO));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f1844g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1845h;
            if (mode != IconCompat.f1837k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }

        static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod(oqHAiWkeGzWld.LcmBsAOnqNxSx, new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1838a = -1;
        this.f1840c = null;
        this.f1841d = null;
        this.f1842e = 0;
        this.f1843f = 0;
        this.f1844g = null;
        this.f1845h = f1837k;
        this.f1846i = null;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat c(Uri uri) {
        w.d.c(uri);
        return d(uri.toString());
    }

    public static IconCompat d(String str) {
        w.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1839b = str;
        return iconCompat;
    }

    public static IconCompat e(Bitmap bitmap) {
        w.d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1839b = bitmap;
        return iconCompat;
    }

    public static IconCompat f(Uri uri) {
        w.d.c(uri);
        return g(uri.toString());
    }

    public static IconCompat g(String str) {
        w.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1839b = str;
        return iconCompat;
    }

    public static IconCompat h(Context context, int i10) {
        w.d.c(context);
        return i(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat i(Resources resources, String str, int i10) {
        w.d.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1842e = i10;
        if (resources != null) {
            try {
                iconCompat.f1839b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1839b = str;
        }
        iconCompat.f1847j = str;
        return iconCompat;
    }

    private static String u(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap j() {
        int i10 = this.f1838a;
        if (i10 == -1) {
            Object obj = this.f1839b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f1839b;
        }
        if (i10 == 5) {
            return b((Bitmap) this.f1839b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int k() {
        int i10 = this.f1838a;
        if (i10 == -1) {
            return a.b(this.f1839b);
        }
        if (i10 == 2) {
            return this.f1842e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String l() {
        int i10 = this.f1838a;
        if (i10 == -1) {
            return a.c(this.f1839b);
        }
        if (i10 == 2) {
            String str = this.f1847j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1839b).split(":", -1)[0] : this.f1847j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int m() {
        int i10 = this.f1838a;
        return i10 == -1 ? a.d(this.f1839b) : i10;
    }

    public Uri n() {
        int i10 = this.f1838a;
        if (i10 == -1) {
            return a.e(this.f1839b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1839b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream o(Context context) {
        Uri uriN = n();
        String scheme = uriN.getScheme();
        if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme) || ShareInternalUtility.STAGING_PARAM.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriN);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriN, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f1839b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriN, e11);
            return null;
        }
    }

    public void p() {
        this.f1845h = PorterDuff.Mode.valueOf(this.f1846i);
        switch (this.f1838a) {
            case -1:
                Parcelable parcelable = this.f1841d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f1839b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f1841d;
                if (parcelable2 != null) {
                    this.f1839b = parcelable2;
                    return;
                }
                byte[] bArr = this.f1840c;
                this.f1839b = bArr;
                this.f1838a = 3;
                this.f1842e = 0;
                this.f1843f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1840c, Charset.forName("UTF-16"));
                this.f1839b = str;
                if (this.f1838a == 2 && this.f1847j == null) {
                    this.f1847j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1839b = this.f1840c;
                return;
        }
    }

    public void q(boolean z10) {
        this.f1846i = this.f1845h.name();
        switch (this.f1838a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f1841d = (Parcelable) this.f1839b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f1841d = (Parcelable) this.f1839b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f1839b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f1840c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f1840c = ((String) this.f1839b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1840c = (byte[]) this.f1839b;
                return;
            case 4:
            case 6:
                this.f1840c = this.f1839b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle r() {
        Bundle bundle = new Bundle();
        switch (this.f1838a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f1839b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f1839b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f1839b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f1839b);
                break;
        }
        bundle.putInt("type", this.f1838a);
        bundle.putInt("int1", this.f1842e);
        bundle.putInt("int2", this.f1843f);
        bundle.putString("string1", this.f1847j);
        ColorStateList colorStateList = this.f1844g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f1845h;
        if (mode != f1837k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon s() {
        return t(null);
    }

    public Icon t(Context context) {
        return a.g(this, context);
    }

    public String toString() {
        if (this.f1838a == -1) {
            return String.valueOf(this.f1839b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(u(this.f1838a));
        switch (this.f1838a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1839b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1839b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1847j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(k())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1842e);
                if (this.f1843f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1843f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1839b);
                break;
        }
        if (this.f1844g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1844g);
        }
        if (this.f1845h != f1837k) {
            sb2.append(" mode=");
            sb2.append(this.f1845h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    IconCompat(int i10) {
        this.f1840c = null;
        this.f1841d = null;
        this.f1842e = 0;
        this.f1843f = 0;
        this.f1844g = null;
        this.f1845h = f1837k;
        this.f1846i = null;
        this.f1838a = i10;
    }
}

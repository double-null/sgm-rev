package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.r;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.v;
import androidx.core.view.z0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f617b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f618c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f619d = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Constructor<? extends View>> f620e = new androidx.collection.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f621a = new Object[2];

    private static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f625d;

        public a(View view, String str) {
            this.f622a = view;
            this.f623b = str;
        }

        private void a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f623b, View.class)) != null) {
                        this.f624c = method;
                        this.f625d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id2 = this.f622a.getId();
            if (id2 == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f622a.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f623b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f622a.getClass() + str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f624c == null) {
                a(this.f622a.getContext(), this.f623b);
            }
            try {
                this.f624c.invoke(this.f625d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && z0.u(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f618c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        Map<String, Constructor<? extends View>> map = f620e;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f617b);
            map.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f621a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(ViewHierarchyConstants.VIEW_KEY)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f621a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i10 = 0;
            while (true) {
                String[] strArr = f619d;
                if (i10 >= strArr.length) {
                    return null;
                }
                View viewR = r(context, str, strArr[i10]);
                if (viewR != null) {
                    return viewR;
                }
                i10++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f621a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z10, boolean z11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15230x3, 0, 0);
        int resourceId = z10 ? typedArrayObtainStyledAttributes.getResourceId(g.j.f15235y3, 0) : 0;
        if (z11 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(g.j.f15240z3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof k.d) && ((k.d) context).b() == resourceId) ? context : new k.d(context, resourceId);
        }
        return context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected androidx.appcompat.widget.k f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.k(context, attributeSet);
    }

    protected m g(Context context, AttributeSet attributeSet) {
        return new m(context, attributeSet);
    }

    protected AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected o i(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    protected r j(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    protected s k(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    protected t l(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected v m(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected f0 n(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    protected j0 o(Context context, AttributeSet attributeSet) {
        return new j0(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View viewK;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            context2 = t(context2, attributeSet, z11, z12);
        }
        if (z13) {
            context2 = e1.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewK = k(context2, attributeSet);
                u(viewK, str);
                break;
            case "CheckedTextView":
                viewK = e(context2, attributeSet);
                u(viewK, str);
                break;
            case "MultiAutoCompleteTextView":
                viewK = i(context2, attributeSet);
                u(viewK, str);
                break;
            case "TextView":
                viewK = n(context2, attributeSet);
                u(viewK, str);
                break;
            case "ImageButton":
                viewK = g(context2, attributeSet);
                u(viewK, str);
                break;
            case "SeekBar":
                viewK = l(context2, attributeSet);
                u(viewK, str);
                break;
            case "Spinner":
                viewK = m(context2, attributeSet);
                u(viewK, str);
                break;
            case "RadioButton":
                viewK = j(context2, attributeSet);
                u(viewK, str);
                break;
            case "ToggleButton":
                viewK = o(context2, attributeSet);
                u(viewK, str);
                break;
            case "ImageView":
                viewK = h(context2, attributeSet);
                u(viewK, str);
                break;
            case "AutoCompleteTextView":
                viewK = b(context2, attributeSet);
                u(viewK, str);
                break;
            case "CheckBox":
                viewK = d(context2, attributeSet);
                u(viewK, str);
                break;
            case "EditText":
                viewK = f(context2, attributeSet);
                u(viewK, str);
                break;
            case "Button":
                viewK = c(context2, attributeSet);
                u(viewK, str);
                break;
            default:
                viewK = p(context2, str, attributeSet);
                break;
        }
        if (viewK == null && context != context2) {
            viewK = s(context2, str, attributeSet);
        }
        if (viewK != null) {
            a(viewK, attributeSet);
        }
        return viewK;
    }
}

package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vungle.ads.internal.network.converters.vY.vgmm;

/* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
class l implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f2649a;

    l(n nVar) {
        this.f2649a = nVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        t tVarV;
        if (h.class.getName().equals(str)) {
            return new h(context, attributeSet, this.f2649a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.c.f20530d);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(j0.c.f20531e);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(j0.c.f20532f, -1);
        String string = typedArrayObtainStyledAttributes.getString(j0.c.f20533g);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentG0 = resourceId != -1 ? this.f2649a.g0(resourceId) : null;
        if (fragmentG0 == null && string != null) {
            fragmentG0 = this.f2649a.h0(string);
        }
        if (fragmentG0 == null && id2 != -1) {
            fragmentG0 = this.f2649a.g0(id2);
        }
        if (fragmentG0 == null) {
            fragmentG0 = this.f2649a.p0().a(context.getClassLoader(), attributeValue);
            fragmentG0.mFromLayout = true;
            fragmentG0.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragmentG0.mContainerId = id2;
            fragmentG0.mTag = string;
            fragmentG0.mInLayout = true;
            n nVar = this.f2649a;
            fragmentG0.mFragmentManager = nVar;
            fragmentG0.mHost = nVar.s0();
            fragmentG0.onInflate(this.f2649a.s0().f(), attributeSet, fragmentG0.mSavedFragmentState);
            tVarV = this.f2649a.v(fragmentG0);
            this.f2649a.g(fragmentG0);
            if (n.D0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentG0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentG0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + vgmm.xrRnUNejIicbml + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentG0.mInLayout = true;
            n nVar2 = this.f2649a;
            fragmentG0.mFragmentManager = nVar2;
            fragmentG0.mHost = nVar2.s0();
            fragmentG0.onInflate(this.f2649a.s0().f(), attributeSet, fragmentG0.mSavedFragmentState);
            tVarV = this.f2649a.v(fragmentG0);
            if (n.D0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentG0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        fragmentG0.mContainer = (ViewGroup) view;
        tVarV.m();
        tVarV.j();
        View view2 = fragmentG0.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragmentG0.mView.getTag() == null) {
                fragmentG0.mView.setTag(string);
            }
            return fragmentG0.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}

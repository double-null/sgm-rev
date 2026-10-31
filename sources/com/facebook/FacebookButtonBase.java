package com.facebook;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.common.R;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: FacebookButtonBase.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FacebookButtonBase extends Button {
    private final String analyticsButtonCreatedEventName;
    private final String analyticsButtonTappedEventName;
    private final int defaultStyleResource;
    private View.OnClickListener externalOnClickListener;
    private View.OnClickListener internalOnClickListener;
    private boolean overrideCompoundPadding;
    private int overrideCompoundPaddingLeft;
    private int overrideCompoundPaddingRight;
    private FragmentWrapper parentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected FacebookButtonBase(Context context, AttributeSet attributeSet, int i10, int i11, String analyticsButtonCreatedEventName, String analyticsButtonTappedEventName) {
        super(context, attributeSet, 0);
        kotlin.jvm.internal.t.f(context, "context");
        kotlin.jvm.internal.t.f(analyticsButtonCreatedEventName, "analyticsButtonCreatedEventName");
        kotlin.jvm.internal.t.f(analyticsButtonTappedEventName, "analyticsButtonTappedEventName");
        i11 = i11 == 0 ? getDefaultStyleResource() : i11;
        configureButton(context, attributeSet, i10, i11 == 0 ? R.style.com_facebook_button : i11);
        this.analyticsButtonCreatedEventName = analyticsButtonCreatedEventName;
        this.analyticsButtonTappedEventName = analyticsButtonTappedEventName;
        setClickable(true);
        setFocusable(true);
    }

    private final void parseBackgroundAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.background}, i10, i11);
            kotlin.jvm.internal.t.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(androidx.core.content.a.d(context, R.color.com_facebook_blue));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void parseCompoundDrawableAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom, android.R.attr.drawablePadding}, i10, i11);
            kotlin.jvm.internal.t.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }

    private final void parseContentAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom}, i10, i11);
            kotlin.jvm.internal.t.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void parseTextAttributes(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textColor}, i10, i11);
            kotlin.jvm.internal.t.e(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.gravity}, i10, i11);
                kotlin.jvm.internal.t.e(typedArrayObtainStyledAttributes2, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                try {
                    int i12 = typedArrayObtainStyledAttributes2.getInt(0, 17);
                    typedArrayObtainStyledAttributes2.recycle();
                    setGravity(i12);
                    TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textSize, android.R.attr.textStyle, android.R.attr.text}, i10, i11);
                    kotlin.jvm.internal.t.e(typedArrayObtainStyledAttributes3, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes3.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes3.getString(2);
                        typedArrayObtainStyledAttributes3.recycle();
                        setText(string);
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes3.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } catch (Throwable th4) {
            CrashShieldHandler.handleThrowable(th4, this);
        }
    }

    private final void setupOnClickListener() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FacebookButtonBase.setupOnClickListener$lambda$0(this.f11083a, view);
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected void callExternalOnClickListener(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.externalOnClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected void configureButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(context, "context");
            parseBackgroundAttributes(context, attributeSet, i10, i11);
            parseCompoundDrawableAttributes(context, attributeSet, i10, i11);
            parseContentAttributes(context, attributeSet, i10, i11);
            parseTextAttributes(context, attributeSet, i10, i11);
            setupOnClickListener();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected Activity getActivity() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    protected final String getAnalyticsButtonCreatedEventName() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.analyticsButtonCreatedEventName;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    protected final String getAnalyticsButtonTappedEventName() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.analyticsButtonTappedEventName;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final androidx.activity.result.c getAndroidxActivityResultRegistryOwner() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof androidx.activity.result.c) {
                return (androidx.activity.result.c) activity;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.overrideCompoundPadding ? this.overrideCompoundPaddingLeft : super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.overrideCompoundPadding ? this.overrideCompoundPaddingRight : super.getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    protected abstract int getDefaultRequestCode();

    protected int getDefaultStyleResource() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.defaultStyleResource;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    public final Fragment getFragment() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            FragmentWrapper fragmentWrapper = this.parentFragment;
            if (fragmentWrapper != null) {
                return fragmentWrapper.getSupportFragment();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final android.app.Fragment getNativeFragment() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            FragmentWrapper fragmentWrapper = this.parentFragment;
            if (fragmentWrapper != null) {
                return fragmentWrapper.getNativeFragment();
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    protected void logButtonCreated(Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            InternalAppEventsLogger.Companion.createInstance(context, null).logEventImplicitly(this.analyticsButtonCreatedEventName);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected void logButtonTapped(Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            InternalAppEventsLogger.Companion.createInstance(context, null).logEventImplicitly(this.analyticsButtonTappedEventName);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected int measureTextWidth(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (isInEditMode()) {
                return;
            }
            logButtonCreated(getContext());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - measureTextWidth(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.overrideCompoundPaddingLeft = compoundPaddingLeft - iMin;
                this.overrideCompoundPaddingRight = compoundPaddingRight + iMin;
                this.overrideCompoundPadding = true;
            }
            super.onDraw(canvas);
            this.overrideCompoundPadding = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setFragment(android.app.Fragment fragment) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(fragment, "fragment");
            this.parentFragment = new FragmentWrapper(fragment);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    protected void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.internalOnClickListener = onClickListener;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.externalOnClickListener = onClickListener;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOnClickListener$lambda$0(FacebookButtonBase facebookButtonBase, View view) {
        if (CrashShieldHandler.isObjectCrashing(FacebookButtonBase.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(facebookButtonBase, oqHAiWkeGzWld.DzMUCcysX);
            facebookButtonBase.logButtonTapped(facebookButtonBase.getContext());
            View.OnClickListener onClickListener = facebookButtonBase.internalOnClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            View.OnClickListener onClickListener2 = facebookButtonBase.externalOnClickListener;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookButtonBase.class);
        }
    }

    public final void setFragment(Fragment fragment) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.t.f(fragment, "fragment");
            this.parentFragment = new FragmentWrapper(fragment);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}

package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.f3;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f9490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f9491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f9492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Button f9493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f9494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f9495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f9496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FrameLayout f9497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewGroup f9498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewGroup f9499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f9500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.applovin.impl.mediation.ads.b f9501m;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f9502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f9503b;

        a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f9502a = weakReference;
            this.f9503b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f9502a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                l.E0.Q();
                if (p.a()) {
                    l.E0.Q().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f9502a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f9503b.getLayoutParams();
            layoutParams.height = ((View) this.f9503b.getParent()).getWidth();
            this.f9503b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public com.applovin.impl.mediation.ads.b getAdViewTracker() {
        return this.f9501m;
    }

    public TextView getAdvertiserTextView() {
        return this.f9491c;
    }

    public TextView getBodyTextView() {
        return this.f9492d;
    }

    public Button getCallToActionButton() {
        return this.f9493e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f9490b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f9491c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f9492d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f9493e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f9494f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f9495g;
    }

    public ImageView getIconImageView() {
        return this.f9494f;
    }

    public View getMainView() {
        return this.f9489a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f9500l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f9499k;
        return viewGroup != null ? viewGroup : this.f9500l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f9497i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f9496h;
        return viewGroup != null ? viewGroup : this.f9497i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f9498j;
    }

    public TextView getTitleTextView() {
        return this.f9490b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.applovin.impl.mediation.ads.b bVar = this.f9501m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        p.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        com.applovin.impl.mediation.ads.b bVar = this.f9501m;
        if (bVar != null) {
            bVar.a();
            this.f9501m = null;
        }
        View view = this.f9489a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f9489a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f9489a);
    }

    public void render(f3 f3Var, com.applovin.impl.mediation.ads.a.InterfaceC0112a interfaceC0112a, l lVar) {
        recycle();
        if (!f3Var.y0().get() || !f3Var.x0().get()) {
            this.f9501m = new com.applovin.impl.mediation.ads.b(f3Var, this, interfaceC0112a, lVar);
        }
        final MaxNativeAd nativeAd = f3Var.getNativeAd();
        if (f3Var.z0() && nativeAd.isContainerClickable()) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        lVar.Q();
        if (p.a()) {
            lVar.Q().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
                return R.layout.max_native_ad_media_banner_view;
            }
            return "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid template: " + str);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f9490b.setText(maxNativeAd.getTitle());
        } else {
            this.f9490b.setVisibility(8);
        }
        if (this.f9491c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f9491c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f9491c.setVisibility(8);
            }
        }
        if (this.f9492d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f9492d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f9492d.setVisibility(8);
            } else {
                this.f9492d.setVisibility(4);
            }
        }
        if (this.f9493e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f9493e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f9493e.setVisibility(8);
            } else {
                this.f9493e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f9495g;
        if (frameLayout != null) {
            if (icon == null || this.f9494f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f9495g.removeAllViews();
                    this.f9495g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f9494f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f9495g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f9494f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f9497i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f9497i.addView(optionsView);
            this.f9497i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f9500l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9500l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f9500l.setVisibility(8);
            }
        }
        if (this.f9498j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f9498j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9498j.addView(appLovinStarRatingView);
            } else {
                this.f9498j.setVisibility(8);
            }
        }
        b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f9549a.a();
            }
        }, 2000L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i10 = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i10).setOptionsContentFrameLayoutId(i10).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i11 = R.id.applovin_native_media_content_view;
        this(maxNativeAd, starRatingContentViewGroupId.setMediaContentViewGroupId(i11).setMediaContentFrameLayoutId(i11).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f9489a = view;
        } else {
            if (z10) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f9489a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f9489a);
        this.f9490b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f9491c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f9492d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f9493e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f9494f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f9495g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f9496h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f9497i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f9498j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f9499k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f9500l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f9490b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f9492d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f9491c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f9493e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f9494f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f9494f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f9494f, icon.getUri());
                } else {
                    this.f9494f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f9499k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9499k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f9496h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9496h.addView(optionsView);
                this.f9496h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f9498j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9498j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}

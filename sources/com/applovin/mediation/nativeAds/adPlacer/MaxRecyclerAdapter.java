package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.g5;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.h<RecyclerView.f0> implements MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f9531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RecyclerView.h f9532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f9533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f9534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g5 f9535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f9536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f9537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f9538h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f9540a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f9540a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f9540a;
        }
    }

    class a implements g5.a {
        a() {
        }

        @Override // com.applovin.impl.g5.a
        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.f9531a.updateFillablePositions(i10, Math.min(i11 + MaxRecyclerAdapter.this.f9537g, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    private class b extends RecyclerView.j {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f9531a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f9531a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f9532b.getItemCount();
            if (MaxRecyclerAdapter.this.f9538h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f9538h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f9531a.getAdjustedPosition(i10);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f9531a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f9532b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f9538h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f9538h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f9531a.getAdjustedPosition(i10);
            int adjustedCount = MaxRecyclerAdapter.this.f9531a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f9531a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f9531a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f9531a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i11), size);
        }

        /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.h hVar, Activity activity) {
        b bVar = new b(this, null);
        this.f9533c = bVar;
        this.f9537g = 8;
        this.f9538h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f9531a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(hVar.hasStableIds());
        this.f9532b = hVar;
        hVar.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f9532b.unregisterAdapterDataObserver(this.f9533c);
        } catch (Exception unused) {
        }
        this.f9531a.destroy();
        g5 g5Var = this.f9535e;
        if (g5Var != null) {
            g5Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f9531a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f9531a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f9531a.getAdjustedCount(this.f9532b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        if (this.f9532b.hasStableIds()) {
            return this.f9531a.isFilledPosition(i10) ? this.f9531a.getAdItemId(i10) : this.f9532b.getItemId(this.f9531a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.f9531a.isAdPosition(i10)) {
            return -42;
        }
        return this.f9532b.getItemViewType(this.f9531a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f9531a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f9531a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9536f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f9536f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f9536f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9536f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f9534d = recyclerView;
        g5 g5Var = new g5(recyclerView);
        this.f9535e = g5Var;
        g5Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.f0 f0Var, int i10) {
        this.f9535e.a(f0Var.itemView, i10);
        if (!this.f9531a.isAdPosition(i10)) {
            this.f9532b.onBindViewHolder(f0Var, this.f9531a.getOriginalPosition(i10));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f9531a.getAdSize(i10);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) f0Var).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f9531a.renderAd(i10, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 != -42) {
            return this.f9532b.onCreateViewHolder(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.p layoutManager = this.f9534d.getLayoutManager();
        if (layoutManager == null || !layoutManager.k()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f9534d = null;
        g5 g5Var = this.f9535e;
        if (g5Var != null) {
            g5Var.a();
            this.f9535e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(RecyclerView.f0 f0Var) {
        return f0Var instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(f0Var) : this.f9532b.onFailedToRecycleView(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.f0 f0Var) {
        if (f0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(f0Var);
        } else {
            this.f9532b.onViewAttachedToWindow(f0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.f0 f0Var) {
        if (f0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(f0Var);
        } else {
            this.f9532b.onViewDetachedFromWindow(f0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.f0 f0Var) {
        g5 g5Var = this.f9535e;
        if (g5Var != null) {
            g5Var.b(f0Var.itemView);
        }
        if (!(f0Var instanceof MaxAdRecyclerViewHolder)) {
            this.f9532b.onViewRecycled(f0Var);
            return;
        }
        if (this.f9531a.isFilledPosition(f0Var.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) f0Var).getContainerView().removeAllViews();
        }
        super.onViewRecycled(f0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f9538h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f9532b.unregisterAdapterDataObserver(this.f9533c);
        this.f9532b.setHasStableIds(z10);
        this.f9532b.registerAdapterDataObserver(this.f9533c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f9536f = listener;
    }

    public void setLookAhead(int i10) {
        this.f9537g = i10;
    }
}

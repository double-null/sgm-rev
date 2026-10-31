package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7179b;

    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f7180a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f7180a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f7179b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f7178a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f7178a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f7180a;
        this.f7178a = list;
        this.f7179b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f7179b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}

package com.facebook.appevents.gps.topics;

/* JADX INFO: compiled from: TopicData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TopicData {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public TopicData(long j10, long j11, int i10) {
        this.taxonomyVersion = j10;
        this.modelVersion = j11;
        this.topicId = i10;
    }

    public static /* synthetic */ TopicData copy$default(TopicData topicData, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = topicData.taxonomyVersion;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = topicData.modelVersion;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = topicData.topicId;
        }
        return topicData.copy(j12, j13, i10);
    }

    public final long component1() {
        return this.taxonomyVersion;
    }

    public final long component2() {
        return this.modelVersion;
    }

    public final int component3() {
        return this.topicId;
    }

    public final TopicData copy(long j10, long j11, int i10) {
        return new TopicData(j10, j11, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicData)) {
            return false;
        }
        TopicData topicData = (TopicData) obj;
        return this.taxonomyVersion == topicData.taxonomyVersion && this.modelVersion == topicData.modelVersion && this.topicId == topicData.topicId;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.taxonomyVersion) * 31) + Long.hashCode(this.modelVersion)) * 31) + Integer.hashCode(this.topicId);
    }

    public String toString() {
        return "TopicData(taxonomyVersion=" + this.taxonomyVersion + ", modelVersion=" + this.modelVersion + ", topicId=" + this.topicId + ')';
    }
}

package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface LifecycleMetricOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

    LifecycleMetric.LifecycleState getRequiredStates(int i10);

    int getRequiredStatesCount();

    List<LifecycleMetric.LifecycleState> getRequiredStatesList();

    int getRequiredStatesValue(int i10);

    List<Integer> getRequiredStatesValueList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}

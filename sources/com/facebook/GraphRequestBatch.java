package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: GraphRequestBatch.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GraphRequestBatch extends AbstractList<GraphRequest> {
    public static final Companion Companion = new Companion(null);
    private static final AtomicInteger idGenerator = new AtomicInteger();
    private String batchApplicationId;
    private Handler callbackHandler;
    private List<Callback> callbacks;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f10940id;
    private List<GraphRequest> requests;
    private int timeoutInMilliseconds;

    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    public interface Callback {
        void onBatchCompleted(GraphRequestBatch graphRequestBatch);
    }

    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: GraphRequestBatch.kt */
    public interface OnProgressCallback extends Callback {
        void onBatchProgress(GraphRequestBatch graphRequestBatch, long j10, long j11);
    }

    public GraphRequestBatch() {
        this.f10940id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList();
    }

    private final List<GraphResponse> executeAndWaitImpl() {
        return GraphRequest.Companion.executeBatchAndWait(this);
    }

    private final GraphRequestAsyncTask executeAsyncImpl() {
        return GraphRequest.Companion.executeBatchAsync(this);
    }

    public final void addCallback(Callback callback) {
        kotlin.jvm.internal.t.f(callback, "callback");
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.requests.clear();
    }

    public /* bridge */ boolean contains(GraphRequest graphRequest) {
        return super.contains((Object) graphRequest);
    }

    public final List<GraphResponse> executeAndWait() {
        return executeAndWaitImpl();
    }

    public final GraphRequestAsyncTask executeAsync() {
        return executeAsyncImpl();
    }

    public final String getBatchApplicationId() {
        return this.batchApplicationId;
    }

    public final Handler getCallbackHandler() {
        return this.callbackHandler;
    }

    public final List<Callback> getCallbacks() {
        return this.callbacks;
    }

    public final String getId() {
        return this.f10940id;
    }

    public final List<GraphRequest> getRequests() {
        return this.requests;
    }

    public int getSize() {
        return this.requests.size();
    }

    public final int getTimeout() {
        return this.timeoutInMilliseconds;
    }

    public /* bridge */ int indexOf(GraphRequest graphRequest) {
        return super.indexOf((Object) graphRequest);
    }

    public /* bridge */ int lastIndexOf(GraphRequest graphRequest) {
        return super.lastIndexOf((Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ GraphRequest remove(int i10) {
        return removeAt(i10);
    }

    public GraphRequest removeAt(int i10) {
        return this.requests.remove(i10);
    }

    public final void removeCallback(Callback callback) {
        kotlin.jvm.internal.t.f(callback, "callback");
        this.callbacks.remove(callback);
    }

    public final void setBatchApplicationId(String str) {
        this.batchApplicationId = str;
    }

    public final void setCallbackHandler(Handler handler) {
        this.callbackHandler = handler;
    }

    public final void setTimeout(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.".toString());
        }
        this.timeoutInMilliseconds = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return contains((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public GraphRequest get(int i10) {
        return this.requests.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return indexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return lastIndexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public GraphRequest set(int i10, GraphRequest element) {
        kotlin.jvm.internal.t.f(element, "element");
        return this.requests.set(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(GraphRequest element) {
        kotlin.jvm.internal.t.f(element, "element");
        return this.requests.add(element);
    }

    public /* bridge */ boolean remove(GraphRequest graphRequest) {
        return super.remove((Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, GraphRequest element) {
        kotlin.jvm.internal.t.f(element, "element");
        this.requests.add(i10, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof GraphRequest) {
            return remove((GraphRequest) obj);
        }
        return false;
    }

    public GraphRequestBatch(Collection<GraphRequest> requests) {
        kotlin.jvm.internal.t.f(requests, "requests");
        this.f10940id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(requests);
    }

    public GraphRequestBatch(GraphRequest... requests) {
        kotlin.jvm.internal.t.f(requests, "requests");
        this.f10940id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(kotlin.collections.m.c(requests));
    }

    public GraphRequestBatch(GraphRequestBatch requests) {
        kotlin.jvm.internal.t.f(requests, "requests");
        this.f10940id = String.valueOf(Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(requests);
        this.callbackHandler = requests.callbackHandler;
        this.timeoutInMilliseconds = requests.timeoutInMilliseconds;
        this.callbacks = new ArrayList(requests.callbacks);
    }
}

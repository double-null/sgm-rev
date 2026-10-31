package k6;

import com.explorestack.protobuf.InvalidProtocolBufferException;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingTaskPermission;
import java.net.URLConnection;
import java.util.List;

/* JADX INFO: compiled from: AdaptiveRenderingNetworkRequestBuilder.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements qb.d {

    /* JADX INFO: compiled from: AdaptiveRenderingNetworkRequestBuilder.kt */
    private static final class a implements cc.g.c<RenderingTaskPermission> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final id.l<List<pb.d0>, wc.g0> f21242a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(id.l<? super List<pb.d0>, wc.g0> callback) {
            kotlin.jvm.internal.t.f(callback, "callback");
            this.f21242a = callback;
        }

        @Override // cc.g.c
        public void a(cc.e networkError) {
            kotlin.jvm.internal.t.f(networkError, "networkError");
            this.f21242a.invoke(null);
        }

        @Override // cc.g.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RenderingTaskPermission renderingTaskPermission) {
            RenderingTaskPermission.Response response;
            List<Rendering.Phase.Event.Task> eventTasksList;
            this.f21242a.invoke((renderingTaskPermission == null || (response = renderingTaskPermission.getResponse()) == null || (eventTasksList = response.getEventTasksList()) == null) ? null : o7.e.d(eventTasksList));
        }
    }

    /* JADX INFO: compiled from: AdaptiveRenderingNetworkRequestBuilder.kt */
    private static final class b implements cc.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pb.f0 f21243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f21244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f21245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<pb.d0> f21246d;

        public b(pb.f0 eventType, String sourceName, String str, List<pb.d0> eventTaskParamsList) {
            kotlin.jvm.internal.t.f(eventType, "eventType");
            kotlin.jvm.internal.t.f(sourceName, "sourceName");
            kotlin.jvm.internal.t.f(eventTaskParamsList, "eventTaskParamsList");
            this.f21243a = eventType;
            this.f21244b = sourceName;
            this.f21245c = str;
            this.f21246d = eventTaskParamsList;
        }

        @Override // cc.l
        public byte[] getBody() {
            RenderingTaskPermission.Request.Builder builderAddAllEventTasks = RenderingTaskPermission.Request.newBuilder().setEventName(o7.e.e(this.f21243a)).setEventSource(this.f21244b).addAllEventTasks(o7.e.c(this.f21246d));
            kotlin.jvm.internal.t.e(builderAddAllEventTasks, "newBuilder()\n           …ist.mapToEventTaskList())");
            String str = this.f21245c;
            if (str != null) {
                builderAddAllEventTasks.setEventValue(str);
            }
            return RenderingTaskPermission.newBuilder().setRequest(builderAddAllEventTasks).build().toByteArray();
        }
    }

    /* JADX INFO: compiled from: AdaptiveRenderingNetworkRequestBuilder.kt */
    private static final class c implements cc.n<RenderingTaskPermission> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final cc.a f21247a = new cc.a();

        @Override // cc.n
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RenderingTaskPermission a(URLConnection urlConnection) throws InvalidProtocolBufferException {
            kotlin.jvm.internal.t.f(urlConnection, "urlConnection");
            RenderingTaskPermission from = RenderingTaskPermission.parseFrom(this.f21247a.a(urlConnection));
            kotlin.jvm.internal.t.e(from, "parseFrom(byteResponsePr…r.process(urlConnection))");
            return from;
        }
    }

    @Override // qb.d
    public cc.g<?> a(String sourceName, pb.f0 eventType, String str, List<pb.d0> eventTaskParamsList, String url, id.l<? super List<pb.d0>, wc.g0> callback) {
        kotlin.jvm.internal.t.f(sourceName, "sourceName");
        kotlin.jvm.internal.t.f(eventType, "eventType");
        kotlin.jvm.internal.t.f(eventTaskParamsList, "eventTaskParamsList");
        kotlin.jvm.internal.t.f(url, "url");
        kotlin.jvm.internal.t.f(callback, "callback");
        return new cc.g.a(url, cc.d.Post).g(new b(eventType, sourceName, str, eventTaskParamsList)).h(new c()).d(new a(callback)).a();
    }
}

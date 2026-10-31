package io.bidmachine;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes4.dex */
public class UrlProvider {
    private static final String PATH_AUCTION = "auction";
    private static final String PATH_INIT = "init";
    private static final String PATH_RTB = "rtb";
    private static final String PATH_V3 = "v3";
    private static String auctionUrlFromInit;
    private static String auctionUrlFromSuccessRequest;
    private static final String DEF_BASE_URL = "https://api.bidmachine.io";
    private static final String[] DEF_BASE_URLS = {DEF_BASE_URL, "https://x.everestop.io", "https://x.blueduckredapple.com", "https://x.thecatmachine.com"};
    private static final Queue<String> INIT_URL_QUEUE = new ConcurrentLinkedQueue();
    private static final Queue<String> AUCTION_URL_QUEUE = new ConcurrentLinkedQueue();

    class a extends ConcurrentLinkedQueue<String> {
        a() {
            add(UrlProvider.auctionUrlFromInit);
        }
    }

    class b extends ConcurrentLinkedQueue<String> {
        b() {
            add(UrlProvider.auctionUrlFromSuccessRequest);
        }
    }

    static {
        setupUrls();
    }

    private static String createAuctionUrl(Uri uri) {
        return uri.buildUpon().appendPath(PATH_AUCTION).appendPath(PATH_RTB).appendPath(PATH_V3).toString();
    }

    private static String createInitUrl(Uri uri) {
        return uri.buildUpon().appendPath(PATH_AUCTION).appendPath(PATH_INIT).toString();
    }

    static Queue<String> getAuctionUrlQueue() {
        if (TextUtils.isEmpty(auctionUrlFromInit)) {
            return !TextUtils.isEmpty(auctionUrlFromSuccessRequest) ? new b() : new ConcurrentLinkedQueue(AUCTION_URL_QUEUE);
        }
        return new a();
    }

    static Queue<String> getInitUrlQueue() {
        return new ConcurrentLinkedQueue(INIT_URL_QUEUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setEndpoint$0(String str) {
        return String.format("Endpoint has an invalid format - %s", str);
    }

    static void reset() {
        setupUrls();
        auctionUrlFromInit = null;
        auctionUrlFromSuccessRequest = null;
    }

    static void setAuctionUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = AUCTION_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    static synchronized void setAuctionUrlFromInit(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromInit = str;
    }

    static void setAuctionUrlFromSuccessRequest(String str) {
        if (auctionUrlFromSuccessRequest != null || TextUtils.isEmpty(str)) {
            return;
        }
        auctionUrlFromSuccessRequest = str;
    }

    static void setEndpoint(final String str) {
        if (!io.bidmachine.core.h.I(str)) {
            io.bidmachine.core.a.g(new qc.b() { // from class: io.bidmachine.v5
                @Override // qc.b
                public final Object get() {
                    return UrlProvider.lambda$setEndpoint$0(str);
                }
            });
        } else {
            if (b2.e().B()) {
                io.bidmachine.core.a.f("Can't change endpoint url after initialization");
                return;
            }
            Uri uri = Uri.parse(str);
            setInitUrl(createInitUrl(uri));
            setAuctionUrl(createAuctionUrl(uri));
        }
    }

    static void setInitUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Queue<String> queue = INIT_URL_QUEUE;
        queue.clear();
        queue.add(str);
    }

    private static void setupAuctionUrls(Collection<String> collection, String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createAuctionUrl(Uri.parse(str)));
        }
    }

    private static void setupInitUrls(Collection<String> collection, String[] strArr) {
        collection.clear();
        for (String str : strArr) {
            collection.add(createInitUrl(Uri.parse(str)));
        }
    }

    static void setupUrls() {
        Queue<String> queue = INIT_URL_QUEUE;
        String[] strArr = DEF_BASE_URLS;
        setupInitUrls(queue, strArr);
        setupAuctionUrls(AUCTION_URL_QUEUE, strArr);
    }
}

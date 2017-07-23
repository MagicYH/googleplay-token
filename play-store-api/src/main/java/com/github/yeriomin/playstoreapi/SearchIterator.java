package com.github.yeriomin.playstoreapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Iterates through search result pages
 * Each next() call gets you a next page of search results for the provided query
 */
public class SearchIterator extends AppListIterator {

    static private final String DOCID_FRAGMENT_MORE_RESULTS = "more_results";

    private DocV2 mainResult;
    private String query;

    public SearchIterator(GooglePlayAPI googlePlayApi, String query) {
        super(googlePlayApi);
        this.query = query;
        String url = GooglePlayAPI.SEARCH_URL;
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", query);
        firstPageUrl = googlePlayApi.getClient().buildUrl(url, params);
    }

    public String getQuery() {
        return query;
    }

    @Override
    public List<DocV2> next() {
        List<DocV2> next = new ArrayList<DocV2>(super.next());
        if (null != mainResult) {
            if (next.size() > 0 && !next.get(0).getDetails().getAppDetails().getPackageName().equals(mainResult.getDetails().getAppDetails().getPackageName())) {
                next.add(0, mainResult);
            }
            mainResult = null;
        }
        return next;
    }

    @Override
    protected DocV2 getRootDoc(DocV2 doc) {
        DocV2.Builder builder = null;
        DocV2 mainResult = null;
        for (DocV2 child: doc.getChildList()) {
            if (!isRootDoc(child)) {
                continue;
            }
            if (child.getChildCount() == 1) {
                mainResult = child.getChild(0);
            }
            if (child.getDocid().contains(DOCID_FRAGMENT_MORE_RESULTS)) {
                builder = child.toBuilder();
            }
        }
        if (null != mainResult && null != builder) {
            this.mainResult = mainResult;
            return builder.addChild(0, mainResult).build();
        }
        return super.getRootDoc(doc);
    }

    @Override
    protected boolean isRootDoc(DocV2 doc) {
        return super.isRootDoc(doc) && doc.getDocid().contains("search");
    }
}

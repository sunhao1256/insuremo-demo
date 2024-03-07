package com.ebao.cloud.utils;

import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.Collection;

public class UrlUtils {
    private UrlUtils() {
    }

    private static final PathMatcher pathMatcher = new AntPathMatcher();

    public static boolean matchPath(String path, Collection<String> patterns) {
        if (patterns == null) {
            return true;
        }
        return patterns.stream().anyMatch(pattern -> pathMatcher.match(pattern, path));
    }
}

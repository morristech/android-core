package eu.fiveminutes.util;

import java.util.List;

public final class ListUtilsImpl implements ListUtils {

    @Override
    public boolean isEmpty(final List list) {
        return list == null || list.size() == 0;
    }
}

package ch07_adapter.enumadapter;

import java.util.Enumeration;
import java.util.List;

public class LongsEnumeration implements Enumeration<Long> {

    private List<Long> longs;
    private int index = 0;

    public LongsEnumeration(List<Long> longs) {
        this.longs = longs;
    }

    @Override
    public boolean hasMoreElements() {
        return index < longs.size();
    }

    @Override
    public Long nextElement() {
        return longs.get(index++);
    }
}

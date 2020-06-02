package com.company;

public interface TwoWayIterator extends MyIterator {
    boolean hasPrevious();
    Object previous();
}

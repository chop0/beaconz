package com.wasteofplastic.beaconz;

import org.testng.annotations.Test;

import java.awt.geom.Line2D;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LineIteratorTest {

    @Test
    public void shouldHaveTwoPoints(){
        LineIterator iterator = new LineIterator(new Line2D.Double(0.0, 0.0, 2.0, 0.0), 1.0);

        int count = 0;
        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }

        assertThat(count, is(2));
    }
}

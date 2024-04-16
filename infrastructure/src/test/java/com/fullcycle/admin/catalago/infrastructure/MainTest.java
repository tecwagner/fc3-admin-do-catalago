package com.fullcycle.admin.catalago.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void tesMain() {
        Assertions.assertNotNull(new Main());
        Main.main(new String[] {});
    }

}
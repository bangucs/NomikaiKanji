package com.bangucs.nomikaikanji;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

/**
 * Created by mitsuo on 15/11/08.
 */
public class NomikaiKanjiTest {

    NomikaiKanji kanji = new NomikaiKanji();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCalcWholeKaihi() throws Exception {
        kanji.setMembers("Leader:10000");
        kanji.setNinzu(10);
        kanji.setKaihi(4000);
        String detail = kanji.calcWholeKaihi();
        System.out.println(detail);
        assertNotNull(detail);
        kanji.setMembers("manager:20000");
        kanji.setNinzu(15);
        kanji.setKaihi(5000);
        detail = kanji.calcWholeKaihi();
        System.out.println(detail);
        assertNotNull(detail);
    }
}
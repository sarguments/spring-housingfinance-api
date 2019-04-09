package com.pretest.kakaopay.support.job;

import com.pretest.kakaopay.springhousingfinance.job.IntValueEditor;
import com.pretest.kakaopay.support.test.BaseTest;
import org.junit.Test;

public class IntValueEditorTest extends BaseTest {

    @Test
    public void strToInt() {
        IntValueEditor editor = new IntValueEditor();
        String value = "\"1,324\"";
        softly.assertThat(editor.strToInt(value)).isEqualTo(1324);
    }
}
package lq.learn.algorithm.hannlp;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;
import org.junit.Test;

import java.util.List;

public class Segment {


    @Test
    public void test0(){
        List<Term> list = HanLP.segment("这他妈的什么是分词");
        System.out.println(list);
    }
}

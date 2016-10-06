package com.kkk.pattern.builder;

/**
 * Created by kkk on 16-9-14.
 */
public class Test {
    public static void main(String[] args) {
        TestPaper.TestPaperBuilder builder = new TestPaper.TestPaperBuilder();
        builder.setType(TestPaper.Type.chinese)
                .setDegree(TestPaper.Degree.easy)
                .setNumOfExercise(5);
        TestPaper paper = builder.build();

        System.out.println(paper);
    }
}

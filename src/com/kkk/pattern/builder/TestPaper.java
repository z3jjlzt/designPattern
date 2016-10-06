package com.kkk.pattern.builder;

/**
 * Created by kkk on 16-9-14.
 */
class TestPaper {
    Type type;
    int NumOfExercise;
    Degree degree;

    @Override
    public String toString() {
        return "TestPaper{" +
                "type=" + type +
                ", NumOfExercise=" + NumOfExercise +
                ", degree=" + degree +
                '}';
    }

    private TestPaper(TestPaperBuilder builder) {
        type = builder.getType();
        NumOfExercise = builder.getNumOfExercise();
        degree = builder.getDegree();
    }

    enum Degree {
        hard, normal, easy;
    }

    enum Type {
        math, english, chinese;

    }

    public static class TestPaperBuilder {
        Type type;
        int NumOfExercise;
        Degree degree;

        public TestPaperBuilder setType(Type type) {
            this.type = type;
            return this;
        }

        public TestPaperBuilder setNumOfExercise(int NumOfExercise) {
            this.NumOfExercise = NumOfExercise;
            return this;
        }

        public TestPaperBuilder setDegree(Degree degree) {
            this.degree = degree;
            return this;
        }

        public Type getType() {
            return type;
        }

        public int getNumOfExercise() {
            return NumOfExercise;
        }

        public Degree getDegree() {
            return degree;
        }

        public TestPaper build() {
            if(this.getDegree()== null || this.getNumOfExercise() == 0 || this.getType() == null)
                throw new IllegalArgumentException(" 参数不能为空！！！");
            return new TestPaper(this);
        }


    }
}

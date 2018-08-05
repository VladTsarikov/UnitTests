import org.testng.annotations.DataProvider;

public class DataProviderSource {

    @DataProvider(name = "FirstConstructorData")
    public Object[][] firstConstructorDataProvider() {
        return new Object[][]{
                {1000},
                {3},
                {0},
                {-5},
        };
    }

    @DataProvider(name = "SecondConstructorData")
    public Object[][] secondConstructorDataProvider() {
        return new Object[][]{
                {1000, 1},
                {3, 2},
                {0, 0},
                {-5, -1}};
    }

    @DataProvider(name = "ThirdConstructorData")
    public Object[][] thirdConstructorDataProvider() {
        return new Object[][]{
                {1000, 1, "BLUE"},
                {3, 2, "BLACK"},
                {0, 0, ""},
                {-5, -1, null},
        };
    }


    @DataProvider(name = "MethodWriteData")
    public Object[][] writeMethodCorrectDataProvider() {
        return new Object[][]{
                {"Hello World", 1000, 1, "BLUE","Hello World"},
                {"Hello World", 8, 1, "BLUE","Hello Wor"},
                {"Hello ", 5, 1, "BLUE","Hello "},
                {" Hello", 5, 1, "BLUE"," Hello"},
                {"Hello", 3, 1, "BLACK","Hel"},
                {"Hello", 1000,0, "BLUE",""},
                {"Hello", 3, 0, "BLACK",""},
                {"Hello", 0, 0, "RED",""},
                {"Hello", -1, 0, "RED",""},
                {"Hello", -100, -1, "RED",""},
                {"Hello", 3, -1, "RED",""},
                {"Hello", 0, 1, "RED",""},
                {"", 1000, 1, "BLUE",""},
                {"", 3, 1, "BLACK",""},
                {" ", 0, 0, "RED"," "},
                {" ", 2, 1, "RED"," "},
        };

    }

    @DataProvider(name = "MethodWriteIncorrectData")
    public Object[][] writeMethodNullDataProvider() {
        return new Object[][]{
                {null, 1000, 1, "BLUE"},
                {null, 10, 5, "RED"},
                {null, 3, 1, "BLACK"},
        };

    }

    @DataProvider(name = "MethodIsWorkData")
    public Object[][] workMethodCorrectDataProvider() {
        return new Object[][]{
                {1000},
                {500},
                {4}
        };
    }

    @DataProvider(name = "MethodIsWorkIncorrectData")
    public Object[][] workMethodIncorrectDataProvider() {
        return new Object[][]{
                {-100},
                {-3},
                {0},
        };
    }

}

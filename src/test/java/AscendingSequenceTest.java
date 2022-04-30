import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  //нотация для выполнения нотации порядка

public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach //нотация которая что-то выполняет перед каждым тестом (например логиниться)
    void setUp(){
        as =  new AscendingSequence();
    }

    @Order(1) //нотация для выполнения порядка тестов
    @RepeatedTest(10)  //повторение тестов несколько раз
    @Test          // нотация для запуска тестов
    public void testAscendingSequenceHappyPath(){   //в аргументы тестов не передаются параметры

        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};


        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //assert действует на весь тест
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(2)

    @Test          // нотация для запуска тестов
    public void testAscendingSequenceHappyPathNegetiveNumbers(){   //в аргументы тестов не передаются параметры

        int start =-10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};


        AscendingSequence as =  new AscendingSequence(); //консструктор по умолчанию, создется объект с другого пакета название класса = тип данных
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //assert действует на весь тест
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)

    @Test          // нотация для запуска тестов
    public void testAscendingSequenceHappyPathNegetivePositiveNumbers(){   //в аргументы тестов не передаются параметры

        int start =-5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};


        AscendingSequence as =  new AscendingSequence(); //консструктор по умолчанию, создется объект с другого пакета название класса = тип данных
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //assert действует на весь тест
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(4)

    @Test          // нотация для запуска тестов
    public void testAscendingSequenceHappyPathStepTwo(){   //в аргументы тестов не передаются параметры

        int start =0;
        int end = 10;
        int step = 2;
        int[] expectedResult = {0, 2, 4};


        AscendingSequence as =  new AscendingSequence(); //консструктор по умолчанию, создется объект с другого пакета название класса = тип данных
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //assert действует на весь тест
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test          // нотация для запуска тестов
    public void testAscendingSequenceStartLarderThenEnd(){   //в аргументы тестов не передаются параметры

        int start =5;
        int end = 0;
        int step = 1;
        int[] expectedResult = {};


        AscendingSequence as =  new AscendingSequence(); //консструктор по умолчанию, создется объект с другого пакета название класса = тип данных
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //assert действует на весь тест
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test          // нотация для запуска тестов
    public void testAscendingSequenceNegativeStep(){   //в аргументы тестов не передаются параметры

        int start =5;
        int end = 0;
        int step = -1;
        int[] expectedResult = {};


        AscendingSequence as =  new AscendingSequence(); //консструктор по умолчанию, создется объект с другого пакета название класса = тип данных
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //assert действует на весь тест
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test          // нотация для запуска тестов
    public void testAscendingSequenceStepIsZero(){   //в аргументы тестов не передаются параметры

        int start =5;
        int end = 0;
        int step = -1;
        int[] expectedResult = {};


        AscendingSequence as =  new AscendingSequence(); //консструктор по умолчанию, создется объект с другого пакета название класса = тип данных
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        //assert действует на весь тест
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }






}

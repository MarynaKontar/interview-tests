package com.example.interviewtests;

public class BreakContinueGotoTest {

    public static void main(String[] args) throws InterruptedException {

        forLoop();
//        whileLoop();

    }

    public static void forLoop()
    {
        outer:
        for (int i = 0; i < 5 ; i++)
        {
            inner:
            for (int j = 0; j < 3; j++)
            {
                if (i == 2 && j == 1) {
//                    break  inner; //прервется внутренний for, но внешний продолжится, аналогично просто break и continue outer
//                    continue  inner; //продолжится внутренний for, то есть просто пропустит одну итерацию, к-ая соответствует тому, что в if; аналогично continue
//                    break  outer; //прервется и внутренний и внешний for, выйдет из обоих циклов
                    continue  outer; //прервется внутренний for, но внешний продолжится, аналогично просто break и break inner
                }
                System.out.println("i = " + i + ";j = " + j);
            }
        }
    }

    public static void whileLoop() throws InterruptedException {
        int i = 5;

        outer:
        while ( i >= 0)
        {
            int j = 3;
            inner:
            while ( j >= 0)
            {
                if (i == 2 && j == 1) {
//                    j--;
//                    continue  inner; //продолжится внутренний loop, то есть просто пропустит одну итерацию, к-ая соответствует тому, что в if; аналогично continue

                    j--;
                    i--;
//                    break  inner; //прервется внутренний loop, но внешний продолжится, аналогично просто break и continue outer
//                    break  outer; //прервется и внутренний и внешний loop, выйдет из обоих циклов
//                    continue  outer; //прервется внутренний loop, но внешний продолжится, аналогично просто break и break inner
                }
                System.out.println("i = " + i + ";j = " + j);
//                Thread.sleep(1000);
                j--;
            }
            i--;
        }
    }



//    outer:                  // Should be placed exactly before the loop
//    loopingConstructOne  {  // We can have statements before the outer but not inbetween the label and the loop
//        inner:
//        loopingConstructTwo {
//            continue;       // This goes to the top of loopingConstructTwo and continue.
//            break;          // This breaks out of loopingConstructTwo.
//            continue outer; // This goes to the outer label and reenters loopingConstructOne.
//            break outer;    // This breaks out of the loopingConstructOne.
//            continue inner; // This will behave similar to continue.
//            break inner;    // This will behave similar to break.
//        }
//    }


}




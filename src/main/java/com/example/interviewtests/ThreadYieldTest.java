package com.example.interviewtests;

public class ThreadYieldTest extends Thread
{
    public void run()
    {
        System.out.println("In run");
        yield();// передает рекомендацию планировщику потоков java, что этому потоку можно дать меньше времени исполнения
        System.out.println("Leaving run");
//        while (true) {}
    }
    public static void main(String []argv)
    {
        (new ThreadYieldTest()).start();
    }
}



//        A.The code fails to compile in the main() method
//        B.The code fails to compile in the run() method
//        C.Only the text "In run" will be displayed
//        D.The text "In run" followed by "Leaving run" will be displayed   !!!!!!!!!!!!!!!!!
//        Correct Answer: Option D
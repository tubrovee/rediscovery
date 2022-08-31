package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

import static java.lang.Thread.sleep;


public class Main {

    public static void main(String[] args) throws Exception {
        Integer[] myArray = new Integer[]{4,5,3,6,8,1,9};

        //Integer secondSmallestNumber= FindSecondSmallest(myArray);
        //System.out.println(secondSmallestNumber);
        Employee emp = new Employee(10, "Vishal","Gupta");
        Hashtable<Integer,Employee> _empTable = new Hashtable();
        _empTable.put(1,emp);



        findMedianTwoArrays();
        System.out.println("the smallest is" + FindSecSmallestTheHardWay(myArray));
        int counter=0;
        while (true) {
            try {
                sleep(2000);
                counter++;
                if(counter>10) break;

                System.out.println("time is now->" + java.time.LocalDateTime.now());
            }

            catch(Exception threadInterruptedException)
            {
                //do nothing
            }
        }
    }
    private  static Integer FindSecondSmallest(Integer[] numArray)
    {
        Arrays.sort(numArray);
        return numArray[1];
    }
    private static Integer FindSecSmallestTheHardWay(Integer[] numArray)
    {
        //lets find smallest first
        int smallest=numArray[0];
        for(int i=0; i<=numArray.length-1; i++)
        {
            if(numArray[i] < smallest) {
                smallest = numArray[i];
            }
            System.out.println(numArray[i]);
        }
        return smallest;
    }
    private static void findMedianTwoArrays()
    {
        Integer[] array1={6,4,8,10,45} ;
        Integer[] array2={8,19, 23, 11, 34};
        Integer[] joinedArray={0};

       ArrayList _arrList   = new ArrayList();

        for(int i=0;i<array1.length;i++)
        {
            _arrList.add(array1[i]);
        }
        for(int i=0;i<array2.length;i++)
        {
            _arrList.add(array2[i]);
        }
        System.out.println("Arraylist length is "+ _arrList.size());

    }

    static void genFibo(Integer x)
    {
        if((x==0) ||  (x==1))
        {
            System.out.println("the value is "+ x);
        }

    }

}

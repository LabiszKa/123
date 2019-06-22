package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

        public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

            ArrayList<Integer> even = new ArrayList<Integer>();

            for (int i = 0; i < numbers.size(); i++) {



                if (numbers.get(i) % 2 == 0) {

                    even.add(numbers.get(i));


                }

            }
            return even;
        }
}

package com.fool.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Qiq
 * @date 2021/5/23
 */
public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            list.add(candy+extraCandies>=maxCandies);
        }
        return list;
    }

}

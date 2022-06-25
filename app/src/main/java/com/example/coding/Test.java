package com.example.coding;

import android.util.Log;

public class Test {

    public static void main(String[] args) {
        int[] v = {20,8,10,1,4,15};
        Log.d("zzz", String.valueOf(sum(v)));
    }

    public static int sum(int[] v){
        int answer = -1;

        for(int i = 0; i < v.length; i++){
            answer += Math.abs(v[i] - v[i+1]);
        }

        return answer;
    }
}

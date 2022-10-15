package com.prac.lambda;

public class PracticeLambda {

    public static void main(String args[]){
        NoParameterInterface param=()->{System.out.println("Hi No Param functional interface");};
        param.show();

        SingleParameterFunctionalInterface singleParam=str->System.out.println("Hi Single Parameter Interface "+str);
        singleParam.show("SingleParam");

        MultipleParameterInterface multipleParam=(param1,param2,param3)->{
            System.out.println("Hi Multiple parameters Interface::: "+param1+" "+param2+" "+param3);
        };
        multipleParam.show("Tom","Dick","Harry");
    }
}

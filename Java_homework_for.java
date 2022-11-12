package main;

public class Java_homework_for {
 public static void main(String[] args) {

	
	//multiplicationTable
	 System.out.println("Vurma cedveli");
	for(int num = 1; num <= 9; ++num){
	    for(int i = 1; i <= 10; ++i){
	        System.out.printf("%d * %d = %d \n", num, i, num * i);
	    }
    }
	
	//1-den 20-e qeder ededlerin cemi
	System.out.println("1-den 20-e qeder ededlerin cemi");
	int sum = 0;
	for(int num = 1; num <= 20; ++num){
		sum+=num ;

	}
	System.out.println(sum);
	
	//1-dən 100-ə qədər 4-ə qalıqsız bölünən ədədlər
	System.out.println("1-dən 100-ə qədər 4-ə qalıqsız bölünən ədədlər");
	for(int i = 1; i <= 100; i++){
		if(i%4 == 0) 
		{
			System.out.println(i);
		}
   
	}
	
	//1-dən 50-ə qədər 5-ə qalıqsız bölünən ədədlər
	System.out.println("1-dən 50-ə qədər 5-ə qalıqsız bölünən ədədlər");
	for(int i = 1; i <= 50; i++){
		if(i%5 == 0) 
		{
				System.out.println(i);
		}
	   
	}
	
	//1-dən 10-a qədər (10 da daxil) ədədlərin cəmi (while)
	System.out.println("1-dən 10-a qədər (10 da daxil) ədədlərin cəmi (while)");
	int i = 1, n = 10 , s=0;
	while(i <= n) {
		  s+=i ;
	      i++;
    }
    System.out.println(s);
    
    
	//10-dan 20-ə qədər (20 də daxil) ədədlərin cəmi (while)
	System.out.println("10-dan 20-ə qədər (20 də daxil) ədədlərin cəmi (while)");
	int i2 = 10, n2 = 20 , s2=0;
	while(i2 <= n2) {
		  s2+=i2 ;
	      i2++;
    }
    System.out.println(s2);
 }
}

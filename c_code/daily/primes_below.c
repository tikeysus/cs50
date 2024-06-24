#include <stdio.h>
#include <math.h>
#include <stdlib.h> 

// Find the sum of the primes below a number (inclusive). 

int prime(int num); 
long long int summator(int upper_bound); 

int main(void){
	printf("Please enter a number: "); 
	int number; 

	scanf("%d", &number);
	if (number < 0){
		printf("Incorrect input\n"); 
		return 0; 
	}

	int answer = summator(number); 
	printf("The answer is: %d\n", answer); 

	return 0; 
}

int prime(int num){
	if (num == 1 || num == 0){
		return 0; //i don't care if you don't agree, boohoo. 
	}

	int root = sqrt(num); 

	for (int i = 2; i <= root; i ++){
		if (num % i == 0){
			return 0; //not prime
		}
	}

	return 1; //prime
}

long long int summator(int upper_bound){
	if (upper_bound == 1 || upper_bound == 0){
		return 0; 
	}

	long long int sum = 2; 

	for (int i = 3; i <= upper_bound; i += 2){
		if (prime(i) == 1){
			printf("Adding num %d\n", i);
			sum += i; 
		}
	}

	return sum; 
}
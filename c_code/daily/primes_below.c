#include <stdio.h>
#include <math.h>
#include <stdlib.h> 

// Find the sum of the primes below a number (inclusive). 

int prime(int num); 
int summator(int upper_bound); 

int main(void){
	printf("Please enter a number: "); 
	int number; 

	scanf("%d", &number);
	if (number < 0){
		printf("Incorrect input"); 
		return 0; 
	}

	int answer = summator(number); 
	printf("The answer is: %d", answer); 

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

int summator(int upper_bound){
	if (upper_bound == 2){
		return 2; 
	}

	int sum = 0; 

	for (int i = 1; i <= upper_bound; i += 2){
		if (prime(i) == 1){
			sum += i; 
		}
	}

	if (upper_bound > 2){
		return sum += 2; 
	}

	return sum; 
}
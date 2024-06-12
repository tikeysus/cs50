#include <stdio.h>

int len(char *text){
	int length = 0; 
	while (text[length] != '\0'){
		length ++; 
	}
	return length; 
}

int main(void){
	char message[] = "Hello, World!";
	int length = len(message); 

	printf("The length of the given string is: %d\n", length); 
	return 0; 

}